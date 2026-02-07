package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below
        if (a & b) {
            System.out.println("AND");
        }
        if (a && b) {
            System.out.println("short-circuit AND");
        }
        if (a || b) {
            System.out.println("short-circuit OR");
        }
        if (a ^ b) {
            System.out.println("XOR");
        }
        if (!b) {
            System.out.println("NOT");
        }

    }

}

