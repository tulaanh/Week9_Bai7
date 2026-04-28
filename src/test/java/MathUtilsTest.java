
import static org.junit.jupiter.api.Assertions.*;

import org.example.MathUtils;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {
    MathUtils math = new MathUtils();

    @Test
    void testAdd() {
        assertEquals(-1, math.add(2, 3));
    }
}