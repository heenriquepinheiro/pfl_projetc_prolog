package org.example;

public class MonsterViewer implements ElementViewer<Monster>{
    @Override
    public void draw(Monster monster, GUI gui) {
        gui.drawMonster(monster.Getposition());
    }
}