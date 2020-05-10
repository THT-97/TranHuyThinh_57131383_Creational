/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3.Shapes;

/**
 *
 * @author TranHuyThinh
 */
public class Circle extends Shape{
    
    private static Circle shape;

    protected Circle() {
    }
    
    public static Circle createInstance(){
        if(shape == null) shape = new Circle();
        return shape;
    }
    
    @Override
    public String draw() {
        return "Hinh tron";
    }
    
}
