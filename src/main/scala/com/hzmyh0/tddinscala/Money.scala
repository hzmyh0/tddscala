package com.hzmyh0.tddinscala

class Money(amt: Int, crncy: String) extends Expression {
/*	protected*/ var amount: Int = amt
	protected var currencyVal: String = crncy
	def times(multiplier: Int) = new Money(amount * multiplier, currency)
	def currency() = currencyVal
	override def equals (other: Any) = {
    other match {
      case that : Money => this.amount == that.amount && currency() == that.currency()
      case _ => false
    	}
  	}
	override def toString() : String = amount + " " + currency
	def plus(addend: Money): Expression = new Sum(this, addend)
	def reduce(to: String): Money = this
}

object Money {
  def dollar(amount: Int) : Money = new Money(amount, "USD")
  def franc(amount: Int) : Money = new Money(amount, "CHF")
}