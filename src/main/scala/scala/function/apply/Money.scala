package scala.function.apply

/**
  *
  * @author dz on 2019/2/13.
  */

//unapply方法就刚好相反，他是接受一个对象，从对象中提取出相应的值。

class Money(val value: Double, val country: String) {}

object Money {

  def apply(value: Double, country: String) : Money = new Money(value, country)

  def unapply(money: Money): Option[(Double, String)] = {
    if(money == null) {
      None
    } else {
      Some(money.value, money.country)
    }
  }

  //输出   RMB: 10.1
  def testUnapply() = {
    val money = Money(10.1, "RMB")

    money match {
      case Money(num, "RMB") =>  println("RMB: " + num)
      case _ => println("Not RMB!")
    }

  }


}
