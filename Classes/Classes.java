public class Classes {
    public static void main(String[] args) {
        
        Car toyota = new Car();
        toyota.make = "toyota";
        toyota.model = 2024;
        toyota.color ="silver";
        toyota.varriant = "dual vvti";
        toyota.details();

    }
}

class Car {
    String make;
    int model;
    String varriant;
    String color;

    void details(){
        System.out.println("The make of my car is  " + make + " and variant is " + varriant + " with model and colore " + model + " " + color );
    }
}

// inner classes example 

// public class Classes {
//     public static void main(String[] args) {
//         Classes classes = new Classes();  // Create an instance of the outer class
//         Car toyota = classes.new Car();   // Create an instance of the inner class

//         toyota.make = "Toyota";
//         toyota.model = 2024;
//         toyota.color = "Silver";
//         toyota.variant = "Dual VVTi";
//         toyota.details();
//     }

//     class Car {  // Inner class
//         String make;
//         int model;
//         String variant;
//         String color;

//         void details() {
//             System.out.println("The make of my car is " + make + " and the variant is " + variant + 
//                 " with model and color " + model + " " + color);
//         }
//     }
// }
