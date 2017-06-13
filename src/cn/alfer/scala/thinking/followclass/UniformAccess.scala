package cn.alfer.scala.thinking.followclass

/**
  * Created by fengwei on 17/6/13.
  */
class UniformAccess {

	private var internal = 1

	// getter
	def x = internal

	/**
	  * setter
	  *
	  * @param newVar
	  */
	def x_=(newVar: Int) = internal = newVar
}


object UniformAccess {
	def main(args: Array[String]): Unit = {
		val u = new UniformAccess
		println(u.x)
		u.x = 2
		println(u.x)

		val c = CaseName
		println(c)
	}
}