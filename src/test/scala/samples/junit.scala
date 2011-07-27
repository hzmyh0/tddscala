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
      five.times(2)
      assertEquals(10, five.amount)
    }

//    @Test
//    def testKO() = assertTrue(false)

}


