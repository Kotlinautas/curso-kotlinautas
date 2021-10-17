import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun testCalculaPreco01(){
        Assert.assertEquals(90.0, calculaPreco(100.0), 0.1)
    }

    @Test
    fun testCalculaPreco02(){
        Assert.assertEquals(9.0, calculaPreco(10.0), 0.1)
    }

    @Test
    fun testCalculaPreco03(){
        Assert.assertEquals(450.0, calculaPreco(500.0), 0.1)
    }

    @Test
    fun testCalculaPreco04(){
        Assert.assertEquals(225.0, calculaPreco(250.0), 0.1)
    }

    @Test
    fun testCalculaPreco05(){
        Assert.assertEquals(0.0, calculaPreco(0.0), 0.1)
    }

}