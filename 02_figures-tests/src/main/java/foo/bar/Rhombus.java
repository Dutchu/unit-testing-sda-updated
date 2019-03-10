package foo.bar;

public class Rhombus {
    int a;
    int h;

    public Rhombus(int a, int h) {
        this.a = a;
        this.h = h;
    }

    public int area(int a, int h) {
        return a * h;
    }

    public int circumFence(int a, int h) {
        return 2 * a + 2 * h;
    }
}
