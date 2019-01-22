package scala.fold

import org.scalatest.FunSuite

class FoldTest extends FunSuite{


  test("fold test"){
    val numbers = List(5, 4, 8, 6, 2)
    val result = numbers.fold(0) { (z, i) =>
      z + i
    }

    println(result)
  }

  test("foldLeft test"){
    class Foo(val name: String, val age: Int, val sex: Symbol)

    object Foo {
      def apply(name: String, age: Int, sex: Symbol) = new Foo(name, age, sex)
    }

    val fooList = Foo("Hugh Jass", 25, 'male) ::
      Foo("Biggus Dickus", 43, 'male) ::
      Foo("Incontinentia Buttocks", 37, 'female) ::
      Nil //空的List

    val stringList = fooList.foldLeft(List[String]()) { (z, f) =>
      val title = f.sex match {
        case 'male => "Mr."
        case 'female => "Ms."
      }
      z :+ s"$title ${f.name}, ${f.age}"
    }

    // stringList(0)
    // Mr. Hugh Jass, 25

    // stringList(2)
    // Ms. Incontinentia Buttocks, 37
  }
}
