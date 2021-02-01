package apps.mock;

import control.Command;
import control.InitCommand;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import model.Image;
import view.ImageDisplay;

/**
 *
 * @author sauld
 */

public class Main {
    private final static Command NullCommand = new Command.Null();
    private final Scanner scanner = new Scanner(System.in);
    private final Map<String, Command> commands = new HashMap<>();
    
    public static void main(String[] args){
        new Main().execute();
    }
    
    public Main(){
        List<Image> images = new MockImageLoader().load();
        ImageDisplay imageDisplay = new MockImageDisplay();
        InitCommand init = new InitCommand(images, imageDisplay);
        init.execute();
        commands.putAll(init.getCommands());
    }
    
    private String input(){
        return scanner.next().toUpperCase();
    }
    
    private void execute(){
        while (true) commands.getOrDefault(input(), NullCommand).execute();
    }
    
    
}
