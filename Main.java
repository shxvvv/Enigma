import java.util.HashMap;
import java.util.Map;

class Rotor{
    private String wiring;
    private int position;

    public Rotor(String wiring, int position){
        this.wiring = wiring;
        this.position = position;
    }

    public void setPosition(int position){
        this.position = position;
    }

    public int getPosition(){
        return position;
    }

    public char encryptForward(char c){
        int index = (c - 'A' + position) % 26;
        return wiring.charAt(index);
    }
    
    
}

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");
    }
}
