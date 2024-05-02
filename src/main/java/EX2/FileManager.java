/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX2;

/**
 *
 * @author Wael
 */


import java.io.FileNotFoundException;

 public class FileManager {
    public void readFile(String filePath) throws FileNotFoundException {
        if (!filePath.equals("valid/file/path.txt")) {
            throw new FileNotFoundException("Fichier non trouvé : " + filePath);
        }
    }
}
