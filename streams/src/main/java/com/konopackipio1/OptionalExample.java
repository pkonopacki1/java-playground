package com.konopackipio1;

import java.util.Optional;

class Computer {

}

public class OptionalExample {
    public static void main(String[] args) {
        testOptionalCreation();
        

    }

    private static void testOptionalCreation() {
        // Empty optional
        Optional<Computer> computer = Optional.empty();

        // Not nullable, exception will be thrown
        try {
            Optional<Computer> computer2 = Optional.of(null);
        } catch (NullPointerException e) {
            System.err.println("Opitonal.of can't hold null");
        }

        // Nullable
        Optional<Computer> computer3 = Optional.ofNullable(null);
    }
    
}
