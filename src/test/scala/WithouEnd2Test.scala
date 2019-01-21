import Strings.WithouEnd2
import org.scalatest.FunSuite

class WithouEnd2Test extends FunSuite
{
  test("withouEnd2(\"Hello\")")
  {
    assert(WithouEnd2.withouEnd2("Hello")=="ell")
  }
  test("withouEnd2(\"abc\")")
  {
    assert(WithouEnd2.withouEnd2("abc")=="b")
  }
  test("withouEnd2(\"ab\")")
  {
    assert(WithouEnd2.withouEnd2("ab")=="")
  }

}
