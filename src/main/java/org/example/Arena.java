package org.example;

import java.util.List;

public class Arena {
    private int height;
    private int width;
    Pac pac = new Pac(new Position(10,10));
    List<Monster> monsters;
    List<Wall> walls;
    List<Key> keys;
    public Arena(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    public Pac getPac(){
        return pac;
    }
    public void setPac(Pac pac){
        this.pac = pac;
    }

    public List<Monster> getMonsters() {
        return monsters;
    }
    public void setMonsters(List<Monster> monsters) {
        this.monsters = monsters;
    }
    public List<Wall> getWalls(){
        return walls;
    }

    public void setWalls(List<Wall> walls) {
        this.walls = walls;
    }
    public void setKeys(List<Key> keys){
        this.keys = keys;
    }
}
