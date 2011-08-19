package com.hzmyh0.tddinscala

class Franc (amt: Int, crncy: String) extends Money (amt, crncy) {
  override def times(multiplier: Int) : Money = new Money(amount * multiplier, currency)
}