package ring.notes.test;

import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

/**
 * java log
 * java中各种各样的log工具，java core API里有个(java.util.log),Jakara项目下有个commons-logging.jar
 * 另外还有log4j等。
 * 
 * @author mlb 2013-03-01
 *
 */
public class LogTest {
    public static void main(String[] args) {
	//java 自身提供的logger工具
	Logger logJava = Logger.getAnonymousLogger();//实例化logger对象
	LogManager.getLogManager().addLogger(logJava);//管理logger对象
	
	//tomcat下使用的Logger
	Log logger = LogFactory.getLog(LogTest.class);
	
    }
}
