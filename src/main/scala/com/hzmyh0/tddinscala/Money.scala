package com.hzmyh0.tddinscala

abstract class Money(amt: Int, crncy: String) {
	protected var amount: Int = amt
	protected var currencyVal: String = crncy
	def times(multiplier: Int) : Money
	def currency() = currencyVal
	override def equals (other: Any) = {
    other match {
      case that : Money => this.amount == that.amount && this.getClass().equals(that.getClass())
      case _ => false
    }
  }
}

object Money {
  def dollar(amount: Int) : Money = new Dollar(amount, "USD")
  def franc(amount: Int) : Money = new Franc(amount, "CHF")
}