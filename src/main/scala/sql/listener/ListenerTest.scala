package sql.listener

abstract class Listener { def trigger }

/**
  *
  * @author dz on 2019/1/31.
  */
/**
  * Scala 中也有虚类，相当于 C++ 的纯虚类，不能自己实例化。
  * 可以定义一个匿名的子类来实例化生成对象。
  * 匿名子类的写法是使用父虚类后面跟着大括号，
  * 在里面覆盖 override 父类的方法。
  */
object ListenerTest {

  def main(args: Array[String]) = {
    var myListener  = new Listener{
      def trigger() {println(s"Trigger at ${new java.util.Date}")}
    }
    myListener.trigger()
  }

}
