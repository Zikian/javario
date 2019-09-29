package src.main;

import java.awt.*;

public abstract class Config{

    // Window config
    public final static int[] FRAME_SIZE = {744, 672};
    public final static String FRAME_TITLE = "Javario Brothas";

    // Scenes
    public final static class Scenes {
        public final static String MAIN_MENU = "main_menu";
        public final static String LEVEL_ONE = "level_one";
    }

    // Colors
    public final static Color BACKGROUND_COLOR = new Color(107, 140, 255);
    
    // Distance from left side of the screen, from which camera starts following
    public final static int CAMERA_FOLLOW_TRESHOLD = 300;
    public final static int MAX_JUMP_HEIGHT = 140;
    public final static int TILE_SIZE = 48;

    public final static float MARIO_ACCELERATION = 0.0005f;
    public final static float MARIO_MAX_VELOCITY = 0.35f;
    public final static float GRAVITY = 0.002f;
    public final static float DECEL_FRICTION = 0.95f;
    public final static float BRAKE_FRICTION = 0.90f;
    public final static float MIN_STOP_VELOCITY = 0.02f;
    public final static float BUMP_VEL = 0.1f; // Velocity that mario gets when he bumps the underside of a collider
    public final static float ENEMY_START_VEL_X = 0.1f;
    public final static float GOOMBA_KNOCKED_VEL = -0.8f;

    // Velocities for different events
    public final static float JUMP_VELOCITY = -1f;

    // Tags
    public final static String MARIO_TAG = "mario";
    public final static String GOOMBA_TAG = "goomba";
}