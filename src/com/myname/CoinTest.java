package com.myname;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.entity.Entities;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.CollidableComponent;
import com.almasb.fxgl.settings.GameSettings;
import javafx.scene.shape.Circle;

public class CoinTest extends GameApplication {

    // Opretter spillepladen
    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(600);
        settings.setHeight(600);
        settings.setTitle("Basic Game App");
        settings.setVersion("0.1");
    }

    private Entity  player;

    @Override
    protected void initGame() {

        /* Et loop i et andet loop, tegner et antal mønter på spillepladen med tilfældige farver */
        for (int y = 0; y < 600; y=y+40) {
            for (int x = 0; x <600 ; x=x+40) {
                Coin coin = new Coin(x, y);

                Entities.builder()
                        .type(coin.getEntityType())
                        .at(coin.getPlaceringX(), coin.getPlaceringY())
                        .viewFromNodeWithBBox(new Circle(coin.getRadius(), coin.getColor()))
                        .with(new CollidableComponent(true))
                        .buildAndAttach(getGameWorld());
            }
        }

        // Opretter spilleren */
        player = Entities.builder()
                .type(BasicGameApp.EntityType.PLAYER)
                .at(500, 300)
                //.viewFromNode(new Rectangle(25, 25, Color.BLUE))
                .viewFromTextureWithBBox("brick.png")
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
    }
}