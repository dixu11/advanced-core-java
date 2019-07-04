package serialization.standard;

import java.io.*;

public class Demo {

    public static void main(String[] args) {
        Personik personik1 = new Personik("Kasia");
        Personik personik2 = new Personik("Daniel");

        try(FileOutputStream fs = new FileOutputStream("nazwa.bin")){
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(personik1);
            os.writeObject(personik2);

            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fs = new FileInputStream("nazwa.bin")){
            ObjectInputStream os = new ObjectInputStream(fs);
            System.out.println(os.readObject());
            System.out.println(os.readObject());

            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }



}

class Personik implements Serializable {
    private String imie;

    public Personik(String imie) {
        this.imie = imie;
    }

    @Override
    public String toString() {
        return "Personik{" +
                "imie='" + imie + '\'' +
                '}';
    }
}
