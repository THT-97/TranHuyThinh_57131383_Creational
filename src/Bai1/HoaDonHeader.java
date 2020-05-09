/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author TranHuyThinh
 */
public class HoaDonHeader {
    String header;

    public HoaDonHeader() {
        header = "";
    }

    public void setHeader(String header) {
        this.header = header;
    }
    
    @Override
    public String toString() {
        return header + "\n";
    }
    
}
