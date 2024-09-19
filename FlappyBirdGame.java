import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class FlappyBirdGame extends JPanel implements ActionListener, KeyListener {
    int boardWidth;
    int boardHeight;


    // ------------------------------------ Game Images -----------------------------------------------------------
    Image backgroundImage;
    Image birdImage;
    Image topPipeImage;
    Image bottomPipeImage;


    // ------------------------------------ Game Logic -----------------------------------------------------------
    private double score;
    private boolean gameStart;
    private boolean gameOver;
    private Timer gameLoop;
    private Timer placePipesTimer;
    Random random;


    // ------------------------------------ Game Elements -----------------------------------------------------------
    // --------------------- Bird ---------------------
    private int birdXPosition;
    private int birdYPosition;
    private int birdWidth;
    private int birdHeight;
    private Bird bird;

    // --------------------- Pipes ---------------------
    private int pipeXPosition;
    private int topPipeYPosition;
    private int bottomPipeYPosition;
    private int pipeWidth;
    private int pipeHeight;
    private Pipe topPipe;
    private Pipe bottomPipe;
    private ArrayList<Pipe> pipes;



    FlappyBirdGame(int width, int height){
        this.boardWidth = width;
        this.boardHeight = height;

        setPreferredSize(new Dimension(boardWidth, boardHeight));

        // JPanel will be listening for the key events
        setFocusable(true);
        addKeyListener(this);



        // ------------------------------------ Game Logic -----------------------------------------------------------
        score = 0;
        gameStart = false;
        gameOver = false;
        gameLoop = new Timer(2000/60, this);
        gameLoop.setInitialDelay(3000);
        gameLoop.start();
        placePipesTimer = new Timer(1500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePipes();
            }
        });
        Random random;



        // ------------------------------------ Game Images -----------------------------------------------------------
        backgroundImage = new ImageIcon(getClass().getResource("img/flappy_bird_bg.png")).getImage();
        birdImage = new ImageIcon(getClass().getResource("img/flappy_bird.png")).getImage();
        topPipeImage = new ImageIcon(getClass().getResource("img/top_pipe.png")).getImage();
        bottomPipeImage = new ImageIcon(getClass().getResource("img/bottom_pipe.png")).getImage();


        // ------------------------------------ Game Elements ----------------------------------------------------------
        // --------------------- Bird ---------------------
        birdXPosition = boardWidth / 8;
        birdYPosition = boardHeight / 2;
        birdWidth = 35;
        birdHeight = 41;
        bird = new Bird(birdXPosition, birdYPosition, birdWidth, birdHeight, birdImage);

        // --------------------- Pipes ---------------------
        pipeXPosition = boardWidth;
        topPipeYPosition = 0;
        bottomPipeYPosition = 0;
        pipeWidth = 64;
        pipeHeight = 512;
    }


    private void placePipes(){

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }


    private void draw(Graphics g){
        bird.draw(g);
    }

    private void move(){
        bird.move();
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        repaint();
    }



    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            bird.jump();
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {}


    @Override
    public void keyReleased(KeyEvent e) {}
}