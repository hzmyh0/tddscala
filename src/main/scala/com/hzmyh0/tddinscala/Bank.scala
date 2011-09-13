package com.hzmyh0.tddinscala

class Bank() {
	def reduce(source: Expression, to: String): Money = {
			source.reduce(this, to)
	}
	def rate(from: String, to: String): Int = {
	  if (from.equals("CHF") && to.equals("USD")) 2 else 1
	}
}