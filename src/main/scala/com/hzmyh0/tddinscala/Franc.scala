package com.hzmyh0.tddinscala

class Franc (amt: Int, crncy: String) extends Money (amt, crncy) {
  def times(multiplier: Int) : Money = new Franc(amount * multiplier, currency)
}