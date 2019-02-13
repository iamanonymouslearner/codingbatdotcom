package Array1

object Array1 extends App
{

  def commonEnd(array1:Array[Int],array2:Array[Int]) : Boolean =
  {
    if(array1.length > 1 && array2.length > 1)
      array1.head==array2.head || array1.last==array2.last
    else
      false
  }

  def firstLast6(nums:Array[Int]) : Boolean =
  {
    if(nums.length < 1) false else (nums.head==6 || nums.last==6)
  }

  def makePi() : Array[Int] =
  {
    val first3ValuesOfPi = Math.PI.toString.take(4)
    (first3ValuesOfPi.head.toString+
      first3ValuesOfPi.tail.tail.head.toString+
      first3ValuesOfPi.last.toString).toArray.map(_.toString).map(_.toInt)
  }

  def sameFirstLast(nums:Array[Int]) : Boolean = {

    if(nums.length >= 1) (nums.head == nums.last) else false
  }


  //Given an array of ints length 3, return the sum of all the elements.

  def Sum3(arr:Array[Int]) : Int =
  {
    arr.sum
  }

  //Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

  def RotateLeft3(arr:Array[Int]) : Array[Int] =
  {
    Array(arr(1),arr(2),arr(0))
  }

  //Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

  def Reverse3(arr:Array[Int]) : Array[Int] =
  {
    arr.reverse
  }

  //Given an array of ints length 3, figure out which is larger, the first or last element in the array,
  // and set all the other elements to be that value. Return the changed array.

  def MaxEnd3(arr:Array[Int]) : Array[Int] =
  {
    if(arr.head == arr.last)
      arr
    else if(arr.head > arr.last)
      Array.fill(arr.length) {arr.head}
    else
      Array.fill(arr.length) {arr.last}
  }

  //Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2,
  // just sum up the elements that exist, returning 0 if the array is length 0.

  def Sum2(arr:Array[Int]) : Int =
  {
    if(arr.length > 2)
      arr.head+arr.tail.head
    else
      arr.sum
  }

  //Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

  def MiddleWay(arr1:Array[Int],arr2:Array[Int]) : Array[Int] =
  {
    val mid = arr1.length/2
    Array(arr1(mid),arr2(mid))
  }

  //Given an array of ints, return a new array length 2 containing the first and last elements
  //from the original array. The original array will be length 1 or more.

  def MakeEnds(arr:Array[Int]) : Array[Int] =
  {
    Array(arr.head,arr.last)
  }

 //Given an int array length 2, return true if it contains a 2 or a 3.

  def Has23(arr:Array[Int]) : Boolean =
  {
    arr.contains(2) || arr.contains(3)
  }

  //Given an int array length 2, return true if it does not contain a 2 or 3.

  def No23(arr:Array[Int]) : Boolean =
  {
    !arr.contains(2) && !arr.contains(3)
  }

  //Given an int array, return a new array with double the length where its last element is the same as the original array,
  // and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array
  // contains all 0's.
  def MakeLast(arr:Array[Int]) : Array[Int] =
  {
    val out = Array.fill(arr.length*2){0}
    out(out.length-1) = arr.last
    out
  }

  //Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
  def Double23(arr:Array[Int]) : Boolean =
  {
    arr.count(num=>num==2)==2 || arr.count(_==3)==2
  }

  //Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
  // Return the changed array.
  def Fix23(arr:Array[Int]) : Array[Int] =
  {
    val str = arr.mkString.replaceAll("23","20")
    str.toArray.map(_.toString).map(_.toInt)
  }

  //Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
  def Start1(arr1:Array[Int],arr2:Array[Int]) : Int =
  {
    var Count=0
    if(!arr1.isEmpty && arr1.head == 1)
      Count +=1
    if(!arr2.isEmpty && arr2.head == 1)
      Count +=1
    Count
  }

//Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
// Return the array which has the largest sum. In event of a tie, return a.
  def BiggerTwo(arr1:Array[Int],arr2:Array[Int]) : Array[Int] =
  {
    if(arr1.sum >= arr2.sum) arr1 else arr2
  }


//Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array.
// The original array will be length 2 or more.
def MakeMiddle(arr:Array[Int]) : Array[Int] =
{
   val middle = arr.length/2
   Array(arr(middle-1),arr(middle))
}

//Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
def plusTwo(arr1:Array[Int],arr2:Array[Int]) : Array[Int] =
{
  (arr1.mkString+arr2.mkString).toArray.map(_.toString).map(_.toInt)
  //a++b
}

 //Given an array of ints, swap the first and last elements in the array. Return the modified array.
 // The array length will be at least 1.
def SwapEnds(arr:Array[Int]) : Array[Int] =
{
  val narr = arr
  val previousValue = arr(0)
  narr(0) = arr(arr.length-1)
  narr(arr.length-1) = previousValue
  narr
}

 //Given an array of ints of odd length, return a new array length 3 containing the elements
  // from the middle of the array. The array length will be at least 3.
  def MidThree(arr:Array[Int]) : Array[Int] =
 {
   val middle = arr.length/2
   Array(arr(middle-1),arr(middle),arr(middle+1))
 }

 //Given an array of ints of odd length, look at the first, last, and middle values in the array
  // and return the largest. The array length will be a least 1.
  def MaxTriple(arr:Array[Int]) : Int =
 {
   Array(arr(0),arr(arr.length-1),arr(arr.length/2)).max
 }

//Given an int array of any length, return a new array of its first 2 elements.
// If the array is smaller than length 2, use whatever elements are present.
 def FrontPiece(arr:Array[Int]) : Array[Int] =
 {
   if(arr.length < 2) arr
   else Array(arr.head,arr.tail.head)
 }

 //We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
  // Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
  def Unlucky1(arr:Array[Int]) : Boolean =
 {
   if(arr.length >= 2)
     if ((arr(0).toString+arr(1).toString == "13") || (arr(arr.length-2).toString+arr(arr.length-1).toString == "13")) true
     else false
   else
     false
 }

  //Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit,
  // the elements from a followed by the elements from b. The arrays may be any length, including 0,
  // but there will be 2 or more elements available between the 2 arrays.
  def Make2(arr1:Array[Int],arr2:Array[Int]) : Array[Int] =
  {
    (arr1 ++ arr2).take(2)
  }

  //Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
  // If either array is length 0, ignore that array.
  def Front11(arr1:Array[Int],arr2:Array[Int]) : Array[Int] =
  {
    (arr1.head.toString+arr2.head.toString).toArray.map(_.toString).map(_.toInt)
  }



}
