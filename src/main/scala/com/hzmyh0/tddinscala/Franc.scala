package com.hzmyh0.tddinscala

class Franc (amt: Int) extends Money {
  private val currencyVal = "CHF"
  amount = amt
  def times(multiplier: Int) : Money = {new Franc(amount * multiplier)}
  def currency() : String = currencyVal
}