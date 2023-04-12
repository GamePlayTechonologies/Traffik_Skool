package com.gameplaytechnologies.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;

public class GameRenderer {
    private SpriteBatch spriteBatch;
    private ShapeRenderer shapeRenderer;
    private GameWorld gameWorld;

    // Commented out old code
    // private Stage stage;
    // private ImageButton upButton, downButton, leftButton, rightButton;

    public GameRenderer(GameWorld gameWorld) {
        this.gameWorld = gameWorld;
        spriteBatch = new SpriteBatch();
        shapeRenderer = new ShapeRenderer();

        // Commented out old code
        // stage = new Stage();

        // Load button textures
        // ...

        // Create ImageButtons using the textures
        // ...

        // Set button positions
        // ...

        // Add buttons to the stage
        // ...

        // Set the stage as the input processor
        // ...
    }

    public void render() {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        spriteBatch.begin();
        drawPlayerCar();
        spriteBatch.end();

        // Commented out old code
        // spriteBatch.begin();
        // stage.draw();
        // spriteBatch.end();

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        drawButtons();
        shapeRenderer.end();
    }

    private void drawPlayerCar() {
        PlayerCar playerCar = gameWorld.getPlayerCar();
        playerCar.draw(spriteBatch);
    }

    private void drawButtons() {
        // Draw your rectangles/buttons here using shapeRenderer
    }

    // Commented out old code
    // public ImageButton getUpButton() { ... }
    // public ImageButton getDownButton() { ... }
    // public ImageButton getLeftButton() { ... }
    // public ImageButton getRightButton() { ... }
}
