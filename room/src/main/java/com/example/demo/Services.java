package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Services {
	private Rrepo repi;
@Autowired
	public void setRepi(Rrepo repi) {
		this.repi = repi;
	}

/*public void savedetails()
{
	R204 a =new R204();
 a.setNo(1);
 a.setName("subbu");
 a.setDeg("part-time in dimart");
 a.setSal(6000);
 a.setVillage("addanki");
 repi.save(a);
}
*/
public void del()
{
	R205  a1=new R205(1, null, null, 0, null);
	a1.getNo();
	repi.delete(a1);
}
	
	
public void findtot()
{
	Iterable<R205> ijk=repi.findAll();
	ijk.forEach(System.out::println);

}
public void findtwo()
{
	List<Integer>two=Arrays.asList(1,3);
	Iterable<R205>ids=repi.findAllById(two);
	ids.forEach(System.out::println);
	
}
public void find()
{
	Optional<R205> id=repi.findById(2);
	if(id.isPresent())
	{
		R205 rep=id.get();
		System.out.println(rep);
	}
	
}
public void saveMoreDet()
{
	R205 a1=new R205();
	a1.setNo(2);
	a1.setName("vasu");
	a1.setDeg("sales");
	a1.setSal(21000);
	a1.setVillage("Ongole");
	
	R205 a2=new R205();
	a2.setNo(3);
	a2.setName("moiz Anna");
	a2.setDeg("TESTING ENG");
	a2.setSal(100000);
	a2.setVillage("hyd");
	
	
	List<R205> multi =Arrays.asList(a1,a2);
	repi.saveAll(multi);
}
}
