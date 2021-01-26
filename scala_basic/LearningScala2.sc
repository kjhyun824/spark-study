// Flow control

// If / else
if (1 > 3)
  println("Impossible")
else
  println("Here it is!")

// Matching -> Switch
val number = 2
number match {
  case 1 => println("one")
  case 2 => println("two")
  case 3 => println("three")
  case _ => println("None of one/two/three")
}

// For loop
for (x <- 1 to 4) {
  val squared = x * x
  println(squared)
}

// While loop
var x = 10
while (x >= 0) {
  println(x)
  x -= 1
}

// Do while
x = 0
do {
  println(x)
  x += 1
} while (x <= 10)

// Expressions
{val x = 10; x + 20}
println({val x = 10; x + 20})

var a1 = 0
var a2 = 1
var num_fibos = 10
do {
  println(a1)
  val temp = a1 + a2
  a1 = a2
  a2 = temp
  num_fibos -= 1
} while(num_fibos > 0)