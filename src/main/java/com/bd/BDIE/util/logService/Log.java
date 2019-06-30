package com.bd.BDIE.util.logService;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;

import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;

public class Log {

	static {
		File file = new File(Paths.get(System.getProperty("user.dir"), "log4j2.xml").toString());
		try {
			initializeLog4j2(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

		core = LogImp.getLogger("com.bd.core");
		workflow = LogImp.getLogger("com.bd.core.workflow");
		socket = LogImp.getLogger("Com.bd.socket");
		rfid = LogImp.getLogger("com.bd.rfid");
		webservice = LogImp.getLogger("com.bd.webservice");
		thirdparty = LogImp.getLogger("com.bd.thirdparty");
	}

	private static void initializeLog4j2(File file) throws FileNotFoundException, IOException {
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
		ConfigurationSource source = new ConfigurationSource(in);

		Configurator.initialize(null, source);
	}

	public static ILog core;
	public static ILog workflow;
	public static ILog socket;
	public static ILog rfid;
	public static ILog webservice;
	public static ILog thirdparty;
}
