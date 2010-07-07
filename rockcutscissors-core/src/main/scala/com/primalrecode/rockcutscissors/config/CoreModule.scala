package com.primalrecode.rockcutscissors.config

import com.google.inject.AbstractModule
import com.google.inject.multibindings.Multibinder
import com.primalrecode.rockcutscissors.BootPoint

class CoreModule extends AbstractModule{
  def configure = {
    val bootPointBinder = Multibinder.newSetBinder(binder, classOf[BootPoint])
    bootPointBinder.addBinding().to(classOf[CoreBootPoint])
  }
}