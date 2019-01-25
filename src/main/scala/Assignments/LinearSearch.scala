package Assignments



object LinearSearch extends App
{
  def linearSearch (values:List[Int],searchValue:Int) : Int =
  {

      values.zipWithIndex.foreach(value => {
        if (value._1 == searchValue) return value._2+1
      })
      -1
  }
}
