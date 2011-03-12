package application

import framework.controller._

//This also does not resolve DefaultController.
//import framework.controller.DefaultController

object Foos extends DefaultController {
  def test = bar
}

object TestApp {
  def main(args: Array[String]) {
    println(Foos.test)
  }
}
