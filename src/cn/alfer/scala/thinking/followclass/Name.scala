package cn.alfer.scala.thinking.followclass

import reflect.runtime.currentMirror

/**
  * Created by fengwei on 17/6/13.
  */
trait Name {
	override def toString = Name.className(this)
}

object Name {
	def className(o: Any) =
		currentMirror.reflect(o).symbol.
			toString.replace('$', ' ').
			split(' ').last
}
