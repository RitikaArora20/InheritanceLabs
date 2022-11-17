
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ITDepartmentTest {
    @Test
    void shouldThrowIllegalArgumentExceptionWhenHraIsNegative() throws Exception
    {
        ITDepartment itDepartment=new ITDepartment(2000,1500,-1500,200);
        Exception ex=Assertions.assertThrows(Exception.class,()->{itDepartment.getHra();});
        String actualValue=ex.getMessage();
        String expectedValue="Invalid Hra";
        assertEquals(expectedValue,actualValue);
    }
    @Test
    void shouldThrowIllegalArgumentExceptionWhenBonusIsNegative() throws Exception
    {
        ITDepartment itDepartment=new ITDepartment(2000,1500,1500,-200);
        Exception ex=Assertions.assertThrows(Exception.class,()->{itDepartment.getBonus();});
        String actualValue=ex.getMessage();
        String expectedValue="Invalid Bonus";
        assertEquals(expectedValue,actualValue);
    }
    @Test
    void shouldCheckForPositiveValueOfHra() throws Exception
    {
        ITDepartment itDepartment=new ITDepartment(2000,1500,1500,200);
        double actualValue=itDepartment.getHra();
        double expectedValue=1500;
        assertEquals(expectedValue,actualValue);

    }
    @Test
    void shouldCheckForPositiveValueOfBonus() throws Exception
    {
        ITDepartment itDepartment=new ITDepartment(2000,1500,1500,200);
        double actualValue=itDepartment.getBonus();
        double expectedValue=200;
        assertEquals(expectedValue,actualValue);

    }

}
