package com.ischoolbar.programmer.entity.wx;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * 购物车实体
 * @author Administrator
 *
 */
/**
 * @author HP
 *
 */
@Component
public class wxCartDetail {
	
	private Long id;//id
	
	private Long productId;//商品id
	
	private String openId;//用户id
	
	private String name;//商品名称
	
	private String imageUrl;//商品主图
	
	private Double price;//商品价格
	
	private int num;//商品数量
	
	private Double money;//商品价格
	
	private String createTime;//添加时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "wxCartDetail [id=" + id + ", productId=" + productId
				+ ", openId=" + openId + ", name=" + name + ", imageUrl="
				+ imageUrl + ", price=" + price + ", num=" + num + ", money="
				+ money + ", createTime=" + createTime + "]";
	}

}
