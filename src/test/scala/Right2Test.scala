import Strings.Right2
import org.scalatest.FunSuite

class Right2Test extends FunSuite
{
  test("right2(\"Hello\")")
  {
    assert(Right2.right2("Hello") == "loHel")
  }
  test("right2(\"Hi\")")
  {
    assert(Right2.right2("Hi") == "Hi")
  }
  test("right2(\"java\")")
  {
    assert(Right2.right2("java") == "vaja")
  }


}
