package com.KSR.IT.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Studentres {
	@Autowired
	private Serv stu;
	@PostMapping("/det")
	public String details(@RequestBody Student student)
	{
		String past=stu.upsert(student);
		return past;
	}
	@GetMapping("/det/{sid}")
	public Student  detailById(@PathVariable Integer sid)
	{
		Student  str= stu.getStuById(sid);
		return  str ;
		
	}
	@PutMapping("/update/{id}")
	public String update(@PathVariable Integer id, @RequestBody Student student) {
	    student.setSid(id); 
	    stu.upsert(student); 
	    return "✅ Student details updated successfully";
	}

	@DeleteMapping("/delete/{id}")
	
	public String deleteDet(@PathVariable("id") Integer sid)
	{
		stu.deleteById(sid);
		
		return "deleted value";
	}
	

}
