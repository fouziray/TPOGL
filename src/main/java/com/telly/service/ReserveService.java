package com.telly.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telly.dao.Reserve;
import com.telly.dao.ReserveDao;

import java.util.List;

@Service("reserveService")
public class ReserveService {
	
	@Autowired
	private ReserveDao reserveDao;
	
	public void reserve(Reserve reserve){
		reserveDao.reserve(reserve);
	}
	public List<Reserve> getReserves(String username){
		return reserveDao.getReserve(username);
	}

}
