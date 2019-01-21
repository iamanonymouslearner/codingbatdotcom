package Strings

object WithOutEnd extends App
{
  def withOutEnd(word:String):String=
  {
    if(word.nonEmpty && word.length >1)
      word.tail.init
    else
      ""
  }

}
