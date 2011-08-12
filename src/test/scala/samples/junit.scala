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
      assertEquals(new Dollar(10), five.times(2))
      assertEquals(new Dollar(15), five.times(3))
    }
    
    @Test
    def testFrancMultiplication() = {
      val five: Franc = new Franc(5)
      assertEquals(new Franc(10), five.times(2))
      assertEquals(new Franc(15), five.times(3))
    }
    
    @Test
    def testEquality() = {
      assertTrue(new Dollar(5) == new Dollar(5))
      assertFalse(new Dollar(5) == new Dollar(6))
    }

//    @Test
//    def testKO() = assertTrue(false)

}


