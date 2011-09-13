package com.hzmyh0.tddinscala

private class Pair(f: String, t: String) {
	private val from: String = f
	private val to: String = t
	
	override def equals(any: Any): Boolean = {
	  val pair: Pair = any.asInstanceOf[Pair]
	  return from.equals(pair.from) && to.equals(pair.to)
	}
	override def hashCode(): Int = 0
}