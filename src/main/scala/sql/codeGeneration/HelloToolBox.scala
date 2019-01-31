package sql.codeGeneration
import scala.tools.reflect.ToolBox

/**
  *
  * @author dz on 2019/1/31.
  */
object HelloToolBox {

  def main(args: Array[String]): Unit = {
    val toolBox = scala.reflect.runtime.universe.
      runtimeMirror(getClass.getClassLoader).mkToolBox()

    val code =
      """
        val f = {x: Int => x + 1}
        f
      """

    val tree = toolBox.parse(code)
    println(tree)

    val func = toolBox.eval(tree)
    val result = func.asInstanceOf[Int => Int](1)
    println(result)

    //{
    //  val f = ((x: Int) => x.$plus(1));
    //  f
    //}
    //2

  }

}
