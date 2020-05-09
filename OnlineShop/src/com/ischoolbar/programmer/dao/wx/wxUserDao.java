package com.ischoolbar.programmer.dao.wx;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ischoolbar.programmer.entity.wx.wxCartDetail;
import com.ischoolbar.programmer.entity.wx.wxUser;


@Repository
public interface wxUserDao {
	
	public int addWxUser(wxUser u);
	public Integer findopenid(String openid);
	public List addid();
	public int addWxCart(Map m);
	public List<wxCartDetail> cartDetail(String openid);
	public int addWxOrder(Map m);
	public int wxModify(Map m);
	public String selAdd();
}
