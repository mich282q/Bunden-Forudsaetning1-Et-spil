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
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import java.util.Map;

public class BasicGameApp extends GameApplication {


    //størelsen på boksen
    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(600);
        settings.setHeight(600);
        settings.setTitle("Basic Game App");
        settings.setVersion("0.1");


    }

    private Entity player;

    //hvor player skal være i boksen
    @Override
    protected void initGame() {
        player = Entities.builder()
                .type(EntityType.PLAYER)
                .at(500, 300)
                //.viewFromNode(new Rectangle(25, 25, Color.BLUE))
                .viewFromTextureWithBBox("brick.png")
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());

        // de forskellige COIN som er i spillet
        Entities.builder()
                .type(EntityType.COIN)
                .at(10, 0)
                .viewFromNodeWithBBox(new Circle(15, Color.BLUE))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        Entities.builder()
                .type(EntityType.COIN)
                .at(10, 40)
                .viewFromNodeWithBBox(new Circle(15, Color.RED))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        Entities.builder()
                .type(EntityType.COIN)
                .at(10, 80)
                .viewFromNodeWithBBox(new Circle(15, Color.YELLOW))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        Entities.builder()
                .type(EntityType.COIN)
                .at(10, 120)
                .viewFromNodeWithBBox(new Circle(15, Color.GREEN))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        Entities.builder()
                .type(EntityType.COIN)
                .at(10, 160)
                .viewFromNodeWithBBox(new Circle(15, Color.BEIGE))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        Entities.builder()
                .type(EntityType.COIN)
                .at(10, 200)
                .viewFromNodeWithBBox(new Circle(15, Color.GREEN))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        Entities.builder()
                .type(EntityType.COIN)
                .at(10, 240)
                .viewFromNodeWithBBox(new Circle(15, Color.GRAY))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        Entities.builder()
                .type(EntityType.COIN)
                .at(10, 280)
                .viewFromNodeWithBBox(new Circle(15, Color.BLUEVIOLET))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        Entities.builder()
                .type(EntityType.COIN)
                .at(10, 320)
                .viewFromNodeWithBBox(new Circle(15, Color.PURPLE))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        Entities.builder()
                .type(EntityType.COIN)
                .at(10, 360)
                .viewFromNodeWithBBox(new Circle(15, Color.CADETBLUE))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        Entities.builder()
                .type(EntityType.COIN)
                .at(10, 400)
                .viewFromNodeWithBBox(new Circle(15, Color.ORANGERED))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        Entities.builder()
                .type(EntityType.COIN)
                .at(10, 440)
                .viewFromNodeWithBBox(new Circle(15, Color.BURLYWOOD))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        Entities.builder()
                .type(EntityType.COIN)
                .at(10, 480)
                .viewFromNodeWithBBox(new Circle(15, Color.DARKGOLDENROD))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        Entities.builder()
                .type(EntityType.COIN)
                .at(10, 520)
                .viewFromNodeWithBBox(new Circle(15, Color.GOLD))
                .with(new CollidableComponent(true))
                .buildAndAttach(getGameWorld());
        Entities.builder()
                .type(EntityType.COIN)
                .at(10, 560)
                .viewFromNodeWithBBox(new Circle(15, Color.FIREBRICK))
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

        //getGameScene().addUINode(brickTexture);
        textPixels.textProperty().bind(getGameState().intProperty("pixelsMoved").asString());

    }
    

    @Override
    protected void initGameVars(Map<String, Object> vars) {
        vars.put("pixelsMoved", 0);


    }





    public static void main(String[] args) {
        launch(args);



    }

}
