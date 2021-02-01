package control;

/**
 *
 * @author sauld
 */

public interface Command {
    public void execute();
    
    public static class Null implements Command {
        
        @Override
        public void execute(){}
    }
}