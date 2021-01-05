package xuecheng.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class TestTime {

    private Integer id;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createtTi;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatetTi() {
        return createtTi;
    }

    public void setCreatetTi(Date createtTi) {
        this.createtTi = createtTi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestTime{" +
                "id=" + id +
                ", createtTi=" + createtTi +
                ", name='" + name + '\'' +
                '}';
    }
}
