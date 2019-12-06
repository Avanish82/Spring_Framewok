package com.controller;

import java.util.List;

import com.controller.Student;

public interface StudentDao 
{
	public void saveStudent(Student student);
    public Student getStudentById(int id);
    public void updateStudent(Student student);
    public void deleteStudent(int id);
    public List<Student> getAllViews();

}
