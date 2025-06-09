package com.example.Servicecls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repo.RepoInterf;
import com.example.db.R204;
@Service
public class Rservice implements Rservice  {
	@Autowired
	private RepoInterf repo;

	@Override
	public List<R204> getAllDetails() {
		
		return repo.findAll();
	}

}
