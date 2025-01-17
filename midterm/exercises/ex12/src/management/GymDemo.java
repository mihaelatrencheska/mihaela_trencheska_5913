package management;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class GymDemo {

    public static Member registerMember(String name, String membershipType, int age) {
        // Generate random 4-digit ID
        String id = "M-" + String.format("%04d", new Random().nextInt(10000));
        return new Member(id, name, membershipType, age);
    }

    public static void displayMember(Member member) {
        System.out.println(member);
    }

    public static void main(String[] args) {
        // List of 8 member names
        List<String> memberNames = Arrays.asList(
                "John", "Jane", "Michael", "Sarah", "David", "Emily", "Daniel", "Olivia");

        // Create list of Member objects using streams
        List<Member> members = memberNames.stream()
                .map(name -> registerMember(name,
                        new Random().nextBoolean() ? "Basic" : "Premium", // Random membership type
                        18 + new Random().nextInt(43))) // Random age between 18 and 60
                .collect(Collectors.toList());

        // Print all member details
        System.out.println("All Members:");
        members.forEach(GymDemo::displayMember);

        // Filter Premium members above 30 years of age and display
        System.out.println("\nPremium Members above 30 years:");
        members.stream()
                .filter(member -> "Premium".equals(member.getMembershipType()) && member.getAge() > 30)
                .forEach(GymDemo::displayMember);
    }
}
