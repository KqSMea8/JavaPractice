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



}
