package org.example;

public class PacViewer implements ElementViewer<Pac> {
    @Override
    public void draw(Pac pac, GUI gui) {
        gui.drawMonster(pac.Getposition());
    }
}