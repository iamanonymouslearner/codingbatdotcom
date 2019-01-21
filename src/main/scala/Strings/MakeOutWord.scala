package Strings

object MakeOutWord extends App
{
  def makeOutWord(out:String,word:String):String =
  {
    out.take(2)+word+out.drop(2)
  }

}
