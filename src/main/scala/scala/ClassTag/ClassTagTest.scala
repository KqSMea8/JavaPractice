package scala.ClassTag

import scala.reflect.ClassTag


//由于Manifest存在缺陷，所以后面推出了ClassTag
//ClassTag是TypeTag的一个弱化的版本，运行时保存类型信息T。
//更多信息参考文档，文档写的非常清楚
class ClassTagDemo[T] {

  def mkArray[T: ClassTag](elems: T*) = Array[T](elems: _*)

  def mkArray2(elems: T*)(implicit x: ClassTag[T]) = Array[T](elems: _*)

  //  mkArray: [T](elems: T*)(implicit evidence$1: scala.reflect.ClassTag[T])Array[T]

  //  scala> mkArray(42, 13)
  //  res0: Array[Int] = Array(42, 13)
  //
  //  scala> mkArray("Japan","Brazil","Germany")
  //  res1: Array[String] = Array(Japan, Brazil, Germany)
}


object ClassTagTest {
  /**
   * SparkContext发现大量使用ClassTag保存泛型信息，没有使用TypeTag。所以一般ClassTag就足以满足我们的需要。
   * @param args
   */
  def main(args: Array[String]): Unit = {

    val c = new ClassTagDemo[Int]

    c.mkArray(42, 13)
    c.mkArray2(42, 13)

  }

}
