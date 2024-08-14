public class Main {
    public static void main(String[] args) {
        Rotor rotor1 = new Rotor("EKMFLGDQVZNTOWYHXUSPAIBRCJ", 0);
        Rotor rotor2 = new Rotor("AJDKSIRUXBLHWTMCQGZNPYFVOE", 0);
        Rotor rotor3 = new Rotor("BDFHJLCPRTXVZNYEIWGAKMUSQO", 0);
        Reflector reflector = new Reflector("YRUHQSLDPXNGOKMIEBFZCWVJAT");
        Plugboard plugboard = new Plugboard();
        plugboard.addPlug('A', 'B');
        plugboard.addPlug('C', 'D');

        Rotor[] rotors = {rotor1, rotor2, rotor3};
        EnigmaMachine enigma = new EnigmaMachine(rotors, reflector, plugboard);

        String message = "HELLO";
        StringBuilder encryptedMessage = new StringBuilder();

        for (char c : message.toCharArray()) {
            encryptedMessage.append(enigma.encrypt(c));
        }

        System.out.println("Encrypted message: " + encryptedMessage.toString());
    }
}
