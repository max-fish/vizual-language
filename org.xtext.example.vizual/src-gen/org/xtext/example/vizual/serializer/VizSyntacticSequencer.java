/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.vizual.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.vizual.services.VizGrammarAccess;

@SuppressWarnings("all")
public class VizSyntacticSequencer extends AbstractSyntacticSequencer {

	protected VizGrammarAccess grammarAccess;
	protected AbstractElementAlias match_TextTag_H1Keyword_0_0_or_H2Keyword_0_1_or_H3Keyword_0_2_or_H4Keyword_0_3_or_H5Keyword_0_4_or_H6Keyword_0_5_or_PKeyword_0_6;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (VizGrammarAccess) access;
		match_TextTag_H1Keyword_0_0_or_H2Keyword_0_1_or_H3Keyword_0_2_or_H4Keyword_0_3_or_H5Keyword_0_4_or_H6Keyword_0_5_or_PKeyword_0_6 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTextTagAccess().getH1Keyword_0_0()), new TokenAlias(false, false, grammarAccess.getTextTagAccess().getH2Keyword_0_1()), new TokenAlias(false, false, grammarAccess.getTextTagAccess().getH3Keyword_0_2()), new TokenAlias(false, false, grammarAccess.getTextTagAccess().getH4Keyword_0_3()), new TokenAlias(false, false, grammarAccess.getTextTagAccess().getH5Keyword_0_4()), new TokenAlias(false, false, grammarAccess.getTextTagAccess().getH6Keyword_0_5()), new TokenAlias(false, false, grammarAccess.getTextTagAccess().getPKeyword_0_6()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_TextTag_H1Keyword_0_0_or_H2Keyword_0_1_or_H3Keyword_0_2_or_H4Keyword_0_3_or_H5Keyword_0_4_or_H6Keyword_0_5_or_PKeyword_0_6.equals(syntax))
				emit_TextTag_H1Keyword_0_0_or_H2Keyword_0_1_or_H3Keyword_0_2_or_H4Keyword_0_3_or_H5Keyword_0_4_or_H6Keyword_0_5_or_PKeyword_0_6(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     (
	  *         'h1' | 
	  *         'h2' | 
	  *         'h3' | 
	  *         'h4' | 
	  *         'h5' | 
	  *         'h6' | 
	  *         'p'
	  *     )
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=ID
	 */
	protected void emit_TextTag_H1Keyword_0_0_or_H2Keyword_0_1_or_H3Keyword_0_2_or_H4Keyword_0_3_or_H5Keyword_0_4_or_H6Keyword_0_5_or_PKeyword_0_6(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
