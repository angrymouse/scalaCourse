package part1

import scala.annotation.tailrec

object TailRecursion extends App{

  @tailrec
  def repeatString (str: String, n:Integer ): String = {
    if (n == 0) ""
    else if (n == 1) str
    else repeatString(str+str, n-1)
  }

  @tailrec
  def repeatString(str:String, n:Integer, accumulator:String):String ={
    if(n==0) accumulator
    else repeatString(str, n-1, str+accumulator)
  }

  println(repeatString("teste", 0))
  println(repeatString("teste", 1))
  println(repeatString("teste", 10))
  println(repeatString("teste", 2000, ""))
  println(repeatString("teste", 2000))
}
