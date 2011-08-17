package com.hzmyh0.tddinscala

class Franc (amt: Int) extends Money {
  amount = amt
  def times(multiplier: Int) = {new Franc(amount * multiplier)}
}