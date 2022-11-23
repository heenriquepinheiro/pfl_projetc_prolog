
package org.example;

public abstract class Element extends Position{
    private Position position;

    public Element(Position p){
        super(p);
    }

    public Position Getposition(){
        return this.position;
    }

    public void Setposition (Position p){
        this.position=p;
    }


}