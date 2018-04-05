
package testgeometricobject;

import java.util.Date;

public class GeometricObject {
    
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    
    // construct a default geometric object
    public GeometricObject(){
        dateCreated = new java.util.Date();
    }
    
    //construct a geometric object with the specified color
    //and filled value
    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    //return a string representation of this object
    @Override
    public String toString(){
        return "created on " + dateCreated + "\ncolor " + color + " and filled: "
                + filled;
    }
    
}
