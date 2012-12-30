object Operators {
  new Operators unary_++;
  //access java identifiers which are scala reserved words using back ticks
  Thread.`yield`
}

class Operators {

  var state:Int = 0
  
  def unary_++():Unit = state = state + 1
  
  def +++(that :Operators):Unit = println("+++")
  
  def :->(that :Operators):Unit = println(":->")
  	
  def --<@(that :Operators):Unit = println("--<@")
  	
  def <->(that :Operators):Unit = println("<->")
  
  def $basic(that :Operators):Unit = println("$basic")
  
  //Clashes with +++
  //def $plus$plus$plus(that :Operators):Unit = println("")
  
  //$ then symbol not cool
  //def $<:Unit = println("")
}