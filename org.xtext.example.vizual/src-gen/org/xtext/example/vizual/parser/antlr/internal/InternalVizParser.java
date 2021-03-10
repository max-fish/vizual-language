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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NEW_LINE", "RULE_TAB_SPACE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'html'", "'h1'", "'h2'", "'h3'", "'h4'", "'h5'", "'h6'", "'p'", "'div'", "'end'", "'head'", "'body'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_TAB_SPACE=6;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_NEW_LINE=5;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
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
    // InternalViz.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'html' ( (lv_mainTags_1_0= ruleMainTag ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_mainTags_1_0 = null;



        	enterRule();

        try {
            // InternalViz.g:78:2: ( (otherlv_0= 'html' ( (lv_mainTags_1_0= ruleMainTag ) )* ) )
            // InternalViz.g:79:2: (otherlv_0= 'html' ( (lv_mainTags_1_0= ruleMainTag ) )* )
            {
            // InternalViz.g:79:2: (otherlv_0= 'html' ( (lv_mainTags_1_0= ruleMainTag ) )* )
            // InternalViz.g:80:3: otherlv_0= 'html' ( (lv_mainTags_1_0= ruleMainTag ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getHtmlKeyword_0());
            		
            // InternalViz.g:84:3: ( (lv_mainTags_1_0= ruleMainTag ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=23 && LA1_0<=24)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalViz.g:85:4: (lv_mainTags_1_0= ruleMainTag )
            	    {
            	    // InternalViz.g:85:4: (lv_mainTags_1_0= ruleMainTag )
            	    // InternalViz.g:86:5: lv_mainTags_1_0= ruleMainTag
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getMainTagsMainTagParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_mainTags_1_0=ruleMainTag();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mainTags",
            	    						lv_mainTags_1_0,
            	    						"org.xtext.example.vizual.Viz.MainTag");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMainTag"
    // InternalViz.g:107:1: entryRuleMainTag returns [EObject current=null] : iv_ruleMainTag= ruleMainTag EOF ;
    public final EObject entryRuleMainTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainTag = null;


        try {
            // InternalViz.g:107:48: (iv_ruleMainTag= ruleMainTag EOF )
            // InternalViz.g:108:2: iv_ruleMainTag= ruleMainTag EOF
            {
             newCompositeNode(grammarAccess.getMainTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainTag=ruleMainTag();

            state._fsp--;

             current =iv_ruleMainTag; 
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
    // $ANTLR end "entryRuleMainTag"


    // $ANTLR start "ruleMainTag"
    // InternalViz.g:114:1: ruleMainTag returns [EObject current=null] : ( ( (lv_mainTagName_0_0= ruleMainTagName ) ) ( (lv_normalTags_1_0= ruleNormalTag ) )* ) ;
    public final EObject ruleMainTag() throws RecognitionException {
        EObject current = null;

        Enumerator lv_mainTagName_0_0 = null;

        EObject lv_normalTags_1_0 = null;



        	enterRule();

        try {
            // InternalViz.g:120:2: ( ( ( (lv_mainTagName_0_0= ruleMainTagName ) ) ( (lv_normalTags_1_0= ruleNormalTag ) )* ) )
            // InternalViz.g:121:2: ( ( (lv_mainTagName_0_0= ruleMainTagName ) ) ( (lv_normalTags_1_0= ruleNormalTag ) )* )
            {
            // InternalViz.g:121:2: ( ( (lv_mainTagName_0_0= ruleMainTagName ) ) ( (lv_normalTags_1_0= ruleNormalTag ) )* )
            // InternalViz.g:122:3: ( (lv_mainTagName_0_0= ruleMainTagName ) ) ( (lv_normalTags_1_0= ruleNormalTag ) )*
            {
            // InternalViz.g:122:3: ( (lv_mainTagName_0_0= ruleMainTagName ) )
            // InternalViz.g:123:4: (lv_mainTagName_0_0= ruleMainTagName )
            {
            // InternalViz.g:123:4: (lv_mainTagName_0_0= ruleMainTagName )
            // InternalViz.g:124:5: lv_mainTagName_0_0= ruleMainTagName
            {

            					newCompositeNode(grammarAccess.getMainTagAccess().getMainTagNameMainTagNameEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_mainTagName_0_0=ruleMainTagName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMainTagRule());
            					}
            					set(
            						current,
            						"mainTagName",
            						lv_mainTagName_0_0,
            						"org.xtext.example.vizual.Viz.MainTagName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalViz.g:141:3: ( (lv_normalTags_1_0= ruleNormalTag ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=14 && LA2_0<=21)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalViz.g:142:4: (lv_normalTags_1_0= ruleNormalTag )
            	    {
            	    // InternalViz.g:142:4: (lv_normalTags_1_0= ruleNormalTag )
            	    // InternalViz.g:143:5: lv_normalTags_1_0= ruleNormalTag
            	    {

            	    					newCompositeNode(grammarAccess.getMainTagAccess().getNormalTagsNormalTagParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_normalTags_1_0=ruleNormalTag();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMainTagRule());
            	    					}
            	    					add(
            	    						current,
            	    						"normalTags",
            	    						lv_normalTags_1_0,
            	    						"org.xtext.example.vizual.Viz.NormalTag");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleMainTag"


    // $ANTLR start "entryRuleNormalTag"
    // InternalViz.g:164:1: entryRuleNormalTag returns [EObject current=null] : iv_ruleNormalTag= ruleNormalTag EOF ;
    public final EObject entryRuleNormalTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalTag = null;


        try {
            // InternalViz.g:164:50: (iv_ruleNormalTag= ruleNormalTag EOF )
            // InternalViz.g:165:2: iv_ruleNormalTag= ruleNormalTag EOF
            {
             newCompositeNode(grammarAccess.getNormalTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNormalTag=ruleNormalTag();

            state._fsp--;

             current =iv_ruleNormalTag; 
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
    // $ANTLR end "entryRuleNormalTag"


    // $ANTLR start "ruleNormalTag"
    // InternalViz.g:171:1: ruleNormalTag returns [EObject current=null] : (this_TextTag_0= ruleTextTag | this_ContainerTag_1= ruleContainerTag ) ;
    public final EObject ruleNormalTag() throws RecognitionException {
        EObject current = null;

        EObject this_TextTag_0 = null;

        EObject this_ContainerTag_1 = null;



        	enterRule();

        try {
            // InternalViz.g:177:2: ( (this_TextTag_0= ruleTextTag | this_ContainerTag_1= ruleContainerTag ) )
            // InternalViz.g:178:2: (this_TextTag_0= ruleTextTag | this_ContainerTag_1= ruleContainerTag )
            {
            // InternalViz.g:178:2: (this_TextTag_0= ruleTextTag | this_ContainerTag_1= ruleContainerTag )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=14 && LA3_0<=20)) ) {
                alt3=1;
            }
            else if ( (LA3_0==21) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalViz.g:179:3: this_TextTag_0= ruleTextTag
                    {

                    			newCompositeNode(grammarAccess.getNormalTagAccess().getTextTagParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextTag_0=ruleTextTag();

                    state._fsp--;


                    			current = this_TextTag_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalViz.g:188:3: this_ContainerTag_1= ruleContainerTag
                    {

                    			newCompositeNode(grammarAccess.getNormalTagAccess().getContainerTagParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContainerTag_1=ruleContainerTag();

                    state._fsp--;


                    			current = this_ContainerTag_1;
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
    // $ANTLR end "ruleNormalTag"


    // $ANTLR start "entryRuleTextTag"
    // InternalViz.g:200:1: entryRuleTextTag returns [EObject current=null] : iv_ruleTextTag= ruleTextTag EOF ;
    public final EObject entryRuleTextTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextTag = null;


        try {
            // InternalViz.g:200:48: (iv_ruleTextTag= ruleTextTag EOF )
            // InternalViz.g:201:2: iv_ruleTextTag= ruleTextTag EOF
            {
             newCompositeNode(grammarAccess.getTextTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextTag=ruleTextTag();

            state._fsp--;

             current =iv_ruleTextTag; 
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
    // $ANTLR end "entryRuleTextTag"


    // $ANTLR start "ruleTextTag"
    // InternalViz.g:207:1: ruleTextTag returns [EObject current=null] : ( (otherlv_0= 'h1' | otherlv_1= 'h2' | otherlv_2= 'h3' | otherlv_3= 'h4' | otherlv_4= 'h5' | otherlv_5= 'h6' | otherlv_6= 'p' ) ( (lv_name_7_0= RULE_ID ) ) ) ;
    public final EObject ruleTextTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;


        	enterRule();

        try {
            // InternalViz.g:213:2: ( ( (otherlv_0= 'h1' | otherlv_1= 'h2' | otherlv_2= 'h3' | otherlv_3= 'h4' | otherlv_4= 'h5' | otherlv_5= 'h6' | otherlv_6= 'p' ) ( (lv_name_7_0= RULE_ID ) ) ) )
            // InternalViz.g:214:2: ( (otherlv_0= 'h1' | otherlv_1= 'h2' | otherlv_2= 'h3' | otherlv_3= 'h4' | otherlv_4= 'h5' | otherlv_5= 'h6' | otherlv_6= 'p' ) ( (lv_name_7_0= RULE_ID ) ) )
            {
            // InternalViz.g:214:2: ( (otherlv_0= 'h1' | otherlv_1= 'h2' | otherlv_2= 'h3' | otherlv_3= 'h4' | otherlv_4= 'h5' | otherlv_5= 'h6' | otherlv_6= 'p' ) ( (lv_name_7_0= RULE_ID ) ) )
            // InternalViz.g:215:3: (otherlv_0= 'h1' | otherlv_1= 'h2' | otherlv_2= 'h3' | otherlv_3= 'h4' | otherlv_4= 'h5' | otherlv_5= 'h6' | otherlv_6= 'p' ) ( (lv_name_7_0= RULE_ID ) )
            {
            // InternalViz.g:215:3: (otherlv_0= 'h1' | otherlv_1= 'h2' | otherlv_2= 'h3' | otherlv_3= 'h4' | otherlv_4= 'h5' | otherlv_5= 'h6' | otherlv_6= 'p' )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 17:
                {
                alt4=4;
                }
                break;
            case 18:
                {
                alt4=5;
                }
                break;
            case 19:
                {
                alt4=6;
                }
                break;
            case 20:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalViz.g:216:4: otherlv_0= 'h1'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getTextTagAccess().getH1Keyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalViz.g:221:4: otherlv_1= 'h2'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getTextTagAccess().getH2Keyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalViz.g:226:4: otherlv_2= 'h3'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getTextTagAccess().getH3Keyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalViz.g:231:4: otherlv_3= 'h4'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getTextTagAccess().getH4Keyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalViz.g:236:4: otherlv_4= 'h5'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getTextTagAccess().getH5Keyword_0_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalViz.g:241:4: otherlv_5= 'h6'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getTextTagAccess().getH6Keyword_0_5());
                    			

                    }
                    break;
                case 7 :
                    // InternalViz.g:246:4: otherlv_6= 'p'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getTextTagAccess().getPKeyword_0_6());
                    			

                    }
                    break;

            }

            // InternalViz.g:251:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalViz.g:252:4: (lv_name_7_0= RULE_ID )
            {
            // InternalViz.g:252:4: (lv_name_7_0= RULE_ID )
            // InternalViz.g:253:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_7_0, grammarAccess.getTextTagAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleTextTag"


    // $ANTLR start "entryRuleContainerTag"
    // InternalViz.g:273:1: entryRuleContainerTag returns [EObject current=null] : iv_ruleContainerTag= ruleContainerTag EOF ;
    public final EObject entryRuleContainerTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerTag = null;


        try {
            // InternalViz.g:273:53: (iv_ruleContainerTag= ruleContainerTag EOF )
            // InternalViz.g:274:2: iv_ruleContainerTag= ruleContainerTag EOF
            {
             newCompositeNode(grammarAccess.getContainerTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainerTag=ruleContainerTag();

            state._fsp--;

             current =iv_ruleContainerTag; 
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
    // $ANTLR end "entryRuleContainerTag"


    // $ANTLR start "ruleContainerTag"
    // InternalViz.g:280:1: ruleContainerTag returns [EObject current=null] : ( () otherlv_1= 'div' ( (lv_normalTags_2_0= ruleNormalTag ) )* otherlv_3= 'end' ) ;
    public final EObject ruleContainerTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_normalTags_2_0 = null;



        	enterRule();

        try {
            // InternalViz.g:286:2: ( ( () otherlv_1= 'div' ( (lv_normalTags_2_0= ruleNormalTag ) )* otherlv_3= 'end' ) )
            // InternalViz.g:287:2: ( () otherlv_1= 'div' ( (lv_normalTags_2_0= ruleNormalTag ) )* otherlv_3= 'end' )
            {
            // InternalViz.g:287:2: ( () otherlv_1= 'div' ( (lv_normalTags_2_0= ruleNormalTag ) )* otherlv_3= 'end' )
            // InternalViz.g:288:3: () otherlv_1= 'div' ( (lv_normalTags_2_0= ruleNormalTag ) )* otherlv_3= 'end'
            {
            // InternalViz.g:288:3: ()
            // InternalViz.g:289:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainerTagAccess().getContainerTagAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getContainerTagAccess().getDivKeyword_1());
            		
            // InternalViz.g:299:3: ( (lv_normalTags_2_0= ruleNormalTag ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=14 && LA5_0<=21)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalViz.g:300:4: (lv_normalTags_2_0= ruleNormalTag )
            	    {
            	    // InternalViz.g:300:4: (lv_normalTags_2_0= ruleNormalTag )
            	    // InternalViz.g:301:5: lv_normalTags_2_0= ruleNormalTag
            	    {

            	    					newCompositeNode(grammarAccess.getContainerTagAccess().getNormalTagsNormalTagParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_normalTags_2_0=ruleNormalTag();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContainerTagRule());
            	    					}
            	    					add(
            	    						current,
            	    						"normalTags",
            	    						lv_normalTags_2_0,
            	    						"org.xtext.example.vizual.Viz.NormalTag");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getContainerTagAccess().getEndKeyword_3());
            		

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
    // $ANTLR end "ruleContainerTag"


    // $ANTLR start "ruleMainTagName"
    // InternalViz.g:326:1: ruleMainTagName returns [Enumerator current=null] : ( (enumLiteral_0= 'head' ) | (enumLiteral_1= 'body' ) ) ;
    public final Enumerator ruleMainTagName() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalViz.g:332:2: ( ( (enumLiteral_0= 'head' ) | (enumLiteral_1= 'body' ) ) )
            // InternalViz.g:333:2: ( (enumLiteral_0= 'head' ) | (enumLiteral_1= 'body' ) )
            {
            // InternalViz.g:333:2: ( (enumLiteral_0= 'head' ) | (enumLiteral_1= 'body' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            else if ( (LA6_0==24) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalViz.g:334:3: (enumLiteral_0= 'head' )
                    {
                    // InternalViz.g:334:3: (enumLiteral_0= 'head' )
                    // InternalViz.g:335:4: enumLiteral_0= 'head'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getMainTagNameAccess().getHeadEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMainTagNameAccess().getHeadEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalViz.g:342:3: (enumLiteral_1= 'body' )
                    {
                    // InternalViz.g:342:3: (enumLiteral_1= 'body' )
                    // InternalViz.g:343:4: enumLiteral_1= 'body'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getMainTagNameAccess().getBodyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMainTagNameAccess().getBodyEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleMainTagName"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000003FC002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000007FC000L});

}