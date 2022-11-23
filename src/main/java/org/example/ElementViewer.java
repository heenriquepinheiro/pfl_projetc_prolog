package org.example;

public interface ElementViewer<T extends Element> {
    void draw(T element, GUI gui);
}