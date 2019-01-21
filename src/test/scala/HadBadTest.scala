import org.scalatest.FunSuite
import Strings.HadBad

class HadBadTest extends FunSuite
{
  test("hasBad(\"badxx\")")
  {
    assert(HadBad.hasBad("badxx")==true)
  }
  test("hasBad(\"xbadxx\")")
  {
    assert(HadBad.hasBad("xbadxx")==true)
  }
  test("hasBad(\"xba\")")
  {
    assert(HadBad.hasBad("xba")==false)
  }

}
