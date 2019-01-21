import Warmup1.Diff21
import org.scalatest.FunSuite

class Diff21Test extends FunSuite
{
  test("diff21(19)")
  {
    assert(Diff21.diff21(19)==2)
  }
  test("diff21(10)")
  {
    assert(Diff21.diff21(10)==11)
  }
  test("diff21(21)")
  {
    assert(Diff21.diff21(21)==0)
  }
  test("diff21(22)")
  {
    assert(Diff21.diff21(22)==2)
  }
  test("diff21(25)")
  {
    assert(Diff21.diff21(25)==8)
  }
  test("diff21(30)")
  {
    assert(Diff21.diff21(30)==18)
  }
  test("diff21(0)")
  {
    assert(Diff21.diff21(0)==21)
  }
  test("diff21(1)")
  {
    assert(Diff21.diff21(1)==20)
  }
  test("diff21(2)")
  {
    assert(Diff21.diff21(2)==19)
  }
  test("diff21(-1)")
  {
    assert(Diff21.diff21(-1)==22)
  }
  test("diff21(-2)")
  {
    assert(Diff21.diff21(-2)==23)
  }
  test("diff21(50)")
  {
    assert(Diff21.diff21(50)==58)
  }

}
