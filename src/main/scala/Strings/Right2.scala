package Strings

object Right2 extends App
{
  def right2(a:String):String=
  {
    a.drop(a.length-2)+a.init.init
  }

}
