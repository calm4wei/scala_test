package cn.itcast.implic

/**
  * Created by fengwei on 17/2/16.
  */
object MyPredef {

  //  implicit def fileToRichFile(f: File)
  //  = new RichFile(f)

  implicit def girl2Ordered(g: Girl) = new Ordered[Girl] {
    override def compare(that: Girl): Int = ???
  }
}
