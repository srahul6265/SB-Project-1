package com.cjc.HomeController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.Model.Student;

@RestController
@RequestMapping("")
public class HomeController {

	
	@RequestMapping("/check")
	public String check()
	{
	
		
		return "App Working Fine..!";
	}
	
	@GetMapping("/SaveStudent")
	public ResponseEntity<Student> saveStudent()
	{
		Student stu = new Student();
		
		stu.setId(101);
		stu.setName("Rahul");
		stu.setAddress("Pune");
		return new ResponseEntity<Student>(stu , HttpStatus.CREATED);
	}
}
