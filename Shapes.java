/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.github;

/**
 *
 * @author Adrian
 */
public class Shapes {
    
        
   public String name;
   public int length, breath;

    public Shapes(String name,int length, int breath) {
        this.name = name;
        this.length = length;
        this.breath = breath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    @Override
    public String toString() {
        return "Shapes{" + "name=" + name + ", length=" + length + ", breath=" + breath + '}';
    }
    
    
}
