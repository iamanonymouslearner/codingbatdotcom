import org.scalatest.FunSuite

class CommonEndTest extends FunSuite
{
  test("commonEnd([1, 2, 3], [7, 3])")
  {
    assert(CommonEnd.commonEnd(Array(1, 2, 3),Array(7, 3))==true)
  }
  test("commonEnd([1, 2, 3], [7, 3, 2])")
  {
    assert(CommonEnd.commonEnd(Array(1, 2, 3),Array(7, 3, 2))==false)
  }
  test("commonEnd([1, 2, 3], [1, 3])")
  {
    assert(CommonEnd.commonEnd(Array(1, 2, 3),Array(1,3))==true)
  }

}
