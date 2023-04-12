package com.gameplaytechnologies.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class GameRenderer {

    private final GameWorld gameWorld;
    private OrthographicCamera cam;
    private ShapeRenderer shapeRenderer;
    private SpriteBatch spriteBatch;
    private Texture carTexture;

    public GameRenderer(GameWorld gameWorld) {
        this.gameWorld = gameWorld;
        cam = new OrthographicCamera();
        cam.setToOrtho(true, 480, 800);
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(cam.combined);
        spriteBatch = new SpriteBatch();
        carTexture = new Texture("car.png");
    }

    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);

        shapeRenderer.setColor(Color.RED);
        shapeRenderer.rect(gameWorld.getUpButton().x, gameWorld.getUpButton().y, gameWorld.getUpButton().width, gameWorld.getUpButton().height);
        shapeRenderer.rect(gameWorld.getDownButton().x, gameWorld.getDownButton().y, gameWorld.getDownButton().width, gameWorld.getDownButton().height);
        shapeRenderer.rect(gameWorld.getLeftButton().x, gameWorld.getLeftButton().y, gameWorld.getLeftButton().width, gameWorld.getLeftButton().height);
        shapeRenderer.rect(gameWorld.getRightButton().x, gameWorld.getRightButton().y, gameWorld.getRightButton().width, gameWorld.getRightButton().height);

        // End shapeRenderer
        shapeRenderer.end();

        // Begin spriteBatch
        spriteBatch.begin();

        // Render the car
        spriteBatch.draw(carTexture, gameWorld.getCar().getPosition().x, gameWorld.getCar().getPosition().y, gameWorld.getCar().getWidth(), gameWorld.getCar().getHeight());

        // End spriteBatch
        spriteBatch.end();
    }
}
