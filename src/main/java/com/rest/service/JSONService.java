package com.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/json")
public class JSONService {

	@Path("/calculate/{input1}/{input2}")
	@Consumes(value = "application/json")
	@Produces(value = "application/json")
	@GET
	public com.rest.model.Result calculate(@PathParam("input1") int input1, @PathParam("input2") int input2) {
		com.rest.model.Result result = new com.rest.model.Result();
		result.setInput1(input1);
		result.setInput2(input2);
		result.setResult(input1 + input2);
		return result;
	}
}