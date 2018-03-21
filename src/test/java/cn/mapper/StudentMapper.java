package cn.mapper;

import org.apache.ibatis.annotations.Param;
import cn.entity.StudentEntity;

public interface StudentMapper {

    StudentEntity getStudentById(int id);

    int addStudent(StudentEntity student);

    int updateStudentName(@Param("name") String name, @Param("id") int id);

    StudentEntity getStudentByIdWithClassInfo(int id);
}