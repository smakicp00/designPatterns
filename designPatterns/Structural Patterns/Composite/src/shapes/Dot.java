package shapes;

import java.awt.*;

public class Dot extends BaseShapes{

    private final int DOT_SIZE = 3;

    public Dot(int x, int y, Color color){
        super(x, y, color);
    }

    @Override
    public int getWidth() {
        return DOT_SIZE;
    }
    @Override
    public int getHeight() {
        return DOT_SIZE;
    }
    @Override
    public void paint(Graphics graphics){
        super.paint(graphics);
        graphics.drawRect(x-1, y-1, getWidth(), getHeight());
    }

}
