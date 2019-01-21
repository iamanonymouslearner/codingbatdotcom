import Warmup1.Makes10
import org.scalatest.FunSuite

class Makes10Test extends FunSuite
{
  test("makes10(9, 10)")
  {
    assert(Makes10.makes10(9,10) == true)
  }

  test("makes10(9, 9)")
  {
    assert(Makes10.makes10(9,9) == false)
  }

  test("makes10(1, 9)")
  {
    assert(Makes10.makes10(1,9) == true)
  }

  test("makes10(10, 1)")
  {
    assert(Makes10.makes10(10,1) == true)
  }

  test("makes10(10, 10)")
  {
    assert(Makes10.makes10(10,10) == true)
  }

  test("makes10(8, 2)")
  {
    assert(Makes10.makes10(8,2) == true)
  }

  test("makes10(8, 3)")
  {
    assert(Makes10.makes10(8,3) == false)
  }

  test("makes10(10, 42)")
  {
    assert(Makes10.makes10(10,42) == true)
  }

  test("makes10(12, -2)")
  {
    assert(Makes10.makes10(12,-2) == true)
  }


}
