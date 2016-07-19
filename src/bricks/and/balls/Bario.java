/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bricks.and.balls;

/**
 *
 * @author Threadcount
 */
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.imageio.ImageIO;

class Animation {

    private BufferedImage[] frames;
    private int currentFrame;

    private long startTime;
    private long delay;

    private boolean playedOnce;

    public Animation() {
        playedOnce = false;
    }

    public void setFrames(BufferedImage[] frames) {
        this.frames = frames;
        currentFrame = 0;
        startTime = System.nanoTime();
        playedOnce = false;
    }

    public void setDelay(long d) {
        delay = d;
    }

    public void setFrame(int i) {
        currentFrame = i;
    }

    public void update() {

        if (delay == -1) {
            return;
        }

        long elapsed = (System.nanoTime() - startTime) / 1000000;
        if (elapsed > delay) {
            currentFrame++;
            startTime = System.nanoTime();
        }
        if (currentFrame == frames.length) {
            currentFrame = 0;
            playedOnce = true;
        }

    }

    public int getFrame() {
        return currentFrame;
    }

    public BufferedImage getImage() {
        return frames[currentFrame];
    }

    public boolean hasPlayedOnce() {
        return playedOnce;
    }

}

public class Bario {

    private static final int pos = 480;
    private static final int w = 60;
    private static final int h = 10;
    private double x = 360.0D;
    private double nx = 0.0D;
    private double y = 360.0D;
    private double ny = 0.0D;
    private BufferedImage b;
    private Game game;
    private Animation animation;
    private int currentAction;
    private int width = 30;
    private int height = 30;
    private int cwidth = 20;
    private int cheight = 20;
    private double moveSpeed = 0.3D;
    private double maxSpeed = 1.6D;
    private double stopSpeed = 0.4D;
    private double fallSpeed = 0.15D;
    private double maxFallSpeed = 4.0D;
    private double jumpStart = -4.8D;
    private double stopJumpSpeed = 0.3D;
    private ArrayList<BufferedImage[]> sprites;
    private boolean facingRight = true;
    private final int[] numFrames = {2, 8, 1, 2, 4, 2, 5};
    private static final int IDLE = 0;
    private static final int WALKING = 1;
    private static final int JUMPING = 2;
    private static final int FALLING = 3;

    public Bario(Game game) {
        this.game = game;
        try {
            BufferedImage spritesheet = ImageIO.read(getClass().getResourceAsStream("/Resources/playersprites.gif"));
            sprites = new ArrayList<BufferedImage[]>();
            for (int i = 0; i < 7; i++) {

                BufferedImage[] bi
                        = new BufferedImage[numFrames[i]];

                for (int j = 0; j < numFrames[i]; j++) {
                    bi[j] = spritesheet.getSubimage(j * width * 2, i * height, width * 2, height);

                }

                sprites.add(bi);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        animation = new Animation();
        currentAction = IDLE;
        animation.setFrames(sprites.get(IDLE));
        animation.setDelay(400);

    }

    public void move() {
        if (((x + nx) > 0) && ((x + nx) < (game.getWidth() - w))) {
            x = x + nx;
        }
        if (((y + ny) > 0) && ((y + ny) < (game.getHeight() - h))) {
            y = y + ny;
        }
    }

    public void draw(Graphics2D grphcs) {
        if (facingRight) {
            grphcs.drawImage(
                    animation.getImage(),
                    (int) (x + game.getX() - width / 2),
                    (int) (x + game.getX() - height / 2),
                    null
            );
        } else {
            grphcs.drawImage(
                    animation.getImage(),
                    (int) (x + game.getX() - width / 2 + width),
                    (int) (x + game.getX() - height / 2),
                    -width,
                    height,
                    null
            );
        }
    }

    public void keyReleased(KeyEvent e) {
        nx = 0;
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            nx = -2;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            nx = 2;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            ny = -2;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            ny = 2;
        }
    }

    public Rectangle getBounds() {
        return new Rectangle((int) x, pos, w, h);
    }

    public int getPos() {
        return pos;
    }
}