package Strings

object TheEnd extends App
{
  def theEnd(str:String,front:Boolean):String=
  {
    if(front) str.head.toString
    else str.last.toString
  }

}
