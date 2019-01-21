package Strings

object ComboString extends App
{
  def comboString(a:String,b:String):String=
  {
    if(a.length > b.length) b+a+b
    else a+b+a
  }

}
