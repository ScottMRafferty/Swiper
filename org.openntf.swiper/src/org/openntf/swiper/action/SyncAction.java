package org.openntf.swiper.action;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

public class SyncAction extends com.ibm.designer.domino.team.action.SyncAction {

	@Override
	public Object execute(ExecutionEvent arg0) throws ExecutionException {

		System.out.println("about to do it");
		
		
		return super.execute(arg0);
	}

	
	
}
