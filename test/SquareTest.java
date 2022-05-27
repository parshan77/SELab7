import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    public void computeArea() {
        Shape square = new Square(6);
        double area = square.computeArea();
        assertEquals(36.0, area);
    }

}