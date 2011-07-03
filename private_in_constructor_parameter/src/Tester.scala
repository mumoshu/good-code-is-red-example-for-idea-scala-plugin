package a {
  // class Sup(private[a] val foo: String)
  class Sup(private[a] foo: String)

//  class Sub extends Sup("foo") {
//    def bar = foo
//  }
}

object MyApp {
//  def main(argv: Array[String]) {
//    println(new a.Sub bar)
//  }
}

package b {
import a.Sup
class C extends Sup("foo") {
  //    def bar = foo
}
}

