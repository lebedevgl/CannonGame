package com.deitel.cannongame;

public class Blocker extends GameElement {
    private int missPenalty;

    public Blocker(CannonView view, int color, int missPenalty, int x,
                   int y, int width, int height, float velocityY) {
        super(view, color, CannonView.BLOCKER_SOUND_ID, x, y, width, height,
                velocityY);
        this.missPenalty = missPenalty;
    }

    public int getMissPenalty() {
        return missPenalty;
    }
}
