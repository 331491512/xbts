package com.esuizhen.server.sync.dao.server;

import com.esuizhen.server.sync.bean.server.OuthospitalNoteRes;
/**
 * Created by Nidan on 2017年03月21 上午 11:40
 */
public interface TOuthospitalNoteDao {

    void insertSelective(OuthospitalNoteRes record);

    void updateByPrimaryKeySelective(OuthospitalNoteRes record);
}