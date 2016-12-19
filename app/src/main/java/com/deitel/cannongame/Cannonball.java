package com.deitel.cannongame;

public class Cannonball extends GameElement {
    private float velocityX;
    private boolean onScreen;

    public Cannonball(CannonView view, int color, int soundId, int x,
                      int y, int radius, int velocityX, float velocityY) {
        super(view, color, soundId, x, y, 2 * radius, 2 * radius, velocityY);
        this.velocityX = velocityX;
        onScreen = true;
    }
}
