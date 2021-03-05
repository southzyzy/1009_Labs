// Lab 3 Exercises
// Author @ Tan Zhao Yea (1802992)
// Task 2


import javax.swing.*;
import java.awt.*;

class BallTest extends JPanel {
    BackgroundBox bgb = new BackgroundBox();

    BallDisplay golf = new BallDisplay(10, 50, 20, Color.WHITE);
    BallDisplay basketBall = new BallDisplay(50, 80, 180, Color.RED);
    BallDisplay volleyBall = new BallDisplay(30, 200, 220, Color.getHSBColor(226, 220, 205));

    final int BOX_WIDTH = bgb.width;
    final int BOX_HEIGHT = bgb.height;

    public BallTest() {
        this.setPreferredSize(new Dimension(BOX_WIDTH, BOX_HEIGHT));
    }

    @Override
    protected void paintComponent(Graphics g) {
        // Paint the background
        super.paintComponent(g);

        // Draw the Box
        g.setColor(bgb.color);
        g.fillRect(0, 0, BOX_WIDTH, BOX_HEIGHT);

        // Draw golf ball color
        g.setColor(golf.color);

        // Drawing golf ball
        golf.calculateBallCenter();
        int golfSize = golf.getBallSize();

        g.fillOval((int) (golf.ballCenterX - golf.radius),
                (int) (golf.ballCenterY - golf.radius), golfSize, golfSize);

        // Draw basket ball color
        g.setColor(basketBall.color);

        // Drawing the Ball
        basketBall.calculateBallCenter();
        int basketSize = basketBall.getBallSize();

        g.fillOval((int) (basketBall.ballCenterX - basketBall.radius),
                (int) (basketBall.ballCenterY - basketBall.radius), basketSize, basketSize);

        // Draw volley ball color
        g.setColor(volleyBall.color);

        // Drawing the Ball
        volleyBall.calculateBallCenter();
        int volleySize = volleyBall.getBallSize();

        g.fillOval((int) (volleyBall.ballCenterX - volleyBall.radius),
                (int) (volleyBall.ballCenterY - volleyBall.radius), volleySize, volleySize);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Set up main window (using Swing's Jframe)
                JFrame frame = new JFrame("Draw Ball");
                //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setContentPane(new BallTest());
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}

class BackgroundBox {
    final int width;
    final int height;
    Color color;
    final int updateRate;

    // Default Constructor with default parameters
    public BackgroundBox() {
        this.width = 640;
        this.height = 480;
        this.color = Color.BLACK;
        this.updateRate = 30;
    }
}

class BallDisplay extends BackgroundBox {
    float radius;
    float ballPositionX;
    float ballPositionY;
    float ballCenterX;
    float ballCenterY;
    Color color;

    // Default Constructor with default parameters
    public BallDisplay() {
        this.radius = 10;
        this.ballPositionX = 50;
        this.ballPositionY = 20;
        this.color = Color.WHITE;
    }

    // User Defined Constructor
    public BallDisplay(float radius, float ballPosX, float ballPosY, Color color) {
        this.radius = radius;
        this.ballPositionX = ballPosX;
        this.ballPositionY = ballPosY;
        this.color = color;
    }

    public void calculateBallCenter() {
        ballCenterX = radius + ballPositionX;
        ballCenterY = radius + ballPositionY;
    }

    public int getBallSize() {
        return (int) (2 * radius);
    }
}