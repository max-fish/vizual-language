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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVizParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'head'", "'body'", "'{'", "'}'", "'title'", "'with('", "')'", "'div'", "'h1'", "'h2'", "'h3'", "'h4'", "'h5'", "'h6'", "'p'", "'table'", "'tr'", "'th'", "'td'", "'doctype'", "'html'", "'DropDownSelection'", "'label'", "'options'", "'BulletPoint'", "'NumberedList'", "'endHtml'", "'BP'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalVizParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVizParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVizParser.tokenNames; }
    public String getGrammarFileName() { return "InternalViz.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalViz.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalViz.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalViz.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalViz.g:72:1: ruleModel returns [EObject current=null] : ( (lv_commands_0_0= ruleCommand ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_0_0 = null;



        	enterRule();

        try {
            // InternalViz.g:78:2: ( ( (lv_commands_0_0= ruleCommand ) )* )
            // InternalViz.g:79:2: ( (lv_commands_0_0= ruleCommand ) )*
            {
            // InternalViz.g:79:2: ( (lv_commands_0_0= ruleCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||(LA1_0>=18 && LA1_0<=32)||(LA1_0>=35 && LA1_0<=38)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalViz.g:80:3: (lv_commands_0_0= ruleCommand )
            	    {
            	    // InternalViz.g:80:3: (lv_commands_0_0= ruleCommand )
            	    // InternalViz.g:81:4: lv_commands_0_0= ruleCommand
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_commands_0_0=ruleCommand();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"commands",
            	    					lv_commands_0_0,
            	    					"org.xtext.example.vizual.Viz.Command");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCommand"
    // InternalViz.g:101:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalViz.g:101:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalViz.g:102:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalViz.g:108:1: ruleCommand returns [EObject current=null] : (this_Initializer_0= ruleInitializer | ( (lv_html_1_0= ruleHtmlCommand ) ) | ( (lv_endHtml_2_0= ruleEndHtmlCommand ) ) | this_HeadCommand_3= ruleHeadCommand | this_BodyCommand_4= ruleBodyCommand | this_CommonCommand_5= ruleCommonCommand ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Initializer_0 = null;

        Enumerator lv_html_1_0 = null;

        Enumerator lv_endHtml_2_0 = null;

        EObject this_HeadCommand_3 = null;

        EObject this_BodyCommand_4 = null;

        EObject this_CommonCommand_5 = null;



        	enterRule();

        try {
            // InternalViz.g:114:2: ( (this_Initializer_0= ruleInitializer | ( (lv_html_1_0= ruleHtmlCommand ) ) | ( (lv_endHtml_2_0= ruleEndHtmlCommand ) ) | this_HeadCommand_3= ruleHeadCommand | this_BodyCommand_4= ruleBodyCommand | this_CommonCommand_5= ruleCommonCommand ) )
            // InternalViz.g:115:2: (this_Initializer_0= ruleInitializer | ( (lv_html_1_0= ruleHtmlCommand ) ) | ( (lv_endHtml_2_0= ruleEndHtmlCommand ) ) | this_HeadCommand_3= ruleHeadCommand | this_BodyCommand_4= ruleBodyCommand | this_CommonCommand_5= ruleCommonCommand )
            {
            // InternalViz.g:115:2: (this_Initializer_0= ruleInitializer | ( (lv_html_1_0= ruleHtmlCommand ) ) | ( (lv_endHtml_2_0= ruleEndHtmlCommand ) ) | this_HeadCommand_3= ruleHeadCommand | this_BodyCommand_4= ruleBodyCommand | this_CommonCommand_5= ruleCommonCommand )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 37:
                {
                alt2=3;
                }
                break;
            case 11:
                {
                alt2=4;
                }
                break;
            case 12:
                {
                alt2=5;
                }
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 32:
            case 35:
            case 36:
            case 38:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalViz.g:116:3: this_Initializer_0= ruleInitializer
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getInitializerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Initializer_0=ruleInitializer();

                    state._fsp--;


                    			current = this_Initializer_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalViz.g:125:3: ( (lv_html_1_0= ruleHtmlCommand ) )
                    {
                    // InternalViz.g:125:3: ( (lv_html_1_0= ruleHtmlCommand ) )
                    // InternalViz.g:126:4: (lv_html_1_0= ruleHtmlCommand )
                    {
                    // InternalViz.g:126:4: (lv_html_1_0= ruleHtmlCommand )
                    // InternalViz.g:127:5: lv_html_1_0= ruleHtmlCommand
                    {

                    					newCompositeNode(grammarAccess.getCommandAccess().getHtmlHtmlCommandEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_html_1_0=ruleHtmlCommand();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCommandRule());
                    					}
                    					set(
                    						current,
                    						"html",
                    						lv_html_1_0,
                    						"org.xtext.example.vizual.Viz.HtmlCommand");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalViz.g:145:3: ( (lv_endHtml_2_0= ruleEndHtmlCommand ) )
                    {
                    // InternalViz.g:145:3: ( (lv_endHtml_2_0= ruleEndHtmlCommand ) )
                    // InternalViz.g:146:4: (lv_endHtml_2_0= ruleEndHtmlCommand )
                    {
                    // InternalViz.g:146:4: (lv_endHtml_2_0= ruleEndHtmlCommand )
                    // InternalViz.g:147:5: lv_endHtml_2_0= ruleEndHtmlCommand
                    {

                    					newCompositeNode(grammarAccess.getCommandAccess().getEndHtmlEndHtmlCommandEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_endHtml_2_0=ruleEndHtmlCommand();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCommandRule());
                    					}
                    					set(
                    						current,
                    						"endHtml",
                    						lv_endHtml_2_0,
                    						"org.xtext.example.vizual.Viz.EndHtmlCommand");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalViz.g:165:3: this_HeadCommand_3= ruleHeadCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getHeadCommandParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_HeadCommand_3=ruleHeadCommand();

                    state._fsp--;


                    			current = this_HeadCommand_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalViz.g:174:3: this_BodyCommand_4= ruleBodyCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getBodyCommandParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_BodyCommand_4=ruleBodyCommand();

                    state._fsp--;


                    			current = this_BodyCommand_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalViz.g:183:3: this_CommonCommand_5= ruleCommonCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getCommonCommandParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommonCommand_5=ruleCommonCommand();

                    state._fsp--;


                    			current = this_CommonCommand_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleHeadCommand"
    // InternalViz.g:195:1: entryRuleHeadCommand returns [EObject current=null] : iv_ruleHeadCommand= ruleHeadCommand EOF ;
    public final EObject entryRuleHeadCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeadCommand = null;


        try {
            // InternalViz.g:195:52: (iv_ruleHeadCommand= ruleHeadCommand EOF )
            // InternalViz.g:196:2: iv_ruleHeadCommand= ruleHeadCommand EOF
            {
             newCompositeNode(grammarAccess.getHeadCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeadCommand=ruleHeadCommand();

            state._fsp--;

             current =iv_ruleHeadCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeadCommand"


    // $ANTLR start "ruleHeadCommand"
    // InternalViz.g:202:1: ruleHeadCommand returns [EObject current=null] : (otherlv_0= 'head' ( (lv_title_1_0= ruleTitleCommand ) ) ) ;
    public final EObject ruleHeadCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_title_1_0 = null;



        	enterRule();

        try {
            // InternalViz.g:208:2: ( (otherlv_0= 'head' ( (lv_title_1_0= ruleTitleCommand ) ) ) )
            // InternalViz.g:209:2: (otherlv_0= 'head' ( (lv_title_1_0= ruleTitleCommand ) ) )
            {
            // InternalViz.g:209:2: (otherlv_0= 'head' ( (lv_title_1_0= ruleTitleCommand ) ) )
            // InternalViz.g:210:3: otherlv_0= 'head' ( (lv_title_1_0= ruleTitleCommand ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHeadCommandAccess().getHeadKeyword_0());
            		
            // InternalViz.g:214:3: ( (lv_title_1_0= ruleTitleCommand ) )
            // InternalViz.g:215:4: (lv_title_1_0= ruleTitleCommand )
            {
            // InternalViz.g:215:4: (lv_title_1_0= ruleTitleCommand )
            // InternalViz.g:216:5: lv_title_1_0= ruleTitleCommand
            {

            					newCompositeNode(grammarAccess.getHeadCommandAccess().getTitleTitleCommandParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_title_1_0=ruleTitleCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeadCommandRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.xtext.example.vizual.Viz.TitleCommand");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeadCommand"


    // $ANTLR start "entryRuleBodyCommand"
    // InternalViz.g:237:1: entryRuleBodyCommand returns [EObject current=null] : iv_ruleBodyCommand= ruleBodyCommand EOF ;
    public final EObject entryRuleBodyCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyCommand = null;


        try {
            // InternalViz.g:237:52: (iv_ruleBodyCommand= ruleBodyCommand EOF )
            // InternalViz.g:238:2: iv_ruleBodyCommand= ruleBodyCommand EOF
            {
             newCompositeNode(grammarAccess.getBodyCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBodyCommand=ruleBodyCommand();

            state._fsp--;

             current =iv_ruleBodyCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBodyCommand"


    // $ANTLR start "ruleBodyCommand"
    // InternalViz.g:244:1: ruleBodyCommand returns [EObject current=null] : ( () otherlv_1= 'body' otherlv_2= '{' ( (lv_children_3_0= ruleCommonCommand ) )* otherlv_4= '}' ) ;
    public final EObject ruleBodyCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_children_3_0 = null;



        	enterRule();

        try {
            // InternalViz.g:250:2: ( ( () otherlv_1= 'body' otherlv_2= '{' ( (lv_children_3_0= ruleCommonCommand ) )* otherlv_4= '}' ) )
            // InternalViz.g:251:2: ( () otherlv_1= 'body' otherlv_2= '{' ( (lv_children_3_0= ruleCommonCommand ) )* otherlv_4= '}' )
            {
            // InternalViz.g:251:2: ( () otherlv_1= 'body' otherlv_2= '{' ( (lv_children_3_0= ruleCommonCommand ) )* otherlv_4= '}' )
            // InternalViz.g:252:3: () otherlv_1= 'body' otherlv_2= '{' ( (lv_children_3_0= ruleCommonCommand ) )* otherlv_4= '}'
            {
            // InternalViz.g:252:3: ()
            // InternalViz.g:253:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBodyCommandAccess().getBodyCommandAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getBodyCommandAccess().getBodyKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getBodyCommandAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalViz.g:267:3: ( (lv_children_3_0= ruleCommonCommand ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=18 && LA3_0<=29)||LA3_0==32||(LA3_0>=35 && LA3_0<=36)||LA3_0==38) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalViz.g:268:4: (lv_children_3_0= ruleCommonCommand )
            	    {
            	    // InternalViz.g:268:4: (lv_children_3_0= ruleCommonCommand )
            	    // InternalViz.g:269:5: lv_children_3_0= ruleCommonCommand
            	    {

            	    					newCompositeNode(grammarAccess.getBodyCommandAccess().getChildrenCommonCommandParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_children_3_0=ruleCommonCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBodyCommandRule());
            	    					}
            	    					add(
            	    						current,
            	    						"children",
            	    						lv_children_3_0,
            	    						"org.xtext.example.vizual.Viz.CommonCommand");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBodyCommandAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBodyCommand"


    // $ANTLR start "entryRuleTitleCommand"
    // InternalViz.g:294:1: entryRuleTitleCommand returns [EObject current=null] : iv_ruleTitleCommand= ruleTitleCommand EOF ;
    public final EObject entryRuleTitleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitleCommand = null;


        try {
            // InternalViz.g:294:53: (iv_ruleTitleCommand= ruleTitleCommand EOF )
            // InternalViz.g:295:2: iv_ruleTitleCommand= ruleTitleCommand EOF
            {
             newCompositeNode(grammarAccess.getTitleCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitleCommand=ruleTitleCommand();

            state._fsp--;

             current =iv_ruleTitleCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTitleCommand"


    // $ANTLR start "ruleTitleCommand"
    // InternalViz.g:301:1: ruleTitleCommand returns [EObject current=null] : (otherlv_0= 'title' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTitleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalViz.g:307:2: ( (otherlv_0= 'title' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalViz.g:308:2: (otherlv_0= 'title' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalViz.g:308:2: (otherlv_0= 'title' ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalViz.g:309:3: otherlv_0= 'title' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTitleCommandAccess().getTitleKeyword_0());
            		
            // InternalViz.g:313:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalViz.g:314:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalViz.g:314:4: (lv_text_1_0= RULE_STRING )
            // InternalViz.g:315:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getTitleCommandAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTitleCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTitleCommand"


    // $ANTLR start "entryRuleCommonCommand"
    // InternalViz.g:335:1: entryRuleCommonCommand returns [EObject current=null] : iv_ruleCommonCommand= ruleCommonCommand EOF ;
    public final EObject entryRuleCommonCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonCommand = null;


        try {
            // InternalViz.g:335:54: (iv_ruleCommonCommand= ruleCommonCommand EOF )
            // InternalViz.g:336:2: iv_ruleCommonCommand= ruleCommonCommand EOF
            {
             newCompositeNode(grammarAccess.getCommonCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommonCommand=ruleCommonCommand();

            state._fsp--;

             current =iv_ruleCommonCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommonCommand"


    // $ANTLR start "ruleCommonCommand"
    // InternalViz.g:342:1: ruleCommonCommand returns [EObject current=null] : (this_Create_0= ruleCreate | this_TextCommand_1= ruleTextCommand | this_TableCommand_2= ruleTableCommand | this_DivCommand_3= ruleDivCommand | this_TableRow_4= ruleTableRow | this_TableHeader_5= ruleTableHeader | this_TableData_6= ruleTableData | this_DropDownCommand_7= ruleDropDownCommand | this_BulletPointCommand_8= ruleBulletPointCommand | this_NumberedListCommand_9= ruleNumberedListCommand ) ;
    public final EObject ruleCommonCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Create_0 = null;

        EObject this_TextCommand_1 = null;

        EObject this_TableCommand_2 = null;

        EObject this_DivCommand_3 = null;

        EObject this_TableRow_4 = null;

        EObject this_TableHeader_5 = null;

        EObject this_TableData_6 = null;

        EObject this_DropDownCommand_7 = null;

        EObject this_BulletPointCommand_8 = null;

        EObject this_NumberedListCommand_9 = null;



        	enterRule();

        try {
            // InternalViz.g:348:2: ( (this_Create_0= ruleCreate | this_TextCommand_1= ruleTextCommand | this_TableCommand_2= ruleTableCommand | this_DivCommand_3= ruleDivCommand | this_TableRow_4= ruleTableRow | this_TableHeader_5= ruleTableHeader | this_TableData_6= ruleTableData | this_DropDownCommand_7= ruleDropDownCommand | this_BulletPointCommand_8= ruleBulletPointCommand | this_NumberedListCommand_9= ruleNumberedListCommand ) )
            // InternalViz.g:349:2: (this_Create_0= ruleCreate | this_TextCommand_1= ruleTextCommand | this_TableCommand_2= ruleTableCommand | this_DivCommand_3= ruleDivCommand | this_TableRow_4= ruleTableRow | this_TableHeader_5= ruleTableHeader | this_TableData_6= ruleTableData | this_DropDownCommand_7= ruleDropDownCommand | this_BulletPointCommand_8= ruleBulletPointCommand | this_NumberedListCommand_9= ruleNumberedListCommand )
            {
            // InternalViz.g:349:2: (this_Create_0= ruleCreate | this_TextCommand_1= ruleTextCommand | this_TableCommand_2= ruleTableCommand | this_DivCommand_3= ruleDivCommand | this_TableRow_4= ruleTableRow | this_TableHeader_5= ruleTableHeader | this_TableData_6= ruleTableData | this_DropDownCommand_7= ruleDropDownCommand | this_BulletPointCommand_8= ruleBulletPointCommand | this_NumberedListCommand_9= ruleNumberedListCommand )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt4=1;
                }
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                {
                alt4=2;
                }
                break;
            case 26:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            case 27:
                {
                alt4=5;
                }
                break;
            case 28:
                {
                alt4=6;
                }
                break;
            case 29:
                {
                alt4=7;
                }
                break;
            case 32:
                {
                alt4=8;
                }
                break;
            case 35:
                {
                alt4=9;
                }
                break;
            case 36:
                {
                alt4=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalViz.g:350:3: this_Create_0= ruleCreate
                    {

                    			newCompositeNode(grammarAccess.getCommonCommandAccess().getCreateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Create_0=ruleCreate();

                    state._fsp--;


                    			current = this_Create_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalViz.g:359:3: this_TextCommand_1= ruleTextCommand
                    {

                    			newCompositeNode(grammarAccess.getCommonCommandAccess().getTextCommandParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextCommand_1=ruleTextCommand();

                    state._fsp--;


                    			current = this_TextCommand_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalViz.g:368:3: this_TableCommand_2= ruleTableCommand
                    {

                    			newCompositeNode(grammarAccess.getCommonCommandAccess().getTableCommandParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TableCommand_2=ruleTableCommand();

                    state._fsp--;


                    			current = this_TableCommand_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalViz.g:377:3: this_DivCommand_3= ruleDivCommand
                    {

                    			newCompositeNode(grammarAccess.getCommonCommandAccess().getDivCommandParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DivCommand_3=ruleDivCommand();

                    state._fsp--;


                    			current = this_DivCommand_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalViz.g:386:3: this_TableRow_4= ruleTableRow
                    {

                    			newCompositeNode(grammarAccess.getCommonCommandAccess().getTableRowParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_TableRow_4=ruleTableRow();

                    state._fsp--;


                    			current = this_TableRow_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalViz.g:395:3: this_TableHeader_5= ruleTableHeader
                    {

                    			newCompositeNode(grammarAccess.getCommonCommandAccess().getTableHeaderParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_TableHeader_5=ruleTableHeader();

                    state._fsp--;


                    			current = this_TableHeader_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalViz.g:404:3: this_TableData_6= ruleTableData
                    {

                    			newCompositeNode(grammarAccess.getCommonCommandAccess().getTableDataParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_TableData_6=ruleTableData();

                    state._fsp--;


                    			current = this_TableData_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalViz.g:413:3: this_DropDownCommand_7= ruleDropDownCommand
                    {

                    			newCompositeNode(grammarAccess.getCommonCommandAccess().getDropDownCommandParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_DropDownCommand_7=ruleDropDownCommand();

                    state._fsp--;


                    			current = this_DropDownCommand_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalViz.g:422:3: this_BulletPointCommand_8= ruleBulletPointCommand
                    {

                    			newCompositeNode(grammarAccess.getCommonCommandAccess().getBulletPointCommandParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_BulletPointCommand_8=ruleBulletPointCommand();

                    state._fsp--;


                    			current = this_BulletPointCommand_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalViz.g:431:3: this_NumberedListCommand_9= ruleNumberedListCommand
                    {

                    			newCompositeNode(grammarAccess.getCommonCommandAccess().getNumberedListCommandParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberedListCommand_9=ruleNumberedListCommand();

                    state._fsp--;


                    			current = this_NumberedListCommand_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommonCommand"


    // $ANTLR start "entryRuleDivCommand"
    // InternalViz.g:443:1: entryRuleDivCommand returns [EObject current=null] : iv_ruleDivCommand= ruleDivCommand EOF ;
    public final EObject entryRuleDivCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivCommand = null;


        try {
            // InternalViz.g:443:51: (iv_ruleDivCommand= ruleDivCommand EOF )
            // InternalViz.g:444:2: iv_ruleDivCommand= ruleDivCommand EOF
            {
             newCompositeNode(grammarAccess.getDivCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivCommand=ruleDivCommand();

            state._fsp--;

             current =iv_ruleDivCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivCommand"


    // $ANTLR start "ruleDivCommand"
    // InternalViz.g:450:1: ruleDivCommand returns [EObject current=null] : ( ( (lv_div_0_0= ruleDiv ) ) ( (lv_divText_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDivCommand() throws RecognitionException {
        EObject current = null;

        Token lv_divText_1_0=null;
        EObject lv_div_0_0 = null;



        	enterRule();

        try {
            // InternalViz.g:456:2: ( ( ( (lv_div_0_0= ruleDiv ) ) ( (lv_divText_1_0= RULE_STRING ) ) ) )
            // InternalViz.g:457:2: ( ( (lv_div_0_0= ruleDiv ) ) ( (lv_divText_1_0= RULE_STRING ) ) )
            {
            // InternalViz.g:457:2: ( ( (lv_div_0_0= ruleDiv ) ) ( (lv_divText_1_0= RULE_STRING ) ) )
            // InternalViz.g:458:3: ( (lv_div_0_0= ruleDiv ) ) ( (lv_divText_1_0= RULE_STRING ) )
            {
            // InternalViz.g:458:3: ( (lv_div_0_0= ruleDiv ) )
            // InternalViz.g:459:4: (lv_div_0_0= ruleDiv )
            {
            // InternalViz.g:459:4: (lv_div_0_0= ruleDiv )
            // InternalViz.g:460:5: lv_div_0_0= ruleDiv
            {

            					newCompositeNode(grammarAccess.getDivCommandAccess().getDivDivParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_div_0_0=ruleDiv();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDivCommandRule());
            					}
            					set(
            						current,
            						"div",
            						lv_div_0_0,
            						"org.xtext.example.vizual.Viz.Div");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalViz.g:477:3: ( (lv_divText_1_0= RULE_STRING ) )
            // InternalViz.g:478:4: (lv_divText_1_0= RULE_STRING )
            {
            // InternalViz.g:478:4: (lv_divText_1_0= RULE_STRING )
            // InternalViz.g:479:5: lv_divText_1_0= RULE_STRING
            {
            lv_divText_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_divText_1_0, grammarAccess.getDivCommandAccess().getDivTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDivCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"divText",
            						lv_divText_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivCommand"


    // $ANTLR start "entryRuleCreate"
    // InternalViz.g:499:1: entryRuleCreate returns [EObject current=null] : iv_ruleCreate= ruleCreate EOF ;
    public final EObject entryRuleCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreate = null;


        try {
            // InternalViz.g:499:47: (iv_ruleCreate= ruleCreate EOF )
            // InternalViz.g:500:2: iv_ruleCreate= ruleCreate EOF
            {
             newCompositeNode(grammarAccess.getCreateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreate=ruleCreate();

            state._fsp--;

             current =iv_ruleCreate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreate"


    // $ANTLR start "ruleCreate"
    // InternalViz.g:506:1: ruleCreate returns [EObject current=null] : ( ( (lv_command_0_0= ruleCreateBulletPoints ) ) otherlv_1= 'with(' ( (lv_bullets_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleCreate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_bullets_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_command_0_0 = null;



        	enterRule();

        try {
            // InternalViz.g:512:2: ( ( ( (lv_command_0_0= ruleCreateBulletPoints ) ) otherlv_1= 'with(' ( (lv_bullets_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalViz.g:513:2: ( ( (lv_command_0_0= ruleCreateBulletPoints ) ) otherlv_1= 'with(' ( (lv_bullets_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalViz.g:513:2: ( ( (lv_command_0_0= ruleCreateBulletPoints ) ) otherlv_1= 'with(' ( (lv_bullets_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalViz.g:514:3: ( (lv_command_0_0= ruleCreateBulletPoints ) ) otherlv_1= 'with(' ( (lv_bullets_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            // InternalViz.g:514:3: ( (lv_command_0_0= ruleCreateBulletPoints ) )
            // InternalViz.g:515:4: (lv_command_0_0= ruleCreateBulletPoints )
            {
            // InternalViz.g:515:4: (lv_command_0_0= ruleCreateBulletPoints )
            // InternalViz.g:516:5: lv_command_0_0= ruleCreateBulletPoints
            {

            					newCompositeNode(grammarAccess.getCreateAccess().getCommandCreateBulletPointsEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_command_0_0=ruleCreateBulletPoints();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateRule());
            					}
            					set(
            						current,
            						"command",
            						lv_command_0_0,
            						"org.xtext.example.vizual.Viz.CreateBulletPoints");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateAccess().getWithKeyword_1());
            		
            // InternalViz.g:537:3: ( (lv_bullets_2_0= RULE_STRING ) )
            // InternalViz.g:538:4: (lv_bullets_2_0= RULE_STRING )
            {
            // InternalViz.g:538:4: (lv_bullets_2_0= RULE_STRING )
            // InternalViz.g:539:5: lv_bullets_2_0= RULE_STRING
            {
            lv_bullets_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_bullets_2_0, grammarAccess.getCreateAccess().getBulletsSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"bullets",
            						lv_bullets_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCreateAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreate"


    // $ANTLR start "entryRuleTextCommand"
    // InternalViz.g:563:1: entryRuleTextCommand returns [EObject current=null] : iv_ruleTextCommand= ruleTextCommand EOF ;
    public final EObject entryRuleTextCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextCommand = null;


        try {
            // InternalViz.g:563:52: (iv_ruleTextCommand= ruleTextCommand EOF )
            // InternalViz.g:564:2: iv_ruleTextCommand= ruleTextCommand EOF
            {
             newCompositeNode(grammarAccess.getTextCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextCommand=ruleTextCommand();

            state._fsp--;

             current =iv_ruleTextCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextCommand"


    // $ANTLR start "ruleTextCommand"
    // InternalViz.g:570:1: ruleTextCommand returns [EObject current=null] : ( ( (lv_heading_0_0= ruleTextHeading ) ) ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTextCommand() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        AntlrDatatypeRuleToken lv_heading_0_0 = null;



        	enterRule();

        try {
            // InternalViz.g:576:2: ( ( ( (lv_heading_0_0= ruleTextHeading ) ) ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalViz.g:577:2: ( ( (lv_heading_0_0= ruleTextHeading ) ) ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalViz.g:577:2: ( ( (lv_heading_0_0= ruleTextHeading ) ) ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalViz.g:578:3: ( (lv_heading_0_0= ruleTextHeading ) ) ( (lv_text_1_0= RULE_STRING ) )
            {
            // InternalViz.g:578:3: ( (lv_heading_0_0= ruleTextHeading ) )
            // InternalViz.g:579:4: (lv_heading_0_0= ruleTextHeading )
            {
            // InternalViz.g:579:4: (lv_heading_0_0= ruleTextHeading )
            // InternalViz.g:580:5: lv_heading_0_0= ruleTextHeading
            {

            					newCompositeNode(grammarAccess.getTextCommandAccess().getHeadingTextHeadingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_heading_0_0=ruleTextHeading();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextCommandRule());
            					}
            					set(
            						current,
            						"heading",
            						lv_heading_0_0,
            						"org.xtext.example.vizual.Viz.TextHeading");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalViz.g:597:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalViz.g:598:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalViz.g:598:4: (lv_text_1_0= RULE_STRING )
            // InternalViz.g:599:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getTextCommandAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextCommand"


    // $ANTLR start "entryRuleDiv"
    // InternalViz.g:619:1: entryRuleDiv returns [EObject current=null] : iv_ruleDiv= ruleDiv EOF ;
    public final EObject entryRuleDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiv = null;


        try {
            // InternalViz.g:619:44: (iv_ruleDiv= ruleDiv EOF )
            // InternalViz.g:620:2: iv_ruleDiv= ruleDiv EOF
            {
             newCompositeNode(grammarAccess.getDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiv=ruleDiv();

            state._fsp--;

             current =iv_ruleDiv; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiv"


    // $ANTLR start "ruleDiv"
    // InternalViz.g:626:1: ruleDiv returns [EObject current=null] : ( (lv_Division_0_0= ruledefaultDiv ) ) ;
    public final EObject ruleDiv() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_Division_0_0 = null;



        	enterRule();

        try {
            // InternalViz.g:632:2: ( ( (lv_Division_0_0= ruledefaultDiv ) ) )
            // InternalViz.g:633:2: ( (lv_Division_0_0= ruledefaultDiv ) )
            {
            // InternalViz.g:633:2: ( (lv_Division_0_0= ruledefaultDiv ) )
            // InternalViz.g:634:3: (lv_Division_0_0= ruledefaultDiv )
            {
            // InternalViz.g:634:3: (lv_Division_0_0= ruledefaultDiv )
            // InternalViz.g:635:4: lv_Division_0_0= ruledefaultDiv
            {

            				newCompositeNode(grammarAccess.getDivAccess().getDivisionDefaultDivParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_Division_0_0=ruledefaultDiv();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDivRule());
            				}
            				set(
            					current,
            					"Division",
            					lv_Division_0_0,
            					"org.xtext.example.vizual.Viz.defaultDiv");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiv"


    // $ANTLR start "entryRuledefaultDiv"
    // InternalViz.g:655:1: entryRuledefaultDiv returns [String current=null] : iv_ruledefaultDiv= ruledefaultDiv EOF ;
    public final String entryRuledefaultDiv() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledefaultDiv = null;


        try {
            // InternalViz.g:655:50: (iv_ruledefaultDiv= ruledefaultDiv EOF )
            // InternalViz.g:656:2: iv_ruledefaultDiv= ruledefaultDiv EOF
            {
             newCompositeNode(grammarAccess.getDefaultDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledefaultDiv=ruledefaultDiv();

            state._fsp--;

             current =iv_ruledefaultDiv.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledefaultDiv"


    // $ANTLR start "ruledefaultDiv"
    // InternalViz.g:662:1: ruledefaultDiv returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'div' ;
    public final AntlrDatatypeRuleToken ruledefaultDiv() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalViz.g:668:2: (kw= 'div' )
            // InternalViz.g:669:2: kw= 'div'
            {
            kw=(Token)match(input,18,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getDefaultDivAccess().getDivKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledefaultDiv"


    // $ANTLR start "entryRuleTextHeading"
    // InternalViz.g:677:1: entryRuleTextHeading returns [String current=null] : iv_ruleTextHeading= ruleTextHeading EOF ;
    public final String entryRuleTextHeading() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTextHeading = null;


        try {
            // InternalViz.g:677:51: (iv_ruleTextHeading= ruleTextHeading EOF )
            // InternalViz.g:678:2: iv_ruleTextHeading= ruleTextHeading EOF
            {
             newCompositeNode(grammarAccess.getTextHeadingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextHeading=ruleTextHeading();

            state._fsp--;

             current =iv_ruleTextHeading.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextHeading"


    // $ANTLR start "ruleTextHeading"
    // InternalViz.g:684:1: ruleTextHeading returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'h1' | kw= 'h2' | kw= 'h3' | kw= 'h4' | kw= 'h5' | kw= 'h6' | kw= 'p' ) ;
    public final AntlrDatatypeRuleToken ruleTextHeading() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalViz.g:690:2: ( (kw= 'h1' | kw= 'h2' | kw= 'h3' | kw= 'h4' | kw= 'h5' | kw= 'h6' | kw= 'p' ) )
            // InternalViz.g:691:2: (kw= 'h1' | kw= 'h2' | kw= 'h3' | kw= 'h4' | kw= 'h5' | kw= 'h6' | kw= 'p' )
            {
            // InternalViz.g:691:2: (kw= 'h1' | kw= 'h2' | kw= 'h3' | kw= 'h4' | kw= 'h5' | kw= 'h6' | kw= 'p' )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            case 22:
                {
                alt5=4;
                }
                break;
            case 23:
                {
                alt5=5;
                }
                break;
            case 24:
                {
                alt5=6;
                }
                break;
            case 25:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalViz.g:692:3: kw= 'h1'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTextHeadingAccess().getH1Keyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalViz.g:698:3: kw= 'h2'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTextHeadingAccess().getH2Keyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalViz.g:704:3: kw= 'h3'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTextHeadingAccess().getH3Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalViz.g:710:3: kw= 'h4'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTextHeadingAccess().getH4Keyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalViz.g:716:3: kw= 'h5'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTextHeadingAccess().getH5Keyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalViz.g:722:3: kw= 'h6'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTextHeadingAccess().getH6Keyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalViz.g:728:3: kw= 'p'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTextHeadingAccess().getPKeyword_6());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextHeading"


    // $ANTLR start "entryRuleTableCommand"
    // InternalViz.g:737:1: entryRuleTableCommand returns [EObject current=null] : iv_ruleTableCommand= ruleTableCommand EOF ;
    public final EObject entryRuleTableCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableCommand = null;


        try {
            // InternalViz.g:737:53: (iv_ruleTableCommand= ruleTableCommand EOF )
            // InternalViz.g:738:2: iv_ruleTableCommand= ruleTableCommand EOF
            {
             newCompositeNode(grammarAccess.getTableCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableCommand=ruleTableCommand();

            state._fsp--;

             current =iv_ruleTableCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableCommand"


    // $ANTLR start "ruleTableCommand"
    // InternalViz.g:744:1: ruleTableCommand returns [EObject current=null] : ( () otherlv_1= 'table' otherlv_2= '{' ( (lv_rows_3_0= ruleTableRow ) )* otherlv_4= '}' ) ;
    public final EObject ruleTableCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_rows_3_0 = null;



        	enterRule();

        try {
            // InternalViz.g:750:2: ( ( () otherlv_1= 'table' otherlv_2= '{' ( (lv_rows_3_0= ruleTableRow ) )* otherlv_4= '}' ) )
            // InternalViz.g:751:2: ( () otherlv_1= 'table' otherlv_2= '{' ( (lv_rows_3_0= ruleTableRow ) )* otherlv_4= '}' )
            {
            // InternalViz.g:751:2: ( () otherlv_1= 'table' otherlv_2= '{' ( (lv_rows_3_0= ruleTableRow ) )* otherlv_4= '}' )
            // InternalViz.g:752:3: () otherlv_1= 'table' otherlv_2= '{' ( (lv_rows_3_0= ruleTableRow ) )* otherlv_4= '}'
            {
            // InternalViz.g:752:3: ()
            // InternalViz.g:753:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTableCommandAccess().getTableCommandAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTableCommandAccess().getTableKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getTableCommandAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalViz.g:767:3: ( (lv_rows_3_0= ruleTableRow ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalViz.g:768:4: (lv_rows_3_0= ruleTableRow )
            	    {
            	    // InternalViz.g:768:4: (lv_rows_3_0= ruleTableRow )
            	    // InternalViz.g:769:5: lv_rows_3_0= ruleTableRow
            	    {

            	    					newCompositeNode(grammarAccess.getTableCommandAccess().getRowsTableRowParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_rows_3_0=ruleTableRow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableCommandRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rows",
            	    						lv_rows_3_0,
            	    						"org.xtext.example.vizual.Viz.TableRow");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTableCommandAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableCommand"


    // $ANTLR start "entryRuleTableRow"
    // InternalViz.g:794:1: entryRuleTableRow returns [EObject current=null] : iv_ruleTableRow= ruleTableRow EOF ;
    public final EObject entryRuleTableRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRow = null;


        try {
            // InternalViz.g:794:49: (iv_ruleTableRow= ruleTableRow EOF )
            // InternalViz.g:795:2: iv_ruleTableRow= ruleTableRow EOF
            {
             newCompositeNode(grammarAccess.getTableRowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableRow=ruleTableRow();

            state._fsp--;

             current =iv_ruleTableRow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableRow"


    // $ANTLR start "ruleTableRow"
    // InternalViz.g:801:1: ruleTableRow returns [EObject current=null] : ( () otherlv_1= 'tr' otherlv_2= '{' ( ( (lv_data_3_1= ruleTableData | lv_data_3_2= ruleTableHeader ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleTableRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_data_3_1 = null;

        EObject lv_data_3_2 = null;



        	enterRule();

        try {
            // InternalViz.g:807:2: ( ( () otherlv_1= 'tr' otherlv_2= '{' ( ( (lv_data_3_1= ruleTableData | lv_data_3_2= ruleTableHeader ) ) )* otherlv_4= '}' ) )
            // InternalViz.g:808:2: ( () otherlv_1= 'tr' otherlv_2= '{' ( ( (lv_data_3_1= ruleTableData | lv_data_3_2= ruleTableHeader ) ) )* otherlv_4= '}' )
            {
            // InternalViz.g:808:2: ( () otherlv_1= 'tr' otherlv_2= '{' ( ( (lv_data_3_1= ruleTableData | lv_data_3_2= ruleTableHeader ) ) )* otherlv_4= '}' )
            // InternalViz.g:809:3: () otherlv_1= 'tr' otherlv_2= '{' ( ( (lv_data_3_1= ruleTableData | lv_data_3_2= ruleTableHeader ) ) )* otherlv_4= '}'
            {
            // InternalViz.g:809:3: ()
            // InternalViz.g:810:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTableRowAccess().getTableRowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTableRowAccess().getTrKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getTableRowAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalViz.g:824:3: ( ( (lv_data_3_1= ruleTableData | lv_data_3_2= ruleTableHeader ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=28 && LA8_0<=29)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalViz.g:825:4: ( (lv_data_3_1= ruleTableData | lv_data_3_2= ruleTableHeader ) )
            	    {
            	    // InternalViz.g:825:4: ( (lv_data_3_1= ruleTableData | lv_data_3_2= ruleTableHeader ) )
            	    // InternalViz.g:826:5: (lv_data_3_1= ruleTableData | lv_data_3_2= ruleTableHeader )
            	    {
            	    // InternalViz.g:826:5: (lv_data_3_1= ruleTableData | lv_data_3_2= ruleTableHeader )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==29) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==28) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalViz.g:827:6: lv_data_3_1= ruleTableData
            	            {

            	            						newCompositeNode(grammarAccess.getTableRowAccess().getDataTableDataParserRuleCall_3_0_0());
            	            					
            	            pushFollow(FOLLOW_11);
            	            lv_data_3_1=ruleTableData();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getTableRowRule());
            	            						}
            	            						add(
            	            							current,
            	            							"data",
            	            							lv_data_3_1,
            	            							"org.xtext.example.vizual.Viz.TableData");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalViz.g:843:6: lv_data_3_2= ruleTableHeader
            	            {

            	            						newCompositeNode(grammarAccess.getTableRowAccess().getDataTableHeaderParserRuleCall_3_0_1());
            	            					
            	            pushFollow(FOLLOW_11);
            	            lv_data_3_2=ruleTableHeader();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getTableRowRule());
            	            						}
            	            						add(
            	            							current,
            	            							"data",
            	            							lv_data_3_2,
            	            							"org.xtext.example.vizual.Viz.TableHeader");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTableRowAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableRow"


    // $ANTLR start "entryRuleTableHeader"
    // InternalViz.g:869:1: entryRuleTableHeader returns [EObject current=null] : iv_ruleTableHeader= ruleTableHeader EOF ;
    public final EObject entryRuleTableHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableHeader = null;


        try {
            // InternalViz.g:869:52: (iv_ruleTableHeader= ruleTableHeader EOF )
            // InternalViz.g:870:2: iv_ruleTableHeader= ruleTableHeader EOF
            {
             newCompositeNode(grammarAccess.getTableHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableHeader=ruleTableHeader();

            state._fsp--;

             current =iv_ruleTableHeader; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableHeader"


    // $ANTLR start "ruleTableHeader"
    // InternalViz.g:876:1: ruleTableHeader returns [EObject current=null] : (otherlv_0= 'th' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTableHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalViz.g:882:2: ( (otherlv_0= 'th' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalViz.g:883:2: (otherlv_0= 'th' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalViz.g:883:2: (otherlv_0= 'th' ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalViz.g:884:3: otherlv_0= 'th' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTableHeaderAccess().getThKeyword_0());
            		
            // InternalViz.g:888:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalViz.g:889:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalViz.g:889:4: (lv_text_1_0= RULE_STRING )
            // InternalViz.g:890:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getTableHeaderAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableHeaderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableHeader"


    // $ANTLR start "entryRuleTableData"
    // InternalViz.g:910:1: entryRuleTableData returns [EObject current=null] : iv_ruleTableData= ruleTableData EOF ;
    public final EObject entryRuleTableData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableData = null;


        try {
            // InternalViz.g:910:50: (iv_ruleTableData= ruleTableData EOF )
            // InternalViz.g:911:2: iv_ruleTableData= ruleTableData EOF
            {
             newCompositeNode(grammarAccess.getTableDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableData=ruleTableData();

            state._fsp--;

             current =iv_ruleTableData; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableData"


    // $ANTLR start "ruleTableData"
    // InternalViz.g:917:1: ruleTableData returns [EObject current=null] : (otherlv_0= 'td' ( (lv_dataValue_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTableData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dataValue_1_0=null;


        	enterRule();

        try {
            // InternalViz.g:923:2: ( (otherlv_0= 'td' ( (lv_dataValue_1_0= RULE_STRING ) ) ) )
            // InternalViz.g:924:2: (otherlv_0= 'td' ( (lv_dataValue_1_0= RULE_STRING ) ) )
            {
            // InternalViz.g:924:2: (otherlv_0= 'td' ( (lv_dataValue_1_0= RULE_STRING ) ) )
            // InternalViz.g:925:3: otherlv_0= 'td' ( (lv_dataValue_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTableDataAccess().getTdKeyword_0());
            		
            // InternalViz.g:929:3: ( (lv_dataValue_1_0= RULE_STRING ) )
            // InternalViz.g:930:4: (lv_dataValue_1_0= RULE_STRING )
            {
            // InternalViz.g:930:4: (lv_dataValue_1_0= RULE_STRING )
            // InternalViz.g:931:5: lv_dataValue_1_0= RULE_STRING
            {
            lv_dataValue_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_dataValue_1_0, grammarAccess.getTableDataAccess().getDataValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dataValue",
            						lv_dataValue_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableData"


    // $ANTLR start "entryRuleInitializer"
    // InternalViz.g:951:1: entryRuleInitializer returns [EObject current=null] : iv_ruleInitializer= ruleInitializer EOF ;
    public final EObject entryRuleInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitializer = null;


        try {
            // InternalViz.g:951:52: (iv_ruleInitializer= ruleInitializer EOF )
            // InternalViz.g:952:2: iv_ruleInitializer= ruleInitializer EOF
            {
             newCompositeNode(grammarAccess.getInitializerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitializer=ruleInitializer();

            state._fsp--;

             current =iv_ruleInitializer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitializer"


    // $ANTLR start "ruleInitializer"
    // InternalViz.g:958:1: ruleInitializer returns [EObject current=null] : (otherlv_0= 'doctype' ( (lv_lang_1_0= 'html' ) ) ) ;
    public final EObject ruleInitializer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lang_1_0=null;


        	enterRule();

        try {
            // InternalViz.g:964:2: ( (otherlv_0= 'doctype' ( (lv_lang_1_0= 'html' ) ) ) )
            // InternalViz.g:965:2: (otherlv_0= 'doctype' ( (lv_lang_1_0= 'html' ) ) )
            {
            // InternalViz.g:965:2: (otherlv_0= 'doctype' ( (lv_lang_1_0= 'html' ) ) )
            // InternalViz.g:966:3: otherlv_0= 'doctype' ( (lv_lang_1_0= 'html' ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getInitializerAccess().getDoctypeKeyword_0());
            		
            // InternalViz.g:970:3: ( (lv_lang_1_0= 'html' ) )
            // InternalViz.g:971:4: (lv_lang_1_0= 'html' )
            {
            // InternalViz.g:971:4: (lv_lang_1_0= 'html' )
            // InternalViz.g:972:5: lv_lang_1_0= 'html'
            {
            lv_lang_1_0=(Token)match(input,31,FOLLOW_2); 

            					newLeafNode(lv_lang_1_0, grammarAccess.getInitializerAccess().getLangHtmlKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitializerRule());
            					}
            					setWithLastConsumed(current, "lang", lv_lang_1_0, "html");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitializer"


    // $ANTLR start "entryRuleDropDownCommand"
    // InternalViz.g:988:1: entryRuleDropDownCommand returns [EObject current=null] : iv_ruleDropDownCommand= ruleDropDownCommand EOF ;
    public final EObject entryRuleDropDownCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropDownCommand = null;


        try {
            // InternalViz.g:988:56: (iv_ruleDropDownCommand= ruleDropDownCommand EOF )
            // InternalViz.g:989:2: iv_ruleDropDownCommand= ruleDropDownCommand EOF
            {
             newCompositeNode(grammarAccess.getDropDownCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDropDownCommand=ruleDropDownCommand();

            state._fsp--;

             current =iv_ruleDropDownCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDropDownCommand"


    // $ANTLR start "ruleDropDownCommand"
    // InternalViz.g:995:1: ruleDropDownCommand returns [EObject current=null] : (otherlv_0= 'DropDownSelection' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= 'options' otherlv_5= '{' ( (lv_options_6_0= RULE_STRING ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleDropDownCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_options_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalViz.g:1001:2: ( (otherlv_0= 'DropDownSelection' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= 'options' otherlv_5= '{' ( (lv_options_6_0= RULE_STRING ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalViz.g:1002:2: (otherlv_0= 'DropDownSelection' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= 'options' otherlv_5= '{' ( (lv_options_6_0= RULE_STRING ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalViz.g:1002:2: (otherlv_0= 'DropDownSelection' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= 'options' otherlv_5= '{' ( (lv_options_6_0= RULE_STRING ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalViz.g:1003:3: otherlv_0= 'DropDownSelection' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= 'options' otherlv_5= '{' ( (lv_options_6_0= RULE_STRING ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDropDownCommandAccess().getDropDownSelectionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDropDownCommandAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDropDownCommandAccess().getLabelKeyword_2());
            		
            // InternalViz.g:1015:3: ( (lv_label_3_0= RULE_STRING ) )
            // InternalViz.g:1016:4: (lv_label_3_0= RULE_STRING )
            {
            // InternalViz.g:1016:4: (lv_label_3_0= RULE_STRING )
            // InternalViz.g:1017:5: lv_label_3_0= RULE_STRING
            {
            lv_label_3_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_label_3_0, grammarAccess.getDropDownCommandAccess().getLabelSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDropDownCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"label",
            						lv_label_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getDropDownCommandAccess().getOptionsKeyword_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getDropDownCommandAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalViz.g:1041:3: ( (lv_options_6_0= RULE_STRING ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalViz.g:1042:4: (lv_options_6_0= RULE_STRING )
            	    {
            	    // InternalViz.g:1042:4: (lv_options_6_0= RULE_STRING )
            	    // InternalViz.g:1043:5: lv_options_6_0= RULE_STRING
            	    {
            	    lv_options_6_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            	    					newLeafNode(lv_options_6_0, grammarAccess.getDropDownCommandAccess().getOptionsSTRINGTerminalRuleCall_6_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getDropDownCommandRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"options",
            	    						lv_options_6_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getDropDownCommandAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDropDownCommandAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDropDownCommand"


    // $ANTLR start "entryRuleBulletPointCommand"
    // InternalViz.g:1071:1: entryRuleBulletPointCommand returns [EObject current=null] : iv_ruleBulletPointCommand= ruleBulletPointCommand EOF ;
    public final EObject entryRuleBulletPointCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBulletPointCommand = null;


        try {
            // InternalViz.g:1071:59: (iv_ruleBulletPointCommand= ruleBulletPointCommand EOF )
            // InternalViz.g:1072:2: iv_ruleBulletPointCommand= ruleBulletPointCommand EOF
            {
             newCompositeNode(grammarAccess.getBulletPointCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBulletPointCommand=ruleBulletPointCommand();

            state._fsp--;

             current =iv_ruleBulletPointCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBulletPointCommand"


    // $ANTLR start "ruleBulletPointCommand"
    // InternalViz.g:1078:1: ruleBulletPointCommand returns [EObject current=null] : ( () otherlv_1= 'BulletPoint' otherlv_2= '{' ( (lv_children_3_0= ruleTextCommand ) )* otherlv_4= '}' ) ;
    public final EObject ruleBulletPointCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_children_3_0 = null;



        	enterRule();

        try {
            // InternalViz.g:1084:2: ( ( () otherlv_1= 'BulletPoint' otherlv_2= '{' ( (lv_children_3_0= ruleTextCommand ) )* otherlv_4= '}' ) )
            // InternalViz.g:1085:2: ( () otherlv_1= 'BulletPoint' otherlv_2= '{' ( (lv_children_3_0= ruleTextCommand ) )* otherlv_4= '}' )
            {
            // InternalViz.g:1085:2: ( () otherlv_1= 'BulletPoint' otherlv_2= '{' ( (lv_children_3_0= ruleTextCommand ) )* otherlv_4= '}' )
            // InternalViz.g:1086:3: () otherlv_1= 'BulletPoint' otherlv_2= '{' ( (lv_children_3_0= ruleTextCommand ) )* otherlv_4= '}'
            {
            // InternalViz.g:1086:3: ()
            // InternalViz.g:1087:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBulletPointCommandAccess().getBulletPointCommandAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getBulletPointCommandAccess().getBulletPointKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getBulletPointCommandAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalViz.g:1101:3: ( (lv_children_3_0= ruleTextCommand ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=19 && LA10_0<=25)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalViz.g:1102:4: (lv_children_3_0= ruleTextCommand )
            	    {
            	    // InternalViz.g:1102:4: (lv_children_3_0= ruleTextCommand )
            	    // InternalViz.g:1103:5: lv_children_3_0= ruleTextCommand
            	    {

            	    					newCompositeNode(grammarAccess.getBulletPointCommandAccess().getChildrenTextCommandParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_children_3_0=ruleTextCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBulletPointCommandRule());
            	    					}
            	    					add(
            	    						current,
            	    						"children",
            	    						lv_children_3_0,
            	    						"org.xtext.example.vizual.Viz.TextCommand");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBulletPointCommandAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBulletPointCommand"


    // $ANTLR start "entryRuleNumberedListCommand"
    // InternalViz.g:1128:1: entryRuleNumberedListCommand returns [EObject current=null] : iv_ruleNumberedListCommand= ruleNumberedListCommand EOF ;
    public final EObject entryRuleNumberedListCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberedListCommand = null;


        try {
            // InternalViz.g:1128:60: (iv_ruleNumberedListCommand= ruleNumberedListCommand EOF )
            // InternalViz.g:1129:2: iv_ruleNumberedListCommand= ruleNumberedListCommand EOF
            {
             newCompositeNode(grammarAccess.getNumberedListCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberedListCommand=ruleNumberedListCommand();

            state._fsp--;

             current =iv_ruleNumberedListCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberedListCommand"


    // $ANTLR start "ruleNumberedListCommand"
    // InternalViz.g:1135:1: ruleNumberedListCommand returns [EObject current=null] : ( () otherlv_1= 'NumberedList' otherlv_2= '{' ( (lv_children_3_0= ruleTextCommand ) )* otherlv_4= '}' ) ;
    public final EObject ruleNumberedListCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_children_3_0 = null;



        	enterRule();

        try {
            // InternalViz.g:1141:2: ( ( () otherlv_1= 'NumberedList' otherlv_2= '{' ( (lv_children_3_0= ruleTextCommand ) )* otherlv_4= '}' ) )
            // InternalViz.g:1142:2: ( () otherlv_1= 'NumberedList' otherlv_2= '{' ( (lv_children_3_0= ruleTextCommand ) )* otherlv_4= '}' )
            {
            // InternalViz.g:1142:2: ( () otherlv_1= 'NumberedList' otherlv_2= '{' ( (lv_children_3_0= ruleTextCommand ) )* otherlv_4= '}' )
            // InternalViz.g:1143:3: () otherlv_1= 'NumberedList' otherlv_2= '{' ( (lv_children_3_0= ruleTextCommand ) )* otherlv_4= '}'
            {
            // InternalViz.g:1143:3: ()
            // InternalViz.g:1144:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberedListCommandAccess().getNumberedListCommandAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getNumberedListCommandAccess().getNumberedListKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getNumberedListCommandAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalViz.g:1158:3: ( (lv_children_3_0= ruleTextCommand ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=19 && LA11_0<=25)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalViz.g:1159:4: (lv_children_3_0= ruleTextCommand )
            	    {
            	    // InternalViz.g:1159:4: (lv_children_3_0= ruleTextCommand )
            	    // InternalViz.g:1160:5: lv_children_3_0= ruleTextCommand
            	    {

            	    					newCompositeNode(grammarAccess.getNumberedListCommandAccess().getChildrenTextCommandParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_children_3_0=ruleTextCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNumberedListCommandRule());
            	    					}
            	    					add(
            	    						current,
            	    						"children",
            	    						lv_children_3_0,
            	    						"org.xtext.example.vizual.Viz.TextCommand");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNumberedListCommandAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberedListCommand"


    // $ANTLR start "ruleHtmlCommand"
    // InternalViz.g:1185:1: ruleHtmlCommand returns [Enumerator current=null] : (enumLiteral_0= 'html' ) ;
    public final Enumerator ruleHtmlCommand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalViz.g:1191:2: ( (enumLiteral_0= 'html' ) )
            // InternalViz.g:1192:2: (enumLiteral_0= 'html' )
            {
            // InternalViz.g:1192:2: (enumLiteral_0= 'html' )
            // InternalViz.g:1193:3: enumLiteral_0= 'html'
            {
            enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

            			current = grammarAccess.getHtmlCommandAccess().getHTMLEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getHtmlCommandAccess().getHTMLEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHtmlCommand"


    // $ANTLR start "ruleEndHtmlCommand"
    // InternalViz.g:1202:1: ruleEndHtmlCommand returns [Enumerator current=null] : (enumLiteral_0= 'endHtml' ) ;
    public final Enumerator ruleEndHtmlCommand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalViz.g:1208:2: ( (enumLiteral_0= 'endHtml' ) )
            // InternalViz.g:1209:2: (enumLiteral_0= 'endHtml' )
            {
            // InternalViz.g:1209:2: (enumLiteral_0= 'endHtml' )
            // InternalViz.g:1210:3: enumLiteral_0= 'endHtml'
            {
            enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

            			current = grammarAccess.getEndHtmlCommandAccess().getEndHTMLEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getEndHtmlCommandAccess().getEndHTMLEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndHtmlCommand"


    // $ANTLR start "ruleCreateBulletPoints"
    // InternalViz.g:1219:1: ruleCreateBulletPoints returns [Enumerator current=null] : (enumLiteral_0= 'BP' ) ;
    public final Enumerator ruleCreateBulletPoints() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalViz.g:1225:2: ( (enumLiteral_0= 'BP' ) )
            // InternalViz.g:1226:2: (enumLiteral_0= 'BP' )
            {
            // InternalViz.g:1226:2: (enumLiteral_0= 'BP' )
            // InternalViz.g:1227:3: enumLiteral_0= 'BP'
            {
            enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

            			current = grammarAccess.getCreateBulletPointsAccess().getBPEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getCreateBulletPointsAccess().getBPEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateBulletPoints"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000079FFFC1802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000079FFFC5800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000030004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003F84000L});

}