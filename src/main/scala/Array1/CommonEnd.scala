package Array1

object CommonEnd extends App
{
  def commonEnd(array1:Array[Int],array2:Array[Int]) : Boolean =
  {
    if(array1.length > 1 && array2.length > 1)
      array1.head==array2.head || array1.last==array2.last
    else
      false
  }

}
