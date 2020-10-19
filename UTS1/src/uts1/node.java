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
public class node {
    
     private String angka;
    private node nextNode;

    public String getAngka() {
        return angka;
    }

    public void setAngka(String angka) {
        this.angka = angka;
    }

    public node getNextNode() {
        return nextNode;
    }
    public void setNextNode(node nextNode) {
        this.nextNode = nextNode;
    }
}
