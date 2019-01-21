import Strings.Left2
import org.scalatest.FunSuite

class Left2Test extends FunSuite
{
  test("left2(\"Hello\")")
  {
    assert(Left2.left2("Hello") == "lloHe")
  }
  test("left2(\"Hi\")")
  {
    assert(Left2.left2("Hi") == "Hi")
  }

}
