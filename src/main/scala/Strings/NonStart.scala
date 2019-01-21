package Strings

object NonStart extends App
{
  def nonStart(a:String,b:String):String=
  {
    a.tail+b.tail
  }

}
