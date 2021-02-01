package view;

import model.Image;

/**
 *
 * @author sauld
 */

public interface ImageDisplay {
    void display (Image image);
    
    public Image currentImage();
}