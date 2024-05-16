package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Иванов Иван Иванович");
        student.setGroupId(1);
        student.setReceiptDate(LocalDate.now());
        System.out.println("Студент: " + student.getFullName() + ", группа ("
                + student.getGroupId() + ") дата поступления - " + student.getReceiptDate());
    }
}
