import Strings.ComboString
import org.scalatest.FunSuite

class ComboStringTest extends FunSuite
{
  test("comboString(\"Hello\", \"hi\")")
  {
    assert(ComboString.comboString("Hello", "hi") == "hiHellohi")
  }
  test("comboString(\"hi\", \"Hello\")")
  {
    assert(ComboString.comboString("hi", "Hello") == "hiHellohi")
  }
  test("comboString(\"aaa\", \"b\")")
  {
    assert(ComboString.comboString("aaa", "b") == "baaab")
  }
  test("comboString(\"b\", \"aaa\")")
  {
    assert(ComboString.comboString("b", "aaa") == "baaab")
  }
  test("comboString(\"aaa\", \"\")")
  {
    assert(ComboString.comboString("aaa", "") == "aaa")
  }
  test("comboString(\"\", \"bb\")")
  {
    assert(ComboString.comboString("", "bb") == "bb")
  }
  test("comboString(\"aaa\", \"1234\")")
  {
    assert(ComboString.comboString("aaa", "1234") == "aaa1234aaa")
  }

}
