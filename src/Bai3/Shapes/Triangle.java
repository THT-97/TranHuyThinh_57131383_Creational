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
public class Triangle extends Shape{
    private static Triangle shape;

    protected Triangle() {
    }
    
    public static Triangle createInstance(){
        if(shape == null) shape = new Triangle();
        return shape;
    }
    
    @Override
    public String draw() {
        return "Hinh tam giac";
    }
    
}
