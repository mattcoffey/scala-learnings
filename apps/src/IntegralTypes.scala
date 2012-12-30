object IntegralTypes {

  private val myBit = false
  private val myByte :Byte = 1
  private val myShort :Short = 2
  private val myInt = 3
  private val myLong = 4L
  private val myChar :Char = 128
  private val myChar2 = '\u0022'
  private val myFloat = 6.0f
  private val myDouble = 7.0d
  private val myDouble2 = 8.0
  
  def main(args:Array[String]) {
    println("myByte: " + myByte.getClass().getSimpleName())
    println("myShort: " + myShort.getClass().getSimpleName())
    println("myByte + myShort: " + (myByte + myShort).getClass().getSimpleName())
    println("myInt: " + myInt.getClass().getSimpleName())
    println("myByte + myInt: " + (myByte + myInt).getClass().getSimpleName())
    println("myLong: " + myLong.getClass().getSimpleName())
    println("myInt + myLong: " + (myInt + myLong).getClass().getSimpleName())
    println(myChar2.getClass().getSimpleName())
    println("myChar2 + myInt: " + (myChar2 + myInt).getClass().getSimpleName())
    println(myFloat.getClass().getSimpleName())
    println(myDouble.getClass().getSimpleName())
    println(myDouble2.getClass().getSimpleName())
  }
}