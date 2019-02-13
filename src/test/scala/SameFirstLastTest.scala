import org.scalatest.FunSuite

class SameFirstLastTest extends FunSuite
{
   test("sameFirstLast([1, 2, 3])")
  {
    assert(SameFirstLast.sameFirstLast(Array(1,2,3))==false)
  }
  test("sameFirstLast([2, 3, 1])")
  {
    assert(SameFirstLast.sameFirstLast(Array(2,3,1))==false)
  }
  test("sameFirstLast([1, 2, 3, 1])")
  {
    assert(SameFirstLast.sameFirstLast(Array(1, 2, 3, 1))==true)
  }
  test("sameFirstLast([1, 2, 1])")
  {
    assert(SameFirstLast.sameFirstLast(Array(1, 2, 1))==true)
  }
  test("sameFirstLast([])")
  {
    assert(SameFirstLast.sameFirstLast(Array())==false)
  }
}
