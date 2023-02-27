package helper;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class loggerHelper {
private static boolean root=false;
	
	public static Logger getLogger(Class cls){
		if(root){
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure("src/test/resources/log4j.properties");
		root = true;
		return Logger.getLogger(cls);
	}
}
