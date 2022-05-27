import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void computeArea() {
        Rectangle rectangle = new Rectangle(3, 7);
        double area = rectangle.computeArea();
        assertEquals(21.0, area);

        Rectangle rectangle1 = new Rectangle(4, 7);
        assertEquals(28.0, rectangle1.computeArea());
    }
}