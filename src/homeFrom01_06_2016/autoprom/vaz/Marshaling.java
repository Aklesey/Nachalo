package homeFrom01_06_2016.autoprom.vaz;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.ArrayList;

/**
 * Created by user on 17.06.2016.
 */
@XmlRootElement
@XmlSeeAlso(value = {Auto.class})
public class Marshaling extends Auto {
    private ArrayList<Auto> autoprom;

    public Marshaling(){}
    public Marshaling(ArrayList<Auto> autoprom){
        this.autoprom = autoprom;
    }

    public ArrayList<Auto> getAutoprom() {
        return autoprom;
    }
}
