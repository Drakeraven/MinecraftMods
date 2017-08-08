package forgepractice.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import forgepractice.Reference;

public class Utils {
	
	public static Logger logger;
	
	public static Logger getLogger(){
		if (logger == null) {
			logger = LogManager.getLogger(Reference.MODID);
		}
		return logger;	
	}
}
