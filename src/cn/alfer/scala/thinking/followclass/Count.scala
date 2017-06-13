package cn.alfer.scala.thinking.followclass

/**
  * Created by weifeng on 2017/6/13.
  */
case class Count() {
	val id = Count.id

	override def toString = s"Count$id"
}

object Count {
	var n = -1

	def id() = {
		n += 1;
		n
	}
}
