package com.hzmyh0.tddinscala
//import com.hzmyh0.tddinscala.Money

class Dollar (amt: Int, crncy: String) extends Money (amt, crncy) {
  def times(multiplier: Int) : Money = new Dollar(amount * multiplier, currency)
}