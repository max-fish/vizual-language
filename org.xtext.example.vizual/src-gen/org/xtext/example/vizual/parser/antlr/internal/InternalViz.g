/*
 * generated by Xtext 2.24.0
 */
grammar InternalViz;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.vizual.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.vizual.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.vizual.services.VizGrammarAccess;

}

@parser::members {

 	private VizGrammarAccess grammarAccess;

    public InternalVizParser(TokenStream input, VizGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected VizGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='html'
		{
			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getHtmlKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getMainTagsMainTagParserRuleCall_1_0());
				}
				lv_mainTags_1_0=ruleMainTag
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"mainTags",
						lv_mainTags_1_0,
						"org.xtext.example.vizual.Viz.MainTag");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleMainTag
entryRuleMainTag returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMainTagRule()); }
	iv_ruleMainTag=ruleMainTag
	{ $current=$iv_ruleMainTag.current; }
	EOF;

// Rule MainTag
ruleMainTag returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getMainTagAccess().getMainTagNameMainTagNameEnumRuleCall_0_0());
				}
				lv_mainTagName_0_0=ruleMainTagName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMainTagRule());
					}
					set(
						$current,
						"mainTagName",
						lv_mainTagName_0_0,
						"org.xtext.example.vizual.Viz.MainTagName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMainTagAccess().getNormalTagsNormalTagParserRuleCall_1_0());
				}
				lv_normalTags_1_0=ruleNormalTag
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMainTagRule());
					}
					add(
						$current,
						"normalTags",
						lv_normalTags_1_0,
						"org.xtext.example.vizual.Viz.NormalTag");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleNormalTag
entryRuleNormalTag returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNormalTagRule()); }
	iv_ruleNormalTag=ruleNormalTag
	{ $current=$iv_ruleNormalTag.current; }
	EOF;

// Rule NormalTag
ruleNormalTag returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getNormalTagAccess().getTextTagParserRuleCall_0());
		}
		this_TextTag_0=ruleTextTag
		{
			$current = $this_TextTag_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNormalTagAccess().getContainerTagParserRuleCall_1());
		}
		this_ContainerTag_1=ruleContainerTag
		{
			$current = $this_ContainerTag_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTextTag
entryRuleTextTag returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTextTagRule()); }
	iv_ruleTextTag=ruleTextTag
	{ $current=$iv_ruleTextTag.current; }
	EOF;

// Rule TextTag
ruleTextTag returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='h1'
			{
				newLeafNode(otherlv_0, grammarAccess.getTextTagAccess().getH1Keyword_0_0());
			}
			    |
			otherlv_1='h2'
			{
				newLeafNode(otherlv_1, grammarAccess.getTextTagAccess().getH2Keyword_0_1());
			}
			    |
			otherlv_2='h3'
			{
				newLeafNode(otherlv_2, grammarAccess.getTextTagAccess().getH3Keyword_0_2());
			}
			    |
			otherlv_3='h4'
			{
				newLeafNode(otherlv_3, grammarAccess.getTextTagAccess().getH4Keyword_0_3());
			}
			    |
			otherlv_4='h5'
			{
				newLeafNode(otherlv_4, grammarAccess.getTextTagAccess().getH5Keyword_0_4());
			}
			    |
			otherlv_5='h6'
			{
				newLeafNode(otherlv_5, grammarAccess.getTextTagAccess().getH6Keyword_0_5());
			}
			    |
			otherlv_6='p'
			{
				newLeafNode(otherlv_6, grammarAccess.getTextTagAccess().getPKeyword_0_6());
			}
		)
		(
			(
				lv_name_7_0=RULE_ID
				{
					newLeafNode(lv_name_7_0, grammarAccess.getTextTagAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTextTagRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_7_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleContainerTag
entryRuleContainerTag returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContainerTagRule()); }
	iv_ruleContainerTag=ruleContainerTag
	{ $current=$iv_ruleContainerTag.current; }
	EOF;

// Rule ContainerTag
ruleContainerTag returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getContainerTagAccess().getContainerTagAction_0(),
					$current);
			}
		)
		otherlv_1='div'
		{
			newLeafNode(otherlv_1, grammarAccess.getContainerTagAccess().getDivKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getContainerTagAccess().getNormalTagsNormalTagParserRuleCall_2_0());
				}
				lv_normalTags_2_0=ruleNormalTag
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getContainerTagRule());
					}
					add(
						$current,
						"normalTags",
						lv_normalTags_2_0,
						"org.xtext.example.vizual.Viz.NormalTag");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='end'
		{
			newLeafNode(otherlv_3, grammarAccess.getContainerTagAccess().getEndKeyword_3());
		}
	)
;

// Rule MainTagName
ruleMainTagName returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='head'
			{
				$current = grammarAccess.getMainTagNameAccess().getHeadEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getMainTagNameAccess().getHeadEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='body'
			{
				$current = grammarAccess.getMainTagNameAccess().getBodyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getMainTagNameAccess().getBodyEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_NEW_LINE : '\n';

RULE_TAB_SPACE : '\t';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
