package at.eim.camera;

import java.util.Date;

public class Camera {

    private String pixel;
    private int weight;
    private String color;
    public enum Size {
        SMALL,
        MEDIUM,
        LARGE
    };
    private Size setting;
    private Manufacturer manufacturer;
    private Lens lens;
    private SdCard sdCard;

    public Camera(String pixel, int weight, String color, Size setting, Manufacturer manufacturer, Lens lens, SdCard sdCard) {
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.setting = setting;
        this.manufacturer = manufacturer;
        this.lens = lens;
        this.sdCard = sdCard;
    }

    public void takePicture() throws Exception{

        Exception notEnoughSpace = new Exception("Nicht genügend Speicherplatz verfügbar!");
        int remainingSpace = sdCard.getCapacity() - sdCard.getSize();

        switch (setting) {
            case SMALL:
                if (remainingSpace < 2)
                    throw notEnoughSpace;
                break;

            case MEDIUM:
                if (remainingSpace < 4)
                    throw notEnoughSpace;
                break;

            case LARGE:
                if (remainingSpace < 6)
                    throw notEnoughSpace;
                break;
        }

        if (remainingSpace < 8)
            System.out.println("Warnung: nur noch " + remainingSpace + "GB Speicherplatz verfügbar!");

        Date today = new Date();
        String name = "IMG" + sdCard.getAmountOfPhotos() + " " + today.toString();

        sdCard.setPhoto(new Photo(setting, name, today));

        System.out.println("Das Foto '" + name + "' wurde erfolgreich aufgenommen.");
    }

    public String getPixel() {
        return pixel;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Lens getLens() {
        return lens;
    }

    public SdCard getSdCard() {
        return sdCard;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

}
