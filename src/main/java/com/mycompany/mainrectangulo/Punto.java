/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainrectangulo;

/**
 *
 * @author Santiago
 */
public class Punto {
    
    private int x,y;
    
    public Punto(){
        this.x=0;
        this.y=0;
    }
    public Punto(int x,int y){
        if(this.x>=0&&this.y>=0){
            this.x=x;
            this.y=y;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void desplazarXY(int moveX,int moveY){
        if(this.x+moveX>=0&&this.y+moveY>=0){
            this.x+=moveX;
            this.y+=moveY;
        }
    }
    
    public Punto copy(){
        return new Punto(this.x,this.y);
    }
    
    public boolean estaDebajo(Punto puntoExterno){
        
        return (this.y<puntoExterno.getY());
        
    }
    
    public boolean estaDerecha(Punto puntoExterno){
        return (this.x>puntoExterno.getX());
    }
    
    

    @Override
    public boolean equals(Object obj) {
         
        if(this==obj) return true;
        if(obj==null) return false;
        if(getClass()!=obj.getClass()) return false;
        return false;
    }
    
    

    @Override
    public String toString() {
        return "("+x+","+y+")"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
    
}
