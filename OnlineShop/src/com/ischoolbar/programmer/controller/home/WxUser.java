package com.ischoolbar.programmer.controller.home;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ischoolbar.programmer.entity.wx.wxUser;
import com.ischoolbar.programmer.service.wx.wxUserService;
@RequestMapping("/wechat")
@Controller
public class WxUser {
	@Autowired
	private wxUserService wxUserService;
	private wxUser u=new wxUser();
	private int k=0;
	@RequestMapping(value="/wxuser")
	@ResponseBody
    public int wxuser(@RequestParam(value = "nickName",required = true) String nickName,
    		@RequestParam(value = "openid",required = true) String openid,
    		@RequestParam(value = "gender",required = true) String gender,
    		@RequestParam(value = "avatarUrl",required = true) String avatarUrl,
    		HttpServletResponse response) throws ServletException, IOException{
		Integer id = wxUserService.findopenid(openid);
		System.out.println(id);
		response.setContentType("text/html;charset=utf-8");          
        /* 设置响应头允许ajax跨域访问 */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* 星号表示所有的异域请求都可以接受， */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");
		if(id==null){
			u.setOpenid(openid);
			u.setGender(gender);
			u.setAvatarUrl(avatarUrl);
			u.setNickName(nickName);
			Integer i=findId();
			if(i==null){
				i=0;
			}
			int lk=i+1;
			u.setId(lk);
			k = wxUserService.addWxUser(u);
		}
        System.out.println("--------/-"+k);
        return k;
    }
	public Integer findId(){
	List find=wxUserService.addid();
	if(find.size()==0){
		return null;
	}
	Integer object=(Integer) find.get(0);
	return object;
}

}
