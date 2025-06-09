package com.example.repo;

import java.util.List;

import com.example.demo.dbcls.R204;

public interface Servicess {
	public  List<R204> getAllDet();
	public boolean saveR204Det(R204 disp);
	public void deleteRecord(Integer no);
	

}
