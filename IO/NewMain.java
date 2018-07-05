import java.io.*;

public class NewMain {
    public static void main(String[] args) {
        String filename = "serializedPerson.txt";
        Person p = new Person("Bob", 55);

        try (ObjectOutputStream oos = 
            new ObjectOutputStream(new FileOutputStream(filename))) {
                oos.writeObject(p);
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        try (ObjectInputStream ois = 
            new ObjectInputStream(new FileInputStream(filename))) {
                Object q = ois.readObject();
                System.out.println(q);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
    }
}