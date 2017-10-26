package spring.rest.simple.example.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Motorcycles {

    @XmlElement(name = "motorcycle")
    private List<Motorcycle> motorcycles;

    public Motorcycles() {
    }

    public Motorcycles(List<Motorcycle> motorcycles) {
        this.motorcycles = motorcycles;
    }

    public List<Motorcycle> getMotorcycles() {
        return motorcycles;
    }

    public void setMotorcycles(List<Motorcycle> motorcycles) {
        this.motorcycles = motorcycles;
    }
}
