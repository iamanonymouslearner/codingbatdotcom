package Strings

object Left2 extends App
{
  def left2(a:String):String =
  {
    a.drop(2)+a.take(2)
  }

}
