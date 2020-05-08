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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ischoolbar.programmer.entity.common.Product;
import com.ischoolbar.programmer.service.common.ProductService;
@RequestMapping("/wechat")
@Controller
public class Wxdetail {
	@Autowired
	private ProductService productService;
	@RequestMapping(value="/detail")
	@ResponseBody
    public Product detail(@RequestParam("id") String id,HttpServletResponse response) throws ServletException, IOException{
		System.out.println("=====��Ʒ����======");
        response.setContentType("text/html;charset=utf-8");          
        /* ������Ӧͷ����ajax������� */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* �Ǻű�ʾ���е��������󶼿��Խ��ܣ� */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");
        long productid = Long.parseLong(id);
        Product product = productService.findById(productid);
        return product;
    }
	@RequestMapping(value="/productLike")
	@ResponseBody
    public List<Product> productLike(@RequestParam("inputVal") String name,HttpServletResponse response) throws ServletException, IOException{
		System.out.println("=====ģ����Ʒ======");
        response.setContentType("text/html;charset=utf-8");          
        /* ������Ӧͷ����ajax������� */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* �Ǻű�ʾ���е��������󶼿��Խ��ܣ� */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");
        Map p=new HashMap();
        p.put("name", name);
        List<Product> list = productService.findList(p);
        return list;
    }
}
