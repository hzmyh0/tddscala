package com.hzmyh0.tddinscala

class Sum (agend: Money, addnd: Money) extends Expression {
	val augend: Money = agend
	val addend: Money = addnd
	def reduce(bank: Bank, to: String): Money = {
	  val amount: Int = augend.amount + addend.amount
	  return new Money(amount, to)
	}
}