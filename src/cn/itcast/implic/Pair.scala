package cn.itcast.implic

/**
  * Created by fengwei on 17/2/16.
  */

// <: 指定上界
class Pair[T <: Comparable[T]] {

  def bigger(first: T, second: T) = {
    if (first.compareTo(second) > 0)
      first else second
  }

}

object Pair {
  def main(args: Array[String]): Unit = {

  }
}
