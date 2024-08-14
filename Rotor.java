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

    public char encryptBackward(char c){
        int index = wiring.indexOf(c);
        return (char)((index-position+26)%26 +'A');
    }

    public void step(){
        position = (position + 1)%26;
    }
}

