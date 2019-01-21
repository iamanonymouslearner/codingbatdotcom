import Strings.MakeTags
import org.scalatest.FunSuite

class MakeTagsTest extends FunSuite
{
  test("makeTags(\"i\", \"Yay\")")
  {
    assert(MakeTags.makeTags("i","Yay") == "<i>Yay</i>")
  }
  test("makeTags(\"i\", \"Hello\")")
  {
    assert(MakeTags.makeTags("i","Hello") == "<i>Hello</i>")
  }
  test("makeTags(\"cite\", \"Yay\")")
  {
    assert(MakeTags.makeTags("cite","Yay") == "<cite>Yay</cite>")
  }
  test("makeTags(\"address\", \"here\")")
  {
    assert(MakeTags.makeTags("address","here") == "<address>here</address>")
  }
  test("makeTags(\"body\", \"Heart\")")
  {
    assert(MakeTags.makeTags("body","Heart") == "<body>Heart</body>")
  }
  test("makeTags(\"i\", \"i\")")
  {
    assert(MakeTags.makeTags("i","i") == "<i>i</i>")
  }
  test("makeTags(\"i\", \"\")")
  {
    assert(MakeTags.makeTags("i","") == "<i></i>")
  }


}
