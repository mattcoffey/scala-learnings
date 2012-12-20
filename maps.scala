
val adventure = scala.collection.mutable.Map[Int, String]()
//call to -> on integer
adventure += (1 -> "Fallout")
adventure += (2 -> "Skyrim")

println(adventure(1))
println(adventure(2))

val planets = Map(
    1 -> "Mercury",
    2 -> "Venus",
	3 -> "Earth"
)

println(planets)
