package cn.itcast.implic

/**
  * Created by fengwei on 17/2/16.
  */
// 视图界定
class Chooser[T <% Ordered[T]] {

	def choose(first: T, second: T): T = {
		if (first > second) first else second
	}

}

object Chooser {
	def main(args: Array[String]): Unit = {
		//    val c = new Chooser[Girl]
		//    val g1 = new Girl("", 90)
		//    val g2 = new Girl("", 99)
	}
}
