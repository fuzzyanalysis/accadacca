package com.fuzzyanalysis.accadacca.view;


import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class MegaMenuView {
  
    private String orientation = "vertical";
 
    public String getOrientation() {
        return orientation;
    }
 
    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }
}
