package com.xhlx;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;


public class xhlxBean implements SessionBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8036856014439245636L;

	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void ejbPassivate() throws EJBException, RemoteException {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void ejbRemove() throws EJBException, RemoteException {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void setSessionContext(SessionContext ctx) throws EJBException,
			RemoteException {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
	public String showTime(String... args) {
		StringBuilder sb = new StringBuilder();
		for (String str : args) {
			sb.append(str);
			sb.append(":");
		}
		sb.deleteCharAt(sb.length() - 1);

		return sb.toString();
	}
}
