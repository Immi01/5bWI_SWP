package at.eim.camera;

import java.util.Scanner;

import at.eim.camera.Camera.Size;

public class CameraCLI {

    private Camera camera;

    public CameraCLI(String manufacturerName, String manufacturerCountry, float focalLength, int capacity, String pixel, int weight, String color, Size size) {

        Manufacturer manufacturer = new Manufacturer(manufacturerName, manufacturerCountry);
        Lens lens = new Lens(focalLength, manufacturer);
        SdCard sdCard = new SdCard(capacity);

        camera = new Camera(pixel, weight, color, size, manufacturer, lens, sdCard);

    }

    public CameraCLI() {
        cameraSetup();
    }
    
    private void cameraSetup() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kamera");
        System.out.println();
        System.out.println("Zum Setup müssen erst folgende Informationen angegeben werden:");
        System.out.println("Auflösung der Kamera:");
        
        String pixel = scanner.nextLine();

        System.out.println();
        System.out.println("Gewicht der Kamera in g:");

        int weight = (int)getNum(scanner, "Geben sie das Gewicht als reine Nummer an z.B. 400");

        System.out.println();
        System.out.println("Farbe der Kamera:");

        String color = scanner.nextLine();

        System.out.println();
        System.out.println("Einstellung der Kamera: 1 für klein (2GB), 2 für mittel (4GB), 3 für groß (6GB):");

        Size size = null;

        switch (getNum(scanner, "Wählen sie eine Nummer zwischen 1 und 3",4,0)) {
            case 1f:
                size = Size.SMALL;
                break;
            case 2f:
                size = Size.MEDIUM;
                break;
            case 3f:
                size = Size.LARGE;
                break;
        
            default:
                break;
        }

        System.out.println();
        System.out.println("Hersteller der Kamera:");

        String manufacturerName = scanner.nextLine();

        System.out.println();
        System.out.println("Land des Herstellers:");

        String manufacturerCoutry = scanner.nextLine();

        System.out.println();
        System.out.println("Brennweite der Kamera im Format '0,0' :");

        float focalLength = getNum(scanner, "Geben sie eine Nummer ein.", true);

        System.out.println();
        System.out.println("Größe der SDCard in GB:");

        int capacity = (int)getNum(scanner, "Geben sie eine Nummer ein.");

        Manufacturer manufacturer = new Manufacturer(manufacturerName, manufacturerCoutry);
        Lens lens = new Lens(focalLength, manufacturer);
        SdCard sdCard = new SdCard(capacity);

        camera = new Camera(pixel, weight, color, size, manufacturer, lens, sdCard);

    }

    public void CLIcicle() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.println();
            System.out.println("wählen sie eine Aktion aus:");
            System.out.println("1. Ein Foto machen");
            System.out.println("2. Alle Fotos anzeigen");
            System.out.println("3. Das xte Foto anzeigen");
            System.out.println("4. Verlassen");
            System.out.println();

            int choice = (int)getNum(scanner, "Wählen Sie eine der 4 Auswahlmöglichkeiten", 5, 0);
            int count = camera.getSdCard().getAmountOfPhotos();

            switch (choice) {
                case 1:
                    try {
                        camera.takePicture();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Name, Größe");
                    for (int i = 0; i < count; i++) {
                        Photo photo = camera.getSdCard().getPhotos(i);
                        System.out.println(photo.getName() + ", " + photo.getSize());
                    }
                    break;
                case 3:
                    String msg = "Es gibt " + count + " Bilder, wählen sie eines dieser Bilder aus";
                    System.out.println(msg);
                    int selection = (int)getNum(scanner, msg);
                    Photo photo = camera.getSdCard().getPhotos(selection);
                    System.out.println(photo.getName() + ", " + photo.getSize());
                    break;
                case 4:
                    return;
            }

        }
    }

    private float getNum(Scanner scanner, String errMsg, int upperBound, int lowerBound, boolean isFloat) {
        float choice = 0;
        boolean err = true;

        while (err) {
            err = false;
            try {
                if (isFloat)
                    choice = scanner.nextFloat();
                else
                    choice = scanner.nextInt();
                err = false;
            } catch (Exception e) {
                err = true;
            }
            scanner.nextLine();
            //System.out.println(lowerBound + " " + choice + " " + upperBound + " " + err);
            if (!(lowerBound<choice && choice<upperBound) || err) {
                System.out.println();
                System.out.println(errMsg);
                err = true;
            }
        }
        
        return choice;
    }

    private float getNum(Scanner scanner, String errMsg, int upperBound, int lowerBound) {
        return getNum(scanner, errMsg, upperBound, lowerBound, false);
    }

    private float getNum(Scanner scanner, String errMsg, boolean isFloat) {
        return getNum(scanner, errMsg, Integer.MAX_VALUE, Integer.MIN_VALUE, isFloat);
    }

    private float getNum(Scanner scanner, String errMsg) {
        return getNum(scanner, errMsg, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

}
