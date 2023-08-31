package createNewtable;

import jakarta.persistence.Embeddable;

@Embeddable
public class teacherName {

    private String fName;
    private String lName;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "teacherName{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}
