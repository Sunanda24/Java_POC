import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test; 
public class TestHello {
	@Test  
    public void testFindMax(){  
        assertEquals(4,Hello.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1,Hello.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }
}
