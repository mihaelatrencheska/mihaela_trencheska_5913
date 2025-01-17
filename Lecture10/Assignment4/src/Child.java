import javax.imageio.IIOException;
import java.io.*;

public class Child extends Parent implements Serializable {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand + "" + getProduct() + getProductID();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            objectOutputStream.defaultWriteObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        objectOutputStream.writeInt(getProductID());
        objectOutputStream.writeObject(getProduct());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        setProduct(objectInputStream.readInt());
        setProduct((String) objectInputStream.readObject());

    }
}

