package Warmup1

object PosNeg extends App
{
  def posNeg(a:Int,b:Int,negative:Boolean) : Boolean =
  {
    if(negative)
      (a<0 && b<0)
    else
      ((a<0&&b>0)||(a>0&&b<0))
  }

}
