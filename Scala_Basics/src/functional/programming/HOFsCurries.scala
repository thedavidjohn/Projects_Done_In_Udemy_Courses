package functional.programming

object HOFsCurries extends App {

  def nTimes(f: Int =>Int, n: Int, x: Int) : Int =
    if(n<=0) x
    else nTimes(f, n-1, f(x))

  val plusOne = (x:Int) =>  x+1

  println(nTimes(plusOne, 5, 1))

  //better way to implement nTimes Function:
  def nTimesBetter(f:Int => Int, n:Int) : (Int => Int) =
    if(n<=0)(x:Int) => x
    else (x:Int) => nTimesBetter(f, n-1) (f(x))

  val plus10 = nTimesBetter(plusOne, 10)

  println(plus10(1))

  //curried functions
   val superAdder : Int => (Int => Int) = (x:Int) => (y:Int) => x+y

    val add3 = superAdder(3) // returns a lambda : y => 3 +y

    println(add3)

    println(add3(10))
    println(superAdder(3)(10))

  //functions with multiple parameter lists
  def curriedFormatter (c:String)( x:Double) :String = c.format(x)

  val standardFormat : Double => String = curriedFormatter("%4.2f")
  val preciseFormat : Double =>String = curriedFormatter("%10.8f")

  println(standardFormat(Math.PI))
  println(preciseFormat(Math.PI))

}
