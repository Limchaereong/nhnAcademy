// package com.graphics;

// import org.junit.jupiter.api.Test;

// import com.graphics.PaintableBall;

// import static org.junit.jupiter.api.Assertions.*;

// import java.awt.Color;

// public class TestPaintableBall {

//     @Test
//     public void testPaintableBallCreation() {
//         PaintableBall paintableBall = new PaintableBall(100, 100, 50, Color.RED);
//         assertEquals(100, paintableBall.getX());
//         assertEquals(100, paintableBall.getY());
//         assertEquals(50, paintableBall.getRadius());
//         assertEquals(Color.RED, paintableBall.getColor());
//     }

//     @Test
//     public void testDefaultColor() {
//         PaintableBall paintableBall = new PaintableBall(100, 100, 50);
//         assertEquals(PaintableBall.DEFUALT_COLOR, paintableBall.getColor());
//     }

//     @Test
//     public void testSetColor() {
//         PaintableBall paintableBall = new PaintableBall(100, 100, 50);
//         paintableBall.setColor(Color.RED);
//         assertEquals(Color.RED, paintableBall.getColor());
//     }

//     @Test
//     public void testInvalidColor() {
//         assertThrows(IllegalArgumentException.class, () -> {
//             new PaintableBall(100, 100, 50, null);
//         });
//     }
// }