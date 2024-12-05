import java.io.*;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.setProduct("Product");
        child.setProductID(123);
        child.setBrand("Brand");

        String fileName = " testChild.txt";
        try{
            FileOutputStream fileOutputStream= new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(child);

            FileInputStream fileInputStream= new FileInputStream(fileName);
            ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
            objectInputStream.readObject();
            System.out.println(child);

        }catch (IOException e){
            System.out.println(e);

        }catch (ClassNotFoundException e){
            System.out.println(e);
        }



    }
}