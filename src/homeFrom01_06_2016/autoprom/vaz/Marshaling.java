package homeFrom01_06_2016.autoprom.vaz;

import org.codehaus.jackson.annotate.JsonProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.ArrayList;

/**
 * Created by user on 17.06.2016.
 */
@XmlRootElement
@XmlSeeAlso(value = {Auto.class})
public class Marshaling{
    @XmlElement
    @JsonProperty
    private ArrayList<Auto> autoprom;

    public Marshaling(){}
    public Marshaling(ArrayList<Auto> autoprom){
        this.autoprom = autoprom;
    }

    public ArrayList<Auto> getAutoprom() {
        return autoprom;
    }
}
