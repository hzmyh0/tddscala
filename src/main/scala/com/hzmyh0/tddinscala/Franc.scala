package com.hzmyh0.tddinscala

class Franc (amt: Int) {
  private val amount = amt
  def times(multiplier: Int) = {new Franc(amount * multiplier)}
  override def equals (other: Any) = {
    other match {
      case that : Franc => this.amount == that.amount
      case _ => false
    }
  }
}