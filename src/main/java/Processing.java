import processing.core.PApplet;

public class Processing extends PApplet {

    public static final int WIDTH = 720;
    public static final int HEIGHT = 640;
    public static final int DIAMETER = 20;
    public static final int SCREEN_SPLIT_UP = 5;
    int xOffset = 0;

    public static void main(String[] args) {
        PApplet.main("Processing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (int position = 1; position < SCREEN_SPLIT_UP; position++) {
            drawCircle(position);
        }
        xOffset++;
    }

    private void drawCircle(int position) {
        int yOffset = (HEIGHT * position) / SCREEN_SPLIT_UP;
        ellipse(xOffset * position, yOffset, DIAMETER, DIAMETER);
    }
}
