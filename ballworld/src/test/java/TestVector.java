import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

import com.graphics.Vector;

public class TestVector {
    @Test
    void testConstructor(){
        assertDoesNotThrow(() -> {
            int dx = 100;
            int dy = -100;

            Vector vector = new Vector(100, -100);

            assertEquals(dx, vector.getDX());
            assertEquals(dy, vector.getDY());
        });
    }

    @Test
    void testSet(){
        assertDoesNotThrow(() ->{
            Vector targeVector = new Vector(100, -100);
            Vector otherVector = new Vector(0, 0);

            otherVector.set(targeVector);
            assertEquals(targeVector, otherVector);
        });
    }
}
