package cn.alfer.scala.thinking.followclass

/**
  * Created by weifeng on 2017/6/13.
  */
class WalkActivity {

	val MET = WalkActivity.MET

	def calories(lbs: Int, mins: Int, mph: Double = 3): Long = Math.round(
		(WalkActivity.MET(mph) * 3.5 * lbs * 0.45) / 200 * mins
	)

}

object WalkActivity {
	var log: String = ""
	val MET: Double = 2.3

	def MET(mph: Double) = mph match {
		case x if (x < 1.7) => 2.3
		case x if (x < 2.5) => 2.9
		case x if (x < 3) => 3.3
		case x if (x >= 3) => 3.3
		case _ => 2.3
	}

	def start(name: String): Unit = {
		println(s"${name} started !")
		log += s"[${name}] Activity started."
	}

	def stop(name: String): Unit = {
		log += s"${name} Acticity stopped."
	}

}
