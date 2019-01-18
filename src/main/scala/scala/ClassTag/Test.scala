package scala.ClassTag



class ScalaArrayDemo[T] {

  //Error: cannot find class tag for element type T
  def makeTArray(): Array[T] = new Array[T](10)

}

//ClassTag 、Manifest、ClassManifest、TypeTag是描述运行时类型信息的
object Test {



}
