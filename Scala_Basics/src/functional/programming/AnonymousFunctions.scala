package functional.programming

object AnonymousFunctions extends App{

  //Lambda
  val doubler = (x:Int) => x*2

 //multiple params

 val adder = (x:Int, y:Int) => x + y;

  val adder1: (Int, Int) => Int = (x, y) => x+y

  //mo params

  val justDoSomething = () => 3

  println(justDoSomething()) //3
  println(justDoSomething) //functional.programming.AnonymousFunctions$$$Lambda$5/917142466@61a52fbd
}
