package com.telly.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telly.dao.Bus;
import com.telly.dao.BusDao;

import java.sql.Date;
import java.util.List;

@Service("busService")
public class BusService {
	
	@Autowired
	private BusDao busDao;
	
	public void create(Bus bus){
		busDao.create(bus);
	}
	public List<Bus> getCity(String leaveFrom, String goingTo, Date dateLeave, Date dateReturn){
		return busDao.getCity(leaveFrom, goingTo, dateLeave, dateReturn);
	}





}
