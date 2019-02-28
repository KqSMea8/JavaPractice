package scala.`object`

import com.apple.eawt.Application

/**
  *
  * @author dz on 2019/2/28.
  */

abstract class Term
case class Var(name: String) extends Term
case class Fun(arg: String, body: Term) extends Term
case class App1(f: Term, v: Term) extends Term

//有参用case class ,无参用case object
//case 关键词只用来修饰  class 和object
case object Term

object CaseTest {

  def main(args: Array[String]): Unit = {

    //Scala不需要使用new原语。只要简单地把类名用作函数即可。
    Fun("x", Fun("y", App1(Var("x"), Var("y"))))
    //case类的构造器参数被当作公开值并可以直接被访问。
    val x = Var("x")
  }
}
object TermTest extends App {

  def printTerm(term: Term) {
    term match {
      case Var(n) =>
        print(n)
      case Fun(x, b) =>
        print("^" + x + ".")
        printTerm(b)
      case App1(f, v) =>
        Console.print("(")
        printTerm(f)
        print(" ")
        printTerm(v)
        print(")")
    }
  }

  def isIdentityFun(term: Term): Boolean = term match {
    case Fun(x, Var(y)) if x == y => true
    case _ => false
  }
  val id = Fun("x", Var("x"))
  val t = Fun("x", Fun("y", App1(Var("x"), Var("y"))))
  printTerm(t)
  println
  println(isIdentityFun(id))
  println(isIdentityFun(t))
}
