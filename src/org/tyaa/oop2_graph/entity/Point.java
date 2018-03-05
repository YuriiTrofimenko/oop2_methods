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
public class Point extends GraphObject {
    
    private int mX;
    private int mY;
    
    /*public Point(){
        
    }*/

    public Point() {}
    
    //Конструктор с параметрами
    public Point(int _x, int _y) throws Exception {
        
        //this.mX = _x;
        if (_x > 0 && _y >= 0) {
            mX = _x;
            mY = _y;
        } else {
            throw new Exception("x and/or y < 0!");
        }
        
        //int test = 0;
        //System.out.println(test);
    }

    public void setX(int _x) throws Exception {
        
        if (_x > 0 ) {
            mX = _x;
        } else {
            throw new Exception("x < 0!");
        }
    }

    public void setY(int _y) {
        
        mY = _y;
    }

    public int getX() {
        return mX;
    }

    public int getY() {
        return mY;
    }

    @Override
    public void moveY(int _y) throws Exception {
        //super.moveY(_y);
        mY = mY + _y;
    }

    @Override
    public void moveX(int _x) throws Exception {
        //super.moveX(_x); //To change body of generated methods, choose Tools | Templates.
        mX = mX + _x;
    }
    
    
}
