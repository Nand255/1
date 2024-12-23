package in.ineuron.dao;

import java.io.IOException;

import in.ineuron.dto.Student;

public interface IStudentDao {
	
	//operation to be implemented
	public String addStudent(Student student) throws IOException;
	
	public Student searchStudent(Integer sid) throws IOException;
	
	public String updateStudent(Student student) throws IOException;
	
	public String deleteStudent(Integer sid) throws IOException;
}