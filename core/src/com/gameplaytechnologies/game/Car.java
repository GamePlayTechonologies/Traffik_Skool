package com.gameplaytechnologies.game;

import com.badlogic.gdx.math.Vector2;

public class Car {
    protected Vector2 position;
    protected float width;
    protected float height;

    public Car(Vector2 position, float width, float height) {
        this.position = position;
        this.width = width;
        this.height = height;
    }

    public Vector2 getPosition() {
        return position;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}
