package scala.function.apply

/**
  *
  * @author dz on 2019/2/13.
  */
class ApplyTest(val str: String) {

  def apply(charIndex: Int) = str.charAt(charIndex)

  val indexed = new ApplyTest("Hello world")
  //对象
  indexed(0) //结果为H, 等价于indexed.apply(0)
}

object ApplyTest {

  //当对象（伴生对象）以函数的方式进行调用时，
  // scala 会隐式地将调用改为在该对象上调用apply方法。
  def main(args: Array[String]): Unit = {
     //伴生对象
     ApplyTest("1")
     ApplyTest.apply("2")
  }

  def apply(name: String) = "Hello " + name

  //scala 的函数对象
  def test():Unit = {

    val increment: (Int) => Int = _ + 1

    print(increment(0))

  }

  //与 apply 相对的是 unapply 方法，它的用法与 apply 类似，
  // 但其作用是用来抽取部分参数，它也称为抽取方法，主要用于模式匹配时抽取某些参数
  // case XXX(str) => println(str)

}
