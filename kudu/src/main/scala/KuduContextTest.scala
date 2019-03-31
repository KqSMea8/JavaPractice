import org.apache.kudu.client.CreateTableOptions
import org.apache.kudu.spark.kudu.KuduContext
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.types.{IntegerType, StringType, StructField, StructType}

object KuduContextTest {

  def main(args: Array[String]): Unit = {

    val conf : SparkConf = null
    // Create a Spark and SQL context
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)

    // Comma-separated list of Kudu masters with port numbers
    val master1 = "ip-10-13-4-249.ec2.internal:7051"
    val master2 = "ip-10-13-5-150.ec2.internal:7051"
    val master3 = "ip-10-13-5-56.ec2.internal:7051"
    val kuduMasters = Seq(master1, master2, master3).mkString(",")

    // Create an instance of a KuduContext
    val kuduContext = new KuduContext(kuduMasters)

    // Specify a table name
    var kuduTableName = "spark_kudu_tbl"

    // Check if the table exists, and drop it if it does
    if (kuduContext.tableExists(kuduTableName)) {
      kuduContext.deleteTable(kuduTableName)
    }

    // 1. Give your table a name
    kuduTableName = "spark_kudu_tbl"

    // 2. Define a schema
    val kuduTableSchema = StructType(
      //         col name   type     nullable?
      StructField("name", StringType , false) ::
        StructField("age" , IntegerType, true ) ::
        StructField("city", StringType , true ) :: Nil)

    // 3. Define the primary key
    val kuduPrimaryKey = Seq("name")

    // 4. Specify any further options
    val kuduTableOptions = new CreateTableOptions()
    kuduTableOptions.setRangePartitionColumns(List("name")).setNumReplicas(3)

    // 5. Call create table API
    kuduContext.createTable(
      // Table name, schema, primary key and options
      kuduTableName, kuduTableSchema, kuduPrimaryKey, kuduTableOptions)
  }


}
