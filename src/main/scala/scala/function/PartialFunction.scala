package scala.function

object PartialFunction {

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
