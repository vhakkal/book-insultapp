package org.openshift;

import java.util.HashMap;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.ws.rs.Path;

@RequestScoped
@Path("insult")
public class InsultResource {

	@Get()
	@Produces("application/json")
	public HashMap<String, String> getInsult() {
		HashMap<String, String> theInsult = new HashMap<>();
		theInsult.put("insult", new InsultGenerator().generateInsult());
		return theInsult;
	}
}
