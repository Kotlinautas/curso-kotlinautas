import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testMul01() {
        Assert.assertEquals(35, mul(5, 7, 1))
    }

    @Test
    fun testMul02() {
        Assert.assertEquals(-1, mul(-1, -1, -1))
    }

    @Test
    fun testMul03() {
        Assert.assertEquals(0, mul(5, 7, 0))
    }

    @Test
    fun testMul04() {
        Assert.assertEquals(1, mul(1, -1, -1))
    }

    @Test
    fun testMul05() {
        Assert.assertEquals(8, mul(2, 2, 2))
    }
}