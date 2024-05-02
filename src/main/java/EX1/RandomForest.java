/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX1;

/**
 *
 * @author eniso2024-2025
 */
public class RandomForest extends BaseModel {
    public int numTrees;
    public int maxDepth;

    public RandomForest( String name,int ver, int numT,int maxD) {
        super(name, ver);
        this.numTrees=numT;
        this.maxDepth=maxD;
              
        
    }

     @Override
    public void train(Dataset dataset) {
         System.out.print("TRAINED SUCCESSFULLY");}

    @Override
    public double predict(Dataset dataset) {
        return 9.3;
    }
    
    
    
}
