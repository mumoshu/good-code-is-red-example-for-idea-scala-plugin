package application

//import DefaultController

import framework.controller._

object Foos extends DefaultController {
  def test = bar
}

object TestApp {
  def main(args: Array[String]) {
    println(Foos.test)
  }
}