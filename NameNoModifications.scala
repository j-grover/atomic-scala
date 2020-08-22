// NameNoModifications.scala
package com.atomicscala
import reflect.runtime.currentMirror

object NameNoModifications {
  def className(o:Any) =
    currentMirror.reflect(o).symbol.toString
}

trait NameNoModifications {
  override def toString =
    NameNoModifications.className(this)
}
