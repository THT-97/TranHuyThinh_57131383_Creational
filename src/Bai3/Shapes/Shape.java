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
public abstract class Shape {
    private String brush;
    private String paper;
    private String frame;
    
    public abstract String draw();

    @Override
    public String toString() {
        return draw();
    }
    
}
