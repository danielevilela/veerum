package com.dvilela.match.customers.util;

import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import com.dvilela.veerum.schedule.util.Constants;
import com.dvilela.veerum.schedule.util.Util;

public class UtilTest {
	
		
	@Test
	public void readTxtToString() throws IOException {
		IOUtils.toString(
			      Util.class.getClassLoader().getResourceAsStream("financial.txt")
			    );
	}

 

}
