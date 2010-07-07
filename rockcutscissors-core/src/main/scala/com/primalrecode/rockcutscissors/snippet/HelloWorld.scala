package com.primalrecode.rockcutscissors.snippet

import _root_.scala.xml.NodeSeq
import _root_.net.liftweb.util.Helpers
import Helpers._
import com.primalrecode.rockcutscissors.model._
import com.primalrecode.rockcutscissors._

class HelloWorld {
  def howdy(in: NodeSeq): NodeSeq = {
    val page = new Page
    page.name = "foobar"
    page.text = "true"
    Model.persist(page)
    Helpers.bind("b", in,
      "time" -> Model.find(classOf[Page], "foobar").map(_.text).getOrElse("oops"))
  }
}

