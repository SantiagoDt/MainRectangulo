/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainrectangulo;

/**
 *
 * @author Santiago
 */
public class Rectangulo {
    
    private Punto infIzq,supDrch;
    
    public Rectangulo(){
        infIzq=new Punto(0,0);
        supDrch=new Punto(1,1);
    }
    
    public Rectangulo(int base,int altura){
        infIzq=new Punto(0,0);
        supDrch=new Punto(base,altura);
    }
    
    public Rectangulo(Punto infIzq,Punto supDrch){
        this.infIzq=infIzq;
        this.supDrch=supDrch;
    }
    
    public Rectangulo(Rectangulo rectanguloExterno){
        
        this.infIzq=rectanguloExterno.getInfIzq();
        this.supDrch=rectanguloExterno.getSupDrch();
        
    }

    public Punto getInfIzq() {
        return infIzq;
    }

    public void setInfIzq(Punto infIzq) {
        this.infIzq = infIzq;
    }

    public Punto getSupDrch() {
        return supDrch;
    }

    public void setSupDrch(Punto supDrch) {
        this.supDrch = supDrch;
    }
    
    public int getBase(){
        return supDrch.getX()-infIzq.getX();
    }
    
    public int getAltura(){
        return supDrch.getY()-infIzq.getY();
    }
   
    public int getArea(){
        return getBase()*getAltura();
    }
    
    public int perimetro(){
        return (2*getBase()+(2*getAltura()));
    }

    @Override
    public String toString() {
        return ("El rectangulo tiene un punto inferior izquierdo de coordenada"+infIzq+"y coordenada superior izquierda"+supDrch);
    }
    
    
    
    
}