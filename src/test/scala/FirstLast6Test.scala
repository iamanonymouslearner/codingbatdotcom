import Array1.FirstLast6
import org.scalatest.FunSuite

class FirstLast6Test extends FunSuite
{
  test("firstLast6([1, 2, 6])")
  {
    assert(FirstLast6.firstLast6(Array(1,2,6))==true)
  }
  test("firstLast6([6, 1, 2, 3])")
  {
    assert(FirstLast6.firstLast6(Array(6,1,2,3))==true)
  }
  test("firstLast6([13, 6, 1, 2, 3])")
  {
    assert(FirstLast6.firstLast6(Array(13, 6, 1, 2, 3))==false)
  }

}
