/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.ArrayList;

/**
 *
 * @author TranHuyThinh
 */
public class HoaDon {
    
    HoaDonHeader header;
    ArrayList<CTDH> chiTiet;

    protected HoaDon(Builder builder) {
        this.header = builder.header;
        this.chiTiet = builder.chiTiet;
    }

    @Override
    public String toString() {
        String hdStr = header.toString();
        for (int i = 0; i < chiTiet.size(); i++) {
            hdStr +=  chiTiet.get(i).toString();
        }
        return hdStr;
    }
    
    public static class Builder{

        HoaDonHeader header;
        ArrayList<CTDH> chiTiet;

        public Builder() {
            header = new HoaDonHeader();
            chiTiet = new ArrayList<>();
        }
        
        public Builder addHeader(String header){
            this.header.setHeader(header);
            return this;
        }
        
        public Builder addCTDH(String chiTiet){
            this.chiTiet.add(new CTDH(chiTiet));
            return this;
        }
        
        public HoaDon build(){
            return new HoaDon(this);
        }
        
    }
}
