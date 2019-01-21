import Strings.ExtraEnd
import org.scalatest.FunSuite

class ExtraEndTest extends FunSuite
{
  test("extraEnd(\"Hello\")")
  {
    assert(ExtraEnd.extraEnd("Hello") == "lololo")
  }
  test("extraEnd(\"ab\")")
  {
    assert(ExtraEnd.extraEnd("ab") == "ababab")
  }
  test("extraEnd(\"Hi\")")
  {
    assert(ExtraEnd.extraEnd("Hi") == "HiHiHi")
  }

}
