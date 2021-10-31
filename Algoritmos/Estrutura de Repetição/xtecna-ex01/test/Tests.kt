import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testCount01() {
        Assert.assertEquals(0, positives(emptyList<Int>()))
    }

    @Test
    fun testCount02() {
        Assert.assertEquals(0, positives(listOf(0)))
    }

    @Test
    fun testCount03() {
        Assert.assertEquals(0, positives(listOf(-1248964)))
    }

    @Test
    fun testCount04() {
        Assert.assertEquals(1, positives(listOf(3579)))
    }

    @Test
    fun testCount05() {
        Assert.assertEquals(3, positives(listOf(62, -31, 45, 35, -93)))
    }

    @Test
    fun testCount06() {
        Assert.assertEquals(2, positives(listOf(-38, 22, -92, 13, -33)))
    }

    @Test
    fun testCount07() {
        Assert.assertEquals(2, positives(listOf(-4, -4, 38, 78, -35)))
    }

    @Test
    fun testCount08() {
        Assert.assertEquals(4, positives(listOf(26, -2, -85, -54, 77, -1, 84, -14, 95, -28)))
    }
}