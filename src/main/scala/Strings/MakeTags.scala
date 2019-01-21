package Strings

object MakeTags extends App
{
  def makeTags(tag:String,word:String) : String =
  {
     s"<$tag>$word</$tag>"
  }

}


