package com.feetao.web.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.feetao.web.model.UserWebArticleDO;

public class UserWebArticleDao extends SqlMapClientDaoSupport {

	@SuppressWarnings("unchecked")
	public ArrayList<UserWebArticleDO> getPartItems(long cursor , int direction , int size) {
		Map<String , Object> params = new HashMap<String , Object>();
		params.put("cursor", cursor);
		params.put("size", size);
		if(direction >=0) {
			return (ArrayList<UserWebArticleDO>) this.getSqlMapClientTemplate().queryForList("part.getForwordList" , params);
		} else {
			return (ArrayList<UserWebArticleDO>) this.getSqlMapClientTemplate().queryForList("part.getBackList" , params);
		}

	}

}
