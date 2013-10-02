package com.xhlx;

import javax.ejb.EJBHome;

public interface xhlxHome extends EJBHome {

	xhlxRemote create();
	
}