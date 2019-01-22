package scala.context

class Person(val age: Int) {
  println("person==> " + age)
}

// PersonOrdering继承了Ordering[T]，而Ordering[T]又继承了Comporator[T]，所以下面方法中有compare(x: T, y: T)方法
class PersonOrdering extends Ordering[Person] {
  override def compare(x: Person, y: Person): Int = {
    if (x.age > y.age) 1 else -1
  }
}

// 该类定义了一个上下文界定，意思是
// 在其作用域内，必须有一个Ordering[T]的隐式值，而这个隐式值可以作用于内部的方法
class Pair[T: Ordering](val first: T, val second: T) {
  // 该方法需要一个类型为Ordering[T]的隐式参数
  def old(implicit ord: Ordering[T]) = {
    if (ord.compare(first, second) > 0) first else second
  }
}

object ContextBoundTest {

  def main(args: Array[String]): Unit = {
    // 定义一个隐式值，类型为Ordering[T]
    implicit val po = new PersonOrdering

    val p = new Pair(new Person(18), new Person(19))
    // 调用old方法时，不需要传入参数，根据我们的上下文界定要求，po满足要求，因此作为参数传入old
    println(p.old.age) // 19
  }

}
