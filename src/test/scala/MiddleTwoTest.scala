import Strings.MiddleTwo
import org.scalatest.FunSuite

class MiddleTwoTest extends FunSuite
{
  test("middleTwo(\"string\")")
  {
    assert(MiddleTwo.middleTwo("string")=="ri")
  }
  test("middleTwo(\"code\")")
  {
    assert(MiddleTwo.middleTwo("code")=="od")
  }
  test("middleTwo(\"Practice\")")
  {
    assert(MiddleTwo.middleTwo("Practice")=="ct")
  }

}
