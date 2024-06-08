/*class Animal {
    public void displayInfo() {
        System.out.println("an animal.");
    }
}

class Dog extends Animal {
    @Override
    public void displayInfo() {
        System.out.println("a dog.");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
    }
}
*/
        import java.util.*;

class Main {
    @SuppressWarnings("unchecked")
    static void wordsList() {
        ArrayList wordList = new ArrayList<>();

// This causes an unchecked warning
        wordList.add("Hi whatsapp!");

        System.out.println("Word list => " + wordList);
    }

    public static void main(String args[]) {
        wordsList();
    }
}