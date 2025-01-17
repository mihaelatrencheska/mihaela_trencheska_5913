package library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Book>books= new ArrayList<>();
        List<Magazine>magazines= new ArrayList<>();


        while (true){
            System.out.println("\nLibrary Menu: ");
            System.out.println(" 1.Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. Display all publications");
            System.out.println("4. Find oldest publication");
            System.out.println("5. Find newest publication");
            System.out.println("6. Calculate average publication fee");
            System.out.println("7.Exit");

            System.out.println("Enter your choice; ");
            int choice=scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case  1:
                System.out.println("Enter Book title: ");
                String bookTitle= scanner.nextLine();
                System.out.println("Enter publisher: ");
                String bookPublisher= scanner.nextLine();
                System.out.println("Enter book publication year: ");
                int bookPublicationYear= scanner.nextInt();
                System.out.println("Enter Publisher: ");
                String bookpublisher= scanner.nextLine();

                case 2:

                System.out.print("Enter Magazine issue number: ");
                int issueNumber = scanner.nextInt();
                System.out.println("Enter monthly printed ");
                magazines.add(new Magazine(issueNumber));
                break;

                case 3:

                    System.out.println("\nBooks:");
                    for (Book book : books) {
                        book.printDetails();
                    }
                    System.out.println("\nMagazines:");
                    for (Magazine magazine : magazines) {
                        magazine.printDetails();
                    }
                    break;
                case 4:

                    Book oldestItem = null;
                    int oldestYear = Integer.MAX_VALUE;
                    for (Book book : books) {
                        if (book.publicationYear < oldestYear) {
                            oldestItem = book;
                            oldestYear = book.publicationYear;
                        }
                    }
                    for (Magazine magazine : magazines) {
                        if (magazine.publicationYear < oldestYear) {
                            oldestItem = magazine;
                            oldestYear = magazine.publicationYear;
                        }
                    }
                    System.out.println("Oldest item: ");
                    oldestItem.printDetails();
                    break;

                case 5:

                    Book newestBook = null;
                    int newestYear= Integer.MAX_VALUE;
                    for (Book book : books) {
                        if (book.publicationYear < newestYear) {
                           newestBook = book;
                           newestBook = book.publicationYear;
                        }
                        for (Magazine magazine : magazines) {
                            if (magazine.publicationYear < oldestYear) {
                                newestBook = magazine;
                                newestYear = magazine.publicationYear;
                            }
                        }

                    }
                    System.out.println("Newest Book: ");
                    newestBook.printDetails();
                    break;

                case 6:
                    double totalPublicationFee=0;
                    int itemCount=0;

                    for(book.Book book : books){
                        totalPublicationFee += book.getPublicationFee;
                        itemCount++;
                    }
                    for(book.Book magazine: magazines){
                        totalPublicationFee += book.getPublicationFee;
                        itemCount++;
                }
                    if (itemCount>0){
                        double averagePublicationFee= totalPublicationFee /itemCount;
                        System.out.println("Average publication fee: ");
                    }

                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
            }
        }
    }
}


