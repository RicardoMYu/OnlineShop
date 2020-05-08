package com.ischoolbar.programmer.service.wx.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.dao.wx.wxUserDao;
import com.ischoolbar.programmer.entity.wx.wxUser;
import com.ischoolbar.programmer.service.wx.wxUserService;
@Service
public class wxUserServiceImpl implements wxUserService {

	@Autowired
	private wxUserDao wxUserDuo;

	@Override
	public int addWxUser(wxUser u) {
		// TODO Auto-generated method stub
		return wxUserDuo.addWxUser(u);
	}

	@Override
	public Integer findopenid(String openid) {
		// TODO Auto-generated method stub
		return wxUserDuo.findopenid(openid);
	}

	@Override
	public List addid() {
		// TODO Auto-generated method stub
		return wxUserDuo.addid();
	}


	
}