package com.gameplaytechnologies.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Rectangle;

public abstract class Car {
    protected Vector2 position;
    protected Vector2 velocity;
    protected float width, height;
    protected Rectangle bounds;

    public Car(Vector2 position, float width, float height) {
        this.position = position;
        this.width = width;
        this.height = height;
        this.velocity = new Vector2(0, 0);
        this.bounds = new Rectangle(position.x, position.y, width, height);
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
        bounds.setPosition(position);
    }

    public Vector2 getVelocity() {
        return velocity;
    }

    public void setVelocity(Vector2 velocity) {
        this.velocity = velocity;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public abstract void update(float delta);

    public abstract boolean isColliding(Car otherCar);

    public abstract void render(SpriteBatch batch);
}
