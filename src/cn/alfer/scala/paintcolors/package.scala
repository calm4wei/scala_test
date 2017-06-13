package cn.alfer.scala

import cn.alfer.scala.paintcolors.Color
import cn.alfer.scala.paintcolors.Color._

/**
  * Created by fengwei on 17/1/25.
  */
package object colorblend {

  def blend(a: Color, b: Color) : Color = {
    (a, b) match {
      case _ if a == b => a
      case (`red`, `blue`) |
           (`blue`, `red`) => purple
      case (`red`, `yellow`) |
           (`yellow`, `red`) => orange
      case (`blue`, `yellow`) |
           (`yellow`, `blue`) => green
      case (`brown`, _) |
           (_, `brown`) => brown
      case _ => // Interesting, not accurate:
        Color((a.id + b.id) % Color.maxId)
    }


  }

}
