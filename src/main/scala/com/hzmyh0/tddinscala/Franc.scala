package com.hzmyh0.tddinscala

class Franc (amt: Int, crncy: String) extends Money {
  currencyVal = crncy
  amount = amt
  def times(multiplier: Int) : Money = Money.franc(amount * multiplier)
//  def currency() : String = currencyVal
}