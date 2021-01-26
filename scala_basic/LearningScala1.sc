// VALUES are immutable canstants
val hello: String = "Hola!"

// VARIABLES are muttable
var hello_there: String = hello
hello_there = hello + " There!"
println(hello_there)

val immutable_hello_there = hello + " There!"
println(immutable_hello_there)

// Data Types

val one: Int = 1
val one_ = 1

val truth: Boolean = true
val letter_a: Char = 'a'
val pi: Double = 3.14159265
val pi_single_precision: Float = 3.14159265f
val big_number: Long = 123456789
val small_number: Byte = 127

println("Here is a mess: " + one + truth + letter_a + pi);

println(f"Pi is about $pi_single_precision%.3f")
println(f"Zero padding on the left: $one%05d")

println(s"I can use s prefix to use variables like $one $truth $letter_a")
println(s"Anything possible! : ${1+2}")

val final_answer: String = "To life, the universe, and everything is 42."
val pattern = """.* ([\d]+).*""".r
val pattern(answer_string) = final_answer
val answer = answer_string.toInt
println(answer)

// Booleans
val is_greater = 1 > 2
val is_less = 1 < 2
val impossible = is_greater & is_less
val another = is_greater && is_less