val list1 = List(1, 2, 3)
val list2 = List(4,5)
print("union ")
println(list1 ::: list2)

print("1 ")
println(list1)

print("2 ")
println(list2)

println("cons \"10\" to list2")

println("10" :: list2)

1::2::3::"x"::Nil foreach print
