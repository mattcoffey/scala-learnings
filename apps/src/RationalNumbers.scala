object RationalNumbers extends Application {

	val oneHalf = new Rational(1, 2)
	println(oneHalf)
	//new Rational(1,0)
	
	println(new Rational(2, 3) add new Rational(1, 2))
	
	println(new Rational(20, 30) + new Rational(1, 2))
	
	println(new Rational(5) + new Rational(3, 4))

	//See object Rational for implicit conversion
	println(5 * new Rational(6, 10))
}