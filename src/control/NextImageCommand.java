package control;

import java.util.List;
import model.Image;
import view.ImageDisplay;

/**
 *
 * @author sauld
 */

public class NextImageCommand implements Command{
    private final List<Image> images;
    private final ImageDisplay imageDisplay;

    public NextImageCommand(List<Image> images, ImageDisplay imageDisplay) {
        this.images = images;
        this.imageDisplay = imageDisplay;
    }

    
    @Override
    public void execute(){
        imageDisplay.display(next());
    }
    
    private Image next(){
        return images.get(nextIndex());
    }
    private int nextIndex(){
        return (currentIndex() + 1) % images.size();
    }
    private int currentIndex(){
        return images.indexOf(imageDisplay.currentImage());
    }
    
    
}
