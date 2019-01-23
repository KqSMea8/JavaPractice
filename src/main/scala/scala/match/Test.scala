package scala.`match`

/**
  *
  * @author dz on 2019/1/22.
  */

abstract class A; // sealed abstract class A
case class B(a:Int) extends A;
case class C(a:Int) extends A;
case class D(a:Int) extends A;
object Test {
  //@是为模式匹配起了个变量名
  //variableName @ pattern的写法
  def main(args: Array[String]): Unit = {
    val a:A = B(1);

    a match {
      case e @ B(_) => println(e)
      case e @ C(_) => println(e)
    }
  }

  def test1():Unit = {

    val d@(c@Some(a), Some(b)) = (Some(1), Some(2))
    //(Some(1),Some(2))
    //Some(1)
    //1
    //2
    println(d)
    println(c)
    println(a)
    println(b)

    //(1,2,Some(1),(Some(1),Some(2)))
    println()
    (Some(1), Some(2)) match {
      case d@(c@Some(a), Some(b)) => println(a, b, c, d)
    }

    println()
    println()

    //(Some(1),1)
    for (x @ Some(y) <- Seq(None, Some(1))) println(x, y)

    //1
    //List(2, 3)
    val List(x, xs@_*) = List(1, 2, 3)
    println(x)
    println(xs)
    println()

    val o: Option[Int] = Some(2)
    o match {
      case Some(x) => println(x)
      case None =>
    }
    //2
    //Some(2)
    o match {
      case x@Some(_) => println(x)
      case None =>
    }


  }



}
