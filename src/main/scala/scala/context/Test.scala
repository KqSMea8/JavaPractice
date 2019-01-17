package scala.context

object Test {

  //类型变量界定(Type Variable Bound)

  //编译错误
  /*def typeVariable[T](a: T, b: T) = {
    if (a.compareTo(b) > 0) 1
    else -1
  }*/

  // 通过编译
  def typeVariable[T <: Comparable[T]](a: T, b: T) = {
    if (a.compareTo(b) > 0) 1
    else -1
  }

  val v1 = typeVariable("scala", "java")
  println(v1) // scala

  //输入数字的话，便会报错：

  //val v2 = typeVariable(100, 200)
  //println(v2)
  //Error:(15, 12) inferred type arguments [Int] do not conform to method typeVariable's type parameter bounds [T <: Comparable[T]]
  //val v2 = typeVariable(100, 200)

  //进行一次隐式转换，将Int类型转换成支持Comparable[T]的类型
  //类型变量界定就转换成了视图界定
  def typeVariable1[T <% Comparable[T]](a: T, b: T) = {
    if (a.compareTo(b) > 0) a
    else b
  }
  val v2 = typeVariable(100, 200)
  println(v2) // 200


}
