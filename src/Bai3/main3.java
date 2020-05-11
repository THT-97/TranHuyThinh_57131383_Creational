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
        ShapeFactory Factory = new ShapeFactory();
        Shape Circ = Factory.createShape(ShapeType.Circle);
        Shape Tri = Factory.createShape(ShapeType.Triangle);
        Shape Rect = Factory.createShape(ShapeType.Rectangle);
        
        System.out.println("Factory: ");
        System.out.println(Circ.toString());
        System.out.println(Tri.toString());
        System.out.println(Rect.toString());
        
        //Singleton test
        System.out.println("\n" + "Singleton test:");
        Shape Circ2 = Factory.createShape(ShapeType.Circle);
        Shape Tri2 = Factory.createShape(ShapeType.Triangle);
        Shape Rect2 = Factory.createShape(ShapeType.Rectangle);
        
        Circ2.setPaper("Giay A0");
        Tri2.setBrush("But muc");
        Rect2.setFrame("Khung Sat");
        
        System.out.println(Circ.toString());
        System.out.println(Tri.toString());
        System.out.println(Rect.toString());
    }
    
}
