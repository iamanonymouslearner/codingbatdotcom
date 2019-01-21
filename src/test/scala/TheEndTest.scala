import Strings.TheEnd
import org.scalatest.FunSuite

class TheEndTest extends FunSuite
{
  test("theEnd(\"Hello\", true)")
  {
    assert(TheEnd.theEnd("Hello", true)=="H")
  }
  test("theEnd(\"Hello\", false)")
  {
    assert(TheEnd.theEnd("Hello", false)=="o")
  }
  test("theEnd(\"oh\", true)")
  {
    assert(TheEnd.theEnd("oh", true)=="o")
  }
  test("theEnd(\"oh\", false)")
  {
    assert(TheEnd.theEnd("oh", false)=="h")
  }
  test("theEnd(\"x\", true)")
  {
    assert(TheEnd.theEnd("x", true)=="x")
  }
  test("theEnd(\"x\", false)")
  {
    assert(TheEnd.theEnd("x", false)=="x")
  }
  test("theEnd(\"java\", true)")
  {
    assert(TheEnd.theEnd("java", true)=="j")
  }
  test("theEnd(\"chocolate\", false)")
  {
    assert(TheEnd.theEnd("chocolate", false)=="e")
  }
  test("theEnd(\"1234\", true)")
  {
    assert(TheEnd.theEnd("1234", true)=="1")
  }
  test("theEnd(\"code\", false)")
  {
    assert(TheEnd.theEnd("code", false)=="e")
  }

}
