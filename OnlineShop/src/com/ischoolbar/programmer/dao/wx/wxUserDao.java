package com.ischoolbar.programmer.dao.wx;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ischoolbar.programmer.entity.wx.wxUser;


@Repository
public interface wxUserDao {
	
	public int addWxUser(wxUser u);
	public Integer findopenid(String openid);
	public List addid();
	
}
