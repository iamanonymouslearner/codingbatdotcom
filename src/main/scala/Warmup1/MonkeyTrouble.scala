package Warmup1

object MonkeyTrouble extends App
{
  def monkeyTrouble(aSmile:Boolean, bSmile:Boolean) : Boolean =
  {
    if(!(aSmile^bSmile))
      true
    else
      false
  }

}
