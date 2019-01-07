package scala.scope.P1

class C1 {
  private[C1] val m1 = 1
  private[this] val m2 = 2
  private[P1] val m3 = 3
  private[P2] val m4 = 4

  protected[C1] val n1 = 1
  protected[this] val n2 = 2
  protected[P1] val n3 = 3
  protected[P2] val n4 = 4

  //< 不管什么样的作用域内 private 或 protected,在自身类中都是可见的
  println( m1 )
  println( m2 )
  println( m3 )
  println( m4 )

  println( n1 )
  println( n2 )
  println( n3 )
  println( n4 )

}
