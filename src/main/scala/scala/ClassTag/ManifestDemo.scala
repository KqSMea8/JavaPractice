package scala.ClassTag

/**
 * 参考：http://hongjiang.info/scala-type-system-manifest-vs-typetag/
 * @tparam T
 */
class ManifestDemo[T] {

  //Manifest是类型T的显示描述符
  def makeTArray[T: Manifest](): Array[T] = new Array[T](10)

  //等效上面的写法
  def makeTArray2()(implicit x: Manifest[T]): Array[T] = new Array[T](10)

  def makeStringArray(): Array[String] = new Array[String](10)

}


object ManifestDemo extends  App {

  val c = new ManifestDemo[String]

  c.makeTArray()
  c.makeTArray2()
}

/*
ClassManifest是Manifest的一个弱化版本，就是保存的类型信息不如Manifest多。
不过scala在2.10里却用TypeTag替代了Manifest，用ClassTag替代了ClassManifest，
原因是在路径依赖类型中，Manifest存在问题
 */
