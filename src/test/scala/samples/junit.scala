package samples

import org.junit._
import Assert._
import com.hzmyh0.tddinscala._

@Test
class AppTest {

    @Test
    def testOK() = assertTrue(true)
    
    @Test
    def testMultiplication() = {
      val five: Money = Money.dollar(5)
      assertEquals(Money.dollar(10), five.times(2))
      assertEquals(Money.dollar(15), five.times(3))
    }
    
    @Test
    def testEquality() = {
      assertTrue(Money.dollar(5) == Money.dollar(5))
      assertFalse(Money.dollar(5) == Money.dollar(6))
      assertFalse(Money.franc(5) == Money.dollar(5))
    }
    
    @Test
    def testCurrency() = {
      assertEquals("USD", Money.dollar(1).currency())
      assertEquals("CHF", Money.franc(1).currency())
    }

    @Test
    def testSimpleAddition() = {
      val five: Money = Money.dollar(5)
      val sum: Expression = five.plus(five)
      val bank: Bank = new Bank()
      val reduced: Money = bank.reduce(sum, "USD")
      assertEquals(Money.dollar(10), reduced)
    }

    @Test
    def testPlusReturnsSum() = {
      val five: Money = Money.dollar(5)
      val result: Expression = five.plus(five)
      val sum: Sum = result.asInstanceOf[Sum]
      assertEquals(five, sum.augend)
      assertEquals(five, sum.addend)
    }
    
    @Test
    def testReduceSum() = {
      val sum: Expression = new Sum(Money.dollar(3), Money.dollar(4))
      val bank: Bank = new Bank()
      val result: Money = bank.reduce(sum, "USD")
      assertEquals(Money.dollar(7), result)
    }
}


