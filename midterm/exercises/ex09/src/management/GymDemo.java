package management;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GymDemo {
    public static void main(String[] args) {
        List<String> memberNames = Arrays.asList(
                "Alice", "Bob", "Charlie", "Diana", "Eve", "Frank", "Grace", "Hank"
        );

        List<Member> members = memberNames.stream().map(name -> {
            String id = "M-" + (int) (Math.random() * 9000 + 1000);
            String membershipType = Math.random() > 0.5 ? "Premium" : "Basic";
            int age = (int) (Math.random() * 43 + 18);
            return new Member(id, name, membershipType, age);
        }).collect(Collectors.toList());

        members.forEach(System.out::println);

        List<Member> filteredMembers = members.stream()
                .filter(member -> "Premium".equals(member.getMembershipType()) && member.getAge() > 30)
                .collect(Collectors.toList());

        System.out.println("\nPremium members above 30 years old:");
        filteredMembers.forEach(System.out::println);
    }
}