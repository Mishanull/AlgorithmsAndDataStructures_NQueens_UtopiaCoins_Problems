import org.example.UtopiaCoins;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UtopiaCoinsTest {
    UtopiaCoins utopiaCoins;

    @Before
    public void setUp(){
        utopiaCoins=new UtopiaCoins();
    }

    @Test
    public void zeroAmount(){
        Assert.assertEquals(0,utopiaCoins.minCoins1(0));
        Assert.assertEquals(0,utopiaCoins.minCoins2(0));
        Assert.assertEquals(0,utopiaCoins.minCoinsTable(0));
    }

    @Test
    public void negativeAmount(){
        Assert.assertEquals(-1,utopiaCoins.minCoins1(-30));
        Assert.assertEquals(-1,utopiaCoins.minCoins2(-30));
        Assert.assertEquals(-1,utopiaCoins.minCoinsTable(-30));
    }

    @Test
    public void randomAmount2(){
        Assert.assertEquals(3,utopiaCoins.minCoins1(30));
        Assert.assertEquals(3,utopiaCoins.minCoins2(30));
        Assert.assertEquals(3,utopiaCoins.minCoinsTable(30));
    }

    @Test
    public void randomAmount3(){
        Assert.assertEquals(3,utopiaCoins.minCoins1(51));
        Assert.assertEquals(3,utopiaCoins.minCoins2(51));
        Assert.assertEquals(3,utopiaCoins.minCoinsTable(51));
    }

    @Test
    public void highAmount(){
        Assert.assertEquals(28,utopiaCoins.minCoinsTable(532));
    }
}
