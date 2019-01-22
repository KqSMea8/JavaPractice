package scala.Currying

/**
 * 柯里化(Currying)指的是将原来接受两个参数的函数变成新的接受一个参数的函数的过程。
 * 新的函数返回一个以原有第二个参数为参数的函数。
 */
object CurryingTest {

  def main(args: Array[String]): Unit = {

    val str1:String = "Hello, "
    val str2:String = "Scala!"
    println( "str1 + str2 = " +  strcat(str1)(str2) )

  }

  def add(x:Int,y:Int)=x+y

  def add(x:Int)(y:Int)  = x + y

  def strcat(s1: String)(s2: String) = {

    s1 + s2

  }
}
