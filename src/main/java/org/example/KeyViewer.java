package org.example;

public class KeyViewer implements ElementViewer<Key>{
    @Override
    public void draw(Key key, GUI gui) {
        gui.drawKey(key.Getposition());
    }
}