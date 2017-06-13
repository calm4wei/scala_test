package cn.alfer.scala.test

import cn.alfer.scala.paintcolors.Color._
import cn.alfer.scala.colorblend.blend
import cn.alfer.scala.thinking.followclass.{Count, WalkActivity}

/**
  * Created by fengwei on 17/1/25.
  */
object AtomicScalaTest {


	def main(args: Array[String]): Unit = {
		println(blend(red, yellow))
		require(args.length != 0, "args length must be 1.")
		println("args(0)=" + args(0))

		// Vector(new Count, new Count, new Count)
		println(Vector(new Count, new Count, new Count))

		WalkActivity.start("Sally")
		WalkActivity.stop("Sally")
		println(WalkActivity.log)

		val sally = new WalkActivity
		println(sally.calories(150, 30))

		println(WalkActivity.MET(1.0))
		println(WalkActivity.MET(2.7))
		val suzie = new WalkActivity
		println(suzie.calories(150, 30))
		val jonse = new WalkActivity
		println(jonse.calories(150, 30, 1.5))
	}


}
