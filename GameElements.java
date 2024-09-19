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

    public int getXPosition() {
        return xPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getWidthOfObject() {
        return widthOfObject;
    }

    public void setWidthOfObject(int widthOfObject) {
        this.widthOfObject = widthOfObject;
    }

    public int getHeightOfObject() {
        return heightOfObject;
    }

    public void setHeightOfObject(int heightOfObject) {
        this.heightOfObject = heightOfObject;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
