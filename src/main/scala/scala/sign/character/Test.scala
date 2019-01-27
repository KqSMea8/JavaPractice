package scala.sign.character

/**
  *
  * @author dz on 2019/1/27.
  */
object Test {

  def main(args: Array[String]): Unit = {

    //    $ 符具有在String 中直接拼接 字符串 和数字 等类型 。简化了字符串拼接的困扰，
    val word = " abcds "
    val num = 123
    println(s"see there is a word$word and a Num$num")
  }

  def test_stripMargin(): Unit = {

    val s1 ="""This is
        my first time
        to learn Scala"""
    println(s1)

    //This is
    //  my first time
    //  to learn Scala


    val s2 ="""This is
              |my first time
              |to learn Scala""".stripMargin
    println(s2)
    //This is
    //my first time
    //to learn Scala


    //如果不想使用|，也可以使用其他任意字符
    val s3 ="""This is
              #my first time
              #to learn Scala""".stripMargin('#')
    println(s3)
    //同s2
  }
}
