/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramidPkg;

import java.util.List;

/**
 *
 * @author SaiF El-deen
 */
public class MainClass {
    
    public static void main(String[] args){
        
        PyramidDAO pDAO = new PyramidDAO();
        List<Pyramid> pyramids = pDAO.readPyramidsFromCSV("C:\\Users\\SaiF El-deen\\Desktop\\JavaITI\\PyramidDAO\\pyramids.csv");
        
        int i = 0;
        for(Pyramid p: pyramids){
            System.out.println("#"+(i++)+p);
        }
        
    }
    
}
