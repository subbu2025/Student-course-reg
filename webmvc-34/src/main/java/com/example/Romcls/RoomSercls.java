package com.example.Romcls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repointerf.Repo;
import com.example.Serviceintrf.RoomService;
import com.example.tclass.R204;
@Service
public class RoomSercls implements RoomService {
	@Autowired
	private Repo repi;
	@Override
	public List<R204> getAllDet() {
		// TODO Auto-generated method stub
		
		return repi.findAll();
	}

}
