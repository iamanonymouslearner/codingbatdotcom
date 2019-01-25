import Assignments.LinearSearch
import org.scalatest.FunSuite

class LinearSearchTest extends FunSuite
{
  test("Value found in list")
  {
    assert(LinearSearch.linearSearch(List(1, 4, 6, 7, 8, 9), 7) == 4)
  }
  test("Value not found in list")
  {
    assert(LinearSearch.linearSearch(List(1, 4, 6, 7, 8, 9), 10) == -1)
  }

}
