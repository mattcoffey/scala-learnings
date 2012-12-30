object Rational {
	implicit def intToRational(x :Int) = new Rational(x)
}

class Rational(n:Int, d:Int) {
  
	require(d != 0)
	private val g = greatestCommonDenominator(n, d)
	val numerator :Int = n / g
	val denominator :Int = d / g
	println("Created: "+toString)

	def this(n :Int) = this(n, 1)
	
	def multiply(that:Rational):Rational = 
	  new Rational(
	      numerator * that.denominator, that.numerator * denominator
	  )
	
	def *(that:Rational):Rational = multiply(that:Rational)
	
	def add(that:Rational):Rational = 
	  new Rational(
	      numerator * that.denominator + that.numerator * denominator,
	      denominator * denominator
	  )
	
	def +(that:Rational):Rational = add(that:Rational)
	
	private def greatestCommonDenominator(a :Int, b :Int):Int =
	  if(b == 0) a else greatestCommonDenominator(b, a % b)
	
	override def toString = n+"/"+d
}