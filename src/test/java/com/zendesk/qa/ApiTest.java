package com.zendesk.qa;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import static com.util.BaseUtil.*;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pojo.CreateTicket;
import com.pojo.Ticket;
import com.web.template.BaseListener;
import com.web.template.BaseTest;


@Listeners(BaseListener.class)
public class ApiTest extends BaseTest {

	@Test
	public void createTicket() {
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Object[] respond = post(gson.toJson(new Ticket("My printer is on fire!", "The smoke is very colorful.")), "api/v2/tickets.json");
		
		int statusCode = (Integer) respond[0];
		CreateTicket ct = gson.fromJson((String) respond[1], CreateTicket.class);
		
		assertThat(statusCode, describedAs("Status code should be 201", is(201)));
		assertThat(ct.getTicket().getId(), describedAs("Ticket Id should be not 'null'", notNullValue()));
	}
}
