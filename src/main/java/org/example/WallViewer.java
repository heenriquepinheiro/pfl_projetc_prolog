package org.example;

public class WallViewer implements ElementViewer<Wall>{
    @Override
    public void draw(Wall wall, GUI gui) {
        gui.drawWall(wall.Getposition());
    }
}