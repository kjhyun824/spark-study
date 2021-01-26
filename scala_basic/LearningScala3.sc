// Functions

// format: def <function name>(parameter_name: type...}: return type = { }

def squareIt(x: Int): Int = {
  x * x
}

def cubeIt(x: Int): Int = {x * x * x}

println(squareIt(32))
println(cubeIt(24))

def transformInt(x:Int, f: Int => Int): Int = {
  f(x)
}

val result = transformInt(2, cubeIt)
transformInt(3, x => x * x * x)

