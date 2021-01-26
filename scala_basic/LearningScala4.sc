// Data structure

// Tuples
// Immutable lists

val captain_stuff = ("Picard", "Enterprise-D", "NCC-1781-D")
println(captain_stuff)

// Refer to the individual fields with a ONE-BASED index
println(captain_stuff._1)
println(captain_stuff._2)
println(captain_stuff._3)

val picardsShip = "Picard" -> "Enterprise-D"
println(picardsShip._2)

// Different types OK
val bunch_stuffs = ("Kirk", 1964, true)

// Lists
// Like a tuple, but more functionality
// Must be of the same type

val shipList = List("Enterprise", "Defiant", "Voyager", "DeepSpace nine")

println(shipList(1))
println(shipList.head)
println(shipList.tail)

for (ship <- shipList) {
  println(ship)
}

// Using map on List
val reversed_ship = shipList.map((ship: String) => ship.reverse)

// reduce() to combile together all items
val number_list = List(1, 2, 3, 4, 5)
val sum = number_list.reduce((x: Int, y: Int) => x+y)
println(sum)

// fileter() removes stuff
val remove_fives = number_list.filter( (x: Int) => x != 5)
val remove_fives2 = number_list.filter( _ != 5)
println(remove_fives)

// Maps
val shipMap = Map("Kirk" -> "Enterprise", "Picard" -> "Enterprise-D", "Sisko" -> "Deep Space Nine")
shipMap("Kirk")
shipMap.contains("Janeway")
val archersShip = util.Try(shipMap("Archer")) getOrElse "Unknown"


