package com.bd.BDIE.util.logService;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class LogImp implements ILog {

	private Logger logger;

	private LogImp(String loggerName) {
		logger = LoggerFactory.getLogger(loggerName);
	}

	public static ILog getLogger(String name) {
		return new LogImp(name);
	}

	@Override
	public void debug(String msg, Object... args) {
		// TODO Auto-generated method stub
		logger.debug(String.format(msg, args));
	}

	@Override
	public void debug(String msg, Exception exp, Object... args) {
		// TODO Auto-generated method stub
		logger.debug(String.format(msg, args), exp);
	}

	@Override
	public void info(String msg, Object... args) {
		// TODO Auto-generated method stub
		logger.info(String.format(msg, args));
	}

	@Override
	public void info(String msg, Exception exp, Object... args) {
		// TODO Auto-generated method stub
		logger.info(String.format(msg, args), exp);
	}

	@Override
	public void warn(String msg, Exception exp, Object... args) {
		// TODO Auto-generated method stub
		logger.warn(String.format(msg, args), exp);
	}

	@Override
	public void warn(String msg, Object... args) {
		// TODO Auto-generated method stub
		logger.warn(String.format(msg, args));
	}

	@Override
	public void error(String msg, Object... args) {
		// TODO Auto-generated method stub
		logger.error(String.format(msg, args));
	}

	@Override
	public void error(String msg, Exception exp, Object... args) {
		// TODO Auto-generated method stub
		logger.error(String.format(msg, args), exp);
	}

}