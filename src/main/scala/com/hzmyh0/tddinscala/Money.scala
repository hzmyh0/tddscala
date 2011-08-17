package com.hzmyh0.tddinscala

class Money {
	protected var amount: Int = 0
	override def equals (other: Any) = {
    other match {
      case that : Money => this.amount == that.amount && this.getClass().equals(that.getClass())
      case _ => false
    }
  }
}