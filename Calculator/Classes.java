// public class Classes {
//     public static void main(String[] args) {
//         Calculator calc = new Calculator();
//         int add = calc.add(7, 7);
//         int sub = calc.sub(9, 5);
//         int mul = calc.mul(9, 4);
//         int div = calc.div(9, 3);
//         System.out.println("The answer of addition is \n" + add);
//         System.out.println("The answer of subtarction is \n" + sub);
//         System.out.println("The answer of addition is \n" + mul);
//         System.out.println("The answer of addition is \n" + div);

//     }
// }

// class Calculator {
//     int add(int a, int b) {
//         return a + b;
//     }

//     int sub(int a, int b) {
//         return a - b;
//     }

//     int mul(int a, int b) {
//         return a * b;
//     }

//     int div(int a, int b) {
//         return a / b;
//     }

// }

public class Classes {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.a =5;
        calc.b =10;
        int add = calc.add();
        int sub = calc.sub();
        int mul = calc.mul();
        int div = calc.div();
        System.out.println("The answer of addition is \n" + add);
        System.out.println("The answer of subtarction is \n" + sub);
        System.out.println("The answer of addition is \n" + mul);
        System.out.println("The answer of addition is \n" + div);

    }
}

class Calculator {
    int a;
    int b;

    int add() {
        return a + b;
    }

    int sub() {
        return a - b;
    }

    int mul() {
        return a * b;
    }

    int div() {
        return a / b;
    }

}