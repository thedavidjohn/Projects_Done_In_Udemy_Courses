package functional.programming

object PatternMatching extends App {

  val numbers = List(1, 2, 3, 4)

  val pattern = numbers match {
    case listOfStrings: List[String] => "List of String"
    case listOfNumbers: List[Int] => "List of numbers"
    case _ => "Default"
  }

  println(pattern)
}
