package com.hzmyh0.tddinscala
//import com.hzmyh0.tddinscala.Money

class Dollar (amt: Int) extends Money {
  amount = amt
  def times(multiplier: Int) = {new Dollar(amount * multiplier)}
}