package com.gameplaytechnologies.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.Gdx;


public class PlayerCar extends Car {
    private static final float CAR_WIDTH = 50f;
    private static final float CAR_HEIGHT = 100f;    private static final float SPEED = 100;
    private Texture carTexture;
    private static final float MOVE_AMOUNT = 5;


    public PlayerCar(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        super(new Vector2(x, y), CAR_WIDTH, CAR_HEIGHT);
        carTexture = new Texture(Gdx.files.internal("car.png"));

    }
    public void draw(SpriteBatch spriteBatch) {
        spriteBatch.draw(carTexture, position.x, position.y, width, height);
    }
    public void moveUp() {
        position.y += MOVE_AMOUNT;
    }

    public void moveDown() {
        position.y -= MOVE_AMOUNT;
    }
    public void moveLeft() {
        position.x -= MOVE_AMOUNT;
    }

    public void moveRight() {
        position.x += MOVE_AMOUNT;
    }


    @Override
    public void update(float delta) {
        // Implement the update logic here
    }

    @Override
    public boolean isColliding(Car otherCar) {
        return bounds.overlaps(otherCar.getBounds());
    }

    @Override
    public void render(SpriteBatch batch) {
        // Implement the rendering logic here
    }
}
