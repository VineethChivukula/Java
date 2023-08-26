public class CommandLineArgumentsDemo {
    public static void main(String[] args) {
        // Check if any command-line arguments were provided
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
        } else {
            System.out.println("Command-line arguments:");

            // Loop through the provided arguments and print each one
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
    }
}