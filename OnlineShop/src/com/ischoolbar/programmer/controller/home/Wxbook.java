package com.ischoolbar.programmer.controller.home;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ischoolbar.programmer.entity.common.Product;
import com.ischoolbar.programmer.service.common.ProductService;
@RequestMapping("/wechat")
@Controller
public class Wxbook {
	@Autowired
	private ProductService productService;
	@RequestMapping(value="/book")
	@ResponseBody
    public List book(HttpServletResponse response) throws ServletException, IOException{
		System.out.println("===========");
        response.setContentType("text/html;charset=utf-8");          
        /* 设置响应头允许ajax跨域访问 */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* 星号表示所有的异域请求都可以接受， */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");
		Map<String, Object> queryMap = new HashMap<String, Object>();
		/*queryMap.put("offset", 0);
		queryMap.put("pageSize", 10);*/
		queryMap.put("sort", "desc");
		queryMap.put("orderBy", "sellNum");
        List<Product> list = productService.findList(queryMap);
        return list;
    }
}
