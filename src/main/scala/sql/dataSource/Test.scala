package sql.dataSource

import org.apache.spark.sql.SparkSession

/**
 * https://github.com/keepsimplefocus/spark-sourcecodes-analysis/blob/master/spark-sql/Spark-SQL%EF%BC%8CDataFrame%E4%BB%A5%E5%8F%8A-Datasets-%E7%BC%96%E7%A8%8B%E6%8C%87%E5%8D%97---For-2-0.md
 */
object Test {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder().master("local")
      .appName("Spark SQL Example")
      .config("spark.some.config.option", "some-value")
      .getOrCreate()
    //通用的 Load/Sava 函数
    val usersDF = spark.read.load("examples/src/main/resources/users.parquet")
    usersDF.select("name", "favorite_color").write.save("namesAndFavColors.parquet")
    //手动指定格式
    val peopleDF = spark.read.format("json").load("examples/src/main/resources/people.json")
      peopleDF.select("name", "age").write.format("parquet").save("namesAndAges.parquet")
    //在文件夹上执行 SQL
    val sqlDF = spark.sql("SELECT * FROM parquet.`examples/src/main/resources/users.parquet`")
  }

}
