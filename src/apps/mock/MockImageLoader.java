package apps.mock;

import java.util.ArrayList;
import java.util.List;
import model.Image;
import view.ImageLoader;

/**
 *
 * @author sauld
 */

public class MockImageLoader implements ImageLoader {
    
    @Override
    public List<Image> load(){
        List<Image> list = new ArrayList<>();
        
       list.add(new Image("foto 1"));
       list.add(new Image("foto 2"));
       list.add(new Image("foto 3"));
       
       return list;
    }
}
