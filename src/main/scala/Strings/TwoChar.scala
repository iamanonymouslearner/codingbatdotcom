package Strings

object TwoChar extends App
{
  def twoChar( str:String, index:Int):String=
  {
    if(index <= 0 || index == str.length-1 ||  index >= str.length())
      str.take(2)
    else
      str.substring(index).take(2)
  }

}
