def findSumBool(inInt1: Int, inInt2: Int, inBool: Boolean): Int =
{
  var tmp = 0
  if(inBool == true)
  {
    tmp =inInt1 + inInt2
  }
  else if(inBool == false)
  {
    tmp =inInt1 * inInt2
  }
  tmp
}