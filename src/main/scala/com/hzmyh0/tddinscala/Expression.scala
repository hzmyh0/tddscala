package com.hzmyh0.tddinscala

trait Expression {
  def reduce(bank: Bank, to: String): Money
}