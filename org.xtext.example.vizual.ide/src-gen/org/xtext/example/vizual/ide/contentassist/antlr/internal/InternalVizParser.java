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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NEW_LINE", "RULE_TAB_SPACE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'h1'", "'h2'", "'h3'", "'h4'", "'h5'", "'h6'", "'p'", "'head'", "'body'", "'html'", "'div'", "'end'"
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
    // InternalViz.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalViz.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalViz.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalViz.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalViz.g:69:3: ( rule__Model__Group__0 )
            // InternalViz.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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


    // $ANTLR start "entryRuleMainTag"
    // InternalViz.g:78:1: entryRuleMainTag : ruleMainTag EOF ;
    public final void entryRuleMainTag() throws RecognitionException {
        try {
            // InternalViz.g:79:1: ( ruleMainTag EOF )
            // InternalViz.g:80:1: ruleMainTag EOF
            {
             before(grammarAccess.getMainTagRule()); 
            pushFollow(FOLLOW_1);
            ruleMainTag();

            state._fsp--;

             after(grammarAccess.getMainTagRule()); 
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
    // $ANTLR end "entryRuleMainTag"


    // $ANTLR start "ruleMainTag"
    // InternalViz.g:87:1: ruleMainTag : ( ( rule__MainTag__Group__0 ) ) ;
    public final void ruleMainTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:91:2: ( ( ( rule__MainTag__Group__0 ) ) )
            // InternalViz.g:92:2: ( ( rule__MainTag__Group__0 ) )
            {
            // InternalViz.g:92:2: ( ( rule__MainTag__Group__0 ) )
            // InternalViz.g:93:3: ( rule__MainTag__Group__0 )
            {
             before(grammarAccess.getMainTagAccess().getGroup()); 
            // InternalViz.g:94:3: ( rule__MainTag__Group__0 )
            // InternalViz.g:94:4: rule__MainTag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MainTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainTagAccess().getGroup()); 

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
    // $ANTLR end "ruleMainTag"


    // $ANTLR start "entryRuleNormalTag"
    // InternalViz.g:103:1: entryRuleNormalTag : ruleNormalTag EOF ;
    public final void entryRuleNormalTag() throws RecognitionException {
        try {
            // InternalViz.g:104:1: ( ruleNormalTag EOF )
            // InternalViz.g:105:1: ruleNormalTag EOF
            {
             before(grammarAccess.getNormalTagRule()); 
            pushFollow(FOLLOW_1);
            ruleNormalTag();

            state._fsp--;

             after(grammarAccess.getNormalTagRule()); 
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
    // $ANTLR end "entryRuleNormalTag"


    // $ANTLR start "ruleNormalTag"
    // InternalViz.g:112:1: ruleNormalTag : ( ( rule__NormalTag__Alternatives ) ) ;
    public final void ruleNormalTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:116:2: ( ( ( rule__NormalTag__Alternatives ) ) )
            // InternalViz.g:117:2: ( ( rule__NormalTag__Alternatives ) )
            {
            // InternalViz.g:117:2: ( ( rule__NormalTag__Alternatives ) )
            // InternalViz.g:118:3: ( rule__NormalTag__Alternatives )
            {
             before(grammarAccess.getNormalTagAccess().getAlternatives()); 
            // InternalViz.g:119:3: ( rule__NormalTag__Alternatives )
            // InternalViz.g:119:4: rule__NormalTag__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NormalTag__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNormalTagAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNormalTag"


    // $ANTLR start "entryRuleTextTag"
    // InternalViz.g:128:1: entryRuleTextTag : ruleTextTag EOF ;
    public final void entryRuleTextTag() throws RecognitionException {
        try {
            // InternalViz.g:129:1: ( ruleTextTag EOF )
            // InternalViz.g:130:1: ruleTextTag EOF
            {
             before(grammarAccess.getTextTagRule()); 
            pushFollow(FOLLOW_1);
            ruleTextTag();

            state._fsp--;

             after(grammarAccess.getTextTagRule()); 
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
    // $ANTLR end "entryRuleTextTag"


    // $ANTLR start "ruleTextTag"
    // InternalViz.g:137:1: ruleTextTag : ( ( rule__TextTag__Group__0 ) ) ;
    public final void ruleTextTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:141:2: ( ( ( rule__TextTag__Group__0 ) ) )
            // InternalViz.g:142:2: ( ( rule__TextTag__Group__0 ) )
            {
            // InternalViz.g:142:2: ( ( rule__TextTag__Group__0 ) )
            // InternalViz.g:143:3: ( rule__TextTag__Group__0 )
            {
             before(grammarAccess.getTextTagAccess().getGroup()); 
            // InternalViz.g:144:3: ( rule__TextTag__Group__0 )
            // InternalViz.g:144:4: rule__TextTag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TextTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextTagAccess().getGroup()); 

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
    // $ANTLR end "ruleTextTag"


    // $ANTLR start "entryRuleContainerTag"
    // InternalViz.g:153:1: entryRuleContainerTag : ruleContainerTag EOF ;
    public final void entryRuleContainerTag() throws RecognitionException {
        try {
            // InternalViz.g:154:1: ( ruleContainerTag EOF )
            // InternalViz.g:155:1: ruleContainerTag EOF
            {
             before(grammarAccess.getContainerTagRule()); 
            pushFollow(FOLLOW_1);
            ruleContainerTag();

            state._fsp--;

             after(grammarAccess.getContainerTagRule()); 
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
    // $ANTLR end "entryRuleContainerTag"


    // $ANTLR start "ruleContainerTag"
    // InternalViz.g:162:1: ruleContainerTag : ( ( rule__ContainerTag__Group__0 ) ) ;
    public final void ruleContainerTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:166:2: ( ( ( rule__ContainerTag__Group__0 ) ) )
            // InternalViz.g:167:2: ( ( rule__ContainerTag__Group__0 ) )
            {
            // InternalViz.g:167:2: ( ( rule__ContainerTag__Group__0 ) )
            // InternalViz.g:168:3: ( rule__ContainerTag__Group__0 )
            {
             before(grammarAccess.getContainerTagAccess().getGroup()); 
            // InternalViz.g:169:3: ( rule__ContainerTag__Group__0 )
            // InternalViz.g:169:4: rule__ContainerTag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContainerTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerTagAccess().getGroup()); 

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
    // $ANTLR end "ruleContainerTag"


    // $ANTLR start "ruleMainTagName"
    // InternalViz.g:178:1: ruleMainTagName : ( ( rule__MainTagName__Alternatives ) ) ;
    public final void ruleMainTagName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:182:1: ( ( ( rule__MainTagName__Alternatives ) ) )
            // InternalViz.g:183:2: ( ( rule__MainTagName__Alternatives ) )
            {
            // InternalViz.g:183:2: ( ( rule__MainTagName__Alternatives ) )
            // InternalViz.g:184:3: ( rule__MainTagName__Alternatives )
            {
             before(grammarAccess.getMainTagNameAccess().getAlternatives()); 
            // InternalViz.g:185:3: ( rule__MainTagName__Alternatives )
            // InternalViz.g:185:4: rule__MainTagName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MainTagName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMainTagNameAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMainTagName"


    // $ANTLR start "rule__NormalTag__Alternatives"
    // InternalViz.g:193:1: rule__NormalTag__Alternatives : ( ( ruleTextTag ) | ( ruleContainerTag ) );
    public final void rule__NormalTag__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:197:1: ( ( ruleTextTag ) | ( ruleContainerTag ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=13 && LA1_0<=19)) ) {
                alt1=1;
            }
            else if ( (LA1_0==23) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalViz.g:198:2: ( ruleTextTag )
                    {
                    // InternalViz.g:198:2: ( ruleTextTag )
                    // InternalViz.g:199:3: ruleTextTag
                    {
                     before(grammarAccess.getNormalTagAccess().getTextTagParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTextTag();

                    state._fsp--;

                     after(grammarAccess.getNormalTagAccess().getTextTagParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalViz.g:204:2: ( ruleContainerTag )
                    {
                    // InternalViz.g:204:2: ( ruleContainerTag )
                    // InternalViz.g:205:3: ruleContainerTag
                    {
                     before(grammarAccess.getNormalTagAccess().getContainerTagParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleContainerTag();

                    state._fsp--;

                     after(grammarAccess.getNormalTagAccess().getContainerTagParserRuleCall_1()); 

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
    // $ANTLR end "rule__NormalTag__Alternatives"


    // $ANTLR start "rule__TextTag__Alternatives_0"
    // InternalViz.g:214:1: rule__TextTag__Alternatives_0 : ( ( 'h1' ) | ( 'h2' ) | ( 'h3' ) | ( 'h4' ) | ( 'h5' ) | ( 'h6' ) | ( 'p' ) );
    public final void rule__TextTag__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:218:1: ( ( 'h1' ) | ( 'h2' ) | ( 'h3' ) | ( 'h4' ) | ( 'h5' ) | ( 'h6' ) | ( 'p' ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                alt2=5;
                }
                break;
            case 18:
                {
                alt2=6;
                }
                break;
            case 19:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalViz.g:219:2: ( 'h1' )
                    {
                    // InternalViz.g:219:2: ( 'h1' )
                    // InternalViz.g:220:3: 'h1'
                    {
                     before(grammarAccess.getTextTagAccess().getH1Keyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTextTagAccess().getH1Keyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalViz.g:225:2: ( 'h2' )
                    {
                    // InternalViz.g:225:2: ( 'h2' )
                    // InternalViz.g:226:3: 'h2'
                    {
                     before(grammarAccess.getTextTagAccess().getH2Keyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTextTagAccess().getH2Keyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalViz.g:231:2: ( 'h3' )
                    {
                    // InternalViz.g:231:2: ( 'h3' )
                    // InternalViz.g:232:3: 'h3'
                    {
                     before(grammarAccess.getTextTagAccess().getH3Keyword_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTextTagAccess().getH3Keyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalViz.g:237:2: ( 'h4' )
                    {
                    // InternalViz.g:237:2: ( 'h4' )
                    // InternalViz.g:238:3: 'h4'
                    {
                     before(grammarAccess.getTextTagAccess().getH4Keyword_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getTextTagAccess().getH4Keyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalViz.g:243:2: ( 'h5' )
                    {
                    // InternalViz.g:243:2: ( 'h5' )
                    // InternalViz.g:244:3: 'h5'
                    {
                     before(grammarAccess.getTextTagAccess().getH5Keyword_0_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getTextTagAccess().getH5Keyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalViz.g:249:2: ( 'h6' )
                    {
                    // InternalViz.g:249:2: ( 'h6' )
                    // InternalViz.g:250:3: 'h6'
                    {
                     before(grammarAccess.getTextTagAccess().getH6Keyword_0_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getTextTagAccess().getH6Keyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalViz.g:255:2: ( 'p' )
                    {
                    // InternalViz.g:255:2: ( 'p' )
                    // InternalViz.g:256:3: 'p'
                    {
                     before(grammarAccess.getTextTagAccess().getPKeyword_0_6()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getTextTagAccess().getPKeyword_0_6()); 

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
    // $ANTLR end "rule__TextTag__Alternatives_0"


    // $ANTLR start "rule__MainTagName__Alternatives"
    // InternalViz.g:265:1: rule__MainTagName__Alternatives : ( ( ( 'head' ) ) | ( ( 'body' ) ) );
    public final void rule__MainTagName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:269:1: ( ( ( 'head' ) ) | ( ( 'body' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
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
                    // InternalViz.g:270:2: ( ( 'head' ) )
                    {
                    // InternalViz.g:270:2: ( ( 'head' ) )
                    // InternalViz.g:271:3: ( 'head' )
                    {
                     before(grammarAccess.getMainTagNameAccess().getHeadEnumLiteralDeclaration_0()); 
                    // InternalViz.g:272:3: ( 'head' )
                    // InternalViz.g:272:4: 'head'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getMainTagNameAccess().getHeadEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalViz.g:276:2: ( ( 'body' ) )
                    {
                    // InternalViz.g:276:2: ( ( 'body' ) )
                    // InternalViz.g:277:3: ( 'body' )
                    {
                     before(grammarAccess.getMainTagNameAccess().getBodyEnumLiteralDeclaration_1()); 
                    // InternalViz.g:278:3: ( 'body' )
                    // InternalViz.g:278:4: 'body'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getMainTagNameAccess().getBodyEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__MainTagName__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalViz.g:286:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:290:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalViz.g:291:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalViz.g:298:1: rule__Model__Group__0__Impl : ( 'html' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:302:1: ( ( 'html' ) )
            // InternalViz.g:303:1: ( 'html' )
            {
            // InternalViz.g:303:1: ( 'html' )
            // InternalViz.g:304:2: 'html'
            {
             before(grammarAccess.getModelAccess().getHtmlKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getHtmlKeyword_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalViz.g:313:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:317:1: ( rule__Model__Group__1__Impl )
            // InternalViz.g:318:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalViz.g:324:1: rule__Model__Group__1__Impl : ( ( rule__Model__MainTagsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:328:1: ( ( ( rule__Model__MainTagsAssignment_1 )* ) )
            // InternalViz.g:329:1: ( ( rule__Model__MainTagsAssignment_1 )* )
            {
            // InternalViz.g:329:1: ( ( rule__Model__MainTagsAssignment_1 )* )
            // InternalViz.g:330:2: ( rule__Model__MainTagsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getMainTagsAssignment_1()); 
            // InternalViz.g:331:2: ( rule__Model__MainTagsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=20 && LA4_0<=21)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalViz.g:331:3: rule__Model__MainTagsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__MainTagsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getMainTagsAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__MainTag__Group__0"
    // InternalViz.g:340:1: rule__MainTag__Group__0 : rule__MainTag__Group__0__Impl rule__MainTag__Group__1 ;
    public final void rule__MainTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:344:1: ( rule__MainTag__Group__0__Impl rule__MainTag__Group__1 )
            // InternalViz.g:345:2: rule__MainTag__Group__0__Impl rule__MainTag__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MainTag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainTag__Group__1();

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
    // $ANTLR end "rule__MainTag__Group__0"


    // $ANTLR start "rule__MainTag__Group__0__Impl"
    // InternalViz.g:352:1: rule__MainTag__Group__0__Impl : ( ( rule__MainTag__MainTagNameAssignment_0 ) ) ;
    public final void rule__MainTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:356:1: ( ( ( rule__MainTag__MainTagNameAssignment_0 ) ) )
            // InternalViz.g:357:1: ( ( rule__MainTag__MainTagNameAssignment_0 ) )
            {
            // InternalViz.g:357:1: ( ( rule__MainTag__MainTagNameAssignment_0 ) )
            // InternalViz.g:358:2: ( rule__MainTag__MainTagNameAssignment_0 )
            {
             before(grammarAccess.getMainTagAccess().getMainTagNameAssignment_0()); 
            // InternalViz.g:359:2: ( rule__MainTag__MainTagNameAssignment_0 )
            // InternalViz.g:359:3: rule__MainTag__MainTagNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MainTag__MainTagNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMainTagAccess().getMainTagNameAssignment_0()); 

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
    // $ANTLR end "rule__MainTag__Group__0__Impl"


    // $ANTLR start "rule__MainTag__Group__1"
    // InternalViz.g:367:1: rule__MainTag__Group__1 : rule__MainTag__Group__1__Impl ;
    public final void rule__MainTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:371:1: ( rule__MainTag__Group__1__Impl )
            // InternalViz.g:372:2: rule__MainTag__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainTag__Group__1__Impl();

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
    // $ANTLR end "rule__MainTag__Group__1"


    // $ANTLR start "rule__MainTag__Group__1__Impl"
    // InternalViz.g:378:1: rule__MainTag__Group__1__Impl : ( ( rule__MainTag__NormalTagsAssignment_1 )* ) ;
    public final void rule__MainTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:382:1: ( ( ( rule__MainTag__NormalTagsAssignment_1 )* ) )
            // InternalViz.g:383:1: ( ( rule__MainTag__NormalTagsAssignment_1 )* )
            {
            // InternalViz.g:383:1: ( ( rule__MainTag__NormalTagsAssignment_1 )* )
            // InternalViz.g:384:2: ( rule__MainTag__NormalTagsAssignment_1 )*
            {
             before(grammarAccess.getMainTagAccess().getNormalTagsAssignment_1()); 
            // InternalViz.g:385:2: ( rule__MainTag__NormalTagsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=13 && LA5_0<=19)||LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalViz.g:385:3: rule__MainTag__NormalTagsAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__MainTag__NormalTagsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getMainTagAccess().getNormalTagsAssignment_1()); 

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
    // $ANTLR end "rule__MainTag__Group__1__Impl"


    // $ANTLR start "rule__TextTag__Group__0"
    // InternalViz.g:394:1: rule__TextTag__Group__0 : rule__TextTag__Group__0__Impl rule__TextTag__Group__1 ;
    public final void rule__TextTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:398:1: ( rule__TextTag__Group__0__Impl rule__TextTag__Group__1 )
            // InternalViz.g:399:2: rule__TextTag__Group__0__Impl rule__TextTag__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__TextTag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextTag__Group__1();

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
    // $ANTLR end "rule__TextTag__Group__0"


    // $ANTLR start "rule__TextTag__Group__0__Impl"
    // InternalViz.g:406:1: rule__TextTag__Group__0__Impl : ( ( rule__TextTag__Alternatives_0 ) ) ;
    public final void rule__TextTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:410:1: ( ( ( rule__TextTag__Alternatives_0 ) ) )
            // InternalViz.g:411:1: ( ( rule__TextTag__Alternatives_0 ) )
            {
            // InternalViz.g:411:1: ( ( rule__TextTag__Alternatives_0 ) )
            // InternalViz.g:412:2: ( rule__TextTag__Alternatives_0 )
            {
             before(grammarAccess.getTextTagAccess().getAlternatives_0()); 
            // InternalViz.g:413:2: ( rule__TextTag__Alternatives_0 )
            // InternalViz.g:413:3: rule__TextTag__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__TextTag__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTextTagAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__TextTag__Group__0__Impl"


    // $ANTLR start "rule__TextTag__Group__1"
    // InternalViz.g:421:1: rule__TextTag__Group__1 : rule__TextTag__Group__1__Impl ;
    public final void rule__TextTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:425:1: ( rule__TextTag__Group__1__Impl )
            // InternalViz.g:426:2: rule__TextTag__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextTag__Group__1__Impl();

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
    // $ANTLR end "rule__TextTag__Group__1"


    // $ANTLR start "rule__TextTag__Group__1__Impl"
    // InternalViz.g:432:1: rule__TextTag__Group__1__Impl : ( ( rule__TextTag__NameAssignment_1 ) ) ;
    public final void rule__TextTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:436:1: ( ( ( rule__TextTag__NameAssignment_1 ) ) )
            // InternalViz.g:437:1: ( ( rule__TextTag__NameAssignment_1 ) )
            {
            // InternalViz.g:437:1: ( ( rule__TextTag__NameAssignment_1 ) )
            // InternalViz.g:438:2: ( rule__TextTag__NameAssignment_1 )
            {
             before(grammarAccess.getTextTagAccess().getNameAssignment_1()); 
            // InternalViz.g:439:2: ( rule__TextTag__NameAssignment_1 )
            // InternalViz.g:439:3: rule__TextTag__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TextTag__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTextTagAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__TextTag__Group__1__Impl"


    // $ANTLR start "rule__ContainerTag__Group__0"
    // InternalViz.g:448:1: rule__ContainerTag__Group__0 : rule__ContainerTag__Group__0__Impl rule__ContainerTag__Group__1 ;
    public final void rule__ContainerTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:452:1: ( rule__ContainerTag__Group__0__Impl rule__ContainerTag__Group__1 )
            // InternalViz.g:453:2: rule__ContainerTag__Group__0__Impl rule__ContainerTag__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ContainerTag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContainerTag__Group__1();

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
    // $ANTLR end "rule__ContainerTag__Group__0"


    // $ANTLR start "rule__ContainerTag__Group__0__Impl"
    // InternalViz.g:460:1: rule__ContainerTag__Group__0__Impl : ( () ) ;
    public final void rule__ContainerTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:464:1: ( ( () ) )
            // InternalViz.g:465:1: ( () )
            {
            // InternalViz.g:465:1: ( () )
            // InternalViz.g:466:2: ()
            {
             before(grammarAccess.getContainerTagAccess().getContainerTagAction_0()); 
            // InternalViz.g:467:2: ()
            // InternalViz.g:467:3: 
            {
            }

             after(grammarAccess.getContainerTagAccess().getContainerTagAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerTag__Group__0__Impl"


    // $ANTLR start "rule__ContainerTag__Group__1"
    // InternalViz.g:475:1: rule__ContainerTag__Group__1 : rule__ContainerTag__Group__1__Impl rule__ContainerTag__Group__2 ;
    public final void rule__ContainerTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:479:1: ( rule__ContainerTag__Group__1__Impl rule__ContainerTag__Group__2 )
            // InternalViz.g:480:2: rule__ContainerTag__Group__1__Impl rule__ContainerTag__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ContainerTag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContainerTag__Group__2();

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
    // $ANTLR end "rule__ContainerTag__Group__1"


    // $ANTLR start "rule__ContainerTag__Group__1__Impl"
    // InternalViz.g:487:1: rule__ContainerTag__Group__1__Impl : ( 'div' ) ;
    public final void rule__ContainerTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:491:1: ( ( 'div' ) )
            // InternalViz.g:492:1: ( 'div' )
            {
            // InternalViz.g:492:1: ( 'div' )
            // InternalViz.g:493:2: 'div'
            {
             before(grammarAccess.getContainerTagAccess().getDivKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getContainerTagAccess().getDivKeyword_1()); 

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
    // $ANTLR end "rule__ContainerTag__Group__1__Impl"


    // $ANTLR start "rule__ContainerTag__Group__2"
    // InternalViz.g:502:1: rule__ContainerTag__Group__2 : rule__ContainerTag__Group__2__Impl rule__ContainerTag__Group__3 ;
    public final void rule__ContainerTag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:506:1: ( rule__ContainerTag__Group__2__Impl rule__ContainerTag__Group__3 )
            // InternalViz.g:507:2: rule__ContainerTag__Group__2__Impl rule__ContainerTag__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ContainerTag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContainerTag__Group__3();

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
    // $ANTLR end "rule__ContainerTag__Group__2"


    // $ANTLR start "rule__ContainerTag__Group__2__Impl"
    // InternalViz.g:514:1: rule__ContainerTag__Group__2__Impl : ( ( rule__ContainerTag__NormalTagsAssignment_2 )* ) ;
    public final void rule__ContainerTag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:518:1: ( ( ( rule__ContainerTag__NormalTagsAssignment_2 )* ) )
            // InternalViz.g:519:1: ( ( rule__ContainerTag__NormalTagsAssignment_2 )* )
            {
            // InternalViz.g:519:1: ( ( rule__ContainerTag__NormalTagsAssignment_2 )* )
            // InternalViz.g:520:2: ( rule__ContainerTag__NormalTagsAssignment_2 )*
            {
             before(grammarAccess.getContainerTagAccess().getNormalTagsAssignment_2()); 
            // InternalViz.g:521:2: ( rule__ContainerTag__NormalTagsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=13 && LA6_0<=19)||LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalViz.g:521:3: rule__ContainerTag__NormalTagsAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ContainerTag__NormalTagsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getContainerTagAccess().getNormalTagsAssignment_2()); 

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
    // $ANTLR end "rule__ContainerTag__Group__2__Impl"


    // $ANTLR start "rule__ContainerTag__Group__3"
    // InternalViz.g:529:1: rule__ContainerTag__Group__3 : rule__ContainerTag__Group__3__Impl ;
    public final void rule__ContainerTag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:533:1: ( rule__ContainerTag__Group__3__Impl )
            // InternalViz.g:534:2: rule__ContainerTag__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContainerTag__Group__3__Impl();

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
    // $ANTLR end "rule__ContainerTag__Group__3"


    // $ANTLR start "rule__ContainerTag__Group__3__Impl"
    // InternalViz.g:540:1: rule__ContainerTag__Group__3__Impl : ( 'end' ) ;
    public final void rule__ContainerTag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:544:1: ( ( 'end' ) )
            // InternalViz.g:545:1: ( 'end' )
            {
            // InternalViz.g:545:1: ( 'end' )
            // InternalViz.g:546:2: 'end'
            {
             before(grammarAccess.getContainerTagAccess().getEndKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getContainerTagAccess().getEndKeyword_3()); 

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
    // $ANTLR end "rule__ContainerTag__Group__3__Impl"


    // $ANTLR start "rule__Model__MainTagsAssignment_1"
    // InternalViz.g:556:1: rule__Model__MainTagsAssignment_1 : ( ruleMainTag ) ;
    public final void rule__Model__MainTagsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:560:1: ( ( ruleMainTag ) )
            // InternalViz.g:561:2: ( ruleMainTag )
            {
            // InternalViz.g:561:2: ( ruleMainTag )
            // InternalViz.g:562:3: ruleMainTag
            {
             before(grammarAccess.getModelAccess().getMainTagsMainTagParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMainTag();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMainTagsMainTagParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__MainTagsAssignment_1"


    // $ANTLR start "rule__MainTag__MainTagNameAssignment_0"
    // InternalViz.g:571:1: rule__MainTag__MainTagNameAssignment_0 : ( ruleMainTagName ) ;
    public final void rule__MainTag__MainTagNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:575:1: ( ( ruleMainTagName ) )
            // InternalViz.g:576:2: ( ruleMainTagName )
            {
            // InternalViz.g:576:2: ( ruleMainTagName )
            // InternalViz.g:577:3: ruleMainTagName
            {
             before(grammarAccess.getMainTagAccess().getMainTagNameMainTagNameEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMainTagName();

            state._fsp--;

             after(grammarAccess.getMainTagAccess().getMainTagNameMainTagNameEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__MainTag__MainTagNameAssignment_0"


    // $ANTLR start "rule__MainTag__NormalTagsAssignment_1"
    // InternalViz.g:586:1: rule__MainTag__NormalTagsAssignment_1 : ( ruleNormalTag ) ;
    public final void rule__MainTag__NormalTagsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:590:1: ( ( ruleNormalTag ) )
            // InternalViz.g:591:2: ( ruleNormalTag )
            {
            // InternalViz.g:591:2: ( ruleNormalTag )
            // InternalViz.g:592:3: ruleNormalTag
            {
             before(grammarAccess.getMainTagAccess().getNormalTagsNormalTagParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNormalTag();

            state._fsp--;

             after(grammarAccess.getMainTagAccess().getNormalTagsNormalTagParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MainTag__NormalTagsAssignment_1"


    // $ANTLR start "rule__TextTag__NameAssignment_1"
    // InternalViz.g:601:1: rule__TextTag__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TextTag__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:605:1: ( ( RULE_ID ) )
            // InternalViz.g:606:2: ( RULE_ID )
            {
            // InternalViz.g:606:2: ( RULE_ID )
            // InternalViz.g:607:3: RULE_ID
            {
             before(grammarAccess.getTextTagAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTextTagAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TextTag__NameAssignment_1"


    // $ANTLR start "rule__ContainerTag__NormalTagsAssignment_2"
    // InternalViz.g:616:1: rule__ContainerTag__NormalTagsAssignment_2 : ( ruleNormalTag ) ;
    public final void rule__ContainerTag__NormalTagsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalViz.g:620:1: ( ( ruleNormalTag ) )
            // InternalViz.g:621:2: ( ruleNormalTag )
            {
            // InternalViz.g:621:2: ( ruleNormalTag )
            // InternalViz.g:622:3: ruleNormalTag
            {
             before(grammarAccess.getContainerTagAccess().getNormalTagsNormalTagParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNormalTag();

            state._fsp--;

             after(grammarAccess.getContainerTagAccess().getNormalTagsNormalTagParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ContainerTag__NormalTagsAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000008FE000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000008FE002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000018FE000L});

}