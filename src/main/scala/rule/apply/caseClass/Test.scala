package rule.apply.caseClass

object Test {

  def main(args: Array[String]): Unit = {

    case class Person(lastname: String, firstname: String, birthYear: Int)

    val p = Person("Lacava", "Alessandro", 1976)

    println( p.lastname )

    val Person(lastname, _, _) = p

    val meAsTuple: (String, String, Int) = ("Lacava", "Alessandro", 1976)

    Person.tupled( meAsTuple )

    val transform: Person => Option[ (String, String, Int) ] = {
         Person.unapply _
       }

    transform( p )

  }
}
