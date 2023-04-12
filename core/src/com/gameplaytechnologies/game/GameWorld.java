package com.gameplaytechnologies.game;

import com.gameplaytechnologies.game.PlayerCar;

public class GameWorld {
    private PlayerCar playerCar;
    private int screenWidth;
    private int screenHeight;

    public GameWorld(int screenWidth, int screenHeight) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        playerCar = new PlayerCar(screenWidth / 2, 20);
    }

    public PlayerCar getPlayerCar() {
        return playerCar;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }
    public void update(float delta) {
        playerCar.update(delta);
    }
}
