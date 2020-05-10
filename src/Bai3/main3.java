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
        
        System.out.println("Factory: ");
        System.out.println(circle.toString());
        System.out.println(triangle.toString());
        System.out.println(rectangle.toString());
        
        //Singleton test
        System.out.println("\n" + "Singleton test:");
        Shape circle2 = sFactory.createShape(ShapeType.Circle);
        Shape triangle2 = sFactory.createShape(ShapeType.Triangle);
        Shape recShape2 = sFactory.createShape(ShapeType.Rectangle);
        
        circle2.setPaper("Giay A0");
        triangle2.setBrush("But muc");
        recShape2.setFrame("Khung Sat");
        
        System.out.println(circle.toString());
        System.out.println(triangle.toString());
        System.out.println(rectangle.toString());
    }
    
}
