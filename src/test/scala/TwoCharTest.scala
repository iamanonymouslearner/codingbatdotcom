import Strings.TwoChar
import org.scalatest.FunSuite

class TwoCharTest extends FunSuite
{
  test("twoChar(\"java\", 0)")
  {
    assert(TwoChar.twoChar("java", 0)=="ja")
  }
  test("twoChar(\"java\", 2)")
  {
    assert(TwoChar.twoChar("java", 2)=="va")
  }
  test("twoChar(\"java\", 3)")
  {
    assert(TwoChar.twoChar("java", 3)=="ja")
  }
  test("twoChar(\"java\", 4)")
  {
    assert(TwoChar.twoChar("java", 4)=="ja")
  }
  test("twoChar(\"java\", -1)")
  {
    assert(TwoChar.twoChar("java", -1)=="ja")
  }
  test("twoChar(\"Hello\", 0)")
  {
    assert(TwoChar.twoChar("Hello", 0)=="He")
  }
  test("twoChar(\"Hello\", 1)")
  {
    assert(TwoChar.twoChar("Hello", 1)=="el")
  }
  test("twoChar(\"Hello\", 99)")
  {
    assert(TwoChar.twoChar("Hello", 99)=="He")
  }
  test("twoChar(\"Hello\", 3)")
  {
    assert(TwoChar.twoChar("Hello", 3)=="lo")
  }
  test("twoChar(\"Hello\", 4)")
  {
    assert(TwoChar.twoChar("Hello", 4)=="He")
  }
  test("twoChar(\"Hello\", 5)")
  {
    assert(TwoChar.twoChar("Hello", 5)=="He")
  }
  test("twoChar(\"Hello\", -7)")
  {
    assert(TwoChar.twoChar("Hello", -7)=="He")
  }
  test("twoChar(\"Hello\", 6)")
  {
    assert(TwoChar.twoChar("Hello", 6)=="He")
  }
  test("twoChar(\"Hello\", -1)")
  {
    assert(TwoChar.twoChar("Hello", -1)=="He")
  }
  test("twoChar(\"yay\", 0)")
  {
    assert(TwoChar.twoChar("yay", 0)=="ya")
  }

}
