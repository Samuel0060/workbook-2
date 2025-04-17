package AddressBuilder;

import java.util.Scanner;

public class addressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the following information:\nFull Name: ");
        String fullName = scanner.nextLine();

        System.out.println("Billing Street: ");
        String billingStreet = scanner.nextLine();

        System.out.println("Billing city: ");
        String billingCity = scanner.nextLine();

        System.out.println("Billing state: ");
        String billingState = scanner.nextLine();

        System.out.println("Billing zip: ");
        String billingZip = scanner.nextLine();

        String fullAddress = buildAddress(fullName, billingStreet, billingCity, billingState, billingZip);

        System.out.printf("%s\n\nBilling Address: \n%s\n", fullName, fullAddress);
    }

    @SuppressWarnings("StringBufferReplaceableByString")
    public static String buildAddress(String name, String street, String city, String state, String zip){
        StringBuilder skills = new StringBuilder();

        skills.append(street).append("\n");
        skills.append(city).append(", ").append(state).append(" ").append(zip);

        return skills.toString();
    }
}
