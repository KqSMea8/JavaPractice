package scala.Covariation

class Animal {}

class Bird extends Animal {}

class Consumer[-S,+T]() {

  def m1[U >: T](u: U): T = {new T} //协变，下界

  def m2[U <: S](s: S): U = {new U} //逆变，上界

}
//参考：https://www.jianshu.com/p/21602c973314
object  Test extends App {

  val c:Consumer[Animal,Bird] = new Consumer[Animal,Bird]()

  val c2:Consumer[Bird,Animal] = c

  c2.m1(new Animal)

  c2.m2(new Bird)

}


