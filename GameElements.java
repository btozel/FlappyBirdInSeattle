import java.awt.*;

abstract class GameElements {
    int xPosition;
    int yPosition;
    int widthOfObject;
    int heightOfObject;
    Image image;

    GameElements(int x, int y, int width, int height, Image img){
        this.xPosition = x;
        this.yPosition = y;
        this.widthOfObject = width;
        this.heightOfObject = height;
        this.image = img;
    }

    public void draw(Graphics g){
        g.drawImage(image, xPosition, yPosition, widthOfObject, heightOfObject, null);
    }

    abstract void move();

}
