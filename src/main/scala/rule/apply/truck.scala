package rule.apply

private class truck {
  println( "new truck created!" )
}
object truck {

  def apply(): Unit = {
    new truck
  }

}
