package Array1

object MakePi extends App
{
  def makePi() : Array[Int] =
  {
    val first3ValuesOfPi = Math.PI.toString.take(4)
    (first3ValuesOfPi.head.toString+
        first3ValuesOfPi.tail.tail.head.toString+
           first3ValuesOfPi.last.toString).toArray.map(_.toString).map(_.toInt)
  }

}
