import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun testMediaPonderada01() {
        Assert.assertEquals(6.2, mediaPonderada(5.0, 7.0), 0.1)
    }

    @Test
    fun testMediaPonderada02() {
        Assert.assertEquals(7.0, mediaPonderada(7.0, 7.0), 0.1)
    }

    @Test
    fun testMediaPonderada03() {
        Assert.assertEquals(4.2, mediaPonderada(0.0, 7.0), 0.1)
    }

    @Test
    fun testMediaPonderada04() {
        Assert.assertEquals(10.0, mediaPonderada(10.0, 10.0), 0.1)
    }

    @Test
    fun testMediaPonderada05() {
        Assert.assertEquals(6.4, mediaPonderada(1.0, 10.0), 0.1)
    }

    @Test
    fun testMediaPonderada06() {
        Assert.assertEquals(0.0, mediaPonderada(0.0, 0.0), 0.1)
    }

}