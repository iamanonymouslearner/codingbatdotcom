package Warmup1

object NearHundred extends App
{
  def nearHundred(n:Int) : Boolean =
  {
    if(Math.abs(100-n) <= 10 || Math.abs(200-n) <=10 )
      true
    else
      false
  }

}
