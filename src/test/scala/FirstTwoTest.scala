import Strings.FirstTwo
import org.scalatest.FunSuite

class FirstTwoTest extends FunSuite
{
  test("firstTwo(\"Hello\") ")
  {
    assert(FirstTwo.firstTwo("Hello") == "He")
  }
  test("firstTwo(\"abcdefg\") ")
  {
    assert(FirstTwo.firstTwo("abcdefg") == "ab")
  }
  test("firstTwo(\"ab\") ")
  {
    assert(FirstTwo.firstTwo("ab") == "ab")
  }
  test("firstTwo(\"a\") ")
  {
    assert(FirstTwo.firstTwo("a") == "a")
  }
  test("firstTwo(\"\") ")
  {
    assert(FirstTwo.firstTwo("") == "")
  }

}
