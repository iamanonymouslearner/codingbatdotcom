import Warmup1.SumDouble
import org.scalatest.FunSuite

class SumDoubleTest extends FunSuite
{
  test("sumDouble(1, 2)")
  {
    assert(SumDouble.sumDouble(1,2) == 3);
  }

  test("sumDouble(3, 2)")
  {
    assert(SumDouble.sumDouble(3,2) == 5);
  }

  test("sumDouble(12, 2)")
  {
    assert(SumDouble.sumDouble(2,2) == 8);
  }

  test("sumDouble(-1, 0)")
  {
    assert(SumDouble.sumDouble(-1,0) == -1);
  }

  test("sumDouble(3, 3)")
  {
    assert(SumDouble.sumDouble(3,3) == 12);
  }

  test("sumDouble(0, 0)")
  {
    assert(SumDouble.sumDouble(0,0) == 0);
  }

  test("sumDouble(0, 1)")
  {
    assert(SumDouble.sumDouble(0,1) == 1);
  }

  test("sumDouble(3, 4)")
  {
    assert(SumDouble.sumDouble(3,4) == 7);
  }


}
