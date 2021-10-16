import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun testDiv01() {
        Assert.assertEquals(2, div(5, 2))
    }

    @Test
    fun testDiv02() {
        Assert.assertEquals(5, div(10, 2))
    }

    @Test
    fun testDiv03() {
        Assert.assertEquals(0, div(2, 5))
    }

    @Test
    fun testDiv04() {
        Assert.assertEquals(-10, div(-100, 10))
    }

    @Test
    fun testDiv05() {
        Assert.assertEquals(0, div(0, 2))
    }

}