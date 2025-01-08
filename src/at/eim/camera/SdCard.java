package at.eim.camera;

import java.util.ArrayList;
import java.util.List;

public class SdCard {
    
    private int capacity;
    private List<Photo> photos = new ArrayList<>();

    public SdCard(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public Photo getPhotos(int index) {
        return this.photos.get(index);
    }

    public int getAmountOfPhotos() {
        return photos.size();
    }

    public int getSize() {
        int size = 0;
        for (Photo photo : photos) {
            switch (photo.getSize()) {
                case SMALL:
                    size += 2;
                    break;
                case MEDIUM:
                    size += 4;
                    break;
                case LARGE:
                    size += 6;
                    break;
            }
        }
        return size;
    }

    public void setPhoto(Photo photo) {
        this.photos.add(photo);
    }

}
