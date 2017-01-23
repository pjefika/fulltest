package test;

import java.rmi.RemoteException;

import com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetProxy;

import exception.ossturbonet.oss.gvt.com.DataNotFoundException;
import exception.ossturbonet.oss.gvt.com.OSSTurbonetException;

public class testSoap {

	public static void main(String[] args) throws DataNotFoundException, OSSTurbonetException, RemoteException {
		OSSTurbonetProxy oi = new OSSTurbonetProxy();
		
		System.out.println(oi.getDesignatorByAccessDesignator("4130886762"));

	}

}
