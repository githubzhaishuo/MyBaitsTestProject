package com.zgyzs.test;
import com.zgyzs.dao.IT1Dao;
import com.zgyzs.domain.T1;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
//    public static void main(String[] args) {
//        try {
//            InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
//            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory factory = builder.build(in);
//            SqlSession session = factory.openSession();
//            IT1Dao T1Dao = session.getMapper(IT1Dao.class);
//            List<T1> t1s = T1Dao.findAll();
//            for(T1 t1 : t1s){
//                System.out.println(t1);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//    }
    @Test
    public void show1(){
        System.out.println("hello world");
    }
    @Test
    public void show2(){
        System.out.println("hello mybatis");
    }
    @Test
    public void testSelect(){
        try {
            InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(in);
            SqlSession session = factory.openSession();
            IT1Dao T1Dao = session.getMapper(IT1Dao.class);
            List<T1> t1s = T1Dao.findAll();
            for(T1 t1 : t1s){
                System.out.println(t1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testSave() throws Exception{
        T1 t1 = new T1();
        t1.setId(522222222);
        t1.setK("fsfewfewfew");
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        IT1Dao T1Dao = session.getMapper(IT1Dao.class);
        T1Dao.saveT1(t1);
        session.commit();
//        in.close();
        Thread.sleep(30000);
        T1 t2 = new T1();
        t2.setId(322222222);
        t2.setK("fsfewfewfew");
        T1Dao.saveT1(t2);
        session.commit();
        Thread.sleep(10000);
    }
}
