package Strings

object HadBad extends App
{
  def hasBad(str:String):Boolean=
  {
    str.take(3)=="bad" || str.drop(1).take(3) == "bad"
  }

}
