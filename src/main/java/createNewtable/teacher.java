package createNewtable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class teacher {

    @Id
    private int id;
    private String teacherName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
