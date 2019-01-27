package scala

/**
  *
  * @author dz on 2019/1/27.
  */
object keyword {

  def main(args: Array[String]): Unit = {

    //type相当于声明一个类型别名：
    type S = String

    //场景1 用于声明一些复杂类型，比如下面声明一个结构类型
    type T = Serializable {
               type X
                def foo():Unit
           }

    //这个结构类型内部也允许通过type来定义类型，这里对X没有赋值表示X是一个抽象类型，
    // 需要子类型在实现时提供X具体的类型。下面是一个T类型的具体实例：
    object A extends Serializable{ type X=String; def foo(){} }

    //typeOf[A.type] <:< typeOf[T]

    //场景2 用于抽象类型
    trait A { type T ; def foo(i:T) = print(i) }

    class B extends A { type T = Int }

    val b = new B
    //200
    b.foo(200)

    class C extends A { type T = String }

    val c = new C
    //hello
    c.foo("hello")










  }

}
