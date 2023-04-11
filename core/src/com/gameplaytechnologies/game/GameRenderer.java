package com.gameplaytechnologies.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameRenderer {
    private SpriteBatch spriteBatch;
    private GameWorld gameWorld;
    private Texture background;

    public GameRenderer(GameWorld gameWorld) {
        this.gameWorld = gameWorld;
        spriteBatch = new SpriteBatch();
        background = new Texture(Gdx.files.internal("background.png"));
    }
}
