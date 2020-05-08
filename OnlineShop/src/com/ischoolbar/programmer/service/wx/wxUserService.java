package com.ischoolbar.programmer.service.wx;



import java.util.List;

import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.entity.wx.wxUser;


@Service
public interface wxUserService {
	
	public int addWxUser(wxUser u);
	public Integer findopenid(String openid);
	public List addid();

}
