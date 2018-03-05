/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.oop2_graph;

import org.tyaa.oop2_graph.entity.*;

/**
 *
 * @author student
 */
public class Oop2_graph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        /*//int x = 10;
        Point p = new Point();
        //Point p = new Point(10, 20);
        //p.x = 10;
        //p.y = 20;
        
        System.out.printf("x = %d; y = %d\n", p.getX(), p.getY());
        
        p.setX(50);
        p.setY(100);
        
        System.out.printf("x = %d; y = %d\n", p.getX(), p.getY());
        
        Rectangle rect1 = new Rectangle();
        rect1.start = new Point(30, 40);
        rect1.height = 100;
        rect1.width = 150;
        
        //System.out.println(rect1.getS());
        //int result = rect1.getS();
        //System.out.println(result);
        
        System.out.printf("x = %d; y = %d\n", rect1.start.getX(), rect1.start.getY());
        
        rect1.moveX(100);
        
        System.out.printf("x = %d; y = %d\n", rect1.start.getX(), rect1.start.getY());
        
        //System.out.println(rect1.toString());
        
        //System.out.println(Math.PI);
        
        Point p2 = new Point(10, 10);
        p2.moveX(20);
        p2.moveY(30);
        System.out.println(p2.getX() + " " + p2.getY());*/
        
        Rectangle rect1 = new Rectangle();
        rect1.start = new Point(30, 40);
        rect1.height = 100;
        rect1.width = 150;
        
        Rectangle rect2 = new Rectangle();
        rect2.start = new Point(10, 20);
        rect2.height = 200;
        rect2.width = 300;
        
        Circle c1 = new Circle();
        c1.r = 22;
        c1.start = new Point(44, 58);
        
        Circle c2 = new Circle();
        c2.r = 24;
        c2.start = new Point(67, 18);
        
        IScalable[] arr =
                new IScalable[]{rect1, rect2, c1, c2};
        
        for (IScalable iScalable : arr) {
            System.out.println(iScalable.toString());  
        }
        
        for (int i = 0; i < arr.length; i++) {
            arr[i].scale(2);
            i++;
        }
        
        for (IScalable iScalable : arr) {
            System.out.println(iScalable.toString());  
        }
        
        System.out.println(arr[1].toString());
    }
    
}
