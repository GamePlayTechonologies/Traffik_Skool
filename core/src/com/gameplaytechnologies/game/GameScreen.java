package com.gameplaytechnologies.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.gameplaytechnologies.game.GameRenderer;


public class GameScreen implements Screen {
    private GameWorld gameWorld;
    private GameRenderer gameRenderer;

    public GameScreen() {
        gameWorld = new GameWorld(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        gameRenderer = new GameRenderer(gameWorld);
    }

    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        gameRenderer.render();
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
