package Strings

object MiddleTwo extends App
{
  def middleTwo(word:String):String=
  {
    val center = word.length/2
    word.take(center).last.toString+word.drop(center).head.toString

  }

}
