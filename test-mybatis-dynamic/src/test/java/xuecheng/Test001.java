package xuecheng;

import xuecheng.dao.*;
import xuecheng.domain.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@SpringBootTest
@RunWith(SpringRunner.class)
public class Test001 {
    @Autowired
    Tab1Test tab1Test;
    @Autowired
    ACVSFundTest acvsFundTest;


    @Autowired
    BaseEntityTest baseEntityTest;


    @Autowired
    ProvinceMapper provinceMapper;

    @Autowired
    NoodleMapper noodleMapper;

    @Autowired
    RiceMapper riceMapper;

    @Autowired
    TestTimeMapper testT;
    @Autowired
    CourseViewMapper courseViewMapper;

    @Test
    public void testMysqlView(){
        List<TmpCourseView> sid = courseViewMapper.findSid();
        System.out.println(sid);
    }









    @Test
    public void testB(){
        TestTime testTime = testT.selectById(1);

        Date createtTi = testTime.getCreatetTi();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        String format = simpleDateFormat.format(createtTi);
        System.out.println(format);
        System.out.println("=========");

//数据库的字段如果是datetime，Java中用date可以收
//      createtTi=Sun Nov 22 20:13:08 CST 2020
//      gmtCreate=Thu Nov 19 16:21:32 CST 2020
        System.out.println(testTime);

    }






    @Test
//    @Transactional
    public void test(){
        Student s = new Student();
            s.setName("cheng");
            s.setStudentId(1);

//        List<Student> students = tab1Test.selectByStudentSelective(s);

//        tab1Test.updateByid(s);
//        System.out.println(students);

        List<Student> student = tab1Test.selectByS();

        System.out.println(student);
    }

    /**
     * 测试日期与字符串之间的转换
     */
    @Test
    public void testById(){
//        ACVSFund acvsFund = acvsFundTest.findById(1);
//        Date gmtCreate = acvsFund.getGmtCreate();
//        //2020-11-19 16:21:32
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月");//2020-11
//        String format = simpleDateFormat.format(gmtCreate);
//        System.out.println(format);
//        System.out.println("==============");
//
//
//        System.out.println(acvsFund);

        ACVSFund byIdACVSFund = acvsFundTest.findByIdACVSFund(1);

//        gmtCreate=Thu Nov 19 16:21:32 CST 2020
//        gmtCreate=2020-11-19 16:21:32.0
//        gmtCreate=Thu Nov 19 16:21:32 CST 2020
        System.out.println(byIdACVSFund);



    }

    /**
     * 测试resultMap中的继承
     */
    @Test
    public void testByExtend(){

        ACVSFund byId = acvsFundTest.findById(1);
        System.out.println(byId);
//        List<BaseEntity> baseEntities = baseEntityTest.find();
//        System.out.println(baseEntities);

    }

    /**
     * 测试resultMap中assciation属性标签
     */
    @Test
    public void testByid(){
//        List<Rice> riceByArea = riceMapper.findRiceByArea();
//        System.out.println(riceByArea);
//        System.out.println("===========");
//        List<Noodle> noodleByArea = noodleMapper.findNoodleByArea();
//
//        System.out.println(noodleByArea);
//        System.out.println("===========");
        List<Province> province = provinceMapper.getProvince();
        System.out.println(province);
    }


}