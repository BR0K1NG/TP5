/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX1;

/**
 *
 * @author eniso2024-2025
 */
public class ClassificationDataset extends Dataset  {
    public  String[] labels;
    public int numClasses;
   public ClassificationDataset(String path,boolean isTrain) {
        super(path, isTrain);
   
    }

    @Override
    public void loadData() {
    System.out.print("DATA LOADED SUCCESSFULLY");
    }

    @Override
    public void preTreatmentData() {
    System.out.print("DATA PRE-TREATED SUCCESSFULLY");
    }
    
}
