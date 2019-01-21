package Warmup1

object SleepIn extends App
{
  def Sleep(weekday:Boolean,vacation:Boolean) : Boolean =
  {
    if(!(weekday && !vacation))
      true
    else
      false
  }
}
