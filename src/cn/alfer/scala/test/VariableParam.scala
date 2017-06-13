package cn.alfer.scala.test

/**
 * Created by weifeng on 2015/8/26.
 */
object VariableParam {

  def variableParameter (s:String*) = {
    s.foreach(x => println(x))
  }

  def sum(x:Int)(y:Int) = x + y

  def main(args: Array[String]) {
    variableParameter("I","love","spark")
    println(sum(2)(3))

    var (n,r) = (10,0)
    while (n > 0){
//      println("n=" + (n=n-1) + ",r=" + (r=r+1))
      n=n-1
      r=r+1
      println("n=" + n + "  ")
    }

    var t = 10
    while (t > 0){
      t = t -1
    }
    println(t)

    for (i <- 1 to 5 if  i % 2 == 0){
      println(i)
    }
  }

}
