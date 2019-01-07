package scala.scope.P2

import scala.scope.P1.C1

class C21 extends C1{

  println( m1 )   //< 9, 错误
  //println( m2 )   //< 10, 错误
  //println( m3 )   //< 11, 错误
  println( m4 )   //< 12, 正确

  println( n1 )   //< 13, 正确
  println( n2 )   //< 14, 正确
  println( n3 )   //< 15, 正确
  println( n4 )   //< 16, 正确

  //下面我们对每一项进行解释，并穿插介绍一些规则：
  //
  //1.private[C1]指定成员在自身类作用域 private，在该类所在的包内和包外均不可见（9也是这个道理）
  //2.private[this]比 private[C1]更加严格，前者只对相同实例可见，相同类的不同实例都不可见；而后者对相同类的不同实例也可见
  //3.private[P1]指定在包 P1 内 private，则在 P1 包中的类中均可见，而在 P1外的包均不可见
  //4.private[P2]指定在包 P2 内 private，则在包 P2 及该类所在包内均可见
  //5.protected[C1]指定在 C1 中 protected，则在 C1 所在包内的继承类及外部包内所在的继承类均可见
  //6.同5
  //7.protected[P1]指定在包 P1 内 protected，在 P1 包内的 C1 继承类及 P1 外的包内的继承类可见
  //8.protected[P1]指定在包 P2 内 protected，在 P1 包内的 C1 继承类及 P1 外的包内的继承类可见
  //9.见1
  //10.见2
  //11.见3
  //12.见4
  //13.见5
  //14.见6
  //15.见7
  //16.见8



}
