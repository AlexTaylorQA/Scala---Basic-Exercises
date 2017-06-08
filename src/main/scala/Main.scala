/**
  * Created by Administrator on 05/06/2017.
  */
object Main
{
  def main(args:Array[String])
  {
    // Print 'Hello World!'
    println("Hello World!")

    // Store 'Hello World!' in a variable and then output it
    var a: String = "Hello World!"
    println(a)

    // Change the variable value and then output it again
    a = "Hello Again, World!!!"
    println(a)

    // Method that accepts a string as a parameter and then outputs that string
    printString(a)

    // Method that returns a string, which is then outputted
    println(returnString())

    /* Method that does not signify a return type and outputs whatever is given
       to it, then passes it to Double/String/Integer/Boolean types */
    println(passTypes(1.111))
    println(passTypes("Hello World, I can print all types!"))
    println(passTypes(1))
    println(passTypes(true))

    // Method that returns a specified number of characters from the end of a string
    println(numString(3, "Hello"))

    /* Method that combines two strings, then replaces all occurences of one
       character with a second character. */
    replaceLetter("Hello ", "World!", 'l', 'w')

    // Method that returns the sum of two numbers.
    println(findSum(1,2))

    /* Method that finds the sum of two numbers if true, or the multiplication
       of two numbers if false. */
    println(findSumBool(3, 5, true))
    println(findSumBool(3, 5, false))

    /* Method that finds the sum of two numbers if true, or the multiplication
       of two numbers if false, or returns one number if the other is 0. */
    println(findSumZero(0, 5, true))
    println(findSumZero(3, 0, false))

    // Method that loops to print a string a designated number of times
    printString("Hello", 3)

    // Method that loops to print a String in a rectangle based on an inputted number.
    printRectangle("H", 5)

    /* Method that prints numbers from 1 to a specified number.
       If the number is divisible by 3, print "fizz" instead.
       If the number is divisible by 5, print "buzz" instead.
       If the number is divisible by both 3 and 5, print "fizzbuzz" instead.
     */
    fizzBuzz("Fizz", "Buzz", 15)


    // Similar method that uses pattern matching instead of if statements.
    fizzBuzzPattern("Fizz", "Buzz", 15)

    // Method that swaps the position of two inputted integers.
    var b = new Array[Int](2)
    b = Array(1,2)

    var tmp = swapInts((b))

    tmp match
    {
      case c @ Array(x, _*) => println("(" + c(0) + ", " + c(1) + ")")
    }



  }



  // Functions

  def printString(inString: String) = println(inString)

  def returnString() : String = {

    var b: String = "Hello from inside the method, World!"
    return b
  }

  def passTypes(theInput : Any) : Any =
  {
    return theInput
  }

  def numString(theInt: Int, theString: String) : String =
  {
    theString.substring((theString.length() - theInt), theString.length)
  }

  def replaceLetter(inString1: String, inString2: String, inChar1: Char, inChar2: Char) =
  {
    var newString: String = (inString1 + inString2)
    println(newString.replace(inChar1, inChar2))

  }

  def findSum(inInt1: Int, inInt2: Int): Int =
  {
    (inInt1 + inInt2)
  }

  def findSumBool(inInt1: Int, inInt2: Int, inBool: Boolean): Int =
  {
    if(inBool == true)
    {
      inInt1 + inInt2
    }
    else
    {
      inInt1 * inInt2
    }
  }

  def findSumZero(inInt1: Int, inInt2: Int, inBool: Boolean): Int =
  {
    if(inInt1 == 0 && inInt2 == 0)
      {
        0
      }
    else if(inInt1 == 0)
      {
        inInt2
      }
    else if(inInt2 == 0)
      {
        inInt1
      }
    else if(inBool == true)
      {
        inInt1 + inInt2
      }
    else
      {
        inInt1 * inInt2
      }
  }

  def printString(inString: String, inInt: Int) =
  {
    var a = 0
    for(a <- 1 to inInt)
      {
        println(inString)
      }
  }

  def printRectangle(inString: String, inInt: Int) =
  {
    var newString = ""
    var a = 0
    for(a <- 1 to inInt)
    {
      newString = ""
      var b = 0

      for(b <- 1 to inInt)
      {
        newString += inString
      }

      println(newString)
    }
  }

  def fizzBuzz(inString1: String, inString2: String, inInt: Int) =
  {
    var a = 0
    for(a <- 1 to inInt)
      {
        if((a % 3 == 0) && (a % 5 == 0))
          {
            println(inString1 + inString2)
          }
        else if(a % 3 == 0)
          {
            println(inString1)
          }
        else if(a % 5 == 0)
          {
            println(inString2)
          }
        else
          {
            println(a)
          }
      }
  }

  def fizzBuzzPattern(inString1: String, inString2: String, inInt: Int) =
  {
    val a= 0;
    for(a <- 1 to inInt)
    {
      (a % 3 == 0 && a % 5 == 0) match
      {
        case true => println(inString1 + inString2)
        case false =>
          (a % 3 == 0) match
          {
            case true => println(inString1)
            case false =>
              (a % 5 == 0) match
              {
                case true => println(inString2)
                case false => println(a)
              }
          }
      }
    }
  }

  def swapInts(input:Any) : Any =
  {
    input match{
      case (x,y) => (y,x)
      case List(x,y) => List(y,x)
      case Array(x,y) => Array(y,x)

      // Handles tuples with more than two indexes
      case Tuple(x,y, longTup @ _*) => Tuple(y,x, longTup)

      // Handles arrays with more than two indexes
      case Array(x,y,longArr @ _*) => Array(y, x, longArr)
      case _ => ("Error")


    }
  }



}
