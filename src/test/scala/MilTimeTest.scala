import org.scalatest.FlatSpec
class MilTimeTest extends FlatSpec {
  "MilTime object" should "take hours >= 0" in {
    val mt:MilTime = MilTime.apply(1020)
    assert(mt.hours == 10)
  }
  "MilTime object" should "take hours <= 24" in {
    val mt:MilTime = MilTime.apply(2520)
    assert(mt.hours == 10)
  }
}
