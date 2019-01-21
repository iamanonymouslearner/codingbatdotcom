import Strings.WithOutEnd
import org.scalatest.FunSuite

class WithOutEndTest extends FunSuite
{
  test("withoutEnd(\"Hello\")")
  {
    assert(WithOutEnd.withOutEnd("Hello")=="ell")
  }
  test("withoutEnd(\"coding\")")
  {
    assert(WithOutEnd.withOutEnd("coding")=="odin")
  }
  test("withoutEnd(\"java\")")
  {
    assert(WithOutEnd.withOutEnd("java")=="av")
  }
  test("withoutEnd(\"j\")")
  {
    assert(WithOutEnd.withOutEnd("j")=="")
  }
  test("withoutEnd(\"ja\")")
  {
    assert(WithOutEnd.withOutEnd("ja")=="")
  }
  test("withoutEnd(\"\")")
  {
    assert(WithOutEnd.withOutEnd("")=="")
  }


}
