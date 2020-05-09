package com.ischoolbar.programmer.controller.home;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ischoolbar.programmer.entity.common.Product;
import com.ischoolbar.programmer.entity.wx.wxCartDetail;
import com.ischoolbar.programmer.service.common.ProductService;
import com.ischoolbar.programmer.service.wx.wxUserService;
@RequestMapping("/wechat")
@Controller
public class Wxdetail {
	@Autowired
	private ProductService productService;
	@Autowired
	private wxUserService wxUserService;
	@RequestMapping(value="/detail")
	@ResponseBody
    public Product detail(@RequestParam("id") String id,HttpServletResponse response) throws ServletException, IOException{
		System.out.println("=====商品详情======");
        response.setContentType("text/html;charset=utf-8");          
        /* 设置响应头允许ajax跨域访问 */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* 星号表示所有的异域请求都可以接受， */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");
        long productid = Long.parseLong(id);
        Product product = productService.findById(productid);
        return product;
    }
	@RequestMapping(value="/productLike")
	@ResponseBody
    public List<Product> productLike(@RequestParam("inputVal") String name,HttpServletResponse response) throws ServletException, IOException{
		System.out.println("=====模糊商品======");
        response.setContentType("text/html;charset=utf-8");          
        /* 设置响应头允许ajax跨域访问 */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* 星号表示所有的异域请求都可以接受， */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");
        Map p=new HashMap();
        p.put("name", name);
        List<Product> list = productService.findList(p);
        return list;
    }
	@RequestMapping(value="/wxCart")
	@ResponseBody
    public int wxCart(@RequestParam("openid") String openId,
    		@RequestParam("productId") int productId,
    		@RequestParam("name") String name,
    		@RequestParam("imageUrl") String imageUrl,
    		@RequestParam("price") float price,
    		@RequestParam("num") int num,
    		@RequestParam("money") double money,
    		HttpServletResponse response) throws ServletException, IOException{
		System.out.println("=====购物车======");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = df.format(new Date());
		 System.out.println(df.format(new Date()));
        response.setContentType("text/html;charset=utf-8");          
        /* 设置响应头允许ajax跨域访问 */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* 星号表示所有的异域请求都可以接受， */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");
        Map m = new HashMap();
        m.put("openId", openId);
        m.put("productId", productId);
        m.put("name", name);
        m.put("imageUrl", imageUrl);
        m.put("price", price);
        m.put("num", num);
        m.put("money", money);
        m.put("createTime", format);
        int i = wxUserService.addWxCart(m);
        return i;
    }
	@RequestMapping(value="/cartDetail")
	@ResponseBody
    public wxCartDetail cartDetail(@RequestParam("openid") String openid,HttpServletResponse response) throws ServletException, IOException{
		System.out.println("=====购物详情======");
        response.setContentType("text/html;charset=utf-8");          
        /* 设置响应头允许ajax跨域访问 */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* 星号表示所有的异域请求都可以接受， */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");
        
        wxCartDetail wx= wxUserService.cartDetail(openid);
        return wx;
    }
}
