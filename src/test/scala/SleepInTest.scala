import org.scalatest.FunSuite
import Warmup1.SleepIn

class SleepTest extends FunSuite
{
  test("sleepIn(false, false)")
  {
    assert(SleepIn.Sleep(false,false)==true)
  }

  test("sleepIn(true, false)")
  {
    assert(SleepIn.Sleep(true,false)==false)
  }

  test("sleepIn(false, true)")
  {
    assert(SleepIn.Sleep(false,true)==true)
  }

  test("sleepIn(true, true)")
  {
    assert(SleepIn.Sleep(true,true)==true)
  }

}
