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
//public class Rectangle extends GraphObject  implements IScalable {
//public class Rectangle {
public class Rectangle extends AbstractGraph  implements IScalable {
    
    //public Point start;
    public int height;
    public int width;
    
    public int getS(){
        return height * width;
    }

    @Override
    public void scale(int _sc) {
        height *= _sc;
        width *= _sc;
    }
    
    @Override
    public String toString() {
        return "x = " + start.getX() + "; y = " + start.getY()
                + "height = " + height + "; width = " + width; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moveX(int _x) throws Exception {
        start.setX(start.getX() + _x);
    }

    @Override
    public void moveY(int _y) throws Exception {
        start.setY(start.getY() + _y);
    }
}
