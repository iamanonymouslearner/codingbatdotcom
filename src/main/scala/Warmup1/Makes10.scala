package Warmup1

object Makes10 extends App
{
  def makes10(a: Int, b: Int) : Boolean =
  {
    if((a==10) || (b==10) || ((a+b)==10))
      true
    else
      false
  }

}
