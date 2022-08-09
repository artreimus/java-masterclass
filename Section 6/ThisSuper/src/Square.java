public class Square {

//    Constructor chaining
    private int x;
    private int y;
    private int width;
    private int height;

    public Square() {
        this(0, 0);
    }

    public Square (int width, int height) {
        this(0 ,0, width, height);
    }

    public Square (int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
