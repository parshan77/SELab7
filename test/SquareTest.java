import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    public void computeArea() {
        Shape square = new Square(6);
        double area = square.computeArea();
        assertEquals(36.0, area);
    }
    @Test
    public void ChangeSide() {
        Square square = new Square(6);
        assertEquals(36.0, square.computeArea());

        square.setSide(4);
        assertEquals(16.0, square.computeArea());

        square.setSide(5);
        double side = square.getSide();
        assertEquals(side*side, square.computeArea());
    }
}