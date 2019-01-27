package scala.function.PartialFunction

/**
  *
  * @author dz on 2019/1/27.
  */
object PartialFunction {

  //偏函数是具有类型PartialFunction[-T,+V]的一种函数。T是其接受的函数类型，
  // V是其返回的结果类型。偏函数最大的特点就是它只接受和处理其参数定义域的一个子集，
  // 而对于这个子集之外的参数则抛出运行时异常。
  def main(args: Array[String]): Unit = {

    val sample = 1 to 10

    val isEven: PartialFunction[Int, String] = {
      case x if x % 2 == 1 => x+" is even"
    }
    // the method collect can use isDefinedAt to select which members to collect
    val evenNumbers = sample collect isEven

    print(evenNumbers)
  }
}
