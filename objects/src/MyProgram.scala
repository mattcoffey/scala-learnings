object MyProgram {

  def main(args: Array[String]) {

    val argument = headOrHello(args)

    println(argument)
    
    println(SingletonCompanion.calculate(argument))
  }

  def headOrHello =
    (args: Array[String]) => if (args.length > 0) args(0) else "Hello"
}