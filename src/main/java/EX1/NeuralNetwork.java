/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX1;

/**
 *
 * @author eniso2024-2025
 */
public class NeuralNetwork extends BaseModel {
    public  int[] layers ;
    public  String activationFunction ;

    public NeuralNetwork(String name, int ver,int[] layers, String activations) {
        super(name, ver);
        this.name=name;
        this.layers=layers;
        this.activationFunction=activations;
    }
  
    
         @Override
    public void train(Dataset dataset) {
         System.out.print("TRAINED SUCCESSFULLY");}

    @Override
    public double predict(Dataset dataset) {
        return 9.3;
    }
}
