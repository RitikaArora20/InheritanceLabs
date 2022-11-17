import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HRDepartmentTest {
    @Test
    void shouldThrowIllegalArgumentExceptionWhenHraIsNegative() throws Exception
    {
        HRDepartment hrDepartment=new HRDepartment(2000,1500,-1500,200);
        Exception ex=Assertions.assertThrows(Exception.class,()->{hrDepartment.getHra();});
        String actualValue=ex.getMessage();
        String expectedValue="Invalid Hra";
        assertEquals(expectedValue,actualValue);
    }
    @Test
    void shouldThrowIllegalArgumentExceptionWhenBonusIsNegative() throws Exception
    {
        HRDepartment hrDepartment=new HRDepartment(2000,1500,1500,-200);
        Exception ex=Assertions.assertThrows(Exception.class,()->{hrDepartment.getBonus();});
        String actualValue=ex.getMessage();
        String expectedValue="Invalid Bonus";
        assertEquals(expectedValue,actualValue);
    }
    @Test
    void shouldCheckForPositiveValueOfHra() throws Exception
    {
        HRDepartment hrDepartment=new HRDepartment(2000,1500,1500,200);
        double actualValue=hrDepartment.getHra();
        double expectedValue=1500;
        assertEquals(expectedValue,actualValue);

    }
    @Test
    void shouldCheckForPositiveValueOfBonus() throws Exception
    {
        HRDepartment hrDepartment=new HRDepartment(2000,1500,1500,200);
        double actualValue=hrDepartment.getBonus();
        double expectedValue=200;
        assertEquals(expectedValue,actualValue);

    }

}
