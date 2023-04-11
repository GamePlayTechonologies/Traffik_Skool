import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.gameplaytechnologies.game.GameWorld;
import com.gameplaytechnologies.game.PlayerCar;


public class GameRenderer {
    private GameWorld gameWorld;
    private SpriteBatch spriteBatch;
    private Texture background;

    public GameRenderer(GameWorld gameWorld) {
        this.gameWorld = gameWorld;
        spriteBatch = new SpriteBatch();
        background = new Texture("background.png");
    }

    }
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        spriteBatch.begin();
        spriteBatch.draw(background, 0, 0, gameWorld.getScreenWidth(), gameWorld.getScreenHeight());
        PlayerCar playerCar = gameWorld.getPlayerCar();
        playerCar.draw(spriteBatch);
        spriteBatch.end();
    }
}
