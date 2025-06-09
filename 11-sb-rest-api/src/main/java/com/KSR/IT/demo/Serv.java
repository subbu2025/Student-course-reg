package com.KSR.IT.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class Serv implements ServiceInterf {

    @Autowired
    private Srepo repo;

    @Override
    public String upsert(Student student) {  
        repo.save(student);
        return "Student Details Saved";
    }

    @Override
    public Student getStuById(Integer sid) {
        return repo.findById(sid).orElse(null);
    }

    @Override
    public String  deleteById(Integer sid) {
    	if(repo.existsById(sid))
    	{
    		repo.deleteById(sid);
    		return "delete complete";
    	}
    	else
    	{
        return "Student details deleted successfully";
    	}
    }

   
}
