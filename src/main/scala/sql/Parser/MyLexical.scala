package sql.Parser
import scala.util.parsing.combinator.PackratParsers
import scala.util.parsing.combinator.syntactical._
/**
  *
  * @author dz on 2019/1/31.
  */
object MyLexical extends StandardTokenParsers with PackratParsers {

  //定义分割符
  lexical.delimiters ++= List(".", ";", "+", "-", "*")
  //定义表达式，支持加，减，乘
  lazy val expr: PackratParser[Int] = plus | minus | multi
  //加法表示式的实现
  lazy val plus: PackratParser[Int] = num ~ "+" ~ num ^^ { case n1 ~ "+" ~ n2 => n1.toInt + n2.toInt}
  //减法表达式的实现
  lazy val minus: PackratParser[Int] = num ~ "-" ~ num ^^ { case n1 ~ "-" ~ n2 => n1.toInt - n2.toInt}
  //乘法表达式的实现
  lazy val multi: PackratParser[Int] = num ~ "*" ~ num ^^ { case n1 ~ "*" ~ n2 => n1.toInt * n2.toInt}
  lazy val num = numericLit

  def parse(input: String) = {
    //定义词法读入器myread，并将扫描头放置在input的首位
    val myread = new PackratReader(new lexical.Scanner(input))
    print("处理表达式 " + input)
    phrase(expr)(myread) match {
      case Success(result, _) => println(" Success!"); println(result); Some(result)
      case n => println(n); println("Err!"); None
    }
  }

  def main(args: Array[String]) {
    val prg = "6 * 3" :: "24-/*aaa*/4" :: "a+5" :: "21/3" :: Nil
    prg.map(parse)
  }

  //处理表达式 6 * 3 Success!     //lexical对空格进行了处理，得到6*3
  //18     //6*3符合乘法表达式，调用n1.toInt * n2.toInt，得到结果并返回
  //处理表达式 24-/*aaa*/4 Success!  //lexical对注释进行了处理，得到20-4
  //20    //20-4符合减法表达式，调用n1.toInt - n2.toInt，得到结果并返回
  //处理表达式 a+5[1.1] failure: number expected
  //      //lexical在解析到a，发现不是整数型，故报错误位置和内容
  //a+5
  //^
  //Err!
  //处理表达式 21/3[1.3] failure: ``*'' expected but ErrorToken(illegal character) found
  //      //lexical在解析到/，发现不是分割符，故报错误位置和内容
  //21/3
  //  ^
  //Err!

}
