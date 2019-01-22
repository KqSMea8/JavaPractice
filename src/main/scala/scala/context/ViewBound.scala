package scala.context

class Bird {def sing = {}}

class Toy {}

class Consumer[T <% Bird]() {

  def use[T <% Bird](t: T) = t.sing
}

object ViewBound  extends  App {

  //要求T必须有一种隐式转换能转换成Bird,也就是 T => Bird
  implicit def toy2Bird(t: Toy) = new Bird

  val c = new Consumer()

  c.use(new Toy)

}
