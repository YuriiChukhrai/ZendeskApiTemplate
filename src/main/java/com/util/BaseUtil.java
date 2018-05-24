package com.util;


import static com.util.BaseConfig.*;
import java.io.IOException;

/**
 * @author Yurii Chukhrai [Aug 2016]
 * @version - [1.0]
 */

import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.OkHttpClient.Builder;
import ru.yandex.qatools.allure.annotations.*;

public class BaseUtil {

	private final static Logger LOG = Logger.getLogger(BaseUtil.class.getName());

	
	public static String getAthorization(final String user, final String token) {
		
		String authString = String.format("%s/token:%s", user, token);
		final byte[] authEncBytes = Base64.encodeBase64(authString.toString().getBytes(StandardCharsets.UTF_8));
		
		return  String.format("Basic %s", new String(authEncBytes));
	}
	
	@Step("POST API [{1}]")
	public static Object[] post(String inputJson, String api) {
		
		int statusCode = 404;
		String respond = "";
		
		final MediaType mediaType = MediaType.parse("application/json");
		final RequestBody body = RequestBody.create(mediaType, inputJson);

		OkHttpClient client = new Builder()
				.connectTimeout(15L, TimeUnit.SECONDS)
				.readTimeout(20L, TimeUnit.SECONDS)
				.writeTimeout(20L, TimeUnit.SECONDS)
				.build();

		Request request = new Request.Builder()
				.url(getProperty(URI_API)+api)
				.post(body)
				.addHeader("Authorization", getAthorization(getProperty(USER), getProperty(TOKEN_API)))
				.addHeader("cache-control", "no-cache")
				.build();
		
		long start = System.currentTimeMillis();
		try (Response response = client.newCall(request).execute()) {

			LOG.info(String.format("POST to url [%s], duration [%d] ms.", getProperty(URI_API) + api, System.currentTimeMillis() - start));
			statusCode = response.code();

			respond = response.body().string();
			attachText("Ticket create respond", respond);
		} catch (IOException e) {
			LOG.error(String.format("Can't execute GET request to [%s]. MSG [%s]", getProperty(URI_API) + api, e.getMessage()));
			e.printStackTrace();
		}

		return new Object[] {statusCode, respond};
	}
	
	/* This method make Text attachment for Allure report */
	@Attachment(value = "{0}", type = "text/plain")
	public static synchronized String attachText(final String nameOfAttachment, final String bodyOfMassege) {

		LOG.info("Attached to allure file [" + nameOfAttachment + "].");

		return (bodyOfMassege != null && !bodyOfMassege.isEmpty() ? bodyOfMassege : "Empty Content");
	}
}// END of CLASS
