package com.example.demo.serviml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dbcls.R204;
import com.example.demo.repo.Repo;
import com.example.demo.repo.Servicess;
@Service
class ServIml  implements Servicess{
	@Autowired 
	private Repo rep;
	@Override
	     public  List<R204> getAllDet(){
			
				return rep.findAll();
	     }
@Override
public boolean saveR204Det(R204 disp) {
	 R204 savedet = rep.save(disp);
	 if(savedet.getNo()!=null)
	 {
		 return true;
	 }
	 
	return false;
}
@Override
public void deleteRecord(Integer no) {

 rep.deleteById(no);



}
}

