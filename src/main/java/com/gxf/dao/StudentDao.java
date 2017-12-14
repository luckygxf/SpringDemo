package com.gxf.dao;

import com.gxf.entity.Student;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by GuanXF on 2017/12/14.
 */
public interface StudentDao {

    public void setDataSource(DataSource dataSource);

    public void save(Student student);

    public Student getByName(String name);

    public Student getByNo(String no);

    public List<Student> list();

    public void update(Student student);

    public void delete(String no);
}
