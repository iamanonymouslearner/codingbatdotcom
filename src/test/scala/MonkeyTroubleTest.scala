import Warmup1.MonkeyTrouble
import org.scalatest.FunSuite

class MonkeyTroubleTest extends FunSuite
{
  test("monkeyTrouble(true, true)")
  {
    assert(MonkeyTrouble.monkeyTrouble(true,true) == true)
  }

  test("monkeyTrouble(false, false)")
  {
    assert(MonkeyTrouble.monkeyTrouble(false,false) == true)
  }

  test("monkeyTrouble(true, false)")
  {
    assert(MonkeyTrouble.monkeyTrouble(true,false) == false)
  }

  test("monkeyTrouble(false, true)")
  {
    assert(MonkeyTrouble.monkeyTrouble(false,true) == false)
  }

}
