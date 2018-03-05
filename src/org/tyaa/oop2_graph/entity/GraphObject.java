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
public class GraphObject {
    
    public Point start;
    
    public void moveX(int _x) throws Exception{
        
        start.setX(start.getX() + _x);
    }
    
    public void moveY(int _y) throws Exception{
        
        start.setY(start.getY() + _y);
    }
}
