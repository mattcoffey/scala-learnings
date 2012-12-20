//constant
val myArray = new Array[String](4)
myArray(0) = "WHAT"
myArray(1) = "FACE"
myArray(2) = "Scala\n"

for (i <- 0 to 3)
print(myArray(i) + " ")

val array2 = Array("one ", "two ", "three")

for (i <-0 to array2.length - 1)
print(array2(i));
