package com.westangel.commonservice.push.service;

import java.util.List;

import com.westangel.commonservice.push.model.EventInfoHistory;

/**
* @ClassName: EventInfoHistoryService 
* @Description: 推送历史服务接口
* @author wang_hw
* @date 2016年2月17日 下午3:58:53
 */
public interface EventInfoHistoryService{
	
	/**
	 * @author wang_hw
	 * @title :eventinfoPull
	 * @Description:拉取推送数据
	 * @return List<EventInfoHistory>
	 * @date 2016年2月17日 下午5:03:12
	 */
	public List<EventInfoHistory> eventinfoPull(Integer businessId , Integer productId , Long  userId);
	/**
	 * @author wang_hw
	 * @title :insertEventInfoHistory
	 * @Description:保存推送历史
	 * @return void
	 * @date 2016年2月17日 下午3:53:33
	 */
	public void insertEventInfoHistory(EventInfoHistory eventInfoHistory);
	
	/**
	 * @author wang_hw
	 * @title :updateEventInfoHistory
	 * @Description:修改推送历史
	 * @return void
	 * @date 2016年2月17日 下午3:53:49
	 */
	public void updateEventInfoHistory(EventInfoHistory eventInfoHistory);
	
	/**
	 * @author wang_hw
	 * @title :deleteEventInfoHistory
	 * @Description:删除操作历史
	 * @return void
	 * @date 2016年2月17日 下午3:54:08
	 */
	public void deleteEventInfoHistory(Long eventInfoHistoryId);
	
	/**
	 * @author wang_hw
	 * @title :queryEventInfoHistory
	 * @Description:查询操作历史
	 * @return EventInfoHistory
	 * @date 2016年2月17日 下午3:54:19
	 */
	public EventInfoHistory queryEventInfoHistory(Long id);

}
