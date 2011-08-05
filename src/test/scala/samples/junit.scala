package samples

import org.junit._
import Assert._
import com.hzmyh0.tddinscala.Dollar

@Test
class AppTest {

    @Test
    def testOK() = assertTrue(true)
    
    @Test
    def testMultiplication() = {
      val five: Dollar = new Dollar(5)
      var product = five.times(2)
      assertEquals(10, product.amount)
      product = five.times(3)
      assertEquals(15, product.amount)
    }
    
    @Test
    def testEquality() = {
      assertTrue(new Dollar(5).equals(new Dollar(5)))
    }

//    @Test
//    def testKO() = assertTrue(false)

}


