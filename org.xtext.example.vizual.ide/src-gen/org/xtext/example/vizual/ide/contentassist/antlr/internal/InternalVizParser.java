package org.xtext.example.vizual.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.vizual.services.VizGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVizParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_NEW_LINE", "RULE_TAB_SPACE", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BP'", "'GenerateDefaultDocument'", "'with('", "')'"
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

    	public void setGrammarAccess(VizGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalViz.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalViz.g:54:1: ( ruleModel EOF )
            // InternalViz.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalViz.g:62:1: ruleModel : ( ( rule__Model__CommandsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:66:2: ( ( ( rule__Model__CommandsAssignment )* ) )
            // InternalViz.g:67:2: ( ( rule__Model__CommandsAssignment )* )
            {
            // InternalViz.g:67:2: ( ( rule__Model__CommandsAssignment )* )
            // InternalViz.g:68:3: ( rule__Model__CommandsAssignment )*
            {
             before(grammarAccess.getModelAccess().getCommandsAssignment()); 
            // InternalViz.g:69:3: ( rule__Model__CommandsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalViz.g:69:4: rule__Model__CommandsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__CommandsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getCommandsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCommand"
    // InternalViz.g:78:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalViz.g:79:1: ( ruleCommand EOF )
            // InternalViz.g:80:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalViz.g:87:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:91:2: ( ( ( rule__Command__Alternatives ) ) )
            // InternalViz.g:92:2: ( ( rule__Command__Alternatives ) )
            {
            // InternalViz.g:92:2: ( ( rule__Command__Alternatives ) )
            // InternalViz.g:93:3: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // InternalViz.g:94:3: ( rule__Command__Alternatives )
            // InternalViz.g:94:4: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Command__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleCreate"
    // InternalViz.g:103:1: entryRuleCreate : ruleCreate EOF ;
    public final void entryRuleCreate() throws RecognitionException {
        try {
            // InternalViz.g:104:1: ( ruleCreate EOF )
            // InternalViz.g:105:1: ruleCreate EOF
            {
             before(grammarAccess.getCreateRule()); 
            pushFollow(FOLLOW_1);
            ruleCreate();

            state._fsp--;

             after(grammarAccess.getCreateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCreate"


    // $ANTLR start "ruleCreate"
    // InternalViz.g:112:1: ruleCreate : ( ( rule__Create__Group__0 ) ) ;
    public final void ruleCreate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:116:2: ( ( ( rule__Create__Group__0 ) ) )
            // InternalViz.g:117:2: ( ( rule__Create__Group__0 ) )
            {
            // InternalViz.g:117:2: ( ( rule__Create__Group__0 ) )
            // InternalViz.g:118:3: ( rule__Create__Group__0 )
            {
             before(grammarAccess.getCreateAccess().getGroup()); 
            // InternalViz.g:119:3: ( rule__Create__Group__0 )
            // InternalViz.g:119:4: rule__Create__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Create__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreate"


    // $ANTLR start "entryRuleGenerate"
    // InternalViz.g:128:1: entryRuleGenerate : ruleGenerate EOF ;
    public final void entryRuleGenerate() throws RecognitionException {
        try {
            // InternalViz.g:129:1: ( ruleGenerate EOF )
            // InternalViz.g:130:1: ruleGenerate EOF
            {
             before(grammarAccess.getGenerateRule()); 
            pushFollow(FOLLOW_1);
            ruleGenerate();

            state._fsp--;

             after(grammarAccess.getGenerateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGenerate"


    // $ANTLR start "ruleGenerate"
    // InternalViz.g:137:1: ruleGenerate : ( ( rule__Generate__CommandAssignment ) ) ;
    public final void ruleGenerate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:141:2: ( ( ( rule__Generate__CommandAssignment ) ) )
            // InternalViz.g:142:2: ( ( rule__Generate__CommandAssignment ) )
            {
            // InternalViz.g:142:2: ( ( rule__Generate__CommandAssignment ) )
            // InternalViz.g:143:3: ( rule__Generate__CommandAssignment )
            {
             before(grammarAccess.getGenerateAccess().getCommandAssignment()); 
            // InternalViz.g:144:3: ( rule__Generate__CommandAssignment )
            // InternalViz.g:144:4: rule__Generate__CommandAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Generate__CommandAssignment();

            state._fsp--;


            }

             after(grammarAccess.getGenerateAccess().getCommandAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenerate"


    // $ANTLR start "ruleCreateBulletPoints"
    // InternalViz.g:153:1: ruleCreateBulletPoints : ( ( 'BP' ) ) ;
    public final void ruleCreateBulletPoints() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:157:1: ( ( ( 'BP' ) ) )
            // InternalViz.g:158:2: ( ( 'BP' ) )
            {
            // InternalViz.g:158:2: ( ( 'BP' ) )
            // InternalViz.g:159:3: ( 'BP' )
            {
             before(grammarAccess.getCreateBulletPointsAccess().getBPEnumLiteralDeclaration()); 
            // InternalViz.g:160:3: ( 'BP' )
            // InternalViz.g:160:4: 'BP'
            {
            match(input,13,FOLLOW_2); 

            }

             after(grammarAccess.getCreateBulletPointsAccess().getBPEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreateBulletPoints"


    // $ANTLR start "ruleGenerateDefault"
    // InternalViz.g:169:1: ruleGenerateDefault : ( ( 'GenerateDefaultDocument' ) ) ;
    public final void ruleGenerateDefault() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:173:1: ( ( ( 'GenerateDefaultDocument' ) ) )
            // InternalViz.g:174:2: ( ( 'GenerateDefaultDocument' ) )
            {
            // InternalViz.g:174:2: ( ( 'GenerateDefaultDocument' ) )
            // InternalViz.g:175:3: ( 'GenerateDefaultDocument' )
            {
             before(grammarAccess.getGenerateDefaultAccess().getDefaultEnumLiteralDeclaration()); 
            // InternalViz.g:176:3: ( 'GenerateDefaultDocument' )
            // InternalViz.g:176:4: 'GenerateDefaultDocument'
            {
            match(input,14,FOLLOW_2); 

            }

             after(grammarAccess.getGenerateDefaultAccess().getDefaultEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenerateDefault"


    // $ANTLR start "rule__Command__Alternatives"
    // InternalViz.g:184:1: rule__Command__Alternatives : ( ( ruleCreate ) | ( ruleGenerate ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:188:1: ( ( ruleCreate ) | ( ruleGenerate ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalViz.g:189:2: ( ruleCreate )
                    {
                    // InternalViz.g:189:2: ( ruleCreate )
                    // InternalViz.g:190:3: ruleCreate
                    {
                     before(grammarAccess.getCommandAccess().getCreateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCreate();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getCreateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalViz.g:195:2: ( ruleGenerate )
                    {
                    // InternalViz.g:195:2: ( ruleGenerate )
                    // InternalViz.g:196:3: ruleGenerate
                    {
                     before(grammarAccess.getCommandAccess().getGenerateParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGenerate();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getGenerateParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Alternatives"


    // $ANTLR start "rule__Create__Group__0"
    // InternalViz.g:205:1: rule__Create__Group__0 : rule__Create__Group__0__Impl rule__Create__Group__1 ;
    public final void rule__Create__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:209:1: ( rule__Create__Group__0__Impl rule__Create__Group__1 )
            // InternalViz.g:210:2: rule__Create__Group__0__Impl rule__Create__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Create__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Create__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__Group__0"


    // $ANTLR start "rule__Create__Group__0__Impl"
    // InternalViz.g:217:1: rule__Create__Group__0__Impl : ( ( rule__Create__CommandAssignment_0 ) ) ;
    public final void rule__Create__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:221:1: ( ( ( rule__Create__CommandAssignment_0 ) ) )
            // InternalViz.g:222:1: ( ( rule__Create__CommandAssignment_0 ) )
            {
            // InternalViz.g:222:1: ( ( rule__Create__CommandAssignment_0 ) )
            // InternalViz.g:223:2: ( rule__Create__CommandAssignment_0 )
            {
             before(grammarAccess.getCreateAccess().getCommandAssignment_0()); 
            // InternalViz.g:224:2: ( rule__Create__CommandAssignment_0 )
            // InternalViz.g:224:3: rule__Create__CommandAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Create__CommandAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCreateAccess().getCommandAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__Group__0__Impl"


    // $ANTLR start "rule__Create__Group__1"
    // InternalViz.g:232:1: rule__Create__Group__1 : rule__Create__Group__1__Impl rule__Create__Group__2 ;
    public final void rule__Create__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:236:1: ( rule__Create__Group__1__Impl rule__Create__Group__2 )
            // InternalViz.g:237:2: rule__Create__Group__1__Impl rule__Create__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Create__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Create__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__Group__1"


    // $ANTLR start "rule__Create__Group__1__Impl"
    // InternalViz.g:244:1: rule__Create__Group__1__Impl : ( 'with(' ) ;
    public final void rule__Create__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:248:1: ( ( 'with(' ) )
            // InternalViz.g:249:1: ( 'with(' )
            {
            // InternalViz.g:249:1: ( 'with(' )
            // InternalViz.g:250:2: 'with('
            {
             before(grammarAccess.getCreateAccess().getWithKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCreateAccess().getWithKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__Group__1__Impl"


    // $ANTLR start "rule__Create__Group__2"
    // InternalViz.g:259:1: rule__Create__Group__2 : rule__Create__Group__2__Impl rule__Create__Group__3 ;
    public final void rule__Create__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:263:1: ( rule__Create__Group__2__Impl rule__Create__Group__3 )
            // InternalViz.g:264:2: rule__Create__Group__2__Impl rule__Create__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Create__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Create__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__Group__2"


    // $ANTLR start "rule__Create__Group__2__Impl"
    // InternalViz.g:271:1: rule__Create__Group__2__Impl : ( ( rule__Create__BulletsAssignment_2 ) ) ;
    public final void rule__Create__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:275:1: ( ( ( rule__Create__BulletsAssignment_2 ) ) )
            // InternalViz.g:276:1: ( ( rule__Create__BulletsAssignment_2 ) )
            {
            // InternalViz.g:276:1: ( ( rule__Create__BulletsAssignment_2 ) )
            // InternalViz.g:277:2: ( rule__Create__BulletsAssignment_2 )
            {
             before(grammarAccess.getCreateAccess().getBulletsAssignment_2()); 
            // InternalViz.g:278:2: ( rule__Create__BulletsAssignment_2 )
            // InternalViz.g:278:3: rule__Create__BulletsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Create__BulletsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCreateAccess().getBulletsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__Group__2__Impl"


    // $ANTLR start "rule__Create__Group__3"
    // InternalViz.g:286:1: rule__Create__Group__3 : rule__Create__Group__3__Impl ;
    public final void rule__Create__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:290:1: ( rule__Create__Group__3__Impl )
            // InternalViz.g:291:2: rule__Create__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Create__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__Group__3"


    // $ANTLR start "rule__Create__Group__3__Impl"
    // InternalViz.g:297:1: rule__Create__Group__3__Impl : ( ')' ) ;
    public final void rule__Create__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:301:1: ( ( ')' ) )
            // InternalViz.g:302:1: ( ')' )
            {
            // InternalViz.g:302:1: ( ')' )
            // InternalViz.g:303:2: ')'
            {
             before(grammarAccess.getCreateAccess().getRightParenthesisKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCreateAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__Group__3__Impl"


    // $ANTLR start "rule__Model__CommandsAssignment"
    // InternalViz.g:313:1: rule__Model__CommandsAssignment : ( ruleCommand ) ;
    public final void rule__Model__CommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:317:1: ( ( ruleCommand ) )
            // InternalViz.g:318:2: ( ruleCommand )
            {
            // InternalViz.g:318:2: ( ruleCommand )
            // InternalViz.g:319:3: ruleCommand
            {
             before(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__CommandsAssignment"


    // $ANTLR start "rule__Create__CommandAssignment_0"
    // InternalViz.g:328:1: rule__Create__CommandAssignment_0 : ( ruleCreateBulletPoints ) ;
    public final void rule__Create__CommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:332:1: ( ( ruleCreateBulletPoints ) )
            // InternalViz.g:333:2: ( ruleCreateBulletPoints )
            {
            // InternalViz.g:333:2: ( ruleCreateBulletPoints )
            // InternalViz.g:334:3: ruleCreateBulletPoints
            {
             before(grammarAccess.getCreateAccess().getCommandCreateBulletPointsEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCreateBulletPoints();

            state._fsp--;

             after(grammarAccess.getCreateAccess().getCommandCreateBulletPointsEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__CommandAssignment_0"


    // $ANTLR start "rule__Create__BulletsAssignment_2"
    // InternalViz.g:343:1: rule__Create__BulletsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Create__BulletsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:347:1: ( ( RULE_STRING ) )
            // InternalViz.g:348:2: ( RULE_STRING )
            {
            // InternalViz.g:348:2: ( RULE_STRING )
            // InternalViz.g:349:3: RULE_STRING
            {
             before(grammarAccess.getCreateAccess().getBulletsSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCreateAccess().getBulletsSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__BulletsAssignment_2"


    // $ANTLR start "rule__Generate__CommandAssignment"
    // InternalViz.g:358:1: rule__Generate__CommandAssignment : ( ruleGenerateDefault ) ;
    public final void rule__Generate__CommandAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:362:1: ( ( ruleGenerateDefault ) )
            // InternalViz.g:363:2: ( ruleGenerateDefault )
            {
            // InternalViz.g:363:2: ( ruleGenerateDefault )
            // InternalViz.g:364:3: ruleGenerateDefault
            {
             before(grammarAccess.getGenerateAccess().getCommandGenerateDefaultEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleGenerateDefault();

            state._fsp--;

             after(grammarAccess.getGenerateAccess().getCommandGenerateDefaultEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generate__CommandAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});

}