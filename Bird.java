import java.awt.*;

public class Bird extends GameElements{
    private int gravityRate = 1;
    private int jumpingRate = 0;


    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * Constructor      Bird()
     * Description      Sets X and Y coordinates, width, height and image of the Bird with the given parameters.
     * @author          Batuhan Ozel
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    Bird(int x, int y, int width, int height, Image img) {
        super(x, y, width, height, img);
    }


    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * Method       move()
     * Description  Moves the bird under the influence of gravity.
     * @author      Batuhan Ozel
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    void move() {
        jumpingRate -= gravityRate;
        yPosition = yPosition - jumpingRate;
        // Bird shouldn't move outside the window, top of the window is 0 because left top corner is (0,0)
        // So bird's Y location shouldn't be less than 0
        yPosition = Math.max(0,yPosition);
    }


    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * Method       jump()
     * Description  Sets the jumpingRate value 10.
     * @author      Batuhan Ozel
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    void jump(){
        jumpingRate = 10;
    }
}
