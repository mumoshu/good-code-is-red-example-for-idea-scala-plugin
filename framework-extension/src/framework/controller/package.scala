package framework {
  import framework.controller.AlternateController

  package object controller {
    println("package object 'controller' in framework-extension.jar read.")

    type DefaultController = AlternateController
  }
}