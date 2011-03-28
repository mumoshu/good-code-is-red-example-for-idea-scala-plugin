import annotation.{implicitNotFound, elidable}

object Foo {
  // error: not enough arguments for constructor implicitNotFound: (msg: String)scala.annotation.implicitNotFound.
  // Unspecified value parameter msg.
  @implicitNotFound     // implicitNotFound should be red.

  //error: not enough arguments for constructor elidable: (level: Int)scala.annotation.elidable.
  //Unspecified value parameter level.
  @elidable     // elidable should be red.
  def main(args: Array[String]) = {
    println("bar")
  }
}
