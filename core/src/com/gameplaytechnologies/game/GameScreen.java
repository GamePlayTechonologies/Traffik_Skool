package com.gameplaytechnologies.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

public class GameScreen implements Screen {
    private GameWorld gameWorld;
    private GameRenderer gameRenderer;

    public GameScreen() {
        gameWorld = new GameWorld(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        gameRenderer = new GameRenderer(gameWorld);
    }
    private int screenWidth;
    private int screenHeight;

    public GameWorld(int screenWidth, int screenHeight) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        gameRenderer.render(delta);
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void dispose() {
    }
}
