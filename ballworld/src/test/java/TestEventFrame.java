import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

import java.awt.event.MouseEvent;

public class TestEventFrame extends JFrame implements KeyListener, MouseMotionListener {
    
    public TestEventFrame() {
        addKeyListener(this);
        addMouseMotionListener(this);
        setFocusable(true);
    }

    public static void main(String[] args) {
        TestEventFrame frame = new TestEventFrame();

        frame.setSize(600, 500);
        frame.setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent arg0) {
        System.out.println("Key Pressed: " + arg0.getKeyCode());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed: " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released: " + e.getKeyCode());
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Mouse Dragged: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Mouse Moved: " + e.getX() + ", " + e.getY());
    }
}