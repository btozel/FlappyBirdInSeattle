import javax.swing.*;

public class FlappyBirdApp {

    public static void main(String[] args) {
        // Width of the game board
        int boardWidth = 360;
        // Height of the game board
        int boardHeight = 640;
        // Creating the JFrame for the game window with the title
        JFrame gameWindow = new JFrame("Flappy Bird In Seattle");
        // Set the size of the game window
        gameWindow.setSize(boardWidth, boardHeight);
        // Set the game window not resizable
        gameWindow.setResizable(false);
        // Center the game window to the screen
        gameWindow.setLocationRelativeTo(null);
        // Set closing operations
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        // Creating FlappyBirdGame object
        FlappyBirdGame game = new FlappyBirdGame(boardWidth, boardHeight);
        // Adding game object to the game window
        gameWindow.add(game);
        // Fixing the dimension problem, dimensions will start after the title bar
        gameWindow.pack();
        // Requesting to get input focus
        game.requestFocus();


        // Set game window visible
        gameWindow.setVisible(true);
    }
}
