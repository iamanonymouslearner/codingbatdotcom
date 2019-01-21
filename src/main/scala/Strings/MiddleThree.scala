package Strings

object MiddleThree extends App
{
  def middleThree(str:String):String=
  {
    val mylen = str.length/2
    if(str.length < 3 )
      str
    else
      str.substring(mylen-1,mylen+2)
  }

}
