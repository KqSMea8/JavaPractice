package scala.function.PartialFunction

/**
  *
  * @author dz on 2019/1/27.
  */
object Test {

  //https://blog.csdn.net/u010376788/article/details/47206571


  def main(args: Array[String]): Unit = {

    val signal: PartialFunction[Int, Int] = {
      case x if x >= 1 => 1
      case x if x <= -1 => -1
    }

    //偏函数主要用于这样一种场景：对某些值现在还无法给出具体的操作（即需求还不明朗），
    // 也有可能存在几种处理方式（视乎具体的需求）；我们可以先对需求明确的部分进行定义，
    // 比如上述除了0外的所有整数域，然后根据具体情况补充对其他域的定义，如：
    val composed_signal: PartialFunction[Int,Int] = signal.orElse{
      case 0 => 0
    }
    composed_signal(0)  // 返回 0

    //或者对定义域进行一定的偏移（假如需求做了变更, 1 为无效的点），如：

    val new_signal: Function1[Int, Int] = signal.compose{
      case x => x  - 1
    }

    new_signal(1)  // throw exception
    new_signal(0)   // 返回 -1
    new_signal(2)  // 返回 1

    //还可以用andThen将两个相关的偏函数串接起来。

    val another_signal: PartialFunction[Int, Int] = {
      case 0 =>  0
      case x if x > 0 => x - 1
      case x if x < 0 => x + 1
    }

    val then_signal =  another_signal andThen  signal







  }

}
