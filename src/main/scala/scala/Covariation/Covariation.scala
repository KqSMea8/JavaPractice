package scala.Covariation


class Animal {}

class Bird extends Animal {}



object Covariation  extends  App {

  override def main(args: Array[String]): Unit = {

    //协变
    class Covariant[T](t:T){}
    //cov不能赋值给cov2，因为Covariant定义成不变类型。
    val cov = new Covariant[Bird](new Bird)



  }

  def test() : Unit = {

    //协变
    class Covariant[+T](t:T){}
    //孩子
    val cov = new Covariant[Bird](new Bird)
    //因为Covariant定义成协变类型的，所以Covariant[Bird]是Covariant[Animal]的子类型，
    // 所以它可以被赋值给cov2。
    // 父亲
    val cov2:Covariant[Animal] = cov
  }


  def test2() : Unit = {

    class Contravariant[-T](t: T) {

    }

    val c: Contravariant[Animal] = new Contravariant[Animal](new Animal)

    val c2: Contravariant[Bird] = c
  }


}
