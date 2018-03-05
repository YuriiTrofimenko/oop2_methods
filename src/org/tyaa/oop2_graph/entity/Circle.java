/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.oop2_graph.entity;

/**
 *
 * @author student
 */
//public class Circle extends GraphObject {
//public class Circle {
public class Circle extends AbstractGraph implements IScalable{
    
    public int r;
    
    public double getS(){
        return Math.PI * r * r;
    }

    @Override
    public void moveX(int _x) throws Exception {
        start.setX(start.getX() + _x);
    }

    @Override
    public void moveY(int _y) {
        start.setY(start.getY() + _y);
    }

    @Override
    public void scale(int _sc) {
        r *= _sc;
    }

    @Override
    public String toString() {
        return "r = " + r + "; x = " + start.getX() + "; y = " + start.getY(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
