public class EnigmaMachine {
    private Rotor[] rotors;
    private Reflector reflector;
    private Plugboard plugboard;

    public EnigmaMachine(Rotor[] rotors, Reflector reflector, Plugboard plugboard) {
        this.rotors = rotors;
        this.reflector = reflector;
        this.plugboard = plugboard;
    }

    public char encrypt(char c) {
        c = plugboard.swap(c);

        for (Rotor rotor : rotors) {
            c = rotor.encryptForward(c);
        }

        c = reflector.reflect(c);

        for (int i = rotors.length - 1; i >= 0; i--) {
            c = rotors[i].encryptBackward(c);
        }

        c = plugboard.swap(c);

        stepRotors();

        return c;
    }

    private void stepRotors() {
        boolean rotateNext = true;
        for (Rotor rotor : rotors) {
            if (rotateNext) {
                rotor.step();
                rotateNext = rotor.getPosition() == 0;
            } else {
                break;
            }
        }
    }
}

