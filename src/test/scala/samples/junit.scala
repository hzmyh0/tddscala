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
    def testFrancMultiplication() = {
      val five: Franc = new Franc(5)
      assertEquals(new Franc(10), five.times(2))
      assertEquals(new Franc(15), five.times(3))
    }
    
    @Test
    def testEquality() = {
      assertTrue(Money.dollar(5) == Money.dollar(5))
      assertFalse(Money.dollar(5) == Money.dollar(6))
      assertTrue(new Franc(5) == new Franc(5))
      assertFalse(new Franc(5) == new Franc(6))
      assertFalse(new Franc(5) == Money.dollar(5))
    }
    
    @Test
    def testCurrency() = {
      assertEquals("USD", Money.dollar(1).currency())
      assertEquals("CHF", Money.franc(1).currency())
    }

//    @Test
//    def testKO() = assertTrue(false)

}


