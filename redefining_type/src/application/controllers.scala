package application

import framework.controller._

//This also does not resolve DefaultController.
//import framework.controller.DefaultController

// 'DefaultController' is red.
object Foos extends DefaultController {
  // 'bar' is red.
  def test = bar
}

object TestApp {
  def main(args: Array[String]) {
    println(Foos.test)
  }
}
