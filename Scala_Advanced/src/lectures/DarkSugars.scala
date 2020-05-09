package lectures

object DarkSugars extends App {

  def singleArgMethod(x: Int): String = {
    s"Single arg method $x"
  }

  println(singleArgMethod {
    42
  })

  //Single abstract method pattern
  trait Action {
    def act(x: Int): Int
  }

  val instanceAction: Action = (x: Int) => x + 1
  val aThread = new Thread(() => "Runnable ")

  println(instanceAction)

  println(aThread)

  // :: and ::# methods

  val aList = 2 :: List(4, 5, 6)
  println(aList)

  val anotherList = 5 #:: LazyList(1,2,3)
  println(anotherList)

  //Multi word methods
  class MultiWordFn {
    def `multi word method`(x: Int): String = {
      s"${x} Multi word method"
    }
  }

  val obj = new MultiWordFn
  println(obj `multi word method` 5)


  //Infix types
  class Composite[A, B]{

  }

  val composite :Int Composite String = ???
}
