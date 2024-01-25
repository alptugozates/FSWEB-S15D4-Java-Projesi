import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimalNumber = 6;
        String binaries = convertToBinary(decimalNumber);
        System.out.println("Decimal: " + decimalNumber + " Binary: " + binaries);
    }
    public static String convertToBinary(int decimal) {
        Stack<Integer> binaryStack = new Stack<>();

        while (decimal > 0) {
            int remainder = decimal % 2;
            binaryStack.push(remainder);
            decimal = decimal / 2;
        }
        StringBuilder binaries = new StringBuilder();
        while(!binaryStack.isEmpty()) {
            binaries.append(binaryStack.pop());
        }
        return binaries.toString();
    }

}
