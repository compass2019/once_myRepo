package xuecheng.dao;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import xuecheng.domain.Student;

import java.util.List;


@Repository
public interface Tab1Test {

    List<Student> selectByStudentSelective(Student student);

    List<Student> selectByStudentSelective();
    List<Student> selectByIdOrName(Student student);
    void updateByid(@Param("student") Student student);

    List<Student> selectByS();
}