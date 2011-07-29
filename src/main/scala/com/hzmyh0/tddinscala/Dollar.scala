package com.hzmyh0.tddinscala

class Dollar (amt: Int) {
  var amount = amt
  def times(multiplier: Int) = {amount = amount * multiplier}
}