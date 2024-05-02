/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX1;

/**
 *
 * @author eniso2024-2025
 */
abstract class Dataset {
    protected boolean isTrain;
    protected String path;
    public Dataset(String path,boolean isTrain){
        this.path=path;
        this.isTrain=isTrain;
    }
    public abstract void loadData();
    public abstract void preTreatmentData();
    
}
