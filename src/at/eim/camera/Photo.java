package at.eim.camera;

import java.util.Date;

import at.eim.camera.Camera.Size;

public class Photo {
    
    private Size size;
    private String name;
    private Date date;

    public Photo(Size size, String name, Date date) {
        this.size = size;
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public Date getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

}
