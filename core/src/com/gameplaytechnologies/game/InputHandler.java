package com.gameplaytechnologies.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.gameplaytechnologies.game.GameWorld;
// import com.badlogic.gdx.scenes.scene2d.InputEvent;
// import com.badlogic.gdx.scenes.scene2d.InputListener;

public class InputHandler extends InputAdapter {
    private final GameWorld gameWorld;
    private final GameRenderer gameRenderer;

    public InputHandler(GameWorld gameWorld, GameRenderer gameRenderer) {
        this.gameWorld = gameWorld;
        this.gameRenderer = gameRenderer;
        Gdx.input.setInputProcessor(this);
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        // Add your touch handling code here
        return true;
    }

    // Commented out the previous code

    // gameRenderer.getUpButton().addListener(new InputListener() {
    //     public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
    //         gameWorld.getPlayerCar().moveUp();
    //         return true;
    //     }
    // });

    // gameRenderer.getDownButton().addListener(new InputListener() {
    //     public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
    //         gameWorld.getPlayerCar().moveDown();
    //         return true;
    //     }
    // });

    // gameRenderer.getLeftButton().addListener(new InputListener() {
    //     public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
    //         gameWorld.getPlayerCar().moveLeft();
    //         return true;
    //     }
    // });

    // gameRenderer.getRightButton().addListener(new InputListener() {
    //     public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
    //         gameWorld.getPlayerCar().moveRight();
    //         return true;
    //     }
    // });
}
