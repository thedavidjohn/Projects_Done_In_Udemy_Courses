package functional.programming

object MapFlatMapFilterFor extends App {

  val list = List(1, 2, 3)

  println(list)
  println(list.head)
  println(list.tail)

  //map
  println(list.map(_ + 2))
  println(list.map(_ + " is a number"))

  //filter
  println(list.filter(_ % 2 == 0))

  //flatmap
  val toPair = (x: Int) => List(x, x + 1)
  println(list.flatMap(toPair))

  //print all combinations of these two lists
  val numbers = List(1, 2, 3, 4)
  val alphabets = List('a', 'b', 'c', 'd')
  println(numbers.flatMap(n => alphabets.map(a => "" + a + n)))

  //print all combinations of these three lists
  val numbers2 = List(1, 2, 3, 4)
  val alphabets2 = List('a', 'b', 'c', 'd')
  val colors = List("black", "white")

  //Iterating in scala
  println(numbers2.flatMap(n => alphabets2.flatMap(a => colors.map(c => "" + a + n + c))))

  //foreach
  numbers.foreach(println)

  //for comprehensions

  val forCombination = for {
    n <- numbers if n %2 ==0
    a <- alphabets if a.equals('b')
    c <- colors if c.equals("black")
  } yield {
    "" + a + n + c
  }

  println(forCombination)

  for {
    n <- numbers
  } println(n)

  //Syntax overload
  list.map{
    x => x*2
  }


}
