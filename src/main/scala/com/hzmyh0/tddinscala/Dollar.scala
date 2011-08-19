package com.hzmyh0.tddinscala
//import com.hzmyh0.tddinscala.Money

class Dollar (amt: Int, crncy: String) extends Money (amt, crncy) {
  override def times(multiplier: Int) : Money = new Money(amount * multiplier, currency)
}