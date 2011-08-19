package com.hzmyh0.tddinscala

class Franc (amt: Int, crncy: String) extends Money {
  currencyVal = "CHF"
  amount = amt
  def times(multiplier: Int) : Money = {new Franc(amount * multiplier, null)}
//  def currency() : String = currencyVal
}