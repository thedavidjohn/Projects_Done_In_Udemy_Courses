package oop.basics

object CaseClass extends App{


  case class Person (name:String, age:Int)

  val david = new Person("David", 30)
  val david2= new Person("David", 30)

  println(david.name)
  println(david.toString)
  //equals and hashcode is implemented by default
  println(david == david2)
  println(david.equals(david2))

  //copy method (cloning)
  val david3 = david.copy(age = 31)
  println(david3)

  //companion object
  val david4 = Person("David4", 32)
  println(david4)

  case object UnitedKingdom{
    def name:String = "The UK of GB and NI"
  }
}
