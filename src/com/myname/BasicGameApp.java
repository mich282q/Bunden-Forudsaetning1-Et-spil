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

public class BasicGameApp extends GameApplication {


    //størelsen på boksen
    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(600);
        settings.setHeight(700);
        settings.setTitle("Basic Game App");
        settings.setVersion("0.1");


    }

    public enum EntityType {
        PLAYER, COIN

    }

    private Entity player;
    private int pointCounter = 0; // laver en int variabel til vores point tæller

    //hvor player skal være i boksen
    @Override
    protected void initGame() {
        player = Entities.builder()
                .type(EntityType.PLAYER)
                .at(440, 600)
                //.viewFromNode(new Rectangle(25, 25, Color.BLUE))
                .viewFromTextureWithBBox("brick.png")
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());


        // de forskellige COIN som er i spillet
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


            }}}

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
        pointText.setTranslateY(620); // dens y position
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
