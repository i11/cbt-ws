package com.cbt.ws.services;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.cbt.ws.dao.TestConfigDao;
import com.cbt.ws.entity.TestConfig;
import com.google.inject.servlet.RequestScoped;

/**
 * Test configuration web service
 * 
 * @author SauliusAlisauskas 2013-03-03 Initial version
 * 
 */
@Path("/testconfig/")
@RequestScoped
public class TestConfigWs {

	private final Logger mLogger = Logger.getLogger(TestConfigWs.class);

	private TestConfigDao mDao;

	@Inject
	public TestConfigWs(TestConfigDao dao) {
		mDao = dao;
	}

	/**
	 * 
	 * Add new test configuration
	 * 
	 * @param uploadedInputStream
	 * @param fileDetail
	 * @return
	 */
	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response add(TestConfig testConfig) {

		//TODO: implement authentication
		testConfig.setUserId(1L);

		mDao.add(testConfig);
		
		return Response.status(200).build();

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public TestConfig[] get() {		
		return mDao.getAll();
	}
}