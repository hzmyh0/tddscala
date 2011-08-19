package com.hzmyh0.tddinscala

class Franc (amt: Int, crncy: String) extends Money (amt, crncy) {
  def times(multiplier: Int) : Money = Money.franc(amount * multiplier)
}