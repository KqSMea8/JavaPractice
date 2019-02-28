package scala.`object`

/**
  *
  * @author dz on 2019/2/28.
  */
sealed abstract class Expr
case class Var(name:String) extends Expr
case class Number(num:Double) extends Expr
case class UnOp(operator:String, arg:Expr) extends Expr
case class BinOp(operator:String,left:Expr,right:Expr) extends Expr

//在写模式匹配时，你必须保证你所写的可选项覆盖了全部的可能性，
object SealedClassTest {

  def describe(e:Expr) :String = e match{
    case Number(_) => "a number"
    case Var(_) => "a variable"
  }

  def describe1(e:Expr) :String =e match{
    case Number(_) => "a number"
    case Var(_) => "a variable"
    case _ => throw new RuntimeException
  }
  //Scala 支持使用标注 (annotation) 的方法暂时取消编译器检查模式定义是否完备，
  // 为变量添加 @unchecked 标注后，编译器不再给出警告
  def describe2(e:Expr) :String =(e: @unchecked) match{
    case Number(_) => "a number"
    case Var(_) => "a variable"
  }
}
