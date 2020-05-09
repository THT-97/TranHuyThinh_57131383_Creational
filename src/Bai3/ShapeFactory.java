/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import Bai3.Shapes.Circle;
import Bai3.Shapes.Rectangle;
import Bai3.Shapes.Shape;
import Bai3.Shapes.ShapeType;
import Bai3.Shapes.Triangle;

/**
 *
 * @author TranHuyThinh
 */
public class ShapeFactory {
    public Shape createShape(ShapeType shapetype){
        switch(shapetype){
            case Triangle: return new Triangle();
            case Rectangle: return new Rectangle();
            case Circle: return new Circle();
        }
        return null;
    }
}
