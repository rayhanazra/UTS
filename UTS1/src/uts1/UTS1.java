/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts1;

/**
 *
 * @author ASUS
 */
public class UTS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      linkedlist ll = new linkedlist();
      ll.add("10");
      ll.add("10");
      ll.add("10");
      

      System.out.println(ll.txt());
      ll.remove("10");
      System.out.println(ll.txt());
      System.out.println(ll.contains("200"));
    }
    
}
