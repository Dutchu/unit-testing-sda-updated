package foo.bar;

public class Rectangle {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int square(int a, int b) {
        return a * b;
    }

    public int circumference(int a, int b) {
        return 2 * a + 2 * b;
    }
}
