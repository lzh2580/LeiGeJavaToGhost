package com.leige.design.结构型.代理模式;
import java.util.ArrayList;

/**
 * 学校代理类 - 帮助学生完成学校任务
 */
public class School implements IStudent{
    // 初始化为容纳十个人的学校
    public ArrayList<IStudent> students = new ArrayList<>(10);
    public void addStudent(IStudent student) {
        students.add(student);
    }
    @Override
    public void study() {
        System.out.println("学校监督学习");
        for (IStudent student : students) {
            student.study();
        }
        System.out.println("学校监督学习");
    }
}
