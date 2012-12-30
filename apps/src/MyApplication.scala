import SingletonCompanion.calculate

object MyApplication extends Application {
	for (country <- List("England", "Scotland", "Ireland", "Wales"))
	  println(country +": "+ calculate(country))
}