import scala.io.Source

if(args.length == 0) {
	Console.err.println("Provide a filename")
	sys.exit
}

val lines = Source.fromFile(args(0)).getLines().toList
val longestLine = lines.reduceLeft(
	(a, b) => if (a.length > b.length) a else b
)

val maxLength = longestLine.length.toString.length

for(line <- lines) {
	val numberOfSpaces = maxLength - line.length.toString.length
	val padding = " " * numberOfSpaces + " "
	println(padding + line.length + " | " + line)
}

