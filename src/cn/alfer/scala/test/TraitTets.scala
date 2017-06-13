package cn.alfer.scala.test

/**
 * Created by weifeng on 2015/8/26.
 */
//class TraitTets {

  trait Log {
    def log(msg: String): Unit = {
      println("Log Content is :" + msg)
    }

    def defaultLog(msg:String)

  }

  trait MessageLogger extends Log {
    override def log(msg : String){
      println("Log Message is:" + msg)
    }
  }

  abstract class Account{
    def save
  }

  class MyAccount extends Account with Log{
    def save: Unit = {
      log("hhhhhhhhhhhh")
    }

    override def defaultLog(msg: String): Unit = {
      println("hello account is:" + msg)
    }
  }

  object UseTrait {

    def main(args: Array[String]) {
      val acc = new MyAccount
      acc.save
      acc.defaultLog("very good!")
    }

  }

//}

