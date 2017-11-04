package assetmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Specification {

    @Id
    @GeneratedValue
    private int id;
    private String proccessor;
    private String memory;
    private String software;
    private String generalInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProccessor() {
        return proccessor;
    }

    public void setProccessor(String proccessor) {
        this.proccessor = proccessor;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public String getGeneralInfo() {
        return generalInfo;
    }

    public void setGeneralInfo(String generalInfo) {
        this.generalInfo = generalInfo;
    }

    @Override
    public String toString() {
        return "Specification{" + "id=" + id + ", proccessor='" + proccessor + '\'' + ", memory='" + memory + '\'' + ", software='" + software + '\''
                + ", generalInfo='" + generalInfo + '\'' + '}';
    }
}
