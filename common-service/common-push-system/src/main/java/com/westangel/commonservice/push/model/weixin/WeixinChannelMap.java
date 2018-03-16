package com.westangel.commonservice.push.model.weixin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class WeixinChannelMap extends HashMap<String, WeixinChannelInfo>{
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 5679387167374813289L;
	
	/**
	 * 
	* @Title: channelList 
	* @Description: 转成LIST 
	* @param @return    设定文件 
	* @return List<WeixinTemplateInfo>    返回类型 
	* @throws
	 */
	public List<WeixinChannelInfo> channelList()
	{
		List<WeixinChannelInfo> list = new ArrayList<WeixinChannelInfo>();
		for(WeixinChannelInfo template:values()){
			list.add(template);
		}
		return list;
	}
}
