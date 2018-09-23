import org.scalatest.FlatSpec
import pl.aw84.MilTime
class MilTimeTest extends FlatSpec {
  "pl.aw84.MilTime object" should "take hours >= 0" in {
    val mt:MilTime = pl.aw84.MilTime.apply(1020)
    assert(mt.hours == 10)
  }
  "pl.aw84.MilTime object" should "take hours <= 24" in {
    val mt:MilTime = MilTime.apply(2520)
    assert(mt.hours == 10)
  }
}
