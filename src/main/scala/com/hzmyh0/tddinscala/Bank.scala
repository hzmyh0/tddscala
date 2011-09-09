package com.hzmyh0.tddinscala

class Bank {
	def reduce(source: Expression, to: String): Money = {
	  val sum: Sum = source.asInstanceOf[Sum]
//	  val amount: Int = sum.augend.amount + sum.addend.amount
//		return new Money(amount, to)
	  return sum.reduce(to)
	}
}