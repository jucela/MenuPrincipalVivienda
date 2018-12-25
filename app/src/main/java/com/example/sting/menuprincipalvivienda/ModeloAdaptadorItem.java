package com.example.sting.menuprincipalvivienda;

public class ModeloAdaptadorItem {

    private int iconoitem;
    private String nombreitem;

    public ModeloAdaptadorItem(int iconoitem, String nombreitem) {
        this.iconoitem = iconoitem;
        this.nombreitem = nombreitem;
    }

    public int getIconoitem() {
        return iconoitem;
    }

    public void setIconoitem(int iconoitem) {
        this.iconoitem = iconoitem;
    }

    public String getNombreitem() {
        return nombreitem;
    }

    public void setNombreitem(String nombreitem) {
        this.nombreitem = nombreitem;
    }
}
