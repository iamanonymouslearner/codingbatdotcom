import Strings.MakeOutWord
import org.scalatest.FunSuite

class MakeOutWordTest extends FunSuite
{
  test("makeOutWord(\"<<>>\", \"Yay\")")
  {
    assert(MakeOutWord.makeOutWord("<<>>", "Yay") == "<<Yay>>")
  }
  test("makeOutWord(\"[[]]\", \"word\")")
  {
    assert(MakeOutWord.makeOutWord("[[]]", "word") == "[[word]]")
  }
  test("makeOutWord(\"HHoo\", \"Hello\")")
  {
    assert(MakeOutWord.makeOutWord("HHoo", "Hello") == "HHHellooo")
  }
  test("makeOutWord(\"\", \"Hello\")")
  {
    assert(MakeOutWord.makeOutWord("", "Hello") == "Hello")
  }

}
