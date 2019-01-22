package predefined

/**
  *
  * @author dz on 2019/1/17.
  */
object PredefineTest {

  def main(args: Array[String]):Unit = {

    //将对象类型强制转换为T类型。
    val c : Char = 97.asInstanceOf[Char]


    "hello".asInstanceOf[String]
    1.asInstanceOf[Long]
    val it: Seq[String] = List("a", "b")
    it.asInstanceOf[List[String]]

    //判断对象是否为T类型的实例。
    "hello".isInstanceOf[String]


    //获取类型T的Class对象
    classOf[String]
  }
}
