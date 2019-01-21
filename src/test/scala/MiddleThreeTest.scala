import Strings.MiddleThree
import org.scalatest.FunSuite

class MiddleThreeTest extends FunSuite
{
  test("middleThree(\"Candy\")")
  {
    assert(MiddleThree.middleThree("Candy")=="and")
  }
  test("middleThree(\"and\")")
  {
    assert(MiddleThree.middleThree("and")=="and")
  }
  test("middleThree(\"solving\")")
  {
    assert(MiddleThree.middleThree("solving")=="lvi")
  }
  test("middleThree(\"Hi yet Hi\")")
  {
    assert(MiddleThree.middleThree("Hi yet Hi")=="yet")
  }
  test("middleThree(\"java yet java\")")
  {
    assert(MiddleThree.middleThree("java yet java")=="yet")
  }
  test("middleThree(\"Chocolate\")")
  {
    assert(MiddleThree.middleThree("Chocolate")=="col")
  }
  test("middleThree(\"XabcxyzabcX\")")
  {
    assert(MiddleThree.middleThree("XabcxyzabcX")=="xyz")
  }

}
