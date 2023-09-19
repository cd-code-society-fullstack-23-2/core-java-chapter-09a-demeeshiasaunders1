package com.codedifferently.partB;

import java.util.ArrayList;

public class Airport {
    private ArrayList<Plane> planes;     //private bc its from a public field. outside is planes bc we have more than one

    public Airport(){
        this.planes = new ArrayList<>(); //saying we can have more than one plane setting the list
        setUp(); //this make sure it has planes
    }

    private void setUp(){
        Plane plane1 = new Plane("Ohio", "8:00pm", 10);
        Plane plane2 = new Plane("Texas", "8:00Am", 12);
        Plane plane3 = new Plane("Paris", "12:00Am", 1);
        planes.add(plane1);
        planes.add(plane2);
        planes.add(plane3);
    }

    public ArrayList<Plane> getPlanes(){
        return planes;
    }

}
