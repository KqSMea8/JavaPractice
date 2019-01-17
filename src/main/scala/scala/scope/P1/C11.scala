package scala.scope.P1


class C11 extends C1{
  println( m1 )   //< 1, 错误
  //println( m2 )   //< 2, 错误
  println( m3 )   //< 3, 正确
  println( m4 )   //< 4, 正确

  println( n1 )   //< 5, 正确
  println( n2 )   //< 6, 正确
  println( n3 )   //< 7, 正确


}
