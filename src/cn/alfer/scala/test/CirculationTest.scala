package cn.alfer.scala.test

/**
 * Created by feng.wei on 2015/11/26.
 */
class CirculationTest {

  def intCirclation(param: Int) = {

    var n = param
    while (n >= 0) {
      print(n + " ")
      n -= 1

    }
    println()
    for (i <- param to 0) {
      print(i + " ")
    }
    var sum = 0
    for (i <- 1 to param) {
      sum += i
    }
    sum
  }

  def strCirclation(param: String) = {
    for (ch <- param) {
      println(ch)
    }
  }

  def sum(args: Int*) = {
    var sum = 0
    for (arg <- args) {
      sum += arg
    }

    sum
  }

  def recursiveSum(args: Int*): Int = {
    if (args.length == 0) 0
    else {
      print("head=" + args.head + ", tail=" + args.tail)
      args.head + recursiveSum(args.tail: _*)
    }
  }

  def execiess_1(p: Int): Int = {
    if (p > 0) 1
    else if (p == 0) 0
    else -1
  }

  def execieses_2(): Unit = {

  }

  def execieses_6(p: String): Long = {
    var m = 1
    for (ch <- p) {

      m *= ch.toInt
      print("6 = " + ch.toInt)
    }

    p.iterator.next().toInt
    m
  }


}

object CirculationTest {


  def main(args: Array[String]) {
    val circl = new CirculationTest
    //    val sum = circl.intCirclation(3)
    //    println("sum" + sum)
    //    circl.strCirclation("hello")
    //    println(circl.sum(1, 2, 4))
    //    println("recursiveSum=" + circl.recursiveSum(2,3))

    circl.intCirclation(3)
    println("2 = " + circl.execiess_1(2))
    println(circl.execieses_2())

    val list = List(1,2,3)


  }
}

