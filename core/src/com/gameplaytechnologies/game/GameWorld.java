package com.gameplaytechnologies.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameWorld {
    private int width, height;
    private PlayerCar playerCar;
    private int screenWidth;
    private int screenHeight;

    public int getScreenWidth() {
        return screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public void update(float delta) {
        playerCar.update(delta);
    }

    public PlayerCar getPlayerCar() {
        return playerCar;
    }
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void render(SpriteBatch batch) {
        // Render game objects here
    }
}
