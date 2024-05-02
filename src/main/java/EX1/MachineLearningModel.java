/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EX1;

/**
 *
 * @author eniso2024-2025
 */
public interface MachineLearningModel {
     public void train(Dataset dataset);
     public double predict(Dataset dataset);
}
