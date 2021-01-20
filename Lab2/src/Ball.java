// Lab 2 Exercises
// Author @ Tan Zhao Yea (1802992)
// Task 2

import javax.swing.*;
import java.awt.*;

class BallTest extends JPanel {
    BallDisplay ballD = new BallDisplay();
    BackgroundBox bgb = new BackgroundBox();

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
        g.fillRect(0,0, BOX_WIDTH, BOX_HEIGHT);

        // Draw the Ball
        g.setColor(ballD.color);
        // Drawing the Ball
        ballD.calculateBallCenter();
        int ballSize = ballD.getBallSize();

        g.fillOval((int) (ballD.ballCenterX - ballD.radius),
                (int) (ballD.ballCenterY - ballD.radius), ballSize, ballSize);
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

class BallDisplay {
    float radius;
    float ballPositionX;
    float ballPositionY;
    float ballCenterX;
    float ballCenterY;
    Color color;

    // Default Constructor with default parameters
    public BallDisplay() {
        this.radius = 20;
        this.ballPositionX = 50;
        this.ballPositionY = 20;
        this.color = Color.CYAN;
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

    // TODO: Finish getBallSize code
    public int getBallSize() {
        return (int) (2*radius);
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