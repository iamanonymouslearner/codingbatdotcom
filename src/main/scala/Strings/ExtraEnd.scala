package Strings

object ExtraEnd extends App
{
  def extraEnd(word:String) : String =
  {
    word.drop(word.length-2)*3
  }

}
