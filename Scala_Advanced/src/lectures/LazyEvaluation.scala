package lectures

object LazyEvaluation extends App{

  lazy val x : Int = {
    println("first time")
    43
  }

  println(x)
  println(x)

  //examples of implication

  def sideEffects : Boolean = {
    println("Boo")
    true
  }

  def simpleCondition : Boolean = false

  lazy val lazyCondition = sideEffects

  println(if(simpleCondition && lazyCondition) "YES" else "NO" )
}
