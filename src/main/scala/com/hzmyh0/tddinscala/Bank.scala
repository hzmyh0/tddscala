package com.hzmyh0.tddinscala
import scala.collection.mutable.HashMap

class Bank() {
	var rates: HashMap[Pair, Int] = HashMap[Pair, Int]()
	def reduce(source: Expression, to: String): Money = {
			source.reduce(this, to)
	}
	def rate(from: String, to: String): Int = {
	  if (from.equals("CHF") && to.equals("USD")) 2 else 1
	}
}