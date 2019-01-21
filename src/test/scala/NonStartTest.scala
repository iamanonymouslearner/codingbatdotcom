import Strings.NonStart
import org.scalatest.FunSuite

class NonStartTest extends FunSuite
{
  test("nonStart(\"shotl\", \"java\")")
  {
    assert(NonStart.nonStart("shotl", "java") == "hotlava")
  }

}
