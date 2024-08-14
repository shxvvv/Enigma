import java.util.HashMap;
import java.util.Map;

public class Plugboard {
    private Map<Character, Character> wiring = new HashMap<>();

    public void addPlug(char a, char b) {
        wiring.put(a, b);
        wiring.put(b, a);
    }

    public char swap(char c) {
        return wiring.getOrDefault(c, c);
    }
}

