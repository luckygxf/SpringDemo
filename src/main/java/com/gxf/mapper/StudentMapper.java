package com.gxf.mapper;

import com.gxf.entity.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by GuanXF on 2017/12/14.
 */
public class StudentMapper implements RowMapper<Student> {
    public Student mapRow(ResultSet rs, int i) throws SQLException {
        Student student = new Student();
        student.setNo(rs.getString("NO"));
        student.setName(rs.getString("name"));
        return student;
    }
}
