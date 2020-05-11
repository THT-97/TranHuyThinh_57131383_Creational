/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author TranHuyThinh
 */
public class main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStringBuilder Chuoi = new MyStringBuilder.Builder()
                                    .addString("Nhiet do: ")
                                    .addFloat(25.995f)
                                    .addString("C" + "\t")
                                    .addString("Nuoc soi o 100C: ")
                                    .addBool(true)
                                    .build();
        
        System.out.println(Chuoi.toString());
    }
    
}
