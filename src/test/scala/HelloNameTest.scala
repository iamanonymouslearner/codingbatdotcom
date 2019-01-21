import org.scalatest.FunSuite

class HelloNameTest extends FunSuite
{
  test("helloName(\"Bob\")")
  {
    assert(HelloName.helloName("Bob")=="Hello Bob!")
  }
  test("helloName(\"Alice\")")
  {
    assert(HelloName.helloName("Alice")=="Hello Alice!")
  }
  test("helloName(\"X\")")
  {
    assert(HelloName.helloName("X")=="Hello X!")
  }
  test("helloName(\"Dolly\")")
  {
    assert(HelloName.helloName("Dolly")=="Hello Dolly!")
  }
  test("helloName(\"Alpha\")")
  {
    assert(HelloName.helloName("Alpha")=="Hello Alpha!")
  }
  test("helloName(\"Omega\")")
  {
    assert(HelloName.helloName("Omega")=="Hello Omega!")
  }
  test("helloName(\"Goodbye\")")
  {
    assert(HelloName.helloName("Goodbye")=="Hello Goodbye!")
  }
  test("helloName(\"ho ho ho\")")
  {
    assert(HelloName.helloName("ho ho ho")=="Hello ho ho ho!")
  }
  test("helloName(\"xyz!\")")
  {
    assert(HelloName.helloName("xyz!")=="Hello xyz!!")
  }
  test("helloName(\"Hello\")")
  {
    assert(HelloName.helloName("Hello")=="Hello Hello!")
  }
}