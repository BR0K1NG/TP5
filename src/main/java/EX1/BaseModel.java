/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX1;

/**
 *
 * @author eniso2024-2025
 */
abstract class BaseModel implements MachineLearningModel {
    protected String name;
    public int version;
    public String description ;
    public String device= "cpu";

    public BaseModel(String name,int ver) {
        this.version=ver ;
        this.name=name;
    }
    public void displayDetails() {
        System.out.println("NAME: "+this.name+"\t"+"DESC: "+this.description+"\t"+"VER: "+this.version);
    }
}
