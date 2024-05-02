/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX1;

/**
 *
 * @author eniso2024-2025
 */
public class SupportVectorMachine extends BaseModel {   
    public  int iterations;
    public  double learningRate ;

    public SupportVectorMachine( String name,int ver, int it, double lr) {
        super(name,ver);
        this.iterations=it;
        this.learningRate=lr;
    }



    @Override
    public void train(Dataset dataset) {
         System.out.print("TRAINED SUCCESSFULLY");
    }

    @Override
    public double predict(Dataset dataset) {
     return 9.3;
    }
    
    
}
