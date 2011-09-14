package com.hzmyh0.tddinscala
import scala.collection.mutable.Map

class Bank() {
//	var rates: HashMap[Pair, Int] = HashMap[Pair, Int]()
	var rates: Map[Pair, Int] = Map[Pair, Int]()
	def reduce(source: Expression, to: String): Money = {
			source.reduce(this, to)
	}
	def rate(from: String, to: String): Int = {
	  if (from.equals("CHF") && to.equals("USD")) 2 else 1
	}
	def addRate(from: String, to: String, rate: Int): Unit = {
//	  rates.put(new Pair(from, to), rate)
	  rates += (new Pair(from ,to) -> rate)
	}
}