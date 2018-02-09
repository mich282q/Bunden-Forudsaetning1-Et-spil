package com.myname;
import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.entity.Entities;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.CollidableComponent;
import com.almasb.fxgl.input.Input;
import com.almasb.fxgl.input.UserAction;
import com.almasb.fxgl.physics.CollisionHandler;
import com.almasb.fxgl.settings.GameSettings;
import com.almasb.fxgl.texture.Texture;
import javafx.scene.control.Alert;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import java.util.Map;
import java.util.Random;

public class BasicGameApp1 extends GameApplication {


    //størelsen på boksen
    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(500);
        settings.setHeight(450);
        settings.setTitle("Basic Game App");
        settings.setVersion("0.1");


    }

    public enum EntityType {
        PLAYER, COIN

    }

    private Entity player;
    private Entity coin[] = new Entity[225];
    private int pointCounter = 0; // laver en int variabel til vores point tæller

    //hvor player skal være i boksen
    @Override
    protected void initGame() {
        player = Entities.builder()
                .type(EntityType.PLAYER)
                .at(440, 400)
                //.viewFromNode(new Rectangle(25, 25, Color.BLUE))
                .viewFromTextureWithBBox("brick.png")
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());


        // de forskellige COIN som er i spillet


        coin[0] = Entities.builder()
                .type(EntityType.COIN)
                .at(10, 0)
                //random color on Coins.
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[1] = Entities.builder()
                .type(EntityType.COIN)
                .at(10, 40)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[2] = Entities.builder()
                .type(EntityType.COIN)
                .at(10, 80)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[3] = Entities.builder()
                .type(EntityType.COIN)
                .at(10, 120)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[4] = Entities.builder()
                .type(EntityType.COIN)
                .at(10, 160)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[5] = Entities.builder()
                .type(EntityType.COIN)
                .at(10, 200)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[6] = Entities.builder()
                .type(EntityType.COIN)
                .at(10, 240)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[7] = Entities.builder()
                .type(EntityType.COIN)
                .at(10, 280)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[8] = Entities.builder()
                .type(EntityType.COIN)
                .at(10, 320)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[9] = Entities.builder()
                .type(EntityType.COIN)
                .at(10, 360)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[10] = Entities.builder()
                .type(EntityType.COIN)
                .at(210, 0)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[11] = Entities.builder()
                .type(EntityType.COIN)
                .at(210, 40)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[12] = Entities.builder()
                .type(EntityType.COIN)
                .at(210, 80)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[13] = Entities.builder()
                .type(EntityType.COIN)
                .at(210, 120)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[14] = Entities.builder()
                .type(EntityType.COIN)
                .at(210, 160)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());

        //
        coin[15] = Entities.builder()
                .type(EntityType.COIN)
                .at(50, 0)
                //random color on Coins.
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[16] = Entities.builder()
                .type(EntityType.COIN)
                .at(50, 40)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[17] = Entities.builder()
                .type(EntityType.COIN)
                .at(50, 80)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[18] = Entities.builder()
                .type(EntityType.COIN)
                .at(50, 120)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[19] = Entities.builder()
                .type(EntityType.COIN)
                .at(50, 160)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[20] = Entities.builder()
                .type(EntityType.COIN)
                .at(50, 200)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[21] = Entities.builder()
                .type(EntityType.COIN)
                .at(50, 240)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[22] = Entities.builder()
                .type(EntityType.COIN)
                .at(50, 280)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[23] = Entities.builder()
                .type(EntityType.COIN)
                .at(50, 320)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[24] = Entities.builder()
                .type(EntityType.COIN)
                .at(50, 360)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[25] = Entities.builder()
                .type(EntityType.COIN)
                .at(210, 200)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[26] = Entities.builder()
                .type(EntityType.COIN)
                .at(210, 240)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[27] = Entities.builder()
                .type(EntityType.COIN)
                .at(210, 280)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[28] = Entities.builder()
                .type(EntityType.COIN)
                .at(210, 320)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[29] = Entities.builder()
                .type(EntityType.COIN)
                .at(210, 360)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[30] = Entities.builder()
                .type(EntityType.COIN)
                .at(90, 0)
                //random color on Coins.
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[31] = Entities.builder()
                .type(EntityType.COIN)
                .at(90, 40)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[32] = Entities.builder()
                .type(EntityType.COIN)
                .at(90, 80)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[33] = Entities.builder()
                .type(EntityType.COIN)
                .at(90, 120)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[34] = Entities.builder()
                .type(EntityType.COIN)
                .at(90, 160)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[35] = Entities.builder()
                .type(EntityType.COIN)
                .at(90, 200)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[36] = Entities.builder()
                .type(EntityType.COIN)
                .at(90, 240)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[37] = Entities.builder()
                .type(EntityType.COIN)
                .at(90, 280)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[38] = Entities.builder()
                .type(EntityType.COIN)
                .at(90, 320)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[39] = Entities.builder()
                .type(EntityType.COIN)
                .at(90, 360)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[40] = Entities.builder()
                .type(EntityType.COIN)
                .at(250, 0)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[41] = Entities.builder()
                .type(EntityType.COIN)
                .at(250, 40)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[42] = Entities.builder()
                .type(EntityType.COIN)
                .at(250, 80)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[43] = Entities.builder()
                .type(EntityType.COIN)
                .at(250, 120)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[44] = Entities.builder()
                .type(EntityType.COIN)
                .at(250, 160)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());


        coin[45] = Entities.builder()
                .type(EntityType.COIN)
                .at(130, 0)
                //random color on Coins.
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[46] = Entities.builder()
                .type(EntityType.COIN)
                .at(130, 40)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[47] = Entities.builder()
                .type(EntityType.COIN)
                .at(130, 80)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[48] = Entities.builder()
                .type(EntityType.COIN)
                .at(130, 120)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[49] = Entities.builder()
                .type(EntityType.COIN)
                .at(130, 160)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[50] = Entities.builder()
                .type(EntityType.COIN)
                .at(130, 200)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[51] = Entities.builder()
                .type(EntityType.COIN)
                .at(130, 240)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[52] = Entities.builder()
                .type(EntityType.COIN)
                .at(130, 280)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[53] = Entities.builder()
                .type(EntityType.COIN)
                .at(130, 320)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[54] = Entities.builder()
                .type(EntityType.COIN)
                .at(130, 360)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[55] = Entities.builder()
                .type(EntityType.COIN)
                .at(250, 200)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[56] = Entities.builder()
                .type(EntityType.COIN)
                .at(250, 240)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[57] = Entities.builder()
                .type(EntityType.COIN)
                .at(250, 280)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[58] = Entities.builder()
                .type(EntityType.COIN)
                .at(250, 320)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[59] = Entities.builder()
                .type(EntityType.COIN)
                .at(250, 360)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());

        coin[60] = Entities.builder()
                .type(EntityType.COIN)
                .at(170, 0)
                //random color on Coins.
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[61] = Entities.builder()
                .type(EntityType.COIN)
                .at(170, 40)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[62] = Entities.builder()
                .type(EntityType.COIN)
                .at(170, 80)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[63] = Entities.builder()
                .type(EntityType.COIN)
                .at(170, 120)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[64] = Entities.builder()
                .type(EntityType.COIN)
                .at(170, 160)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[65] = Entities.builder()
                .type(EntityType.COIN)
                .at(170, 200)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[66] = Entities.builder()
                .type(EntityType.COIN)
                .at(170, 240)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[67] = Entities.builder()
                .type(EntityType.COIN)
                .at(170, 280)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[68] = Entities.builder()
                .type(EntityType.COIN)
                .at(170, 320)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[69] = Entities.builder()
                .type(EntityType.COIN)
                .at(170, 360)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[70] = Entities.builder()
                .type(EntityType.COIN)
                .at(290, 0)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[71] = Entities.builder()
                .type(EntityType.COIN)
                .at(290, 40)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[72] = Entities.builder()
                .type(EntityType.COIN)
                .at(290, 80)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[73] = Entities.builder()
                .type(EntityType.COIN)
                .at(290, 120)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[74] = Entities.builder()
                .type(EntityType.COIN)
                .at(290, 160)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[75] = Entities.builder()
                .type(EntityType.COIN)
                .at(290, 200)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[76] = Entities.builder()
                .type(EntityType.COIN)
                .at(290, 240)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[77] = Entities.builder()
                .type(EntityType.COIN)
                .at(290, 280)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[78] = Entities.builder()
                .type(EntityType.COIN)
                .at(290, 320)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[79] = Entities.builder()
                .type(EntityType.COIN)
                .at(290, 360)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());


        coin[80] = Entities.builder()
                .type(EntityType.COIN)
                .at(330, 0)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[81] = Entities.builder()
                .type(EntityType.COIN)
                .at(330, 40)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[82] = Entities.builder()
                .type(EntityType.COIN)
                .at(330, 80)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[83] = Entities.builder()
                .type(EntityType.COIN)
                .at(330, 120)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[84] = Entities.builder()
                .type(EntityType.COIN)
                .at(330, 160)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[85] = Entities.builder()
                .type(EntityType.COIN)
                .at(330, 200)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[86] = Entities.builder()
                .type(EntityType.COIN)
                .at(330, 240)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[87] = Entities.builder()
                .type(EntityType.COIN)
                .at(330, 280)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[88] = Entities.builder()
                .type(EntityType.COIN)
                .at(330, 320)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[89] = Entities.builder()
                .type(EntityType.COIN)
                .at(330, 360)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());

        coin[90] = Entities.builder()
                .type(EntityType.COIN)
                .at(370, 0)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[91] = Entities.builder()
                .type(EntityType.COIN)
                .at(370, 40)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[92] = Entities.builder()
                .type(EntityType.COIN)
                .at(370, 80)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[93] = Entities.builder()
                .type(EntityType.COIN)
                .at(370, 120)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[94] = Entities.builder()
                .type(EntityType.COIN)
                .at(370, 160)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[95] = Entities.builder()
                .type(EntityType.COIN)
                .at(370, 200)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[96] = Entities.builder()
                .type(EntityType.COIN)
                .at(370, 240)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[97] = Entities.builder()
                .type(EntityType.COIN)
                .at(370, 280)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[98] = Entities.builder()
                .type(EntityType.COIN)
                .at(370, 320)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[99] = Entities.builder()
                .type(EntityType.COIN)
                .at(370, 360)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());

        coin[100] = Entities.builder()
                .type(EntityType.COIN)
                .at(410, 0)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[101] = Entities.builder()
                .type(EntityType.COIN)
                .at(410, 40)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[102] = Entities.builder()
                .type(EntityType.COIN)
                .at(410, 80)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[103] = Entities.builder()
                .type(EntityType.COIN)
                .at(410, 120)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[104] = Entities.builder()
                .type(EntityType.COIN)
                .at(410, 160)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[105] = Entities.builder()
                .type(EntityType.COIN)
                .at(410, 200)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[106] = Entities.builder()
                .type(EntityType.COIN)
                .at(410, 240)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[107] = Entities.builder()
                .type(EntityType.COIN)
                .at(410, 280)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[108] = Entities.builder()
                .type(EntityType.COIN)
                .at(410, 320)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[109] = Entities.builder()
                .type(EntityType.COIN)
                .at(410, 360)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());

        coin[110] = Entities.builder()
                .type(EntityType.COIN)
                .at(450, 0)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[111] = Entities.builder()
                .type(EntityType.COIN)
                .at(450, 40)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[112] = Entities.builder()
                .type(EntityType.COIN)
                .at(450, 80)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[113] = Entities.builder()
                .type(EntityType.COIN)
                .at(450, 120)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[114] = Entities.builder()
                .type(EntityType.COIN)
                .at(450, 160)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[115] = Entities.builder()
                .type(EntityType.COIN)
                .at(450, 200)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[116] = Entities.builder()
                .type(EntityType.COIN)
                .at(450, 240)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[117] = Entities.builder()
                .type(EntityType.COIN)
                .at(450, 280)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[118] = Entities.builder()
                .type(EntityType.COIN)
                .at(450, 320)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        coin[119] = Entities.builder()
                .type(EntityType.COIN)
                .at(450, 360)
                .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
    }

    @Override
    protected void initPhysics() {
        getPhysicsWorld().addCollisionHandler(new CollisionHandler(EntityType.PLAYER, EntityType.COIN) {

            // order of types is the same as passed into the constructor
            @Override
            protected void onCollisionBegin(Entity player, Entity coin) {
                coin.removeFromWorld();


                // tilføjer 50 point til pointCounter
                pointCounter = pointCounter + 50;

                // opdaterer pointText
                pointText.setText("Point: " + pointCounter);


            }
        });
    }


    // at vi kan rykke rundt på den pacman
    @Override
    protected void initInput() {
        Input input = getInput();

        input.addAction(new UserAction("Move Right") {
            @Override
            protected void onAction() {
                player.translateX(3); // move right 5 pixels
                getGameState().increment("pixelsMoved", +3);
            }
        }, KeyCode.D);
        input.addAction(new UserAction("Move Left") {
            @Override
            protected void onAction() {
                player.translateX(-3); // move left 5 pixels
            }
        }, KeyCode.A);

        input.addAction(new UserAction("Move Up") {
            @Override
            protected void onAction() {
                player.translateY(-3); // move up 5 pixels
            }
        }, KeyCode.W);

        input.addAction(new UserAction("Move Down") {
            @Override
            protected void onAction() {
                player.translateY(3); // move down 5 pixels
            }
        }, KeyCode.S);
        input.addAction(new UserAction("Play Sound") {
            @Override
            protected void onActionBegin() {
                getAudioPlayer().playSound("drop.wav");
            }
        }, KeyCode.F);


    }


    @Override
    protected void initUI() {

        //at vi adder vores player til spillet
        Text textPixels = new Text();
        textPixels.setTranslateX(50); // x = 50
        textPixels.setTranslateY(100); // y = 100

        //getGameScene().addUINode(textPixels); // add to the scene graph
        Texture brickTexture = getAssetLoader().loadTexture("brick.png");
        //brickTexture.setTranslateX(50);
        //brickTexture.setTranslateY(450);

        pointText.setTranslateX(0); // dens x position
        pointText.setTranslateY(420); // dens y position
        pointText.setFont(new Font("Arial Rounded MT Bold", 28)); // sætter fontet til at være Arial Rounded MT Bold med størrelse 28
        //getGameScene().addUINode(brickTexture);
        textPixels.textProperty().bind(getGameState().intProperty("pixelsMoved").asString());
        getGameScene().addUINode(pointText);
    }



    @Override
    protected void initGameVars(Map<String, Object> vars) {
        vars.put("pixelsMoved", 0);


    }


    private Text pointText = new Text("Point: " + pointCounter); // laver en tekst til vores level numre




        public static void main (String[]args){
            launch(args);


        }

    }
