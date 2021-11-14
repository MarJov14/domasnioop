package paricka.oop.marija;

import java.util.Scanner;

class brojac {
    private int glava = 0;
    private int pismo = 0;
    
    public void add(String tip) {
        if (tip == "glava") glava++;
        else if (tip == "pismo") pismo++;
    }
    
    public String getResults() {
        return "Glava: " + glava + "\nPismo: " + pismo;
    }
    
    public void reset() {
        glava = 0;
        pismo = 0;
    }
}

