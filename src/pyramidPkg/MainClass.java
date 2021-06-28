/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramidPkg;

import java.util.*;

/**
 *
 * @author SaiF El-deen
 */
public class MainClass {
    
    public static void main(String[] args) throws Exception {
        
        PyramidDAO pDAO = new PyramidDAO();
        List<Pyramid> pyramids = pDAO.readPyramidsFromCSV("C:\\Users\\SaiF El-deen\\Desktop\\JavaITI\\PyramidDAO\\pyramids.csv");
        
        int i = 0;
        for(Pyramid p: pyramids){
            System.out.println("# " + (i++) + ", Pharaoh name:"+ p.pharaoh + ", site name:" + p.site + ", Modern name:" + p.modern_name + ", Height:" + p.height);
                                }
        System.out.println();
                
        Map<String,Integer> sites = pDAO.site_count(pyramids);
        System.out.println(sites);
        
        System.out.println();
        
        List<Pyramid> sorted_pyramids = pDAO.sort(pyramids);
        int y = 0;
        for(Pyramid p: sorted_pyramids){
            System.out.println("# "+(y++)+", Pharaoh name:"+ p.pharaoh + ", site name:" + p.site + ", Modern name:" + p.modern_name + ", Height:" + p.height);
                                       }
        }
   
    
}
    

