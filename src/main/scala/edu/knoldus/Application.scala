package edu.knoldus

import org.apache.log4j.Logger

object Application extends App {

  val a = 1
  val b = 2
  //val c = null

  val log = Logger.getLogger(this.getClass)
  val point1 = new Point(a,b)
  val point2 = new Point(a,b)
  val point3 = new ColoredPoint(a,b,Color.Blue)
  val point5 = new ColoredPoint(a,a,Color.Blue){override  val y = 2 }
  val point4 = new ColoredPoint(a,a,Color.Red){override val y = 2
                                               override val color = Color.Blue}
  log.info(point1.equals(point1) + "\n")
  log.info(point1.equals(point2) + "\n")
  log.info(point2.equals(point1) + "\n")
  log.info(point3.equals(point1) + "\n")
  //log.info(point1.equals(null))
  log.info(point4.equals(point3) + "\n")
  log.info(point5.equals(point4) + "\n")
}



