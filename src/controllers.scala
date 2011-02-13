package controllers

import models._
import framework._

object Foos extends Controller with Secure {
  def index = Foo.findById(0)
  def test = alternateControllerMethod
}

object Bars extends Controller

trait Secure extends Controller
