package scala.sign

import scala.collection.mutable.ArrayBuffer

/**
  *
  * @author dz on 2019/1/27.
  */
object Test {


    def main(args: Array[String]): Unit = {
      val list = List(1,2,3)

      // :: 用于的是向队列的头部追加数据,产生新的列表, x::list,x就会添加到list的头部
      println(4 :: list)  //输出: List(4, 1, 2, 3)

      // .:: 这个是list的一个方法;作用和上面的一样,把元素添加到头部位置; list.::(x);
      println( list.:: (5)) //输出: List(5, 1, 2, 3)

      // :+ 用于在list尾部追加元素; list :+ x;
      println(list :+ 6)  //输出: List(1, 2, 3, 6)

      // +: 用于在list的头部添加元素;
      val list2 = "A"+:"B"+:Nil //Nil Nil是一个空的List,定义为List[Nothing]
      println(list2)  //输出: List(A, B)

      // ::: 用于连接两个List类型的集合 list ::: list2
      println(list ::: list2) //输出: List(1, 2, 3, A, B)

      // ++ 用于连接两个集合，list ++ list2
      println(list ++ list2) //输出: List(1, 2, 3, A, B)


  }

  //=>（匿名函数）
  class Symbol {
    var add = (x: Int) => x + 1
  }
  def test_=>():Unit = {
    var symbol = new Symbol
    printf(""+ symbol.add.toString())
  }

  // <- （集合遍历）
  def test_<-():Unit = {
    var list = Array(1,2,3,4)
    for (aa <- list) {
      printf(aa+"   ")

    }
  }

  //++=（字符串拼接）
  def test_++=():Unit = {
    var s:String = "a"
    s+="b"
    println(s)
    s++="c"
    println(s)
  }

  //:::三个冒号运算符与::两个冒号运算符
  //:::三个冒号运算符表示List的连接操作。(类似于Java中的 list1.addAll(list2))
  //::两个冒号运算符表示普通元素与list的连接操作。(类似于Java中的list1.add(A)操作)
  def test_::():Unit = {

    val one = List(1,2,3)
    val two = List(4,5,6)

    val three = one ::: two
    println(three.toString())

    val four = 7 :: three

    println(four.toString())
  }

  //-> 构造元组和_N访问元组第N个元素
  def test_->():Unit = {
    val first = (1,2,3) // 定义三元元组

    val one = 1
    val two = 2
    val three = one -> two

    println(three) // 构造二元元组

    println(three._2) // 访问二元元组中第二个值
  }

  //_（下划线）的用法
  def test_():Unit = {

    //指代集合中的每一个元素
    //例如 遍历集合筛选列表中大于某个值的元素。
    val lst = List(1,2,3,4,5)
    val lstFilter = lst.filter(_ > 3)

    //获取元组中指定下标的元素值
    val ss = (1,"22","333")
    println(ss._1)

    //使用模式匹配可以用来获取元组的组员
    val m = Map(1 -> 2,2 -> 4)
    for ((k,_) <- m) println(k) //如果不需要所有部件， 则在不需要的部件使用_； 本例只取key,因此在value处用_

    //成员变量而非局部变量添加默认值
    var s:Int=_
      println(s)


    //：_* 作为一个整体，告诉编译器你希望将某个参数当做数序列处理
    def sum(args: Int*) : Int = {
      var result = 0 ;
      for(s2 <- args) {
        result += s2 ;
      }
      result ;
    }
    val s_sum = sum(1 to 5:_*)      //把1 to 5当作一个序列处理
    println(s_sum)

    //+=
    //为可变数组添加元素
    def test_+=() :Unit = {
      val arrBuf1 = new ArrayBuffer[Int]()
      arrBuf1+= 11 // 添加一个元素

      println(arrBuf1)
    }

    //-=
    //从map后者可变数组中移除相应的值

    def test__+() : Unit = {

      val arrBuf1 = new ArrayBuffer[Int]()
      arrBuf1+= 11 // 添加一个元素
      arrBuf1+= 12 // 添加一个元素
      arrBuf1-= 12 // 删除一个元素

      println(arrBuf1)

      var map = Map(1 -> 1,2 -> 2,3 ->3 )
      map-=1
      println(map)
    }

  }

}
