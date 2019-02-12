package sql.listener

/**
  *
  * @author dz on 2019/1/31.
  */
abstract class Listener { def trigger }
class Listening {
  var listener: Listener = null
  def register(l: Listener) {listener = l}
  def sendNotification() { listener.trigger }
}

object Test {
  /**
    * notification 是发送消息类 Listening 的子类，
    * 调用方法 register 注册接受消息的对象，
    * 在生成注册对象时，也定义了匿名子类 Listener 。
    * 最后使用 sendNotification 接口往 Listener 发送消息。
    * @param args
    */
  def main(args: Array[String]) = {
    var notification = new Listening()
    notification.register(new Listener {
      def trigger { println(s"Trigger at ${new java.util.Date}") }
    })
    notification.sendNotification()
  }
}
