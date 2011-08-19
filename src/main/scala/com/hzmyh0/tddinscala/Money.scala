package com.hzmyh0.tddinscala

abstract class Money {
	protected var amount: Int = 0
	def times(multiplier: Int) : Money
	def currency() : String
	override def equals (other: Any) = {
    other match {
      case that : Money => this.amount == that.amount && this.getClass().equals(that.getClass())
      case _ => false
    }
  }
}

object Money {
  def dollar(amount: Int) : Money = new Dollar(amount)
  def franc(amount: Int) : Money = new Franc(amount)
}