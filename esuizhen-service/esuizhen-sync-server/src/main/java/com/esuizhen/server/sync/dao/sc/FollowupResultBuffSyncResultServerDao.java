package com.esuizhen.server.sync.dao.sc;

import com.esuizhen.server.sync.bean.TBatchDataResultInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Nidan on 2017年03月24 下午 16:52
 */
public interface FollowupResultBuffSyncResultServerDao {

    //插入结果
    public int insert(Object obj);
    //获取同步结果
    List<TBatchDataResultInfo> getBatchDataResult(@Param("batchId")String batchId);
}
