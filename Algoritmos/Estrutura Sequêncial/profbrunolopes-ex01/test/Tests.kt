import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun testSub01(){
        Assert.assertEquals(-2, sub(5, 7))
    }

    @Test
    fun testSub02(){
        Assert.assertEquals(0, sub(5, 5))
    }

    @Test
    fun testSub03(){
        Assert.assertEquals(8, sub(15, 7))
    }

    @Test
    fun testSub04(){
        Assert.assertEquals(-15, sub(-20, -5))
    }

    @Test
    fun testSub05(){
        Assert.assertEquals(-25, sub(-20, 5))
    }

}