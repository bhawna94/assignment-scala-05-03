package edu.knoldus

class ColoredPoint(x: Int, y: Int, val color: Color.Value)
  extends Point(x, y) {

  override def hashCode: Int= (super.hashCode, color).##

  override def equals(other: Any):Boolean = other match {

    case that: ColoredPoint =>
      (that canEqual this) &&
        super.equals(that) && this.color == that.color
    case _ =>
      false
  }

  override def canEqual(other: Any): Boolean = other.isInstanceOf[ColoredPoint]
}

