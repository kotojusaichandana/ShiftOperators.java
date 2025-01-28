public class ShiftOperatorsDemo {
    public static void main(String[] args) {
        int num = 8; // Example number in binary: 00001000

        // Left Shift Operator
        System.out.println("Left Shift Operator:");
        System.out.println(num + " << 1 = " + (num << 1)); // Shifts bits 1 position to the left
        System.out.println(num + " << 2 = " + (num << 2)); // Shifts bits 2 positions to the left

        // Right Shift Operator
        System.out.println("\nRight Shift Operator:");
        System.out.println(num + " >> 1 = " + (num >> 1)); // Shifts bits 1 position to the right
        System.out.println(num + " >> 2 = " + (num >> 2)); // Shifts bits 2 positions to the right

        // Intentional Error: Using an invalid operand for shifting
        System.out.println("\nInvalid Shift:");
        System.out.println(num + " << -1 = " + (num << -1)); // Intentional error: Negative shift count
    }
}

