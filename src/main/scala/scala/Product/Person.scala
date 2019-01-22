package scala.Product

case class Person(name: String,age: Option[Int] = None)


object Person extends App{

  val p = Person("Lucky",Option(18))
  println(p.productArity) //元素的个数            输出：2
  println(p.productElement(0))//第1个元素         输出：Lucky
  println(p.productElement(1))//第二个元素        输出：Some(18)
  p.productIterator foreach println//遍历         输出：Lucky  Some(18)

  override def main(args: Array[String]): Unit = {

      val t1 = ("Lucky", 26)
      println(t1)//输出： (Lucky,26)
      println(t1._1)//输出： Lucky
      println(t1._2)//输出： 26


  }

}
