package scala.function

object PartialFunction {

  def main(args: Array[String]): Unit = {

    val sample = 1 to 10
    //偏函数是具有类型PartialFunction[-T,+V]的一种函数。T是其接受的函数类型，V是其返回的结果类型。
    val isEven: PartialFunction[Int, String] = {
      case x if x % 2 == 1 => x+" is even"
    }

    // the method collect can use isDefinedAt to select which members to collect
    val evenNumbers = sample collect isEven

    print(evenNumbers)
  }

  def test() : Unit = {
    // signal(0) 会抛出异常，因此使用前最好先signal.isDefinedAt(0)判断一下。
    val signal: PartialFunction[Int, Int] = {
      case x if x >= 1 => 1
      case x if x <= -1 => -1
    }

    val composed_signal: PartialFunction[Int,Int] = signal.orElse{
      case 0 => 0
    }
    composed_signal(0)  // 返回 0

    //对定义域进行一定的偏移（假如需求做了变更, 1 为无效的点）
    val new_signal: Function1[Int, Int] = signal.compose{
      case x => x  - 1
    }

    new_signal(1)  // throw exception
    new_signal(0)   // 返回 -1
    new_signal(2)  // 返回 1

    //用andThen将两个相关的偏函数串接起来
    val another_signal: PartialFunction[Int, Int] = {
      case 0 =>  0
      case x if x > 0 => x - 1
      case x if x < 0 => x + 1
    }

    val then_signal =  another_signal andThen  signal

  }
}
