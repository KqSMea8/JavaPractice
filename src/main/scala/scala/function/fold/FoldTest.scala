package scala.function.fold

/**
  *
  * @author dz on 2019/1/27.
  */
object FoldTest {

  def main(args: Array[String]): Unit = {

    //求1到100的总和
    //用右折叠：
    Range(1,101).foldRight(0)((x,y)=>x+y)

    (Range(1,101):\0)(_+_)



  }
}
