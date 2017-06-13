package cn.alfer.scala.test

import java.text.SimpleDateFormat

/**
 * Created by weifeng on 2015/8/16.
 */
class CollectionOperation {

  val list = List(1,2,3,1)
  val set = Set(1,2,3,1)


}

object Collections extends App{

  // var collect = new CollectionOperation()

  //collect.list.indexOf(1)

  val time : String = "2016-01-01 00:00:00"

  val sdf:SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
  val date = sdf.parse(time)

  // print(date.getTime)


  //val arr = Seq(1,2,3,4)
  val arr = Array(5,6,0,1,2,3,4)
  arr.foreach(a => print(a))
  val list = arr.toList
  list.foreach(l => print(l))


}
