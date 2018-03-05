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
public abstract class AbstractGraph {
    
    public Point start;
    
    public abstract void moveX(int _x)  throws Exception;
    
    public abstract void moveY(int _y)  throws Exception;
}