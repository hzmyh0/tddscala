package com.hzmyh0.tddinscala
//import com.hzmyh0.tddinscala.Money

class Dollar (amt: Int) extends Money {
  private val amount = amt
  def times(multiplier: Int) = {new Dollar(amount * multiplier)}
  override def equals (other: Any) = {
    other match {
      case that : Dollar => this.amount == that.amount
      case _ => false
    }
  }
}