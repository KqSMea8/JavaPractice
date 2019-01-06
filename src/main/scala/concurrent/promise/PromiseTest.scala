package concurrent.promise

import scala.concurrent.{Future, Promise}

object PromiseTest {

  case class TaxCut(reduction: Int)

  def main(args: Array[String]): Unit = {


    // either give the type as a type parameter to the factory method:
    val taxcut = Promise[TaxCut]()
    // or give the compiler a hint by specifying the type of your val:
    val taxcut2: Promise[TaxCut] = Promise()

    taxcut.success(TaxCut(20))

    print(taxcut.future)

  }


}
