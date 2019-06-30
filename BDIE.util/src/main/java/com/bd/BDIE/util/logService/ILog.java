package com.bd.BDIE.util.logService;

public interface ILog {
	void debug(String msg, Object... args);

	void debug(String msg, Exception exp, Object... args);

	void info(String msg, Object... args);

	void info(String msg, Exception exp, Object... args);

	void warn(String msg, Exception exp, Object... args);

	void warn(String msg, Object... args);

	void error(String msg, Object... args);

	void error(String msg, Exception exp, Object... args);

}
