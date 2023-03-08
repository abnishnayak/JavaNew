package com.abnishn.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abnishn.repo.DemoRepo;
import com.abnishn.entity.Demo;

@Service

public class DemoService implements DemoInService {
	@Autowired
	private DemoRepo demoRepo;
	
	@Override
	public List<Demo> getDemo(){
		List<Demo> list=new ArrayList<Demo>();
		demoRepo.findAll().forEach(e->list.add(e));
		return list;
	}
	@Override
	public void addDemo(Demo demo) {
		demoRepo.save(demo);
	}
	
}
