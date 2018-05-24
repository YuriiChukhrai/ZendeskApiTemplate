package com.util;

import static java.lang.System.getProperties;
import java.util.Properties;
import org.apache.log4j.Logger;

/**
 * @author Yurii Chukhrai [Aug 2016]
 * @version - [1.0]
 * @file - [BaseConfig.java]
 */

/* This class provide Read Basic information for Classes */
public final class BaseConfig {
	private static final Logger LOG = Logger.getLogger(BaseConfig.class.getName());

	/* Web App info */
	public static final String TOKEN_API = "token";
	public static final String URI_API = "uri";
	public static final String USER = "user";

	private static final Properties ENV_PROPERTIES = getProperties();
	private static Properties properties = new Properties();

	static {
		properties.putAll(ENV_PROPERTIES);
	}

	public static synchronized String getProperty(final String propKey) {

		if (properties.containsKey(propKey)) {
			LOG.debug("TID [" + Thread.currentThread().getId() + "] " + "Was loaded property (key) [" + propKey + "]");
		} else {
			LOG.debug("Property (key) [" + propKey + "] was NOT found.");
		}

		return properties.getProperty(propKey);
	}

	/* Blocking of 'extends' for this Class */
	private BaseConfig() {
		throw new UnsupportedOperationException("Illegal access to private constructor");
	}
}
