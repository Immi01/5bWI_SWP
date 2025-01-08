package at.eim.camera;

public class Lens {
    
    private float focalLength;
    private Manufacturer manufacturer;

    public Lens(float focalLength, Manufacturer manufacturer) {
        this.focalLength = focalLength;
        this.manufacturer = manufacturer;
    }

    public float getLength() {
        return focalLength;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

}
