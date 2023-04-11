package com.gameplaytechnologies.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;

public class OtherCar extends Car {
    private Texture texture;
    private int screenWidth, screenHeight;

    public OtherCar(Vector2 position, Texture texture, int screenWidth, int screenHeight) {
        super(position, texture.getWidth(), texture.getHeight());
        this.texture = texture;
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.velocity.y = -MathUtils.random(100, 200);
    }

    @Override
    public void update(float delta) {
        setPosition(getPosition().add(velocity.cpy().scl(delta)));

        if (getPosition().y + getHeight() < 0) {
            setPosition(new Vector2(MathUtils.random(40, screenWidth - 40 - texture.getWidth()), screenHeight));
            velocity.y = -MathUtils.random(100, 200);
        }
    }

    @Override
    public boolean isColliding(Car otherCar) {
        return bounds.overlaps(otherCar.getBounds());
    }

    @Override
    public void render(SpriteBatch batch) {
        batch.draw(texture, getPosition().x, getPosition().y);
    }
}
