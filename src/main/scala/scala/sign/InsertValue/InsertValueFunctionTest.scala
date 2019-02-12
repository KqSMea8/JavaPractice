package scala.sign.InsertValue

/**
  *
  * @author dz on 2019/2/12.
  */
object InsertValueFunctionTest extends App {

  val name = "Fred"
  //name: String = Fred

  val age = 18
  //age: Int = 18

  val weight = "200"
  //weight: String = 200
  //
  println(s"$name is $age years old, and weights $weight pounds")
  //Fred is 18 years old, and weights 200 pounds

  //在字符串插值中使用表达式代码
  println(s"$age next year is ${age + 1}")
  //18 next year is 19

  println(s"$age is 18: ${age == 18}")
  //18 is 18: true

  //在插值表达式中使用对象。
  //println(s"${student.name} is ${student.age} age years old.")
  //Fred is 18 age years old.

  //Scala为我们提供了更多的字符串插值函数，比如使用"f"可以对插值打印格式进行控制，比如保留两位小数。
  val weight1 = 200
  //weight: Int = 200

  println(f"$name is $age years old, and weights $weight%.2f pounds")
  //Fred is 18 years old, and weights 200.00 pounds

  //插值函数"raw"能够让转义字符失去意义。
  val str = "a\nb"
  //res28: String =
  //a
  //b

  val str_b = raw"a\nb"
  //res29: String = a\nb


}
