import Warmup1.NearHundred
import org.scalatest.FunSuite

class NearHundredTest extends FunSuite
{
  test("nearHundred(93)")
  {
    assert(NearHundred.nearHundred(93)==true)
  }
  test("nearHundred(90)")
  {
    assert(NearHundred.nearHundred(90)==true)
  }
  test("nearHundred(89)")
  {
    assert(NearHundred.nearHundred(89)==false)
  }
  test("nearHundred(110)")
  {
    assert(NearHundred.nearHundred(110)==true)
  }
  test("nearHundred(111)")
  {
    assert(NearHundred.nearHundred(111)==false)
  }
  test("nearHundred(121)")
  {
    assert(NearHundred.nearHundred(121)==false)
  }
  test("nearHundred(-101)")
  {
    assert(NearHundred.nearHundred(-101)==false)
  }
  test("nearHundred(-209)")
  {
    assert(NearHundred.nearHundred(-209)==false)
  }
  test("nearHundred(190)")
  {
    assert(NearHundred.nearHundred(190)==true)
  }
  test("nearHundred(209)")
  {
    assert(NearHundred.nearHundred(209)==true)
  }
  test("nearHundred(0)")
  {
    assert(NearHundred.nearHundred(0)==false)
  }
  test("nearHundred(5)")
  {
    assert(NearHundred.nearHundred(5)==false)
  }
  test("nearHundred(-50)")
  {
    assert(NearHundred.nearHundred(-50)==false)
  }
  test("nearHundred(191)")
  {
    assert(NearHundred.nearHundred(191)==true)
  }
  test("nearHundred(189)")
  {
    assert(NearHundred.nearHundred(189)==false)
  }
  test("nearHundred(200)")
  {
    assert(NearHundred.nearHundred(200)==true)
  }
  test("nearHundred(210)")
  {
    assert(NearHundred.nearHundred(210)==true)
  }
  test("nearHundred(211)")
  {
    assert(NearHundred.nearHundred(211)==false)
  }
  test("nearHundred(290)")
  {
    assert(NearHundred.nearHundred(290)==false)
  }

}
