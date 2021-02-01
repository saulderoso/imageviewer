package control;

/**
 *
 * @author sauld
 */

public class ExitImageCommand implements Command {
    
    @Override
    public void execute(){
        System.exit(0);
    }
}
