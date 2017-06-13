package cn.alfer.scala.test

/**
 * Created by weifeng on 2015/8/26.
 */
class ApplyTest {

}

class ApplyT {
  def apply() = "This apply is in Class."

  def test: Unit = {
    println("test.....")
  }
}

object ApplyT {
  def apply() = new ApplyT()

  def static: Unit = {
    println("I am a static method!")
  }
}

object UsageApply extends App {
  val a = new ApplyT
  println(a())
  println(a.test)
  println(ApplyT.static)
  var fun: (Double) => Double = 3 * _
  println("fun=" + fun)
  println(valueAtOneQuarter(3))
  (1 to 9).map("*" * _).foreach(println _)

  def valueAtOneQuarter(p : Double): Double ={
    var ps = 3 * p
    ps
  }



}




