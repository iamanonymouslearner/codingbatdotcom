package Array1

object SameFirstLast extends App
{
  def sameFirstLast(nums:Array[Int]) : Boolean = {

    if(nums.length >= 1) (nums.head == nums.last) else false
  }

}
