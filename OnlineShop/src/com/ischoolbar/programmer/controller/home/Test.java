package com.ischoolbar.programmer.controller.home;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ischoolbar.programmer.entity.common.Product;
import com.ischoolbar.programmer.service.common.ProductService;
@Controller
public class Test {
	@Autowired
	private static ProductService productService;
	public static void main(String[] args) {
		Map<String, Object> queryMap = new HashMap<String, Object>();
		/*queryMap.put("offset", 0);
		queryMap.put("pageSize", 10);*/
		queryMap.put("sort", "desc");
		queryMap.put("orderBy", "sellNum");
        List<Product> list = productService.findList(queryMap);
        System.out.println(list.size());
        

	}

}
