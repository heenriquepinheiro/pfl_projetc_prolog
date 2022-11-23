
package org.example;

import java.io.IOException;

public interface GUI {
    ACTION getNextAction() throws IOException;

    void drawPac(Position position);

    void drawWall(Position position);

    void drawKey(Position position);

    void drawMonster(Position position);

    void drawText(Position position, String text, String color);

    void clear();

    void refresh() throws IOException;

    void close() throws IOException;

    enum ACTION {UP, RIGHT, DOWN, LEFT, NONE, QUIT, SELECT}
}