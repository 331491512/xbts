package com.esuizhen.cloudservice.research.controller.result;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.web.context.WebApplicationContext;

import com.esuizhen.cloudservice.research.model.result.TCrfResultMainInfo;
import com.esuizhen.cloudservice.research.model.result.TCrfResultTreatmentChemotherapyInfo;
import com.esuizhen.cloudservice.research.model.result.TCrfResultTreatmentChemotherapyMedicationDetail;
import com.esuizhen.cloudservice.research.model.result.TCrfResultTreatmentRadiotherapyDetail;
import com.esuizhen.cloudservice.research.model.result.TCrfResultTreatmentRadiotherapyInfo;
import com.westangel.common.util.JsonUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextConfiguration({ "classpath:spring/application.xml" })
public class TCrfResultTreatmentRadiotherapyInfoControllerTest {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private WebApplicationContext wac;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = webAppContextSetup(this.wac).build();
	}

	@Test
	@Ignore
	public void saveCrfResultTreatmentRadiotherapy() throws Exception {
		TCrfResultTreatmentRadiotherapyDetail crfResultTreatmentRadiotherapyDetail = new TCrfResultTreatmentRadiotherapyDetail();
		crfResultTreatmentRadiotherapyDetail.setRadiotherapyPartName("头2");
		;
		List<TCrfResultTreatmentRadiotherapyDetail> crfResultTreatmentChemotherapyMedicationDetailList = new ArrayList<TCrfResultTreatmentRadiotherapyDetail>();
		crfResultTreatmentChemotherapyMedicationDetailList.add(crfResultTreatmentRadiotherapyDetail);

		TCrfResultTreatmentRadiotherapyInfo crfResultTreatmentRadiotherapyInfo = new TCrfResultTreatmentRadiotherapyInfo();
		crfResultTreatmentRadiotherapyInfo.setSchemeName("方案名称2");
		crfResultTreatmentRadiotherapyInfo.setIndex(0);
		crfResultTreatmentRadiotherapyInfo
				.setCrfResultTreatmentRadiotherapyDetailList(crfResultTreatmentChemotherapyMedicationDetailList);

		List<TCrfResultTreatmentRadiotherapyInfo> crfList = new ArrayList<TCrfResultTreatmentRadiotherapyInfo>();
		crfList.add(crfResultTreatmentRadiotherapyInfo);

		TCrfResultMainInfo<List<TCrfResultTreatmentRadiotherapyInfo>> crfResultMainInfo = new TCrfResultMainInfo<List<TCrfResultTreatmentRadiotherapyInfo>>();
		crfResultMainInfo.setCrfObserveId("OBSE24552946679178951");
		crfResultMainInfo.setCrfCourseItemTime(new Date());
		crfResultMainInfo.setCreatorId(9L);
		crfResultMainInfo.setPatientId(0L);
		crfResultMainInfo.setProjectId("000");
		crfResultMainInfo.setSubjectElementId("S1");
		crfResultMainInfo.setCrfResult(crfList);
		MockHttpServletRequestBuilder post = post("/crf/result/treatment/radiotherapy/save")
				.content(JsonUtil.toJson(crfResultMainInfo)).contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform((post)).andExpect(status().isOk()).andDo(print()).andReturn();
		logger.info("result=\n" + JsonUtil.beautiful(result.getResponse().getContentAsString()));
	}

	@Test
	@Ignore
	public void queryCrfResultTreatmentRadiotherapy() throws Exception {
		MockHttpServletRequestBuilder get = get(
				"/crf/result/treatment/radiotherapy/query?crfObserveId=OBSE24552946679178951&patientId=0");
		MvcResult result = mockMvc.perform((get)).andReturn();
		logger.info("result=\n" + JsonUtil.beautiful(result.getResponse().getContentAsString()));
	}
}
