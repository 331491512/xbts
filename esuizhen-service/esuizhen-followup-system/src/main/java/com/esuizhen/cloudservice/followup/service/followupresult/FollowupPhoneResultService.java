package com.esuizhen.cloudservice.followup.service.followupresult;

import java.util.List;

import com.esuizhen.cloudservice.followup.bean.TFollowupPhoneResultSearchInfo;
import com.esuizhen.cloudservice.followup.model.followupdo.FollowupPhonePatientPageTurnQueryReq;
import com.esuizhen.cloudservice.followup.model.followupresult.TFollowupResultDetailInfo;
import com.esuizhen.cloudservice.followup.model.followupresult.TFollowupResultValueInfo;
import com.westangel.common.bean.Page;

public interface FollowupPhoneResultService {

	public Page<TFollowupResultDetailInfo> queryFollowupPhoneResult(TFollowupPhoneResultSearchInfo followupPhoneResultSearchInfo);

	public List<TFollowupResultValueInfo> statisFollowupPhoneResult(TFollowupPhoneResultSearchInfo followupPhoneResultSearchInfo);

	public Long statisFollowupPhoneResultTotal(TFollowupPhoneResultSearchInfo followupPhoneResultSearchInfo);

	public TFollowupResultDetailInfo queryFollowupPhonePatientPageTurn(FollowupPhonePatientPageTurnQueryReq followupPhonePatientPageTurnQueryReq);

	public void saveFollowupPhone(TFollowupResultDetailInfo followupResultDetailInfo);

	public void saveFollowupPhoneResultTemp(TFollowupResultDetailInfo followupResultDetailInfo);

	public Integer statisFollowupOperatorTotal(TFollowupPhoneResultSearchInfo followupPhoneResultSearchInfo);

	public void saveFollowupResultBuff(TFollowupResultDetailInfo followupResultDetailInfo);
}
