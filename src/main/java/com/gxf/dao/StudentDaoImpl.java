package com.gxf.dao;

import com.gxf.entity.Student;
import com.gxf.mapper.StudentMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by GuanXF on 2017/12/14.
 */
public class StudentDaoImpl implements StudentDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void save(Student student) {
        String sql = "insert into student(No, name) values(?, ?)";
        jdbcTemplate.update(sql, student.getNo(), student.getName());
        System.out.println("add student: " + student);
    }

    public Student getByName(String name) {
        String sql = "select * from student where name = ?";
        Student student = jdbcTemplate.queryForObject(sql, new Object[]{name}, new StudentMapper());
        return student;
    }

    public Student getByNo(String no) {
        String sql = "select * from student where NO = ?";
        Student student = jdbcTemplate.queryForObject(sql, new Object[]{no}, new StudentMapper());
        return student;
    }

    public List<Student> list() {
        String sql = "select * from student";
        List<Student> students = jdbcTemplate.query(sql, new StudentMapper());
        return students;
    }

    public void update(Student student) {

    }

    public void delete(String no) {

    }
}
