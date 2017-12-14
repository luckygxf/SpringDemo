package test.java.com.gxf.dao;

import com.gxf.dao.StudentDao;
import com.gxf.entity.Student;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by 58 on 2017/12/14.
 */
public class TestDao {
    private StudentDao studentDao;

    @Before
    public void init(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        studentDao = (StudentDao) context.getBean("studentDao");
    }

    //查询所有记录
    @Test
    public void testList(){
        List<Student> studentList = studentDao.list();
        System.out.println(studentList);
    }

    //测试插入方法
    @Test
    public void testInsert(){
        Student student = new Student("20171214", "guanxianseng");
        studentDao.save(student);
    }

    //测试查询方法
    @Test
    public void testGet(){
        Student student = studentDao.getByName("guanxianseng");
        System.out.println(student);
    }
}
