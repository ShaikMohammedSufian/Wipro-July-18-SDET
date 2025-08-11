package Day9;


import java.util.Vector;

public class Vectorex {

    public static void main(String[] args) {
        Vector<String> phones = new Vector<>(5);

        phones.add("Nokia");
        phones.add("Samsung");
        phones.add("Apple");
        phones.add("OnePlus");

        phones.add(0, "Lava"); 
        phones.add("Realme");  

        System.out.println(phones);
        System.out.println(phones.remove(0));
        System.out.println(phones);
        System.out.println(phones.get(0));
        System.out.println(phones);
        System.out.println(phones);
        phones.capacity();
        System.out.println(phones);
        System.out.println(phones.isEmpty());
        System.out.println(phones.indexOf("Apple"));
        
        
    }
}

