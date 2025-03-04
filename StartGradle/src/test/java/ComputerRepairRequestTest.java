import model.ComputerRepairRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerRepairRequestTest {
    @Test
    @DisplayName("Test for ComputerRepairRequest")
    public void testComputerRepairRequest() {
        ComputerRepairRequest request = new ComputerRepairRequest(1, "A A", "Address A", "072222", "Asus", "13/10/2020", "Broken display");
        assertEquals(1, request.getID());
        assertEquals("A A", request.getOwnerName());
        assertEquals("Address A", request.getOwnerAddress());
        assertEquals("072222", request.getPhoneNumber());
        assertEquals("Asus", request.getModel());
        assertEquals("13/10/2020", request.getDate());
        assertEquals("Broken display", request.getProblemDescription());
    }

    @Test
    @DisplayName("Test Example")
    public void testExample() {
        assertEquals(1, 1);
    }
}
