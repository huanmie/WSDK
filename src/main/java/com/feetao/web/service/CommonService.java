package com.feetao.web.service;

public interface CommonService {

	/**
	 * 生成带固定参数的url
	 * @param url
	 * @param uid
	 * @param chatfrom
	 * @param chatto
	 * @return
	 */
	public String url(String url , Long uid , String chatfrom , String chatto);

}