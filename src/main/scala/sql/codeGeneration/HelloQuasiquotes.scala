package sql.codeGeneration
import scala.reflect.runtime.currentMirror
import scala.tools.reflect.ToolBox
/**
  *
  * @author dz on 2019/1/31.
  */
object HelloQuasiquotes {

  def main(args: Array[String]): Unit = {

    val universe: scala.reflect.runtime.universe.type = scala.reflect.runtime.universe

    import universe._

    val toolbox = currentMirror.mkToolBox()

    val tree = q"""
              val f = {x: Int => x + 1}
              f
             """

    println(showCode(tree))

    //val func = toolbox.eval(tree)

    //val result = func.asInstanceOf[Int => Int](1)

    //println(result)
  }

  //{
  //  val f = ((x: Int) => x.+(1));
  //  f
  //}
  //2
}
