package com.hzmyh0.tddinscala

trait Expression {
  def reduce(to: String): Money
}