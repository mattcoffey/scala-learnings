object Symbols {

  val symbol1 = 'symbol1
  val symbol2 = 'symbol2
  
  val data = new Symbols
  
  

  def main(args: Array[String]) {
	  println( symbol1 + "BANG")
  }
}

class Symbols {
  private var field1 = "field1"
  private var field2 = "field2"
  private var field3 = "field3"

  def updateField(field:Symbol, value:String) {
    
    
  }
}