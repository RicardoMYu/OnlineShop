package com.ischoolbar.programmer.entity.wx;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * ���ﳵʵ��
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
	
	private Long productId;//��Ʒid
	
	private String openId;//�û�id
	
	private String name;//��Ʒ����
	
	private String imageUrl;//��Ʒ��ͼ
	
	private Double price;//��Ʒ�۸�
	
	private int num;//��Ʒ����
	
	private Double money;//��Ʒ�۸�
	
	private String createTime;//���ʱ��

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
