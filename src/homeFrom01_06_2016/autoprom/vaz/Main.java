package homeFrom01_06_2016.autoprom.vaz;

import homeFrom01_06_2016.autoprom.comparator.AutoNumberComparator;
import org.codehaus.jackson.map.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 05.06.2016.
 */
public class Main {
//    private static  autoprom;

    public static void main(String[] args) throws IOException, ClassNotFoundException, JAXBException {


        ArrayList<Auto> autoprom = new ArrayList<Auto>();
        Auto a = new Auto("Vasia", TypeAuto.CROSSOVER, 2623153, Color.GREEN);
        autoprom.add(new Auto("Petia", TypeAuto.LANDAU, 1564713, Color.GREEN));
        autoprom.add(new Auto("Aklesey", TypeAuto.SEDAN, 1622314, Color.BLACK));
        autoprom.add(new Auto("Viktor"));
        autoprom.add(new Auto("Andey", Color.GREEN, TypeAuto.CABRIOLET, 1135623));
        autoprom.add(new Auto("Vasia", 1635623, Color.GREEN));
        autoprom.add(a);
        for (int i = 0; i < 5; i++) {
            autoprom.add(new Auto());
        }
        for (Auto anAutoprom : autoprom) {
            System.out.println(anAutoprom);
        }
        System.out.println("BIG price");
        int temp = 0;
        for (int i = 0; i < autoprom.size(); i++) {
            if (autoprom.get(i).getPrice() > autoprom.get(temp).getPrice())
                temp = i;
        }
        System.out.println(autoprom.get(temp));
        System.out.println("colors");
        Collections.sort(autoprom);

        for (Auto auto : autoprom) {
            System.out.println(auto.getPrice());
        }
        System.out.println();
        System.out.println();

        Collections.sort(autoprom, (o1, o2) -> Integer.compare(o1.getPrice(), o2.getPrice()));
        for (Auto auto : autoprom) {
            System.out.println(auto.getPrice());
        }
        Collections.sort(autoprom, new AutoNumberComparator());
        System.out.println();
        for (Auto auto : autoprom) {
            System.out.println(auto.getNumber());
        }
        serialize(autoprom, "autoprom");
        ArrayList<Auto> newAutoprom = deserialize("autoprom");
        for (Auto s :
                newAutoprom) {
            System.out.println(s);
        }
        marshaling(new Marshaling(autoprom));
        ArrayList<Auto> arrayList = unmarshallingEx();
        for (Auto sas : arrayList) {
            System.out.println(sas);
        }
        json(new Marshaling(autoprom));


    }

    private static void serialize(ArrayList<Auto> myArray, String fileName) throws IOException {
        FileOutputStream fileOut =
                new FileOutputStream(fileName + ".ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(myArray);
        out.close();
        fileOut.close();
        System.out.printf("Serialized data is saved in %-15s\n", fileName);

    }

    private static ArrayList<Auto> deserialize(String fileName)
            throws IOException, ClassNotFoundException {

        FileInputStream fileIn = new FileInputStream(fileName + ".ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        ArrayList<Auto> newArray = (ArrayList<Auto>) in.readObject();
        in.close();
        fileIn.close();

        System.out.printf("Deserialized %-15s\n", fileName);
        return newArray;

    }


    private static void marshaling(Marshaling marsh) throws JAXBException {

        JAXBContext ctx = JAXBContext.newInstance(Marshaling.class);
        Marshaller msh = ctx.createMarshaller();
        msh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        msh.marshal(marsh, System.out);
        msh.marshal(marsh, new File("autoprom.xml"));
    }
    public static ArrayList<Auto> unmarshallingEx() throws JAXBException {
        File file = new File("autoprom.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Marshaling.class);

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Marshaling array = (Marshaling) unmarshaller.unmarshal(file);
        return array.getAutoprom();
    }
    private static void json(Marshaling marsh){
        ObjectMapper mapper = new ObjectMapper();

        try{
            mapper.writeValue(new File("autoprom.json"),marsh);
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(marsh));
            System.out.println("\nReading from file:");

            Marshaling newMars = mapper.readValue(new File("autoprom.json"), Marshaling.class);
            System.out.println(newMars);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}