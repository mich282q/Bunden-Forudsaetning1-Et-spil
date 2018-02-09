package com.myname;
import javafx.scene.paint.Color;

/* Et mønt-objekt kommer til at repræsentere en enkelt mønt. */
public class Coin {

    /* Note: en mønt ser pt. sådan ud:

    Entities.builder()
    .type(EntityType.COIN)
    .at(10, 40)
    .viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())))
    .with(new CollidableComponent(true))
    .buildAndAttach(getGameWorld());

     Dvs at mønt-klassen skal have følgende egenskaber:
     Type: EntityType.COIN
     PlaceringX: 10
     PlaceringY: 40
     Radius (Størrelse): 15
     Farve: Random Color
     Collidable: True
     Er i spillet: Ja

    Her definerer vi så de tilsvarende egenskaber (instansvariabler):
     */

    private BasicGameApp.EntityType entityType;
    private int placeringX, placeringY, radius;
    private Color color;
    private Boolean collidable, erISpillet;

    /* Noarg constructor, giver standardværdier for mønten */
    public Coin() {
        placeringX = 0;
        placeringY = 0;
        entityType = BasicGameApp.EntityType.COIN;
        radius = 15;
        color = Color.color(Math.random(), Math.random(), Math.random());
        collidable = true;
        erISpillet = true;
    }

    /* En konstruktor, hvor man kan sætte position fra starten */
    public Coin(int placeringX, int placeringY) {
        this.placeringX = placeringX;
        this.placeringY = placeringY;
        entityType = BasicGameApp.EntityType.COIN;
        radius = 15;
        color = Color.color(Math.random(), Math.random(), Math.random());
        collidable = true;
        erISpillet = true;
    }

    /* Coin metoder: set&get for X,Y, radius og farve */

    public int getPlaceringX() {
        return placeringX;
    }

    public void setPlaceringX(int placeringX) {
        this.placeringX = placeringX;
    }

    public int getPlaceringY() {
        return placeringY;
    }

    public void setPlaceringY(int placeringY) {
        this.placeringY = placeringY;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public BasicGameApp.EntityType getEntityType() {
        return entityType;
    }

    public Boolean getCollidable() {
        return collidable;
    }

    public Boolean getErISpillet() {
        return erISpillet;
    }
}
