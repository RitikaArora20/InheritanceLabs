import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TechnoBuffTest {
    @Test
    void shouldThrowIllegalArgumentExceptionWhenHraIsNegative() throws Exception
    {
        Technobuff technobuff=new Technobuff(2000,1500,-1500,200);
        Exception ex= Assertions.assertThrows(Exception.class,()->{technobuff.getHra();});
        String actualValue=ex.getMessage();
        String expectedValue="Invalid Hra";
        assertEquals(expectedValue,actualValue);
    }
    @Test
    void shouldThrowIllegalArgumentExceptionWhenBonusIsNegative() throws Exception
    {
        Technobuff technobuff=new Technobuff(2000,1500,1500,-200);
        Exception ex= Assertions.assertThrows(Exception.class,()->{technobuff.getBonus();});
        String actualValue=ex.getMessage();
        String expectedValue="Invalid Bonus";
        assertEquals(expectedValue,actualValue);
    }
    @Test
    void shouldCheckForPositiveValueOfHra() throws Exception
    {
        Technobuff technobuff=new Technobuff(2000,1500,1500,200);
        double actualValue=technobuff.getHra();
        double expectedValue=1500;
        assertEquals(expectedValue,actualValue);

    }
    @Test
    void shouldCheckForPositiveValueOfBonus() throws Exception
    {
        Technobuff technobuff=new Technobuff(2000,1500,1500,200);
        double actualValue=technobuff.getBonus();
        double expectedValue=200;
        assertEquals(expectedValue,actualValue);

    }

}

