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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_NEW_LINE", "RULE_TAB_SPACE", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'with('", "')'", "'BP'", "'GenerateDefaultDocument'"
    };
    public static final int RULE_TAB_SPACE=6;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_NEW_LINE=5;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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

                if ( ((LA1_0>=15 && LA1_0<=16)) ) {
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
    // InternalViz.g:108:1: ruleCommand returns [EObject current=null] : (this_Create_0= ruleCreate | this_Generate_1= ruleGenerate ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Create_0 = null;

        EObject this_Generate_1 = null;



        	enterRule();

        try {
            // InternalViz.g:114:2: ( (this_Create_0= ruleCreate | this_Generate_1= ruleGenerate ) )
            // InternalViz.g:115:2: (this_Create_0= ruleCreate | this_Generate_1= ruleGenerate )
            {
            // InternalViz.g:115:2: (this_Create_0= ruleCreate | this_Generate_1= ruleGenerate )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalViz.g:116:3: this_Create_0= ruleCreate
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getCreateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Create_0=ruleCreate();

                    state._fsp--;


                    			current = this_Create_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalViz.g:125:3: this_Generate_1= ruleGenerate
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getGenerateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Generate_1=ruleGenerate();

                    state._fsp--;


                    			current = this_Generate_1;
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


    // $ANTLR start "entryRuleCreate"
    // InternalViz.g:137:1: entryRuleCreate returns [EObject current=null] : iv_ruleCreate= ruleCreate EOF ;
    public final EObject entryRuleCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreate = null;


        try {
            // InternalViz.g:137:47: (iv_ruleCreate= ruleCreate EOF )
            // InternalViz.g:138:2: iv_ruleCreate= ruleCreate EOF
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
    // InternalViz.g:144:1: ruleCreate returns [EObject current=null] : ( ( (lv_command_0_0= ruleCreateBulletPoints ) ) otherlv_1= 'with(' ( (lv_bullets_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleCreate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_bullets_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_command_0_0 = null;



        	enterRule();

        try {
            // InternalViz.g:150:2: ( ( ( (lv_command_0_0= ruleCreateBulletPoints ) ) otherlv_1= 'with(' ( (lv_bullets_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalViz.g:151:2: ( ( (lv_command_0_0= ruleCreateBulletPoints ) ) otherlv_1= 'with(' ( (lv_bullets_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalViz.g:151:2: ( ( (lv_command_0_0= ruleCreateBulletPoints ) ) otherlv_1= 'with(' ( (lv_bullets_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalViz.g:152:3: ( (lv_command_0_0= ruleCreateBulletPoints ) ) otherlv_1= 'with(' ( (lv_bullets_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            // InternalViz.g:152:3: ( (lv_command_0_0= ruleCreateBulletPoints ) )
            // InternalViz.g:153:4: (lv_command_0_0= ruleCreateBulletPoints )
            {
            // InternalViz.g:153:4: (lv_command_0_0= ruleCreateBulletPoints )
            // InternalViz.g:154:5: lv_command_0_0= ruleCreateBulletPoints
            {

            					newCompositeNode(grammarAccess.getCreateAccess().getCommandCreateBulletPointsEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
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

            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateAccess().getWithKeyword_1());
            		
            // InternalViz.g:175:3: ( (lv_bullets_2_0= RULE_STRING ) )
            // InternalViz.g:176:4: (lv_bullets_2_0= RULE_STRING )
            {
            // InternalViz.g:176:4: (lv_bullets_2_0= RULE_STRING )
            // InternalViz.g:177:5: lv_bullets_2_0= RULE_STRING
            {
            lv_bullets_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleGenerate"
    // InternalViz.g:201:1: entryRuleGenerate returns [EObject current=null] : iv_ruleGenerate= ruleGenerate EOF ;
    public final EObject entryRuleGenerate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerate = null;


        try {
            // InternalViz.g:201:49: (iv_ruleGenerate= ruleGenerate EOF )
            // InternalViz.g:202:2: iv_ruleGenerate= ruleGenerate EOF
            {
             newCompositeNode(grammarAccess.getGenerateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenerate=ruleGenerate();

            state._fsp--;

             current =iv_ruleGenerate; 
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
    // $ANTLR end "entryRuleGenerate"


    // $ANTLR start "ruleGenerate"
    // InternalViz.g:208:1: ruleGenerate returns [EObject current=null] : ( (lv_command_0_0= ruleGenerateDefault ) ) ;
    public final EObject ruleGenerate() throws RecognitionException {
        EObject current = null;

        Enumerator lv_command_0_0 = null;



        	enterRule();

        try {
            // InternalViz.g:214:2: ( ( (lv_command_0_0= ruleGenerateDefault ) ) )
            // InternalViz.g:215:2: ( (lv_command_0_0= ruleGenerateDefault ) )
            {
            // InternalViz.g:215:2: ( (lv_command_0_0= ruleGenerateDefault ) )
            // InternalViz.g:216:3: (lv_command_0_0= ruleGenerateDefault )
            {
            // InternalViz.g:216:3: (lv_command_0_0= ruleGenerateDefault )
            // InternalViz.g:217:4: lv_command_0_0= ruleGenerateDefault
            {

            				newCompositeNode(grammarAccess.getGenerateAccess().getCommandGenerateDefaultEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_command_0_0=ruleGenerateDefault();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getGenerateRule());
            				}
            				set(
            					current,
            					"command",
            					lv_command_0_0,
            					"org.xtext.example.vizual.Viz.GenerateDefault");
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
    // $ANTLR end "ruleGenerate"


    // $ANTLR start "ruleCreateBulletPoints"
    // InternalViz.g:237:1: ruleCreateBulletPoints returns [Enumerator current=null] : (enumLiteral_0= 'BP' ) ;
    public final Enumerator ruleCreateBulletPoints() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalViz.g:243:2: ( (enumLiteral_0= 'BP' ) )
            // InternalViz.g:244:2: (enumLiteral_0= 'BP' )
            {
            // InternalViz.g:244:2: (enumLiteral_0= 'BP' )
            // InternalViz.g:245:3: enumLiteral_0= 'BP'
            {
            enumLiteral_0=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "ruleGenerateDefault"
    // InternalViz.g:254:1: ruleGenerateDefault returns [Enumerator current=null] : (enumLiteral_0= 'GenerateDefaultDocument' ) ;
    public final Enumerator ruleGenerateDefault() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalViz.g:260:2: ( (enumLiteral_0= 'GenerateDefaultDocument' ) )
            // InternalViz.g:261:2: (enumLiteral_0= 'GenerateDefaultDocument' )
            {
            // InternalViz.g:261:2: (enumLiteral_0= 'GenerateDefaultDocument' )
            // InternalViz.g:262:3: enumLiteral_0= 'GenerateDefaultDocument'
            {
            enumLiteral_0=(Token)match(input,16,FOLLOW_2); 

            			current = grammarAccess.getGenerateDefaultAccess().getDefaultEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getGenerateDefaultAccess().getDefaultEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleGenerateDefault"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});

}