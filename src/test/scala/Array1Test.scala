import Array1.Array1
import org.scalatest.FunSuite

class Array1Test extends FunSuite
{
  test("sum3([1, 2, 3])")
  {
    assert(Array1.Sum3(Array(1,2,3))==6)
  }
  test("sum3([5, 11, 2])")
  {
    assert(Array1.Sum3(Array(5,11,2))==18)
  }
  test("sum3([7,0,0])")
  {
    assert(Array1.Sum3(Array(7,0,0))==7)
  }

  //RotateLeft3

  test("rotateLeft3([1, 2, 3])")
  {
    assert(Array1.RotateLeft3(Array(1,2,3)).mkString(",")=="2,3,1")
  }

  test("rotateLeft3([5, 11, 9])")
  {
    assert(Array1.RotateLeft3(Array(5,11,9)).mkString(",")=="11,9,5")
  }

  test("rotateLeft3([7, 0, 0])")
  {
    assert(Array1.RotateLeft3(Array(7,0,0)).mkString(",")=="0,0,7")
  }

  //Reverse3

  test("reverse3([1, 2, 3])")
  {
    assert(Array1.Reverse3(Array(1,2,3)).mkString(",")=="3,2,1")
  }
  test("reverse3([5, 11, 9])")
  {
    assert(Array1.Reverse3(Array(5,11,9)).mkString(",")=="9,11,5")
  }
  test("reverse3([7, 0, 0])")
  {
    assert(Array1.Reverse3(Array(7,0,0)).mkString(",")=="0,0,7")
  }

  //MaxEnd3

  test("maxEnd3([1, 2, 3])")
  {
    assert(Array1.MaxEnd3(Array(1,2,3)).mkString(",") == "3,3,3")
  }
  test("maxEnd3([11, 5, 9])")
  {
    assert(Array1.MaxEnd3(Array(11,5,9)).mkString(",") == "11,11,11")
  }
  test("maxEnd3([2, 11, 3])")
  {
    assert(Array1.MaxEnd3(Array(2,11,3)).mkString(",") == "3,3,3")
  }
  test("maxEnd3([5, 11, 5])")
  {
    assert(Array1.MaxEnd3(Array(5,11,5)).mkString(",") == "5,11,5")
  }

  //Sum2

  test("sum2([1, 2, 3])")
  {
    assert(Array1.Sum2(Array(1,2,3))==3)
  }
  test("sum2([1,1])")
  {
    assert(Array1.Sum2(Array(1,1))==2)
  }
  test("sum2([1,1,1,1])")
  {
    assert(Array1.Sum2(Array(1,1,1,1))==2)
  }
  test("sum2([1,2])")
  {
    assert(Array1.Sum2(Array(1,2))==3)
  }
  test("sum2([1])")
  {
    assert(Array1.Sum2(Array(1))==1)
  }
  test("sum2([])")
  {
    assert(Array1.Sum2(Array())==0)
  }
  test("sum2([4,5,6])")
  {
    assert(Array1.Sum2(Array(4,5,6))==9)
  }
  test("sum2([4])")
  {
    assert(Array1.Sum2(Array(4))==4)
  }

  //MiddleWay
  test("middleWay([1, 2, 3], [4, 5, 6])")
  {
    assert(Array1.MiddleWay(Array(1,2,3),Array(4,5,6)).mkString(",")=="2,5")
  }
  test("middleWay([7, 7, 7], [3, 8, 0])")
  {
    assert(Array1.MiddleWay(Array(7,7,7),Array(3,8,0)).mkString(",")=="7,8")
  }
  test("middleWay([5, 2, 9], [1, 4, 5])")
  {
    assert(Array1.MiddleWay(Array(5,2,9),Array(1,4,5)).mkString(",")=="2,4")
  }
  test("middleWay([1, 9, 7], [4, 8, 8])")
  {
    assert(Array1.MiddleWay(Array(1,9,7),Array(4,8,8)).mkString(",")=="9,8")
  }
  test("middleWay([1, 2, 3], [3, 1, 4])")
  {
    assert(Array1.MiddleWay(Array(1,2,3),Array(3,1,4)).mkString(",")=="2,1")
  }
  test("middleWay([1, 2, 3], [4, 1, 1])")
  {
    assert(Array1.MiddleWay(Array(1,2,3),Array(4,1,1)).mkString(",")=="2,1")
  }

  //MakeEnds

  test("makeEnds([1, 2, 3])")
  {
    assert(Array1.MakeEnds(Array(1,2,3)).mkString(",")=="1,3")
  }
  test("makeEnds([1, 2, 3,4])")
  {
    assert(Array1.MakeEnds(Array(1,2,3,4)).mkString(",")=="1,4")
  }
  test("makeEnds([7, 4, 6,2])")
  {
    assert(Array1.MakeEnds(Array(7,4,6,2)).mkString(",")=="7,2")
  }
  test("makeEnds([1, 2, 2, 2, 2, 2, 2, 3])")
  {
    assert(Array1.MakeEnds(Array(1, 2, 2, 2, 2, 2, 2, 3)).mkString(",")=="1,3")
  }
  test("makeEnds([7,4])")
  {
    assert(Array1.MakeEnds(Array(7,4)).mkString(",")=="7,4")
  }
  test("makeEnds([7])")
  {
    assert(Array1.MakeEnds(Array(7)).mkString(",")=="7,7")
  }
  test("makeEnds([5,2,9])")
  {
    assert(Array1.MakeEnds(Array(5,2,9)).mkString(",")=="5,9")
  }
  test("makeEnds([2,3,4,1])")
  {
    assert(Array1.MakeEnds(Array(2,3,4,1)).mkString(",")=="2,1")
  }

  //Has23
  test("has23([2, 5])")
  {
    assert(Array1.Has23(Array(2,5))==true)
  }
  test("has23([4, 3])")
  {
    assert(Array1.Has23(Array(4,3))==true)
  }
  test("has23([4, 5])")
  {
    assert(Array1.Has23(Array(4,5))==false)
  }
  test("has23([2, 2])")
  {
    assert(Array1.Has23(Array(2,2))==true)
  }
  test("has23([3, 2])")
  {
    assert(Array1.Has23(Array(3,2))==true)
  }
  test("has23([3, 3])")
  {
    assert(Array1.Has23(Array(3,3))==true)
  }
  test("has23([7, 7])")
  {
    assert(Array1.Has23(Array(7,7))==false)
  }
  test("has23([3, 9])")
  {
    assert(Array1.Has23(Array(3,9))==true)
  }
  test("has23([9,5])")
  {
    assert(Array1.Has23(Array(9,5))==false)
  }

  //MakeLast
  test("makeLast([4, 5, 6])")
  {
    assert(Array1.MakeLast(Array(4,5,6)).mkString(",")=="0,0,0,0,0,6")
  }
  test("makeLast([1, 2])")
  {
    assert(Array1.MakeLast(Array(1, 2)).mkString(",") == "0,0,0,2")
  }
  test("makeLast([3])")
  {
    assert(Array1.MakeLast(Array(3)).mkString(",") == "0,3")
  }
  test("makeLast([0])")
  {
    assert(Array1.MakeLast(Array(0)).mkString(",") == "0,0")
  }
  test("makeLast([7, 7, 7])")
  {
    assert(Array1.MakeLast(Array(7,7,7)).mkString(",") == "0,0,0,0,0,7")
  }
  test("makeLast([3, 1, 4])")
  {
    assert(Array1.MakeLast(Array(3,1,4)).mkString(",") == "0,0,0,0,0,4")
  }
  test("makeLast([1, 2, 3, 4])")
  {
    assert(Array1.MakeLast(Array(1,2,3,4)).mkString(",") == "0,0,0,0,0,0,0,4")
  }
  test("makeLast([1, 2, 3, 0])")
  {
    assert(Array1.MakeLast(Array(1,2,3,0)).mkString(",") == "0,0,0,0,0,0,0,0")
  }
  test("makeLast([2, 4])")
  {
    assert(Array1.MakeLast(Array(2,4)).mkString(",") == "0,0,0,4")
  }

  //Double23
  test("double23([2, 2,2])")
  {
    assert(Array1.Double23(Array(2,2))==true)
  }

  //Fix23
  test("fix23([1, 2, 3]))")
  {
    assert(Array1.Fix23(Array(1,2,3)).mkString(",")=="1,2,0")
  }

  //Start1
  test("start1([1, 2, 3], [1, 3])")
  {
    assert(Array1.Start1(Array(1,2,3),Array(1,3))==2)
  }
  test("start1([7, 2, 3], [1])")
  {
    assert(Array1.Start1(Array(7,2,3),Array(1))==1)
  }
  test("start1([1, 2], []) ")
  {
    assert(Array1.Start1(Array(1,2),Array())==1)
  }

  //biggerTwo
  test("biggerTwo([1, 2], [3, 4]) ")
  {
    assert(Array1.BiggerTwo(Array(1,2),Array(3,4)).mkString(",")=="3,4")
  }
  test("biggerTwo([3, 4], [1, 2]) ")
  {
    assert(Array1.BiggerTwo(Array(3,4),Array(1,2)).mkString(",")=="3,4")
  }
  test("biggerTwo([1, 1], [1, 2]) ")
  {
    assert(Array1.BiggerTwo(Array(1,1),Array(1,2)).mkString(",")=="1,2")
  }
  test("biggerTwo([2, 2], [1, 3])")
  {
    assert(Array1.BiggerTwo(Array(2,2),Array(1,3)).mkString(",")=="2,2")
  }
  test("biggerTwo([1, 3], [2, 2])")
  {
    assert(Array1.BiggerTwo(Array(1,3),Array(2,2)).mkString(",")=="1,3")
  }

  //MakeMiddle
  test("makeMiddle([1, 2, 3, 4])")
  {
    assert(Array1.MakeMiddle(Array(1,2,3,4)).mkString(",")=="2,3")
  }
  test("makeMiddle([7, 1, 2, 3, 4, 9])")
  {
    assert(Array1.MakeMiddle(Array(7,1,2,3,4,9)).mkString(",")=="2,3")
  }
  test("makeMiddle([1, 2])")
  {
    assert(Array1.MakeMiddle(Array(1,2)).mkString(",")=="1,2")
  }

  //plusTwo
  test("plusTwo([1, 2], [3, 4])")
  {
    assert(Array1.plusTwo(Array(1,2),Array(3,4)).mkString(",")=="1,2,3,4")
  }
  test("plusTwo([4, 4], [2, 2])")
  {
    assert(Array1.plusTwo(Array(4,4),Array(2,2)).mkString(",")=="4,4,2,2")
  }
  test("plusTwo([9, 2], [3, 4])")
  {
    assert(Array1.plusTwo(Array(9,2),Array(3,4)).mkString(",")=="9,2,3,4")
  }

  //swapEnds
  test("swapEnds([1, 2, 3, 4])")
  {
    assert(Array1.SwapEnds(Array(1,2,3,4)).mkString(",")=="4,2,3,1")
  }

  //midThree
  test("midThree([1, 2, 3, 4, 5])")
  {
    assert(Array1.MidThree(Array(1,2,3,4,5)).mkString(",")=="2,3,4")
  }
  test("midThree([8, 6, 7, 5, 3, 0, 9])")
  {
    assert(Array1.MidThree(Array(8,6,7,5,3,0,9)).mkString(",")=="7,5,3")
  }

  //unlucky1
  test("unlucky1([1, 3, 4, 5])")
  {
    assert(Array1.Unlucky1(Array(1,3,4,5))==true)
  }
  test("unlucky1([2, 1, 3, 4, 5])")
  {
    assert(Array1.Unlucky1(Array(2,1,3,4,5))==false)
  }
  test("unlucky1([1, 1, 1])")
  {
    assert(Array1.Unlucky1(Array(1,1,1))==false)
  }
  test("unlucky1([])")
  {
    assert(Array1.Unlucky1(Array())==false)
  }
  test("unlucky1([1, 2, 3, 4, 1, 3]) ")
  {
    assert(Array1.Unlucky1(Array(1,2,3,4,1,3))==true)
  }

}
