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

    public Shape() {
        brush = "But chi";
        paper = "Giay A4";
        frame = "Khung Go";
    }
    
    public abstract String draw();

    public void setBrush(String brush) {
        this.brush = brush;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    @Override
    public String toString() {
        return brush +". " + paper + ". " + frame + ". " + draw();
    }
    
}
