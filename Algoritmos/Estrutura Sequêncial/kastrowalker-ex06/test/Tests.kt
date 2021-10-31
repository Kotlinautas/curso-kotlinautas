import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testCalculaTempo01() {
        Assert.assertEquals("02:39:27", calculaTempo(9567))
    }

    @Test
    fun testCalculaTempo02() {
        Assert.assertEquals("01:16:07", calculaTempo(4567))
    }

    @Test
    fun testCalculaTempo03() {
        Assert.assertEquals("15:31:29", calculaTempo(55889))
    }

    @Test
    fun testCalculaTempo04() {
        Assert.assertEquals("00:42:47", calculaTempo(2567))
    }

    @Test
    fun testCalculaTempo05() {
        Assert.assertEquals("01:00:04", calculaTempo(3604))
    }

    @Test
    fun testCalculaTempo06() {
        Assert.assertEquals("09:09:09", calculaTempo(32949))
    }
}