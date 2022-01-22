package com.telly.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telly.dao.Bus;
import com.telly.dao.BusDao;

@Service("busService")
public class BusService {
	
	@Autowired
	private BusDao busDao;
	
	public void create(Bus bus){
		busDao.create(bus);
	}

	
	
	

}
