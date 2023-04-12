package com.gameplaytechnologies.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public abstract class Car {
    protected Vector2 position;
    protected float width;
    protected float height;
    protected Texture texture;
    protected Vector2 velocity;

    public Car(Vector2 position, float width, float height) {
        this.position = position;
        this.width = width;
        this.height = height;
        this.velocity = new Vector2();
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

    public Texture getTexture() {
        return texture;
    }
}
