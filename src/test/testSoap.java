package test;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;

import java.rmi.RemoteException;

import com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetProxy;

import exception.ossturbonet.oss.gvt.com.DataNotFoundException;
import exception.ossturbonet.oss.gvt.com.OSSTurbonetException;

public class testSoap {

	public static void main(String[] args) throws DataNotFoundException, OSSTurbonetException, RemoteException {
		OSSTurbonetProxy ws = new OSSTurbonetProxy();
                
                
                String instancia = "1630105408";
		String designator = ws.getDesignatorByAccessDesignator(instancia);
                String accessDesignator = ws.getAccessDesignator(designator);
                
                GetInfoOut leInfo = ws.getInfo(designator, accessDesignator, "ura", "ura", instancia, "ura", "25600", "12800");
                System.out.println(leInfo.getTechnology());
                

	}

}
