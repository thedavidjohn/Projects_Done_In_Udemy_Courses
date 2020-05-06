package oop.basics

object Exceptions extends App {

  val x:String = null;
  //Exception
//  println(x.length)

  //throwing exceptions
//  val aWeirdValue:String = throw new NullPointerException
//  println(aWeirdValue)

  //throwable classes extend the Throwable class
//catch exceptions
  def getInt(withExceptions: Boolean): Int = {
  if(withExceptions) throw new RuntimeException("No Int for you!")
  else 42
}

  val potentialFail=  try{
  getInt(true)
  }
  catch {
    case e: RuntimeException => println("Caught a Runtime exception")
  }
  finally {
    println("In finally block")
  }

  println(potentialFail)

  //Own Exceptions
  class MyException extends Exception
  val exception = new MyException
  throw exception

}
