/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.vizual;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class VizStandaloneSetup extends VizStandaloneSetupGenerated {

	public static void doSetup() {
		new VizStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
