/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.vizual.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class VizAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/example/vizual/parser/antlr/internal/InternalViz.tokens");
	}
}
