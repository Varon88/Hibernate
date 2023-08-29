package createNewtable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "teacher") //if the entity name is specified the entity name would be used as the table name
@Table(name = "teacher") //this value would be used as the table name, this value is derived through the entity name
public class teacher { //default table name would be teacher which is also the class name.

    @Id
    private int id;
    @Column(name = "teacher_name") //this would change the column name.
    //@Transient --> can be used to exclude the addition of variables to the table.
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
