package com.feetao.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.feetao.web.constants.Result;
import com.feetao.web.support.RequestContextHolder;
import com.feetao.web.support.RequestData;

/**
 * 转盘
 * @author feetao
 */
@Controller
@RequestMapping("/rotate")
public class RotateController {
	
	@Resource
	private RequestContextHolder requestContextHolder;

	@ResponseBody
	@RequestMapping("/play")
	public Object play() {
		RequestData data = requestContextHolder.getRequestData();
		return new Result();
	}

}