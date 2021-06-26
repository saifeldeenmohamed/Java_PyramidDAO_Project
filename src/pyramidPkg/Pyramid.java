/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramidPkg;

/**
 *
 * @author SaiF El-deen
 */
public class Pyramid {
    
    String pharaoh;
    String modern_name;
    String site;
    double height;

    public Pyramid(String pharaoh, String modern_name, String site, double height) {
        this.pharaoh = pharaoh;
        this.modern_name = modern_name;
        this.site = site;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Pyramid {" + "pharaoh=" + pharaoh + ", modern_name=" + modern_name + ",site= " + site + ",height=" + height +"}" ;
    }
    
    public String getPharaoh() {
        return pharaoh;
    }

    public void setPharaoh(String pharaoh) {
        this.pharaoh = pharaoh;
    }

    public String getModern_name() {
        return modern_name;
    }

    public void setModern_name(String modern_name) {
        this.modern_name = modern_name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
}
