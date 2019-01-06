package core.helloworld

import org.apache.spark.{SparkConf, SparkContext}
import java.lang.Thread
object HelloWorld {

  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("hello").setMaster("local[2]")

    val sc = new SparkContext(conf)

    val lines = sc.parallelize(Seq("hello world", "hello tencent"))
    val wc = lines.flatMap(_.split(" ")).map(word => (word, 1)).reduceByKey(_ + _)
    wc.foreach(println)

    Thread.sleep(1 * 60 * 1000) // 挂住 10 分钟; 这时可以去看 SparkUI: http://localhost:4040
  }
}
