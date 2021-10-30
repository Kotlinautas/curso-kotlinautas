import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testReverse01() {
        Assert.assertEquals(0, reverse(0))
    }

    @Test
    fun testReverse02() {
        Assert.assertEquals(4, reverse(4))
    }

    @Test
    fun testReverse03() {
        Assert.assertEquals(41, reverse(14))
    }

    @Test
    fun testReverse04() {
        Assert.assertEquals(56, reverse(65))
    }

    @Test
    fun testReverse05() {
        Assert.assertEquals(7, reverse(70))
    }

    @Test
    fun testReverse06() {
        Assert.assertEquals(35972, reverse(27953))
    }

    @Test
    fun testReverse07() {
        Assert.assertEquals(1, reverse(100))
    }

    @Test
    fun testReverse08() {
        Assert.assertEquals(121, reverse(121))
    }
}