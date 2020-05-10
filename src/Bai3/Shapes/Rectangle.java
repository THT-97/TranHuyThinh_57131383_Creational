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
public class Rectangle extends Shape{

    private static Rectangle shape;

    protected Rectangle() {
    }
    
    public static Rectangle createInstance(){
        if(shape == null) shape = new Rectangle();
        return shape;
    }
    
    @Override
    public String draw() {
        return "Hinh tu giac";
    }
    
}
