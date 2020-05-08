package com.ischoolbar.programmer.service.wx;



import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.entity.wx.wxUser;


@Service
public interface wxUserService {
	
	public int addWxUser(wxUser u);
	public int addWxCart(Map m);
	public Integer findopenid(String openid);
	public List addid();

}
