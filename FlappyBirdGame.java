import javax.swing.*;
import java.awt.*;

public class FlappyBirdGame extends JPanel {
    int boardWidth;
    int boardHeight;

    // ------------------------------------ Game Images -----------------------------------------------------------
    Image backgroundImage;
    Image birdImage;
    Image topPipeImage;
    Image bottomPipeImage;


    FlappyBirdGame(int width, int height){
        this.boardWidth = width;
        this.boardHeight = height;

        // ------------------------------------ Game Images -----------------------------------------------------------
        backgroundImage = new ImageIcon(getClass().getResource("img/flappy_bird_bg.png")).getImage();
        birdImage = new ImageIcon(getClass().getResource("img/flappy_bird.png")).getImage();
        topPipeImage = new ImageIcon(getClass().getResource("img/top_pipe.png")).getImage();
        bottomPipeImage = new ImageIcon(getClass().getResource("img/bottom_pipe.png")).getImage();
    }
}
