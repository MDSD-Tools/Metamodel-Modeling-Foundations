package tools.mdsd.modelingfoundations.identifier.impl;

import org.eclipse.emf.ecore.util.EcoreUtil;

public class IdentifierImpl extends IdentifierImplGen {
	
	public IdentifierImpl() {
		setId(EcoreUtil.generateUUID());
	}

}
