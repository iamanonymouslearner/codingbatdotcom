import org.scalatest.FunSuite

class MakePiTest extends FunSuite
{
  test("makePi() → [3, 1, 4]")
  {
    assert(MakePi.makePi().mkString=="314")
  }

}
