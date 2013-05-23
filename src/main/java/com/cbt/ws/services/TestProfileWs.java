package com.cbt.ws.services;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.cbt.ws.dao.TestProfileDao;
import com.cbt.ws.entity.TestProfile;
import com.cbt.ws.security.CbtPrinciple;
import com.google.inject.servlet.RequestScoped;

/**
 * Test profile web service
 * 
 * @author SauliusAlisauskas 2013-03-03 Initial version
 * 
 */
@Path("/testprofile/")
@RequestScoped
public class TestProfileWs {

	// private final Logger mLogger = Logger.getLogger(TestProfileWs.class);

	private TestProfileDao mDao;

	@Inject
	public TestProfileWs(TestProfileDao dao) {
		mDao = dao;
	}

	/**
	 * 
	 * Add new test package to the system
	 * 
	 * @param uploadedInputStream
	 * @param fileDetail
	 * @return
	 */
	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response add(TestProfile testProfile, @Context SecurityContext context) {
		testProfile.setUserId(((CbtPrinciple)context.getUserPrincipal()).getId());
		mDao.add(testProfile);
		return Response.status(200).build();

	}	
}
