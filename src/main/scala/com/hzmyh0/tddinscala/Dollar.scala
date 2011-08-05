package com.hzmyh0.tddinscala

class Dollar (amt: Int) {
  var amount = amt
  def times(multiplier: Int) = {new Dollar(amount * multiplier)}
  override def equals (other: Any) = {
    other match {
      case that : Dollar => this.amount == that.amount
      case _ => false
    }
  }
}