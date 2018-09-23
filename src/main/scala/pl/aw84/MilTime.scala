package pl.aw84

class MilTime private(val time: Int) extends AnyVal {
  def minutes = time % 100

  def hours = time / 100

  override def toString = f"$time%04d"
}

object MilTime {
  def apply(time: Int) = { new MilTime(time)}
}