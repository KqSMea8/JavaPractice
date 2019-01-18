package scala.Implicit

import java.io.File
import scala.io.Source


object IntTODoubleTest {

  def main(args: Array[String]): Unit = {

    implicit def double2Int(x:Double)=x.toInt

    val x:Int= 3.5

    print(x)

    //RichFile类中定义了Read方法
    class RichFile(val file:File){
      def read=Source.fromFile(file).getLines().mkString
    }

    //隐式转换功能十分强大，可以快速地扩展现有类库的功能
    //隐式函数将java.io.File隐式转换为RichFile类

    implicit def file2RichFile(file:File)=new RichFile(file)

    val f=new File("file.log").read

    println(f)
  }

}
