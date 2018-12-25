package `object`

class Test {
  def add2(a: Int, b: Int): Int = {
    a + b
  }
}
object Test {

  def add(a: Int, b: Int): Int = {
    a + b
  }

  def main(args: Array[String]): Unit = {
    Test.add(1, 2) // 静态函数
    val test = new Test
    print(test.add2(3, 4))
  }

}
