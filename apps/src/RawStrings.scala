object RawStrings {
  val what =
    """"There once was a man from Venus,
Who had an incredibly large..."
\ntest\rtest''\nmoar"""

    val margin = """
      |line1
      |line2
      |line3""".stripMargin
    
  def main(args: Array[String]) {
    print(what)
    print(margin)
  }
}