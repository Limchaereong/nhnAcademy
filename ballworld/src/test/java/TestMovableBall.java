// import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter.Red;
// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.params.ParameterizedTest;
// import org.junit.jupiter.params.provider.Arguments;
// import org.junit.jupiter.params.provider.MethodSource;

// import com.graphics.MovableBall;

// import static org.junit.jupiter.api.Assertions.*;

// import java.awt.Color;
// import java.util.stream.Stream;

// public class TestMovableBall {
    
//     @Test
//     void testConstructor(){
//         assertDoesNotThrow(() -> {
//             MovableBall ball = new MovableBall(1, 1, 1, Color.RED);

//         // assertEquals(MovableBall.DEFAULT_Dx, ball.getDx());
//         // assertEquals(MovableBall.DEFAULT_Dy, ball.getDy()); 
//     });
// }

//     @ParameterizedTest
//     @MethodSource("deltaProvider")
//     void testDeltaXY(int x, int y, int radius, int dx, int dy){
//         assertDoesNotThrow(() -> {
//             MovableBall ball = new MovableBall(x, y, radius, Color.RED);

//             ball.setDx(dx);
//             ball.setDy(dy);
//             assertEquals(dx, ball.getDx());
//             assertEquals(dy, ball.getDy());
//         });
//     }

//     static Stream<Arguments> deltaProvider() {
//         return Stream.of(
//             Arguments.arguments(0, 0, 10, 0, 0),
//             Arguments.arguments(0, 0, 10, 1, -1),
//             Arguments.arguments(0, 0, 10, 1, 1),
//             Arguments.arguments(0, 0, 10, -1, 1),
//             Arguments.arguments(0, 0, 10, -1, -1),
//             Arguments.arguments(0, 0, 10, Integer.MAX_VALUE, 0),
//             Arguments.arguments(0, 0, 10, 0, Integer.MAX_VALUE),
//             Arguments.arguments(0, 0, 10, Integer.MAX_VALUE, Integer.MAX_VALUE),
//             Arguments.arguments(0, 0, 10, Integer.MIN_VALUE, 0),
//             Arguments.arguments(0, 0, 10, 0, Integer.MIN_VALUE),
//             Arguments.arguments(0, 0, 10, Integer.MIN_VALUE, Integer.MIN_VALUE));
//     }


// }

