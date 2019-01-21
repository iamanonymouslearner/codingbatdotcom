package Strings

object NTwice extends App
{
  def ntwice(str:String,n:Int): String=
  {
    str.take(n)+str.drop(str.length-n)
  }

}
