/**
 * <b>项目名：</b>易随诊<br/>  
 * <b>包名：</b>package com.esuizhen.cloudservice.ehr.dao.patient;<br/>  
 * <b>文件名：</b>InHospitalDao.java<br/>  
 * <b>版本信息：</b><br/>  
 * <b>日期：</b>2016年5月18日上午11:54:21<br/>  
 * <b>Copyright (c)</b> 2015西部天使公司-版权所有<br/>  
 *   
 */
package com.esuizhen.cloudservice.ehr.dao.patient;

import java.util.List;

import com.esuizhen.cloudservice.ehr.bean.TInhospitalInfo;
import com.esuizhen.cloudservice.ehr.bean.TOutHospitalInfo;

/** 
* @ClassName: InHospitalDao
* @Description: 
* @author lichenghao
* @date 2016年5月18日 上午11:54:21  
*/
public interface InHospitalDao {
	List<TInhospitalInfo> queryPatientInhospitalInfoByPatientId(Object param);
	
	/**
	 * 获取患者出院时间
	 * @author lichenghao
	 * @title :queryPatientOutHospitalDate
	 * @Description:TODO
	 * @return LinkedHashMap<String,Object>
	 * @date 2016年5月2日 下午3:15:35
	 */
	public List<TOutHospitalInfo> queryPatientOutHospitalDate(Object param);
}
