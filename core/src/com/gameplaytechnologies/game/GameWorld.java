package com.gameplaytechnologies.game;

import com.badlogic.gdx.math.Rectangle;

public class GameWorld {

    private final PlayerCar playerCar; // Updated
    private final Rectangle upButton;
    private final Rectangle downButton;
    private final Rectangle leftButton;
    private final Rectangle rightButton;

    public GameWorld() {
        playerCar = new PlayerCar(240, 400, 20, 20); // Updated
        upButton = new Rectangle(40, 700, 50, 50);
        downButton = new Rectangle(40, 760, 50, 50);
        leftButton = new Rectangle(20, 730, 50, 50);
        rightButton = new Rectangle(60, 730, 50, 50);
    }


    public PlayerCar getCar() {
        return playerCar;
    }

    public void update(float delta) {
        playerCar.update(delta);
    }
    public Rectangle getUpButton() {
        return upButton;
    }

    public Rectangle getDownButton() {
        return downButton;
    }

    public Rectangle getLeftButton() {
        return leftButton;
    }

    public Rectangle getRightButton() {
        return rightButton;
    }

}


