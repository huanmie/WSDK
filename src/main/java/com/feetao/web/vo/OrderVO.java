package com.feetao.web.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderVO {

	public static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	/**
	 * 主键ID
	 */
	private Long id;

	/**
	 * 用户ID
	 */
	private Long userId;

	/**
	 * 标题
	 */
	private String openId;

	/**
	 * 描述
	 */
	private String content;

	/**
	 * 名字
	 */
	private String name;

	/**
	 * 电话
	 */
	private String mobile;

	/**
	 * 地址
	 */
	private String address;

	/**
	 * 发货时间
	 */
	private String deliverTime;

	/**
	 * 总价
	 */
	private Long price;
	
	/**
	 * 状态
	 */
	private Byte status;
	
	/**
	 * create time
	 */
	private Date gmtCreate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDeliverTime() {
		return deliverTime;
	}

	public void setDeliverTime(String deliverTime) {
		this.deliverTime = deliverTime;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getDotPrice() {
		return String.format("%.2f", (double)(price/100));
	}

	public String getFormatDate() {
		return format.format(gmtCreate);
	}

}
