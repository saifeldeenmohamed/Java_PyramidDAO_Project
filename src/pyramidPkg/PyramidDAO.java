/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramidPkg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SaiF El-deen
 */
public class PyramidDAO {

    public PyramidDAO() {
    }
    
    public List<Pyramid> readPyramidsFromCSV(String fileName){
        List<Pyramid> pyramids= new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = br.readLine();
            
            if(line != null){
                line = br.readLine();
            }
            
            while(line != null){
                String[] attributes = line.split(",");
                Pyramid pyr = createPyramid(attributes);
                
                pyramids.add(pyr);
                
                line = br.readLine();
            }  
        }catch(IOException ex){
            ex.printStackTrace();
        }
    return pyramids;
    }
    
    public  Pyramid createPyramid(String[] attributes) {
        
        String pharaoh = attributes[0];
        String modern_name = attributes[2];
        String site = attributes[4];
        double height = 0;
        if (attributes[7] != null && attributes[7].length()>0){
            height = Double.parseDouble(attributes[7]);
    }
        
        return new Pyramid(pharaoh , modern_name , site , height);
        
        
    }
    
}
