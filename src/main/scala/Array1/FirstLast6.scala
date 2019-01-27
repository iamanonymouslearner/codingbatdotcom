package Array1

object FirstLast6 extends App
{
  def firstLast6(nums:Array[Int]) : Boolean =
  {
    if(nums.length < 1) false else (nums.head==6 || nums.last==6)
  }

}
