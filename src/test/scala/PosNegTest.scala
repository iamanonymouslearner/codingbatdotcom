import Warmup1.PosNeg
import org.scalatest.FunSuite

class PosNegTest extends FunSuite
{
  test("posNeg(1, -1, false)")
  {
    assert(PosNeg.posNeg(1,-1,false) == true)
  }
  test("posNeg(-1, 1, false)")
  {
    assert(PosNeg.posNeg(-1,1,false) == true)
  }
  test("posNeg(-4, -5, true)")
  {
    assert(PosNeg.posNeg(-4,-5,true) == true)
  }
  test("posNeg(-4, -5, false)")
  {
    assert(PosNeg.posNeg(-4,-5,false) == false)
  }
  test("posNeg(-4, 5, false)")
  {
    assert(PosNeg.posNeg(-4,5,false) == true)
  }
  test("posNeg(-4, 5, true)")
  {
    assert(PosNeg.posNeg(-4,5,true) == false)
  }
  test("posNeg(1, 1, false)")
  {
    assert(PosNeg.posNeg(1,1,false) == false)
  }
  test("posNeg(-1, -1, false)")
  {
    assert(PosNeg.posNeg(-1,-1,false) == false)
  }
  test("posNeg(1, -1, true)")
  {
    assert(PosNeg.posNeg(1,-1,true) == false)
  }
  test("posNeg(-1, 1, true)")
  {
    assert(PosNeg.posNeg(-1,1,true) == false)
  }
  test("posNeg(1, 1, true)")
  {
    assert(PosNeg.posNeg(1,1,true) == false)
  }
  test("posNeg(-1, -1, true)")
  {
    assert(PosNeg.posNeg(-1,-1,true) == true)
  }
  test("posNeg(5, -5, false)")
  {
    assert(PosNeg.posNeg(5,-5,false) == true)
  }
  test("posNeg(-6, 6, false)")
  {
    assert(PosNeg.posNeg(-6,6,false) == true)
  }
  test("posNeg(-5, -6, false)")
  {
    assert(PosNeg.posNeg(-5,-6,false) == false)
  }
  test("posNeg(-2, -1, false)")
  {
    assert(PosNeg.posNeg(-2,-1,false) == false)
  }
  test("posNeg(1, 2, false)")
  {
    assert(PosNeg.posNeg(1,2,false) == false)
  }
  test("posNeg(-5, 6, true)")
  {
    assert(PosNeg.posNeg(-5,6,true) == false)
  }
  test("posNeg(-5, -5, true)")
  {
    assert(PosNeg.posNeg(-5,-5,true) == true)
  }


}

