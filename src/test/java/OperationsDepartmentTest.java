import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationsDepartmentTest {
    @Test
    void shouldThrowIllegalArgumentExceptionWhenHraIsNegative() throws Exception
    {
        OperationsDepartment operationsDepartment=new OperationsDepartment(2000,1500,-1500,200);
        Exception ex=Assertions.assertThrows(Exception.class,()->{operationsDepartment.getHra();});
        String actualValue=ex.getMessage();
        String expectedValue="Invalid Hra";
        assertEquals(expectedValue,actualValue);
    }
    @Test
    void shouldThrowIllegalArgumentExceptionWhenBonusIsNegative() throws Exception
    {
        OperationsDepartment operationsDepartment=new OperationsDepartment(2000,1500,1500,-200);
        Exception ex=Assertions.assertThrows(Exception.class,()->{operationsDepartment.getBonus();});
        String actualValue=ex.getMessage();
        String expectedValue="Invalid Bonus";
        assertEquals(expectedValue,actualValue);
    }
    @Test
    void shouldCheckForPositiveValueOfHra() throws Exception
    {
        OperationsDepartment operationsDepartment=new OperationsDepartment(2000,1500,1500,200);
        double actualValue=operationsDepartment.getHra();
        double expectedValue=1500;
        assertEquals(expectedValue,actualValue);

    }
    @Test
    void shouldCheckForPositiveValueOfBonus() throws Exception
    {
        OperationsDepartment operationsDepartment=new OperationsDepartment(2000,1500,1500,200);
        double actualValue=operationsDepartment.getBonus();
        double expectedValue=200;
        assertEquals(expectedValue,actualValue);

    }

}
