import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testSum01() {
        Assert.assertEquals(0, sum(emptyList()))
    }

    @Test
    fun testSum02() {
        Assert.assertEquals(0, sum(listOf(0)))
    }

    @Test
    fun testSum03() {
        Assert.assertEquals(7, sum(listOf(7)))
    }

    @Test
    fun testSum04() {
        Assert.assertEquals(14, sum(listOf(10, 4)))
    }

    @Test
    fun testSum05() {
        Assert.assertEquals(-208, sum(listOf(-70, -95, -16, 38, -65)))
    }

    @Test
    fun testSum06() {
        Assert.assertEquals(-38, sum(listOf(-30, -44, 29, 66, -91, 85, -48, 90, -44, -37, 20, 20, -38, -43, 27)))
    }

    @Test
    fun testSum07() {
        Assert.assertEquals(0, sum(listOf(0, 5, -5, 6, 7, -13)))
    }
}