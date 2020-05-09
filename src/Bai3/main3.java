/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import Bai3.Shapes.Shape;
import Bai3.Shapes.ShapeType;

/**
 *
 * @author TranHuyThinh
 */
public class main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeFactory sFactory = new ShapeFactory();
        Shape circle = sFactory.createShape(ShapeType.Circle);
        Shape triangle = sFactory.createShape(ShapeType.Triangle);
        Shape rectangle = sFactory.createShape(ShapeType.Rectangle);
        
        System.out.println(circle.draw());
        System.out.println(triangle.draw());
        System.out.println(rectangle.draw());
    }
    
}
