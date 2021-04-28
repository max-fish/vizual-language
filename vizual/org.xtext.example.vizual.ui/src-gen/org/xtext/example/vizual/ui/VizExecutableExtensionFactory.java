/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.vizual.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.example.vizual.ui.internal.VizualActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class VizExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(VizualActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		VizualActivator activator = VizualActivator.getInstance();
		return activator != null ? activator.getInjector(VizualActivator.ORG_XTEXT_EXAMPLE_VIZUAL_VIZ) : null;
	}

}
