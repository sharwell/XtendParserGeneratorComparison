// $ANTLR 3.2 Sep 23, 2009 14:05:07 src/xtend/antlr3_2/Xtend.g 2014-06-04 10:05:04

package xtend.antlr3_2; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class XtendParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_RICH_TEXT", "RULE_RICH_TEXT_START", "RULE_RICH_TEXT_INBETWEEN", "RULE_COMMENT_RICH_TEXT_INBETWEEN", "RULE_RICH_TEXT_END", "RULE_COMMENT_RICH_TEXT_END", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_HEX_DIGIT", "RULE_UNICODE_ESCAPE", "RULE_IN_RICH_STRING", "RULE_IDENTIFIER_START", "RULE_IDENTIFIER_PART_IMPL", "RULE_IDENTIFIER_PART", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'class'", "'<'", "','", "'>'", "'extends'", "'implements'", "'{'", "'}'", "'interface'", "'enum'", "'annotation'", "'='", "'extension'", "'('", "')'", "'throws'", "'new'", "'public'", "'private'", "'protected'", "'abstract'", "'static'", "'dispatch'", "'final'", "'strictfp'", "'native'", "'volatile'", "'synchronized'", "'transient'", "'val'", "'var'", "'def'", "'override'", "'create'", "':'", "'AFTER'", "'BEFORE'", "'SEPARATOR'", "'import'", "'...'", "'switch'", "'default'", "'FOR'", "'ENDFOR'", "'IF'", "'ELSE'", "'ENDIF'", "'ELSEIF'", "'@'", "'#'", "'['", "']'", "'+='", "'-='", "'*='", "'/='", "'%='", "'>='", "'||'", "'&&'", "'=='", "'!='", "'==='", "'!=='", "'instanceof'", "'->'", "'..<'", "'..'", "'=>'", "'<>'", "'?:'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'++'", "'--'", "'.'", "'::'", "'?.'", "'|'", "'if'", "'else'", "'case'", "'for'", "'while'", "'do'", "'super'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'&'"
    };
    public static final int RULE_COMMENT_RICH_TEXT_INBETWEEN=9;
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_ANY_OTHER=24;
    public static final int RULE_IDENTIFIER_PART_IMPL=19;
    public static final int RULE_COMMENT_RICH_TEXT_END=11;
    public static final int EOF=-1;
    public static final int RULE_IDENTIFIER_START=18;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int RULE_HEX=12;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_RICH_TEXT_END=10;
    public static final int RULE_DECIMAL=14;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_HEX_DIGIT=15;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int RULE_IN_RICH_STRING=17;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=21;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=5;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int RULE_RICH_TEXT_START=7;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int RULE_RICH_TEXT=6;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_UNICODE_ESCAPE=16;
    public static final int RULE_INT=13;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_IDENTIFIER_PART=20;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=22;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_RICH_TEXT_INBETWEEN=8;
    public static final int RULE_WS=23;

    // delegates
    // delegators


        public XtendParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public XtendParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return XtendParser.tokenNames; }
    public String getGrammarFileName() { return "src/xtend/antlr3_2/Xtend.g"; }



    // $ANTLR start "ruleFile"
    // src/xtend/antlr3_2/Xtend.g:14:1: ruleFile : ( 'package' ruleQualifiedName ( ';' )? )? ( ruleXImportSection )? ( ruleType )* ;
    public final void ruleFile() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:14:10: ( ( 'package' ruleQualifiedName ( ';' )? )? ( ruleXImportSection )? ( ruleType )* )
            // src/xtend/antlr3_2/Xtend.g:15:2: ( 'package' ruleQualifiedName ( ';' )? )? ( ruleXImportSection )? ( ruleType )*
            {
            // src/xtend/antlr3_2/Xtend.g:15:2: ( 'package' ruleQualifiedName ( ';' )? )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==25) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==37) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==EOF||(LA2_3>=25 && LA2_3<=27)||(LA2_3>=35 && LA2_3<=36)||(LA2_3>=44 && LA2_3<=55)||LA2_3==65||LA2_3==75||LA2_3==108) ) {
                        alt2=1;
                    }
                    else if ( (LA2_3==37) ) {
                        int LA2_5 = input.LA(4);

                        if ( (LA2_5==RULE_ID||LA2_5==37||LA2_5==60||(LA2_5>=62 && LA2_5<=64)) ) {
                            alt2=1;
                        }
                    }
                }
                else if ( (LA2_1==RULE_ID||LA2_1==60||(LA2_1>=62 && LA2_1<=64)) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:16:3: 'package' ruleQualifiedName ( ';' )?
                    {
                    match(input,25,FOLLOW_25_in_ruleFile36); if (state.failed) return ;
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFile38);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:16:31: ( ';' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==26) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:16:31: ';'
                            {
                            match(input,26,FOLLOW_26_in_ruleFile40); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }

            // src/xtend/antlr3_2/Xtend.g:17:5: ( ruleXImportSection )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==65) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:17:5: ruleXImportSection
                    {
                    pushFollow(FOLLOW_ruleXImportSection_in_ruleFile47);
                    ruleXImportSection();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // src/xtend/antlr3_2/Xtend.g:17:25: ( ruleType )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25||LA4_0==27||(LA4_0>=35 && LA4_0<=37)||(LA4_0>=44 && LA4_0<=55)||LA4_0==75) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // src/xtend/antlr3_2/Xtend.g:17:25: ruleType
            	    {
            	    pushFollow(FOLLOW_ruleType_in_ruleFile50);
            	    ruleType();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleFile"


    // $ANTLR start "ruleType"
    // src/xtend/antlr3_2/Xtend.g:21:1: ruleType : ( ruleXAnnotation )* ( ( ruleCommonModifier )* 'class' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference )? ( 'implements' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'interface' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'enum' ruleValidID '{' ( ruleXtendEnumLiteral ( ',' ruleXtendEnumLiteral )* )? ( ';' )? '}' | ( ruleCommonModifier )* 'annotation' ruleValidID '{' ( ruleAnnotationField )* '}' ) ;
    public final void ruleType() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:21:10: ( ( ruleXAnnotation )* ( ( ruleCommonModifier )* 'class' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference )? ( 'implements' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'interface' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'enum' ruleValidID '{' ( ruleXtendEnumLiteral ( ',' ruleXtendEnumLiteral )* )? ( ';' )? '}' | ( ruleCommonModifier )* 'annotation' ruleValidID '{' ( ruleAnnotationField )* '}' ) )
            // src/xtend/antlr3_2/Xtend.g:22:2: ( ruleXAnnotation )* ( ( ruleCommonModifier )* 'class' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference )? ( 'implements' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'interface' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'enum' ruleValidID '{' ( ruleXtendEnumLiteral ( ',' ruleXtendEnumLiteral )* )? ( ';' )? '}' | ( ruleCommonModifier )* 'annotation' ruleValidID '{' ( ruleAnnotationField )* '}' )
            {
            // src/xtend/antlr3_2/Xtend.g:22:2: ( ruleXAnnotation )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==75) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src/xtend/antlr3_2/Xtend.g:22:2: ruleXAnnotation
            	    {
            	    pushFollow(FOLLOW_ruleXAnnotation_in_ruleType62);
            	    ruleXAnnotation();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // src/xtend/antlr3_2/Xtend.g:22:19: ( ( ruleCommonModifier )* 'class' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference )? ( 'implements' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'interface' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'enum' ruleValidID '{' ( ruleXtendEnumLiteral ( ',' ruleXtendEnumLiteral )* )? ( ';' )? '}' | ( ruleCommonModifier )* 'annotation' ruleValidID '{' ( ruleAnnotationField )* '}' )
            int alt25=4;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:23:3: ( ruleCommonModifier )* 'class' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference )? ( 'implements' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}'
                    {
                    // src/xtend/antlr3_2/Xtend.g:23:3: ( ruleCommonModifier )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==25||(LA6_0>=44 && LA6_0<=55)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:23:3: ruleCommonModifier
                    	    {
                    	    pushFollow(FOLLOW_ruleCommonModifier_in_ruleType69);
                    	    ruleCommonModifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match(input,27,FOLLOW_27_in_ruleType72); if (state.failed) return ;
                    pushFollow(FOLLOW_ruleValidID_in_ruleType74);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:23:43: ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==28) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:24:4: '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>'
                            {
                            match(input,28,FOLLOW_28_in_ruleType81); if (state.failed) return ;
                            pushFollow(FOLLOW_ruleJvmTypeParameter_in_ruleType83);
                            ruleJvmTypeParameter();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:24:29: ( ',' ruleJvmTypeParameter )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==29) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:25:5: ',' ruleJvmTypeParameter
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleType91); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleJvmTypeParameter_in_ruleType93);
                            	    ruleJvmTypeParameter();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop7;
                                }
                            } while (true);

                            match(input,30,FOLLOW_30_in_ruleType101); if (state.failed) return ;

                            }
                            break;

                    }

                    // src/xtend/antlr3_2/Xtend.g:27:6: ( 'extends' ruleJvmParameterizedTypeReference )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==31) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:28:4: 'extends' ruleJvmParameterizedTypeReference
                            {
                            match(input,31,FOLLOW_31_in_ruleType113); if (state.failed) return ;
                            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleType115);
                            ruleJvmParameterizedTypeReference();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    // src/xtend/antlr3_2/Xtend.g:29:6: ( 'implements' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==32) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:30:4: 'implements' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )*
                            {
                            match(input,32,FOLLOW_32_in_ruleType127); if (state.failed) return ;
                            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleType129);
                            ruleJvmParameterizedTypeReference();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:30:51: ( ',' ruleJvmParameterizedTypeReference )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==29) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:31:5: ',' ruleJvmParameterizedTypeReference
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleType137); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleType139);
                            	    ruleJvmParameterizedTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,33,FOLLOW_33_in_ruleType152); if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:33:10: ( ruleMember )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID||LA12_0==25||LA12_0==27||(LA12_0>=35 && LA12_0<=37)||(LA12_0>=39 && LA12_0<=40)||(LA12_0>=43 && LA12_0<=60)||(LA12_0>=62 && LA12_0<=64)||LA12_0==75||LA12_0==95) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:33:10: ruleMember
                    	    {
                    	    pushFollow(FOLLOW_ruleMember_in_ruleType154);
                    	    ruleMember();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match(input,34,FOLLOW_34_in_ruleType157); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:34:3: ( ruleCommonModifier )* 'interface' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}'
                    {
                    // src/xtend/antlr3_2/Xtend.g:34:3: ( ruleCommonModifier )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==25||(LA13_0>=44 && LA13_0<=55)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:34:3: ruleCommonModifier
                    	    {
                    	    pushFollow(FOLLOW_ruleCommonModifier_in_ruleType163);
                    	    ruleCommonModifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match(input,35,FOLLOW_35_in_ruleType166); if (state.failed) return ;
                    pushFollow(FOLLOW_ruleValidID_in_ruleType168);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:34:47: ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==28) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:35:4: '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>'
                            {
                            match(input,28,FOLLOW_28_in_ruleType175); if (state.failed) return ;
                            pushFollow(FOLLOW_ruleJvmTypeParameter_in_ruleType177);
                            ruleJvmTypeParameter();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:35:29: ( ',' ruleJvmTypeParameter )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==29) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:36:5: ',' ruleJvmTypeParameter
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleType185); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleJvmTypeParameter_in_ruleType187);
                            	    ruleJvmTypeParameter();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop14;
                                }
                            } while (true);

                            match(input,30,FOLLOW_30_in_ruleType195); if (state.failed) return ;

                            }
                            break;

                    }

                    // src/xtend/antlr3_2/Xtend.g:38:6: ( 'extends' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==31) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:39:4: 'extends' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )*
                            {
                            match(input,31,FOLLOW_31_in_ruleType207); if (state.failed) return ;
                            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleType209);
                            ruleJvmParameterizedTypeReference();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:39:48: ( ',' ruleJvmParameterizedTypeReference )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==29) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:40:5: ',' ruleJvmParameterizedTypeReference
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleType217); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleType219);
                            	    ruleJvmParameterizedTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,33,FOLLOW_33_in_ruleType232); if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:42:10: ( ruleMember )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID||LA18_0==25||LA18_0==27||(LA18_0>=35 && LA18_0<=37)||(LA18_0>=39 && LA18_0<=40)||(LA18_0>=43 && LA18_0<=60)||(LA18_0>=62 && LA18_0<=64)||LA18_0==75||LA18_0==95) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:42:10: ruleMember
                    	    {
                    	    pushFollow(FOLLOW_ruleMember_in_ruleType234);
                    	    ruleMember();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    match(input,34,FOLLOW_34_in_ruleType237); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/xtend/antlr3_2/Xtend.g:43:3: ( ruleCommonModifier )* 'enum' ruleValidID '{' ( ruleXtendEnumLiteral ( ',' ruleXtendEnumLiteral )* )? ( ';' )? '}'
                    {
                    // src/xtend/antlr3_2/Xtend.g:43:3: ( ruleCommonModifier )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==25||(LA19_0>=44 && LA19_0<=55)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:43:3: ruleCommonModifier
                    	    {
                    	    pushFollow(FOLLOW_ruleCommonModifier_in_ruleType243);
                    	    ruleCommonModifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    match(input,36,FOLLOW_36_in_ruleType246); if (state.failed) return ;
                    pushFollow(FOLLOW_ruleValidID_in_ruleType248);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,33,FOLLOW_33_in_ruleType250); if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:43:46: ( ruleXtendEnumLiteral ( ',' ruleXtendEnumLiteral )* )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_ID||LA21_0==37||LA21_0==60||(LA21_0>=62 && LA21_0<=64)) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:44:4: ruleXtendEnumLiteral ( ',' ruleXtendEnumLiteral )*
                            {
                            pushFollow(FOLLOW_ruleXtendEnumLiteral_in_ruleType257);
                            ruleXtendEnumLiteral();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:44:25: ( ',' ruleXtendEnumLiteral )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==29) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:45:5: ',' ruleXtendEnumLiteral
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleType265); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleXtendEnumLiteral_in_ruleType267);
                            	    ruleXtendEnumLiteral();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // src/xtend/antlr3_2/Xtend.g:47:6: ( ';' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==26) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:47:6: ';'
                            {
                            match(input,26,FOLLOW_26_in_ruleType280); if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,34,FOLLOW_34_in_ruleType283); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/xtend/antlr3_2/Xtend.g:48:3: ( ruleCommonModifier )* 'annotation' ruleValidID '{' ( ruleAnnotationField )* '}'
                    {
                    // src/xtend/antlr3_2/Xtend.g:48:3: ( ruleCommonModifier )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==25||(LA23_0>=44 && LA23_0<=55)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:48:3: ruleCommonModifier
                    	    {
                    	    pushFollow(FOLLOW_ruleCommonModifier_in_ruleType289);
                    	    ruleCommonModifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    match(input,37,FOLLOW_37_in_ruleType292); if (state.failed) return ;
                    pushFollow(FOLLOW_ruleValidID_in_ruleType294);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,33,FOLLOW_33_in_ruleType296); if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:48:52: ( ruleAnnotationField )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_ID||LA24_0==25||LA24_0==27||(LA24_0>=35 && LA24_0<=37)||LA24_0==40||(LA24_0>=44 && LA24_0<=57)||LA24_0==60||(LA24_0>=62 && LA24_0<=64)||LA24_0==75||LA24_0==95) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:48:52: ruleAnnotationField
                    	    {
                    	    pushFollow(FOLLOW_ruleAnnotationField_in_ruleType298);
                    	    ruleAnnotationField();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    match(input,34,FOLLOW_34_in_ruleType301); if (state.failed) return ;

                    }
                    break;

            }


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
    // $ANTLR end "ruleType"


    // $ANTLR start "ruleAnnotationField"
    // src/xtend/antlr3_2/Xtend.g:53:1: ruleAnnotationField : ( ruleXAnnotation )* ( ( ( ruleCommonModifier )* ruleFieldModifier ( ruleCommonModifier )* ( ruleJvmTypeReference )? ruleValidID | ( ruleCommonModifier )* ruleJvmTypeReference ruleValidID ) ( '=' ruleXAnnotationElementValue )? ( ';' )? | ( ruleCommonModifier )* 'class' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference )? ( 'implements' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'interface' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'enum' ruleValidID '{' ( ruleXtendEnumLiteral ( ',' ruleXtendEnumLiteral )* )? ( ';' )? '}' | ( ruleCommonModifier )* 'annotation' ruleValidID '{' ( ruleAnnotationField )* '}' ) ;
    public final void ruleAnnotationField() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:53:21: ( ( ruleXAnnotation )* ( ( ( ruleCommonModifier )* ruleFieldModifier ( ruleCommonModifier )* ( ruleJvmTypeReference )? ruleValidID | ( ruleCommonModifier )* ruleJvmTypeReference ruleValidID ) ( '=' ruleXAnnotationElementValue )? ( ';' )? | ( ruleCommonModifier )* 'class' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference )? ( 'implements' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'interface' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'enum' ruleValidID '{' ( ruleXtendEnumLiteral ( ',' ruleXtendEnumLiteral )* )? ( ';' )? '}' | ( ruleCommonModifier )* 'annotation' ruleValidID '{' ( ruleAnnotationField )* '}' ) )
            // src/xtend/antlr3_2/Xtend.g:54:2: ( ruleXAnnotation )* ( ( ( ruleCommonModifier )* ruleFieldModifier ( ruleCommonModifier )* ( ruleJvmTypeReference )? ruleValidID | ( ruleCommonModifier )* ruleJvmTypeReference ruleValidID ) ( '=' ruleXAnnotationElementValue )? ( ';' )? | ( ruleCommonModifier )* 'class' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference )? ( 'implements' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'interface' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'enum' ruleValidID '{' ( ruleXtendEnumLiteral ( ',' ruleXtendEnumLiteral )* )? ( ';' )? '}' | ( ruleCommonModifier )* 'annotation' ruleValidID '{' ( ruleAnnotationField )* '}' )
            {
            // src/xtend/antlr3_2/Xtend.g:54:2: ( ruleXAnnotation )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==75) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // src/xtend/antlr3_2/Xtend.g:54:2: ruleXAnnotation
            	    {
            	    pushFollow(FOLLOW_ruleXAnnotation_in_ruleAnnotationField315);
            	    ruleXAnnotation();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // src/xtend/antlr3_2/Xtend.g:54:19: ( ( ( ruleCommonModifier )* ruleFieldModifier ( ruleCommonModifier )* ( ruleJvmTypeReference )? ruleValidID | ( ruleCommonModifier )* ruleJvmTypeReference ruleValidID ) ( '=' ruleXAnnotationElementValue )? ( ';' )? | ( ruleCommonModifier )* 'class' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference )? ( 'implements' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'interface' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'enum' ruleValidID '{' ( ruleXtendEnumLiteral ( ',' ruleXtendEnumLiteral )* )? ( ';' )? '}' | ( ruleCommonModifier )* 'annotation' ruleValidID '{' ( ruleAnnotationField )* '}' )
            int alt53=5;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:55:3: ( ( ruleCommonModifier )* ruleFieldModifier ( ruleCommonModifier )* ( ruleJvmTypeReference )? ruleValidID | ( ruleCommonModifier )* ruleJvmTypeReference ruleValidID ) ( '=' ruleXAnnotationElementValue )? ( ';' )?
                    {
                    // src/xtend/antlr3_2/Xtend.g:55:3: ( ( ruleCommonModifier )* ruleFieldModifier ( ruleCommonModifier )* ( ruleJvmTypeReference )? ruleValidID | ( ruleCommonModifier )* ruleJvmTypeReference ruleValidID )
                    int alt31=2;
                    alt31 = dfa31.predict(input);
                    switch (alt31) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:56:4: ( ruleCommonModifier )* ruleFieldModifier ( ruleCommonModifier )* ( ruleJvmTypeReference )? ruleValidID
                            {
                            // src/xtend/antlr3_2/Xtend.g:56:4: ( ruleCommonModifier )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==25||(LA27_0>=44 && LA27_0<=55)) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:56:4: ruleCommonModifier
                            	    {
                            	    pushFollow(FOLLOW_ruleCommonModifier_in_ruleAnnotationField327);
                            	    ruleCommonModifier();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop27;
                                }
                            } while (true);

                            pushFollow(FOLLOW_ruleFieldModifier_in_ruleAnnotationField330);
                            ruleFieldModifier();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:56:42: ( ruleCommonModifier )*
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==25||(LA28_0>=44 && LA28_0<=55)) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:56:42: ruleCommonModifier
                            	    {
                            	    pushFollow(FOLLOW_ruleCommonModifier_in_ruleAnnotationField332);
                            	    ruleCommonModifier();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop28;
                                }
                            } while (true);

                            // src/xtend/antlr3_2/Xtend.g:57:4: ( ruleJvmTypeReference )?
                            int alt29=2;
                            alt29 = dfa29.predict(input);
                            switch (alt29) {
                                case 1 :
                                    // src/xtend/antlr3_2/Xtend.g:57:4: ruleJvmTypeReference
                                    {
                                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleAnnotationField338);
                                    ruleJvmTypeReference();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_ruleValidID_in_ruleAnnotationField341);
                            ruleValidID();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // src/xtend/antlr3_2/Xtend.g:58:4: ( ruleCommonModifier )* ruleJvmTypeReference ruleValidID
                            {
                            // src/xtend/antlr3_2/Xtend.g:58:4: ( ruleCommonModifier )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==25||(LA30_0>=44 && LA30_0<=55)) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:58:4: ruleCommonModifier
                            	    {
                            	    pushFollow(FOLLOW_ruleCommonModifier_in_ruleAnnotationField348);
                            	    ruleCommonModifier();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop30;
                                }
                            } while (true);

                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleAnnotationField351);
                            ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return ;
                            pushFollow(FOLLOW_ruleValidID_in_ruleAnnotationField353);
                            ruleValidID();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    // src/xtend/antlr3_2/Xtend.g:59:5: ( '=' ruleXAnnotationElementValue )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==38) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:60:4: '=' ruleXAnnotationElementValue
                            {
                            match(input,38,FOLLOW_38_in_ruleAnnotationField364); if (state.failed) return ;
                            pushFollow(FOLLOW_ruleXAnnotationElementValue_in_ruleAnnotationField366);
                            ruleXAnnotationElementValue();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    // src/xtend/antlr3_2/Xtend.g:61:6: ( ';' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==26) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:61:6: ';'
                            {
                            match(input,26,FOLLOW_26_in_ruleAnnotationField373); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:62:3: ( ruleCommonModifier )* 'class' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference )? ( 'implements' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}'
                    {
                    // src/xtend/antlr3_2/Xtend.g:62:3: ( ruleCommonModifier )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==25||(LA34_0>=44 && LA34_0<=55)) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:62:3: ruleCommonModifier
                    	    {
                    	    pushFollow(FOLLOW_ruleCommonModifier_in_ruleAnnotationField380);
                    	    ruleCommonModifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    match(input,27,FOLLOW_27_in_ruleAnnotationField383); if (state.failed) return ;
                    pushFollow(FOLLOW_ruleValidID_in_ruleAnnotationField385);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:62:43: ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==28) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:63:4: '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>'
                            {
                            match(input,28,FOLLOW_28_in_ruleAnnotationField392); if (state.failed) return ;
                            pushFollow(FOLLOW_ruleJvmTypeParameter_in_ruleAnnotationField394);
                            ruleJvmTypeParameter();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:63:29: ( ',' ruleJvmTypeParameter )*
                            loop35:
                            do {
                                int alt35=2;
                                int LA35_0 = input.LA(1);

                                if ( (LA35_0==29) ) {
                                    alt35=1;
                                }


                                switch (alt35) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:64:5: ',' ruleJvmTypeParameter
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleAnnotationField402); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleJvmTypeParameter_in_ruleAnnotationField404);
                            	    ruleJvmTypeParameter();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop35;
                                }
                            } while (true);

                            match(input,30,FOLLOW_30_in_ruleAnnotationField412); if (state.failed) return ;

                            }
                            break;

                    }

                    // src/xtend/antlr3_2/Xtend.g:66:6: ( 'extends' ruleJvmParameterizedTypeReference )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==31) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:67:4: 'extends' ruleJvmParameterizedTypeReference
                            {
                            match(input,31,FOLLOW_31_in_ruleAnnotationField424); if (state.failed) return ;
                            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleAnnotationField426);
                            ruleJvmParameterizedTypeReference();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    // src/xtend/antlr3_2/Xtend.g:68:6: ( 'implements' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==32) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:69:4: 'implements' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )*
                            {
                            match(input,32,FOLLOW_32_in_ruleAnnotationField438); if (state.failed) return ;
                            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleAnnotationField440);
                            ruleJvmParameterizedTypeReference();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:69:51: ( ',' ruleJvmParameterizedTypeReference )*
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( (LA38_0==29) ) {
                                    alt38=1;
                                }


                                switch (alt38) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:70:5: ',' ruleJvmParameterizedTypeReference
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleAnnotationField448); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleAnnotationField450);
                            	    ruleJvmParameterizedTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop38;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,33,FOLLOW_33_in_ruleAnnotationField463); if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:72:10: ( ruleMember )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==RULE_ID||LA40_0==25||LA40_0==27||(LA40_0>=35 && LA40_0<=37)||(LA40_0>=39 && LA40_0<=40)||(LA40_0>=43 && LA40_0<=60)||(LA40_0>=62 && LA40_0<=64)||LA40_0==75||LA40_0==95) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:72:10: ruleMember
                    	    {
                    	    pushFollow(FOLLOW_ruleMember_in_ruleAnnotationField465);
                    	    ruleMember();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    match(input,34,FOLLOW_34_in_ruleAnnotationField468); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/xtend/antlr3_2/Xtend.g:73:3: ( ruleCommonModifier )* 'interface' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}'
                    {
                    // src/xtend/antlr3_2/Xtend.g:73:3: ( ruleCommonModifier )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==25||(LA41_0>=44 && LA41_0<=55)) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:73:3: ruleCommonModifier
                    	    {
                    	    pushFollow(FOLLOW_ruleCommonModifier_in_ruleAnnotationField474);
                    	    ruleCommonModifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    match(input,35,FOLLOW_35_in_ruleAnnotationField477); if (state.failed) return ;
                    pushFollow(FOLLOW_ruleValidID_in_ruleAnnotationField479);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:73:47: ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==28) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:74:4: '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>'
                            {
                            match(input,28,FOLLOW_28_in_ruleAnnotationField486); if (state.failed) return ;
                            pushFollow(FOLLOW_ruleJvmTypeParameter_in_ruleAnnotationField488);
                            ruleJvmTypeParameter();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:74:29: ( ',' ruleJvmTypeParameter )*
                            loop42:
                            do {
                                int alt42=2;
                                int LA42_0 = input.LA(1);

                                if ( (LA42_0==29) ) {
                                    alt42=1;
                                }


                                switch (alt42) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:75:5: ',' ruleJvmTypeParameter
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleAnnotationField496); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleJvmTypeParameter_in_ruleAnnotationField498);
                            	    ruleJvmTypeParameter();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop42;
                                }
                            } while (true);

                            match(input,30,FOLLOW_30_in_ruleAnnotationField506); if (state.failed) return ;

                            }
                            break;

                    }

                    // src/xtend/antlr3_2/Xtend.g:77:6: ( 'extends' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==31) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:78:4: 'extends' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )*
                            {
                            match(input,31,FOLLOW_31_in_ruleAnnotationField518); if (state.failed) return ;
                            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleAnnotationField520);
                            ruleJvmParameterizedTypeReference();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:78:48: ( ',' ruleJvmParameterizedTypeReference )*
                            loop44:
                            do {
                                int alt44=2;
                                int LA44_0 = input.LA(1);

                                if ( (LA44_0==29) ) {
                                    alt44=1;
                                }


                                switch (alt44) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:79:5: ',' ruleJvmParameterizedTypeReference
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleAnnotationField528); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleAnnotationField530);
                            	    ruleJvmParameterizedTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop44;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,33,FOLLOW_33_in_ruleAnnotationField543); if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:81:10: ( ruleMember )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==RULE_ID||LA46_0==25||LA46_0==27||(LA46_0>=35 && LA46_0<=37)||(LA46_0>=39 && LA46_0<=40)||(LA46_0>=43 && LA46_0<=60)||(LA46_0>=62 && LA46_0<=64)||LA46_0==75||LA46_0==95) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:81:10: ruleMember
                    	    {
                    	    pushFollow(FOLLOW_ruleMember_in_ruleAnnotationField545);
                    	    ruleMember();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    match(input,34,FOLLOW_34_in_ruleAnnotationField548); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/xtend/antlr3_2/Xtend.g:82:3: ( ruleCommonModifier )* 'enum' ruleValidID '{' ( ruleXtendEnumLiteral ( ',' ruleXtendEnumLiteral )* )? ( ';' )? '}'
                    {
                    // src/xtend/antlr3_2/Xtend.g:82:3: ( ruleCommonModifier )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==25||(LA47_0>=44 && LA47_0<=55)) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:82:3: ruleCommonModifier
                    	    {
                    	    pushFollow(FOLLOW_ruleCommonModifier_in_ruleAnnotationField554);
                    	    ruleCommonModifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    match(input,36,FOLLOW_36_in_ruleAnnotationField557); if (state.failed) return ;
                    pushFollow(FOLLOW_ruleValidID_in_ruleAnnotationField559);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,33,FOLLOW_33_in_ruleAnnotationField561); if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:82:46: ( ruleXtendEnumLiteral ( ',' ruleXtendEnumLiteral )* )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==RULE_ID||LA49_0==37||LA49_0==60||(LA49_0>=62 && LA49_0<=64)) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:83:4: ruleXtendEnumLiteral ( ',' ruleXtendEnumLiteral )*
                            {
                            pushFollow(FOLLOW_ruleXtendEnumLiteral_in_ruleAnnotationField568);
                            ruleXtendEnumLiteral();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:83:25: ( ',' ruleXtendEnumLiteral )*
                            loop48:
                            do {
                                int alt48=2;
                                int LA48_0 = input.LA(1);

                                if ( (LA48_0==29) ) {
                                    alt48=1;
                                }


                                switch (alt48) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:84:5: ',' ruleXtendEnumLiteral
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleAnnotationField576); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleXtendEnumLiteral_in_ruleAnnotationField578);
                            	    ruleXtendEnumLiteral();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop48;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // src/xtend/antlr3_2/Xtend.g:86:6: ( ';' )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==26) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:86:6: ';'
                            {
                            match(input,26,FOLLOW_26_in_ruleAnnotationField591); if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,34,FOLLOW_34_in_ruleAnnotationField594); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/xtend/antlr3_2/Xtend.g:87:3: ( ruleCommonModifier )* 'annotation' ruleValidID '{' ( ruleAnnotationField )* '}'
                    {
                    // src/xtend/antlr3_2/Xtend.g:87:3: ( ruleCommonModifier )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==25||(LA51_0>=44 && LA51_0<=55)) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:87:3: ruleCommonModifier
                    	    {
                    	    pushFollow(FOLLOW_ruleCommonModifier_in_ruleAnnotationField600);
                    	    ruleCommonModifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    match(input,37,FOLLOW_37_in_ruleAnnotationField603); if (state.failed) return ;
                    pushFollow(FOLLOW_ruleValidID_in_ruleAnnotationField605);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,33,FOLLOW_33_in_ruleAnnotationField607); if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:87:52: ( ruleAnnotationField )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==RULE_ID||LA52_0==25||LA52_0==27||(LA52_0>=35 && LA52_0<=37)||LA52_0==40||(LA52_0>=44 && LA52_0<=57)||LA52_0==60||(LA52_0>=62 && LA52_0<=64)||LA52_0==75||LA52_0==95) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:87:52: ruleAnnotationField
                    	    {
                    	    pushFollow(FOLLOW_ruleAnnotationField_in_ruleAnnotationField609);
                    	    ruleAnnotationField();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    match(input,34,FOLLOW_34_in_ruleAnnotationField612); if (state.failed) return ;

                    }
                    break;

            }


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
    // $ANTLR end "ruleAnnotationField"


    // $ANTLR start "ruleMember"
    // src/xtend/antlr3_2/Xtend.g:92:1: ruleMember : ( ruleXAnnotation )* ( ( ruleCommonModifier )* ( ruleFieldModifier ( ruleCommonModifier )* ( ruleJvmTypeReference )? ruleValidID | 'extension' ( ruleFieldModifier | ruleCommonModifier )* ruleJvmTypeReference ( ruleValidID )? | ruleFieldModifier ( ruleCommonModifier )* 'extension' ( ruleCommonModifier )* ruleJvmTypeReference ( ruleValidID )? | ruleJvmTypeReference ruleValidID ) ( '=' ruleXExpression )? ( ';' )? | ( ruleCommonModifier )* ruleMethodModifier ( ruleCommonModifier | ruleMethodModifier )* ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( ( ( ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '(' )=> ( ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '(' ) ) | ( ( ruleJvmTypeReference ruleFunctionID '(' )=> ( ruleJvmTypeReference ruleFunctionID '(' ) ) | ( ( ruleTypeReferenceNoTypeArgs ruleFunctionID '(' )=> ( ruleTypeReferenceNoTypeArgs ruleFunctionID '(' ) ) | ( ( ruleCreateExtensionInfo ruleValidID '(' )=> ( ruleCreateExtensionInfo ruleValidID '(' ) ) | ruleFunctionID '(' ) ( ruleParameter ( ',' ruleParameter )* )? ')' ( 'throws' ruleJvmTypeReference ( ',' ruleJvmTypeReference )* )? ( ruleXBlockExpression | ruleRichString | ';' )? | ( ruleCommonModifier )* 'new' ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? '(' ( ruleParameter ( ',' ruleParameter )* )? ')' ( 'throws' ruleJvmTypeReference ( ',' ruleJvmTypeReference )* )? ruleXBlockExpression | ( ruleCommonModifier )* 'class' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference )? ( 'implements' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'interface' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'enum' ruleValidID '{' ( ruleXtendEnumLiteral ( ',' ruleXtendEnumLiteral )* )? ( ';' )? '}' | ( ruleCommonModifier )* 'annotation' ruleValidID '{' ( ruleAnnotationField )* '}' ) ;
    public final void ruleMember() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:92:12: ( ( ruleXAnnotation )* ( ( ruleCommonModifier )* ( ruleFieldModifier ( ruleCommonModifier )* ( ruleJvmTypeReference )? ruleValidID | 'extension' ( ruleFieldModifier | ruleCommonModifier )* ruleJvmTypeReference ( ruleValidID )? | ruleFieldModifier ( ruleCommonModifier )* 'extension' ( ruleCommonModifier )* ruleJvmTypeReference ( ruleValidID )? | ruleJvmTypeReference ruleValidID ) ( '=' ruleXExpression )? ( ';' )? | ( ruleCommonModifier )* ruleMethodModifier ( ruleCommonModifier | ruleMethodModifier )* ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( ( ( ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '(' )=> ( ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '(' ) ) | ( ( ruleJvmTypeReference ruleFunctionID '(' )=> ( ruleJvmTypeReference ruleFunctionID '(' ) ) | ( ( ruleTypeReferenceNoTypeArgs ruleFunctionID '(' )=> ( ruleTypeReferenceNoTypeArgs ruleFunctionID '(' ) ) | ( ( ruleCreateExtensionInfo ruleValidID '(' )=> ( ruleCreateExtensionInfo ruleValidID '(' ) ) | ruleFunctionID '(' ) ( ruleParameter ( ',' ruleParameter )* )? ')' ( 'throws' ruleJvmTypeReference ( ',' ruleJvmTypeReference )* )? ( ruleXBlockExpression | ruleRichString | ';' )? | ( ruleCommonModifier )* 'new' ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? '(' ( ruleParameter ( ',' ruleParameter )* )? ')' ( 'throws' ruleJvmTypeReference ( ',' ruleJvmTypeReference )* )? ruleXBlockExpression | ( ruleCommonModifier )* 'class' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference )? ( 'implements' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'interface' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'enum' ruleValidID '{' ( ruleXtendEnumLiteral ( ',' ruleXtendEnumLiteral )* )? ( ';' )? '}' | ( ruleCommonModifier )* 'annotation' ruleValidID '{' ( ruleAnnotationField )* '}' ) )
            // src/xtend/antlr3_2/Xtend.g:93:2: ( ruleXAnnotation )* ( ( ruleCommonModifier )* ( ruleFieldModifier ( ruleCommonModifier )* ( ruleJvmTypeReference )? ruleValidID | 'extension' ( ruleFieldModifier | ruleCommonModifier )* ruleJvmTypeReference ( ruleValidID )? | ruleFieldModifier ( ruleCommonModifier )* 'extension' ( ruleCommonModifier )* ruleJvmTypeReference ( ruleValidID )? | ruleJvmTypeReference ruleValidID ) ( '=' ruleXExpression )? ( ';' )? | ( ruleCommonModifier )* ruleMethodModifier ( ruleCommonModifier | ruleMethodModifier )* ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( ( ( ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '(' )=> ( ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '(' ) ) | ( ( ruleJvmTypeReference ruleFunctionID '(' )=> ( ruleJvmTypeReference ruleFunctionID '(' ) ) | ( ( ruleTypeReferenceNoTypeArgs ruleFunctionID '(' )=> ( ruleTypeReferenceNoTypeArgs ruleFunctionID '(' ) ) | ( ( ruleCreateExtensionInfo ruleValidID '(' )=> ( ruleCreateExtensionInfo ruleValidID '(' ) ) | ruleFunctionID '(' ) ( ruleParameter ( ',' ruleParameter )* )? ')' ( 'throws' ruleJvmTypeReference ( ',' ruleJvmTypeReference )* )? ( ruleXBlockExpression | ruleRichString | ';' )? | ( ruleCommonModifier )* 'new' ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? '(' ( ruleParameter ( ',' ruleParameter )* )? ')' ( 'throws' ruleJvmTypeReference ( ',' ruleJvmTypeReference )* )? ruleXBlockExpression | ( ruleCommonModifier )* 'class' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference )? ( 'implements' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'interface' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'enum' ruleValidID '{' ( ruleXtendEnumLiteral ( ',' ruleXtendEnumLiteral )* )? ( ';' )? '}' | ( ruleCommonModifier )* 'annotation' ruleValidID '{' ( ruleAnnotationField )* '}' )
            {
            // src/xtend/antlr3_2/Xtend.g:93:2: ( ruleXAnnotation )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==75) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // src/xtend/antlr3_2/Xtend.g:93:2: ruleXAnnotation
            	    {
            	    pushFollow(FOLLOW_ruleXAnnotation_in_ruleMember626);
            	    ruleXAnnotation();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            // src/xtend/antlr3_2/Xtend.g:93:19: ( ( ruleCommonModifier )* ( ruleFieldModifier ( ruleCommonModifier )* ( ruleJvmTypeReference )? ruleValidID | 'extension' ( ruleFieldModifier | ruleCommonModifier )* ruleJvmTypeReference ( ruleValidID )? | ruleFieldModifier ( ruleCommonModifier )* 'extension' ( ruleCommonModifier )* ruleJvmTypeReference ( ruleValidID )? | ruleJvmTypeReference ruleValidID ) ( '=' ruleXExpression )? ( ';' )? | ( ruleCommonModifier )* ruleMethodModifier ( ruleCommonModifier | ruleMethodModifier )* ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( ( ( ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '(' )=> ( ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '(' ) ) | ( ( ruleJvmTypeReference ruleFunctionID '(' )=> ( ruleJvmTypeReference ruleFunctionID '(' ) ) | ( ( ruleTypeReferenceNoTypeArgs ruleFunctionID '(' )=> ( ruleTypeReferenceNoTypeArgs ruleFunctionID '(' ) ) | ( ( ruleCreateExtensionInfo ruleValidID '(' )=> ( ruleCreateExtensionInfo ruleValidID '(' ) ) | ruleFunctionID '(' ) ( ruleParameter ( ',' ruleParameter )* )? ')' ( 'throws' ruleJvmTypeReference ( ',' ruleJvmTypeReference )* )? ( ruleXBlockExpression | ruleRichString | ';' )? | ( ruleCommonModifier )* 'new' ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? '(' ( ruleParameter ( ',' ruleParameter )* )? ')' ( 'throws' ruleJvmTypeReference ( ',' ruleJvmTypeReference )* )? ruleXBlockExpression | ( ruleCommonModifier )* 'class' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference )? ( 'implements' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'interface' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'enum' ruleValidID '{' ( ruleXtendEnumLiteral ( ',' ruleXtendEnumLiteral )* )? ( ';' )? '}' | ( ruleCommonModifier )* 'annotation' ruleValidID '{' ( ruleAnnotationField )* '}' )
            int alt102=7;
            alt102 = dfa102.predict(input);
            switch (alt102) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:94:3: ( ruleCommonModifier )* ( ruleFieldModifier ( ruleCommonModifier )* ( ruleJvmTypeReference )? ruleValidID | 'extension' ( ruleFieldModifier | ruleCommonModifier )* ruleJvmTypeReference ( ruleValidID )? | ruleFieldModifier ( ruleCommonModifier )* 'extension' ( ruleCommonModifier )* ruleJvmTypeReference ( ruleValidID )? | ruleJvmTypeReference ruleValidID ) ( '=' ruleXExpression )? ( ';' )?
                    {
                    // src/xtend/antlr3_2/Xtend.g:94:3: ( ruleCommonModifier )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==25||(LA55_0>=44 && LA55_0<=55)) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:94:3: ruleCommonModifier
                    	    {
                    	    pushFollow(FOLLOW_ruleCommonModifier_in_ruleMember633);
                    	    ruleCommonModifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    // src/xtend/antlr3_2/Xtend.g:94:23: ( ruleFieldModifier ( ruleCommonModifier )* ( ruleJvmTypeReference )? ruleValidID | 'extension' ( ruleFieldModifier | ruleCommonModifier )* ruleJvmTypeReference ( ruleValidID )? | ruleFieldModifier ( ruleCommonModifier )* 'extension' ( ruleCommonModifier )* ruleJvmTypeReference ( ruleValidID )? | ruleJvmTypeReference ruleValidID )
                    int alt63=4;
                    alt63 = dfa63.predict(input);
                    switch (alt63) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:95:4: ruleFieldModifier ( ruleCommonModifier )* ( ruleJvmTypeReference )? ruleValidID
                            {
                            pushFollow(FOLLOW_ruleFieldModifier_in_ruleMember641);
                            ruleFieldModifier();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:95:22: ( ruleCommonModifier )*
                            loop56:
                            do {
                                int alt56=2;
                                int LA56_0 = input.LA(1);

                                if ( (LA56_0==25||(LA56_0>=44 && LA56_0<=55)) ) {
                                    alt56=1;
                                }


                                switch (alt56) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:95:22: ruleCommonModifier
                            	    {
                            	    pushFollow(FOLLOW_ruleCommonModifier_in_ruleMember643);
                            	    ruleCommonModifier();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop56;
                                }
                            } while (true);

                            // src/xtend/antlr3_2/Xtend.g:95:42: ( ruleJvmTypeReference )?
                            int alt57=2;
                            alt57 = dfa57.predict(input);
                            switch (alt57) {
                                case 1 :
                                    // src/xtend/antlr3_2/Xtend.g:95:42: ruleJvmTypeReference
                                    {
                                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleMember646);
                                    ruleJvmTypeReference();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_ruleValidID_in_ruleMember649);
                            ruleValidID();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // src/xtend/antlr3_2/Xtend.g:96:4: 'extension' ( ruleFieldModifier | ruleCommonModifier )* ruleJvmTypeReference ( ruleValidID )?
                            {
                            match(input,39,FOLLOW_39_in_ruleMember656); if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:96:16: ( ruleFieldModifier | ruleCommonModifier )*
                            loop58:
                            do {
                                int alt58=3;
                                int LA58_0 = input.LA(1);

                                if ( ((LA58_0>=56 && LA58_0<=57)) ) {
                                    alt58=1;
                                }
                                else if ( (LA58_0==25||(LA58_0>=44 && LA58_0<=55)) ) {
                                    alt58=2;
                                }


                                switch (alt58) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:97:5: ruleFieldModifier
                            	    {
                            	    pushFollow(FOLLOW_ruleFieldModifier_in_ruleMember664);
                            	    ruleFieldModifier();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;
                            	case 2 :
                            	    // src/xtend/antlr3_2/Xtend.g:98:5: ruleCommonModifier
                            	    {
                            	    pushFollow(FOLLOW_ruleCommonModifier_in_ruleMember672);
                            	    ruleCommonModifier();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop58;
                                }
                            } while (true);

                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleMember680);
                            ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:99:28: ( ruleValidID )?
                            int alt59=2;
                            alt59 = dfa59.predict(input);
                            switch (alt59) {
                                case 1 :
                                    // src/xtend/antlr3_2/Xtend.g:99:28: ruleValidID
                                    {
                                    pushFollow(FOLLOW_ruleValidID_in_ruleMember682);
                                    ruleValidID();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 3 :
                            // src/xtend/antlr3_2/Xtend.g:100:4: ruleFieldModifier ( ruleCommonModifier )* 'extension' ( ruleCommonModifier )* ruleJvmTypeReference ( ruleValidID )?
                            {
                            pushFollow(FOLLOW_ruleFieldModifier_in_ruleMember690);
                            ruleFieldModifier();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:100:22: ( ruleCommonModifier )*
                            loop60:
                            do {
                                int alt60=2;
                                int LA60_0 = input.LA(1);

                                if ( (LA60_0==25||(LA60_0>=44 && LA60_0<=55)) ) {
                                    alt60=1;
                                }


                                switch (alt60) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:100:22: ruleCommonModifier
                            	    {
                            	    pushFollow(FOLLOW_ruleCommonModifier_in_ruleMember692);
                            	    ruleCommonModifier();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop60;
                                }
                            } while (true);

                            match(input,39,FOLLOW_39_in_ruleMember695); if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:100:54: ( ruleCommonModifier )*
                            loop61:
                            do {
                                int alt61=2;
                                int LA61_0 = input.LA(1);

                                if ( (LA61_0==25||(LA61_0>=44 && LA61_0<=55)) ) {
                                    alt61=1;
                                }


                                switch (alt61) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:100:54: ruleCommonModifier
                            	    {
                            	    pushFollow(FOLLOW_ruleCommonModifier_in_ruleMember697);
                            	    ruleCommonModifier();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop61;
                                }
                            } while (true);

                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleMember703);
                            ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:101:25: ( ruleValidID )?
                            int alt62=2;
                            alt62 = dfa62.predict(input);
                            switch (alt62) {
                                case 1 :
                                    // src/xtend/antlr3_2/Xtend.g:101:25: ruleValidID
                                    {
                                    pushFollow(FOLLOW_ruleValidID_in_ruleMember705);
                                    ruleValidID();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 4 :
                            // src/xtend/antlr3_2/Xtend.g:102:4: ruleJvmTypeReference ruleValidID
                            {
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleMember713);
                            ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return ;
                            pushFollow(FOLLOW_ruleValidID_in_ruleMember715);
                            ruleValidID();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    // src/xtend/antlr3_2/Xtend.g:103:5: ( '=' ruleXExpression )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==38) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:104:4: '=' ruleXExpression
                            {
                            match(input,38,FOLLOW_38_in_ruleMember726); if (state.failed) return ;
                            pushFollow(FOLLOW_ruleXExpression_in_ruleMember728);
                            ruleXExpression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    // src/xtend/antlr3_2/Xtend.g:105:6: ( ';' )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==26) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:105:6: ';'
                            {
                            match(input,26,FOLLOW_26_in_ruleMember735); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:106:3: ( ruleCommonModifier )* ruleMethodModifier ( ruleCommonModifier | ruleMethodModifier )* ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( ( ( ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '(' )=> ( ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '(' ) ) | ( ( ruleJvmTypeReference ruleFunctionID '(' )=> ( ruleJvmTypeReference ruleFunctionID '(' ) ) | ( ( ruleTypeReferenceNoTypeArgs ruleFunctionID '(' )=> ( ruleTypeReferenceNoTypeArgs ruleFunctionID '(' ) ) | ( ( ruleCreateExtensionInfo ruleValidID '(' )=> ( ruleCreateExtensionInfo ruleValidID '(' ) ) | ruleFunctionID '(' ) ( ruleParameter ( ',' ruleParameter )* )? ')' ( 'throws' ruleJvmTypeReference ( ',' ruleJvmTypeReference )* )? ( ruleXBlockExpression | ruleRichString | ';' )?
                    {
                    // src/xtend/antlr3_2/Xtend.g:106:3: ( ruleCommonModifier )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==25||(LA66_0>=44 && LA66_0<=55)) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:106:3: ruleCommonModifier
                    	    {
                    	    pushFollow(FOLLOW_ruleCommonModifier_in_ruleMember742);
                    	    ruleCommonModifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);

                    pushFollow(FOLLOW_ruleMethodModifier_in_ruleMember745);
                    ruleMethodModifier();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:106:42: ( ruleCommonModifier | ruleMethodModifier )*
                    loop67:
                    do {
                        int alt67=3;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==25||(LA67_0>=44 && LA67_0<=55)) ) {
                            alt67=1;
                        }
                        else if ( ((LA67_0>=58 && LA67_0<=59)) ) {
                            alt67=2;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:107:4: ruleCommonModifier
                    	    {
                    	    pushFollow(FOLLOW_ruleCommonModifier_in_ruleMember752);
                    	    ruleCommonModifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // src/xtend/antlr3_2/Xtend.g:108:4: ruleMethodModifier
                    	    {
                    	    pushFollow(FOLLOW_ruleMethodModifier_in_ruleMember759);
                    	    ruleMethodModifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    // src/xtend/antlr3_2/Xtend.g:109:6: ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==28) ) {
                        int LA69_1 = input.LA(2);

                        if ( (LA69_1==RULE_ID||LA69_1==37||LA69_1==60||(LA69_1>=62 && LA69_1<=64)) ) {
                            alt69=1;
                        }
                    }
                    switch (alt69) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:110:4: '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>'
                            {
                            match(input,28,FOLLOW_28_in_ruleMember771); if (state.failed) return ;
                            pushFollow(FOLLOW_ruleJvmTypeParameter_in_ruleMember773);
                            ruleJvmTypeParameter();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:110:29: ( ',' ruleJvmTypeParameter )*
                            loop68:
                            do {
                                int alt68=2;
                                int LA68_0 = input.LA(1);

                                if ( (LA68_0==29) ) {
                                    alt68=1;
                                }


                                switch (alt68) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:111:5: ',' ruleJvmTypeParameter
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleMember781); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleJvmTypeParameter_in_ruleMember783);
                            	    ruleJvmTypeParameter();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop68;
                                }
                            } while (true);

                            match(input,30,FOLLOW_30_in_ruleMember791); if (state.failed) return ;

                            }
                            break;

                    }

                    // src/xtend/antlr3_2/Xtend.g:113:6: ( ( ( ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '(' )=> ( ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '(' ) ) | ( ( ruleJvmTypeReference ruleFunctionID '(' )=> ( ruleJvmTypeReference ruleFunctionID '(' ) ) | ( ( ruleTypeReferenceNoTypeArgs ruleFunctionID '(' )=> ( ruleTypeReferenceNoTypeArgs ruleFunctionID '(' ) ) | ( ( ruleCreateExtensionInfo ruleValidID '(' )=> ( ruleCreateExtensionInfo ruleValidID '(' ) ) | ruleFunctionID '(' )
                    int alt70=5;
                    alt70 = dfa70.predict(input);
                    switch (alt70) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:114:4: ( ( ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '(' )=> ( ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '(' ) )
                            {
                            // src/xtend/antlr3_2/Xtend.g:114:4: ( ( ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '(' )=> ( ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '(' ) )
                            // src/xtend/antlr3_2/Xtend.g:114:6: ( ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '(' )=> ( ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '(' )
                            {
                            // src/xtend/antlr3_2/Xtend.g:116:9: ( ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '(' )
                            // src/xtend/antlr3_2/Xtend.g:117:5: ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '('
                            {
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleMember831);
                            ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return ;
                            pushFollow(FOLLOW_ruleCreateExtensionInfo_in_ruleMember833);
                            ruleCreateExtensionInfo();

                            state._fsp--;
                            if (state.failed) return ;
                            pushFollow(FOLLOW_ruleValidID_in_ruleMember835);
                            ruleValidID();

                            state._fsp--;
                            if (state.failed) return ;
                            match(input,40,FOLLOW_40_in_ruleMember837); if (state.failed) return ;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // src/xtend/antlr3_2/Xtend.g:119:4: ( ( ruleJvmTypeReference ruleFunctionID '(' )=> ( ruleJvmTypeReference ruleFunctionID '(' ) )
                            {
                            // src/xtend/antlr3_2/Xtend.g:119:4: ( ( ruleJvmTypeReference ruleFunctionID '(' )=> ( ruleJvmTypeReference ruleFunctionID '(' ) )
                            // src/xtend/antlr3_2/Xtend.g:119:6: ( ruleJvmTypeReference ruleFunctionID '(' )=> ( ruleJvmTypeReference ruleFunctionID '(' )
                            {
                            // src/xtend/antlr3_2/Xtend.g:121:9: ( ruleJvmTypeReference ruleFunctionID '(' )
                            // src/xtend/antlr3_2/Xtend.g:122:5: ruleJvmTypeReference ruleFunctionID '('
                            {
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleMember877);
                            ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return ;
                            pushFollow(FOLLOW_ruleFunctionID_in_ruleMember879);
                            ruleFunctionID();

                            state._fsp--;
                            if (state.failed) return ;
                            match(input,40,FOLLOW_40_in_ruleMember881); if (state.failed) return ;

                            }


                            }


                            }
                            break;
                        case 3 :
                            // src/xtend/antlr3_2/Xtend.g:124:4: ( ( ruleTypeReferenceNoTypeArgs ruleFunctionID '(' )=> ( ruleTypeReferenceNoTypeArgs ruleFunctionID '(' ) )
                            {
                            // src/xtend/antlr3_2/Xtend.g:124:4: ( ( ruleTypeReferenceNoTypeArgs ruleFunctionID '(' )=> ( ruleTypeReferenceNoTypeArgs ruleFunctionID '(' ) )
                            // src/xtend/antlr3_2/Xtend.g:124:6: ( ruleTypeReferenceNoTypeArgs ruleFunctionID '(' )=> ( ruleTypeReferenceNoTypeArgs ruleFunctionID '(' )
                            {
                            // src/xtend/antlr3_2/Xtend.g:126:9: ( ruleTypeReferenceNoTypeArgs ruleFunctionID '(' )
                            // src/xtend/antlr3_2/Xtend.g:127:5: ruleTypeReferenceNoTypeArgs ruleFunctionID '('
                            {
                            pushFollow(FOLLOW_ruleTypeReferenceNoTypeArgs_in_ruleMember921);
                            ruleTypeReferenceNoTypeArgs();

                            state._fsp--;
                            if (state.failed) return ;
                            pushFollow(FOLLOW_ruleFunctionID_in_ruleMember923);
                            ruleFunctionID();

                            state._fsp--;
                            if (state.failed) return ;
                            match(input,40,FOLLOW_40_in_ruleMember925); if (state.failed) return ;

                            }


                            }


                            }
                            break;
                        case 4 :
                            // src/xtend/antlr3_2/Xtend.g:129:4: ( ( ruleCreateExtensionInfo ruleValidID '(' )=> ( ruleCreateExtensionInfo ruleValidID '(' ) )
                            {
                            // src/xtend/antlr3_2/Xtend.g:129:4: ( ( ruleCreateExtensionInfo ruleValidID '(' )=> ( ruleCreateExtensionInfo ruleValidID '(' ) )
                            // src/xtend/antlr3_2/Xtend.g:129:6: ( ruleCreateExtensionInfo ruleValidID '(' )=> ( ruleCreateExtensionInfo ruleValidID '(' )
                            {
                            // src/xtend/antlr3_2/Xtend.g:131:9: ( ruleCreateExtensionInfo ruleValidID '(' )
                            // src/xtend/antlr3_2/Xtend.g:132:5: ruleCreateExtensionInfo ruleValidID '('
                            {
                            pushFollow(FOLLOW_ruleCreateExtensionInfo_in_ruleMember965);
                            ruleCreateExtensionInfo();

                            state._fsp--;
                            if (state.failed) return ;
                            pushFollow(FOLLOW_ruleValidID_in_ruleMember967);
                            ruleValidID();

                            state._fsp--;
                            if (state.failed) return ;
                            match(input,40,FOLLOW_40_in_ruleMember969); if (state.failed) return ;

                            }


                            }


                            }
                            break;
                        case 5 :
                            // src/xtend/antlr3_2/Xtend.g:134:4: ruleFunctionID '('
                            {
                            pushFollow(FOLLOW_ruleFunctionID_in_ruleMember983);
                            ruleFunctionID();

                            state._fsp--;
                            if (state.failed) return ;
                            match(input,40,FOLLOW_40_in_ruleMember985); if (state.failed) return ;

                            }
                            break;

                    }

                    // src/xtend/antlr3_2/Xtend.g:135:5: ( ruleParameter ( ',' ruleParameter )* )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==RULE_ID||LA72_0==37||(LA72_0>=39 && LA72_0<=40)||LA72_0==60||(LA72_0>=62 && LA72_0<=64)||LA72_0==75||LA72_0==95) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:136:4: ruleParameter ( ',' ruleParameter )*
                            {
                            pushFollow(FOLLOW_ruleParameter_in_ruleMember996);
                            ruleParameter();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:136:18: ( ',' ruleParameter )*
                            loop71:
                            do {
                                int alt71=2;
                                int LA71_0 = input.LA(1);

                                if ( (LA71_0==29) ) {
                                    alt71=1;
                                }


                                switch (alt71) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:137:5: ',' ruleParameter
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleMember1004); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleMember1006);
                            	    ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop71;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,41,FOLLOW_41_in_ruleMember1019); if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:139:10: ( 'throws' ruleJvmTypeReference ( ',' ruleJvmTypeReference )* )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==42) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:140:4: 'throws' ruleJvmTypeReference ( ',' ruleJvmTypeReference )*
                            {
                            match(input,42,FOLLOW_42_in_ruleMember1026); if (state.failed) return ;
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleMember1028);
                            ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:140:34: ( ',' ruleJvmTypeReference )*
                            loop73:
                            do {
                                int alt73=2;
                                int LA73_0 = input.LA(1);

                                if ( (LA73_0==29) ) {
                                    alt73=1;
                                }


                                switch (alt73) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:141:5: ',' ruleJvmTypeReference
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleMember1036); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleMember1038);
                            	    ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop73;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // src/xtend/antlr3_2/Xtend.g:143:6: ( ruleXBlockExpression | ruleRichString | ';' )?
                    int alt75=4;
                    switch ( input.LA(1) ) {
                        case 33:
                            {
                            alt75=1;
                            }
                            break;
                        case RULE_RICH_TEXT:
                        case RULE_RICH_TEXT_START:
                            {
                            alt75=2;
                            }
                            break;
                        case 26:
                            {
                            alt75=3;
                            }
                            break;
                    }

                    switch (alt75) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:144:4: ruleXBlockExpression
                            {
                            pushFollow(FOLLOW_ruleXBlockExpression_in_ruleMember1056);
                            ruleXBlockExpression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // src/xtend/antlr3_2/Xtend.g:145:4: ruleRichString
                            {
                            pushFollow(FOLLOW_ruleRichString_in_ruleMember1063);
                            ruleRichString();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            // src/xtend/antlr3_2/Xtend.g:146:4: ';'
                            {
                            match(input,26,FOLLOW_26_in_ruleMember1070); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // src/xtend/antlr3_2/Xtend.g:148:3: ( ruleCommonModifier )* 'new' ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? '(' ( ruleParameter ( ',' ruleParameter )* )? ')' ( 'throws' ruleJvmTypeReference ( ',' ruleJvmTypeReference )* )? ruleXBlockExpression
                    {
                    // src/xtend/antlr3_2/Xtend.g:148:3: ( ruleCommonModifier )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==25||(LA76_0>=44 && LA76_0<=55)) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:148:3: ruleCommonModifier
                    	    {
                    	    pushFollow(FOLLOW_ruleCommonModifier_in_ruleMember1081);
                    	    ruleCommonModifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    match(input,43,FOLLOW_43_in_ruleMember1084); if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:148:29: ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==28) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:149:4: '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>'
                            {
                            match(input,28,FOLLOW_28_in_ruleMember1091); if (state.failed) return ;
                            pushFollow(FOLLOW_ruleJvmTypeParameter_in_ruleMember1093);
                            ruleJvmTypeParameter();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:149:29: ( ',' ruleJvmTypeParameter )*
                            loop77:
                            do {
                                int alt77=2;
                                int LA77_0 = input.LA(1);

                                if ( (LA77_0==29) ) {
                                    alt77=1;
                                }


                                switch (alt77) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:150:5: ',' ruleJvmTypeParameter
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleMember1101); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleJvmTypeParameter_in_ruleMember1103);
                            	    ruleJvmTypeParameter();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop77;
                                }
                            } while (true);

                            match(input,30,FOLLOW_30_in_ruleMember1111); if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,40,FOLLOW_40_in_ruleMember1118); if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:152:10: ( ruleParameter ( ',' ruleParameter )* )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==RULE_ID||LA80_0==37||(LA80_0>=39 && LA80_0<=40)||LA80_0==60||(LA80_0>=62 && LA80_0<=64)||LA80_0==75||LA80_0==95) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:153:4: ruleParameter ( ',' ruleParameter )*
                            {
                            pushFollow(FOLLOW_ruleParameter_in_ruleMember1125);
                            ruleParameter();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:153:18: ( ',' ruleParameter )*
                            loop79:
                            do {
                                int alt79=2;
                                int LA79_0 = input.LA(1);

                                if ( (LA79_0==29) ) {
                                    alt79=1;
                                }


                                switch (alt79) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:154:5: ',' ruleParameter
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleMember1133); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleMember1135);
                            	    ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop79;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,41,FOLLOW_41_in_ruleMember1148); if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:156:10: ( 'throws' ruleJvmTypeReference ( ',' ruleJvmTypeReference )* )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==42) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:157:4: 'throws' ruleJvmTypeReference ( ',' ruleJvmTypeReference )*
                            {
                            match(input,42,FOLLOW_42_in_ruleMember1155); if (state.failed) return ;
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleMember1157);
                            ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:157:34: ( ',' ruleJvmTypeReference )*
                            loop81:
                            do {
                                int alt81=2;
                                int LA81_0 = input.LA(1);

                                if ( (LA81_0==29) ) {
                                    alt81=1;
                                }


                                switch (alt81) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:158:5: ',' ruleJvmTypeReference
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleMember1165); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleMember1167);
                            	    ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop81;
                                }
                            } while (true);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleMember1180);
                    ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/xtend/antlr3_2/Xtend.g:161:3: ( ruleCommonModifier )* 'class' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference )? ( 'implements' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}'
                    {
                    // src/xtend/antlr3_2/Xtend.g:161:3: ( ruleCommonModifier )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==25||(LA83_0>=44 && LA83_0<=55)) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:161:3: ruleCommonModifier
                    	    {
                    	    pushFollow(FOLLOW_ruleCommonModifier_in_ruleMember1186);
                    	    ruleCommonModifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    match(input,27,FOLLOW_27_in_ruleMember1189); if (state.failed) return ;
                    pushFollow(FOLLOW_ruleValidID_in_ruleMember1191);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:161:43: ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==28) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:162:4: '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>'
                            {
                            match(input,28,FOLLOW_28_in_ruleMember1198); if (state.failed) return ;
                            pushFollow(FOLLOW_ruleJvmTypeParameter_in_ruleMember1200);
                            ruleJvmTypeParameter();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:162:29: ( ',' ruleJvmTypeParameter )*
                            loop84:
                            do {
                                int alt84=2;
                                int LA84_0 = input.LA(1);

                                if ( (LA84_0==29) ) {
                                    alt84=1;
                                }


                                switch (alt84) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:163:5: ',' ruleJvmTypeParameter
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleMember1208); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleJvmTypeParameter_in_ruleMember1210);
                            	    ruleJvmTypeParameter();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop84;
                                }
                            } while (true);

                            match(input,30,FOLLOW_30_in_ruleMember1218); if (state.failed) return ;

                            }
                            break;

                    }

                    // src/xtend/antlr3_2/Xtend.g:165:6: ( 'extends' ruleJvmParameterizedTypeReference )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==31) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:166:4: 'extends' ruleJvmParameterizedTypeReference
                            {
                            match(input,31,FOLLOW_31_in_ruleMember1230); if (state.failed) return ;
                            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleMember1232);
                            ruleJvmParameterizedTypeReference();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    // src/xtend/antlr3_2/Xtend.g:167:6: ( 'implements' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==32) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:168:4: 'implements' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )*
                            {
                            match(input,32,FOLLOW_32_in_ruleMember1244); if (state.failed) return ;
                            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleMember1246);
                            ruleJvmParameterizedTypeReference();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:168:51: ( ',' ruleJvmParameterizedTypeReference )*
                            loop87:
                            do {
                                int alt87=2;
                                int LA87_0 = input.LA(1);

                                if ( (LA87_0==29) ) {
                                    alt87=1;
                                }


                                switch (alt87) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:169:5: ',' ruleJvmParameterizedTypeReference
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleMember1254); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleMember1256);
                            	    ruleJvmParameterizedTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop87;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,33,FOLLOW_33_in_ruleMember1269); if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:171:10: ( ruleMember )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==RULE_ID||LA89_0==25||LA89_0==27||(LA89_0>=35 && LA89_0<=37)||(LA89_0>=39 && LA89_0<=40)||(LA89_0>=43 && LA89_0<=60)||(LA89_0>=62 && LA89_0<=64)||LA89_0==75||LA89_0==95) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:171:10: ruleMember
                    	    {
                    	    pushFollow(FOLLOW_ruleMember_in_ruleMember1271);
                    	    ruleMember();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);

                    match(input,34,FOLLOW_34_in_ruleMember1274); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/xtend/antlr3_2/Xtend.g:172:3: ( ruleCommonModifier )* 'interface' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}'
                    {
                    // src/xtend/antlr3_2/Xtend.g:172:3: ( ruleCommonModifier )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==25||(LA90_0>=44 && LA90_0<=55)) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:172:3: ruleCommonModifier
                    	    {
                    	    pushFollow(FOLLOW_ruleCommonModifier_in_ruleMember1280);
                    	    ruleCommonModifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);

                    match(input,35,FOLLOW_35_in_ruleMember1283); if (state.failed) return ;
                    pushFollow(FOLLOW_ruleValidID_in_ruleMember1285);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:172:47: ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==28) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:173:4: '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>'
                            {
                            match(input,28,FOLLOW_28_in_ruleMember1292); if (state.failed) return ;
                            pushFollow(FOLLOW_ruleJvmTypeParameter_in_ruleMember1294);
                            ruleJvmTypeParameter();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:173:29: ( ',' ruleJvmTypeParameter )*
                            loop91:
                            do {
                                int alt91=2;
                                int LA91_0 = input.LA(1);

                                if ( (LA91_0==29) ) {
                                    alt91=1;
                                }


                                switch (alt91) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:174:5: ',' ruleJvmTypeParameter
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleMember1302); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleJvmTypeParameter_in_ruleMember1304);
                            	    ruleJvmTypeParameter();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop91;
                                }
                            } while (true);

                            match(input,30,FOLLOW_30_in_ruleMember1312); if (state.failed) return ;

                            }
                            break;

                    }

                    // src/xtend/antlr3_2/Xtend.g:176:6: ( 'extends' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==31) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:177:4: 'extends' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )*
                            {
                            match(input,31,FOLLOW_31_in_ruleMember1324); if (state.failed) return ;
                            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleMember1326);
                            ruleJvmParameterizedTypeReference();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:177:48: ( ',' ruleJvmParameterizedTypeReference )*
                            loop93:
                            do {
                                int alt93=2;
                                int LA93_0 = input.LA(1);

                                if ( (LA93_0==29) ) {
                                    alt93=1;
                                }


                                switch (alt93) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:178:5: ',' ruleJvmParameterizedTypeReference
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleMember1334); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleMember1336);
                            	    ruleJvmParameterizedTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop93;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,33,FOLLOW_33_in_ruleMember1349); if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:180:10: ( ruleMember )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==RULE_ID||LA95_0==25||LA95_0==27||(LA95_0>=35 && LA95_0<=37)||(LA95_0>=39 && LA95_0<=40)||(LA95_0>=43 && LA95_0<=60)||(LA95_0>=62 && LA95_0<=64)||LA95_0==75||LA95_0==95) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:180:10: ruleMember
                    	    {
                    	    pushFollow(FOLLOW_ruleMember_in_ruleMember1351);
                    	    ruleMember();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);

                    match(input,34,FOLLOW_34_in_ruleMember1354); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // src/xtend/antlr3_2/Xtend.g:181:3: ( ruleCommonModifier )* 'enum' ruleValidID '{' ( ruleXtendEnumLiteral ( ',' ruleXtendEnumLiteral )* )? ( ';' )? '}'
                    {
                    // src/xtend/antlr3_2/Xtend.g:181:3: ( ruleCommonModifier )*
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==25||(LA96_0>=44 && LA96_0<=55)) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:181:3: ruleCommonModifier
                    	    {
                    	    pushFollow(FOLLOW_ruleCommonModifier_in_ruleMember1360);
                    	    ruleCommonModifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop96;
                        }
                    } while (true);

                    match(input,36,FOLLOW_36_in_ruleMember1363); if (state.failed) return ;
                    pushFollow(FOLLOW_ruleValidID_in_ruleMember1365);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,33,FOLLOW_33_in_ruleMember1367); if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:181:46: ( ruleXtendEnumLiteral ( ',' ruleXtendEnumLiteral )* )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==RULE_ID||LA98_0==37||LA98_0==60||(LA98_0>=62 && LA98_0<=64)) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:182:4: ruleXtendEnumLiteral ( ',' ruleXtendEnumLiteral )*
                            {
                            pushFollow(FOLLOW_ruleXtendEnumLiteral_in_ruleMember1374);
                            ruleXtendEnumLiteral();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:182:25: ( ',' ruleXtendEnumLiteral )*
                            loop97:
                            do {
                                int alt97=2;
                                int LA97_0 = input.LA(1);

                                if ( (LA97_0==29) ) {
                                    alt97=1;
                                }


                                switch (alt97) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:183:5: ',' ruleXtendEnumLiteral
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleMember1382); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleXtendEnumLiteral_in_ruleMember1384);
                            	    ruleXtendEnumLiteral();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop97;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // src/xtend/antlr3_2/Xtend.g:185:6: ( ';' )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==26) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:185:6: ';'
                            {
                            match(input,26,FOLLOW_26_in_ruleMember1397); if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,34,FOLLOW_34_in_ruleMember1400); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // src/xtend/antlr3_2/Xtend.g:186:3: ( ruleCommonModifier )* 'annotation' ruleValidID '{' ( ruleAnnotationField )* '}'
                    {
                    // src/xtend/antlr3_2/Xtend.g:186:3: ( ruleCommonModifier )*
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==25||(LA100_0>=44 && LA100_0<=55)) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:186:3: ruleCommonModifier
                    	    {
                    	    pushFollow(FOLLOW_ruleCommonModifier_in_ruleMember1406);
                    	    ruleCommonModifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop100;
                        }
                    } while (true);

                    match(input,37,FOLLOW_37_in_ruleMember1409); if (state.failed) return ;
                    pushFollow(FOLLOW_ruleValidID_in_ruleMember1411);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,33,FOLLOW_33_in_ruleMember1413); if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:186:52: ( ruleAnnotationField )*
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==RULE_ID||LA101_0==25||LA101_0==27||(LA101_0>=35 && LA101_0<=37)||LA101_0==40||(LA101_0>=44 && LA101_0<=57)||LA101_0==60||(LA101_0>=62 && LA101_0<=64)||LA101_0==75||LA101_0==95) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:186:52: ruleAnnotationField
                    	    {
                    	    pushFollow(FOLLOW_ruleAnnotationField_in_ruleMember1415);
                    	    ruleAnnotationField();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop101;
                        }
                    } while (true);

                    match(input,34,FOLLOW_34_in_ruleMember1418); if (state.failed) return ;

                    }
                    break;

            }


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
    // $ANTLR end "ruleMember"


    // $ANTLR start "ruleTypeReferenceNoTypeArgs"
    // src/xtend/antlr3_2/Xtend.g:191:1: ruleTypeReferenceNoTypeArgs : ruleQualifiedName ;
    public final void ruleTypeReferenceNoTypeArgs() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:191:29: ( ruleQualifiedName )
            // src/xtend/antlr3_2/Xtend.g:192:2: ruleQualifiedName
            {
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeReferenceNoTypeArgs1432);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "ruleTypeReferenceNoTypeArgs"


    // $ANTLR start "ruleFunctionID"
    // src/xtend/antlr3_2/Xtend.g:196:1: ruleFunctionID : ( ruleValidID | ruleOperators );
    public final void ruleFunctionID() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:196:16: ( ruleValidID | ruleOperators )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==RULE_ID||LA103_0==37||LA103_0==60||(LA103_0>=62 && LA103_0<=64)) ) {
                alt103=1;
            }
            else if ( (LA103_0==28||LA103_0==30||(LA103_0>=79 && LA103_0<=90)||(LA103_0>=92 && LA103_0<=104)||(LA103_0>=106 && LA103_0<=107)) ) {
                alt103=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:197:2: ruleValidID
                    {
                    pushFollow(FOLLOW_ruleValidID_in_ruleFunctionID1443);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:198:2: ruleOperators
                    {
                    pushFollow(FOLLOW_ruleOperators_in_ruleFunctionID1448);
                    ruleOperators();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "ruleFunctionID"


    // $ANTLR start "ruleOperators"
    // src/xtend/antlr3_2/Xtend.g:202:1: ruleOperators : ( ruleOpMultiAssign | ruleOpOr | ruleOpAnd | ruleOpEquality | ruleOpCompare | ruleOpOther | ruleOpMulti | ruleOpUnary | ruleOpPostfix );
    public final void ruleOperators() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:202:15: ( ruleOpMultiAssign | ruleOpOr | ruleOpAnd | ruleOpEquality | ruleOpCompare | ruleOpOther | ruleOpMulti | ruleOpUnary | ruleOpPostfix )
            int alt104=9;
            alt104 = dfa104.predict(input);
            switch (alt104) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:203:2: ruleOpMultiAssign
                    {
                    pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleOperators1459);
                    ruleOpMultiAssign();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:204:2: ruleOpOr
                    {
                    pushFollow(FOLLOW_ruleOpOr_in_ruleOperators1464);
                    ruleOpOr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/xtend/antlr3_2/Xtend.g:205:2: ruleOpAnd
                    {
                    pushFollow(FOLLOW_ruleOpAnd_in_ruleOperators1469);
                    ruleOpAnd();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/xtend/antlr3_2/Xtend.g:206:2: ruleOpEquality
                    {
                    pushFollow(FOLLOW_ruleOpEquality_in_ruleOperators1474);
                    ruleOpEquality();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/xtend/antlr3_2/Xtend.g:207:2: ruleOpCompare
                    {
                    pushFollow(FOLLOW_ruleOpCompare_in_ruleOperators1479);
                    ruleOpCompare();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // src/xtend/antlr3_2/Xtend.g:208:2: ruleOpOther
                    {
                    pushFollow(FOLLOW_ruleOpOther_in_ruleOperators1484);
                    ruleOpOther();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // src/xtend/antlr3_2/Xtend.g:209:2: ruleOpMulti
                    {
                    pushFollow(FOLLOW_ruleOpMulti_in_ruleOperators1489);
                    ruleOpMulti();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // src/xtend/antlr3_2/Xtend.g:210:2: ruleOpUnary
                    {
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleOperators1494);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // src/xtend/antlr3_2/Xtend.g:211:2: ruleOpPostfix
                    {
                    pushFollow(FOLLOW_ruleOpPostfix_in_ruleOperators1499);
                    ruleOpPostfix();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "ruleOperators"


    // $ANTLR start "ruleXtendEnumLiteral"
    // src/xtend/antlr3_2/Xtend.g:215:1: ruleXtendEnumLiteral : ruleValidID ;
    public final void ruleXtendEnumLiteral() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:215:22: ( ruleValidID )
            // src/xtend/antlr3_2/Xtend.g:216:2: ruleValidID
            {
            pushFollow(FOLLOW_ruleValidID_in_ruleXtendEnumLiteral1510);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "ruleXtendEnumLiteral"


    // $ANTLR start "ruleCommonModifier"
    // src/xtend/antlr3_2/Xtend.g:220:1: ruleCommonModifier : ( 'public' | 'private' | 'protected' | 'package' | 'abstract' | 'static' | 'dispatch' | 'final' | 'strictfp' | 'native' | 'volatile' | 'synchronized' | 'transient' );
    public final void ruleCommonModifier() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:220:20: ( 'public' | 'private' | 'protected' | 'package' | 'abstract' | 'static' | 'dispatch' | 'final' | 'strictfp' | 'native' | 'volatile' | 'synchronized' | 'transient' )
            // src/xtend/antlr3_2/Xtend.g:
            {
            if ( input.LA(1)==25||(input.LA(1)>=44 && input.LA(1)<=55) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "ruleCommonModifier"


    // $ANTLR start "ruleFieldModifier"
    // src/xtend/antlr3_2/Xtend.g:237:1: ruleFieldModifier : ( 'val' | 'var' );
    public final void ruleFieldModifier() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:237:19: ( 'val' | 'var' )
            // src/xtend/antlr3_2/Xtend.g:
            {
            if ( (input.LA(1)>=56 && input.LA(1)<=57) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "ruleFieldModifier"


    // $ANTLR start "ruleMethodModifier"
    // src/xtend/antlr3_2/Xtend.g:243:1: ruleMethodModifier : ( 'def' | 'override' );
    public final void ruleMethodModifier() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:243:20: ( 'def' | 'override' )
            // src/xtend/antlr3_2/Xtend.g:
            {
            if ( (input.LA(1)>=58 && input.LA(1)<=59) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "ruleMethodModifier"


    // $ANTLR start "ruleCreateExtensionInfo"
    // src/xtend/antlr3_2/Xtend.g:249:1: ruleCreateExtensionInfo : 'create' ( ruleValidID ':' )? ruleXExpression ;
    public final void ruleCreateExtensionInfo() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:249:25: ( 'create' ( ruleValidID ':' )? ruleXExpression )
            // src/xtend/antlr3_2/Xtend.g:250:2: 'create' ( ruleValidID ':' )? ruleXExpression
            {
            match(input,60,FOLLOW_60_in_ruleCreateExtensionInfo1624); if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:250:11: ( ruleValidID ':' )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==RULE_ID||LA105_0==37||LA105_0==60||(LA105_0>=62 && LA105_0<=64)) ) {
                int LA105_1 = input.LA(2);

                if ( (LA105_1==61) ) {
                    alt105=1;
                }
            }
            switch (alt105) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:251:3: ruleValidID ':'
                    {
                    pushFollow(FOLLOW_ruleValidID_in_ruleCreateExtensionInfo1630);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,61,FOLLOW_61_in_ruleCreateExtensionInfo1632); if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_ruleXExpression_in_ruleCreateExtensionInfo1638);
            ruleXExpression();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "ruleCreateExtensionInfo"


    // $ANTLR start "ruleValidID"
    // src/xtend/antlr3_2/Xtend.g:256:1: ruleValidID : ( RULE_ID | 'create' | 'annotation' | 'AFTER' | 'BEFORE' | 'SEPARATOR' );
    public final void ruleValidID() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:256:13: ( RULE_ID | 'create' | 'annotation' | 'AFTER' | 'BEFORE' | 'SEPARATOR' )
            // src/xtend/antlr3_2/Xtend.g:
            {
            if ( input.LA(1)==RULE_ID||input.LA(1)==37||input.LA(1)==60||(input.LA(1)>=62 && input.LA(1)<=64) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "ruleFeatureCallID"
    // src/xtend/antlr3_2/Xtend.g:266:1: ruleFeatureCallID : ( ruleInnerVarID | 'extension' );
    public final void ruleFeatureCallID() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:266:19: ( ruleInnerVarID | 'extension' )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==RULE_ID||LA106_0==25||LA106_0==27||(LA106_0>=31 && LA106_0<=32)||(LA106_0>=35 && LA106_0<=37)||LA106_0==42||(LA106_0>=44 && LA106_0<=55)||(LA106_0>=58 && LA106_0<=60)||(LA106_0>=62 && LA106_0<=65)) ) {
                alt106=1;
            }
            else if ( (LA106_0==39) ) {
                alt106=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:267:2: ruleInnerVarID
                    {
                    pushFollow(FOLLOW_ruleInnerVarID_in_ruleFeatureCallID1685);
                    ruleInnerVarID();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:268:2: 'extension'
                    {
                    match(input,39,FOLLOW_39_in_ruleFeatureCallID1690); if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "ruleFeatureCallID"


    // $ANTLR start "ruleInnerVarID"
    // src/xtend/antlr3_2/Xtend.g:272:1: ruleInnerVarID : ( RULE_ID | 'abstract' | 'annotation' | 'class' | 'create' | 'def' | 'dispatch' | 'enum' | 'extends' | 'final' | 'implements' | 'import' | 'interface' | 'override' | 'package' | 'public' | 'private' | 'protected' | 'static' | 'throws' | 'strictfp' | 'native' | 'volatile' | 'synchronized' | 'transient' | 'AFTER' | 'BEFORE' | 'SEPARATOR' );
    public final void ruleInnerVarID() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:272:16: ( RULE_ID | 'abstract' | 'annotation' | 'class' | 'create' | 'def' | 'dispatch' | 'enum' | 'extends' | 'final' | 'implements' | 'import' | 'interface' | 'override' | 'package' | 'public' | 'private' | 'protected' | 'static' | 'throws' | 'strictfp' | 'native' | 'volatile' | 'synchronized' | 'transient' | 'AFTER' | 'BEFORE' | 'SEPARATOR' )
            // src/xtend/antlr3_2/Xtend.g:
            {
            if ( input.LA(1)==RULE_ID||input.LA(1)==25||input.LA(1)==27||(input.LA(1)>=31 && input.LA(1)<=32)||(input.LA(1)>=35 && input.LA(1)<=37)||input.LA(1)==42||(input.LA(1)>=44 && input.LA(1)<=55)||(input.LA(1)>=58 && input.LA(1)<=60)||(input.LA(1)>=62 && input.LA(1)<=65) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "ruleInnerVarID"


    // $ANTLR start "ruleParameter"
    // src/xtend/antlr3_2/Xtend.g:304:1: ruleParameter : ( ruleXAnnotation )* ( 'extension' ( ruleXAnnotation )* )? ruleJvmTypeReference ( '...' )? ruleValidID ;
    public final void ruleParameter() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:304:15: ( ( ruleXAnnotation )* ( 'extension' ( ruleXAnnotation )* )? ruleJvmTypeReference ( '...' )? ruleValidID )
            // src/xtend/antlr3_2/Xtend.g:305:2: ( ruleXAnnotation )* ( 'extension' ( ruleXAnnotation )* )? ruleJvmTypeReference ( '...' )? ruleValidID
            {
            // src/xtend/antlr3_2/Xtend.g:305:2: ( ruleXAnnotation )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==75) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // src/xtend/antlr3_2/Xtend.g:305:2: ruleXAnnotation
            	    {
            	    pushFollow(FOLLOW_ruleXAnnotation_in_ruleParameter1847);
            	    ruleXAnnotation();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop107;
                }
            } while (true);

            // src/xtend/antlr3_2/Xtend.g:305:19: ( 'extension' ( ruleXAnnotation )* )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==39) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:306:3: 'extension' ( ruleXAnnotation )*
                    {
                    match(input,39,FOLLOW_39_in_ruleParameter1854); if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:306:15: ( ruleXAnnotation )*
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==75) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:306:15: ruleXAnnotation
                    	    {
                    	    pushFollow(FOLLOW_ruleXAnnotation_in_ruleParameter1856);
                    	    ruleXAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop108;
                        }
                    } while (true);


                    }
                    break;

            }

            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleParameter1863);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:307:26: ( '...' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==66) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:307:26: '...'
                    {
                    match(input,66,FOLLOW_66_in_ruleParameter1865); if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_ruleValidID_in_ruleParameter1868);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "ruleXVariableDeclaration"
    // src/xtend/antlr3_2/Xtend.g:311:1: ruleXVariableDeclaration : ( ( ( 'var' | 'val' ) ( 'extension' )? | 'extension' ( 'var' | 'val' ) )=> ( ( 'var' | 'val' ) ( 'extension' )? | 'extension' ( 'var' | 'val' ) ) ) ( ( ( ruleJvmTypeReference ruleInnerVarID )=> ( ruleJvmTypeReference ruleInnerVarID ) ) | ruleInnerVarID ) ( '=' ruleXExpression )? ;
    public final void ruleXVariableDeclaration() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:311:26: ( ( ( ( 'var' | 'val' ) ( 'extension' )? | 'extension' ( 'var' | 'val' ) )=> ( ( 'var' | 'val' ) ( 'extension' )? | 'extension' ( 'var' | 'val' ) ) ) ( ( ( ruleJvmTypeReference ruleInnerVarID )=> ( ruleJvmTypeReference ruleInnerVarID ) ) | ruleInnerVarID ) ( '=' ruleXExpression )? )
            // src/xtend/antlr3_2/Xtend.g:312:2: ( ( ( 'var' | 'val' ) ( 'extension' )? | 'extension' ( 'var' | 'val' ) )=> ( ( 'var' | 'val' ) ( 'extension' )? | 'extension' ( 'var' | 'val' ) ) ) ( ( ( ruleJvmTypeReference ruleInnerVarID )=> ( ruleJvmTypeReference ruleInnerVarID ) ) | ruleInnerVarID ) ( '=' ruleXExpression )?
            {
            // src/xtend/antlr3_2/Xtend.g:312:2: ( ( ( 'var' | 'val' ) ( 'extension' )? | 'extension' ( 'var' | 'val' ) )=> ( ( 'var' | 'val' ) ( 'extension' )? | 'extension' ( 'var' | 'val' ) ) )
            // src/xtend/antlr3_2/Xtend.g:312:4: ( ( 'var' | 'val' ) ( 'extension' )? | 'extension' ( 'var' | 'val' ) )=> ( ( 'var' | 'val' ) ( 'extension' )? | 'extension' ( 'var' | 'val' ) )
            {
            // src/xtend/antlr3_2/Xtend.g:321:7: ( ( 'var' | 'val' ) ( 'extension' )? | 'extension' ( 'var' | 'val' ) )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( ((LA112_0>=56 && LA112_0<=57)) ) {
                alt112=1;
            }
            else if ( (LA112_0==39) ) {
                alt112=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:322:3: ( 'var' | 'val' ) ( 'extension' )?
                    {
                    if ( (input.LA(1)>=56 && input.LA(1)<=57) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // src/xtend/antlr3_2/Xtend.g:325:5: ( 'extension' )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==39) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:325:5: 'extension'
                            {
                            match(input,39,FOLLOW_39_in_ruleXVariableDeclaration1949); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:326:3: 'extension' ( 'var' | 'val' )
                    {
                    match(input,39,FOLLOW_39_in_ruleXVariableDeclaration1956); if (state.failed) return ;
                    if ( (input.LA(1)>=56 && input.LA(1)<=57) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            }

            // src/xtend/antlr3_2/Xtend.g:330:6: ( ( ( ruleJvmTypeReference ruleInnerVarID )=> ( ruleJvmTypeReference ruleInnerVarID ) ) | ruleInnerVarID )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==RULE_ID||LA113_0==37||LA113_0==60||(LA113_0>=62 && LA113_0<=64)) ) {
                int LA113_1 = input.LA(2);

                if ( (synpred6_Xtend()) ) {
                    alt113=1;
                }
                else if ( (true) ) {
                    alt113=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 113, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA113_0==40) && (synpred6_Xtend())) {
                alt113=1;
            }
            else if ( (LA113_0==95) && (synpred6_Xtend())) {
                alt113=1;
            }
            else if ( (LA113_0==25||LA113_0==27||(LA113_0>=31 && LA113_0<=32)||(LA113_0>=35 && LA113_0<=36)||LA113_0==42||(LA113_0>=44 && LA113_0<=55)||(LA113_0>=58 && LA113_0<=59)||LA113_0==65) ) {
                alt113=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:331:3: ( ( ruleJvmTypeReference ruleInnerVarID )=> ( ruleJvmTypeReference ruleInnerVarID ) )
                    {
                    // src/xtend/antlr3_2/Xtend.g:331:3: ( ( ruleJvmTypeReference ruleInnerVarID )=> ( ruleJvmTypeReference ruleInnerVarID ) )
                    // src/xtend/antlr3_2/Xtend.g:331:5: ( ruleJvmTypeReference ruleInnerVarID )=> ( ruleJvmTypeReference ruleInnerVarID )
                    {
                    // src/xtend/antlr3_2/Xtend.g:333:8: ( ruleJvmTypeReference ruleInnerVarID )
                    // src/xtend/antlr3_2/Xtend.g:334:4: ruleJvmTypeReference ruleInnerVarID
                    {
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration2006);
                    ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_ruleInnerVarID_in_ruleXVariableDeclaration2008);
                    ruleInnerVarID();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }


                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:336:3: ruleInnerVarID
                    {
                    pushFollow(FOLLOW_ruleInnerVarID_in_ruleXVariableDeclaration2020);
                    ruleInnerVarID();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // src/xtend/antlr3_2/Xtend.g:337:4: ( '=' ruleXExpression )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==38) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:338:3: '=' ruleXExpression
                    {
                    match(input,38,FOLLOW_38_in_ruleXVariableDeclaration2029); if (state.failed) return ;
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration2031);
                    ruleXExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


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
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "ruleXConstructorCall"
    // src/xtend/antlr3_2/Xtend.g:343:1: ruleXConstructorCall : ruleXbaseConstructorCall ( ( ( '{' )=> '{' ) ( ruleMember )* '}' )? ;
    public final void ruleXConstructorCall() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:343:22: ( ruleXbaseConstructorCall ( ( ( '{' )=> '{' ) ( ruleMember )* '}' )? )
            // src/xtend/antlr3_2/Xtend.g:344:2: ruleXbaseConstructorCall ( ( ( '{' )=> '{' ) ( ruleMember )* '}' )?
            {
            pushFollow(FOLLOW_ruleXbaseConstructorCall_in_ruleXConstructorCall2046);
            ruleXbaseConstructorCall();

            state._fsp--;
            if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:344:27: ( ( ( '{' )=> '{' ) ( ruleMember )* '}' )?
            int alt116=2;
            alt116 = dfa116.predict(input);
            switch (alt116) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:345:3: ( ( '{' )=> '{' ) ( ruleMember )* '}'
                    {
                    // src/xtend/antlr3_2/Xtend.g:345:3: ( ( '{' )=> '{' )
                    // src/xtend/antlr3_2/Xtend.g:345:5: ( '{' )=> '{'
                    {
                    match(input,33,FOLLOW_33_in_ruleXConstructorCall2066); if (state.failed) return ;

                    }

                    // src/xtend/antlr3_2/Xtend.g:347:14: ( ruleMember )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==RULE_ID||LA115_0==25||LA115_0==27||(LA115_0>=35 && LA115_0<=37)||(LA115_0>=39 && LA115_0<=40)||(LA115_0>=43 && LA115_0<=60)||(LA115_0>=62 && LA115_0<=64)||LA115_0==75||LA115_0==95) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:347:14: ruleMember
                    	    {
                    	    pushFollow(FOLLOW_ruleMember_in_ruleXConstructorCall2070);
                    	    ruleMember();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);

                    match(input,34,FOLLOW_34_in_ruleXConstructorCall2073); if (state.failed) return ;

                    }
                    break;

            }


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
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "ruleXbaseConstructorCall"
    // src/xtend/antlr3_2/Xtend.g:352:1: ruleXbaseConstructorCall : 'new' ruleQualifiedName ( ( ( '<' )=> '<' ) ruleJvmArgumentTypeReference ( ',' ruleJvmArgumentTypeReference )* '>' )? ( ( ( '(' )=> '(' ) ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )? ')' )? ( ( '[' )=> ruleXClosure )? ;
    public final void ruleXbaseConstructorCall() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:352:26: ( 'new' ruleQualifiedName ( ( ( '<' )=> '<' ) ruleJvmArgumentTypeReference ( ',' ruleJvmArgumentTypeReference )* '>' )? ( ( ( '(' )=> '(' ) ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )? ')' )? ( ( '[' )=> ruleXClosure )? )
            // src/xtend/antlr3_2/Xtend.g:353:2: 'new' ruleQualifiedName ( ( ( '<' )=> '<' ) ruleJvmArgumentTypeReference ( ',' ruleJvmArgumentTypeReference )* '>' )? ( ( ( '(' )=> '(' ) ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )? ')' )? ( ( '[' )=> ruleXClosure )?
            {
            match(input,43,FOLLOW_43_in_ruleXbaseConstructorCall2088); if (state.failed) return ;
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXbaseConstructorCall2090);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:353:26: ( ( ( '<' )=> '<' ) ruleJvmArgumentTypeReference ( ',' ruleJvmArgumentTypeReference )* '>' )?
            int alt118=2;
            alt118 = dfa118.predict(input);
            switch (alt118) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:354:3: ( ( '<' )=> '<' ) ruleJvmArgumentTypeReference ( ',' ruleJvmArgumentTypeReference )* '>'
                    {
                    // src/xtend/antlr3_2/Xtend.g:354:3: ( ( '<' )=> '<' )
                    // src/xtend/antlr3_2/Xtend.g:354:5: ( '<' )=> '<'
                    {
                    match(input,28,FOLLOW_28_in_ruleXbaseConstructorCall2110); if (state.failed) return ;

                    }

                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXbaseConstructorCall2114);
                    ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:356:43: ( ',' ruleJvmArgumentTypeReference )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==29) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:357:4: ',' ruleJvmArgumentTypeReference
                    	    {
                    	    match(input,29,FOLLOW_29_in_ruleXbaseConstructorCall2121); if (state.failed) return ;
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXbaseConstructorCall2123);
                    	    ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);

                    match(input,30,FOLLOW_30_in_ruleXbaseConstructorCall2130); if (state.failed) return ;

                    }
                    break;

            }

            // src/xtend/antlr3_2/Xtend.g:359:5: ( ( ( '(' )=> '(' ) ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )? ')' )?
            int alt121=2;
            alt121 = dfa121.predict(input);
            switch (alt121) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:360:3: ( ( '(' )=> '(' ) ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )? ')'
                    {
                    // src/xtend/antlr3_2/Xtend.g:360:3: ( ( '(' )=> '(' )
                    // src/xtend/antlr3_2/Xtend.g:360:5: ( '(' )=> '('
                    {
                    match(input,40,FOLLOW_40_in_ruleXbaseConstructorCall2154); if (state.failed) return ;

                    }

                    // src/xtend/antlr3_2/Xtend.g:362:14: ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )?
                    int alt120=3;
                    alt120 = dfa120.predict(input);
                    switch (alt120) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:363:4: ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure )
                            {
                            // src/xtend/antlr3_2/Xtend.g:363:4: ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure )
                            // src/xtend/antlr3_2/Xtend.g:363:6: ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure
                            {
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXbaseConstructorCall2211);
                            ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return ;

                            }


                            }
                            break;
                        case 2 :
                            // src/xtend/antlr3_2/Xtend.g:370:4: ruleXExpression ( ',' ruleXExpression )*
                            {
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXbaseConstructorCall2220);
                            ruleXExpression();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:370:20: ( ',' ruleXExpression )*
                            loop119:
                            do {
                                int alt119=2;
                                int LA119_0 = input.LA(1);

                                if ( (LA119_0==29) ) {
                                    alt119=1;
                                }


                                switch (alt119) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:371:5: ',' ruleXExpression
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleXbaseConstructorCall2228); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXbaseConstructorCall2230);
                            	    ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop119;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,41,FOLLOW_41_in_ruleXbaseConstructorCall2243); if (state.failed) return ;

                    }
                    break;

            }

            // src/xtend/antlr3_2/Xtend.g:374:5: ( ( '[' )=> ruleXClosure )?
            int alt122=2;
            alt122 = dfa122.predict(input);
            switch (alt122) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:374:7: ( '[' )=> ruleXClosure
                    {
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXbaseConstructorCall2261);
                    ruleXClosure();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


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
    // $ANTLR end "ruleXbaseConstructorCall"


    // $ANTLR start "ruleJvmFormalParameter"
    // src/xtend/antlr3_2/Xtend.g:380:1: ruleJvmFormalParameter : ( 'extension' )? ( ruleJvmTypeReference )? ruleInnerVarID ;
    public final void ruleJvmFormalParameter() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:380:24: ( ( 'extension' )? ( ruleJvmTypeReference )? ruleInnerVarID )
            // src/xtend/antlr3_2/Xtend.g:381:2: ( 'extension' )? ( ruleJvmTypeReference )? ruleInnerVarID
            {
            // src/xtend/antlr3_2/Xtend.g:381:2: ( 'extension' )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==39) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:381:2: 'extension'
                    {
                    match(input,39,FOLLOW_39_in_ruleJvmFormalParameter2275); if (state.failed) return ;

                    }
                    break;

            }

            // src/xtend/antlr3_2/Xtend.g:381:15: ( ruleJvmTypeReference )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==RULE_ID||LA124_0==37||LA124_0==60||(LA124_0>=62 && LA124_0<=64)) ) {
                int LA124_1 = input.LA(2);

                if ( (LA124_1==RULE_ID||LA124_1==25||(LA124_1>=27 && LA124_1<=28)||(LA124_1>=31 && LA124_1<=32)||(LA124_1>=35 && LA124_1<=37)||LA124_1==42||(LA124_1>=44 && LA124_1<=55)||(LA124_1>=58 && LA124_1<=60)||(LA124_1>=62 && LA124_1<=65)||LA124_1==77||LA124_1==108) ) {
                    alt124=1;
                }
            }
            else if ( (LA124_0==40||LA124_0==95) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:381:15: ruleJvmTypeReference
                    {
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter2278);
                    ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_ruleInnerVarID_in_ruleJvmFormalParameter2281);
            ruleInnerVarID();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // src/xtend/antlr3_2/Xtend.g:385:1: ruleFullJvmFormalParameter : ( 'extension' )? ruleJvmTypeReference ruleInnerVarID ;
    public final void ruleFullJvmFormalParameter() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:385:28: ( ( 'extension' )? ruleJvmTypeReference ruleInnerVarID )
            // src/xtend/antlr3_2/Xtend.g:386:2: ( 'extension' )? ruleJvmTypeReference ruleInnerVarID
            {
            // src/xtend/antlr3_2/Xtend.g:386:2: ( 'extension' )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==39) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:386:2: 'extension'
                    {
                    match(input,39,FOLLOW_39_in_ruleFullJvmFormalParameter2292); if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter2295);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_ruleInnerVarID_in_ruleFullJvmFormalParameter2297);
            ruleInnerVarID();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "ruleXStringLiteral"
    // src/xtend/antlr3_2/Xtend.g:390:1: ruleXStringLiteral : ( ruleSimpleStringLiteral | ruleRichString );
    public final void ruleXStringLiteral() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:390:20: ( ruleSimpleStringLiteral | ruleRichString )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==RULE_STRING) ) {
                alt126=1;
            }
            else if ( ((LA126_0>=RULE_RICH_TEXT && LA126_0<=RULE_RICH_TEXT_START)) ) {
                alt126=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:391:2: ruleSimpleStringLiteral
                    {
                    pushFollow(FOLLOW_ruleSimpleStringLiteral_in_ruleXStringLiteral2308);
                    ruleSimpleStringLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:392:2: ruleRichString
                    {
                    pushFollow(FOLLOW_ruleRichString_in_ruleXStringLiteral2313);
                    ruleRichString();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "ruleXSwitchExpression"
    // src/xtend/antlr3_2/Xtend.g:396:1: ruleXSwitchExpression : 'switch' ( ( ( '(' ruleJvmFormalParameter ':' )=> ( '(' ruleJvmFormalParameter ':' ) ) ruleXExpression ')' | ( ( ruleJvmFormalParameter ':' )=> ( ruleJvmFormalParameter ':' ) )? ruleXExpressionOrSimpleConstructorCall ) '{' ( ruleXCasePart )* ( 'default' ':' ruleXExpression )? '}' ;
    public final void ruleXSwitchExpression() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:396:23: ( 'switch' ( ( ( '(' ruleJvmFormalParameter ':' )=> ( '(' ruleJvmFormalParameter ':' ) ) ruleXExpression ')' | ( ( ruleJvmFormalParameter ':' )=> ( ruleJvmFormalParameter ':' ) )? ruleXExpressionOrSimpleConstructorCall ) '{' ( ruleXCasePart )* ( 'default' ':' ruleXExpression )? '}' )
            // src/xtend/antlr3_2/Xtend.g:397:2: 'switch' ( ( ( '(' ruleJvmFormalParameter ':' )=> ( '(' ruleJvmFormalParameter ':' ) ) ruleXExpression ')' | ( ( ruleJvmFormalParameter ':' )=> ( ruleJvmFormalParameter ':' ) )? ruleXExpressionOrSimpleConstructorCall ) '{' ( ruleXCasePart )* ( 'default' ':' ruleXExpression )? '}'
            {
            match(input,67,FOLLOW_67_in_ruleXSwitchExpression2324); if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:397:11: ( ( ( '(' ruleJvmFormalParameter ':' )=> ( '(' ruleJvmFormalParameter ':' ) ) ruleXExpression ')' | ( ( ruleJvmFormalParameter ':' )=> ( ruleJvmFormalParameter ':' ) )? ruleXExpressionOrSimpleConstructorCall )
            int alt128=2;
            alt128 = dfa128.predict(input);
            switch (alt128) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:398:3: ( ( '(' ruleJvmFormalParameter ':' )=> ( '(' ruleJvmFormalParameter ':' ) ) ruleXExpression ')'
                    {
                    // src/xtend/antlr3_2/Xtend.g:398:3: ( ( '(' ruleJvmFormalParameter ':' )=> ( '(' ruleJvmFormalParameter ':' ) )
                    // src/xtend/antlr3_2/Xtend.g:398:5: ( '(' ruleJvmFormalParameter ':' )=> ( '(' ruleJvmFormalParameter ':' )
                    {
                    // src/xtend/antlr3_2/Xtend.g:400:8: ( '(' ruleJvmFormalParameter ':' )
                    // src/xtend/antlr3_2/Xtend.g:401:4: '(' ruleJvmFormalParameter ':'
                    {
                    match(input,40,FOLLOW_40_in_ruleXSwitchExpression2353); if (state.failed) return ;
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXSwitchExpression2355);
                    ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,61,FOLLOW_61_in_ruleXSwitchExpression2357); if (state.failed) return ;

                    }


                    }

                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression2365);
                    ruleXExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,41,FOLLOW_41_in_ruleXSwitchExpression2367); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:403:3: ( ( ruleJvmFormalParameter ':' )=> ( ruleJvmFormalParameter ':' ) )? ruleXExpressionOrSimpleConstructorCall
                    {
                    // src/xtend/antlr3_2/Xtend.g:403:3: ( ( ruleJvmFormalParameter ':' )=> ( ruleJvmFormalParameter ':' ) )?
                    int alt127=2;
                    alt127 = dfa127.predict(input);
                    switch (alt127) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:403:5: ( ruleJvmFormalParameter ':' )=> ( ruleJvmFormalParameter ':' )
                            {
                            // src/xtend/antlr3_2/Xtend.g:405:8: ( ruleJvmFormalParameter ':' )
                            // src/xtend/antlr3_2/Xtend.g:406:4: ruleJvmFormalParameter ':'
                            {
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXSwitchExpression2394);
                            ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return ;
                            match(input,61,FOLLOW_61_in_ruleXSwitchExpression2396); if (state.failed) return ;

                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_ruleXExpressionOrSimpleConstructorCall_in_ruleXSwitchExpression2405);
                    ruleXExpressionOrSimpleConstructorCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,33,FOLLOW_33_in_ruleXSwitchExpression2410); if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:408:8: ( ruleXCasePart )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==RULE_ID||LA129_0==29||LA129_0==37||LA129_0==40||(LA129_0>=60 && LA129_0<=64)||LA129_0==95||LA129_0==114) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // src/xtend/antlr3_2/Xtend.g:408:8: ruleXCasePart
            	    {
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression2412);
            	    ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop129;
                }
            } while (true);

            // src/xtend/antlr3_2/Xtend.g:408:23: ( 'default' ':' ruleXExpression )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==68) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:409:3: 'default' ':' ruleXExpression
                    {
                    match(input,68,FOLLOW_68_in_ruleXSwitchExpression2419); if (state.failed) return ;
                    match(input,61,FOLLOW_61_in_ruleXSwitchExpression2421); if (state.failed) return ;
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression2423);
                    ruleXExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,34,FOLLOW_34_in_ruleXSwitchExpression2429); if (state.failed) return ;

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
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "ruleXExpressionOrSimpleConstructorCall"
    // src/xtend/antlr3_2/Xtend.g:414:1: ruleXExpressionOrSimpleConstructorCall : ( ( ( 'new' )=> ruleXbaseConstructorCall ) | ruleXExpression );
    public final void ruleXExpressionOrSimpleConstructorCall() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:414:40: ( ( ( 'new' )=> ruleXbaseConstructorCall ) | ruleXExpression )
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==43) ) {
                int LA131_1 = input.LA(2);

                if ( (LA131_1==RULE_ID||LA131_1==37||LA131_1==60||(LA131_1>=62 && LA131_1<=64)) ) {
                    int LA131_3 = input.LA(3);

                    if ( (synpred14_Xtend()) ) {
                        alt131=1;
                    }
                    else if ( (true) ) {
                        alt131=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 131, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 131, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA131_0>=RULE_ID && LA131_0<=RULE_RICH_TEXT_START)||(LA131_0>=RULE_HEX && LA131_0<=RULE_DECIMAL)||LA131_0==25||(LA131_0>=27 && LA131_0<=28)||(LA131_0>=31 && LA131_0<=33)||(LA131_0>=35 && LA131_0<=37)||(LA131_0>=39 && LA131_0<=40)||LA131_0==42||(LA131_0>=44 && LA131_0<=55)||(LA131_0>=58 && LA131_0<=60)||(LA131_0>=62 && LA131_0<=65)||LA131_0==67||(LA131_0>=76 && LA131_0<=77)||(LA131_0>=98 && LA131_0<=99)||LA131_0==104||LA131_0==112||(LA131_0>=115 && LA131_0<=125)) ) {
                alt131=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;
            }
            switch (alt131) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:415:2: ( ( 'new' )=> ruleXbaseConstructorCall )
                    {
                    // src/xtend/antlr3_2/Xtend.g:415:2: ( ( 'new' )=> ruleXbaseConstructorCall )
                    // src/xtend/antlr3_2/Xtend.g:415:4: ( 'new' )=> ruleXbaseConstructorCall
                    {
                    pushFollow(FOLLOW_ruleXbaseConstructorCall_in_ruleXExpressionOrSimpleConstructorCall2452);
                    ruleXbaseConstructorCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:418:2: ruleXExpression
                    {
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionOrSimpleConstructorCall2459);
                    ruleXExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "ruleXExpressionOrSimpleConstructorCall"


    // $ANTLR start "ruleSimpleStringLiteral"
    // src/xtend/antlr3_2/Xtend.g:422:1: ruleSimpleStringLiteral : RULE_STRING ;
    public final void ruleSimpleStringLiteral() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:422:25: ( RULE_STRING )
            // src/xtend/antlr3_2/Xtend.g:423:2: RULE_STRING
            {
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleStringLiteral2470); if (state.failed) return ;

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
    // $ANTLR end "ruleSimpleStringLiteral"


    // $ANTLR start "ruleRichString"
    // src/xtend/antlr3_2/Xtend.g:427:1: ruleRichString : ( ruleRichStringLiteral | ruleRichStringLiteralStart ( ruleRichStringPart )? ( ruleRichStringLiteralInbetween ( ruleRichStringPart )? )* ruleRichStringLiteralEnd );
    public final void ruleRichString() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:427:16: ( ruleRichStringLiteral | ruleRichStringLiteralStart ( ruleRichStringPart )? ( ruleRichStringLiteralInbetween ( ruleRichStringPart )? )* ruleRichStringLiteralEnd )
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==RULE_RICH_TEXT) ) {
                alt135=1;
            }
            else if ( (LA135_0==RULE_RICH_TEXT_START) ) {
                alt135=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;
            }
            switch (alt135) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:428:2: ruleRichStringLiteral
                    {
                    pushFollow(FOLLOW_ruleRichStringLiteral_in_ruleRichString2481);
                    ruleRichStringLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:429:2: ruleRichStringLiteralStart ( ruleRichStringPart )? ( ruleRichStringLiteralInbetween ( ruleRichStringPart )? )* ruleRichStringLiteralEnd
                    {
                    pushFollow(FOLLOW_ruleRichStringLiteralStart_in_ruleRichString2486);
                    ruleRichStringLiteralStart();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:429:29: ( ruleRichStringPart )?
                    int alt132=2;
                    int LA132_0 = input.LA(1);

                    if ( ((LA132_0>=RULE_ID && LA132_0<=RULE_RICH_TEXT_START)||(LA132_0>=RULE_HEX && LA132_0<=RULE_DECIMAL)||LA132_0==25||(LA132_0>=27 && LA132_0<=28)||(LA132_0>=31 && LA132_0<=33)||(LA132_0>=35 && LA132_0<=37)||(LA132_0>=39 && LA132_0<=40)||(LA132_0>=42 && LA132_0<=60)||(LA132_0>=62 && LA132_0<=65)||LA132_0==67||LA132_0==69||LA132_0==71||(LA132_0>=76 && LA132_0<=77)||(LA132_0>=98 && LA132_0<=99)||LA132_0==104||LA132_0==112||(LA132_0>=115 && LA132_0<=125)) ) {
                        alt132=1;
                    }
                    switch (alt132) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:429:29: ruleRichStringPart
                            {
                            pushFollow(FOLLOW_ruleRichStringPart_in_ruleRichString2488);
                            ruleRichStringPart();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    // src/xtend/antlr3_2/Xtend.g:429:49: ( ruleRichStringLiteralInbetween ( ruleRichStringPart )? )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( ((LA134_0>=RULE_RICH_TEXT_INBETWEEN && LA134_0<=RULE_COMMENT_RICH_TEXT_INBETWEEN)) ) {
                            alt134=1;
                        }


                        switch (alt134) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:430:3: ruleRichStringLiteralInbetween ( ruleRichStringPart )?
                    	    {
                    	    pushFollow(FOLLOW_ruleRichStringLiteralInbetween_in_ruleRichString2495);
                    	    ruleRichStringLiteralInbetween();

                    	    state._fsp--;
                    	    if (state.failed) return ;
                    	    // src/xtend/antlr3_2/Xtend.g:430:34: ( ruleRichStringPart )?
                    	    int alt133=2;
                    	    int LA133_0 = input.LA(1);

                    	    if ( ((LA133_0>=RULE_ID && LA133_0<=RULE_RICH_TEXT_START)||(LA133_0>=RULE_HEX && LA133_0<=RULE_DECIMAL)||LA133_0==25||(LA133_0>=27 && LA133_0<=28)||(LA133_0>=31 && LA133_0<=33)||(LA133_0>=35 && LA133_0<=37)||(LA133_0>=39 && LA133_0<=40)||(LA133_0>=42 && LA133_0<=60)||(LA133_0>=62 && LA133_0<=65)||LA133_0==67||LA133_0==69||LA133_0==71||(LA133_0>=76 && LA133_0<=77)||(LA133_0>=98 && LA133_0<=99)||LA133_0==104||LA133_0==112||(LA133_0>=115 && LA133_0<=125)) ) {
                    	        alt133=1;
                    	    }
                    	    switch (alt133) {
                    	        case 1 :
                    	            // src/xtend/antlr3_2/Xtend.g:430:34: ruleRichStringPart
                    	            {
                    	            pushFollow(FOLLOW_ruleRichStringPart_in_ruleRichString2497);
                    	            ruleRichStringPart();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop134;
                        }
                    } while (true);

                    pushFollow(FOLLOW_ruleRichStringLiteralEnd_in_ruleRichString2504);
                    ruleRichStringLiteralEnd();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "ruleRichString"


    // $ANTLR start "ruleRichStringLiteral"
    // src/xtend/antlr3_2/Xtend.g:435:1: ruleRichStringLiteral : RULE_RICH_TEXT ;
    public final void ruleRichStringLiteral() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:435:23: ( RULE_RICH_TEXT )
            // src/xtend/antlr3_2/Xtend.g:436:2: RULE_RICH_TEXT
            {
            match(input,RULE_RICH_TEXT,FOLLOW_RULE_RICH_TEXT_in_ruleRichStringLiteral2515); if (state.failed) return ;

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
    // $ANTLR end "ruleRichStringLiteral"


    // $ANTLR start "ruleRichStringLiteralStart"
    // src/xtend/antlr3_2/Xtend.g:440:1: ruleRichStringLiteralStart : RULE_RICH_TEXT_START ;
    public final void ruleRichStringLiteralStart() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:440:28: ( RULE_RICH_TEXT_START )
            // src/xtend/antlr3_2/Xtend.g:441:2: RULE_RICH_TEXT_START
            {
            match(input,RULE_RICH_TEXT_START,FOLLOW_RULE_RICH_TEXT_START_in_ruleRichStringLiteralStart2526); if (state.failed) return ;

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
    // $ANTLR end "ruleRichStringLiteralStart"


    // $ANTLR start "ruleRichStringLiteralInbetween"
    // src/xtend/antlr3_2/Xtend.g:445:1: ruleRichStringLiteralInbetween : ( RULE_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_INBETWEEN );
    public final void ruleRichStringLiteralInbetween() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:445:32: ( RULE_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_INBETWEEN )
            // src/xtend/antlr3_2/Xtend.g:
            {
            if ( (input.LA(1)>=RULE_RICH_TEXT_INBETWEEN && input.LA(1)<=RULE_COMMENT_RICH_TEXT_INBETWEEN) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "ruleRichStringLiteralInbetween"


    // $ANTLR start "ruleRichStringLiteralEnd"
    // src/xtend/antlr3_2/Xtend.g:451:1: ruleRichStringLiteralEnd : ( RULE_RICH_TEXT_END | RULE_COMMENT_RICH_TEXT_END );
    public final void ruleRichStringLiteralEnd() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:451:26: ( RULE_RICH_TEXT_END | RULE_COMMENT_RICH_TEXT_END )
            // src/xtend/antlr3_2/Xtend.g:
            {
            if ( (input.LA(1)>=RULE_RICH_TEXT_END && input.LA(1)<=RULE_COMMENT_RICH_TEXT_END) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "ruleRichStringLiteralEnd"


    // $ANTLR start "ruleInternalRichString"
    // src/xtend/antlr3_2/Xtend.g:457:1: ruleInternalRichString : ruleRichStringLiteralInbetween ( ( ruleRichStringPart )? ruleRichStringLiteralInbetween )* ;
    public final void ruleInternalRichString() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:457:24: ( ruleRichStringLiteralInbetween ( ( ruleRichStringPart )? ruleRichStringLiteralInbetween )* )
            // src/xtend/antlr3_2/Xtend.g:458:2: ruleRichStringLiteralInbetween ( ( ruleRichStringPart )? ruleRichStringLiteralInbetween )*
            {
            pushFollow(FOLLOW_ruleRichStringLiteralInbetween_in_ruleInternalRichString2569);
            ruleRichStringLiteralInbetween();

            state._fsp--;
            if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:458:33: ( ( ruleRichStringPart )? ruleRichStringLiteralInbetween )*
            loop137:
            do {
                int alt137=2;
                int LA137_0 = input.LA(1);

                if ( ((LA137_0>=RULE_ID && LA137_0<=RULE_COMMENT_RICH_TEXT_INBETWEEN)||(LA137_0>=RULE_HEX && LA137_0<=RULE_DECIMAL)||LA137_0==25||(LA137_0>=27 && LA137_0<=28)||(LA137_0>=31 && LA137_0<=33)||(LA137_0>=35 && LA137_0<=37)||(LA137_0>=39 && LA137_0<=40)||(LA137_0>=42 && LA137_0<=60)||(LA137_0>=62 && LA137_0<=65)||LA137_0==67||LA137_0==69||LA137_0==71||(LA137_0>=76 && LA137_0<=77)||(LA137_0>=98 && LA137_0<=99)||LA137_0==104||LA137_0==112||(LA137_0>=115 && LA137_0<=125)) ) {
                    alt137=1;
                }


                switch (alt137) {
            	case 1 :
            	    // src/xtend/antlr3_2/Xtend.g:459:3: ( ruleRichStringPart )? ruleRichStringLiteralInbetween
            	    {
            	    // src/xtend/antlr3_2/Xtend.g:459:3: ( ruleRichStringPart )?
            	    int alt136=2;
            	    int LA136_0 = input.LA(1);

            	    if ( ((LA136_0>=RULE_ID && LA136_0<=RULE_RICH_TEXT_START)||(LA136_0>=RULE_HEX && LA136_0<=RULE_DECIMAL)||LA136_0==25||(LA136_0>=27 && LA136_0<=28)||(LA136_0>=31 && LA136_0<=33)||(LA136_0>=35 && LA136_0<=37)||(LA136_0>=39 && LA136_0<=40)||(LA136_0>=42 && LA136_0<=60)||(LA136_0>=62 && LA136_0<=65)||LA136_0==67||LA136_0==69||LA136_0==71||(LA136_0>=76 && LA136_0<=77)||(LA136_0>=98 && LA136_0<=99)||LA136_0==104||LA136_0==112||(LA136_0>=115 && LA136_0<=125)) ) {
            	        alt136=1;
            	    }
            	    switch (alt136) {
            	        case 1 :
            	            // src/xtend/antlr3_2/Xtend.g:459:3: ruleRichStringPart
            	            {
            	            pushFollow(FOLLOW_ruleRichStringPart_in_ruleInternalRichString2575);
            	            ruleRichStringPart();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_ruleRichStringLiteralInbetween_in_ruleInternalRichString2578);
            	    ruleRichStringLiteralInbetween();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop137;
                }
            } while (true);


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
    // $ANTLR end "ruleInternalRichString"


    // $ANTLR start "ruleRichStringPart"
    // src/xtend/antlr3_2/Xtend.g:464:1: ruleRichStringPart : ( ruleXExpressionOrVarDeclaration | ruleRichStringForLoop | ruleRichStringIf );
    public final void ruleRichStringPart() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:464:20: ( ruleXExpressionOrVarDeclaration | ruleRichStringForLoop | ruleRichStringIf )
            int alt138=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_RICH_TEXT:
            case RULE_RICH_TEXT_START:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 25:
            case 27:
            case 28:
            case 31:
            case 32:
            case 33:
            case 35:
            case 36:
            case 37:
            case 39:
            case 40:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 76:
            case 77:
            case 98:
            case 99:
            case 104:
            case 112:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
                {
                alt138=1;
                }
                break;
            case 69:
                {
                alt138=2;
                }
                break;
            case 71:
                {
                alt138=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;
            }

            switch (alt138) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:465:2: ruleXExpressionOrVarDeclaration
                    {
                    pushFollow(FOLLOW_ruleXExpressionOrVarDeclaration_in_ruleRichStringPart2593);
                    ruleXExpressionOrVarDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:466:2: ruleRichStringForLoop
                    {
                    pushFollow(FOLLOW_ruleRichStringForLoop_in_ruleRichStringPart2598);
                    ruleRichStringForLoop();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/xtend/antlr3_2/Xtend.g:467:2: ruleRichStringIf
                    {
                    pushFollow(FOLLOW_ruleRichStringIf_in_ruleRichStringPart2603);
                    ruleRichStringIf();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "ruleRichStringPart"


    // $ANTLR start "ruleRichStringForLoop"
    // src/xtend/antlr3_2/Xtend.g:471:1: ruleRichStringForLoop : 'FOR' ruleJvmFormalParameter ':' ruleXExpression ( 'BEFORE' ruleXExpression )? ( 'SEPARATOR' ruleXExpression )? ( 'AFTER' ruleXExpression )? ruleInternalRichString 'ENDFOR' ;
    public final void ruleRichStringForLoop() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:471:23: ( 'FOR' ruleJvmFormalParameter ':' ruleXExpression ( 'BEFORE' ruleXExpression )? ( 'SEPARATOR' ruleXExpression )? ( 'AFTER' ruleXExpression )? ruleInternalRichString 'ENDFOR' )
            // src/xtend/antlr3_2/Xtend.g:472:2: 'FOR' ruleJvmFormalParameter ':' ruleXExpression ( 'BEFORE' ruleXExpression )? ( 'SEPARATOR' ruleXExpression )? ( 'AFTER' ruleXExpression )? ruleInternalRichString 'ENDFOR'
            {
            match(input,69,FOLLOW_69_in_ruleRichStringForLoop2614); if (state.failed) return ;
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleRichStringForLoop2616);
            ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return ;
            match(input,61,FOLLOW_61_in_ruleRichStringForLoop2618); if (state.failed) return ;
            pushFollow(FOLLOW_ruleXExpression_in_ruleRichStringForLoop2620);
            ruleXExpression();

            state._fsp--;
            if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:472:51: ( 'BEFORE' ruleXExpression )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==63) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:473:3: 'BEFORE' ruleXExpression
                    {
                    match(input,63,FOLLOW_63_in_ruleRichStringForLoop2626); if (state.failed) return ;
                    pushFollow(FOLLOW_ruleXExpression_in_ruleRichStringForLoop2628);
                    ruleXExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // src/xtend/antlr3_2/Xtend.g:474:5: ( 'SEPARATOR' ruleXExpression )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==64) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:475:3: 'SEPARATOR' ruleXExpression
                    {
                    match(input,64,FOLLOW_64_in_ruleRichStringForLoop2638); if (state.failed) return ;
                    pushFollow(FOLLOW_ruleXExpression_in_ruleRichStringForLoop2640);
                    ruleXExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // src/xtend/antlr3_2/Xtend.g:476:5: ( 'AFTER' ruleXExpression )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==62) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:477:3: 'AFTER' ruleXExpression
                    {
                    match(input,62,FOLLOW_62_in_ruleRichStringForLoop2650); if (state.failed) return ;
                    pushFollow(FOLLOW_ruleXExpression_in_ruleRichStringForLoop2652);
                    ruleXExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_ruleInternalRichString_in_ruleRichStringForLoop2658);
            ruleInternalRichString();

            state._fsp--;
            if (state.failed) return ;
            match(input,70,FOLLOW_70_in_ruleRichStringForLoop2660); if (state.failed) return ;

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
    // $ANTLR end "ruleRichStringForLoop"


    // $ANTLR start "ruleRichStringIf"
    // src/xtend/antlr3_2/Xtend.g:482:1: ruleRichStringIf : 'IF' ruleXExpression ruleInternalRichString ( ruleRichStringElseIf )* ( 'ELSE' ruleInternalRichString )? 'ENDIF' ;
    public final void ruleRichStringIf() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:482:18: ( 'IF' ruleXExpression ruleInternalRichString ( ruleRichStringElseIf )* ( 'ELSE' ruleInternalRichString )? 'ENDIF' )
            // src/xtend/antlr3_2/Xtend.g:483:2: 'IF' ruleXExpression ruleInternalRichString ( ruleRichStringElseIf )* ( 'ELSE' ruleInternalRichString )? 'ENDIF'
            {
            match(input,71,FOLLOW_71_in_ruleRichStringIf2671); if (state.failed) return ;
            pushFollow(FOLLOW_ruleXExpression_in_ruleRichStringIf2673);
            ruleXExpression();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_ruleInternalRichString_in_ruleRichStringIf2675);
            ruleInternalRichString();

            state._fsp--;
            if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:483:46: ( ruleRichStringElseIf )*
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==74) ) {
                    alt142=1;
                }


                switch (alt142) {
            	case 1 :
            	    // src/xtend/antlr3_2/Xtend.g:483:46: ruleRichStringElseIf
            	    {
            	    pushFollow(FOLLOW_ruleRichStringElseIf_in_ruleRichStringIf2677);
            	    ruleRichStringElseIf();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop142;
                }
            } while (true);

            // src/xtend/antlr3_2/Xtend.g:483:68: ( 'ELSE' ruleInternalRichString )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==72) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:484:3: 'ELSE' ruleInternalRichString
                    {
                    match(input,72,FOLLOW_72_in_ruleRichStringIf2684); if (state.failed) return ;
                    pushFollow(FOLLOW_ruleInternalRichString_in_ruleRichStringIf2686);
                    ruleInternalRichString();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,73,FOLLOW_73_in_ruleRichStringIf2692); if (state.failed) return ;

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
    // $ANTLR end "ruleRichStringIf"


    // $ANTLR start "ruleRichStringElseIf"
    // src/xtend/antlr3_2/Xtend.g:489:1: ruleRichStringElseIf : 'ELSEIF' ruleXExpression ruleInternalRichString ;
    public final void ruleRichStringElseIf() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:489:22: ( 'ELSEIF' ruleXExpression ruleInternalRichString )
            // src/xtend/antlr3_2/Xtend.g:490:2: 'ELSEIF' ruleXExpression ruleInternalRichString
            {
            match(input,74,FOLLOW_74_in_ruleRichStringElseIf2703); if (state.failed) return ;
            pushFollow(FOLLOW_ruleXExpression_in_ruleRichStringElseIf2705);
            ruleXExpression();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_ruleInternalRichString_in_ruleRichStringElseIf2707);
            ruleInternalRichString();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "ruleRichStringElseIf"


    // $ANTLR start "ruleXAnnotation"
    // src/xtend/antlr3_2/Xtend.g:494:1: ruleXAnnotation : '@' ruleQualifiedName ( ( ( '(' )=> '(' ) ( ( ( ruleValidID '=' )=> ruleXAnnotationElementValuePair ) ( ',' ( ( ruleValidID '=' )=> ruleXAnnotationElementValuePair ) )* | ruleXAnnotationElementValueOrCommaList )? ')' )? ;
    public final void ruleXAnnotation() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:494:17: ( '@' ruleQualifiedName ( ( ( '(' )=> '(' ) ( ( ( ruleValidID '=' )=> ruleXAnnotationElementValuePair ) ( ',' ( ( ruleValidID '=' )=> ruleXAnnotationElementValuePair ) )* | ruleXAnnotationElementValueOrCommaList )? ')' )? )
            // src/xtend/antlr3_2/Xtend.g:495:2: '@' ruleQualifiedName ( ( ( '(' )=> '(' ) ( ( ( ruleValidID '=' )=> ruleXAnnotationElementValuePair ) ( ',' ( ( ruleValidID '=' )=> ruleXAnnotationElementValuePair ) )* | ruleXAnnotationElementValueOrCommaList )? ')' )?
            {
            match(input,75,FOLLOW_75_in_ruleXAnnotation2718); if (state.failed) return ;
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXAnnotation2720);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:495:24: ( ( ( '(' )=> '(' ) ( ( ( ruleValidID '=' )=> ruleXAnnotationElementValuePair ) ( ',' ( ( ruleValidID '=' )=> ruleXAnnotationElementValuePair ) )* | ruleXAnnotationElementValueOrCommaList )? ')' )?
            int alt146=2;
            alt146 = dfa146.predict(input);
            switch (alt146) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:496:3: ( ( '(' )=> '(' ) ( ( ( ruleValidID '=' )=> ruleXAnnotationElementValuePair ) ( ',' ( ( ruleValidID '=' )=> ruleXAnnotationElementValuePair ) )* | ruleXAnnotationElementValueOrCommaList )? ')'
                    {
                    // src/xtend/antlr3_2/Xtend.g:496:3: ( ( '(' )=> '(' )
                    // src/xtend/antlr3_2/Xtend.g:496:5: ( '(' )=> '('
                    {
                    match(input,40,FOLLOW_40_in_ruleXAnnotation2740); if (state.failed) return ;

                    }

                    // src/xtend/antlr3_2/Xtend.g:498:14: ( ( ( ruleValidID '=' )=> ruleXAnnotationElementValuePair ) ( ',' ( ( ruleValidID '=' )=> ruleXAnnotationElementValuePair ) )* | ruleXAnnotationElementValueOrCommaList )?
                    int alt145=3;
                    alt145 = dfa145.predict(input);
                    switch (alt145) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:499:4: ( ( ruleValidID '=' )=> ruleXAnnotationElementValuePair ) ( ',' ( ( ruleValidID '=' )=> ruleXAnnotationElementValuePair ) )*
                            {
                            // src/xtend/antlr3_2/Xtend.g:499:4: ( ( ruleValidID '=' )=> ruleXAnnotationElementValuePair )
                            // src/xtend/antlr3_2/Xtend.g:499:6: ( ruleValidID '=' )=> ruleXAnnotationElementValuePair
                            {
                            pushFollow(FOLLOW_ruleXAnnotationElementValuePair_in_ruleXAnnotation2767);
                            ruleXAnnotationElementValuePair();

                            state._fsp--;
                            if (state.failed) return ;

                            }

                            // src/xtend/antlr3_2/Xtend.g:501:43: ( ',' ( ( ruleValidID '=' )=> ruleXAnnotationElementValuePair ) )*
                            loop144:
                            do {
                                int alt144=2;
                                int LA144_0 = input.LA(1);

                                if ( (LA144_0==29) ) {
                                    alt144=1;
                                }


                                switch (alt144) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:502:5: ',' ( ( ruleValidID '=' )=> ruleXAnnotationElementValuePair )
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleXAnnotation2777); if (state.failed) return ;
                            	    // src/xtend/antlr3_2/Xtend.g:502:9: ( ( ruleValidID '=' )=> ruleXAnnotationElementValuePair )
                            	    // src/xtend/antlr3_2/Xtend.g:502:11: ( ruleValidID '=' )=> ruleXAnnotationElementValuePair
                            	    {
                            	    pushFollow(FOLLOW_ruleXAnnotationElementValuePair_in_ruleXAnnotation2799);
                            	    ruleXAnnotationElementValuePair();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop144;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // src/xtend/antlr3_2/Xtend.g:506:4: ruleXAnnotationElementValueOrCommaList
                            {
                            pushFollow(FOLLOW_ruleXAnnotationElementValueOrCommaList_in_ruleXAnnotation2814);
                            ruleXAnnotationElementValueOrCommaList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,41,FOLLOW_41_in_ruleXAnnotation2821); if (state.failed) return ;

                    }
                    break;

            }


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
    // $ANTLR end "ruleXAnnotation"


    // $ANTLR start "ruleXAnnotationElementValuePair"
    // src/xtend/antlr3_2/Xtend.g:512:1: ruleXAnnotationElementValuePair : ( ( ruleValidID '=' )=> ( ruleValidID '=' ) ) ruleXAnnotationElementValue ;
    public final void ruleXAnnotationElementValuePair() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:512:33: ( ( ( ruleValidID '=' )=> ( ruleValidID '=' ) ) ruleXAnnotationElementValue )
            // src/xtend/antlr3_2/Xtend.g:513:2: ( ( ruleValidID '=' )=> ( ruleValidID '=' ) ) ruleXAnnotationElementValue
            {
            // src/xtend/antlr3_2/Xtend.g:513:2: ( ( ruleValidID '=' )=> ( ruleValidID '=' ) )
            // src/xtend/antlr3_2/Xtend.g:513:4: ( ruleValidID '=' )=> ( ruleValidID '=' )
            {
            // src/xtend/antlr3_2/Xtend.g:515:7: ( ruleValidID '=' )
            // src/xtend/antlr3_2/Xtend.g:516:3: ruleValidID '='
            {
            pushFollow(FOLLOW_ruleValidID_in_ruleXAnnotationElementValuePair2854);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            match(input,38,FOLLOW_38_in_ruleXAnnotationElementValuePair2856); if (state.failed) return ;

            }


            }

            pushFollow(FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotationElementValuePair2863);
            ruleXAnnotationElementValue();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "ruleXAnnotationElementValuePair"


    // $ANTLR start "ruleXAnnotationElementValueOrCommaList"
    // src/xtend/antlr3_2/Xtend.g:521:1: ruleXAnnotationElementValueOrCommaList : ( ( ( '#' '[' )=> ( '#' '[' ) ) ( ruleXAnnotationOrExpression ( ',' ruleXAnnotationOrExpression )* )? ']' | ruleXAnnotationOrExpression ( ( ',' ruleXAnnotationOrExpression )+ )? );
    public final void ruleXAnnotationElementValueOrCommaList() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:521:40: ( ( ( '#' '[' )=> ( '#' '[' ) ) ( ruleXAnnotationOrExpression ( ',' ruleXAnnotationOrExpression )* )? ']' | ruleXAnnotationOrExpression ( ( ',' ruleXAnnotationOrExpression )+ )? )
            int alt151=2;
            alt151 = dfa151.predict(input);
            switch (alt151) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:522:2: ( ( '#' '[' )=> ( '#' '[' ) ) ( ruleXAnnotationOrExpression ( ',' ruleXAnnotationOrExpression )* )? ']'
                    {
                    // src/xtend/antlr3_2/Xtend.g:522:2: ( ( '#' '[' )=> ( '#' '[' ) )
                    // src/xtend/antlr3_2/Xtend.g:522:4: ( '#' '[' )=> ( '#' '[' )
                    {
                    // src/xtend/antlr3_2/Xtend.g:524:7: ( '#' '[' )
                    // src/xtend/antlr3_2/Xtend.g:525:3: '#' '['
                    {
                    match(input,76,FOLLOW_76_in_ruleXAnnotationElementValueOrCommaList2892); if (state.failed) return ;
                    match(input,77,FOLLOW_77_in_ruleXAnnotationElementValueOrCommaList2894); if (state.failed) return ;

                    }


                    }

                    // src/xtend/antlr3_2/Xtend.g:526:6: ( ruleXAnnotationOrExpression ( ',' ruleXAnnotationOrExpression )* )?
                    int alt148=2;
                    int LA148_0 = input.LA(1);

                    if ( ((LA148_0>=RULE_ID && LA148_0<=RULE_RICH_TEXT_START)||(LA148_0>=RULE_HEX && LA148_0<=RULE_DECIMAL)||LA148_0==25||(LA148_0>=27 && LA148_0<=28)||(LA148_0>=31 && LA148_0<=33)||(LA148_0>=35 && LA148_0<=37)||(LA148_0>=39 && LA148_0<=40)||(LA148_0>=42 && LA148_0<=55)||(LA148_0>=58 && LA148_0<=60)||(LA148_0>=62 && LA148_0<=65)||LA148_0==67||(LA148_0>=75 && LA148_0<=77)||(LA148_0>=98 && LA148_0<=99)||LA148_0==104||LA148_0==112||(LA148_0>=115 && LA148_0<=125)) ) {
                        alt148=1;
                    }
                    switch (alt148) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:527:3: ruleXAnnotationOrExpression ( ',' ruleXAnnotationOrExpression )*
                            {
                            pushFollow(FOLLOW_ruleXAnnotationOrExpression_in_ruleXAnnotationElementValueOrCommaList2905);
                            ruleXAnnotationOrExpression();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:527:31: ( ',' ruleXAnnotationOrExpression )*
                            loop147:
                            do {
                                int alt147=2;
                                int LA147_0 = input.LA(1);

                                if ( (LA147_0==29) ) {
                                    alt147=1;
                                }


                                switch (alt147) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:528:4: ',' ruleXAnnotationOrExpression
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleXAnnotationElementValueOrCommaList2912); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleXAnnotationOrExpression_in_ruleXAnnotationElementValueOrCommaList2914);
                            	    ruleXAnnotationOrExpression();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop147;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,78,FOLLOW_78_in_ruleXAnnotationElementValueOrCommaList2925); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:531:2: ruleXAnnotationOrExpression ( ( ',' ruleXAnnotationOrExpression )+ )?
                    {
                    pushFollow(FOLLOW_ruleXAnnotationOrExpression_in_ruleXAnnotationElementValueOrCommaList2930);
                    ruleXAnnotationOrExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:531:30: ( ( ',' ruleXAnnotationOrExpression )+ )?
                    int alt150=2;
                    int LA150_0 = input.LA(1);

                    if ( (LA150_0==29) ) {
                        alt150=1;
                    }
                    switch (alt150) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:532:3: ( ',' ruleXAnnotationOrExpression )+
                            {
                            // src/xtend/antlr3_2/Xtend.g:532:3: ( ',' ruleXAnnotationOrExpression )+
                            int cnt149=0;
                            loop149:
                            do {
                                int alt149=2;
                                int LA149_0 = input.LA(1);

                                if ( (LA149_0==29) ) {
                                    alt149=1;
                                }


                                switch (alt149) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:533:4: ',' ruleXAnnotationOrExpression
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleXAnnotationElementValueOrCommaList2941); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleXAnnotationOrExpression_in_ruleXAnnotationElementValueOrCommaList2943);
                            	    ruleXAnnotationOrExpression();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt149 >= 1 ) break loop149;
                            	    if (state.backtracking>0) {state.failed=true; return ;}
                                        EarlyExitException eee =
                                            new EarlyExitException(149, input);
                                        throw eee;
                                }
                                cnt149++;
                            } while (true);


                            }
                            break;

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
        }
        return ;
    }
    // $ANTLR end "ruleXAnnotationElementValueOrCommaList"


    // $ANTLR start "ruleXAnnotationElementValue"
    // src/xtend/antlr3_2/Xtend.g:539:1: ruleXAnnotationElementValue : ( ( ( '#' '[' )=> ( '#' '[' ) ) ( ruleXAnnotationOrExpression ( ',' ruleXAnnotationOrExpression )* )? ']' | ruleXAnnotationOrExpression );
    public final void ruleXAnnotationElementValue() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:539:29: ( ( ( '#' '[' )=> ( '#' '[' ) ) ( ruleXAnnotationOrExpression ( ',' ruleXAnnotationOrExpression )* )? ']' | ruleXAnnotationOrExpression )
            int alt154=2;
            alt154 = dfa154.predict(input);
            switch (alt154) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:540:2: ( ( '#' '[' )=> ( '#' '[' ) ) ( ruleXAnnotationOrExpression ( ',' ruleXAnnotationOrExpression )* )? ']'
                    {
                    // src/xtend/antlr3_2/Xtend.g:540:2: ( ( '#' '[' )=> ( '#' '[' ) )
                    // src/xtend/antlr3_2/Xtend.g:540:4: ( '#' '[' )=> ( '#' '[' )
                    {
                    // src/xtend/antlr3_2/Xtend.g:542:7: ( '#' '[' )
                    // src/xtend/antlr3_2/Xtend.g:543:3: '#' '['
                    {
                    match(input,76,FOLLOW_76_in_ruleXAnnotationElementValue2981); if (state.failed) return ;
                    match(input,77,FOLLOW_77_in_ruleXAnnotationElementValue2983); if (state.failed) return ;

                    }


                    }

                    // src/xtend/antlr3_2/Xtend.g:544:6: ( ruleXAnnotationOrExpression ( ',' ruleXAnnotationOrExpression )* )?
                    int alt153=2;
                    int LA153_0 = input.LA(1);

                    if ( ((LA153_0>=RULE_ID && LA153_0<=RULE_RICH_TEXT_START)||(LA153_0>=RULE_HEX && LA153_0<=RULE_DECIMAL)||LA153_0==25||(LA153_0>=27 && LA153_0<=28)||(LA153_0>=31 && LA153_0<=33)||(LA153_0>=35 && LA153_0<=37)||(LA153_0>=39 && LA153_0<=40)||(LA153_0>=42 && LA153_0<=55)||(LA153_0>=58 && LA153_0<=60)||(LA153_0>=62 && LA153_0<=65)||LA153_0==67||(LA153_0>=75 && LA153_0<=77)||(LA153_0>=98 && LA153_0<=99)||LA153_0==104||LA153_0==112||(LA153_0>=115 && LA153_0<=125)) ) {
                        alt153=1;
                    }
                    switch (alt153) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:545:3: ruleXAnnotationOrExpression ( ',' ruleXAnnotationOrExpression )*
                            {
                            pushFollow(FOLLOW_ruleXAnnotationOrExpression_in_ruleXAnnotationElementValue2994);
                            ruleXAnnotationOrExpression();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:545:31: ( ',' ruleXAnnotationOrExpression )*
                            loop152:
                            do {
                                int alt152=2;
                                int LA152_0 = input.LA(1);

                                if ( (LA152_0==29) ) {
                                    alt152=1;
                                }


                                switch (alt152) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:546:4: ',' ruleXAnnotationOrExpression
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleXAnnotationElementValue3001); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleXAnnotationOrExpression_in_ruleXAnnotationElementValue3003);
                            	    ruleXAnnotationOrExpression();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop152;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,78,FOLLOW_78_in_ruleXAnnotationElementValue3014); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:549:2: ruleXAnnotationOrExpression
                    {
                    pushFollow(FOLLOW_ruleXAnnotationOrExpression_in_ruleXAnnotationElementValue3019);
                    ruleXAnnotationOrExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "ruleXAnnotationElementValue"


    // $ANTLR start "ruleXAnnotationOrExpression"
    // src/xtend/antlr3_2/Xtend.g:553:1: ruleXAnnotationOrExpression : ( ruleXAnnotation | ruleXExpression );
    public final void ruleXAnnotationOrExpression() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:553:29: ( ruleXAnnotation | ruleXExpression )
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==75) ) {
                alt155=1;
            }
            else if ( ((LA155_0>=RULE_ID && LA155_0<=RULE_RICH_TEXT_START)||(LA155_0>=RULE_HEX && LA155_0<=RULE_DECIMAL)||LA155_0==25||(LA155_0>=27 && LA155_0<=28)||(LA155_0>=31 && LA155_0<=33)||(LA155_0>=35 && LA155_0<=37)||(LA155_0>=39 && LA155_0<=40)||(LA155_0>=42 && LA155_0<=55)||(LA155_0>=58 && LA155_0<=60)||(LA155_0>=62 && LA155_0<=65)||LA155_0==67||(LA155_0>=76 && LA155_0<=77)||(LA155_0>=98 && LA155_0<=99)||LA155_0==104||LA155_0==112||(LA155_0>=115 && LA155_0<=125)) ) {
                alt155=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 155, 0, input);

                throw nvae;
            }
            switch (alt155) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:554:2: ruleXAnnotation
                    {
                    pushFollow(FOLLOW_ruleXAnnotation_in_ruleXAnnotationOrExpression3030);
                    ruleXAnnotation();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:555:2: ruleXExpression
                    {
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXAnnotationOrExpression3035);
                    ruleXExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "ruleXAnnotationOrExpression"


    // $ANTLR start "ruleXExpression"
    // src/xtend/antlr3_2/Xtend.g:559:1: ruleXExpression : ruleXAssignment ;
    public final void ruleXExpression() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:559:17: ( ruleXAssignment )
            // src/xtend/antlr3_2/Xtend.g:560:2: ruleXAssignment
            {
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression3046);
            ruleXAssignment();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "ruleXAssignment"
    // src/xtend/antlr3_2/Xtend.g:564:1: ruleXAssignment : ( ruleFeatureCallID ruleOpSingleAssign ruleXAssignment | ruleXOrExpression ( ( ( ruleOpMultiAssign )=> ruleOpMultiAssign ) ruleXAssignment )? );
    public final void ruleXAssignment() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:564:17: ( ruleFeatureCallID ruleOpSingleAssign ruleXAssignment | ruleXOrExpression ( ( ( ruleOpMultiAssign )=> ruleOpMultiAssign ) ruleXAssignment )? )
            int alt157=2;
            switch ( input.LA(1) ) {
            case 54:
                {
                int LA157_1 = input.LA(2);

                if ( ((LA157_1>=RULE_ID && LA157_1<=RULE_DECIMAL)||(LA157_1>=25 && LA157_1<=37)||(LA157_1>=39 && LA157_1<=65)||(LA157_1>=67 && LA157_1<=68)||(LA157_1>=75 && LA157_1<=110)||(LA157_1>=112 && LA157_1<=127)) ) {
                    alt157=2;
                }
                else if ( (LA157_1==38) ) {
                    alt157=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 157, 1, input);

                    throw nvae;
                }
                }
                break;
            case 39:
                {
                int LA157_2 = input.LA(2);

                if ( ((LA157_2>=RULE_ID && LA157_2<=RULE_DECIMAL)||(LA157_2>=25 && LA157_2<=37)||(LA157_2>=39 && LA157_2<=65)||(LA157_2>=67 && LA157_2<=68)||(LA157_2>=75 && LA157_2<=110)||(LA157_2>=112 && LA157_2<=127)) ) {
                    alt157=2;
                }
                else if ( (LA157_2==38) ) {
                    alt157=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 157, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_RICH_TEXT:
            case RULE_RICH_TEXT_START:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 28:
            case 33:
            case 40:
            case 43:
            case 67:
            case 76:
            case 77:
            case 98:
            case 99:
            case 104:
            case 112:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
                {
                alt157=2;
                }
                break;
            case RULE_ID:
            case 25:
            case 27:
            case 31:
            case 32:
            case 35:
            case 36:
            case 37:
            case 42:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 58:
            case 59:
            case 60:
            case 62:
            case 63:
            case 64:
            case 65:
                {
                int LA157_4 = input.LA(2);

                if ( (LA157_4==38) ) {
                    alt157=1;
                }
                else if ( ((LA157_4>=RULE_ID && LA157_4<=RULE_DECIMAL)||(LA157_4>=25 && LA157_4<=37)||(LA157_4>=39 && LA157_4<=65)||(LA157_4>=67 && LA157_4<=68)||(LA157_4>=75 && LA157_4<=110)||(LA157_4>=112 && LA157_4<=127)) ) {
                    alt157=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 157, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 157, 0, input);

                throw nvae;
            }

            switch (alt157) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:565:2: ruleFeatureCallID ruleOpSingleAssign ruleXAssignment
                    {
                    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleXAssignment3057);
                    ruleFeatureCallID();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment3059);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment3061);
                    ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:566:2: ruleXOrExpression ( ( ( ruleOpMultiAssign )=> ruleOpMultiAssign ) ruleXAssignment )?
                    {
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment3066);
                    ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:566:20: ( ( ( ruleOpMultiAssign )=> ruleOpMultiAssign ) ruleXAssignment )?
                    int alt156=2;
                    alt156 = dfa156.predict(input);
                    switch (alt156) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:567:3: ( ( ruleOpMultiAssign )=> ruleOpMultiAssign ) ruleXAssignment
                            {
                            // src/xtend/antlr3_2/Xtend.g:567:3: ( ( ruleOpMultiAssign )=> ruleOpMultiAssign )
                            // src/xtend/antlr3_2/Xtend.g:567:5: ( ruleOpMultiAssign )=> ruleOpMultiAssign
                            {
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment3086);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return ;

                            }

                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment3090);
                            ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

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
        }
        return ;
    }
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "ruleOpSingleAssign"
    // src/xtend/antlr3_2/Xtend.g:574:1: ruleOpSingleAssign : '=' ;
    public final void ruleOpSingleAssign() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:574:20: ( '=' )
            // src/xtend/antlr3_2/Xtend.g:575:2: '='
            {
            match(input,38,FOLLOW_38_in_ruleOpSingleAssign3105); if (state.failed) return ;

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
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // src/xtend/antlr3_2/Xtend.g:579:1: ruleOpMultiAssign : ( '+=' | '-=' | '*=' | '/=' | '%=' | '<' '<' '=' | '>' ( '>' )? '>=' );
    public final void ruleOpMultiAssign() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:579:19: ( '+=' | '-=' | '*=' | '/=' | '%=' | '<' '<' '=' | '>' ( '>' )? '>=' )
            int alt159=7;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt159=1;
                }
                break;
            case 80:
                {
                alt159=2;
                }
                break;
            case 81:
                {
                alt159=3;
                }
                break;
            case 82:
                {
                alt159=4;
                }
                break;
            case 83:
                {
                alt159=5;
                }
                break;
            case 28:
                {
                alt159=6;
                }
                break;
            case 30:
                {
                alt159=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 159, 0, input);

                throw nvae;
            }

            switch (alt159) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:580:2: '+='
                    {
                    match(input,79,FOLLOW_79_in_ruleOpMultiAssign3116); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:581:2: '-='
                    {
                    match(input,80,FOLLOW_80_in_ruleOpMultiAssign3121); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/xtend/antlr3_2/Xtend.g:582:2: '*='
                    {
                    match(input,81,FOLLOW_81_in_ruleOpMultiAssign3126); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/xtend/antlr3_2/Xtend.g:583:2: '/='
                    {
                    match(input,82,FOLLOW_82_in_ruleOpMultiAssign3131); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/xtend/antlr3_2/Xtend.g:584:2: '%='
                    {
                    match(input,83,FOLLOW_83_in_ruleOpMultiAssign3136); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // src/xtend/antlr3_2/Xtend.g:585:2: '<' '<' '='
                    {
                    match(input,28,FOLLOW_28_in_ruleOpMultiAssign3141); if (state.failed) return ;
                    match(input,28,FOLLOW_28_in_ruleOpMultiAssign3143); if (state.failed) return ;
                    match(input,38,FOLLOW_38_in_ruleOpMultiAssign3145); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // src/xtend/antlr3_2/Xtend.g:586:2: '>' ( '>' )? '>='
                    {
                    match(input,30,FOLLOW_30_in_ruleOpMultiAssign3150); if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:586:6: ( '>' )?
                    int alt158=2;
                    int LA158_0 = input.LA(1);

                    if ( (LA158_0==30) ) {
                        alt158=1;
                    }
                    switch (alt158) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:586:6: '>'
                            {
                            match(input,30,FOLLOW_30_in_ruleOpMultiAssign3152); if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,84,FOLLOW_84_in_ruleOpMultiAssign3155); if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "ruleXOrExpression"
    // src/xtend/antlr3_2/Xtend.g:590:1: ruleXOrExpression : ruleXAndExpression ( ( ( ruleOpOr )=> ruleOpOr ) ruleXAndExpression )* ;
    public final void ruleXOrExpression() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:590:19: ( ruleXAndExpression ( ( ( ruleOpOr )=> ruleOpOr ) ruleXAndExpression )* )
            // src/xtend/antlr3_2/Xtend.g:591:2: ruleXAndExpression ( ( ( ruleOpOr )=> ruleOpOr ) ruleXAndExpression )*
            {
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression3166);
            ruleXAndExpression();

            state._fsp--;
            if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:591:21: ( ( ( ruleOpOr )=> ruleOpOr ) ruleXAndExpression )*
            loop160:
            do {
                int alt160=2;
                int LA160_0 = input.LA(1);

                if ( (LA160_0==85) ) {
                    int LA160_2 = input.LA(2);

                    if ( (synpred22_Xtend()) ) {
                        alt160=1;
                    }


                }


                switch (alt160) {
            	case 1 :
            	    // src/xtend/antlr3_2/Xtend.g:592:3: ( ( ruleOpOr )=> ruleOpOr ) ruleXAndExpression
            	    {
            	    // src/xtend/antlr3_2/Xtend.g:592:3: ( ( ruleOpOr )=> ruleOpOr )
            	    // src/xtend/antlr3_2/Xtend.g:592:5: ( ruleOpOr )=> ruleOpOr
            	    {
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression3186);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }

            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression3190);
            	    ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop160;
                }
            } while (true);


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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "ruleOpOr"
    // src/xtend/antlr3_2/Xtend.g:599:1: ruleOpOr : '||' ;
    public final void ruleOpOr() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:599:10: ( '||' )
            // src/xtend/antlr3_2/Xtend.g:600:2: '||'
            {
            match(input,85,FOLLOW_85_in_ruleOpOr3205); if (state.failed) return ;

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
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "ruleXAndExpression"
    // src/xtend/antlr3_2/Xtend.g:604:1: ruleXAndExpression : ruleXEqualityExpression ( ( ( ruleOpAnd )=> ruleOpAnd ) ruleXEqualityExpression )* ;
    public final void ruleXAndExpression() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:604:20: ( ruleXEqualityExpression ( ( ( ruleOpAnd )=> ruleOpAnd ) ruleXEqualityExpression )* )
            // src/xtend/antlr3_2/Xtend.g:605:2: ruleXEqualityExpression ( ( ( ruleOpAnd )=> ruleOpAnd ) ruleXEqualityExpression )*
            {
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3216);
            ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:605:26: ( ( ( ruleOpAnd )=> ruleOpAnd ) ruleXEqualityExpression )*
            loop161:
            do {
                int alt161=2;
                int LA161_0 = input.LA(1);

                if ( (LA161_0==86) ) {
                    int LA161_2 = input.LA(2);

                    if ( (synpred23_Xtend()) ) {
                        alt161=1;
                    }


                }


                switch (alt161) {
            	case 1 :
            	    // src/xtend/antlr3_2/Xtend.g:606:3: ( ( ruleOpAnd )=> ruleOpAnd ) ruleXEqualityExpression
            	    {
            	    // src/xtend/antlr3_2/Xtend.g:606:3: ( ( ruleOpAnd )=> ruleOpAnd )
            	    // src/xtend/antlr3_2/Xtend.g:606:5: ( ruleOpAnd )=> ruleOpAnd
            	    {
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression3236);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }

            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3240);
            	    ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop161;
                }
            } while (true);


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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "ruleOpAnd"
    // src/xtend/antlr3_2/Xtend.g:613:1: ruleOpAnd : '&&' ;
    public final void ruleOpAnd() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:613:11: ( '&&' )
            // src/xtend/antlr3_2/Xtend.g:614:2: '&&'
            {
            match(input,86,FOLLOW_86_in_ruleOpAnd3255); if (state.failed) return ;

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
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "ruleXEqualityExpression"
    // src/xtend/antlr3_2/Xtend.g:618:1: ruleXEqualityExpression : ruleXRelationalExpression ( ( ( ruleOpEquality )=> ruleOpEquality ) ruleXRelationalExpression )* ;
    public final void ruleXEqualityExpression() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:618:25: ( ruleXRelationalExpression ( ( ( ruleOpEquality )=> ruleOpEquality ) ruleXRelationalExpression )* )
            // src/xtend/antlr3_2/Xtend.g:619:2: ruleXRelationalExpression ( ( ( ruleOpEquality )=> ruleOpEquality ) ruleXRelationalExpression )*
            {
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3266);
            ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:619:28: ( ( ( ruleOpEquality )=> ruleOpEquality ) ruleXRelationalExpression )*
            loop162:
            do {
                int alt162=2;
                int LA162_0 = input.LA(1);

                if ( ((LA162_0>=87 && LA162_0<=90)) ) {
                    int LA162_2 = input.LA(2);

                    if ( (synpred24_Xtend()) ) {
                        alt162=1;
                    }


                }


                switch (alt162) {
            	case 1 :
            	    // src/xtend/antlr3_2/Xtend.g:620:3: ( ( ruleOpEquality )=> ruleOpEquality ) ruleXRelationalExpression
            	    {
            	    // src/xtend/antlr3_2/Xtend.g:620:3: ( ( ruleOpEquality )=> ruleOpEquality )
            	    // src/xtend/antlr3_2/Xtend.g:620:5: ( ruleOpEquality )=> ruleOpEquality
            	    {
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3286);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }

            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3290);
            	    ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop162;
                }
            } while (true);


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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "ruleOpEquality"
    // src/xtend/antlr3_2/Xtend.g:627:1: ruleOpEquality : ( '==' | '!=' | '===' | '!==' );
    public final void ruleOpEquality() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:627:16: ( '==' | '!=' | '===' | '!==' )
            // src/xtend/antlr3_2/Xtend.g:
            {
            if ( (input.LA(1)>=87 && input.LA(1)<=90) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "ruleXRelationalExpression"
    // src/xtend/antlr3_2/Xtend.g:635:1: ruleXRelationalExpression : ruleXOtherOperatorExpression ( ( ( 'instanceof' )=> 'instanceof' ) ruleJvmTypeReference | ( ( ruleOpCompare )=> ruleOpCompare ) ruleXOtherOperatorExpression )* ;
    public final void ruleXRelationalExpression() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:635:27: ( ruleXOtherOperatorExpression ( ( ( 'instanceof' )=> 'instanceof' ) ruleJvmTypeReference | ( ( ruleOpCompare )=> ruleOpCompare ) ruleXOtherOperatorExpression )* )
            // src/xtend/antlr3_2/Xtend.g:636:2: ruleXOtherOperatorExpression ( ( ( 'instanceof' )=> 'instanceof' ) ruleJvmTypeReference | ( ( ruleOpCompare )=> ruleOpCompare ) ruleXOtherOperatorExpression )*
            {
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3331);
            ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:636:31: ( ( ( 'instanceof' )=> 'instanceof' ) ruleJvmTypeReference | ( ( ruleOpCompare )=> ruleOpCompare ) ruleXOtherOperatorExpression )*
            loop163:
            do {
                int alt163=3;
                switch ( input.LA(1) ) {
                case 28:
                    {
                    int LA163_2 = input.LA(2);

                    if ( (synpred26_Xtend()) ) {
                        alt163=2;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA163_3 = input.LA(2);

                    if ( (synpred26_Xtend()) ) {
                        alt163=2;
                    }


                    }
                    break;
                case 91:
                    {
                    int LA163_4 = input.LA(2);

                    if ( (synpred25_Xtend()) ) {
                        alt163=1;
                    }


                    }
                    break;
                case 84:
                    {
                    int LA163_5 = input.LA(2);

                    if ( (synpred26_Xtend()) ) {
                        alt163=2;
                    }


                    }
                    break;

                }

                switch (alt163) {
            	case 1 :
            	    // src/xtend/antlr3_2/Xtend.g:637:3: ( ( 'instanceof' )=> 'instanceof' ) ruleJvmTypeReference
            	    {
            	    // src/xtend/antlr3_2/Xtend.g:637:3: ( ( 'instanceof' )=> 'instanceof' )
            	    // src/xtend/antlr3_2/Xtend.g:637:5: ( 'instanceof' )=> 'instanceof'
            	    {
            	    match(input,91,FOLLOW_91_in_ruleXRelationalExpression3351); if (state.failed) return ;

            	    }

            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression3355);
            	    ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // src/xtend/antlr3_2/Xtend.g:640:3: ( ( ruleOpCompare )=> ruleOpCompare ) ruleXOtherOperatorExpression
            	    {
            	    // src/xtend/antlr3_2/Xtend.g:640:3: ( ( ruleOpCompare )=> ruleOpCompare )
            	    // src/xtend/antlr3_2/Xtend.g:640:5: ( ruleOpCompare )=> ruleOpCompare
            	    {
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3375);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }

            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3379);
            	    ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop163;
                }
            } while (true);


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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "ruleOpCompare"
    // src/xtend/antlr3_2/Xtend.g:647:1: ruleOpCompare : ( '>=' | '<' '=' | '>' | '<' );
    public final void ruleOpCompare() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:647:15: ( '>=' | '<' '=' | '>' | '<' )
            int alt164=4;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt164=1;
                }
                break;
            case 28:
                {
                int LA164_2 = input.LA(2);

                if ( (LA164_2==38) ) {
                    alt164=2;
                }
                else if ( (LA164_2==EOF||(LA164_2>=RULE_ID && LA164_2<=RULE_RICH_TEXT_START)||(LA164_2>=RULE_HEX && LA164_2<=RULE_DECIMAL)||LA164_2==25||(LA164_2>=27 && LA164_2<=28)||(LA164_2>=31 && LA164_2<=33)||(LA164_2>=35 && LA164_2<=37)||(LA164_2>=39 && LA164_2<=40)||(LA164_2>=42 && LA164_2<=55)||(LA164_2>=58 && LA164_2<=60)||(LA164_2>=62 && LA164_2<=65)||LA164_2==67||(LA164_2>=76 && LA164_2<=77)||(LA164_2>=98 && LA164_2<=99)||LA164_2==104||LA164_2==112||(LA164_2>=115 && LA164_2<=125)) ) {
                    alt164=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 164, 2, input);

                    throw nvae;
                }
                }
                break;
            case 30:
                {
                alt164=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 164, 0, input);

                throw nvae;
            }

            switch (alt164) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:648:2: '>='
                    {
                    match(input,84,FOLLOW_84_in_ruleOpCompare3394); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:649:2: '<' '='
                    {
                    match(input,28,FOLLOW_28_in_ruleOpCompare3399); if (state.failed) return ;
                    match(input,38,FOLLOW_38_in_ruleOpCompare3401); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/xtend/antlr3_2/Xtend.g:650:2: '>'
                    {
                    match(input,30,FOLLOW_30_in_ruleOpCompare3406); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/xtend/antlr3_2/Xtend.g:651:2: '<'
                    {
                    match(input,28,FOLLOW_28_in_ruleOpCompare3411); if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // src/xtend/antlr3_2/Xtend.g:655:1: ruleXOtherOperatorExpression : ruleXAdditiveExpression ( ( ( ruleOpOther )=> ruleOpOther ) ruleXAdditiveExpression )* ;
    public final void ruleXOtherOperatorExpression() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:655:30: ( ruleXAdditiveExpression ( ( ( ruleOpOther )=> ruleOpOther ) ruleXAdditiveExpression )* )
            // src/xtend/antlr3_2/Xtend.g:656:2: ruleXAdditiveExpression ( ( ( ruleOpOther )=> ruleOpOther ) ruleXAdditiveExpression )*
            {
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3422);
            ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:656:26: ( ( ( ruleOpOther )=> ruleOpOther ) ruleXAdditiveExpression )*
            loop165:
            do {
                int alt165=2;
                alt165 = dfa165.predict(input);
                switch (alt165) {
            	case 1 :
            	    // src/xtend/antlr3_2/Xtend.g:657:3: ( ( ruleOpOther )=> ruleOpOther ) ruleXAdditiveExpression
            	    {
            	    // src/xtend/antlr3_2/Xtend.g:657:3: ( ( ruleOpOther )=> ruleOpOther )
            	    // src/xtend/antlr3_2/Xtend.g:657:5: ( ruleOpOther )=> ruleOpOther
            	    {
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3442);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }

            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3446);
            	    ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop165;
                }
            } while (true);


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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "ruleOpOther"
    // src/xtend/antlr3_2/Xtend.g:664:1: ruleOpOther : ( '->' | '..<' | '>' '..' | '..' | '=>' | '>' ( ( ( '>' '>' )=> ( '>' '>' ) ) | '>' ) | '<' ( ( ( '<' '<' )=> ( '<' '<' ) ) | '<' | '=>' ) | '<>' | '?:' );
    public final void ruleOpOther() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:664:13: ( '->' | '..<' | '>' '..' | '..' | '=>' | '>' ( ( ( '>' '>' )=> ( '>' '>' ) ) | '>' ) | '<' ( ( ( '<' '<' )=> ( '<' '<' ) ) | '<' | '=>' ) | '<>' | '?:' )
            int alt168=9;
            alt168 = dfa168.predict(input);
            switch (alt168) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:665:2: '->'
                    {
                    match(input,92,FOLLOW_92_in_ruleOpOther3461); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:666:2: '..<'
                    {
                    match(input,93,FOLLOW_93_in_ruleOpOther3466); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/xtend/antlr3_2/Xtend.g:667:2: '>' '..'
                    {
                    match(input,30,FOLLOW_30_in_ruleOpOther3471); if (state.failed) return ;
                    match(input,94,FOLLOW_94_in_ruleOpOther3473); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/xtend/antlr3_2/Xtend.g:668:2: '..'
                    {
                    match(input,94,FOLLOW_94_in_ruleOpOther3478); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/xtend/antlr3_2/Xtend.g:669:2: '=>'
                    {
                    match(input,95,FOLLOW_95_in_ruleOpOther3483); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // src/xtend/antlr3_2/Xtend.g:670:2: '>' ( ( ( '>' '>' )=> ( '>' '>' ) ) | '>' )
                    {
                    match(input,30,FOLLOW_30_in_ruleOpOther3488); if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:670:6: ( ( ( '>' '>' )=> ( '>' '>' ) ) | '>' )
                    int alt166=2;
                    int LA166_0 = input.LA(1);

                    if ( (LA166_0==30) ) {
                        int LA166_1 = input.LA(2);

                        if ( (LA166_1==30) && (synpred28_Xtend())) {
                            alt166=1;
                        }
                        else if ( (LA166_1==EOF||(LA166_1>=RULE_ID && LA166_1<=RULE_RICH_TEXT_START)||(LA166_1>=RULE_HEX && LA166_1<=RULE_DECIMAL)||LA166_1==25||(LA166_1>=27 && LA166_1<=28)||(LA166_1>=31 && LA166_1<=33)||(LA166_1>=35 && LA166_1<=37)||(LA166_1>=39 && LA166_1<=40)||(LA166_1>=42 && LA166_1<=55)||(LA166_1>=58 && LA166_1<=60)||(LA166_1>=62 && LA166_1<=65)||LA166_1==67||(LA166_1>=76 && LA166_1<=77)||(LA166_1>=98 && LA166_1<=99)||LA166_1==104||LA166_1==112||(LA166_1>=115 && LA166_1<=125)) ) {
                            alt166=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 166, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 166, 0, input);

                        throw nvae;
                    }
                    switch (alt166) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:671:3: ( ( '>' '>' )=> ( '>' '>' ) )
                            {
                            // src/xtend/antlr3_2/Xtend.g:671:3: ( ( '>' '>' )=> ( '>' '>' ) )
                            // src/xtend/antlr3_2/Xtend.g:671:5: ( '>' '>' )=> ( '>' '>' )
                            {
                            // src/xtend/antlr3_2/Xtend.g:673:8: ( '>' '>' )
                            // src/xtend/antlr3_2/Xtend.g:674:4: '>' '>'
                            {
                            match(input,30,FOLLOW_30_in_ruleOpOther3515); if (state.failed) return ;
                            match(input,30,FOLLOW_30_in_ruleOpOther3517); if (state.failed) return ;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // src/xtend/antlr3_2/Xtend.g:676:3: '>'
                            {
                            match(input,30,FOLLOW_30_in_ruleOpOther3529); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // src/xtend/antlr3_2/Xtend.g:678:2: '<' ( ( ( '<' '<' )=> ( '<' '<' ) ) | '<' | '=>' )
                    {
                    match(input,28,FOLLOW_28_in_ruleOpOther3537); if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:678:6: ( ( ( '<' '<' )=> ( '<' '<' ) ) | '<' | '=>' )
                    int alt167=3;
                    int LA167_0 = input.LA(1);

                    if ( (LA167_0==28) ) {
                        int LA167_1 = input.LA(2);

                        if ( (synpred29_Xtend()) ) {
                            alt167=1;
                        }
                        else if ( (true) ) {
                            alt167=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 167, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA167_0==95) ) {
                        alt167=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 167, 0, input);

                        throw nvae;
                    }
                    switch (alt167) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:679:3: ( ( '<' '<' )=> ( '<' '<' ) )
                            {
                            // src/xtend/antlr3_2/Xtend.g:679:3: ( ( '<' '<' )=> ( '<' '<' ) )
                            // src/xtend/antlr3_2/Xtend.g:679:5: ( '<' '<' )=> ( '<' '<' )
                            {
                            // src/xtend/antlr3_2/Xtend.g:681:8: ( '<' '<' )
                            // src/xtend/antlr3_2/Xtend.g:682:4: '<' '<'
                            {
                            match(input,28,FOLLOW_28_in_ruleOpOther3564); if (state.failed) return ;
                            match(input,28,FOLLOW_28_in_ruleOpOther3566); if (state.failed) return ;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // src/xtend/antlr3_2/Xtend.g:684:3: '<'
                            {
                            match(input,28,FOLLOW_28_in_ruleOpOther3578); if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            // src/xtend/antlr3_2/Xtend.g:685:3: '=>'
                            {
                            match(input,95,FOLLOW_95_in_ruleOpOther3584); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // src/xtend/antlr3_2/Xtend.g:687:2: '<>'
                    {
                    match(input,96,FOLLOW_96_in_ruleOpOther3592); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // src/xtend/antlr3_2/Xtend.g:688:2: '?:'
                    {
                    match(input,97,FOLLOW_97_in_ruleOpOther3597); if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "ruleXAdditiveExpression"
    // src/xtend/antlr3_2/Xtend.g:692:1: ruleXAdditiveExpression : ruleXMultiplicativeExpression ( ( ( ruleOpAdd )=> ruleOpAdd ) ruleXMultiplicativeExpression )* ;
    public final void ruleXAdditiveExpression() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:692:25: ( ruleXMultiplicativeExpression ( ( ( ruleOpAdd )=> ruleOpAdd ) ruleXMultiplicativeExpression )* )
            // src/xtend/antlr3_2/Xtend.g:693:2: ruleXMultiplicativeExpression ( ( ( ruleOpAdd )=> ruleOpAdd ) ruleXMultiplicativeExpression )*
            {
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3608);
            ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:693:32: ( ( ( ruleOpAdd )=> ruleOpAdd ) ruleXMultiplicativeExpression )*
            loop169:
            do {
                int alt169=2;
                int LA169_0 = input.LA(1);

                if ( ((LA169_0>=98 && LA169_0<=99)) ) {
                    int LA169_2 = input.LA(2);

                    if ( (synpred30_Xtend()) ) {
                        alt169=1;
                    }


                }


                switch (alt169) {
            	case 1 :
            	    // src/xtend/antlr3_2/Xtend.g:694:3: ( ( ruleOpAdd )=> ruleOpAdd ) ruleXMultiplicativeExpression
            	    {
            	    // src/xtend/antlr3_2/Xtend.g:694:3: ( ( ruleOpAdd )=> ruleOpAdd )
            	    // src/xtend/antlr3_2/Xtend.g:694:5: ( ruleOpAdd )=> ruleOpAdd
            	    {
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3628);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }

            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3632);
            	    ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop169;
                }
            } while (true);


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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "ruleOpAdd"
    // src/xtend/antlr3_2/Xtend.g:701:1: ruleOpAdd : ( '+' | '-' );
    public final void ruleOpAdd() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:701:11: ( '+' | '-' )
            // src/xtend/antlr3_2/Xtend.g:
            {
            if ( (input.LA(1)>=98 && input.LA(1)<=99) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // src/xtend/antlr3_2/Xtend.g:707:1: ruleXMultiplicativeExpression : ruleXUnaryOperation ( ( ( ruleOpMulti )=> ruleOpMulti ) ruleXUnaryOperation )* ;
    public final void ruleXMultiplicativeExpression() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:707:31: ( ruleXUnaryOperation ( ( ( ruleOpMulti )=> ruleOpMulti ) ruleXUnaryOperation )* )
            // src/xtend/antlr3_2/Xtend.g:708:2: ruleXUnaryOperation ( ( ( ruleOpMulti )=> ruleOpMulti ) ruleXUnaryOperation )*
            {
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3663);
            ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:708:22: ( ( ( ruleOpMulti )=> ruleOpMulti ) ruleXUnaryOperation )*
            loop170:
            do {
                int alt170=2;
                int LA170_0 = input.LA(1);

                if ( ((LA170_0>=100 && LA170_0<=103)) ) {
                    int LA170_2 = input.LA(2);

                    if ( (synpred31_Xtend()) ) {
                        alt170=1;
                    }


                }


                switch (alt170) {
            	case 1 :
            	    // src/xtend/antlr3_2/Xtend.g:709:3: ( ( ruleOpMulti )=> ruleOpMulti ) ruleXUnaryOperation
            	    {
            	    // src/xtend/antlr3_2/Xtend.g:709:3: ( ( ruleOpMulti )=> ruleOpMulti )
            	    // src/xtend/antlr3_2/Xtend.g:709:5: ( ruleOpMulti )=> ruleOpMulti
            	    {
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3683);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }

            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3687);
            	    ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop170;
                }
            } while (true);


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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "ruleOpMulti"
    // src/xtend/antlr3_2/Xtend.g:716:1: ruleOpMulti : ( '*' | '**' | '/' | '%' );
    public final void ruleOpMulti() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:716:13: ( '*' | '**' | '/' | '%' )
            // src/xtend/antlr3_2/Xtend.g:
            {
            if ( (input.LA(1)>=100 && input.LA(1)<=103) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "ruleXUnaryOperation"
    // src/xtend/antlr3_2/Xtend.g:724:1: ruleXUnaryOperation : ( ruleOpUnary ruleXUnaryOperation | ruleXCastedExpression );
    public final void ruleXUnaryOperation() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:724:21: ( ruleOpUnary ruleXUnaryOperation | ruleXCastedExpression )
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( ((LA171_0>=98 && LA171_0<=99)||LA171_0==104) ) {
                alt171=1;
            }
            else if ( ((LA171_0>=RULE_ID && LA171_0<=RULE_RICH_TEXT_START)||(LA171_0>=RULE_HEX && LA171_0<=RULE_DECIMAL)||LA171_0==25||(LA171_0>=27 && LA171_0<=28)||(LA171_0>=31 && LA171_0<=33)||(LA171_0>=35 && LA171_0<=37)||(LA171_0>=39 && LA171_0<=40)||(LA171_0>=42 && LA171_0<=55)||(LA171_0>=58 && LA171_0<=60)||(LA171_0>=62 && LA171_0<=65)||LA171_0==67||(LA171_0>=76 && LA171_0<=77)||LA171_0==112||(LA171_0>=115 && LA171_0<=125)) ) {
                alt171=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 171, 0, input);

                throw nvae;
            }
            switch (alt171) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:725:2: ruleOpUnary ruleXUnaryOperation
                    {
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3728);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXUnaryOperation3730);
                    ruleXUnaryOperation();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:726:2: ruleXCastedExpression
                    {
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3735);
                    ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "ruleOpUnary"
    // src/xtend/antlr3_2/Xtend.g:730:1: ruleOpUnary : ( '!' | '-' | '+' );
    public final void ruleOpUnary() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:730:13: ( '!' | '-' | '+' )
            // src/xtend/antlr3_2/Xtend.g:
            {
            if ( (input.LA(1)>=98 && input.LA(1)<=99)||input.LA(1)==104 ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "ruleXCastedExpression"
    // src/xtend/antlr3_2/Xtend.g:737:1: ruleXCastedExpression : ruleXPostfixOperation ( ( ( 'as' )=> 'as' ) ruleJvmTypeReference )* ;
    public final void ruleXCastedExpression() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:737:23: ( ruleXPostfixOperation ( ( ( 'as' )=> 'as' ) ruleJvmTypeReference )* )
            // src/xtend/antlr3_2/Xtend.g:738:2: ruleXPostfixOperation ( ( ( 'as' )=> 'as' ) ruleJvmTypeReference )*
            {
            pushFollow(FOLLOW_ruleXPostfixOperation_in_ruleXCastedExpression3767);
            ruleXPostfixOperation();

            state._fsp--;
            if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:738:24: ( ( ( 'as' )=> 'as' ) ruleJvmTypeReference )*
            loop172:
            do {
                int alt172=2;
                int LA172_0 = input.LA(1);

                if ( (LA172_0==105) ) {
                    int LA172_2 = input.LA(2);

                    if ( (synpred32_Xtend()) ) {
                        alt172=1;
                    }


                }


                switch (alt172) {
            	case 1 :
            	    // src/xtend/antlr3_2/Xtend.g:739:3: ( ( 'as' )=> 'as' ) ruleJvmTypeReference
            	    {
            	    // src/xtend/antlr3_2/Xtend.g:739:3: ( ( 'as' )=> 'as' )
            	    // src/xtend/antlr3_2/Xtend.g:739:5: ( 'as' )=> 'as'
            	    {
            	    match(input,105,FOLLOW_105_in_ruleXCastedExpression3787); if (state.failed) return ;

            	    }

            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3791);
            	    ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop172;
                }
            } while (true);


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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "ruleXPostfixOperation"
    // src/xtend/antlr3_2/Xtend.g:746:1: ruleXPostfixOperation : ruleXMemberFeatureCall ( ( ruleOpPostfix )=> ruleOpPostfix )? ;
    public final void ruleXPostfixOperation() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:746:23: ( ruleXMemberFeatureCall ( ( ruleOpPostfix )=> ruleOpPostfix )? )
            // src/xtend/antlr3_2/Xtend.g:747:2: ruleXMemberFeatureCall ( ( ruleOpPostfix )=> ruleOpPostfix )?
            {
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXPostfixOperation3806);
            ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:747:25: ( ( ruleOpPostfix )=> ruleOpPostfix )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( ((LA173_0>=106 && LA173_0<=107)) ) {
                int LA173_1 = input.LA(2);

                if ( (synpred33_Xtend()) ) {
                    alt173=1;
                }
            }
            switch (alt173) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:747:27: ( ruleOpPostfix )=> ruleOpPostfix
                    {
                    pushFollow(FOLLOW_ruleOpPostfix_in_ruleXPostfixOperation3820);
                    ruleOpPostfix();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


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
    // $ANTLR end "ruleXPostfixOperation"


    // $ANTLR start "ruleOpPostfix"
    // src/xtend/antlr3_2/Xtend.g:753:1: ruleOpPostfix : ( '++' | '--' );
    public final void ruleOpPostfix() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:753:15: ( '++' | '--' )
            // src/xtend/antlr3_2/Xtend.g:
            {
            if ( (input.LA(1)>=106 && input.LA(1)<=107) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "ruleOpPostfix"


    // $ANTLR start "ruleXMemberFeatureCall"
    // src/xtend/antlr3_2/Xtend.g:759:1: ruleXMemberFeatureCall : ruleXPrimaryExpression ( ( ( ( '.' | '::' ) ruleFeatureCallID ruleOpSingleAssign )=> ( ( '.' | '::' ) ruleFeatureCallID ruleOpSingleAssign ) ) ruleXAssignment | ( ( '.' | '?.' | '::' )=> ( '.' | '?.' | '::' ) ) ( '<' ruleJvmArgumentTypeReference ( ',' ruleJvmArgumentTypeReference )* '>' )? ruleIdOrSuper ( ( ( '(' )=> '(' ) ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )? ')' )? ( ( '[' )=> ruleXClosure )? )* ;
    public final void ruleXMemberFeatureCall() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:759:24: ( ruleXPrimaryExpression ( ( ( ( '.' | '::' ) ruleFeatureCallID ruleOpSingleAssign )=> ( ( '.' | '::' ) ruleFeatureCallID ruleOpSingleAssign ) ) ruleXAssignment | ( ( '.' | '?.' | '::' )=> ( '.' | '?.' | '::' ) ) ( '<' ruleJvmArgumentTypeReference ( ',' ruleJvmArgumentTypeReference )* '>' )? ruleIdOrSuper ( ( ( '(' )=> '(' ) ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )? ')' )? ( ( '[' )=> ruleXClosure )? )* )
            // src/xtend/antlr3_2/Xtend.g:760:2: ruleXPrimaryExpression ( ( ( ( '.' | '::' ) ruleFeatureCallID ruleOpSingleAssign )=> ( ( '.' | '::' ) ruleFeatureCallID ruleOpSingleAssign ) ) ruleXAssignment | ( ( '.' | '?.' | '::' )=> ( '.' | '?.' | '::' ) ) ( '<' ruleJvmArgumentTypeReference ( ',' ruleJvmArgumentTypeReference )* '>' )? ruleIdOrSuper ( ( ( '(' )=> '(' ) ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )? ')' )? ( ( '[' )=> ruleXClosure )? )*
            {
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3850);
            ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:760:25: ( ( ( ( '.' | '::' ) ruleFeatureCallID ruleOpSingleAssign )=> ( ( '.' | '::' ) ruleFeatureCallID ruleOpSingleAssign ) ) ruleXAssignment | ( ( '.' | '?.' | '::' )=> ( '.' | '?.' | '::' ) ) ( '<' ruleJvmArgumentTypeReference ( ',' ruleJvmArgumentTypeReference )* '>' )? ruleIdOrSuper ( ( ( '(' )=> '(' ) ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )? ')' )? ( ( '[' )=> ruleXClosure )? )*
            loop180:
            do {
                int alt180=3;
                int LA180_0 = input.LA(1);

                if ( ((LA180_0>=108 && LA180_0<=109)) ) {
                    int LA180_2 = input.LA(2);

                    if ( (synpred34_Xtend()) ) {
                        alt180=1;
                    }
                    else if ( (synpred35_Xtend()) ) {
                        alt180=2;
                    }


                }
                else if ( (LA180_0==110) ) {
                    int LA180_3 = input.LA(2);

                    if ( (synpred35_Xtend()) ) {
                        alt180=2;
                    }


                }


                switch (alt180) {
            	case 1 :
            	    // src/xtend/antlr3_2/Xtend.g:761:3: ( ( ( '.' | '::' ) ruleFeatureCallID ruleOpSingleAssign )=> ( ( '.' | '::' ) ruleFeatureCallID ruleOpSingleAssign ) ) ruleXAssignment
            	    {
            	    // src/xtend/antlr3_2/Xtend.g:761:3: ( ( ( '.' | '::' ) ruleFeatureCallID ruleOpSingleAssign )=> ( ( '.' | '::' ) ruleFeatureCallID ruleOpSingleAssign ) )
            	    // src/xtend/antlr3_2/Xtend.g:761:5: ( ( '.' | '::' ) ruleFeatureCallID ruleOpSingleAssign )=> ( ( '.' | '::' ) ruleFeatureCallID ruleOpSingleAssign )
            	    {
            	    // src/xtend/antlr3_2/Xtend.g:766:8: ( ( '.' | '::' ) ruleFeatureCallID ruleOpSingleAssign )
            	    // src/xtend/antlr3_2/Xtend.g:767:4: ( '.' | '::' ) ruleFeatureCallID ruleOpSingleAssign
            	    {
            	    if ( (input.LA(1)>=108 && input.LA(1)<=109) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall3916);
            	    ruleFeatureCallID();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3918);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }


            	    }

            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3926);
            	    ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // src/xtend/antlr3_2/Xtend.g:772:3: ( ( '.' | '?.' | '::' )=> ( '.' | '?.' | '::' ) ) ( '<' ruleJvmArgumentTypeReference ( ',' ruleJvmArgumentTypeReference )* '>' )? ruleIdOrSuper ( ( ( '(' )=> '(' ) ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )? ')' )? ( ( '[' )=> ruleXClosure )?
            	    {
            	    // src/xtend/antlr3_2/Xtend.g:772:3: ( ( '.' | '?.' | '::' )=> ( '.' | '?.' | '::' ) )
            	    // src/xtend/antlr3_2/Xtend.g:772:5: ( '.' | '?.' | '::' )=> ( '.' | '?.' | '::' )
            	    {
            	    if ( (input.LA(1)>=108 && input.LA(1)<=110) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }

            	    // src/xtend/antlr3_2/Xtend.g:780:7: ( '<' ruleJvmArgumentTypeReference ( ',' ruleJvmArgumentTypeReference )* '>' )?
            	    int alt175=2;
            	    int LA175_0 = input.LA(1);

            	    if ( (LA175_0==28) ) {
            	        alt175=1;
            	    }
            	    switch (alt175) {
            	        case 1 :
            	            // src/xtend/antlr3_2/Xtend.g:781:4: '<' ruleJvmArgumentTypeReference ( ',' ruleJvmArgumentTypeReference )* '>'
            	            {
            	            match(input,28,FOLLOW_28_in_ruleXMemberFeatureCall3990); if (state.failed) return ;
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3992);
            	            ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return ;
            	            // src/xtend/antlr3_2/Xtend.g:781:37: ( ',' ruleJvmArgumentTypeReference )*
            	            loop174:
            	            do {
            	                int alt174=2;
            	                int LA174_0 = input.LA(1);

            	                if ( (LA174_0==29) ) {
            	                    alt174=1;
            	                }


            	                switch (alt174) {
            	            	case 1 :
            	            	    // src/xtend/antlr3_2/Xtend.g:782:5: ',' ruleJvmArgumentTypeReference
            	            	    {
            	            	    match(input,29,FOLLOW_29_in_ruleXMemberFeatureCall4000); if (state.failed) return ;
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4002);
            	            	    ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return ;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop174;
            	                }
            	            } while (true);

            	            match(input,30,FOLLOW_30_in_ruleXMemberFeatureCall4010); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXMemberFeatureCall4017);
            	    ruleIdOrSuper();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    // src/xtend/antlr3_2/Xtend.g:784:20: ( ( ( '(' )=> '(' ) ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )? ')' )?
            	    int alt178=2;
            	    alt178 = dfa178.predict(input);
            	    switch (alt178) {
            	        case 1 :
            	            // src/xtend/antlr3_2/Xtend.g:785:4: ( ( '(' )=> '(' ) ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )? ')'
            	            {
            	            // src/xtend/antlr3_2/Xtend.g:785:4: ( ( '(' )=> '(' )
            	            // src/xtend/antlr3_2/Xtend.g:785:6: ( '(' )=> '('
            	            {
            	            match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall4040); if (state.failed) return ;

            	            }

            	            // src/xtend/antlr3_2/Xtend.g:787:15: ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )?
            	            int alt177=3;
            	            alt177 = dfa177.predict(input);
            	            switch (alt177) {
            	                case 1 :
            	                    // src/xtend/antlr3_2/Xtend.g:788:5: ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure )
            	                    {
            	                    // src/xtend/antlr3_2/Xtend.g:788:5: ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure )
            	                    // src/xtend/antlr3_2/Xtend.g:788:7: ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure
            	                    {
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4104);
            	                    ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return ;

            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // src/xtend/antlr3_2/Xtend.g:795:5: ruleXExpression ( ',' ruleXExpression )*
            	                    {
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4114);
            	                    ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return ;
            	                    // src/xtend/antlr3_2/Xtend.g:795:21: ( ',' ruleXExpression )*
            	                    loop176:
            	                    do {
            	                        int alt176=2;
            	                        int LA176_0 = input.LA(1);

            	                        if ( (LA176_0==29) ) {
            	                            alt176=1;
            	                        }


            	                        switch (alt176) {
            	                    	case 1 :
            	                    	    // src/xtend/antlr3_2/Xtend.g:796:6: ',' ruleXExpression
            	                    	    {
            	                    	    match(input,29,FOLLOW_29_in_ruleXMemberFeatureCall4123); if (state.failed) return ;
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4125);
            	                    	    ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return ;

            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop176;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4140); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    // src/xtend/antlr3_2/Xtend.g:799:6: ( ( '[' )=> ruleXClosure )?
            	    int alt179=2;
            	    alt179 = dfa179.predict(input);
            	    switch (alt179) {
            	        case 1 :
            	            // src/xtend/antlr3_2/Xtend.g:799:8: ( '[' )=> ruleXClosure
            	            {
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4161);
            	            ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop180;
                }
            } while (true);


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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "ruleXPrimaryExpression"
    // src/xtend/antlr3_2/Xtend.g:806:1: ruleXPrimaryExpression : ( ruleXConstructorCall | ruleXBlockExpression | ruleXSwitchExpression | ( ( 'synchronized' '(' )=> ruleXSynchronizedExpression ) | ruleXFeatureCall | ruleXLiteral | ruleXIfExpression | ( ( 'for' '(' ruleJvmFormalParameter ':' )=> ruleXForLoopExpression ) | ruleXBasicForLoopExpression | ruleXWhileExpression | ruleXDoWhileExpression | ruleXThrowExpression | ruleXReturnExpression | ruleXTryCatchFinallyExpression | ruleXParenthesizedExpression );
    public final void ruleXPrimaryExpression() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:806:24: ( ruleXConstructorCall | ruleXBlockExpression | ruleXSwitchExpression | ( ( 'synchronized' '(' )=> ruleXSynchronizedExpression ) | ruleXFeatureCall | ruleXLiteral | ruleXIfExpression | ( ( 'for' '(' ruleJvmFormalParameter ':' )=> ruleXForLoopExpression ) | ruleXBasicForLoopExpression | ruleXWhileExpression | ruleXDoWhileExpression | ruleXThrowExpression | ruleXReturnExpression | ruleXTryCatchFinallyExpression | ruleXParenthesizedExpression )
            int alt181=15;
            alt181 = dfa181.predict(input);
            switch (alt181) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:807:2: ruleXConstructorCall
                    {
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4179);
                    ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:808:2: ruleXBlockExpression
                    {
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4184);
                    ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/xtend/antlr3_2/Xtend.g:809:2: ruleXSwitchExpression
                    {
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4189);
                    ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/xtend/antlr3_2/Xtend.g:810:2: ( ( 'synchronized' '(' )=> ruleXSynchronizedExpression )
                    {
                    // src/xtend/antlr3_2/Xtend.g:810:2: ( ( 'synchronized' '(' )=> ruleXSynchronizedExpression )
                    // src/xtend/antlr3_2/Xtend.g:810:4: ( 'synchronized' '(' )=> ruleXSynchronizedExpression
                    {
                    pushFollow(FOLLOW_ruleXSynchronizedExpression_in_ruleXPrimaryExpression4208);
                    ruleXSynchronizedExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 5 :
                    // src/xtend/antlr3_2/Xtend.g:813:2: ruleXFeatureCall
                    {
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4215);
                    ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // src/xtend/antlr3_2/Xtend.g:814:2: ruleXLiteral
                    {
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4220);
                    ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // src/xtend/antlr3_2/Xtend.g:815:2: ruleXIfExpression
                    {
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4225);
                    ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // src/xtend/antlr3_2/Xtend.g:816:2: ( ( 'for' '(' ruleJvmFormalParameter ':' )=> ruleXForLoopExpression )
                    {
                    // src/xtend/antlr3_2/Xtend.g:816:2: ( ( 'for' '(' ruleJvmFormalParameter ':' )=> ruleXForLoopExpression )
                    // src/xtend/antlr3_2/Xtend.g:816:4: ( 'for' '(' ruleJvmFormalParameter ':' )=> ruleXForLoopExpression
                    {
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4248);
                    ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 9 :
                    // src/xtend/antlr3_2/Xtend.g:819:2: ruleXBasicForLoopExpression
                    {
                    pushFollow(FOLLOW_ruleXBasicForLoopExpression_in_ruleXPrimaryExpression4255);
                    ruleXBasicForLoopExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // src/xtend/antlr3_2/Xtend.g:820:2: ruleXWhileExpression
                    {
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4260);
                    ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // src/xtend/antlr3_2/Xtend.g:821:2: ruleXDoWhileExpression
                    {
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4265);
                    ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // src/xtend/antlr3_2/Xtend.g:822:2: ruleXThrowExpression
                    {
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4270);
                    ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // src/xtend/antlr3_2/Xtend.g:823:2: ruleXReturnExpression
                    {
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4275);
                    ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 14 :
                    // src/xtend/antlr3_2/Xtend.g:824:2: ruleXTryCatchFinallyExpression
                    {
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4280);
                    ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 15 :
                    // src/xtend/antlr3_2/Xtend.g:825:2: ruleXParenthesizedExpression
                    {
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4285);
                    ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "ruleXLiteral"
    // src/xtend/antlr3_2/Xtend.g:829:1: ruleXLiteral : ( ruleXCollectionLiteral | ( ( '[' )=> ruleXClosure ) | ruleXBooleanLiteral | ruleXNumberLiteral | ruleXNullLiteral | ruleXStringLiteral | ruleXTypeLiteral );
    public final void ruleXLiteral() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:829:14: ( ruleXCollectionLiteral | ( ( '[' )=> ruleXClosure ) | ruleXBooleanLiteral | ruleXNumberLiteral | ruleXNullLiteral | ruleXStringLiteral | ruleXTypeLiteral )
            int alt182=7;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==76) ) {
                alt182=1;
            }
            else if ( (LA182_0==77) && (synpred41_Xtend())) {
                alt182=2;
            }
            else if ( ((LA182_0>=119 && LA182_0<=120)) ) {
                alt182=3;
            }
            else if ( ((LA182_0>=RULE_HEX && LA182_0<=RULE_DECIMAL)) ) {
                alt182=4;
            }
            else if ( (LA182_0==121) ) {
                alt182=5;
            }
            else if ( ((LA182_0>=RULE_STRING && LA182_0<=RULE_RICH_TEXT_START)) ) {
                alt182=6;
            }
            else if ( (LA182_0==122) ) {
                alt182=7;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 182, 0, input);

                throw nvae;
            }
            switch (alt182) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:830:2: ruleXCollectionLiteral
                    {
                    pushFollow(FOLLOW_ruleXCollectionLiteral_in_ruleXLiteral4296);
                    ruleXCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:831:2: ( ( '[' )=> ruleXClosure )
                    {
                    // src/xtend/antlr3_2/Xtend.g:831:2: ( ( '[' )=> ruleXClosure )
                    // src/xtend/antlr3_2/Xtend.g:831:4: ( '[' )=> ruleXClosure
                    {
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4313);
                    ruleXClosure();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // src/xtend/antlr3_2/Xtend.g:834:2: ruleXBooleanLiteral
                    {
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4320);
                    ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/xtend/antlr3_2/Xtend.g:835:2: ruleXNumberLiteral
                    {
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4325);
                    ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/xtend/antlr3_2/Xtend.g:836:2: ruleXNullLiteral
                    {
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral4330);
                    ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // src/xtend/antlr3_2/Xtend.g:837:2: ruleXStringLiteral
                    {
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral4335);
                    ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // src/xtend/antlr3_2/Xtend.g:838:2: ruleXTypeLiteral
                    {
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4340);
                    ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "ruleXCollectionLiteral"
    // src/xtend/antlr3_2/Xtend.g:842:1: ruleXCollectionLiteral : ( ruleXSetLiteral | ruleXListLiteral );
    public final void ruleXCollectionLiteral() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:842:24: ( ruleXSetLiteral | ruleXListLiteral )
            int alt183=2;
            int LA183_0 = input.LA(1);

            if ( (LA183_0==76) ) {
                int LA183_1 = input.LA(2);

                if ( (LA183_1==33) ) {
                    alt183=1;
                }
                else if ( (LA183_1==77) ) {
                    alt183=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 183, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 183, 0, input);

                throw nvae;
            }
            switch (alt183) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:843:2: ruleXSetLiteral
                    {
                    pushFollow(FOLLOW_ruleXSetLiteral_in_ruleXCollectionLiteral4351);
                    ruleXSetLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:844:2: ruleXListLiteral
                    {
                    pushFollow(FOLLOW_ruleXListLiteral_in_ruleXCollectionLiteral4356);
                    ruleXListLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "ruleXCollectionLiteral"


    // $ANTLR start "ruleXSetLiteral"
    // src/xtend/antlr3_2/Xtend.g:848:1: ruleXSetLiteral : '#' '{' ( ruleXExpression ( ',' ruleXExpression )* )? '}' ;
    public final void ruleXSetLiteral() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:848:17: ( '#' '{' ( ruleXExpression ( ',' ruleXExpression )* )? '}' )
            // src/xtend/antlr3_2/Xtend.g:849:2: '#' '{' ( ruleXExpression ( ',' ruleXExpression )* )? '}'
            {
            match(input,76,FOLLOW_76_in_ruleXSetLiteral4367); if (state.failed) return ;
            match(input,33,FOLLOW_33_in_ruleXSetLiteral4369); if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:849:10: ( ruleXExpression ( ',' ruleXExpression )* )?
            int alt185=2;
            int LA185_0 = input.LA(1);

            if ( ((LA185_0>=RULE_ID && LA185_0<=RULE_RICH_TEXT_START)||(LA185_0>=RULE_HEX && LA185_0<=RULE_DECIMAL)||LA185_0==25||(LA185_0>=27 && LA185_0<=28)||(LA185_0>=31 && LA185_0<=33)||(LA185_0>=35 && LA185_0<=37)||(LA185_0>=39 && LA185_0<=40)||(LA185_0>=42 && LA185_0<=55)||(LA185_0>=58 && LA185_0<=60)||(LA185_0>=62 && LA185_0<=65)||LA185_0==67||(LA185_0>=76 && LA185_0<=77)||(LA185_0>=98 && LA185_0<=99)||LA185_0==104||LA185_0==112||(LA185_0>=115 && LA185_0<=125)) ) {
                alt185=1;
            }
            switch (alt185) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:850:3: ruleXExpression ( ',' ruleXExpression )*
                    {
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSetLiteral4375);
                    ruleXExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:850:19: ( ',' ruleXExpression )*
                    loop184:
                    do {
                        int alt184=2;
                        int LA184_0 = input.LA(1);

                        if ( (LA184_0==29) ) {
                            alt184=1;
                        }


                        switch (alt184) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:851:4: ',' ruleXExpression
                    	    {
                    	    match(input,29,FOLLOW_29_in_ruleXSetLiteral4382); if (state.failed) return ;
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXSetLiteral4384);
                    	    ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop184;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,34,FOLLOW_34_in_ruleXSetLiteral4395); if (state.failed) return ;

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
    // $ANTLR end "ruleXSetLiteral"


    // $ANTLR start "ruleXListLiteral"
    // src/xtend/antlr3_2/Xtend.g:857:1: ruleXListLiteral : '#' '[' ( ruleXExpression ( ',' ruleXExpression )* )? ']' ;
    public final void ruleXListLiteral() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:857:18: ( '#' '[' ( ruleXExpression ( ',' ruleXExpression )* )? ']' )
            // src/xtend/antlr3_2/Xtend.g:858:2: '#' '[' ( ruleXExpression ( ',' ruleXExpression )* )? ']'
            {
            match(input,76,FOLLOW_76_in_ruleXListLiteral4406); if (state.failed) return ;
            match(input,77,FOLLOW_77_in_ruleXListLiteral4408); if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:858:10: ( ruleXExpression ( ',' ruleXExpression )* )?
            int alt187=2;
            int LA187_0 = input.LA(1);

            if ( ((LA187_0>=RULE_ID && LA187_0<=RULE_RICH_TEXT_START)||(LA187_0>=RULE_HEX && LA187_0<=RULE_DECIMAL)||LA187_0==25||(LA187_0>=27 && LA187_0<=28)||(LA187_0>=31 && LA187_0<=33)||(LA187_0>=35 && LA187_0<=37)||(LA187_0>=39 && LA187_0<=40)||(LA187_0>=42 && LA187_0<=55)||(LA187_0>=58 && LA187_0<=60)||(LA187_0>=62 && LA187_0<=65)||LA187_0==67||(LA187_0>=76 && LA187_0<=77)||(LA187_0>=98 && LA187_0<=99)||LA187_0==104||LA187_0==112||(LA187_0>=115 && LA187_0<=125)) ) {
                alt187=1;
            }
            switch (alt187) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:859:3: ruleXExpression ( ',' ruleXExpression )*
                    {
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXListLiteral4414);
                    ruleXExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:859:19: ( ',' ruleXExpression )*
                    loop186:
                    do {
                        int alt186=2;
                        int LA186_0 = input.LA(1);

                        if ( (LA186_0==29) ) {
                            alt186=1;
                        }


                        switch (alt186) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:860:4: ',' ruleXExpression
                    	    {
                    	    match(input,29,FOLLOW_29_in_ruleXListLiteral4421); if (state.failed) return ;
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXListLiteral4423);
                    	    ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop186;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,78,FOLLOW_78_in_ruleXListLiteral4434); if (state.failed) return ;

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
    // $ANTLR end "ruleXListLiteral"


    // $ANTLR start "ruleXClosure"
    // src/xtend/antlr3_2/Xtend.g:866:1: ruleXClosure : ( ( '[' )=> '[' ) ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' ) )? ruleXExpressionInClosure ']' ;
    public final void ruleXClosure() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:866:14: ( ( ( '[' )=> '[' ) ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' ) )? ruleXExpressionInClosure ']' )
            // src/xtend/antlr3_2/Xtend.g:867:2: ( ( '[' )=> '[' ) ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' ) )? ruleXExpressionInClosure ']'
            {
            // src/xtend/antlr3_2/Xtend.g:867:2: ( ( '[' )=> '[' )
            // src/xtend/antlr3_2/Xtend.g:867:4: ( '[' )=> '['
            {
            match(input,77,FOLLOW_77_in_ruleXClosure4457); if (state.failed) return ;

            }

            // src/xtend/antlr3_2/Xtend.g:869:13: ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' ) )?
            int alt190=2;
            alt190 = dfa190.predict(input);
            switch (alt190) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:869:15: ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )
                    {
                    // src/xtend/antlr3_2/Xtend.g:875:7: ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )
                    // src/xtend/antlr3_2/Xtend.g:876:3: ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|'
                    {
                    // src/xtend/antlr3_2/Xtend.g:876:3: ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )?
                    int alt189=2;
                    int LA189_0 = input.LA(1);

                    if ( (LA189_0==RULE_ID||LA189_0==25||LA189_0==27||(LA189_0>=31 && LA189_0<=32)||(LA189_0>=35 && LA189_0<=37)||(LA189_0>=39 && LA189_0<=40)||LA189_0==42||(LA189_0>=44 && LA189_0<=55)||(LA189_0>=58 && LA189_0<=60)||(LA189_0>=62 && LA189_0<=65)||LA189_0==95) ) {
                        alt189=1;
                    }
                    switch (alt189) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:877:4: ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )*
                            {
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure4506);
                            ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:877:27: ( ',' ruleJvmFormalParameter )*
                            loop188:
                            do {
                                int alt188=2;
                                int LA188_0 = input.LA(1);

                                if ( (LA188_0==29) ) {
                                    alt188=1;
                                }


                                switch (alt188) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:878:5: ',' ruleJvmFormalParameter
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleXClosure4514); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure4516);
                            	    ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop188;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,111,FOLLOW_111_in_ruleXClosure4529); if (state.failed) return ;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure4537);
            ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return ;
            match(input,78,FOLLOW_78_in_ruleXClosure4539); if (state.failed) return ;

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
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // src/xtend/antlr3_2/Xtend.g:885:1: ruleXExpressionInClosure : ( ruleXExpressionOrVarDeclaration ( ';' )? )* ;
    public final void ruleXExpressionInClosure() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:885:26: ( ( ruleXExpressionOrVarDeclaration ( ';' )? )* )
            // src/xtend/antlr3_2/Xtend.g:886:2: ( ruleXExpressionOrVarDeclaration ( ';' )? )*
            {
            // src/xtend/antlr3_2/Xtend.g:886:2: ( ruleXExpressionOrVarDeclaration ( ';' )? )*
            loop192:
            do {
                int alt192=2;
                int LA192_0 = input.LA(1);

                if ( ((LA192_0>=RULE_ID && LA192_0<=RULE_RICH_TEXT_START)||(LA192_0>=RULE_HEX && LA192_0<=RULE_DECIMAL)||LA192_0==25||(LA192_0>=27 && LA192_0<=28)||(LA192_0>=31 && LA192_0<=33)||(LA192_0>=35 && LA192_0<=37)||(LA192_0>=39 && LA192_0<=40)||(LA192_0>=42 && LA192_0<=60)||(LA192_0>=62 && LA192_0<=65)||LA192_0==67||(LA192_0>=76 && LA192_0<=77)||(LA192_0>=98 && LA192_0<=99)||LA192_0==104||LA192_0==112||(LA192_0>=115 && LA192_0<=125)) ) {
                    alt192=1;
                }


                switch (alt192) {
            	case 1 :
            	    // src/xtend/antlr3_2/Xtend.g:887:3: ruleXExpressionOrVarDeclaration ( ';' )?
            	    {
            	    pushFollow(FOLLOW_ruleXExpressionOrVarDeclaration_in_ruleXExpressionInClosure4554);
            	    ruleXExpressionOrVarDeclaration();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    // src/xtend/antlr3_2/Xtend.g:887:35: ( ';' )?
            	    int alt191=2;
            	    int LA191_0 = input.LA(1);

            	    if ( (LA191_0==26) ) {
            	        alt191=1;
            	    }
            	    switch (alt191) {
            	        case 1 :
            	            // src/xtend/antlr3_2/Xtend.g:887:35: ';'
            	            {
            	            match(input,26,FOLLOW_26_in_ruleXExpressionInClosure4556); if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop192;
                }
            } while (true);


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
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "ruleXShortClosure"
    // src/xtend/antlr3_2/Xtend.g:892:1: ruleXShortClosure : ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' ) ) ruleXExpression ;
    public final void ruleXShortClosure() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:892:19: ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' ) ) ruleXExpression )
            // src/xtend/antlr3_2/Xtend.g:893:2: ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' ) ) ruleXExpression
            {
            // src/xtend/antlr3_2/Xtend.g:893:2: ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' ) )
            // src/xtend/antlr3_2/Xtend.g:893:4: ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )
            {
            // src/xtend/antlr3_2/Xtend.g:899:7: ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )
            // src/xtend/antlr3_2/Xtend.g:900:3: ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|'
            {
            // src/xtend/antlr3_2/Xtend.g:900:3: ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )?
            int alt194=2;
            int LA194_0 = input.LA(1);

            if ( (LA194_0==RULE_ID||LA194_0==25||LA194_0==27||(LA194_0>=31 && LA194_0<=32)||(LA194_0>=35 && LA194_0<=37)||(LA194_0>=39 && LA194_0<=40)||LA194_0==42||(LA194_0>=44 && LA194_0<=55)||(LA194_0>=58 && LA194_0<=60)||(LA194_0>=62 && LA194_0<=65)||LA194_0==95) ) {
                alt194=1;
            }
            switch (alt194) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:901:4: ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )*
                    {
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure4617);
                    ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:901:27: ( ',' ruleJvmFormalParameter )*
                    loop193:
                    do {
                        int alt193=2;
                        int LA193_0 = input.LA(1);

                        if ( (LA193_0==29) ) {
                            alt193=1;
                        }


                        switch (alt193) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:902:5: ',' ruleJvmFormalParameter
                    	    {
                    	    match(input,29,FOLLOW_29_in_ruleXShortClosure4625); if (state.failed) return ;
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure4627);
                    	    ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop193;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,111,FOLLOW_111_in_ruleXShortClosure4640); if (state.failed) return ;

            }


            }

            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure4647);
            ruleXExpression();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "ruleXParenthesizedExpression"
    // src/xtend/antlr3_2/Xtend.g:909:1: ruleXParenthesizedExpression : '(' ruleXExpression ')' ;
    public final void ruleXParenthesizedExpression() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:909:30: ( '(' ruleXExpression ')' )
            // src/xtend/antlr3_2/Xtend.g:910:2: '(' ruleXExpression ')'
            {
            match(input,40,FOLLOW_40_in_ruleXParenthesizedExpression4658); if (state.failed) return ;
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression4660);
            ruleXExpression();

            state._fsp--;
            if (state.failed) return ;
            match(input,41,FOLLOW_41_in_ruleXParenthesizedExpression4662); if (state.failed) return ;

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
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "ruleXIfExpression"
    // src/xtend/antlr3_2/Xtend.g:914:1: ruleXIfExpression : 'if' '(' ruleXExpression ')' ruleXExpression ( ( ( 'else' )=> 'else' ) ruleXExpression )? ;
    public final void ruleXIfExpression() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:914:19: ( 'if' '(' ruleXExpression ')' ruleXExpression ( ( ( 'else' )=> 'else' ) ruleXExpression )? )
            // src/xtend/antlr3_2/Xtend.g:915:2: 'if' '(' ruleXExpression ')' ruleXExpression ( ( ( 'else' )=> 'else' ) ruleXExpression )?
            {
            match(input,112,FOLLOW_112_in_ruleXIfExpression4673); if (state.failed) return ;
            match(input,40,FOLLOW_40_in_ruleXIfExpression4675); if (state.failed) return ;
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression4677);
            ruleXExpression();

            state._fsp--;
            if (state.failed) return ;
            match(input,41,FOLLOW_41_in_ruleXIfExpression4679); if (state.failed) return ;
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression4681);
            ruleXExpression();

            state._fsp--;
            if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:915:47: ( ( ( 'else' )=> 'else' ) ruleXExpression )?
            int alt195=2;
            int LA195_0 = input.LA(1);

            if ( (LA195_0==113) ) {
                int LA195_1 = input.LA(2);

                if ( (synpred45_Xtend()) ) {
                    alt195=1;
                }
            }
            switch (alt195) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:916:3: ( ( 'else' )=> 'else' ) ruleXExpression
                    {
                    // src/xtend/antlr3_2/Xtend.g:916:3: ( ( 'else' )=> 'else' )
                    // src/xtend/antlr3_2/Xtend.g:916:5: ( 'else' )=> 'else'
                    {
                    match(input,113,FOLLOW_113_in_ruleXIfExpression4701); if (state.failed) return ;

                    }

                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression4705);
                    ruleXExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


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
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "ruleXCasePart"
    // src/xtend/antlr3_2/Xtend.g:923:1: ruleXCasePart : ( ruleJvmTypeReference )? ( 'case' ruleXExpression )? ( ':' ruleXExpression | ',' ) ;
    public final void ruleXCasePart() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:923:15: ( ( ruleJvmTypeReference )? ( 'case' ruleXExpression )? ( ':' ruleXExpression | ',' ) )
            // src/xtend/antlr3_2/Xtend.g:924:2: ( ruleJvmTypeReference )? ( 'case' ruleXExpression )? ( ':' ruleXExpression | ',' )
            {
            // src/xtend/antlr3_2/Xtend.g:924:2: ( ruleJvmTypeReference )?
            int alt196=2;
            int LA196_0 = input.LA(1);

            if ( (LA196_0==RULE_ID||LA196_0==37||LA196_0==40||LA196_0==60||(LA196_0>=62 && LA196_0<=64)||LA196_0==95) ) {
                alt196=1;
            }
            switch (alt196) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:924:2: ruleJvmTypeReference
                    {
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart4720);
                    ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // src/xtend/antlr3_2/Xtend.g:924:24: ( 'case' ruleXExpression )?
            int alt197=2;
            int LA197_0 = input.LA(1);

            if ( (LA197_0==114) ) {
                alt197=1;
            }
            switch (alt197) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:925:3: 'case' ruleXExpression
                    {
                    match(input,114,FOLLOW_114_in_ruleXCasePart4727); if (state.failed) return ;
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart4729);
                    ruleXExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // src/xtend/antlr3_2/Xtend.g:926:5: ( ':' ruleXExpression | ',' )
            int alt198=2;
            int LA198_0 = input.LA(1);

            if ( (LA198_0==61) ) {
                alt198=1;
            }
            else if ( (LA198_0==29) ) {
                alt198=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 198, 0, input);

                throw nvae;
            }
            switch (alt198) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:927:3: ':' ruleXExpression
                    {
                    match(input,61,FOLLOW_61_in_ruleXCasePart4739); if (state.failed) return ;
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart4741);
                    ruleXExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:928:3: ','
                    {
                    match(input,29,FOLLOW_29_in_ruleXCasePart4747); if (state.failed) return ;

                    }
                    break;

            }


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
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "ruleXForLoopExpression"
    // src/xtend/antlr3_2/Xtend.g:933:1: ruleXForLoopExpression : ( ( 'for' '(' ruleJvmFormalParameter ':' )=> ( 'for' '(' ruleJvmFormalParameter ':' ) ) ruleXExpression ')' ruleXExpression ;
    public final void ruleXForLoopExpression() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:933:24: ( ( ( 'for' '(' ruleJvmFormalParameter ':' )=> ( 'for' '(' ruleJvmFormalParameter ':' ) ) ruleXExpression ')' ruleXExpression )
            // src/xtend/antlr3_2/Xtend.g:934:2: ( ( 'for' '(' ruleJvmFormalParameter ':' )=> ( 'for' '(' ruleJvmFormalParameter ':' ) ) ruleXExpression ')' ruleXExpression
            {
            // src/xtend/antlr3_2/Xtend.g:934:2: ( ( 'for' '(' ruleJvmFormalParameter ':' )=> ( 'for' '(' ruleJvmFormalParameter ':' ) )
            // src/xtend/antlr3_2/Xtend.g:934:4: ( 'for' '(' ruleJvmFormalParameter ':' )=> ( 'for' '(' ruleJvmFormalParameter ':' )
            {
            // src/xtend/antlr3_2/Xtend.g:936:7: ( 'for' '(' ruleJvmFormalParameter ':' )
            // src/xtend/antlr3_2/Xtend.g:937:3: 'for' '(' ruleJvmFormalParameter ':'
            {
            match(input,115,FOLLOW_115_in_ruleXForLoopExpression4783); if (state.failed) return ;
            match(input,40,FOLLOW_40_in_ruleXForLoopExpression4785); if (state.failed) return ;
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression4787);
            ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return ;
            match(input,61,FOLLOW_61_in_ruleXForLoopExpression4789); if (state.failed) return ;

            }


            }

            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression4796);
            ruleXExpression();

            state._fsp--;
            if (state.failed) return ;
            match(input,41,FOLLOW_41_in_ruleXForLoopExpression4798); if (state.failed) return ;
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression4800);
            ruleXExpression();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "ruleXBasicForLoopExpression"
    // src/xtend/antlr3_2/Xtend.g:942:1: ruleXBasicForLoopExpression : 'for' '(' ( ruleXExpressionOrVarDeclaration ( ',' ruleXExpressionOrVarDeclaration )* )? ';' ( ruleXExpression )? ';' ( ruleXExpression ( ',' ruleXExpression )* )? ')' ruleXExpression ;
    public final void ruleXBasicForLoopExpression() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:942:29: ( 'for' '(' ( ruleXExpressionOrVarDeclaration ( ',' ruleXExpressionOrVarDeclaration )* )? ';' ( ruleXExpression )? ';' ( ruleXExpression ( ',' ruleXExpression )* )? ')' ruleXExpression )
            // src/xtend/antlr3_2/Xtend.g:943:2: 'for' '(' ( ruleXExpressionOrVarDeclaration ( ',' ruleXExpressionOrVarDeclaration )* )? ';' ( ruleXExpression )? ';' ( ruleXExpression ( ',' ruleXExpression )* )? ')' ruleXExpression
            {
            match(input,115,FOLLOW_115_in_ruleXBasicForLoopExpression4811); if (state.failed) return ;
            match(input,40,FOLLOW_40_in_ruleXBasicForLoopExpression4813); if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:943:12: ( ruleXExpressionOrVarDeclaration ( ',' ruleXExpressionOrVarDeclaration )* )?
            int alt200=2;
            int LA200_0 = input.LA(1);

            if ( ((LA200_0>=RULE_ID && LA200_0<=RULE_RICH_TEXT_START)||(LA200_0>=RULE_HEX && LA200_0<=RULE_DECIMAL)||LA200_0==25||(LA200_0>=27 && LA200_0<=28)||(LA200_0>=31 && LA200_0<=33)||(LA200_0>=35 && LA200_0<=37)||(LA200_0>=39 && LA200_0<=40)||(LA200_0>=42 && LA200_0<=60)||(LA200_0>=62 && LA200_0<=65)||LA200_0==67||(LA200_0>=76 && LA200_0<=77)||(LA200_0>=98 && LA200_0<=99)||LA200_0==104||LA200_0==112||(LA200_0>=115 && LA200_0<=125)) ) {
                alt200=1;
            }
            switch (alt200) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:944:3: ruleXExpressionOrVarDeclaration ( ',' ruleXExpressionOrVarDeclaration )*
                    {
                    pushFollow(FOLLOW_ruleXExpressionOrVarDeclaration_in_ruleXBasicForLoopExpression4819);
                    ruleXExpressionOrVarDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:944:35: ( ',' ruleXExpressionOrVarDeclaration )*
                    loop199:
                    do {
                        int alt199=2;
                        int LA199_0 = input.LA(1);

                        if ( (LA199_0==29) ) {
                            alt199=1;
                        }


                        switch (alt199) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:945:4: ',' ruleXExpressionOrVarDeclaration
                    	    {
                    	    match(input,29,FOLLOW_29_in_ruleXBasicForLoopExpression4826); if (state.failed) return ;
                    	    pushFollow(FOLLOW_ruleXExpressionOrVarDeclaration_in_ruleXBasicForLoopExpression4828);
                    	    ruleXExpressionOrVarDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop199;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,26,FOLLOW_26_in_ruleXBasicForLoopExpression4839); if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:947:9: ( ruleXExpression )?
            int alt201=2;
            int LA201_0 = input.LA(1);

            if ( ((LA201_0>=RULE_ID && LA201_0<=RULE_RICH_TEXT_START)||(LA201_0>=RULE_HEX && LA201_0<=RULE_DECIMAL)||LA201_0==25||(LA201_0>=27 && LA201_0<=28)||(LA201_0>=31 && LA201_0<=33)||(LA201_0>=35 && LA201_0<=37)||(LA201_0>=39 && LA201_0<=40)||(LA201_0>=42 && LA201_0<=55)||(LA201_0>=58 && LA201_0<=60)||(LA201_0>=62 && LA201_0<=65)||LA201_0==67||(LA201_0>=76 && LA201_0<=77)||(LA201_0>=98 && LA201_0<=99)||LA201_0==104||LA201_0==112||(LA201_0>=115 && LA201_0<=125)) ) {
                alt201=1;
            }
            switch (alt201) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:947:9: ruleXExpression
                    {
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXBasicForLoopExpression4841);
                    ruleXExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,26,FOLLOW_26_in_ruleXBasicForLoopExpression4844); if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:947:30: ( ruleXExpression ( ',' ruleXExpression )* )?
            int alt203=2;
            int LA203_0 = input.LA(1);

            if ( ((LA203_0>=RULE_ID && LA203_0<=RULE_RICH_TEXT_START)||(LA203_0>=RULE_HEX && LA203_0<=RULE_DECIMAL)||LA203_0==25||(LA203_0>=27 && LA203_0<=28)||(LA203_0>=31 && LA203_0<=33)||(LA203_0>=35 && LA203_0<=37)||(LA203_0>=39 && LA203_0<=40)||(LA203_0>=42 && LA203_0<=55)||(LA203_0>=58 && LA203_0<=60)||(LA203_0>=62 && LA203_0<=65)||LA203_0==67||(LA203_0>=76 && LA203_0<=77)||(LA203_0>=98 && LA203_0<=99)||LA203_0==104||LA203_0==112||(LA203_0>=115 && LA203_0<=125)) ) {
                alt203=1;
            }
            switch (alt203) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:948:3: ruleXExpression ( ',' ruleXExpression )*
                    {
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXBasicForLoopExpression4850);
                    ruleXExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:948:19: ( ',' ruleXExpression )*
                    loop202:
                    do {
                        int alt202=2;
                        int LA202_0 = input.LA(1);

                        if ( (LA202_0==29) ) {
                            alt202=1;
                        }


                        switch (alt202) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:949:4: ',' ruleXExpression
                    	    {
                    	    match(input,29,FOLLOW_29_in_ruleXBasicForLoopExpression4857); if (state.failed) return ;
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXBasicForLoopExpression4859);
                    	    ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop202;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,41,FOLLOW_41_in_ruleXBasicForLoopExpression4870); if (state.failed) return ;
            pushFollow(FOLLOW_ruleXExpression_in_ruleXBasicForLoopExpression4872);
            ruleXExpression();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "ruleXBasicForLoopExpression"


    // $ANTLR start "ruleXWhileExpression"
    // src/xtend/antlr3_2/Xtend.g:955:1: ruleXWhileExpression : 'while' '(' ruleXExpression ')' ruleXExpression ;
    public final void ruleXWhileExpression() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:955:22: ( 'while' '(' ruleXExpression ')' ruleXExpression )
            // src/xtend/antlr3_2/Xtend.g:956:2: 'while' '(' ruleXExpression ')' ruleXExpression
            {
            match(input,116,FOLLOW_116_in_ruleXWhileExpression4883); if (state.failed) return ;
            match(input,40,FOLLOW_40_in_ruleXWhileExpression4885); if (state.failed) return ;
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression4887);
            ruleXExpression();

            state._fsp--;
            if (state.failed) return ;
            match(input,41,FOLLOW_41_in_ruleXWhileExpression4889); if (state.failed) return ;
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression4891);
            ruleXExpression();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // src/xtend/antlr3_2/Xtend.g:960:1: ruleXDoWhileExpression : 'do' ruleXExpression 'while' '(' ruleXExpression ')' ;
    public final void ruleXDoWhileExpression() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:960:24: ( 'do' ruleXExpression 'while' '(' ruleXExpression ')' )
            // src/xtend/antlr3_2/Xtend.g:961:2: 'do' ruleXExpression 'while' '(' ruleXExpression ')'
            {
            match(input,117,FOLLOW_117_in_ruleXDoWhileExpression4902); if (state.failed) return ;
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression4904);
            ruleXExpression();

            state._fsp--;
            if (state.failed) return ;
            match(input,116,FOLLOW_116_in_ruleXDoWhileExpression4906); if (state.failed) return ;
            match(input,40,FOLLOW_40_in_ruleXDoWhileExpression4908); if (state.failed) return ;
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression4910);
            ruleXExpression();

            state._fsp--;
            if (state.failed) return ;
            match(input,41,FOLLOW_41_in_ruleXDoWhileExpression4912); if (state.failed) return ;

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
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "ruleXBlockExpression"
    // src/xtend/antlr3_2/Xtend.g:965:1: ruleXBlockExpression : '{' ( ruleXExpressionOrVarDeclaration ( ';' )? )* '}' ;
    public final void ruleXBlockExpression() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:965:22: ( '{' ( ruleXExpressionOrVarDeclaration ( ';' )? )* '}' )
            // src/xtend/antlr3_2/Xtend.g:966:2: '{' ( ruleXExpressionOrVarDeclaration ( ';' )? )* '}'
            {
            match(input,33,FOLLOW_33_in_ruleXBlockExpression4923); if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:966:6: ( ruleXExpressionOrVarDeclaration ( ';' )? )*
            loop205:
            do {
                int alt205=2;
                int LA205_0 = input.LA(1);

                if ( ((LA205_0>=RULE_ID && LA205_0<=RULE_RICH_TEXT_START)||(LA205_0>=RULE_HEX && LA205_0<=RULE_DECIMAL)||LA205_0==25||(LA205_0>=27 && LA205_0<=28)||(LA205_0>=31 && LA205_0<=33)||(LA205_0>=35 && LA205_0<=37)||(LA205_0>=39 && LA205_0<=40)||(LA205_0>=42 && LA205_0<=60)||(LA205_0>=62 && LA205_0<=65)||LA205_0==67||(LA205_0>=76 && LA205_0<=77)||(LA205_0>=98 && LA205_0<=99)||LA205_0==104||LA205_0==112||(LA205_0>=115 && LA205_0<=125)) ) {
                    alt205=1;
                }


                switch (alt205) {
            	case 1 :
            	    // src/xtend/antlr3_2/Xtend.g:967:3: ruleXExpressionOrVarDeclaration ( ';' )?
            	    {
            	    pushFollow(FOLLOW_ruleXExpressionOrVarDeclaration_in_ruleXBlockExpression4929);
            	    ruleXExpressionOrVarDeclaration();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    // src/xtend/antlr3_2/Xtend.g:967:35: ( ';' )?
            	    int alt204=2;
            	    int LA204_0 = input.LA(1);

            	    if ( (LA204_0==26) ) {
            	        alt204=1;
            	    }
            	    switch (alt204) {
            	        case 1 :
            	            // src/xtend/antlr3_2/Xtend.g:967:35: ';'
            	            {
            	            match(input,26,FOLLOW_26_in_ruleXBlockExpression4931); if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop205;
                }
            } while (true);

            match(input,34,FOLLOW_34_in_ruleXBlockExpression4938); if (state.failed) return ;

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
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "ruleXExpressionOrVarDeclaration"
    // src/xtend/antlr3_2/Xtend.g:972:1: ruleXExpressionOrVarDeclaration : ( ( ( ( 'var' | 'val' ) ( 'extension' )? | 'extension' ( 'var' | 'val' ) )=> ruleXVariableDeclaration ) | ruleXExpression );
    public final void ruleXExpressionOrVarDeclaration() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:972:33: ( ( ( ( 'var' | 'val' ) ( 'extension' )? | 'extension' ( 'var' | 'val' ) )=> ruleXVariableDeclaration ) | ruleXExpression )
            int alt206=2;
            int LA206_0 = input.LA(1);

            if ( ((LA206_0>=56 && LA206_0<=57)) && (synpred47_Xtend())) {
                alt206=1;
            }
            else if ( (LA206_0==39) ) {
                int LA206_2 = input.LA(2);

                if ( ((LA206_2>=56 && LA206_2<=57)) ) {
                    int LA206_4 = input.LA(3);

                    if ( (synpred47_Xtend()) ) {
                        alt206=1;
                    }
                    else if ( (true) ) {
                        alt206=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 206, 4, input);

                        throw nvae;
                    }
                }
                else if ( ((LA206_2>=RULE_ID && LA206_2<=RULE_DECIMAL)||(LA206_2>=25 && LA206_2<=40)||(LA206_2>=42 && LA206_2<=55)||(LA206_2>=58 && LA206_2<=60)||(LA206_2>=62 && LA206_2<=65)||LA206_2==67||(LA206_2>=76 && LA206_2<=110)||LA206_2==112||(LA206_2>=115 && LA206_2<=125)) ) {
                    alt206=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 206, 2, input);

                    throw nvae;
                }
            }
            else if ( ((LA206_0>=RULE_ID && LA206_0<=RULE_RICH_TEXT_START)||(LA206_0>=RULE_HEX && LA206_0<=RULE_DECIMAL)||LA206_0==25||(LA206_0>=27 && LA206_0<=28)||(LA206_0>=31 && LA206_0<=33)||(LA206_0>=35 && LA206_0<=37)||LA206_0==40||(LA206_0>=42 && LA206_0<=55)||(LA206_0>=58 && LA206_0<=60)||(LA206_0>=62 && LA206_0<=65)||LA206_0==67||(LA206_0>=76 && LA206_0<=77)||(LA206_0>=98 && LA206_0<=99)||LA206_0==104||LA206_0==112||(LA206_0>=115 && LA206_0<=125)) ) {
                alt206=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 206, 0, input);

                throw nvae;
            }
            switch (alt206) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:973:2: ( ( ( 'var' | 'val' ) ( 'extension' )? | 'extension' ( 'var' | 'val' ) )=> ruleXVariableDeclaration )
                    {
                    // src/xtend/antlr3_2/Xtend.g:973:2: ( ( ( 'var' | 'val' ) ( 'extension' )? | 'extension' ( 'var' | 'val' ) )=> ruleXVariableDeclaration )
                    // src/xtend/antlr3_2/Xtend.g:973:4: ( ( 'var' | 'val' ) ( 'extension' )? | 'extension' ( 'var' | 'val' ) )=> ruleXVariableDeclaration
                    {
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionOrVarDeclaration4997);
                    ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:983:2: ruleXExpression
                    {
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionOrVarDeclaration5004);
                    ruleXExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "ruleXExpressionOrVarDeclaration"


    // $ANTLR start "ruleXFeatureCall"
    // src/xtend/antlr3_2/Xtend.g:987:1: ruleXFeatureCall : ( '<' ruleJvmArgumentTypeReference ( ',' ruleJvmArgumentTypeReference )* '>' )? ruleIdOrSuper ( ( ( '(' )=> '(' ) ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )? ')' )? ( ( '[' )=> ruleXClosure )? ;
    public final void ruleXFeatureCall() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:987:18: ( ( '<' ruleJvmArgumentTypeReference ( ',' ruleJvmArgumentTypeReference )* '>' )? ruleIdOrSuper ( ( ( '(' )=> '(' ) ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )? ')' )? ( ( '[' )=> ruleXClosure )? )
            // src/xtend/antlr3_2/Xtend.g:988:2: ( '<' ruleJvmArgumentTypeReference ( ',' ruleJvmArgumentTypeReference )* '>' )? ruleIdOrSuper ( ( ( '(' )=> '(' ) ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )? ')' )? ( ( '[' )=> ruleXClosure )?
            {
            // src/xtend/antlr3_2/Xtend.g:988:2: ( '<' ruleJvmArgumentTypeReference ( ',' ruleJvmArgumentTypeReference )* '>' )?
            int alt208=2;
            int LA208_0 = input.LA(1);

            if ( (LA208_0==28) ) {
                alt208=1;
            }
            switch (alt208) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:989:3: '<' ruleJvmArgumentTypeReference ( ',' ruleJvmArgumentTypeReference )* '>'
                    {
                    match(input,28,FOLLOW_28_in_ruleXFeatureCall5019); if (state.failed) return ;
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall5021);
                    ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:989:36: ( ',' ruleJvmArgumentTypeReference )*
                    loop207:
                    do {
                        int alt207=2;
                        int LA207_0 = input.LA(1);

                        if ( (LA207_0==29) ) {
                            alt207=1;
                        }


                        switch (alt207) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:990:4: ',' ruleJvmArgumentTypeReference
                    	    {
                    	    match(input,29,FOLLOW_29_in_ruleXFeatureCall5028); if (state.failed) return ;
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall5030);
                    	    ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop207;
                        }
                    } while (true);

                    match(input,30,FOLLOW_30_in_ruleXFeatureCall5037); if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall5043);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:992:19: ( ( ( '(' )=> '(' ) ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )? ')' )?
            int alt211=2;
            alt211 = dfa211.predict(input);
            switch (alt211) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:993:3: ( ( '(' )=> '(' ) ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )? ')'
                    {
                    // src/xtend/antlr3_2/Xtend.g:993:3: ( ( '(' )=> '(' )
                    // src/xtend/antlr3_2/Xtend.g:993:5: ( '(' )=> '('
                    {
                    match(input,40,FOLLOW_40_in_ruleXFeatureCall5063); if (state.failed) return ;

                    }

                    // src/xtend/antlr3_2/Xtend.g:995:14: ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )?
                    int alt210=3;
                    alt210 = dfa210.predict(input);
                    switch (alt210) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:996:4: ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure )
                            {
                            // src/xtend/antlr3_2/Xtend.g:996:4: ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure )
                            // src/xtend/antlr3_2/Xtend.g:996:6: ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure
                            {
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall5120);
                            ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return ;

                            }


                            }
                            break;
                        case 2 :
                            // src/xtend/antlr3_2/Xtend.g:1003:4: ruleXExpression ( ',' ruleXExpression )*
                            {
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall5129);
                            ruleXExpression();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:1003:20: ( ',' ruleXExpression )*
                            loop209:
                            do {
                                int alt209=2;
                                int LA209_0 = input.LA(1);

                                if ( (LA209_0==29) ) {
                                    alt209=1;
                                }


                                switch (alt209) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:1004:5: ',' ruleXExpression
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleXFeatureCall5137); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall5139);
                            	    ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop209;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,41,FOLLOW_41_in_ruleXFeatureCall5152); if (state.failed) return ;

                    }
                    break;

            }

            // src/xtend/antlr3_2/Xtend.g:1007:5: ( ( '[' )=> ruleXClosure )?
            int alt212=2;
            alt212 = dfa212.predict(input);
            switch (alt212) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:1007:7: ( '[' )=> ruleXClosure
                    {
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall5170);
                    ruleXClosure();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


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
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "ruleIdOrSuper"
    // src/xtend/antlr3_2/Xtend.g:1013:1: ruleIdOrSuper : ( ruleFeatureCallID | 'super' );
    public final void ruleIdOrSuper() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1013:15: ( ruleFeatureCallID | 'super' )
            int alt213=2;
            int LA213_0 = input.LA(1);

            if ( (LA213_0==RULE_ID||LA213_0==25||LA213_0==27||(LA213_0>=31 && LA213_0<=32)||(LA213_0>=35 && LA213_0<=37)||LA213_0==39||LA213_0==42||(LA213_0>=44 && LA213_0<=55)||(LA213_0>=58 && LA213_0<=60)||(LA213_0>=62 && LA213_0<=65)) ) {
                alt213=1;
            }
            else if ( (LA213_0==118) ) {
                alt213=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 213, 0, input);

                throw nvae;
            }
            switch (alt213) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:1014:2: ruleFeatureCallID
                    {
                    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleIdOrSuper5184);
                    ruleFeatureCallID();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:1015:2: 'super'
                    {
                    match(input,118,FOLLOW_118_in_ruleIdOrSuper5189); if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "ruleXBooleanLiteral"
    // src/xtend/antlr3_2/Xtend.g:1019:1: ruleXBooleanLiteral : ( 'false' | 'true' );
    public final void ruleXBooleanLiteral() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1019:21: ( 'false' | 'true' )
            // src/xtend/antlr3_2/Xtend.g:
            {
            if ( (input.LA(1)>=119 && input.LA(1)<=120) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // src/xtend/antlr3_2/Xtend.g:1025:1: ruleXNullLiteral : 'null' ;
    public final void ruleXNullLiteral() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1025:18: ( 'null' )
            // src/xtend/antlr3_2/Xtend.g:1026:2: 'null'
            {
            match(input,121,FOLLOW_121_in_ruleXNullLiteral5216); if (state.failed) return ;

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
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // src/xtend/antlr3_2/Xtend.g:1030:1: ruleXNumberLiteral : ruleNumber ;
    public final void ruleXNumberLiteral() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1030:20: ( ruleNumber )
            // src/xtend/antlr3_2/Xtend.g:1031:2: ruleNumber
            {
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral5227);
            ruleNumber();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // src/xtend/antlr3_2/Xtend.g:1035:1: ruleXTypeLiteral : 'typeof' '(' ruleQualifiedName ( ruleArrayBrackets )* ')' ;
    public final void ruleXTypeLiteral() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1035:18: ( 'typeof' '(' ruleQualifiedName ( ruleArrayBrackets )* ')' )
            // src/xtend/antlr3_2/Xtend.g:1036:2: 'typeof' '(' ruleQualifiedName ( ruleArrayBrackets )* ')'
            {
            match(input,122,FOLLOW_122_in_ruleXTypeLiteral5238); if (state.failed) return ;
            match(input,40,FOLLOW_40_in_ruleXTypeLiteral5240); if (state.failed) return ;
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral5242);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:1036:33: ( ruleArrayBrackets )*
            loop214:
            do {
                int alt214=2;
                int LA214_0 = input.LA(1);

                if ( (LA214_0==77) ) {
                    alt214=1;
                }


                switch (alt214) {
            	case 1 :
            	    // src/xtend/antlr3_2/Xtend.g:1036:33: ruleArrayBrackets
            	    {
            	    pushFollow(FOLLOW_ruleArrayBrackets_in_ruleXTypeLiteral5244);
            	    ruleArrayBrackets();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop214;
                }
            } while (true);

            match(input,41,FOLLOW_41_in_ruleXTypeLiteral5247); if (state.failed) return ;

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
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "ruleXThrowExpression"
    // src/xtend/antlr3_2/Xtend.g:1040:1: ruleXThrowExpression : 'throw' ruleXExpression ;
    public final void ruleXThrowExpression() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1040:22: ( 'throw' ruleXExpression )
            // src/xtend/antlr3_2/Xtend.g:1041:2: 'throw' ruleXExpression
            {
            match(input,123,FOLLOW_123_in_ruleXThrowExpression5258); if (state.failed) return ;
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression5260);
            ruleXExpression();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "ruleXReturnExpression"
    // src/xtend/antlr3_2/Xtend.g:1045:1: ruleXReturnExpression : 'return' ( ( 'abstract' | 'annotation' | 'class' | 'create' | 'def' | 'dispatch' | 'enum' | 'extends' | 'final' | 'implements' | 'import' | 'interface' | 'override' | 'package' | 'public' | 'private' | 'protected' | 'static' | 'throws' | 'strictfp' | 'native' | 'volatile' | 'synchronized' | 'transient' | 'AFTER' | 'BEFORE' | 'SEPARATOR' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING | RULE_RICH_TEXT | RULE_RICH_TEXT_START )=> ruleXExpression )? ;
    public final void ruleXReturnExpression() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1045:23: ( 'return' ( ( 'abstract' | 'annotation' | 'class' | 'create' | 'def' | 'dispatch' | 'enum' | 'extends' | 'final' | 'implements' | 'import' | 'interface' | 'override' | 'package' | 'public' | 'private' | 'protected' | 'static' | 'throws' | 'strictfp' | 'native' | 'volatile' | 'synchronized' | 'transient' | 'AFTER' | 'BEFORE' | 'SEPARATOR' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING | RULE_RICH_TEXT | RULE_RICH_TEXT_START )=> ruleXExpression )? )
            // src/xtend/antlr3_2/Xtend.g:1046:2: 'return' ( ( 'abstract' | 'annotation' | 'class' | 'create' | 'def' | 'dispatch' | 'enum' | 'extends' | 'final' | 'implements' | 'import' | 'interface' | 'override' | 'package' | 'public' | 'private' | 'protected' | 'static' | 'throws' | 'strictfp' | 'native' | 'volatile' | 'synchronized' | 'transient' | 'AFTER' | 'BEFORE' | 'SEPARATOR' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING | RULE_RICH_TEXT | RULE_RICH_TEXT_START )=> ruleXExpression )?
            {
            match(input,124,FOLLOW_124_in_ruleXReturnExpression5271); if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:1046:11: ( ( 'abstract' | 'annotation' | 'class' | 'create' | 'def' | 'dispatch' | 'enum' | 'extends' | 'final' | 'implements' | 'import' | 'interface' | 'override' | 'package' | 'public' | 'private' | 'protected' | 'static' | 'throws' | 'strictfp' | 'native' | 'volatile' | 'synchronized' | 'transient' | 'AFTER' | 'BEFORE' | 'SEPARATOR' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING | RULE_RICH_TEXT | RULE_RICH_TEXT_START )=> ruleXExpression )?
            int alt215=2;
            alt215 = dfa215.predict(input);
            switch (alt215) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:1046:13: ( 'abstract' | 'annotation' | 'class' | 'create' | 'def' | 'dispatch' | 'enum' | 'extends' | 'final' | 'implements' | 'import' | 'interface' | 'override' | 'package' | 'public' | 'private' | 'protected' | 'static' | 'throws' | 'strictfp' | 'native' | 'volatile' | 'synchronized' | 'transient' | 'AFTER' | 'BEFORE' | 'SEPARATOR' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING | RULE_RICH_TEXT | RULE_RICH_TEXT_START )=> ruleXExpression
                    {
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression5565);
                    ruleXExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


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
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // src/xtend/antlr3_2/Xtend.g:1108:1: ruleXTryCatchFinallyExpression : 'try' ruleXExpression ( ( ( 'catch' )=> ruleXCatchClause )+ ( ( ( 'finally' )=> 'finally' ) ruleXExpression )? | 'finally' ruleXExpression ) ;
    public final void ruleXTryCatchFinallyExpression() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1108:32: ( 'try' ruleXExpression ( ( ( 'catch' )=> ruleXCatchClause )+ ( ( ( 'finally' )=> 'finally' ) ruleXExpression )? | 'finally' ruleXExpression ) )
            // src/xtend/antlr3_2/Xtend.g:1109:2: 'try' ruleXExpression ( ( ( 'catch' )=> ruleXCatchClause )+ ( ( ( 'finally' )=> 'finally' ) ruleXExpression )? | 'finally' ruleXExpression )
            {
            match(input,125,FOLLOW_125_in_ruleXTryCatchFinallyExpression5579); if (state.failed) return ;
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression5581);
            ruleXExpression();

            state._fsp--;
            if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:1109:24: ( ( ( 'catch' )=> ruleXCatchClause )+ ( ( ( 'finally' )=> 'finally' ) ruleXExpression )? | 'finally' ruleXExpression )
            int alt218=2;
            int LA218_0 = input.LA(1);

            if ( (LA218_0==127) ) {
                alt218=1;
            }
            else if ( (LA218_0==126) ) {
                alt218=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 218, 0, input);

                throw nvae;
            }
            switch (alt218) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:1110:3: ( ( 'catch' )=> ruleXCatchClause )+ ( ( ( 'finally' )=> 'finally' ) ruleXExpression )?
                    {
                    // src/xtend/antlr3_2/Xtend.g:1110:3: ( ( 'catch' )=> ruleXCatchClause )+
                    int cnt216=0;
                    loop216:
                    do {
                        int alt216=2;
                        int LA216_0 = input.LA(1);

                        if ( (LA216_0==127) ) {
                            int LA216_2 = input.LA(2);

                            if ( (synpred52_Xtend()) ) {
                                alt216=1;
                            }


                        }


                        switch (alt216) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:1110:5: ( 'catch' )=> ruleXCatchClause
                    	    {
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression5601);
                    	    ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt216 >= 1 ) break loop216;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(216, input);
                                throw eee;
                        }
                        cnt216++;
                    } while (true);

                    // src/xtend/antlr3_2/Xtend.g:1112:28: ( ( ( 'finally' )=> 'finally' ) ruleXExpression )?
                    int alt217=2;
                    int LA217_0 = input.LA(1);

                    if ( (LA217_0==126) ) {
                        int LA217_1 = input.LA(2);

                        if ( (synpred53_Xtend()) ) {
                            alt217=1;
                        }
                    }
                    switch (alt217) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:1113:4: ( ( 'finally' )=> 'finally' ) ruleXExpression
                            {
                            // src/xtend/antlr3_2/Xtend.g:1113:4: ( ( 'finally' )=> 'finally' )
                            // src/xtend/antlr3_2/Xtend.g:1113:6: ( 'finally' )=> 'finally'
                            {
                            match(input,126,FOLLOW_126_in_ruleXTryCatchFinallyExpression5627); if (state.failed) return ;

                            }

                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression5631);
                            ruleXExpression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:1117:3: 'finally' ruleXExpression
                    {
                    match(input,126,FOLLOW_126_in_ruleXTryCatchFinallyExpression5642); if (state.failed) return ;
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression5644);
                    ruleXExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


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
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXSynchronizedExpression"
    // src/xtend/antlr3_2/Xtend.g:1122:1: ruleXSynchronizedExpression : ( ( 'synchronized' '(' )=> ( 'synchronized' '(' ) ) ruleXExpression ')' ruleXExpression ;
    public final void ruleXSynchronizedExpression() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1122:29: ( ( ( 'synchronized' '(' )=> ( 'synchronized' '(' ) ) ruleXExpression ')' ruleXExpression )
            // src/xtend/antlr3_2/Xtend.g:1123:2: ( ( 'synchronized' '(' )=> ( 'synchronized' '(' ) ) ruleXExpression ')' ruleXExpression
            {
            // src/xtend/antlr3_2/Xtend.g:1123:2: ( ( 'synchronized' '(' )=> ( 'synchronized' '(' ) )
            // src/xtend/antlr3_2/Xtend.g:1123:4: ( 'synchronized' '(' )=> ( 'synchronized' '(' )
            {
            // src/xtend/antlr3_2/Xtend.g:1125:7: ( 'synchronized' '(' )
            // src/xtend/antlr3_2/Xtend.g:1126:3: 'synchronized' '('
            {
            match(input,54,FOLLOW_54_in_ruleXSynchronizedExpression5676); if (state.failed) return ;
            match(input,40,FOLLOW_40_in_ruleXSynchronizedExpression5678); if (state.failed) return ;

            }


            }

            pushFollow(FOLLOW_ruleXExpression_in_ruleXSynchronizedExpression5685);
            ruleXExpression();

            state._fsp--;
            if (state.failed) return ;
            match(input,41,FOLLOW_41_in_ruleXSynchronizedExpression5687); if (state.failed) return ;
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSynchronizedExpression5689);
            ruleXExpression();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "ruleXSynchronizedExpression"


    // $ANTLR start "ruleXCatchClause"
    // src/xtend/antlr3_2/Xtend.g:1131:1: ruleXCatchClause : ( ( 'catch' )=> 'catch' ) '(' ruleFullJvmFormalParameter ')' ruleXExpression ;
    public final void ruleXCatchClause() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1131:18: ( ( ( 'catch' )=> 'catch' ) '(' ruleFullJvmFormalParameter ')' ruleXExpression )
            // src/xtend/antlr3_2/Xtend.g:1132:2: ( ( 'catch' )=> 'catch' ) '(' ruleFullJvmFormalParameter ')' ruleXExpression
            {
            // src/xtend/antlr3_2/Xtend.g:1132:2: ( ( 'catch' )=> 'catch' )
            // src/xtend/antlr3_2/Xtend.g:1132:4: ( 'catch' )=> 'catch'
            {
            match(input,127,FOLLOW_127_in_ruleXCatchClause5712); if (state.failed) return ;

            }

            match(input,40,FOLLOW_40_in_ruleXCatchClause5716); if (state.failed) return ;
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause5718);
            ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return ;
            match(input,41,FOLLOW_41_in_ruleXCatchClause5720); if (state.failed) return ;
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause5722);
            ruleXExpression();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "ruleQualifiedName"
    // src/xtend/antlr3_2/Xtend.g:1138:1: ruleQualifiedName : ruleValidID ( ( ( '.' )=> '.' ) ruleValidID )* ;
    public final void ruleQualifiedName() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1138:19: ( ruleValidID ( ( ( '.' )=> '.' ) ruleValidID )* )
            // src/xtend/antlr3_2/Xtend.g:1139:2: ruleValidID ( ( ( '.' )=> '.' ) ruleValidID )*
            {
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName5733);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:1139:14: ( ( ( '.' )=> '.' ) ruleValidID )*
            loop219:
            do {
                int alt219=2;
                int LA219_0 = input.LA(1);

                if ( (LA219_0==108) ) {
                    int LA219_2 = input.LA(2);

                    if ( (LA219_2==RULE_ID||LA219_2==37||LA219_2==60||(LA219_2>=62 && LA219_2<=64)) ) {
                        int LA219_3 = input.LA(3);

                        if ( (synpred56_Xtend()) ) {
                            alt219=1;
                        }


                    }


                }


                switch (alt219) {
            	case 1 :
            	    // src/xtend/antlr3_2/Xtend.g:1140:3: ( ( '.' )=> '.' ) ruleValidID
            	    {
            	    // src/xtend/antlr3_2/Xtend.g:1140:3: ( ( '.' )=> '.' )
            	    // src/xtend/antlr3_2/Xtend.g:1140:5: ( '.' )=> '.'
            	    {
            	    match(input,108,FOLLOW_108_in_ruleQualifiedName5753); if (state.failed) return ;

            	    }

            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName5757);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop219;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleNumber"
    // src/xtend/antlr3_2/Xtend.g:1147:1: ruleNumber : ( RULE_HEX | ( RULE_INT | RULE_DECIMAL ) ( '.' ( RULE_INT | RULE_DECIMAL ) )? );
    public final void ruleNumber() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1147:12: ( RULE_HEX | ( RULE_INT | RULE_DECIMAL ) ( '.' ( RULE_INT | RULE_DECIMAL ) )? )
            int alt221=2;
            int LA221_0 = input.LA(1);

            if ( (LA221_0==RULE_HEX) ) {
                alt221=1;
            }
            else if ( ((LA221_0>=RULE_INT && LA221_0<=RULE_DECIMAL)) ) {
                alt221=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 221, 0, input);

                throw nvae;
            }
            switch (alt221) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:1148:2: RULE_HEX
                    {
                    match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber5772); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:1149:2: ( RULE_INT | RULE_DECIMAL ) ( '.' ( RULE_INT | RULE_DECIMAL ) )?
                    {
                    if ( (input.LA(1)>=RULE_INT && input.LA(1)<=RULE_DECIMAL) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // src/xtend/antlr3_2/Xtend.g:1152:4: ( '.' ( RULE_INT | RULE_DECIMAL ) )?
                    int alt220=2;
                    int LA220_0 = input.LA(1);

                    if ( (LA220_0==108) ) {
                        int LA220_1 = input.LA(2);

                        if ( ((LA220_1>=RULE_INT && LA220_1<=RULE_DECIMAL)) ) {
                            alt220=1;
                        }
                    }
                    switch (alt220) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:1153:3: '.' ( RULE_INT | RULE_DECIMAL )
                            {
                            match(input,108,FOLLOW_108_in_ruleNumber5796); if (state.failed) return ;
                            if ( (input.LA(1)>=RULE_INT && input.LA(1)<=RULE_DECIMAL) ) {
                                input.consume();
                                state.errorRecovery=false;state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

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
        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "ruleJvmTypeReference"
    // src/xtend/antlr3_2/Xtend.g:1161:1: ruleJvmTypeReference : ( ruleJvmParameterizedTypeReference ( ( ruleArrayBrackets )=> ruleArrayBrackets )* | ruleXFunctionTypeRef );
    public final void ruleJvmTypeReference() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1161:22: ( ruleJvmParameterizedTypeReference ( ( ruleArrayBrackets )=> ruleArrayBrackets )* | ruleXFunctionTypeRef )
            int alt223=2;
            int LA223_0 = input.LA(1);

            if ( (LA223_0==RULE_ID||LA223_0==37||LA223_0==60||(LA223_0>=62 && LA223_0<=64)) ) {
                alt223=1;
            }
            else if ( (LA223_0==40||LA223_0==95) ) {
                alt223=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 223, 0, input);

                throw nvae;
            }
            switch (alt223) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:1162:2: ruleJvmParameterizedTypeReference ( ( ruleArrayBrackets )=> ruleArrayBrackets )*
                    {
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference5829);
                    ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:1162:36: ( ( ruleArrayBrackets )=> ruleArrayBrackets )*
                    loop222:
                    do {
                        int alt222=2;
                        int LA222_0 = input.LA(1);

                        if ( (LA222_0==77) ) {
                            int LA222_2 = input.LA(2);

                            if ( (LA222_2==78) ) {
                                int LA222_3 = input.LA(3);

                                if ( (synpred57_Xtend()) ) {
                                    alt222=1;
                                }


                            }


                        }


                        switch (alt222) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:1162:38: ( ruleArrayBrackets )=> ruleArrayBrackets
                    	    {
                    	    pushFollow(FOLLOW_ruleArrayBrackets_in_ruleJvmTypeReference5843);
                    	    ruleArrayBrackets();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop222;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:1165:2: ruleXFunctionTypeRef
                    {
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference5851);
                    ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "ruleArrayBrackets"
    // src/xtend/antlr3_2/Xtend.g:1169:1: ruleArrayBrackets : '[' ']' ;
    public final void ruleArrayBrackets() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1169:19: ( '[' ']' )
            // src/xtend/antlr3_2/Xtend.g:1170:2: '[' ']'
            {
            match(input,77,FOLLOW_77_in_ruleArrayBrackets5862); if (state.failed) return ;
            match(input,78,FOLLOW_78_in_ruleArrayBrackets5864); if (state.failed) return ;

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
    // $ANTLR end "ruleArrayBrackets"


    // $ANTLR start "ruleXFunctionTypeRef"
    // src/xtend/antlr3_2/Xtend.g:1174:1: ruleXFunctionTypeRef : ( '(' ( ruleJvmTypeReference ( ',' ruleJvmTypeReference )* )? ')' )? '=>' ruleJvmTypeReference ;
    public final void ruleXFunctionTypeRef() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1174:22: ( ( '(' ( ruleJvmTypeReference ( ',' ruleJvmTypeReference )* )? ')' )? '=>' ruleJvmTypeReference )
            // src/xtend/antlr3_2/Xtend.g:1175:2: ( '(' ( ruleJvmTypeReference ( ',' ruleJvmTypeReference )* )? ')' )? '=>' ruleJvmTypeReference
            {
            // src/xtend/antlr3_2/Xtend.g:1175:2: ( '(' ( ruleJvmTypeReference ( ',' ruleJvmTypeReference )* )? ')' )?
            int alt226=2;
            int LA226_0 = input.LA(1);

            if ( (LA226_0==40) ) {
                alt226=1;
            }
            switch (alt226) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:1176:3: '(' ( ruleJvmTypeReference ( ',' ruleJvmTypeReference )* )? ')'
                    {
                    match(input,40,FOLLOW_40_in_ruleXFunctionTypeRef5879); if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:1176:7: ( ruleJvmTypeReference ( ',' ruleJvmTypeReference )* )?
                    int alt225=2;
                    int LA225_0 = input.LA(1);

                    if ( (LA225_0==RULE_ID||LA225_0==37||LA225_0==40||LA225_0==60||(LA225_0>=62 && LA225_0<=64)||LA225_0==95) ) {
                        alt225=1;
                    }
                    switch (alt225) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:1177:4: ruleJvmTypeReference ( ',' ruleJvmTypeReference )*
                            {
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef5886);
                            ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return ;
                            // src/xtend/antlr3_2/Xtend.g:1177:25: ( ',' ruleJvmTypeReference )*
                            loop224:
                            do {
                                int alt224=2;
                                int LA224_0 = input.LA(1);

                                if ( (LA224_0==29) ) {
                                    alt224=1;
                                }


                                switch (alt224) {
                            	case 1 :
                            	    // src/xtend/antlr3_2/Xtend.g:1178:5: ',' ruleJvmTypeReference
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleXFunctionTypeRef5894); if (state.failed) return ;
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef5896);
                            	    ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop224;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,41,FOLLOW_41_in_ruleXFunctionTypeRef5909); if (state.failed) return ;

                    }
                    break;

            }

            match(input,95,FOLLOW_95_in_ruleXFunctionTypeRef5915); if (state.failed) return ;
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef5917);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // src/xtend/antlr3_2/Xtend.g:1185:1: ruleJvmParameterizedTypeReference : ruleQualifiedName ( ( ( '<' )=> '<' ) ruleJvmArgumentTypeReference ( ',' ruleJvmArgumentTypeReference )* '>' )? ;
    public final void ruleJvmParameterizedTypeReference() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1185:35: ( ruleQualifiedName ( ( ( '<' )=> '<' ) ruleJvmArgumentTypeReference ( ',' ruleJvmArgumentTypeReference )* '>' )? )
            // src/xtend/antlr3_2/Xtend.g:1186:2: ruleQualifiedName ( ( ( '<' )=> '<' ) ruleJvmArgumentTypeReference ( ',' ruleJvmArgumentTypeReference )* '>' )?
            {
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference5928);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:1186:20: ( ( ( '<' )=> '<' ) ruleJvmArgumentTypeReference ( ',' ruleJvmArgumentTypeReference )* '>' )?
            int alt228=2;
            alt228 = dfa228.predict(input);
            switch (alt228) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:1187:3: ( ( '<' )=> '<' ) ruleJvmArgumentTypeReference ( ',' ruleJvmArgumentTypeReference )* '>'
                    {
                    // src/xtend/antlr3_2/Xtend.g:1187:3: ( ( '<' )=> '<' )
                    // src/xtend/antlr3_2/Xtend.g:1187:5: ( '<' )=> '<'
                    {
                    match(input,28,FOLLOW_28_in_ruleJvmParameterizedTypeReference5948); if (state.failed) return ;

                    }

                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference5952);
                    ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:1189:43: ( ',' ruleJvmArgumentTypeReference )*
                    loop227:
                    do {
                        int alt227=2;
                        int LA227_0 = input.LA(1);

                        if ( (LA227_0==29) ) {
                            alt227=1;
                        }


                        switch (alt227) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:1190:4: ',' ruleJvmArgumentTypeReference
                    	    {
                    	    match(input,29,FOLLOW_29_in_ruleJvmParameterizedTypeReference5959); if (state.failed) return ;
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference5961);
                    	    ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop227;
                        }
                    } while (true);

                    match(input,30,FOLLOW_30_in_ruleJvmParameterizedTypeReference5968); if (state.failed) return ;

                    }
                    break;

            }


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
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // src/xtend/antlr3_2/Xtend.g:1196:1: ruleJvmArgumentTypeReference : ( ruleJvmTypeReference | ruleJvmWildcardTypeReference );
    public final void ruleJvmArgumentTypeReference() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1196:30: ( ruleJvmTypeReference | ruleJvmWildcardTypeReference )
            int alt229=2;
            int LA229_0 = input.LA(1);

            if ( (LA229_0==RULE_ID||LA229_0==37||LA229_0==40||LA229_0==60||(LA229_0>=62 && LA229_0<=64)||LA229_0==95) ) {
                alt229=1;
            }
            else if ( (LA229_0==128) ) {
                alt229=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 229, 0, input);

                throw nvae;
            }
            switch (alt229) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:1197:2: ruleJvmTypeReference
                    {
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference5983);
                    ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:1198:2: ruleJvmWildcardTypeReference
                    {
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference5988);
                    ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // src/xtend/antlr3_2/Xtend.g:1202:1: ruleJvmWildcardTypeReference : '?' ( ruleJvmUpperBound | ruleJvmLowerBound )? ;
    public final void ruleJvmWildcardTypeReference() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1202:30: ( '?' ( ruleJvmUpperBound | ruleJvmLowerBound )? )
            // src/xtend/antlr3_2/Xtend.g:1203:2: '?' ( ruleJvmUpperBound | ruleJvmLowerBound )?
            {
            match(input,128,FOLLOW_128_in_ruleJvmWildcardTypeReference5999); if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:1203:6: ( ruleJvmUpperBound | ruleJvmLowerBound )?
            int alt230=3;
            int LA230_0 = input.LA(1);

            if ( (LA230_0==31) ) {
                alt230=1;
            }
            else if ( (LA230_0==118) ) {
                alt230=2;
            }
            switch (alt230) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:1204:3: ruleJvmUpperBound
                    {
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference6005);
                    ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:1205:3: ruleJvmLowerBound
                    {
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference6011);
                    ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


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
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmUpperBound"
    // src/xtend/antlr3_2/Xtend.g:1210:1: ruleJvmUpperBound : 'extends' ruleJvmTypeReference ;
    public final void ruleJvmUpperBound() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1210:19: ( 'extends' ruleJvmTypeReference )
            // src/xtend/antlr3_2/Xtend.g:1211:2: 'extends' ruleJvmTypeReference
            {
            match(input,31,FOLLOW_31_in_ruleJvmUpperBound6026); if (state.failed) return ;
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound6028);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // src/xtend/antlr3_2/Xtend.g:1215:1: ruleJvmUpperBoundAnded : '&' ruleJvmTypeReference ;
    public final void ruleJvmUpperBoundAnded() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1215:24: ( '&' ruleJvmTypeReference )
            // src/xtend/antlr3_2/Xtend.g:1216:2: '&' ruleJvmTypeReference
            {
            match(input,129,FOLLOW_129_in_ruleJvmUpperBoundAnded6039); if (state.failed) return ;
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded6041);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmLowerBound"
    // src/xtend/antlr3_2/Xtend.g:1220:1: ruleJvmLowerBound : 'super' ruleJvmTypeReference ;
    public final void ruleJvmLowerBound() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1220:19: ( 'super' ruleJvmTypeReference )
            // src/xtend/antlr3_2/Xtend.g:1221:2: 'super' ruleJvmTypeReference
            {
            match(input,118,FOLLOW_118_in_ruleJvmLowerBound6052); if (state.failed) return ;
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound6054);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "ruleJvmTypeParameter"
    // src/xtend/antlr3_2/Xtend.g:1225:1: ruleJvmTypeParameter : ruleValidID ( ruleJvmUpperBound ( ruleJvmUpperBoundAnded )* )? ;
    public final void ruleJvmTypeParameter() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1225:22: ( ruleValidID ( ruleJvmUpperBound ( ruleJvmUpperBoundAnded )* )? )
            // src/xtend/antlr3_2/Xtend.g:1226:2: ruleValidID ( ruleJvmUpperBound ( ruleJvmUpperBoundAnded )* )?
            {
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmTypeParameter6065);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:1226:14: ( ruleJvmUpperBound ( ruleJvmUpperBoundAnded )* )?
            int alt232=2;
            int LA232_0 = input.LA(1);

            if ( (LA232_0==31) ) {
                alt232=1;
            }
            switch (alt232) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:1227:3: ruleJvmUpperBound ( ruleJvmUpperBoundAnded )*
                    {
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmTypeParameter6071);
                    ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:1227:21: ( ruleJvmUpperBoundAnded )*
                    loop231:
                    do {
                        int alt231=2;
                        int LA231_0 = input.LA(1);

                        if ( (LA231_0==129) ) {
                            alt231=1;
                        }


                        switch (alt231) {
                    	case 1 :
                    	    // src/xtend/antlr3_2/Xtend.g:1227:21: ruleJvmUpperBoundAnded
                    	    {
                    	    pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_ruleJvmTypeParameter6073);
                    	    ruleJvmUpperBoundAnded();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop231;
                        }
                    } while (true);


                    }
                    break;

            }


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
    // $ANTLR end "ruleJvmTypeParameter"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // src/xtend/antlr3_2/Xtend.g:1232:1: ruleQualifiedNameWithWildcard : ruleQualifiedName '.' '*' ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1232:31: ( ruleQualifiedName '.' '*' )
            // src/xtend/antlr3_2/Xtend.g:1233:2: ruleQualifiedName '.' '*'
            {
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard6089);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            match(input,108,FOLLOW_108_in_ruleQualifiedNameWithWildcard6091); if (state.failed) return ;
            match(input,100,FOLLOW_100_in_ruleQualifiedNameWithWildcard6093); if (state.failed) return ;

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "ruleXImportSection"
    // src/xtend/antlr3_2/Xtend.g:1237:1: ruleXImportSection : ( ruleXImportDeclaration )+ ;
    public final void ruleXImportSection() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1237:20: ( ( ruleXImportDeclaration )+ )
            // src/xtend/antlr3_2/Xtend.g:1238:2: ( ruleXImportDeclaration )+
            {
            // src/xtend/antlr3_2/Xtend.g:1238:2: ( ruleXImportDeclaration )+
            int cnt233=0;
            loop233:
            do {
                int alt233=2;
                int LA233_0 = input.LA(1);

                if ( (LA233_0==65) ) {
                    alt233=1;
                }


                switch (alt233) {
            	case 1 :
            	    // src/xtend/antlr3_2/Xtend.g:1238:2: ruleXImportDeclaration
            	    {
            	    pushFollow(FOLLOW_ruleXImportDeclaration_in_ruleXImportSection6104);
            	    ruleXImportDeclaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt233 >= 1 ) break loop233;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(233, input);
                        throw eee;
                }
                cnt233++;
            } while (true);


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
    // $ANTLR end "ruleXImportSection"


    // $ANTLR start "ruleXImportDeclaration"
    // src/xtend/antlr3_2/Xtend.g:1242:1: ruleXImportDeclaration : 'import' ( 'static' ( 'extension' )? ruleQualifiedNameInStaticImport ( '*' | ruleValidID ) | ruleQualifiedName | ruleQualifiedNameWithWildcard ) ( ';' )? ;
    public final void ruleXImportDeclaration() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1242:24: ( 'import' ( 'static' ( 'extension' )? ruleQualifiedNameInStaticImport ( '*' | ruleValidID ) | ruleQualifiedName | ruleQualifiedNameWithWildcard ) ( ';' )? )
            // src/xtend/antlr3_2/Xtend.g:1243:2: 'import' ( 'static' ( 'extension' )? ruleQualifiedNameInStaticImport ( '*' | ruleValidID ) | ruleQualifiedName | ruleQualifiedNameWithWildcard ) ( ';' )?
            {
            match(input,65,FOLLOW_65_in_ruleXImportDeclaration6116); if (state.failed) return ;
            // src/xtend/antlr3_2/Xtend.g:1243:11: ( 'static' ( 'extension' )? ruleQualifiedNameInStaticImport ( '*' | ruleValidID ) | ruleQualifiedName | ruleQualifiedNameWithWildcard )
            int alt236=3;
            alt236 = dfa236.predict(input);
            switch (alt236) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:1244:3: 'static' ( 'extension' )? ruleQualifiedNameInStaticImport ( '*' | ruleValidID )
                    {
                    match(input,48,FOLLOW_48_in_ruleXImportDeclaration6122); if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:1244:12: ( 'extension' )?
                    int alt234=2;
                    int LA234_0 = input.LA(1);

                    if ( (LA234_0==39) ) {
                        alt234=1;
                    }
                    switch (alt234) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:1244:12: 'extension'
                            {
                            match(input,39,FOLLOW_39_in_ruleXImportDeclaration6124); if (state.failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_ruleQualifiedNameInStaticImport_in_ruleXImportDeclaration6127);
                    ruleQualifiedNameInStaticImport();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/xtend/antlr3_2/Xtend.g:1244:57: ( '*' | ruleValidID )
                    int alt235=2;
                    int LA235_0 = input.LA(1);

                    if ( (LA235_0==100) ) {
                        alt235=1;
                    }
                    else if ( (LA235_0==RULE_ID||LA235_0==37||LA235_0==60||(LA235_0>=62 && LA235_0<=64)) ) {
                        alt235=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 235, 0, input);

                        throw nvae;
                    }
                    switch (alt235) {
                        case 1 :
                            // src/xtend/antlr3_2/Xtend.g:1245:4: '*'
                            {
                            match(input,100,FOLLOW_100_in_ruleXImportDeclaration6134); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // src/xtend/antlr3_2/Xtend.g:1246:4: ruleValidID
                            {
                            pushFollow(FOLLOW_ruleValidID_in_ruleXImportDeclaration6141);
                            ruleValidID();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/xtend/antlr3_2/Xtend.g:1248:3: ruleQualifiedName
                    {
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration6151);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/xtend/antlr3_2/Xtend.g:1249:3: ruleQualifiedNameWithWildcard
                    {
                    pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleXImportDeclaration6157);
                    ruleQualifiedNameWithWildcard();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // src/xtend/antlr3_2/Xtend.g:1250:4: ( ';' )?
            int alt237=2;
            int LA237_0 = input.LA(1);

            if ( (LA237_0==26) ) {
                alt237=1;
            }
            switch (alt237) {
                case 1 :
                    // src/xtend/antlr3_2/Xtend.g:1250:4: ';'
                    {
                    match(input,26,FOLLOW_26_in_ruleXImportDeclaration6162); if (state.failed) return ;

                    }
                    break;

            }


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
    // $ANTLR end "ruleXImportDeclaration"


    // $ANTLR start "ruleQualifiedNameInStaticImport"
    // src/xtend/antlr3_2/Xtend.g:1254:1: ruleQualifiedNameInStaticImport : ( ruleValidID '.' )+ ;
    public final void ruleQualifiedNameInStaticImport() throws RecognitionException {
        try {
            // src/xtend/antlr3_2/Xtend.g:1254:33: ( ( ruleValidID '.' )+ )
            // src/xtend/antlr3_2/Xtend.g:1255:2: ( ruleValidID '.' )+
            {
            // src/xtend/antlr3_2/Xtend.g:1255:2: ( ruleValidID '.' )+
            int cnt238=0;
            loop238:
            do {
                int alt238=2;
                int LA238_0 = input.LA(1);

                if ( (LA238_0==RULE_ID||LA238_0==37||LA238_0==60||(LA238_0>=62 && LA238_0<=64)) ) {
                    int LA238_2 = input.LA(2);

                    if ( (LA238_2==108) ) {
                        alt238=1;
                    }


                }


                switch (alt238) {
            	case 1 :
            	    // src/xtend/antlr3_2/Xtend.g:1256:3: ruleValidID '.'
            	    {
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedNameInStaticImport6178);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    match(input,108,FOLLOW_108_in_ruleQualifiedNameInStaticImport6180); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt238 >= 1 ) break loop238;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(238, input);
                        throw eee;
                }
                cnt238++;
            } while (true);


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
    // $ANTLR end "ruleQualifiedNameInStaticImport"

    // $ANTLR start synpred1_Xtend
    public final void synpred1_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:114:6: ( ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '(' )
        // src/xtend/antlr3_2/Xtend.g:115:4: ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '('
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred1_Xtend810);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_ruleCreateExtensionInfo_in_synpred1_Xtend812);
        ruleCreateExtensionInfo();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_ruleValidID_in_synpred1_Xtend814);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;
        match(input,40,FOLLOW_40_in_synpred1_Xtend816); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Xtend

    // $ANTLR start synpred2_Xtend
    public final void synpred2_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:119:6: ( ruleJvmTypeReference ruleFunctionID '(' )
        // src/xtend/antlr3_2/Xtend.g:120:4: ruleJvmTypeReference ruleFunctionID '('
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred2_Xtend858);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_ruleFunctionID_in_synpred2_Xtend860);
        ruleFunctionID();

        state._fsp--;
        if (state.failed) return ;
        match(input,40,FOLLOW_40_in_synpred2_Xtend862); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Xtend

    // $ANTLR start synpred3_Xtend
    public final void synpred3_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:124:6: ( ruleTypeReferenceNoTypeArgs ruleFunctionID '(' )
        // src/xtend/antlr3_2/Xtend.g:125:4: ruleTypeReferenceNoTypeArgs ruleFunctionID '('
        {
        pushFollow(FOLLOW_ruleTypeReferenceNoTypeArgs_in_synpred3_Xtend902);
        ruleTypeReferenceNoTypeArgs();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_ruleFunctionID_in_synpred3_Xtend904);
        ruleFunctionID();

        state._fsp--;
        if (state.failed) return ;
        match(input,40,FOLLOW_40_in_synpred3_Xtend906); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Xtend

    // $ANTLR start synpred4_Xtend
    public final void synpred4_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:129:6: ( ruleCreateExtensionInfo ruleValidID '(' )
        // src/xtend/antlr3_2/Xtend.g:130:4: ruleCreateExtensionInfo ruleValidID '('
        {
        pushFollow(FOLLOW_ruleCreateExtensionInfo_in_synpred4_Xtend946);
        ruleCreateExtensionInfo();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_ruleValidID_in_synpred4_Xtend948);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;
        match(input,40,FOLLOW_40_in_synpred4_Xtend950); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_Xtend

    // $ANTLR start synpred6_Xtend
    public final void synpred6_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:331:5: ( ruleJvmTypeReference ruleInnerVarID )
        // src/xtend/antlr3_2/Xtend.g:332:3: ruleJvmTypeReference ruleInnerVarID
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred6_Xtend1991);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_ruleInnerVarID_in_synpred6_Xtend1993);
        ruleInnerVarID();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_Xtend

    // $ANTLR start synpred7_Xtend
    public final void synpred7_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:345:5: ( '{' )
        // src/xtend/antlr3_2/Xtend.g:346:3: '{'
        {
        match(input,33,FOLLOW_33_in_synpred7_Xtend2058); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_Xtend

    // $ANTLR start synpred8_Xtend
    public final void synpred8_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:354:5: ( '<' )
        // src/xtend/antlr3_2/Xtend.g:355:3: '<'
        {
        match(input,28,FOLLOW_28_in_synpred8_Xtend2102); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_Xtend

    // $ANTLR start synpred9_Xtend
    public final void synpred9_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:360:5: ( '(' )
        // src/xtend/antlr3_2/Xtend.g:361:3: '('
        {
        match(input,40,FOLLOW_40_in_synpred9_Xtend2146); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_Xtend

    // $ANTLR start synpred10_Xtend
    public final void synpred10_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:363:6: ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )
        // src/xtend/antlr3_2/Xtend.g:364:4: ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|'
        {
        // src/xtend/antlr3_2/Xtend.g:364:4: ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )?
        int alt242=2;
        int LA242_0 = input.LA(1);

        if ( (LA242_0==RULE_ID||LA242_0==25||LA242_0==27||(LA242_0>=31 && LA242_0<=32)||(LA242_0>=35 && LA242_0<=37)||(LA242_0>=39 && LA242_0<=40)||LA242_0==42||(LA242_0>=44 && LA242_0<=55)||(LA242_0>=58 && LA242_0<=60)||(LA242_0>=62 && LA242_0<=65)||LA242_0==95) ) {
            alt242=1;
        }
        switch (alt242) {
            case 1 :
                // src/xtend/antlr3_2/Xtend.g:365:5: ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )*
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred10_Xtend2176);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;
                // src/xtend/antlr3_2/Xtend.g:365:28: ( ',' ruleJvmFormalParameter )*
                loop241:
                do {
                    int alt241=2;
                    int LA241_0 = input.LA(1);

                    if ( (LA241_0==29) ) {
                        alt241=1;
                    }


                    switch (alt241) {
                	case 1 :
                	    // src/xtend/antlr3_2/Xtend.g:366:6: ',' ruleJvmFormalParameter
                	    {
                	    match(input,29,FOLLOW_29_in_synpred10_Xtend2185); if (state.failed) return ;
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred10_Xtend2187);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop241;
                    }
                } while (true);


                }
                break;

        }

        match(input,111,FOLLOW_111_in_synpred10_Xtend2202); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_Xtend

    // $ANTLR start synpred11_Xtend
    public final void synpred11_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:374:7: ( '[' )
        // src/xtend/antlr3_2/Xtend.g:375:2: '['
        {
        match(input,77,FOLLOW_77_in_synpred11_Xtend2254); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_Xtend

    // $ANTLR start synpred12_Xtend
    public final void synpred12_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:398:5: ( '(' ruleJvmFormalParameter ':' )
        // src/xtend/antlr3_2/Xtend.g:399:3: '(' ruleJvmFormalParameter ':'
        {
        match(input,40,FOLLOW_40_in_synpred12_Xtend2336); if (state.failed) return ;
        pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred12_Xtend2338);
        ruleJvmFormalParameter();

        state._fsp--;
        if (state.failed) return ;
        match(input,61,FOLLOW_61_in_synpred12_Xtend2340); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_Xtend

    // $ANTLR start synpred13_Xtend
    public final void synpred13_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:403:5: ( ruleJvmFormalParameter ':' )
        // src/xtend/antlr3_2/Xtend.g:404:3: ruleJvmFormalParameter ':'
        {
        pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred13_Xtend2379);
        ruleJvmFormalParameter();

        state._fsp--;
        if (state.failed) return ;
        match(input,61,FOLLOW_61_in_synpred13_Xtend2381); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_Xtend

    // $ANTLR start synpred14_Xtend
    public final void synpred14_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:415:4: ( 'new' )
        // src/xtend/antlr3_2/Xtend.g:416:2: 'new'
        {
        match(input,43,FOLLOW_43_in_synpred14_Xtend2445); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_Xtend

    // $ANTLR start synpred15_Xtend
    public final void synpred15_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:496:5: ( '(' )
        // src/xtend/antlr3_2/Xtend.g:497:3: '('
        {
        match(input,40,FOLLOW_40_in_synpred15_Xtend2732); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_Xtend

    // $ANTLR start synpred16_Xtend
    public final void synpred16_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:499:6: ( ruleValidID '=' )
        // src/xtend/antlr3_2/Xtend.g:500:4: ruleValidID '='
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred16_Xtend2756);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;
        match(input,38,FOLLOW_38_in_synpred16_Xtend2758); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_Xtend

    // $ANTLR start synpred19_Xtend
    public final void synpred19_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:522:4: ( '#' '[' )
        // src/xtend/antlr3_2/Xtend.g:523:2: '#' '['
        {
        match(input,76,FOLLOW_76_in_synpred19_Xtend2879); if (state.failed) return ;
        match(input,77,FOLLOW_77_in_synpred19_Xtend2881); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_Xtend

    // $ANTLR start synpred20_Xtend
    public final void synpred20_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:540:4: ( '#' '[' )
        // src/xtend/antlr3_2/Xtend.g:541:2: '#' '['
        {
        match(input,76,FOLLOW_76_in_synpred20_Xtend2968); if (state.failed) return ;
        match(input,77,FOLLOW_77_in_synpred20_Xtend2970); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_Xtend

    // $ANTLR start synpred21_Xtend
    public final void synpred21_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:567:5: ( ruleOpMultiAssign )
        // src/xtend/antlr3_2/Xtend.g:568:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred21_Xtend3078);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_Xtend

    // $ANTLR start synpred22_Xtend
    public final void synpred22_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:592:5: ( ruleOpOr )
        // src/xtend/antlr3_2/Xtend.g:593:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred22_Xtend3178);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_Xtend

    // $ANTLR start synpred23_Xtend
    public final void synpred23_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:606:5: ( ruleOpAnd )
        // src/xtend/antlr3_2/Xtend.g:607:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred23_Xtend3228);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_Xtend

    // $ANTLR start synpred24_Xtend
    public final void synpred24_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:620:5: ( ruleOpEquality )
        // src/xtend/antlr3_2/Xtend.g:621:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred24_Xtend3278);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_Xtend

    // $ANTLR start synpred25_Xtend
    public final void synpred25_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:637:5: ( 'instanceof' )
        // src/xtend/antlr3_2/Xtend.g:638:3: 'instanceof'
        {
        match(input,91,FOLLOW_91_in_synpred25_Xtend3343); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_Xtend

    // $ANTLR start synpred26_Xtend
    public final void synpred26_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:640:5: ( ruleOpCompare )
        // src/xtend/antlr3_2/Xtend.g:641:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred26_Xtend3367);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_Xtend

    // $ANTLR start synpred27_Xtend
    public final void synpred27_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:657:5: ( ruleOpOther )
        // src/xtend/antlr3_2/Xtend.g:658:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred27_Xtend3434);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_Xtend

    // $ANTLR start synpred28_Xtend
    public final void synpred28_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:671:5: ( '>' '>' )
        // src/xtend/antlr3_2/Xtend.g:672:3: '>' '>'
        {
        match(input,30,FOLLOW_30_in_synpred28_Xtend3500); if (state.failed) return ;
        match(input,30,FOLLOW_30_in_synpred28_Xtend3502); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_Xtend

    // $ANTLR start synpred29_Xtend
    public final void synpred29_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:679:5: ( '<' '<' )
        // src/xtend/antlr3_2/Xtend.g:680:3: '<' '<'
        {
        match(input,28,FOLLOW_28_in_synpred29_Xtend3549); if (state.failed) return ;
        match(input,28,FOLLOW_28_in_synpred29_Xtend3551); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_Xtend

    // $ANTLR start synpred30_Xtend
    public final void synpred30_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:694:5: ( ruleOpAdd )
        // src/xtend/antlr3_2/Xtend.g:695:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred30_Xtend3620);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_Xtend

    // $ANTLR start synpred31_Xtend
    public final void synpred31_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:709:5: ( ruleOpMulti )
        // src/xtend/antlr3_2/Xtend.g:710:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred31_Xtend3675);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_Xtend

    // $ANTLR start synpred32_Xtend
    public final void synpred32_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:739:5: ( 'as' )
        // src/xtend/antlr3_2/Xtend.g:740:3: 'as'
        {
        match(input,105,FOLLOW_105_in_synpred32_Xtend3779); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_Xtend

    // $ANTLR start synpred33_Xtend
    public final void synpred33_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:747:27: ( ruleOpPostfix )
        // src/xtend/antlr3_2/Xtend.g:748:2: ruleOpPostfix
        {
        pushFollow(FOLLOW_ruleOpPostfix_in_synpred33_Xtend3813);
        ruleOpPostfix();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_Xtend

    // $ANTLR start synpred34_Xtend
    public final void synpred34_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:761:5: ( ( '.' | '::' ) ruleFeatureCallID ruleOpSingleAssign )
        // src/xtend/antlr3_2/Xtend.g:762:3: ( '.' | '::' ) ruleFeatureCallID ruleOpSingleAssign
        {
        if ( (input.LA(1)>=108 && input.LA(1)<=109) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_ruleFeatureCallID_in_synpred34_Xtend3880);
        ruleFeatureCallID();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred34_Xtend3882);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_Xtend

    // $ANTLR start synpred35_Xtend
    public final void synpred35_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:772:5: ( '.' | '?.' | '::' )
        // src/xtend/antlr3_2/Xtend.g:
        {
        if ( (input.LA(1)>=108 && input.LA(1)<=110) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred35_Xtend

    // $ANTLR start synpred36_Xtend
    public final void synpred36_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:785:6: ( '(' )
        // src/xtend/antlr3_2/Xtend.g:786:4: '('
        {
        match(input,40,FOLLOW_40_in_synpred36_Xtend4031); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_Xtend

    // $ANTLR start synpred37_Xtend
    public final void synpred37_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:788:7: ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )
        // src/xtend/antlr3_2/Xtend.g:789:5: ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|'
        {
        // src/xtend/antlr3_2/Xtend.g:789:5: ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )?
        int alt244=2;
        int LA244_0 = input.LA(1);

        if ( (LA244_0==RULE_ID||LA244_0==25||LA244_0==27||(LA244_0>=31 && LA244_0<=32)||(LA244_0>=35 && LA244_0<=37)||(LA244_0>=39 && LA244_0<=40)||LA244_0==42||(LA244_0>=44 && LA244_0<=55)||(LA244_0>=58 && LA244_0<=60)||(LA244_0>=62 && LA244_0<=65)||LA244_0==95) ) {
            alt244=1;
        }
        switch (alt244) {
            case 1 :
                // src/xtend/antlr3_2/Xtend.g:790:6: ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )*
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred37_Xtend4065);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;
                // src/xtend/antlr3_2/Xtend.g:790:29: ( ',' ruleJvmFormalParameter )*
                loop243:
                do {
                    int alt243=2;
                    int LA243_0 = input.LA(1);

                    if ( (LA243_0==29) ) {
                        alt243=1;
                    }


                    switch (alt243) {
                	case 1 :
                	    // src/xtend/antlr3_2/Xtend.g:791:7: ',' ruleJvmFormalParameter
                	    {
                	    match(input,29,FOLLOW_29_in_synpred37_Xtend4075); if (state.failed) return ;
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred37_Xtend4077);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop243;
                    }
                } while (true);


                }
                break;

        }

        match(input,111,FOLLOW_111_in_synpred37_Xtend4094); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_Xtend

    // $ANTLR start synpred38_Xtend
    public final void synpred38_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:799:8: ( '[' )
        // src/xtend/antlr3_2/Xtend.g:800:3: '['
        {
        match(input,77,FOLLOW_77_in_synpred38_Xtend4153); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_Xtend

    // $ANTLR start synpred39_Xtend
    public final void synpred39_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:810:4: ( 'synchronized' '(' )
        // src/xtend/antlr3_2/Xtend.g:811:2: 'synchronized' '('
        {
        match(input,54,FOLLOW_54_in_synpred39_Xtend4199); if (state.failed) return ;
        match(input,40,FOLLOW_40_in_synpred39_Xtend4201); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_Xtend

    // $ANTLR start synpred40_Xtend
    public final void synpred40_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:816:4: ( 'for' '(' ruleJvmFormalParameter ':' )
        // src/xtend/antlr3_2/Xtend.g:817:2: 'for' '(' ruleJvmFormalParameter ':'
        {
        match(input,115,FOLLOW_115_in_synpred40_Xtend4235); if (state.failed) return ;
        match(input,40,FOLLOW_40_in_synpred40_Xtend4237); if (state.failed) return ;
        pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred40_Xtend4239);
        ruleJvmFormalParameter();

        state._fsp--;
        if (state.failed) return ;
        match(input,61,FOLLOW_61_in_synpred40_Xtend4241); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_Xtend

    // $ANTLR start synpred41_Xtend
    public final void synpred41_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:831:4: ( '[' )
        // src/xtend/antlr3_2/Xtend.g:832:2: '['
        {
        match(input,77,FOLLOW_77_in_synpred41_Xtend4306); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_Xtend

    // $ANTLR start synpred43_Xtend
    public final void synpred43_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:869:15: ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )
        // src/xtend/antlr3_2/Xtend.g:870:2: ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|'
        {
        // src/xtend/antlr3_2/Xtend.g:870:2: ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )?
        int alt246=2;
        int LA246_0 = input.LA(1);

        if ( (LA246_0==RULE_ID||LA246_0==25||LA246_0==27||(LA246_0>=31 && LA246_0<=32)||(LA246_0>=35 && LA246_0<=37)||(LA246_0>=39 && LA246_0<=40)||LA246_0==42||(LA246_0>=44 && LA246_0<=55)||(LA246_0>=58 && LA246_0<=60)||(LA246_0>=62 && LA246_0<=65)||LA246_0==95) ) {
            alt246=1;
        }
        switch (alt246) {
            case 1 :
                // src/xtend/antlr3_2/Xtend.g:871:3: ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )*
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred43_Xtend4470);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;
                // src/xtend/antlr3_2/Xtend.g:871:26: ( ',' ruleJvmFormalParameter )*
                loop245:
                do {
                    int alt245=2;
                    int LA245_0 = input.LA(1);

                    if ( (LA245_0==29) ) {
                        alt245=1;
                    }


                    switch (alt245) {
                	case 1 :
                	    // src/xtend/antlr3_2/Xtend.g:872:4: ',' ruleJvmFormalParameter
                	    {
                	    match(input,29,FOLLOW_29_in_synpred43_Xtend4477); if (state.failed) return ;
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred43_Xtend4479);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop245;
                    }
                } while (true);


                }
                break;

        }

        match(input,111,FOLLOW_111_in_synpred43_Xtend4490); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_Xtend

    // $ANTLR start synpred45_Xtend
    public final void synpred45_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:916:5: ( 'else' )
        // src/xtend/antlr3_2/Xtend.g:917:3: 'else'
        {
        match(input,113,FOLLOW_113_in_synpred45_Xtend4693); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_Xtend

    // $ANTLR start synpred47_Xtend
    public final void synpred47_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:973:4: ( ( 'var' | 'val' ) ( 'extension' )? | 'extension' ( 'var' | 'val' ) )
        int alt250=2;
        int LA250_0 = input.LA(1);

        if ( ((LA250_0>=56 && LA250_0<=57)) ) {
            alt250=1;
        }
        else if ( (LA250_0==39) ) {
            alt250=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 250, 0, input);

            throw nvae;
        }
        switch (alt250) {
            case 1 :
                // src/xtend/antlr3_2/Xtend.g:974:2: ( 'var' | 'val' ) ( 'extension' )?
                {
                if ( (input.LA(1)>=56 && input.LA(1)<=57) ) {
                    input.consume();
                    state.errorRecovery=false;state.failed=false;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    MismatchedSetException mse = new MismatchedSetException(null,input);
                    throw mse;
                }

                // src/xtend/antlr3_2/Xtend.g:977:4: ( 'extension' )?
                int alt249=2;
                int LA249_0 = input.LA(1);

                if ( (LA249_0==39) ) {
                    alt249=1;
                }
                switch (alt249) {
                    case 1 :
                        // src/xtend/antlr3_2/Xtend.g:977:4: 'extension'
                        {
                        match(input,39,FOLLOW_39_in_synpred47_Xtend4969); if (state.failed) return ;

                        }
                        break;

                }


                }
                break;
            case 2 :
                // src/xtend/antlr3_2/Xtend.g:978:2: 'extension' ( 'var' | 'val' )
                {
                match(input,39,FOLLOW_39_in_synpred47_Xtend4975); if (state.failed) return ;
                if ( (input.LA(1)>=56 && input.LA(1)<=57) ) {
                    input.consume();
                    state.errorRecovery=false;state.failed=false;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    MismatchedSetException mse = new MismatchedSetException(null,input);
                    throw mse;
                }


                }
                break;

        }}
    // $ANTLR end synpred47_Xtend

    // $ANTLR start synpred48_Xtend
    public final void synpred48_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:993:5: ( '(' )
        // src/xtend/antlr3_2/Xtend.g:994:3: '('
        {
        match(input,40,FOLLOW_40_in_synpred48_Xtend5055); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_Xtend

    // $ANTLR start synpred49_Xtend
    public final void synpred49_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:996:6: ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )
        // src/xtend/antlr3_2/Xtend.g:997:4: ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|'
        {
        // src/xtend/antlr3_2/Xtend.g:997:4: ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )?
        int alt252=2;
        int LA252_0 = input.LA(1);

        if ( (LA252_0==RULE_ID||LA252_0==25||LA252_0==27||(LA252_0>=31 && LA252_0<=32)||(LA252_0>=35 && LA252_0<=37)||(LA252_0>=39 && LA252_0<=40)||LA252_0==42||(LA252_0>=44 && LA252_0<=55)||(LA252_0>=58 && LA252_0<=60)||(LA252_0>=62 && LA252_0<=65)||LA252_0==95) ) {
            alt252=1;
        }
        switch (alt252) {
            case 1 :
                // src/xtend/antlr3_2/Xtend.g:998:5: ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )*
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred49_Xtend5085);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;
                // src/xtend/antlr3_2/Xtend.g:998:28: ( ',' ruleJvmFormalParameter )*
                loop251:
                do {
                    int alt251=2;
                    int LA251_0 = input.LA(1);

                    if ( (LA251_0==29) ) {
                        alt251=1;
                    }


                    switch (alt251) {
                	case 1 :
                	    // src/xtend/antlr3_2/Xtend.g:999:6: ',' ruleJvmFormalParameter
                	    {
                	    match(input,29,FOLLOW_29_in_synpred49_Xtend5094); if (state.failed) return ;
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred49_Xtend5096);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop251;
                    }
                } while (true);


                }
                break;

        }

        match(input,111,FOLLOW_111_in_synpred49_Xtend5111); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_Xtend

    // $ANTLR start synpred50_Xtend
    public final void synpred50_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:1007:7: ( '[' )
        // src/xtend/antlr3_2/Xtend.g:1008:2: '['
        {
        match(input,77,FOLLOW_77_in_synpred50_Xtend5163); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_Xtend

    // $ANTLR start synpred51_Xtend
    public final void synpred51_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:1046:13: ( 'abstract' | 'annotation' | 'class' | 'create' | 'def' | 'dispatch' | 'enum' | 'extends' | 'final' | 'implements' | 'import' | 'interface' | 'override' | 'package' | 'public' | 'private' | 'protected' | 'static' | 'throws' | 'strictfp' | 'native' | 'volatile' | 'synchronized' | 'transient' | 'AFTER' | 'BEFORE' | 'SEPARATOR' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING | RULE_RICH_TEXT | RULE_RICH_TEXT_START )
        // src/xtend/antlr3_2/Xtend.g:
        {
        if ( (input.LA(1)>=RULE_ID && input.LA(1)<=RULE_RICH_TEXT_START)||(input.LA(1)>=RULE_HEX && input.LA(1)<=RULE_DECIMAL)||input.LA(1)==25||(input.LA(1)>=27 && input.LA(1)<=28)||(input.LA(1)>=31 && input.LA(1)<=33)||(input.LA(1)>=35 && input.LA(1)<=37)||(input.LA(1)>=39 && input.LA(1)<=40)||(input.LA(1)>=42 && input.LA(1)<=55)||(input.LA(1)>=58 && input.LA(1)<=60)||(input.LA(1)>=62 && input.LA(1)<=65)||input.LA(1)==67||(input.LA(1)>=76 && input.LA(1)<=77)||(input.LA(1)>=98 && input.LA(1)<=99)||input.LA(1)==104||input.LA(1)==112||(input.LA(1)>=115 && input.LA(1)<=125) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred51_Xtend

    // $ANTLR start synpred52_Xtend
    public final void synpred52_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:1110:5: ( 'catch' )
        // src/xtend/antlr3_2/Xtend.g:1111:3: 'catch'
        {
        match(input,127,FOLLOW_127_in_synpred52_Xtend5593); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_Xtend

    // $ANTLR start synpred53_Xtend
    public final void synpred53_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:1113:6: ( 'finally' )
        // src/xtend/antlr3_2/Xtend.g:1114:4: 'finally'
        {
        match(input,126,FOLLOW_126_in_synpred53_Xtend5618); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_Xtend

    // $ANTLR start synpred56_Xtend
    public final void synpred56_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:1140:5: ( '.' )
        // src/xtend/antlr3_2/Xtend.g:1141:3: '.'
        {
        match(input,108,FOLLOW_108_in_synpred56_Xtend5745); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_Xtend

    // $ANTLR start synpred57_Xtend
    public final void synpred57_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:1162:38: ( ruleArrayBrackets )
        // src/xtend/antlr3_2/Xtend.g:1163:2: ruleArrayBrackets
        {
        pushFollow(FOLLOW_ruleArrayBrackets_in_synpred57_Xtend5836);
        ruleArrayBrackets();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_Xtend

    // $ANTLR start synpred58_Xtend
    public final void synpred58_Xtend_fragment() throws RecognitionException {   
        // src/xtend/antlr3_2/Xtend.g:1187:5: ( '<' )
        // src/xtend/antlr3_2/Xtend.g:1188:3: '<'
        {
        match(input,28,FOLLOW_28_in_synpred58_Xtend5940); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_Xtend

    // Delegated rules

    public final boolean synpred12_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_Xtend() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_Xtend_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA25 dfa25 = new DFA25(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA102 dfa102 = new DFA102(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA104 dfa104 = new DFA104(this);
    protected DFA116 dfa116 = new DFA116(this);
    protected DFA118 dfa118 = new DFA118(this);
    protected DFA121 dfa121 = new DFA121(this);
    protected DFA120 dfa120 = new DFA120(this);
    protected DFA122 dfa122 = new DFA122(this);
    protected DFA128 dfa128 = new DFA128(this);
    protected DFA127 dfa127 = new DFA127(this);
    protected DFA146 dfa146 = new DFA146(this);
    protected DFA145 dfa145 = new DFA145(this);
    protected DFA151 dfa151 = new DFA151(this);
    protected DFA154 dfa154 = new DFA154(this);
    protected DFA156 dfa156 = new DFA156(this);
    protected DFA165 dfa165 = new DFA165(this);
    protected DFA168 dfa168 = new DFA168(this);
    protected DFA178 dfa178 = new DFA178(this);
    protected DFA177 dfa177 = new DFA177(this);
    protected DFA179 dfa179 = new DFA179(this);
    protected DFA181 dfa181 = new DFA181(this);
    protected DFA190 dfa190 = new DFA190(this);
    protected DFA211 dfa211 = new DFA211(this);
    protected DFA210 dfa210 = new DFA210(this);
    protected DFA212 dfa212 = new DFA212(this);
    protected DFA215 dfa215 = new DFA215(this);
    protected DFA228 dfa228 = new DFA228(this);
    protected DFA236 dfa236 = new DFA236(this);
    static final String DFA25_eotS =
        "\6\uffff";
    static final String DFA25_eofS =
        "\6\uffff";
    static final String DFA25_minS =
        "\2\31\4\uffff";
    static final String DFA25_maxS =
        "\2\67\4\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4";
    static final String DFA25_specialS =
        "\6\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1\1\uffff\1\2\7\uffff\1\3\1\4\1\5\6\uffff\14\1",
            "\1\1\1\uffff\1\2\7\uffff\1\3\1\4\1\5\6\uffff\14\1",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "22:19: ( ( ruleCommonModifier )* 'class' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference )? ( 'implements' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'interface' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'enum' ruleValidID '{' ( ruleXtendEnumLiteral ( ',' ruleXtendEnumLiteral )* )? ( ';' )? '}' | ( ruleCommonModifier )* 'annotation' ruleValidID '{' ( ruleAnnotationField )* '}' )";
        }
    }
    static final String DFA53_eotS =
        "\11\uffff";
    static final String DFA53_eofS =
        "\11\uffff";
    static final String DFA53_minS =
        "\2\4\1\uffff\1\4\3\uffff\1\4\1\uffff";
    static final String DFA53_maxS =
        "\2\137\1\uffff\1\154\3\uffff\1\137\1\uffff";
    static final String DFA53_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\1\3\1\4\1\uffff\1\5";
    static final String DFA53_specialS =
        "\11\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\2\24\uffff\1\1\1\uffff\1\4\7\uffff\1\5\1\6\1\3\2\uffff\1"+
            "\2\3\uffff\14\1\2\2\2\uffff\1\2\1\uffff\3\2\36\uffff\1\2",
            "\1\2\24\uffff\1\1\1\uffff\1\4\7\uffff\1\5\1\6\1\3\2\uffff\1"+
            "\2\3\uffff\14\1\2\2\2\uffff\1\2\1\uffff\3\2\36\uffff\1\2",
            "",
            "\1\7\27\uffff\1\2\10\uffff\1\7\26\uffff\1\7\1\uffff\3\7\14"+
            "\uffff\1\2\36\uffff\1\2",
            "",
            "",
            "",
            "\1\2\24\uffff\3\2\5\uffff\1\10\5\2\1\uffff\1\2\3\uffff\16\2"+
            "\2\uffff\1\2\1\uffff\3\2\12\uffff\1\2\23\uffff\1\2",
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "54:19: ( ( ( ruleCommonModifier )* ruleFieldModifier ( ruleCommonModifier )* ( ruleJvmTypeReference )? ruleValidID | ( ruleCommonModifier )* ruleJvmTypeReference ruleValidID ) ( '=' ruleXAnnotationElementValue )? ( ';' )? | ( ruleCommonModifier )* 'class' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference )? ( 'implements' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'interface' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'enum' ruleValidID '{' ( ruleXtendEnumLiteral ( ',' ruleXtendEnumLiteral )* )? ( ';' )? '}' | ( ruleCommonModifier )* 'annotation' ruleValidID '{' ( ruleAnnotationField )* '}' )";
        }
    }
    static final String DFA31_eotS =
        "\4\uffff";
    static final String DFA31_eofS =
        "\4\uffff";
    static final String DFA31_minS =
        "\2\4\2\uffff";
    static final String DFA31_maxS =
        "\2\137\2\uffff";
    static final String DFA31_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA31_specialS =
        "\4\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\3\24\uffff\1\1\13\uffff\1\3\2\uffff\1\3\3\uffff\14\1\2\2"+
            "\2\uffff\1\3\1\uffff\3\3\36\uffff\1\3",
            "\1\3\24\uffff\1\1\13\uffff\1\3\2\uffff\1\3\3\uffff\14\1\2\2"+
            "\2\uffff\1\3\1\uffff\3\3\36\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "55:3: ( ( ruleCommonModifier )* ruleFieldModifier ( ruleCommonModifier )* ( ruleJvmTypeReference )? ruleValidID | ( ruleCommonModifier )* ruleJvmTypeReference ruleValidID )";
        }
    }
    static final String DFA29_eotS =
        "\16\uffff";
    static final String DFA29_eofS =
        "\16\uffff";
    static final String DFA29_minS =
        "\2\4\1\uffff\1\4\1\uffff\11\4";
    static final String DFA29_maxS =
        "\1\137\1\154\1\uffff\1\154\1\uffff\11\154";
    static final String DFA29_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\11\uffff";
    static final String DFA29_specialS =
        "\16\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\1\40\uffff\1\1\2\uffff\1\2\23\uffff\1\1\1\uffff\3\1\36\uffff"+
            "\1\2",
            "\1\5\24\uffff\3\4\1\2\5\uffff\3\4\1\3\1\4\1\uffff\1\4\3\uffff"+
            "\16\4\2\uffff\1\5\1\uffff\3\5\12\uffff\1\4\1\uffff\1\2\21\uffff"+
            "\1\4\14\uffff\1\2",
            "",
            "\1\7\24\uffff\3\2\1\4\5\uffff\3\2\1\6\1\2\1\uffff\1\2\3\uffff"+
            "\16\2\2\uffff\1\7\1\uffff\3\7\12\uffff\1\2\1\uffff\1\4\21\uffff"+
            "\1\2\14\uffff\1\4",
            "",
            "\1\11\24\uffff\3\2\1\4\5\uffff\3\2\1\10\1\2\1\uffff\1\2\3\uffff"+
            "\16\2\2\uffff\1\11\1\uffff\3\11\12\uffff\1\2\1\uffff\1\4\21"+
            "\uffff\1\2\14\uffff\1\4",
            "\1\13\24\uffff\3\4\1\2\4\uffff\4\4\1\12\1\4\1\uffff\1\4\3\uffff"+
            "\16\4\2\uffff\1\13\1\uffff\3\13\12\uffff\1\4\1\uffff\1\2\21"+
            "\uffff\1\4\14\uffff\1\2",
            "\1\15\24\uffff\3\4\1\2\4\uffff\4\4\1\14\1\4\1\uffff\1\4\3\uffff"+
            "\16\4\2\uffff\1\15\1\uffff\3\15\12\uffff\1\4\1\uffff\1\2\21"+
            "\uffff\1\4\14\uffff\1\2",
            "\1\13\24\uffff\3\4\1\2\5\uffff\3\4\1\12\1\4\1\uffff\1\4\3\uffff"+
            "\16\4\2\uffff\1\13\1\uffff\3\13\12\uffff\1\4\1\uffff\1\2\21"+
            "\uffff\1\4\14\uffff\1\2",
            "\1\15\24\uffff\3\4\1\2\5\uffff\3\4\1\14\1\4\1\uffff\1\4\3\uffff"+
            "\16\4\2\uffff\1\15\1\uffff\3\15\12\uffff\1\4\1\uffff\1\2\21"+
            "\uffff\1\4\14\uffff\1\2",
            "\1\7\24\uffff\3\2\1\4\4\uffff\4\2\1\6\1\2\1\uffff\1\2\3\uffff"+
            "\16\2\2\uffff\1\7\1\uffff\3\7\12\uffff\1\2\1\uffff\1\4\21\uffff"+
            "\1\2\14\uffff\1\4",
            "\1\11\24\uffff\3\2\1\4\4\uffff\4\2\1\10\1\2\1\uffff\1\2\3\uffff"+
            "\16\2\2\uffff\1\11\1\uffff\3\11\12\uffff\1\2\1\uffff\1\4\21"+
            "\uffff\1\2\14\uffff\1\4",
            "\1\7\24\uffff\3\2\1\4\5\uffff\3\2\1\6\1\2\1\uffff\1\2\3\uffff"+
            "\16\2\2\uffff\1\7\1\uffff\3\7\12\uffff\1\2\1\uffff\1\4\21\uffff"+
            "\1\2\14\uffff\1\4",
            "\1\11\24\uffff\3\2\1\4\5\uffff\3\2\1\10\1\2\1\uffff\1\2\3\uffff"+
            "\16\2\2\uffff\1\11\1\uffff\3\11\12\uffff\1\2\1\uffff\1\4\21"+
            "\uffff\1\2\14\uffff\1\4"
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "57:4: ( ruleJvmTypeReference )?";
        }
    }
    static final String DFA102_eotS =
        "\13\uffff";
    static final String DFA102_eofS =
        "\13\uffff";
    static final String DFA102_minS =
        "\2\4\1\uffff\1\4\5\uffff\1\4\1\uffff";
    static final String DFA102_maxS =
        "\2\137\1\uffff\1\154\5\uffff\1\137\1\uffff";
    static final String DFA102_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7";
    static final String DFA102_specialS =
        "\13\uffff}>";
    static final String[] DFA102_transitionS = {
            "\1\2\24\uffff\1\1\1\uffff\1\6\7\uffff\1\7\1\10\1\3\1\uffff\2"+
            "\2\2\uffff\1\5\14\1\2\2\2\4\1\2\1\uffff\3\2\36\uffff\1\2",
            "\1\2\24\uffff\1\1\1\uffff\1\6\7\uffff\1\7\1\10\1\3\1\uffff"+
            "\2\2\2\uffff\1\5\14\1\2\2\2\4\1\2\1\uffff\3\2\36\uffff\1\2",
            "",
            "\1\11\27\uffff\1\2\10\uffff\1\11\26\uffff\1\11\1\uffff\3\11"+
            "\14\uffff\1\2\36\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "\1\2\24\uffff\3\2\5\uffff\1\12\7\2\2\uffff\22\2\1\uffff\3\2"+
            "\12\uffff\1\2\23\uffff\1\2",
            ""
    };

    static final short[] DFA102_eot = DFA.unpackEncodedString(DFA102_eotS);
    static final short[] DFA102_eof = DFA.unpackEncodedString(DFA102_eofS);
    static final char[] DFA102_min = DFA.unpackEncodedStringToUnsignedChars(DFA102_minS);
    static final char[] DFA102_max = DFA.unpackEncodedStringToUnsignedChars(DFA102_maxS);
    static final short[] DFA102_accept = DFA.unpackEncodedString(DFA102_acceptS);
    static final short[] DFA102_special = DFA.unpackEncodedString(DFA102_specialS);
    static final short[][] DFA102_transition;

    static {
        int numStates = DFA102_transitionS.length;
        DFA102_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA102_transition[i] = DFA.unpackEncodedString(DFA102_transitionS[i]);
        }
    }

    class DFA102 extends DFA {

        public DFA102(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 102;
            this.eot = DFA102_eot;
            this.eof = DFA102_eof;
            this.min = DFA102_min;
            this.max = DFA102_max;
            this.accept = DFA102_accept;
            this.special = DFA102_special;
            this.transition = DFA102_transition;
        }
        public String getDescription() {
            return "93:19: ( ( ruleCommonModifier )* ( ruleFieldModifier ( ruleCommonModifier )* ( ruleJvmTypeReference )? ruleValidID | 'extension' ( ruleFieldModifier | ruleCommonModifier )* ruleJvmTypeReference ( ruleValidID )? | ruleFieldModifier ( ruleCommonModifier )* 'extension' ( ruleCommonModifier )* ruleJvmTypeReference ( ruleValidID )? | ruleJvmTypeReference ruleValidID ) ( '=' ruleXExpression )? ( ';' )? | ( ruleCommonModifier )* ruleMethodModifier ( ruleCommonModifier | ruleMethodModifier )* ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( ( ( ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '(' )=> ( ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '(' ) ) | ( ( ruleJvmTypeReference ruleFunctionID '(' )=> ( ruleJvmTypeReference ruleFunctionID '(' ) ) | ( ( ruleTypeReferenceNoTypeArgs ruleFunctionID '(' )=> ( ruleTypeReferenceNoTypeArgs ruleFunctionID '(' ) ) | ( ( ruleCreateExtensionInfo ruleValidID '(' )=> ( ruleCreateExtensionInfo ruleValidID '(' ) ) | ruleFunctionID '(' ) ( ruleParameter ( ',' ruleParameter )* )? ')' ( 'throws' ruleJvmTypeReference ( ',' ruleJvmTypeReference )* )? ( ruleXBlockExpression | ruleRichString | ';' )? | ( ruleCommonModifier )* 'new' ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? '(' ( ruleParameter ( ',' ruleParameter )* )? ')' ( 'throws' ruleJvmTypeReference ( ',' ruleJvmTypeReference )* )? ruleXBlockExpression | ( ruleCommonModifier )* 'class' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference )? ( 'implements' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'interface' ruleValidID ( '<' ruleJvmTypeParameter ( ',' ruleJvmTypeParameter )* '>' )? ( 'extends' ruleJvmParameterizedTypeReference ( ',' ruleJvmParameterizedTypeReference )* )? '{' ( ruleMember )* '}' | ( ruleCommonModifier )* 'enum' ruleValidID '{' ( ruleXtendEnumLiteral ( ',' ruleXtendEnumLiteral )* )? ( ';' )? '}' | ( ruleCommonModifier )* 'annotation' ruleValidID '{' ( ruleAnnotationField )* '}' )";
        }
    }
    static final String DFA63_eotS =
        "\7\uffff";
    static final String DFA63_eofS =
        "\7\uffff";
    static final String DFA63_minS =
        "\2\4\2\uffff\1\4\2\uffff";
    static final String DFA63_maxS =
        "\2\137\2\uffff\1\137\2\uffff";
    static final String DFA63_acceptS =
        "\2\uffff\1\2\1\4\1\uffff\1\3\1\1";
    static final String DFA63_specialS =
        "\7\uffff}>";
    static final String[] DFA63_transitionS = {
            "\1\3\40\uffff\1\3\1\uffff\1\2\1\3\17\uffff\2\1\2\uffff\1\3\1"+
            "\uffff\3\3\36\uffff\1\3",
            "\1\6\24\uffff\1\4\13\uffff\1\6\1\uffff\1\5\1\6\3\uffff\14\4"+
            "\4\uffff\1\6\1\uffff\3\6\36\uffff\1\6",
            "",
            "",
            "\1\6\24\uffff\1\4\13\uffff\1\6\1\uffff\1\5\1\6\3\uffff\14\4"+
            "\4\uffff\1\6\1\uffff\3\6\36\uffff\1\6",
            "",
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "94:23: ( ruleFieldModifier ( ruleCommonModifier )* ( ruleJvmTypeReference )? ruleValidID | 'extension' ( ruleFieldModifier | ruleCommonModifier )* ruleJvmTypeReference ( ruleValidID )? | ruleFieldModifier ( ruleCommonModifier )* 'extension' ( ruleCommonModifier )* ruleJvmTypeReference ( ruleValidID )? | ruleJvmTypeReference ruleValidID )";
        }
    }
    static final String DFA57_eotS =
        "\16\uffff";
    static final String DFA57_eofS =
        "\16\uffff";
    static final String DFA57_minS =
        "\2\4\1\uffff\1\4\1\uffff\11\4";
    static final String DFA57_maxS =
        "\1\137\1\154\1\uffff\1\154\1\uffff\11\154";
    static final String DFA57_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\11\uffff";
    static final String DFA57_specialS =
        "\16\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\1\40\uffff\1\1\2\uffff\1\2\23\uffff\1\1\1\uffff\3\1\36\uffff"+
            "\1\2",
            "\1\5\24\uffff\3\4\1\2\5\uffff\3\4\1\3\3\4\2\uffff\21\4\1\5"+
            "\1\uffff\3\5\12\uffff\1\4\1\uffff\1\2\21\uffff\1\4\14\uffff"+
            "\1\2",
            "",
            "\1\7\24\uffff\3\2\1\4\5\uffff\3\2\1\6\3\2\2\uffff\21\2\1\7"+
            "\1\uffff\3\7\12\uffff\1\2\1\uffff\1\4\21\uffff\1\2\14\uffff"+
            "\1\4",
            "",
            "\1\11\24\uffff\3\2\1\4\5\uffff\3\2\1\10\3\2\2\uffff\21\2\1"+
            "\11\1\uffff\3\11\12\uffff\1\2\1\uffff\1\4\21\uffff\1\2\14\uffff"+
            "\1\4",
            "\1\13\24\uffff\3\4\1\2\4\uffff\4\4\1\12\3\4\2\uffff\21\4\1"+
            "\13\1\uffff\3\13\12\uffff\1\4\1\uffff\1\2\21\uffff\1\4\14\uffff"+
            "\1\2",
            "\1\15\24\uffff\3\4\1\2\4\uffff\4\4\1\14\3\4\2\uffff\21\4\1"+
            "\15\1\uffff\3\15\12\uffff\1\4\1\uffff\1\2\21\uffff\1\4\14\uffff"+
            "\1\2",
            "\1\13\24\uffff\3\4\1\2\5\uffff\3\4\1\12\3\4\2\uffff\21\4\1"+
            "\13\1\uffff\3\13\12\uffff\1\4\1\uffff\1\2\21\uffff\1\4\14\uffff"+
            "\1\2",
            "\1\15\24\uffff\3\4\1\2\5\uffff\3\4\1\14\3\4\2\uffff\21\4\1"+
            "\15\1\uffff\3\15\12\uffff\1\4\1\uffff\1\2\21\uffff\1\4\14\uffff"+
            "\1\2",
            "\1\7\24\uffff\3\2\1\4\4\uffff\4\2\1\6\3\2\2\uffff\21\2\1\7"+
            "\1\uffff\3\7\12\uffff\1\2\1\uffff\1\4\21\uffff\1\2\14\uffff"+
            "\1\4",
            "\1\11\24\uffff\3\2\1\4\4\uffff\4\2\1\10\3\2\2\uffff\21\2\1"+
            "\11\1\uffff\3\11\12\uffff\1\2\1\uffff\1\4\21\uffff\1\2\14\uffff"+
            "\1\4",
            "\1\7\24\uffff\3\2\1\4\5\uffff\3\2\1\6\3\2\2\uffff\21\2\1\7"+
            "\1\uffff\3\7\12\uffff\1\2\1\uffff\1\4\21\uffff\1\2\14\uffff"+
            "\1\4",
            "\1\11\24\uffff\3\2\1\4\5\uffff\3\2\1\10\3\2\2\uffff\21\2\1"+
            "\11\1\uffff\3\11\12\uffff\1\2\1\uffff\1\4\21\uffff\1\2\14\uffff"+
            "\1\4"
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "95:42: ( ruleJvmTypeReference )?";
        }
    }
    static final String DFA59_eotS =
        "\15\uffff";
    static final String DFA59_eofS =
        "\15\uffff";
    static final String DFA59_minS =
        "\2\4\1\uffff\2\4\1\uffff\7\4";
    static final String DFA59_maxS =
        "\1\137\1\154\1\uffff\2\154\1\uffff\7\154";
    static final String DFA59_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\7\uffff";
    static final String DFA59_specialS =
        "\15\uffff}>";
    static final String[] DFA59_transitionS = {
            "\1\3\24\uffff\3\2\6\uffff\3\2\1\1\3\2\2\uffff\21\2\1\3\1\uffff"+
            "\3\3\12\uffff\1\2\23\uffff\1\2",
            "\1\6\24\uffff\3\5\1\2\5\uffff\3\5\1\4\3\5\2\uffff\21\5\1\6"+
            "\1\uffff\3\6\12\uffff\1\5\1\uffff\1\2\21\uffff\1\5\14\uffff"+
            "\1\2",
            "",
            "\1\10\24\uffff\3\5\1\2\5\uffff\3\5\1\7\3\5\2\uffff\21\5\1\10"+
            "\1\uffff\3\10\12\uffff\1\5\1\uffff\1\2\21\uffff\1\5\14\uffff"+
            "\1\2",
            "\1\12\24\uffff\3\2\1\5\4\uffff\4\2\1\11\3\2\2\uffff\21\2\1"+
            "\12\1\uffff\3\12\12\uffff\1\2\1\uffff\1\5\21\uffff\1\2\14\uffff"+
            "\1\5",
            "",
            "\1\14\24\uffff\3\2\1\5\4\uffff\4\2\1\13\3\2\2\uffff\21\2\1"+
            "\14\1\uffff\3\14\12\uffff\1\2\1\uffff\1\5\21\uffff\1\2\14\uffff"+
            "\1\5",
            "\1\12\24\uffff\3\2\1\5\5\uffff\3\2\1\11\3\2\2\uffff\21\2\1"+
            "\12\1\uffff\3\12\12\uffff\1\2\1\uffff\1\5\21\uffff\1\2\14\uffff"+
            "\1\5",
            "\1\14\24\uffff\3\2\1\5\5\uffff\3\2\1\13\3\2\2\uffff\21\2\1"+
            "\14\1\uffff\3\14\12\uffff\1\2\1\uffff\1\5\21\uffff\1\2\14\uffff"+
            "\1\5",
            "\1\6\24\uffff\3\5\1\2\4\uffff\4\5\1\4\3\5\2\uffff\21\5\1\6"+
            "\1\uffff\3\6\12\uffff\1\5\1\uffff\1\2\21\uffff\1\5\14\uffff"+
            "\1\2",
            "\1\10\24\uffff\3\5\1\2\4\uffff\4\5\1\7\3\5\2\uffff\21\5\1\10"+
            "\1\uffff\3\10\12\uffff\1\5\1\uffff\1\2\21\uffff\1\5\14\uffff"+
            "\1\2",
            "\1\6\24\uffff\3\5\1\2\5\uffff\3\5\1\4\3\5\2\uffff\21\5\1\6"+
            "\1\uffff\3\6\12\uffff\1\5\1\uffff\1\2\21\uffff\1\5\14\uffff"+
            "\1\2",
            "\1\10\24\uffff\3\5\1\2\5\uffff\3\5\1\7\3\5\2\uffff\21\5\1\10"+
            "\1\uffff\3\10\12\uffff\1\5\1\uffff\1\2\21\uffff\1\5\14\uffff"+
            "\1\2"
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "99:28: ( ruleValidID )?";
        }
    }
    static final String DFA62_eotS =
        "\15\uffff";
    static final String DFA62_eofS =
        "\15\uffff";
    static final String DFA62_minS =
        "\2\4\1\uffff\2\4\1\uffff\7\4";
    static final String DFA62_maxS =
        "\1\137\1\154\1\uffff\2\154\1\uffff\7\154";
    static final String DFA62_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\7\uffff";
    static final String DFA62_specialS =
        "\15\uffff}>";
    static final String[] DFA62_transitionS = {
            "\1\3\24\uffff\3\2\6\uffff\3\2\1\1\3\2\2\uffff\21\2\1\3\1\uffff"+
            "\3\3\12\uffff\1\2\23\uffff\1\2",
            "\1\6\24\uffff\3\5\1\2\5\uffff\3\5\1\4\3\5\2\uffff\21\5\1\6"+
            "\1\uffff\3\6\12\uffff\1\5\1\uffff\1\2\21\uffff\1\5\14\uffff"+
            "\1\2",
            "",
            "\1\10\24\uffff\3\5\1\2\5\uffff\3\5\1\7\3\5\2\uffff\21\5\1\10"+
            "\1\uffff\3\10\12\uffff\1\5\1\uffff\1\2\21\uffff\1\5\14\uffff"+
            "\1\2",
            "\1\12\24\uffff\3\2\1\5\4\uffff\4\2\1\11\3\2\2\uffff\21\2\1"+
            "\12\1\uffff\3\12\12\uffff\1\2\1\uffff\1\5\21\uffff\1\2\14\uffff"+
            "\1\5",
            "",
            "\1\14\24\uffff\3\2\1\5\4\uffff\4\2\1\13\3\2\2\uffff\21\2\1"+
            "\14\1\uffff\3\14\12\uffff\1\2\1\uffff\1\5\21\uffff\1\2\14\uffff"+
            "\1\5",
            "\1\12\24\uffff\3\2\1\5\5\uffff\3\2\1\11\3\2\2\uffff\21\2\1"+
            "\12\1\uffff\3\12\12\uffff\1\2\1\uffff\1\5\21\uffff\1\2\14\uffff"+
            "\1\5",
            "\1\14\24\uffff\3\2\1\5\5\uffff\3\2\1\13\3\2\2\uffff\21\2\1"+
            "\14\1\uffff\3\14\12\uffff\1\2\1\uffff\1\5\21\uffff\1\2\14\uffff"+
            "\1\5",
            "\1\6\24\uffff\3\5\1\2\4\uffff\4\5\1\4\3\5\2\uffff\21\5\1\6"+
            "\1\uffff\3\6\12\uffff\1\5\1\uffff\1\2\21\uffff\1\5\14\uffff"+
            "\1\2",
            "\1\10\24\uffff\3\5\1\2\4\uffff\4\5\1\7\3\5\2\uffff\21\5\1\10"+
            "\1\uffff\3\10\12\uffff\1\5\1\uffff\1\2\21\uffff\1\5\14\uffff"+
            "\1\2",
            "\1\6\24\uffff\3\5\1\2\5\uffff\3\5\1\4\3\5\2\uffff\21\5\1\6"+
            "\1\uffff\3\6\12\uffff\1\5\1\uffff\1\2\21\uffff\1\5\14\uffff"+
            "\1\2",
            "\1\10\24\uffff\3\5\1\2\5\uffff\3\5\1\7\3\5\2\uffff\21\5\1\10"+
            "\1\uffff\3\10\12\uffff\1\5\1\uffff\1\2\21\uffff\1\5\14\uffff"+
            "\1\2"
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "101:25: ( ruleValidID )?";
        }
    }
    static final String DFA70_eotS =
        "\34\uffff";
    static final String DFA70_eofS =
        "\34\uffff";
    static final String DFA70_minS =
        "\1\4\4\0\27\uffff";
    static final String DFA70_maxS =
        "\1\153\4\0\27\uffff";
    static final String DFA70_acceptS =
        "\5\uffff\1\5\22\uffff\1\1\1\2\1\3\1\4";
    static final String DFA70_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\27\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\4\27\uffff\1\5\1\uffff\1\5\6\uffff\1\4\2\uffff\1\2\23\uffff"+
            "\1\1\1\uffff\3\4\16\uffff\14\5\1\uffff\3\5\1\3\11\5\1\uffff"+
            "\2\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "113:6: ( ( ( ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '(' )=> ( ruleJvmTypeReference ruleCreateExtensionInfo ruleValidID '(' ) ) | ( ( ruleJvmTypeReference ruleFunctionID '(' )=> ( ruleJvmTypeReference ruleFunctionID '(' ) ) | ( ( ruleTypeReferenceNoTypeArgs ruleFunctionID '(' )=> ( ruleTypeReferenceNoTypeArgs ruleFunctionID '(' ) ) | ( ( ruleCreateExtensionInfo ruleValidID '(' )=> ( ruleCreateExtensionInfo ruleValidID '(' ) ) | ruleFunctionID '(' )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Xtend()) ) {s = 24;}

                        else if ( (synpred2_Xtend()) ) {s = 25;}

                        else if ( (synpred3_Xtend()) ) {s = 26;}

                        else if ( (synpred4_Xtend()) ) {s = 27;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA70_2 = input.LA(1);

                         
                        int index70_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Xtend()) ) {s = 24;}

                        else if ( (synpred2_Xtend()) ) {s = 25;}

                         
                        input.seek(index70_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA70_3 = input.LA(1);

                         
                        int index70_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Xtend()) ) {s = 24;}

                        else if ( (synpred2_Xtend()) ) {s = 25;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index70_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA70_4 = input.LA(1);

                         
                        int index70_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Xtend()) ) {s = 24;}

                        else if ( (synpred2_Xtend()) ) {s = 25;}

                        else if ( (synpred3_Xtend()) ) {s = 26;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index70_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA104_eotS =
        "\16\uffff";
    static final String DFA104_eofS =
        "\16\uffff";
    static final String DFA104_minS =
        "\1\34\1\uffff\1\34\1\36\10\uffff\1\34\1\36";
    static final String DFA104_maxS =
        "\1\153\1\uffff\1\137\1\136\10\uffff\1\50\1\124";
    static final String DFA104_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff";
    static final String DFA104_specialS =
        "\16\uffff}>";
    static final String[] DFA104_transitionS = {
            "\1\2\1\uffff\1\3\60\uffff\5\1\1\7\1\4\1\5\4\6\1\uffff\6\10\2"+
            "\12\4\11\1\12\1\uffff\2\13",
            "",
            "\1\14\11\uffff\1\7\1\uffff\1\7\66\uffff\1\10",
            "\1\15\11\uffff\1\7\53\uffff\1\1\11\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\10\11\uffff\1\1\1\uffff\1\10",
            "\1\10\11\uffff\1\10\53\uffff\1\1"
    };

    static final short[] DFA104_eot = DFA.unpackEncodedString(DFA104_eotS);
    static final short[] DFA104_eof = DFA.unpackEncodedString(DFA104_eofS);
    static final char[] DFA104_min = DFA.unpackEncodedStringToUnsignedChars(DFA104_minS);
    static final char[] DFA104_max = DFA.unpackEncodedStringToUnsignedChars(DFA104_maxS);
    static final short[] DFA104_accept = DFA.unpackEncodedString(DFA104_acceptS);
    static final short[] DFA104_special = DFA.unpackEncodedString(DFA104_specialS);
    static final short[][] DFA104_transition;

    static {
        int numStates = DFA104_transitionS.length;
        DFA104_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA104_transition[i] = DFA.unpackEncodedString(DFA104_transitionS[i]);
        }
    }

    class DFA104 extends DFA {

        public DFA104(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 104;
            this.eot = DFA104_eot;
            this.eof = DFA104_eof;
            this.min = DFA104_min;
            this.max = DFA104_max;
            this.accept = DFA104_accept;
            this.special = DFA104_special;
            this.transition = DFA104_transition;
        }
        public String getDescription() {
            return "202:1: ruleOperators : ( ruleOpMultiAssign | ruleOpOr | ruleOpAnd | ruleOpEquality | ruleOpCompare | ruleOpOther | ruleOpMulti | ruleOpUnary | ruleOpPostfix );";
        }
    }
    static final String DFA116_eotS =
        "\115\uffff";
    static final String DFA116_eofS =
        "\115\uffff";
    static final String DFA116_minS =
        "\1\4\1\0\113\uffff";
    static final String DFA116_maxS =
        "\1\177\1\0\113\uffff";
    static final String DFA116_acceptS =
        "\2\uffff\1\2\111\uffff\1\1";
    static final String DFA116_specialS =
        "\1\uffff\1\0\113\uffff}>";
    static final String[] DFA116_transitionS = {
            "\13\2\12\uffff\10\2\1\1\4\2\1\uffff\33\2\1\uffff\2\2\6\uffff"+
            "\44\2\1\uffff\20\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA116_eot = DFA.unpackEncodedString(DFA116_eotS);
    static final short[] DFA116_eof = DFA.unpackEncodedString(DFA116_eofS);
    static final char[] DFA116_min = DFA.unpackEncodedStringToUnsignedChars(DFA116_minS);
    static final char[] DFA116_max = DFA.unpackEncodedStringToUnsignedChars(DFA116_maxS);
    static final short[] DFA116_accept = DFA.unpackEncodedString(DFA116_acceptS);
    static final short[] DFA116_special = DFA.unpackEncodedString(DFA116_specialS);
    static final short[][] DFA116_transition;

    static {
        int numStates = DFA116_transitionS.length;
        DFA116_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA116_transition[i] = DFA.unpackEncodedString(DFA116_transitionS[i]);
        }
    }

    class DFA116 extends DFA {

        public DFA116(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 116;
            this.eot = DFA116_eot;
            this.eof = DFA116_eof;
            this.min = DFA116_min;
            this.max = DFA116_max;
            this.accept = DFA116_accept;
            this.special = DFA116_special;
            this.transition = DFA116_transition;
        }
        public String getDescription() {
            return "344:27: ( ( ( '{' )=> '{' ) ( ruleMember )* '}' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA116_1 = input.LA(1);

                         
                        int index116_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index116_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 116, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA118_eotS =
        "\115\uffff";
    static final String DFA118_eofS =
        "\115\uffff";
    static final String DFA118_minS =
        "\1\4\1\0\113\uffff";
    static final String DFA118_maxS =
        "\1\177\1\0\113\uffff";
    static final String DFA118_acceptS =
        "\2\uffff\1\2\111\uffff\1\1";
    static final String DFA118_specialS =
        "\1\uffff\1\0\113\uffff}>";
    static final String[] DFA118_transitionS = {
            "\13\2\12\uffff\3\2\1\1\11\2\1\uffff\33\2\1\uffff\2\2\6\uffff"+
            "\44\2\1\uffff\20\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA118_eot = DFA.unpackEncodedString(DFA118_eotS);
    static final short[] DFA118_eof = DFA.unpackEncodedString(DFA118_eofS);
    static final char[] DFA118_min = DFA.unpackEncodedStringToUnsignedChars(DFA118_minS);
    static final char[] DFA118_max = DFA.unpackEncodedStringToUnsignedChars(DFA118_maxS);
    static final short[] DFA118_accept = DFA.unpackEncodedString(DFA118_acceptS);
    static final short[] DFA118_special = DFA.unpackEncodedString(DFA118_specialS);
    static final short[][] DFA118_transition;

    static {
        int numStates = DFA118_transitionS.length;
        DFA118_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA118_transition[i] = DFA.unpackEncodedString(DFA118_transitionS[i]);
        }
    }

    class DFA118 extends DFA {

        public DFA118(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 118;
            this.eot = DFA118_eot;
            this.eof = DFA118_eof;
            this.min = DFA118_min;
            this.max = DFA118_max;
            this.accept = DFA118_accept;
            this.special = DFA118_special;
            this.transition = DFA118_transition;
        }
        public String getDescription() {
            return "353:26: ( ( ( '<' )=> '<' ) ruleJvmArgumentTypeReference ( ',' ruleJvmArgumentTypeReference )* '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA118_1 = input.LA(1);

                         
                        int index118_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index118_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 118, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA121_eotS =
        "\115\uffff";
    static final String DFA121_eofS =
        "\115\uffff";
    static final String DFA121_minS =
        "\1\4\1\0\113\uffff";
    static final String DFA121_maxS =
        "\1\177\1\0\113\uffff";
    static final String DFA121_acceptS =
        "\2\uffff\1\2\111\uffff\1\1";
    static final String DFA121_specialS =
        "\1\uffff\1\0\113\uffff}>";
    static final String[] DFA121_transitionS = {
            "\13\2\12\uffff\15\2\1\uffff\1\2\1\1\31\2\1\uffff\2\2\6\uffff"+
            "\44\2\1\uffff\20\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA121_eot = DFA.unpackEncodedString(DFA121_eotS);
    static final short[] DFA121_eof = DFA.unpackEncodedString(DFA121_eofS);
    static final char[] DFA121_min = DFA.unpackEncodedStringToUnsignedChars(DFA121_minS);
    static final char[] DFA121_max = DFA.unpackEncodedStringToUnsignedChars(DFA121_maxS);
    static final short[] DFA121_accept = DFA.unpackEncodedString(DFA121_acceptS);
    static final short[] DFA121_special = DFA.unpackEncodedString(DFA121_specialS);
    static final short[][] DFA121_transition;

    static {
        int numStates = DFA121_transitionS.length;
        DFA121_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA121_transition[i] = DFA.unpackEncodedString(DFA121_transitionS[i]);
        }
    }

    class DFA121 extends DFA {

        public DFA121(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 121;
            this.eot = DFA121_eot;
            this.eof = DFA121_eof;
            this.min = DFA121_min;
            this.max = DFA121_max;
            this.accept = DFA121_accept;
            this.special = DFA121_special;
            this.transition = DFA121_transition;
        }
        public String getDescription() {
            return "359:5: ( ( ( '(' )=> '(' ) ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )? ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA121_1 = input.LA(1);

                         
                        int index121_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index121_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 121, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA120_eotS =
        "\40\uffff";
    static final String DFA120_eofS =
        "\40\uffff";
    static final String DFA120_minS =
        "\1\4\3\0\1\uffff\1\0\5\uffff\1\0\24\uffff";
    static final String DFA120_maxS =
        "\1\175\3\0\1\uffff\1\0\5\uffff\1\0\24\uffff";
    static final String DFA120_acceptS =
        "\4\uffff\1\1\1\uffff\1\1\1\2\27\uffff\1\3";
    static final String DFA120_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\5\uffff\1\5\24\uffff}>";
    static final String[] DFA120_transitionS = {
            "\1\2\3\7\4\uffff\3\7\12\uffff\1\13\1\uffff\1\13\1\7\2\uffff"+
            "\2\13\1\7\1\uffff\2\13\1\2\1\uffff\1\1\1\3\1\37\1\13\1\7\12"+
            "\13\1\5\1\13\2\uffff\2\13\1\2\1\uffff\3\2\1\13\1\uffff\1\7\10"+
            "\uffff\2\7\21\uffff\1\4\2\uffff\2\7\4\uffff\1\7\6\uffff\1\6"+
            "\1\7\2\uffff\13\7",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA120_eot = DFA.unpackEncodedString(DFA120_eotS);
    static final short[] DFA120_eof = DFA.unpackEncodedString(DFA120_eofS);
    static final char[] DFA120_min = DFA.unpackEncodedStringToUnsignedChars(DFA120_minS);
    static final char[] DFA120_max = DFA.unpackEncodedStringToUnsignedChars(DFA120_maxS);
    static final short[] DFA120_accept = DFA.unpackEncodedString(DFA120_acceptS);
    static final short[] DFA120_special = DFA.unpackEncodedString(DFA120_specialS);
    static final short[][] DFA120_transition;

    static {
        int numStates = DFA120_transitionS.length;
        DFA120_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA120_transition[i] = DFA.unpackEncodedString(DFA120_transitionS[i]);
        }
    }

    class DFA120 extends DFA {

        public DFA120(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 120;
            this.eot = DFA120_eot;
            this.eof = DFA120_eof;
            this.min = DFA120_min;
            this.max = DFA120_max;
            this.accept = DFA120_accept;
            this.special = DFA120_special;
            this.transition = DFA120_transition;
        }
        public String getDescription() {
            return "362:14: ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA120_0 = input.LA(1);

                         
                        int index120_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_0==39) ) {s = 1;}

                        else if ( (LA120_0==RULE_ID||LA120_0==37||LA120_0==60||(LA120_0>=62 && LA120_0<=64)) ) {s = 2;}

                        else if ( (LA120_0==40) ) {s = 3;}

                        else if ( (LA120_0==95) && (synpred10_Xtend())) {s = 4;}

                        else if ( (LA120_0==54) ) {s = 5;}

                        else if ( (LA120_0==111) && (synpred10_Xtend())) {s = 6;}

                        else if ( ((LA120_0>=RULE_STRING && LA120_0<=RULE_RICH_TEXT_START)||(LA120_0>=RULE_HEX && LA120_0<=RULE_DECIMAL)||LA120_0==28||LA120_0==33||LA120_0==43||LA120_0==67||(LA120_0>=76 && LA120_0<=77)||(LA120_0>=98 && LA120_0<=99)||LA120_0==104||LA120_0==112||(LA120_0>=115 && LA120_0<=125)) ) {s = 7;}

                        else if ( (LA120_0==25||LA120_0==27||(LA120_0>=31 && LA120_0<=32)||(LA120_0>=35 && LA120_0<=36)||LA120_0==42||(LA120_0>=44 && LA120_0<=53)||LA120_0==55||(LA120_0>=58 && LA120_0<=59)||LA120_0==65) ) {s = 11;}

                        else if ( (LA120_0==41) ) {s = 31;}

                         
                        input.seek(index120_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA120_1 = input.LA(1);

                         
                        int index120_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_Xtend()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index120_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA120_2 = input.LA(1);

                         
                        int index120_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_Xtend()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index120_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA120_3 = input.LA(1);

                         
                        int index120_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_Xtend()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index120_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA120_5 = input.LA(1);

                         
                        int index120_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_Xtend()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index120_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA120_11 = input.LA(1);

                         
                        int index120_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_Xtend()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index120_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 120, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA122_eotS =
        "\115\uffff";
    static final String DFA122_eofS =
        "\115\uffff";
    static final String DFA122_minS =
        "\1\4\1\0\113\uffff";
    static final String DFA122_maxS =
        "\1\177\1\0\113\uffff";
    static final String DFA122_acceptS =
        "\2\uffff\1\2\111\uffff\1\1";
    static final String DFA122_specialS =
        "\1\uffff\1\0\113\uffff}>";
    static final String[] DFA122_transitionS = {
            "\13\2\12\uffff\15\2\1\uffff\33\2\1\uffff\2\2\6\uffff\2\2\1\1"+
            "\41\2\1\uffff\20\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA122_eot = DFA.unpackEncodedString(DFA122_eotS);
    static final short[] DFA122_eof = DFA.unpackEncodedString(DFA122_eofS);
    static final char[] DFA122_min = DFA.unpackEncodedStringToUnsignedChars(DFA122_minS);
    static final char[] DFA122_max = DFA.unpackEncodedStringToUnsignedChars(DFA122_maxS);
    static final short[] DFA122_accept = DFA.unpackEncodedString(DFA122_acceptS);
    static final short[] DFA122_special = DFA.unpackEncodedString(DFA122_specialS);
    static final short[][] DFA122_transition;

    static {
        int numStates = DFA122_transitionS.length;
        DFA122_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA122_transition[i] = DFA.unpackEncodedString(DFA122_transitionS[i]);
        }
    }

    class DFA122 extends DFA {

        public DFA122(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 122;
            this.eot = DFA122_eot;
            this.eof = DFA122_eof;
            this.min = DFA122_min;
            this.max = DFA122_max;
            this.accept = DFA122_accept;
            this.special = DFA122_special;
            this.transition = DFA122_transition;
        }
        public String getDescription() {
            return "374:5: ( ( '[' )=> ruleXClosure )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA122_1 = input.LA(1);

                         
                        int index122_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index122_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 122, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA128_eotS =
        "\37\uffff";
    static final String DFA128_eofS =
        "\37\uffff";
    static final String DFA128_minS =
        "\1\4\1\0\35\uffff";
    static final String DFA128_maxS =
        "\1\175\1\0\35\uffff";
    static final String DFA128_acceptS =
        "\2\uffff\1\2\33\uffff\1\1";
    static final String DFA128_specialS =
        "\1\uffff\1\0\35\uffff}>";
    static final String[] DFA128_transitionS = {
            "\4\2\4\uffff\3\2\12\uffff\1\2\1\uffff\2\2\2\uffff\3\2\1\uffff"+
            "\3\2\1\uffff\1\2\1\1\1\uffff\16\2\2\uffff\3\2\1\uffff\4\2\1"+
            "\uffff\1\2\10\uffff\2\2\21\uffff\1\2\2\uffff\2\2\4\uffff\1\2"+
            "\7\uffff\1\2\2\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA128_eot = DFA.unpackEncodedString(DFA128_eotS);
    static final short[] DFA128_eof = DFA.unpackEncodedString(DFA128_eofS);
    static final char[] DFA128_min = DFA.unpackEncodedStringToUnsignedChars(DFA128_minS);
    static final char[] DFA128_max = DFA.unpackEncodedStringToUnsignedChars(DFA128_maxS);
    static final short[] DFA128_accept = DFA.unpackEncodedString(DFA128_acceptS);
    static final short[] DFA128_special = DFA.unpackEncodedString(DFA128_specialS);
    static final short[][] DFA128_transition;

    static {
        int numStates = DFA128_transitionS.length;
        DFA128_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA128_transition[i] = DFA.unpackEncodedString(DFA128_transitionS[i]);
        }
    }

    class DFA128 extends DFA {

        public DFA128(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 128;
            this.eot = DFA128_eot;
            this.eof = DFA128_eof;
            this.min = DFA128_min;
            this.max = DFA128_max;
            this.accept = DFA128_accept;
            this.special = DFA128_special;
            this.transition = DFA128_transition;
        }
        public String getDescription() {
            return "397:11: ( ( ( '(' ruleJvmFormalParameter ':' )=> ( '(' ruleJvmFormalParameter ':' ) ) ruleXExpression ')' | ( ( ruleJvmFormalParameter ':' )=> ( ruleJvmFormalParameter ':' ) )? ruleXExpressionOrSimpleConstructorCall )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA128_1 = input.LA(1);

                         
                        int index128_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_Xtend()) ) {s = 30;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index128_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 128, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA127_eotS =
        "\36\uffff";
    static final String DFA127_eofS =
        "\36\uffff";
    static final String DFA127_minS =
        "\1\4\3\0\1\uffff\1\0\4\uffff\1\0\23\uffff";
    static final String DFA127_maxS =
        "\1\175\3\0\1\uffff\1\0\4\uffff\1\0\23\uffff";
    static final String DFA127_acceptS =
        "\4\uffff\1\1\1\uffff\1\2\27\uffff";
    static final String DFA127_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\4\uffff\1\5\23\uffff}>";
    static final String[] DFA127_transitionS = {
            "\1\2\3\6\4\uffff\3\6\12\uffff\1\12\1\uffff\1\12\1\6\2\uffff"+
            "\2\12\1\6\1\uffff\2\12\1\2\1\uffff\1\1\1\3\1\uffff\1\12\1\6"+
            "\12\12\1\5\1\12\2\uffff\2\12\1\2\1\uffff\3\2\1\12\1\uffff\1"+
            "\6\10\uffff\2\6\21\uffff\1\4\2\uffff\2\6\4\uffff\1\6\7\uffff"+
            "\1\6\2\uffff\13\6",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA127_eot = DFA.unpackEncodedString(DFA127_eotS);
    static final short[] DFA127_eof = DFA.unpackEncodedString(DFA127_eofS);
    static final char[] DFA127_min = DFA.unpackEncodedStringToUnsignedChars(DFA127_minS);
    static final char[] DFA127_max = DFA.unpackEncodedStringToUnsignedChars(DFA127_maxS);
    static final short[] DFA127_accept = DFA.unpackEncodedString(DFA127_acceptS);
    static final short[] DFA127_special = DFA.unpackEncodedString(DFA127_specialS);
    static final short[][] DFA127_transition;

    static {
        int numStates = DFA127_transitionS.length;
        DFA127_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA127_transition[i] = DFA.unpackEncodedString(DFA127_transitionS[i]);
        }
    }

    class DFA127 extends DFA {

        public DFA127(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 127;
            this.eot = DFA127_eot;
            this.eof = DFA127_eof;
            this.min = DFA127_min;
            this.max = DFA127_max;
            this.accept = DFA127_accept;
            this.special = DFA127_special;
            this.transition = DFA127_transition;
        }
        public String getDescription() {
            return "403:3: ( ( ruleJvmFormalParameter ':' )=> ( ruleJvmFormalParameter ':' ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA127_0 = input.LA(1);

                         
                        int index127_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA127_0==39) ) {s = 1;}

                        else if ( (LA127_0==RULE_ID||LA127_0==37||LA127_0==60||(LA127_0>=62 && LA127_0<=64)) ) {s = 2;}

                        else if ( (LA127_0==40) ) {s = 3;}

                        else if ( (LA127_0==95) && (synpred13_Xtend())) {s = 4;}

                        else if ( (LA127_0==54) ) {s = 5;}

                        else if ( ((LA127_0>=RULE_STRING && LA127_0<=RULE_RICH_TEXT_START)||(LA127_0>=RULE_HEX && LA127_0<=RULE_DECIMAL)||LA127_0==28||LA127_0==33||LA127_0==43||LA127_0==67||(LA127_0>=76 && LA127_0<=77)||(LA127_0>=98 && LA127_0<=99)||LA127_0==104||LA127_0==112||(LA127_0>=115 && LA127_0<=125)) ) {s = 6;}

                        else if ( (LA127_0==25||LA127_0==27||(LA127_0>=31 && LA127_0<=32)||(LA127_0>=35 && LA127_0<=36)||LA127_0==42||(LA127_0>=44 && LA127_0<=53)||LA127_0==55||(LA127_0>=58 && LA127_0<=59)||LA127_0==65) ) {s = 10;}

                         
                        input.seek(index127_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA127_1 = input.LA(1);

                         
                        int index127_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_Xtend()) ) {s = 4;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index127_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA127_2 = input.LA(1);

                         
                        int index127_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_Xtend()) ) {s = 4;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index127_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA127_3 = input.LA(1);

                         
                        int index127_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_Xtend()) ) {s = 4;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index127_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA127_5 = input.LA(1);

                         
                        int index127_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_Xtend()) ) {s = 4;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index127_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA127_10 = input.LA(1);

                         
                        int index127_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_Xtend()) ) {s = 4;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index127_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 127, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA146_eotS =
        "\24\uffff";
    static final String DFA146_eofS =
        "\24\uffff";
    static final String DFA146_minS =
        "\1\4\1\0\22\uffff";
    static final String DFA146_maxS =
        "\1\137\1\0\22\uffff";
    static final String DFA146_acceptS =
        "\2\uffff\1\2\20\uffff\1\1";
    static final String DFA146_specialS =
        "\1\uffff\1\0\22\uffff}>";
    static final String[] DFA146_transitionS = {
            "\1\2\24\uffff\3\2\1\uffff\1\2\4\uffff\4\2\1\uffff\1\2\1\1\1"+
            "\2\1\uffff\22\2\1\uffff\3\2\12\uffff\1\2\2\uffff\1\2\20\uffff"+
            "\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA146_eot = DFA.unpackEncodedString(DFA146_eotS);
    static final short[] DFA146_eof = DFA.unpackEncodedString(DFA146_eofS);
    static final char[] DFA146_min = DFA.unpackEncodedStringToUnsignedChars(DFA146_minS);
    static final char[] DFA146_max = DFA.unpackEncodedStringToUnsignedChars(DFA146_maxS);
    static final short[] DFA146_accept = DFA.unpackEncodedString(DFA146_acceptS);
    static final short[] DFA146_special = DFA.unpackEncodedString(DFA146_specialS);
    static final short[][] DFA146_transition;

    static {
        int numStates = DFA146_transitionS.length;
        DFA146_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA146_transition[i] = DFA.unpackEncodedString(DFA146_transitionS[i]);
        }
    }

    class DFA146 extends DFA {

        public DFA146(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 146;
            this.eot = DFA146_eot;
            this.eof = DFA146_eof;
            this.min = DFA146_min;
            this.max = DFA146_max;
            this.accept = DFA146_accept;
            this.special = DFA146_special;
            this.transition = DFA146_transition;
        }
        public String getDescription() {
            return "495:24: ( ( ( '(' )=> '(' ) ( ( ( ruleValidID '=' )=> ruleXAnnotationElementValuePair ) ( ',' ( ( ruleValidID '=' )=> ruleXAnnotationElementValuePair ) )* | ruleXAnnotationElementValueOrCommaList )? ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA146_1 = input.LA(1);

                         
                        int index146_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Xtend()) ) {s = 19;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index146_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 146, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA145_eotS =
        "\40\uffff";
    static final String DFA145_eofS =
        "\40\uffff";
    static final String DFA145_minS =
        "\1\4\1\0\36\uffff";
    static final String DFA145_maxS =
        "\1\175\1\0\36\uffff";
    static final String DFA145_acceptS =
        "\2\uffff\1\2\33\uffff\1\3\1\1";
    static final String DFA145_specialS =
        "\1\uffff\1\0\36\uffff}>";
    static final String[] DFA145_transitionS = {
            "\1\1\3\2\4\uffff\3\2\12\uffff\1\2\1\uffff\2\2\2\uffff\3\2\1"+
            "\uffff\2\2\1\1\1\uffff\2\2\1\36\16\2\2\uffff\2\2\1\1\1\uffff"+
            "\3\1\1\2\1\uffff\1\2\7\uffff\3\2\24\uffff\2\2\4\uffff\1\2\7"+
            "\uffff\1\2\2\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA145_eot = DFA.unpackEncodedString(DFA145_eotS);
    static final short[] DFA145_eof = DFA.unpackEncodedString(DFA145_eofS);
    static final char[] DFA145_min = DFA.unpackEncodedStringToUnsignedChars(DFA145_minS);
    static final char[] DFA145_max = DFA.unpackEncodedStringToUnsignedChars(DFA145_maxS);
    static final short[] DFA145_accept = DFA.unpackEncodedString(DFA145_acceptS);
    static final short[] DFA145_special = DFA.unpackEncodedString(DFA145_specialS);
    static final short[][] DFA145_transition;

    static {
        int numStates = DFA145_transitionS.length;
        DFA145_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA145_transition[i] = DFA.unpackEncodedString(DFA145_transitionS[i]);
        }
    }

    class DFA145 extends DFA {

        public DFA145(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 145;
            this.eot = DFA145_eot;
            this.eof = DFA145_eof;
            this.min = DFA145_min;
            this.max = DFA145_max;
            this.accept = DFA145_accept;
            this.special = DFA145_special;
            this.transition = DFA145_transition;
        }
        public String getDescription() {
            return "498:14: ( ( ( ruleValidID '=' )=> ruleXAnnotationElementValuePair ) ( ',' ( ( ruleValidID '=' )=> ruleXAnnotationElementValuePair ) )* | ruleXAnnotationElementValueOrCommaList )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA145_1 = input.LA(1);

                         
                        int index145_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_Xtend()) ) {s = 31;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index145_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 145, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA151_eotS =
        "\36\uffff";
    static final String DFA151_eofS =
        "\36\uffff";
    static final String DFA151_minS =
        "\1\4\1\0\34\uffff";
    static final String DFA151_maxS =
        "\1\175\1\0\34\uffff";
    static final String DFA151_acceptS =
        "\2\uffff\1\2\32\uffff\1\1";
    static final String DFA151_specialS =
        "\1\uffff\1\0\34\uffff}>";
    static final String[] DFA151_transitionS = {
            "\4\2\4\uffff\3\2\12\uffff\1\2\1\uffff\2\2\2\uffff\3\2\1\uffff"+
            "\3\2\1\uffff\2\2\1\uffff\16\2\2\uffff\3\2\1\uffff\4\2\1\uffff"+
            "\1\2\7\uffff\1\2\1\1\1\2\24\uffff\2\2\4\uffff\1\2\7\uffff\1"+
            "\2\2\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA151_eot = DFA.unpackEncodedString(DFA151_eotS);
    static final short[] DFA151_eof = DFA.unpackEncodedString(DFA151_eofS);
    static final char[] DFA151_min = DFA.unpackEncodedStringToUnsignedChars(DFA151_minS);
    static final char[] DFA151_max = DFA.unpackEncodedStringToUnsignedChars(DFA151_maxS);
    static final short[] DFA151_accept = DFA.unpackEncodedString(DFA151_acceptS);
    static final short[] DFA151_special = DFA.unpackEncodedString(DFA151_specialS);
    static final short[][] DFA151_transition;

    static {
        int numStates = DFA151_transitionS.length;
        DFA151_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA151_transition[i] = DFA.unpackEncodedString(DFA151_transitionS[i]);
        }
    }

    class DFA151 extends DFA {

        public DFA151(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 151;
            this.eot = DFA151_eot;
            this.eof = DFA151_eof;
            this.min = DFA151_min;
            this.max = DFA151_max;
            this.accept = DFA151_accept;
            this.special = DFA151_special;
            this.transition = DFA151_transition;
        }
        public String getDescription() {
            return "521:1: ruleXAnnotationElementValueOrCommaList : ( ( ( '#' '[' )=> ( '#' '[' ) ) ( ruleXAnnotationOrExpression ( ',' ruleXAnnotationOrExpression )* )? ']' | ruleXAnnotationOrExpression ( ( ',' ruleXAnnotationOrExpression )+ )? );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA151_1 = input.LA(1);

                         
                        int index151_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Xtend()) ) {s = 29;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index151_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 151, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA154_eotS =
        "\36\uffff";
    static final String DFA154_eofS =
        "\36\uffff";
    static final String DFA154_minS =
        "\1\4\1\0\34\uffff";
    static final String DFA154_maxS =
        "\1\175\1\0\34\uffff";
    static final String DFA154_acceptS =
        "\2\uffff\1\2\32\uffff\1\1";
    static final String DFA154_specialS =
        "\1\uffff\1\0\34\uffff}>";
    static final String[] DFA154_transitionS = {
            "\4\2\4\uffff\3\2\12\uffff\1\2\1\uffff\2\2\2\uffff\3\2\1\uffff"+
            "\3\2\1\uffff\2\2\1\uffff\16\2\2\uffff\3\2\1\uffff\4\2\1\uffff"+
            "\1\2\7\uffff\1\2\1\1\1\2\24\uffff\2\2\4\uffff\1\2\7\uffff\1"+
            "\2\2\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA154_eot = DFA.unpackEncodedString(DFA154_eotS);
    static final short[] DFA154_eof = DFA.unpackEncodedString(DFA154_eofS);
    static final char[] DFA154_min = DFA.unpackEncodedStringToUnsignedChars(DFA154_minS);
    static final char[] DFA154_max = DFA.unpackEncodedStringToUnsignedChars(DFA154_maxS);
    static final short[] DFA154_accept = DFA.unpackEncodedString(DFA154_acceptS);
    static final short[] DFA154_special = DFA.unpackEncodedString(DFA154_specialS);
    static final short[][] DFA154_transition;

    static {
        int numStates = DFA154_transitionS.length;
        DFA154_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA154_transition[i] = DFA.unpackEncodedString(DFA154_transitionS[i]);
        }
    }

    class DFA154 extends DFA {

        public DFA154(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 154;
            this.eot = DFA154_eot;
            this.eof = DFA154_eof;
            this.min = DFA154_min;
            this.max = DFA154_max;
            this.accept = DFA154_accept;
            this.special = DFA154_special;
            this.transition = DFA154_transition;
        }
        public String getDescription() {
            return "539:1: ruleXAnnotationElementValue : ( ( ( '#' '[' )=> ( '#' '[' ) ) ( ruleXAnnotationOrExpression ( ',' ruleXAnnotationOrExpression )* )? ']' | ruleXAnnotationOrExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA154_1 = input.LA(1);

                         
                        int index154_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Xtend()) ) {s = 29;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index154_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 154, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA156_eotS =
        "\12\uffff";
    static final String DFA156_eofS =
        "\12\uffff";
    static final String DFA156_minS =
        "\1\4\7\0\2\uffff";
    static final String DFA156_maxS =
        "\1\177\7\0\2\uffff";
    static final String DFA156_acceptS =
        "\10\uffff\1\2\1\1";
    static final String DFA156_specialS =
        "\1\uffff\1\4\1\3\1\1\1\6\1\5\1\0\1\2\2\uffff}>";
    static final String[] DFA156_transitionS = {
            "\13\10\12\uffff\3\10\1\6\1\10\1\7\7\10\1\uffff\33\10\1\uffff"+
            "\2\10\6\uffff\4\10\1\1\1\2\1\3\1\4\1\5\33\10\1\uffff\20\10",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA156_eot = DFA.unpackEncodedString(DFA156_eotS);
    static final short[] DFA156_eof = DFA.unpackEncodedString(DFA156_eofS);
    static final char[] DFA156_min = DFA.unpackEncodedStringToUnsignedChars(DFA156_minS);
    static final char[] DFA156_max = DFA.unpackEncodedStringToUnsignedChars(DFA156_maxS);
    static final short[] DFA156_accept = DFA.unpackEncodedString(DFA156_acceptS);
    static final short[] DFA156_special = DFA.unpackEncodedString(DFA156_specialS);
    static final short[][] DFA156_transition;

    static {
        int numStates = DFA156_transitionS.length;
        DFA156_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA156_transition[i] = DFA.unpackEncodedString(DFA156_transitionS[i]);
        }
    }

    class DFA156 extends DFA {

        public DFA156(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 156;
            this.eot = DFA156_eot;
            this.eof = DFA156_eof;
            this.min = DFA156_min;
            this.max = DFA156_max;
            this.accept = DFA156_accept;
            this.special = DFA156_special;
            this.transition = DFA156_transition;
        }
        public String getDescription() {
            return "566:20: ( ( ( ruleOpMultiAssign )=> ruleOpMultiAssign ) ruleXAssignment )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA156_6 = input.LA(1);

                         
                        int index156_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_Xtend()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index156_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA156_3 = input.LA(1);

                         
                        int index156_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_Xtend()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index156_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA156_7 = input.LA(1);

                         
                        int index156_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_Xtend()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index156_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA156_2 = input.LA(1);

                         
                        int index156_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_Xtend()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index156_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA156_1 = input.LA(1);

                         
                        int index156_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_Xtend()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index156_1);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA156_5 = input.LA(1);

                         
                        int index156_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_Xtend()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index156_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA156_4 = input.LA(1);

                         
                        int index156_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_Xtend()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index156_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 156, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA165_eotS =
        "\13\uffff";
    static final String DFA165_eofS =
        "\13\uffff";
    static final String DFA165_minS =
        "\1\4\1\uffff\10\0\1\uffff";
    static final String DFA165_maxS =
        "\1\177\1\uffff\10\0\1\uffff";
    static final String DFA165_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA165_specialS =
        "\2\uffff\1\2\1\3\1\0\1\6\1\7\1\5\1\4\1\1\1\uffff}>";
    static final String[] DFA165_transitionS = {
            "\13\1\12\uffff\3\1\1\2\1\1\1\3\7\1\1\uffff\33\1\1\uffff\2\1"+
            "\6\uffff\21\1\1\5\1\6\1\7\1\4\1\10\1\11\15\1\1\uffff\20\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA165_eot = DFA.unpackEncodedString(DFA165_eotS);
    static final short[] DFA165_eof = DFA.unpackEncodedString(DFA165_eofS);
    static final char[] DFA165_min = DFA.unpackEncodedStringToUnsignedChars(DFA165_minS);
    static final char[] DFA165_max = DFA.unpackEncodedStringToUnsignedChars(DFA165_maxS);
    static final short[] DFA165_accept = DFA.unpackEncodedString(DFA165_acceptS);
    static final short[] DFA165_special = DFA.unpackEncodedString(DFA165_specialS);
    static final short[][] DFA165_transition;

    static {
        int numStates = DFA165_transitionS.length;
        DFA165_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA165_transition[i] = DFA.unpackEncodedString(DFA165_transitionS[i]);
        }
    }

    class DFA165 extends DFA {

        public DFA165(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 165;
            this.eot = DFA165_eot;
            this.eof = DFA165_eof;
            this.min = DFA165_min;
            this.max = DFA165_max;
            this.accept = DFA165_accept;
            this.special = DFA165_special;
            this.transition = DFA165_transition;
        }
        public String getDescription() {
            return "()* loopback of 656:26: ( ( ( ruleOpOther )=> ruleOpOther ) ruleXAdditiveExpression )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA165_4 = input.LA(1);

                         
                        int index165_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_Xtend()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index165_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA165_9 = input.LA(1);

                         
                        int index165_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_Xtend()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index165_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA165_2 = input.LA(1);

                         
                        int index165_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_Xtend()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index165_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA165_3 = input.LA(1);

                         
                        int index165_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_Xtend()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index165_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA165_8 = input.LA(1);

                         
                        int index165_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_Xtend()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index165_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA165_7 = input.LA(1);

                         
                        int index165_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_Xtend()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index165_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA165_5 = input.LA(1);

                         
                        int index165_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_Xtend()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index165_5);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA165_6 = input.LA(1);

                         
                        int index165_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_Xtend()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index165_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 165, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA168_eotS =
        "\13\uffff";
    static final String DFA168_eofS =
        "\13\uffff";
    static final String DFA168_minS =
        "\1\34\2\uffff\1\36\7\uffff";
    static final String DFA168_maxS =
        "\1\141\2\uffff\1\136\7\uffff";
    static final String DFA168_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\7\1\10\1\11\1\3\1\6";
    static final String DFA168_specialS =
        "\13\uffff}>";
    static final String[] DFA168_transitionS = {
            "\1\6\1\uffff\1\3\75\uffff\1\1\1\2\1\4\1\5\1\7\1\10",
            "",
            "",
            "\1\12\77\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA168_eot = DFA.unpackEncodedString(DFA168_eotS);
    static final short[] DFA168_eof = DFA.unpackEncodedString(DFA168_eofS);
    static final char[] DFA168_min = DFA.unpackEncodedStringToUnsignedChars(DFA168_minS);
    static final char[] DFA168_max = DFA.unpackEncodedStringToUnsignedChars(DFA168_maxS);
    static final short[] DFA168_accept = DFA.unpackEncodedString(DFA168_acceptS);
    static final short[] DFA168_special = DFA.unpackEncodedString(DFA168_specialS);
    static final short[][] DFA168_transition;

    static {
        int numStates = DFA168_transitionS.length;
        DFA168_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA168_transition[i] = DFA.unpackEncodedString(DFA168_transitionS[i]);
        }
    }

    class DFA168 extends DFA {

        public DFA168(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 168;
            this.eot = DFA168_eot;
            this.eof = DFA168_eof;
            this.min = DFA168_min;
            this.max = DFA168_max;
            this.accept = DFA168_accept;
            this.special = DFA168_special;
            this.transition = DFA168_transition;
        }
        public String getDescription() {
            return "664:1: ruleOpOther : ( '->' | '..<' | '>' '..' | '..' | '=>' | '>' ( ( ( '>' '>' )=> ( '>' '>' ) ) | '>' ) | '<' ( ( ( '<' '<' )=> ( '<' '<' ) ) | '<' | '=>' ) | '<>' | '?:' );";
        }
    }
    static final String DFA178_eotS =
        "\115\uffff";
    static final String DFA178_eofS =
        "\115\uffff";
    static final String DFA178_minS =
        "\1\4\1\0\113\uffff";
    static final String DFA178_maxS =
        "\1\177\1\0\113\uffff";
    static final String DFA178_acceptS =
        "\2\uffff\1\2\111\uffff\1\1";
    static final String DFA178_specialS =
        "\1\uffff\1\0\113\uffff}>";
    static final String[] DFA178_transitionS = {
            "\13\2\12\uffff\15\2\1\uffff\1\2\1\1\31\2\1\uffff\2\2\6\uffff"+
            "\44\2\1\uffff\20\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA178_eot = DFA.unpackEncodedString(DFA178_eotS);
    static final short[] DFA178_eof = DFA.unpackEncodedString(DFA178_eofS);
    static final char[] DFA178_min = DFA.unpackEncodedStringToUnsignedChars(DFA178_minS);
    static final char[] DFA178_max = DFA.unpackEncodedStringToUnsignedChars(DFA178_maxS);
    static final short[] DFA178_accept = DFA.unpackEncodedString(DFA178_acceptS);
    static final short[] DFA178_special = DFA.unpackEncodedString(DFA178_specialS);
    static final short[][] DFA178_transition;

    static {
        int numStates = DFA178_transitionS.length;
        DFA178_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA178_transition[i] = DFA.unpackEncodedString(DFA178_transitionS[i]);
        }
    }

    class DFA178 extends DFA {

        public DFA178(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 178;
            this.eot = DFA178_eot;
            this.eof = DFA178_eof;
            this.min = DFA178_min;
            this.max = DFA178_max;
            this.accept = DFA178_accept;
            this.special = DFA178_special;
            this.transition = DFA178_transition;
        }
        public String getDescription() {
            return "784:20: ( ( ( '(' )=> '(' ) ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )? ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA178_1 = input.LA(1);

                         
                        int index178_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index178_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 178, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA177_eotS =
        "\40\uffff";
    static final String DFA177_eofS =
        "\40\uffff";
    static final String DFA177_minS =
        "\1\4\3\0\1\uffff\1\0\5\uffff\1\0\24\uffff";
    static final String DFA177_maxS =
        "\1\175\3\0\1\uffff\1\0\5\uffff\1\0\24\uffff";
    static final String DFA177_acceptS =
        "\4\uffff\1\1\1\uffff\1\1\1\2\27\uffff\1\3";
    static final String DFA177_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\5\uffff\1\5\24\uffff}>";
    static final String[] DFA177_transitionS = {
            "\1\2\3\7\4\uffff\3\7\12\uffff\1\13\1\uffff\1\13\1\7\2\uffff"+
            "\2\13\1\7\1\uffff\2\13\1\2\1\uffff\1\1\1\3\1\37\1\13\1\7\12"+
            "\13\1\5\1\13\2\uffff\2\13\1\2\1\uffff\3\2\1\13\1\uffff\1\7\10"+
            "\uffff\2\7\21\uffff\1\4\2\uffff\2\7\4\uffff\1\7\6\uffff\1\6"+
            "\1\7\2\uffff\13\7",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA177_eot = DFA.unpackEncodedString(DFA177_eotS);
    static final short[] DFA177_eof = DFA.unpackEncodedString(DFA177_eofS);
    static final char[] DFA177_min = DFA.unpackEncodedStringToUnsignedChars(DFA177_minS);
    static final char[] DFA177_max = DFA.unpackEncodedStringToUnsignedChars(DFA177_maxS);
    static final short[] DFA177_accept = DFA.unpackEncodedString(DFA177_acceptS);
    static final short[] DFA177_special = DFA.unpackEncodedString(DFA177_specialS);
    static final short[][] DFA177_transition;

    static {
        int numStates = DFA177_transitionS.length;
        DFA177_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA177_transition[i] = DFA.unpackEncodedString(DFA177_transitionS[i]);
        }
    }

    class DFA177 extends DFA {

        public DFA177(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 177;
            this.eot = DFA177_eot;
            this.eof = DFA177_eof;
            this.min = DFA177_min;
            this.max = DFA177_max;
            this.accept = DFA177_accept;
            this.special = DFA177_special;
            this.transition = DFA177_transition;
        }
        public String getDescription() {
            return "787:15: ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA177_0 = input.LA(1);

                         
                        int index177_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA177_0==39) ) {s = 1;}

                        else if ( (LA177_0==RULE_ID||LA177_0==37||LA177_0==60||(LA177_0>=62 && LA177_0<=64)) ) {s = 2;}

                        else if ( (LA177_0==40) ) {s = 3;}

                        else if ( (LA177_0==95) && (synpred37_Xtend())) {s = 4;}

                        else if ( (LA177_0==54) ) {s = 5;}

                        else if ( (LA177_0==111) && (synpred37_Xtend())) {s = 6;}

                        else if ( ((LA177_0>=RULE_STRING && LA177_0<=RULE_RICH_TEXT_START)||(LA177_0>=RULE_HEX && LA177_0<=RULE_DECIMAL)||LA177_0==28||LA177_0==33||LA177_0==43||LA177_0==67||(LA177_0>=76 && LA177_0<=77)||(LA177_0>=98 && LA177_0<=99)||LA177_0==104||LA177_0==112||(LA177_0>=115 && LA177_0<=125)) ) {s = 7;}

                        else if ( (LA177_0==25||LA177_0==27||(LA177_0>=31 && LA177_0<=32)||(LA177_0>=35 && LA177_0<=36)||LA177_0==42||(LA177_0>=44 && LA177_0<=53)||LA177_0==55||(LA177_0>=58 && LA177_0<=59)||LA177_0==65) ) {s = 11;}

                        else if ( (LA177_0==41) ) {s = 31;}

                         
                        input.seek(index177_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA177_1 = input.LA(1);

                         
                        int index177_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_Xtend()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index177_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA177_2 = input.LA(1);

                         
                        int index177_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_Xtend()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index177_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA177_3 = input.LA(1);

                         
                        int index177_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_Xtend()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index177_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA177_5 = input.LA(1);

                         
                        int index177_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_Xtend()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index177_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA177_11 = input.LA(1);

                         
                        int index177_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_Xtend()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index177_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 177, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA179_eotS =
        "\115\uffff";
    static final String DFA179_eofS =
        "\115\uffff";
    static final String DFA179_minS =
        "\1\4\1\0\113\uffff";
    static final String DFA179_maxS =
        "\1\177\1\0\113\uffff";
    static final String DFA179_acceptS =
        "\2\uffff\1\2\111\uffff\1\1";
    static final String DFA179_specialS =
        "\1\uffff\1\0\113\uffff}>";
    static final String[] DFA179_transitionS = {
            "\13\2\12\uffff\15\2\1\uffff\33\2\1\uffff\2\2\6\uffff\2\2\1\1"+
            "\41\2\1\uffff\20\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA179_eot = DFA.unpackEncodedString(DFA179_eotS);
    static final short[] DFA179_eof = DFA.unpackEncodedString(DFA179_eofS);
    static final char[] DFA179_min = DFA.unpackEncodedStringToUnsignedChars(DFA179_minS);
    static final char[] DFA179_max = DFA.unpackEncodedStringToUnsignedChars(DFA179_maxS);
    static final short[] DFA179_accept = DFA.unpackEncodedString(DFA179_acceptS);
    static final short[] DFA179_special = DFA.unpackEncodedString(DFA179_specialS);
    static final short[][] DFA179_transition;

    static {
        int numStates = DFA179_transitionS.length;
        DFA179_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA179_transition[i] = DFA.unpackEncodedString(DFA179_transitionS[i]);
        }
    }

    class DFA179 extends DFA {

        public DFA179(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 179;
            this.eot = DFA179_eot;
            this.eof = DFA179_eof;
            this.min = DFA179_min;
            this.max = DFA179_max;
            this.accept = DFA179_accept;
            this.special = DFA179_special;
            this.transition = DFA179_transition;
        }
        public String getDescription() {
            return "799:6: ( ( '[' )=> ruleXClosure )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA179_1 = input.LA(1);

                         
                        int index179_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index179_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 179, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA181_eotS =
        "\36\uffff";
    static final String DFA181_eofS =
        "\36\uffff";
    static final String DFA181_minS =
        "\1\4\3\uffff\1\0\17\uffff\1\0\11\uffff";
    static final String DFA181_maxS =
        "\1\175\3\uffff\1\0\17\uffff\1\0\11\uffff";
    static final String DFA181_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\3\uffff\1\6\11\uffff\1\7\1\uffff"+
        "\1\12\1\13\1\14\1\15\1\16\1\17\1\4\1\10\1\11";
    static final String DFA181_specialS =
        "\4\uffff\1\0\17\uffff\1\1\11\uffff}>";
    static final String[] DFA181_transitionS = {
            "\1\5\3\11\4\uffff\3\11\12\uffff\1\5\1\uffff\2\5\2\uffff\2\5"+
            "\1\2\1\uffff\3\5\1\uffff\1\5\1\32\1\uffff\1\5\1\1\12\5\1\4\1"+
            "\5\2\uffff\3\5\1\uffff\4\5\1\uffff\1\3\10\uffff\2\11\42\uffff"+
            "\1\23\2\uffff\1\24\1\25\1\26\1\5\4\11\1\27\1\30\1\31",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA181_eot = DFA.unpackEncodedString(DFA181_eotS);
    static final short[] DFA181_eof = DFA.unpackEncodedString(DFA181_eofS);
    static final char[] DFA181_min = DFA.unpackEncodedStringToUnsignedChars(DFA181_minS);
    static final char[] DFA181_max = DFA.unpackEncodedStringToUnsignedChars(DFA181_maxS);
    static final short[] DFA181_accept = DFA.unpackEncodedString(DFA181_acceptS);
    static final short[] DFA181_special = DFA.unpackEncodedString(DFA181_specialS);
    static final short[][] DFA181_transition;

    static {
        int numStates = DFA181_transitionS.length;
        DFA181_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA181_transition[i] = DFA.unpackEncodedString(DFA181_transitionS[i]);
        }
    }

    class DFA181 extends DFA {

        public DFA181(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 181;
            this.eot = DFA181_eot;
            this.eof = DFA181_eof;
            this.min = DFA181_min;
            this.max = DFA181_max;
            this.accept = DFA181_accept;
            this.special = DFA181_special;
            this.transition = DFA181_transition;
        }
        public String getDescription() {
            return "806:1: ruleXPrimaryExpression : ( ruleXConstructorCall | ruleXBlockExpression | ruleXSwitchExpression | ( ( 'synchronized' '(' )=> ruleXSynchronizedExpression ) | ruleXFeatureCall | ruleXLiteral | ruleXIfExpression | ( ( 'for' '(' ruleJvmFormalParameter ':' )=> ruleXForLoopExpression ) | ruleXBasicForLoopExpression | ruleXWhileExpression | ruleXDoWhileExpression | ruleXThrowExpression | ruleXReturnExpression | ruleXTryCatchFinallyExpression | ruleXParenthesizedExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA181_4 = input.LA(1);

                         
                        int index181_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_Xtend()) ) {s = 27;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index181_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA181_20 = input.LA(1);

                         
                        int index181_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_Xtend()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index181_20);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 181, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA190_eotS =
        "\41\uffff";
    static final String DFA190_eofS =
        "\41\uffff";
    static final String DFA190_minS =
        "\1\4\3\0\1\uffff\1\0\6\uffff\1\0\24\uffff";
    static final String DFA190_maxS =
        "\1\175\3\0\1\uffff\1\0\6\uffff\1\0\24\uffff";
    static final String DFA190_acceptS =
        "\4\uffff\1\1\1\uffff\1\1\1\2\31\uffff";
    static final String DFA190_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\6\uffff\1\5\24\uffff}>";
    static final String[] DFA190_transitionS = {
            "\1\2\3\7\4\uffff\3\7\12\uffff\1\14\1\uffff\1\14\1\7\2\uffff"+
            "\2\14\1\7\1\uffff\2\14\1\2\1\uffff\1\1\1\3\1\uffff\1\14\1\7"+
            "\12\14\1\5\1\14\2\7\2\14\1\2\1\uffff\3\2\1\14\1\uffff\1\7\10"+
            "\uffff\3\7\20\uffff\1\4\2\uffff\2\7\4\uffff\1\7\6\uffff\1\6"+
            "\1\7\2\uffff\13\7",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA190_eot = DFA.unpackEncodedString(DFA190_eotS);
    static final short[] DFA190_eof = DFA.unpackEncodedString(DFA190_eofS);
    static final char[] DFA190_min = DFA.unpackEncodedStringToUnsignedChars(DFA190_minS);
    static final char[] DFA190_max = DFA.unpackEncodedStringToUnsignedChars(DFA190_maxS);
    static final short[] DFA190_accept = DFA.unpackEncodedString(DFA190_acceptS);
    static final short[] DFA190_special = DFA.unpackEncodedString(DFA190_specialS);
    static final short[][] DFA190_transition;

    static {
        int numStates = DFA190_transitionS.length;
        DFA190_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA190_transition[i] = DFA.unpackEncodedString(DFA190_transitionS[i]);
        }
    }

    class DFA190 extends DFA {

        public DFA190(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 190;
            this.eot = DFA190_eot;
            this.eof = DFA190_eof;
            this.min = DFA190_min;
            this.max = DFA190_max;
            this.accept = DFA190_accept;
            this.special = DFA190_special;
            this.transition = DFA190_transition;
        }
        public String getDescription() {
            return "869:13: ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA190_0 = input.LA(1);

                         
                        int index190_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA190_0==39) ) {s = 1;}

                        else if ( (LA190_0==RULE_ID||LA190_0==37||LA190_0==60||(LA190_0>=62 && LA190_0<=64)) ) {s = 2;}

                        else if ( (LA190_0==40) ) {s = 3;}

                        else if ( (LA190_0==95) && (synpred43_Xtend())) {s = 4;}

                        else if ( (LA190_0==54) ) {s = 5;}

                        else if ( (LA190_0==111) && (synpred43_Xtend())) {s = 6;}

                        else if ( ((LA190_0>=RULE_STRING && LA190_0<=RULE_RICH_TEXT_START)||(LA190_0>=RULE_HEX && LA190_0<=RULE_DECIMAL)||LA190_0==28||LA190_0==33||LA190_0==43||(LA190_0>=56 && LA190_0<=57)||LA190_0==67||(LA190_0>=76 && LA190_0<=78)||(LA190_0>=98 && LA190_0<=99)||LA190_0==104||LA190_0==112||(LA190_0>=115 && LA190_0<=125)) ) {s = 7;}

                        else if ( (LA190_0==25||LA190_0==27||(LA190_0>=31 && LA190_0<=32)||(LA190_0>=35 && LA190_0<=36)||LA190_0==42||(LA190_0>=44 && LA190_0<=53)||LA190_0==55||(LA190_0>=58 && LA190_0<=59)||LA190_0==65) ) {s = 12;}

                         
                        input.seek(index190_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA190_1 = input.LA(1);

                         
                        int index190_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_Xtend()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index190_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA190_2 = input.LA(1);

                         
                        int index190_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_Xtend()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index190_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA190_3 = input.LA(1);

                         
                        int index190_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_Xtend()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index190_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA190_5 = input.LA(1);

                         
                        int index190_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_Xtend()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index190_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA190_12 = input.LA(1);

                         
                        int index190_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_Xtend()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index190_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 190, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA211_eotS =
        "\115\uffff";
    static final String DFA211_eofS =
        "\115\uffff";
    static final String DFA211_minS =
        "\1\4\1\0\113\uffff";
    static final String DFA211_maxS =
        "\1\177\1\0\113\uffff";
    static final String DFA211_acceptS =
        "\2\uffff\1\2\111\uffff\1\1";
    static final String DFA211_specialS =
        "\1\uffff\1\0\113\uffff}>";
    static final String[] DFA211_transitionS = {
            "\13\2\12\uffff\15\2\1\uffff\1\2\1\1\31\2\1\uffff\2\2\6\uffff"+
            "\44\2\1\uffff\20\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA211_eot = DFA.unpackEncodedString(DFA211_eotS);
    static final short[] DFA211_eof = DFA.unpackEncodedString(DFA211_eofS);
    static final char[] DFA211_min = DFA.unpackEncodedStringToUnsignedChars(DFA211_minS);
    static final char[] DFA211_max = DFA.unpackEncodedStringToUnsignedChars(DFA211_maxS);
    static final short[] DFA211_accept = DFA.unpackEncodedString(DFA211_acceptS);
    static final short[] DFA211_special = DFA.unpackEncodedString(DFA211_specialS);
    static final short[][] DFA211_transition;

    static {
        int numStates = DFA211_transitionS.length;
        DFA211_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA211_transition[i] = DFA.unpackEncodedString(DFA211_transitionS[i]);
        }
    }

    class DFA211 extends DFA {

        public DFA211(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 211;
            this.eot = DFA211_eot;
            this.eof = DFA211_eof;
            this.min = DFA211_min;
            this.max = DFA211_max;
            this.accept = DFA211_accept;
            this.special = DFA211_special;
            this.transition = DFA211_transition;
        }
        public String getDescription() {
            return "992:19: ( ( ( '(' )=> '(' ) ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )? ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA211_1 = input.LA(1);

                         
                        int index211_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index211_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 211, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA210_eotS =
        "\40\uffff";
    static final String DFA210_eofS =
        "\40\uffff";
    static final String DFA210_minS =
        "\1\4\3\0\1\uffff\1\0\5\uffff\1\0\24\uffff";
    static final String DFA210_maxS =
        "\1\175\3\0\1\uffff\1\0\5\uffff\1\0\24\uffff";
    static final String DFA210_acceptS =
        "\4\uffff\1\1\1\uffff\1\1\1\2\27\uffff\1\3";
    static final String DFA210_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\5\uffff\1\5\24\uffff}>";
    static final String[] DFA210_transitionS = {
            "\1\2\3\7\4\uffff\3\7\12\uffff\1\13\1\uffff\1\13\1\7\2\uffff"+
            "\2\13\1\7\1\uffff\2\13\1\2\1\uffff\1\1\1\3\1\37\1\13\1\7\12"+
            "\13\1\5\1\13\2\uffff\2\13\1\2\1\uffff\3\2\1\13\1\uffff\1\7\10"+
            "\uffff\2\7\21\uffff\1\4\2\uffff\2\7\4\uffff\1\7\6\uffff\1\6"+
            "\1\7\2\uffff\13\7",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA210_eot = DFA.unpackEncodedString(DFA210_eotS);
    static final short[] DFA210_eof = DFA.unpackEncodedString(DFA210_eofS);
    static final char[] DFA210_min = DFA.unpackEncodedStringToUnsignedChars(DFA210_minS);
    static final char[] DFA210_max = DFA.unpackEncodedStringToUnsignedChars(DFA210_maxS);
    static final short[] DFA210_accept = DFA.unpackEncodedString(DFA210_acceptS);
    static final short[] DFA210_special = DFA.unpackEncodedString(DFA210_specialS);
    static final short[][] DFA210_transition;

    static {
        int numStates = DFA210_transitionS.length;
        DFA210_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA210_transition[i] = DFA.unpackEncodedString(DFA210_transitionS[i]);
        }
    }

    class DFA210 extends DFA {

        public DFA210(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 210;
            this.eot = DFA210_eot;
            this.eof = DFA210_eof;
            this.min = DFA210_min;
            this.max = DFA210_max;
            this.accept = DFA210_accept;
            this.special = DFA210_special;
            this.transition = DFA210_transition;
        }
        public String getDescription() {
            return "995:14: ( ( ( ( ruleJvmFormalParameter ( ',' ruleJvmFormalParameter )* )? '|' )=> ruleXShortClosure ) | ruleXExpression ( ',' ruleXExpression )* )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA210_0 = input.LA(1);

                         
                        int index210_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA210_0==39) ) {s = 1;}

                        else if ( (LA210_0==RULE_ID||LA210_0==37||LA210_0==60||(LA210_0>=62 && LA210_0<=64)) ) {s = 2;}

                        else if ( (LA210_0==40) ) {s = 3;}

                        else if ( (LA210_0==95) && (synpred49_Xtend())) {s = 4;}

                        else if ( (LA210_0==54) ) {s = 5;}

                        else if ( (LA210_0==111) && (synpred49_Xtend())) {s = 6;}

                        else if ( ((LA210_0>=RULE_STRING && LA210_0<=RULE_RICH_TEXT_START)||(LA210_0>=RULE_HEX && LA210_0<=RULE_DECIMAL)||LA210_0==28||LA210_0==33||LA210_0==43||LA210_0==67||(LA210_0>=76 && LA210_0<=77)||(LA210_0>=98 && LA210_0<=99)||LA210_0==104||LA210_0==112||(LA210_0>=115 && LA210_0<=125)) ) {s = 7;}

                        else if ( (LA210_0==25||LA210_0==27||(LA210_0>=31 && LA210_0<=32)||(LA210_0>=35 && LA210_0<=36)||LA210_0==42||(LA210_0>=44 && LA210_0<=53)||LA210_0==55||(LA210_0>=58 && LA210_0<=59)||LA210_0==65) ) {s = 11;}

                        else if ( (LA210_0==41) ) {s = 31;}

                         
                        input.seek(index210_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA210_1 = input.LA(1);

                         
                        int index210_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_Xtend()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index210_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA210_2 = input.LA(1);

                         
                        int index210_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_Xtend()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index210_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA210_3 = input.LA(1);

                         
                        int index210_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_Xtend()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index210_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA210_5 = input.LA(1);

                         
                        int index210_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_Xtend()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index210_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA210_11 = input.LA(1);

                         
                        int index210_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_Xtend()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index210_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 210, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA212_eotS =
        "\115\uffff";
    static final String DFA212_eofS =
        "\115\uffff";
    static final String DFA212_minS =
        "\1\4\1\0\113\uffff";
    static final String DFA212_maxS =
        "\1\177\1\0\113\uffff";
    static final String DFA212_acceptS =
        "\2\uffff\1\2\111\uffff\1\1";
    static final String DFA212_specialS =
        "\1\uffff\1\0\113\uffff}>";
    static final String[] DFA212_transitionS = {
            "\13\2\12\uffff\15\2\1\uffff\33\2\1\uffff\2\2\6\uffff\2\2\1\1"+
            "\41\2\1\uffff\20\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA212_eot = DFA.unpackEncodedString(DFA212_eotS);
    static final short[] DFA212_eof = DFA.unpackEncodedString(DFA212_eofS);
    static final char[] DFA212_min = DFA.unpackEncodedStringToUnsignedChars(DFA212_minS);
    static final char[] DFA212_max = DFA.unpackEncodedStringToUnsignedChars(DFA212_maxS);
    static final short[] DFA212_accept = DFA.unpackEncodedString(DFA212_acceptS);
    static final short[] DFA212_special = DFA.unpackEncodedString(DFA212_specialS);
    static final short[][] DFA212_transition;

    static {
        int numStates = DFA212_transitionS.length;
        DFA212_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA212_transition[i] = DFA.unpackEncodedString(DFA212_transitionS[i]);
        }
    }

    class DFA212 extends DFA {

        public DFA212(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 212;
            this.eot = DFA212_eot;
            this.eof = DFA212_eof;
            this.min = DFA212_min;
            this.max = DFA212_max;
            this.accept = DFA212_accept;
            this.special = DFA212_special;
            this.transition = DFA212_transition;
        }
        public String getDescription() {
            return "1007:5: ( ( '[' )=> ruleXClosure )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA212_1 = input.LA(1);

                         
                        int index212_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred50_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index212_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 212, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA215_eotS =
        "\115\uffff";
    static final String DFA215_eofS =
        "\115\uffff";
    static final String DFA215_minS =
        "\1\4\33\0\5\uffff\1\0\24\uffff\1\0\1\uffff\6\0\5\uffff\3\0\7\uffff";
    static final String DFA215_maxS =
        "\1\177\33\0\5\uffff\1\0\24\uffff\1\0\1\uffff\6\0\5\uffff\3\0\7\uffff";
    static final String DFA215_acceptS =
        "\34\uffff\1\2\57\uffff\1\1";
    static final String DFA215_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\5\uffff\1\33\24\uffff\1\34\1\uffff\1\35\1\36\1\37\1\40\1\41"+
        "\1\42\5\uffff\1\43\1\44\1\45\7\uffff}>";
    static final String[] DFA215_transitionS = {
            "\1\105\1\20\1\21\1\22\4\34\1\15\2\16\12\uffff\1\7\1\34\1\71"+
            "\1\10\2\34\2\74\1\5\1\34\1\72\1\73\1\66\1\uffff\1\2\1\33\1\34"+
            "\1\74\1\4\12\7\1\1\1\7\2\34\2\70\1\105\1\34\1\104\1\75\1\103"+
            "\1\74\1\uffff\1\6\1\34\6\uffff\1\34\1\12\1\13\24\34\2\3\4\34"+
            "\1\41\6\34\1\uffff\1\24\2\34\1\25\1\26\1\27\1\11\2\14\1\17\1"+
            "\23\1\30\1\31\1\32\2\34",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA215_eot = DFA.unpackEncodedString(DFA215_eotS);
    static final short[] DFA215_eof = DFA.unpackEncodedString(DFA215_eofS);
    static final char[] DFA215_min = DFA.unpackEncodedStringToUnsignedChars(DFA215_minS);
    static final char[] DFA215_max = DFA.unpackEncodedStringToUnsignedChars(DFA215_maxS);
    static final short[] DFA215_accept = DFA.unpackEncodedString(DFA215_acceptS);
    static final short[] DFA215_special = DFA.unpackEncodedString(DFA215_specialS);
    static final short[][] DFA215_transition;

    static {
        int numStates = DFA215_transitionS.length;
        DFA215_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA215_transition[i] = DFA.unpackEncodedString(DFA215_transitionS[i]);
        }
    }

    class DFA215 extends DFA {

        public DFA215(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 215;
            this.eot = DFA215_eot;
            this.eof = DFA215_eof;
            this.min = DFA215_min;
            this.max = DFA215_max;
            this.accept = DFA215_accept;
            this.special = DFA215_special;
            this.transition = DFA215_transition;
        }
        public String getDescription() {
            return "1046:11: ( ( 'abstract' | 'annotation' | 'class' | 'create' | 'def' | 'dispatch' | 'enum' | 'extends' | 'final' | 'implements' | 'import' | 'interface' | 'override' | 'package' | 'public' | 'private' | 'protected' | 'static' | 'throws' | 'strictfp' | 'native' | 'volatile' | 'synchronized' | 'transient' | 'AFTER' | 'BEFORE' | 'SEPARATOR' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING | RULE_RICH_TEXT | RULE_RICH_TEXT_START )=> ruleXExpression )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA215_1 = input.LA(1);

                         
                        int index215_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA215_2 = input.LA(1);

                         
                        int index215_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA215_3 = input.LA(1);

                         
                        int index215_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA215_4 = input.LA(1);

                         
                        int index215_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA215_5 = input.LA(1);

                         
                        int index215_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA215_6 = input.LA(1);

                         
                        int index215_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA215_7 = input.LA(1);

                         
                        int index215_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA215_8 = input.LA(1);

                         
                        int index215_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA215_9 = input.LA(1);

                         
                        int index215_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA215_10 = input.LA(1);

                         
                        int index215_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA215_11 = input.LA(1);

                         
                        int index215_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA215_12 = input.LA(1);

                         
                        int index215_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA215_13 = input.LA(1);

                         
                        int index215_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA215_14 = input.LA(1);

                         
                        int index215_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA215_15 = input.LA(1);

                         
                        int index215_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA215_16 = input.LA(1);

                         
                        int index215_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA215_17 = input.LA(1);

                         
                        int index215_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA215_18 = input.LA(1);

                         
                        int index215_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA215_19 = input.LA(1);

                         
                        int index215_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA215_20 = input.LA(1);

                         
                        int index215_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA215_21 = input.LA(1);

                         
                        int index215_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA215_22 = input.LA(1);

                         
                        int index215_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA215_23 = input.LA(1);

                         
                        int index215_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA215_24 = input.LA(1);

                         
                        int index215_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA215_25 = input.LA(1);

                         
                        int index215_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA215_26 = input.LA(1);

                         
                        int index215_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA215_27 = input.LA(1);

                         
                        int index215_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA215_33 = input.LA(1);

                         
                        int index215_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_33);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA215_54 = input.LA(1);

                         
                        int index215_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_54);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA215_56 = input.LA(1);

                         
                        int index215_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_56);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA215_57 = input.LA(1);

                         
                        int index215_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_57);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA215_58 = input.LA(1);

                         
                        int index215_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_58);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA215_59 = input.LA(1);

                         
                        int index215_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_59);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA215_60 = input.LA(1);

                         
                        int index215_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_60);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA215_61 = input.LA(1);

                         
                        int index215_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_61);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA215_67 = input.LA(1);

                         
                        int index215_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_67);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA215_68 = input.LA(1);

                         
                        int index215_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_68);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA215_69 = input.LA(1);

                         
                        int index215_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_Xtend()) ) {s = 76;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index215_69);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 215, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA228_eotS =
        "\122\uffff";
    static final String DFA228_eofS =
        "\122\uffff";
    static final String DFA228_minS =
        "\1\4\1\0\120\uffff";
    static final String DFA228_maxS =
        "\1\u0081\1\0\120\uffff";
    static final String DFA228_acceptS =
        "\2\uffff\1\2\116\uffff\1\1";
    static final String DFA228_specialS =
        "\1\uffff\1\0\120\uffff}>";
    static final String[] DFA228_transitionS = {
            "\13\2\12\uffff\3\2\1\1\50\2\6\uffff\44\2\1\uffff\20\2\1\uffff"+
            "\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA228_eot = DFA.unpackEncodedString(DFA228_eotS);
    static final short[] DFA228_eof = DFA.unpackEncodedString(DFA228_eofS);
    static final char[] DFA228_min = DFA.unpackEncodedStringToUnsignedChars(DFA228_minS);
    static final char[] DFA228_max = DFA.unpackEncodedStringToUnsignedChars(DFA228_maxS);
    static final short[] DFA228_accept = DFA.unpackEncodedString(DFA228_acceptS);
    static final short[] DFA228_special = DFA.unpackEncodedString(DFA228_specialS);
    static final short[][] DFA228_transition;

    static {
        int numStates = DFA228_transitionS.length;
        DFA228_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA228_transition[i] = DFA.unpackEncodedString(DFA228_transitionS[i]);
        }
    }

    class DFA228 extends DFA {

        public DFA228(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 228;
            this.eot = DFA228_eot;
            this.eof = DFA228_eof;
            this.min = DFA228_min;
            this.max = DFA228_max;
            this.accept = DFA228_accept;
            this.special = DFA228_special;
            this.transition = DFA228_transition;
        }
        public String getDescription() {
            return "1186:20: ( ( ( '<' )=> '<' ) ruleJvmArgumentTypeReference ( ',' ruleJvmArgumentTypeReference )* '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA228_1 = input.LA(1);

                         
                        int index228_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_Xtend()) ) {s = 81;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index228_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 228, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA236_eotS =
        "\7\uffff";
    static final String DFA236_eofS =
        "\2\uffff\1\4\3\uffff\1\4";
    static final String DFA236_minS =
        "\1\4\1\uffff\1\31\1\4\2\uffff\1\31";
    static final String DFA236_maxS =
        "\1\100\1\uffff\1\154\1\144\2\uffff\1\154";
    static final String DFA236_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String DFA236_specialS =
        "\7\uffff}>";
    static final String[] DFA236_transitionS = {
            "\1\2\40\uffff\1\2\12\uffff\1\1\13\uffff\1\2\1\uffff\3\2",
            "",
            "\3\4\7\uffff\3\4\6\uffff\14\4\11\uffff\1\4\11\uffff\1\4\40"+
            "\uffff\1\3",
            "\1\6\40\uffff\1\6\26\uffff\1\6\1\uffff\3\6\43\uffff\1\5",
            "",
            "",
            "\3\4\7\uffff\3\4\6\uffff\14\4\11\uffff\1\4\11\uffff\1\4\40"+
            "\uffff\1\3"
    };

    static final short[] DFA236_eot = DFA.unpackEncodedString(DFA236_eotS);
    static final short[] DFA236_eof = DFA.unpackEncodedString(DFA236_eofS);
    static final char[] DFA236_min = DFA.unpackEncodedStringToUnsignedChars(DFA236_minS);
    static final char[] DFA236_max = DFA.unpackEncodedStringToUnsignedChars(DFA236_maxS);
    static final short[] DFA236_accept = DFA.unpackEncodedString(DFA236_acceptS);
    static final short[] DFA236_special = DFA.unpackEncodedString(DFA236_specialS);
    static final short[][] DFA236_transition;

    static {
        int numStates = DFA236_transitionS.length;
        DFA236_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA236_transition[i] = DFA.unpackEncodedString(DFA236_transitionS[i]);
        }
    }

    class DFA236 extends DFA {

        public DFA236(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 236;
            this.eot = DFA236_eot;
            this.eof = DFA236_eof;
            this.min = DFA236_min;
            this.max = DFA236_max;
            this.accept = DFA236_accept;
            this.special = DFA236_special;
            this.transition = DFA236_transition;
        }
        public String getDescription() {
            return "1243:11: ( 'static' ( 'extension' )? ruleQualifiedNameInStaticImport ( '*' | ruleValidID ) | ruleQualifiedName | ruleQualifiedNameWithWildcard )";
        }
    }
 

    public static final BitSet FOLLOW_25_in_ruleFile36 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFile38 = new BitSet(new long[]{0x00FFF0380E000002L,0x0000000000000802L});
    public static final BitSet FOLLOW_26_in_ruleFile40 = new BitSet(new long[]{0x00FFF0380A000002L,0x0000000000000802L});
    public static final BitSet FOLLOW_ruleXImportSection_in_ruleFile47 = new BitSet(new long[]{0x00FFF0380A000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleType_in_ruleFile50 = new BitSet(new long[]{0x00FFF0380A000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleXAnnotation_in_ruleType62 = new BitSet(new long[]{0x00FFF0380A000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleCommonModifier_in_ruleType69 = new BitSet(new long[]{0x00FFF0000A000000L});
    public static final BitSet FOLLOW_27_in_ruleType72 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleType74 = new BitSet(new long[]{0x0000000390000000L});
    public static final BitSet FOLLOW_28_in_ruleType81 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmTypeParameter_in_ruleType83 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleType91 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmTypeParameter_in_ruleType93 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_30_in_ruleType101 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_31_in_ruleType113 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleType115 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleType127 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleType129 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_29_in_ruleType137 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleType139 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_33_in_ruleType152 = new BitSet(new long[]{0xDFFFF9BC0A000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_ruleMember_in_ruleType154 = new BitSet(new long[]{0xDFFFF9BC0A000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_34_in_ruleType157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonModifier_in_ruleType163 = new BitSet(new long[]{0x00FFF00802000000L});
    public static final BitSet FOLLOW_35_in_ruleType166 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleType168 = new BitSet(new long[]{0x0000000290000000L});
    public static final BitSet FOLLOW_28_in_ruleType175 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmTypeParameter_in_ruleType177 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleType185 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmTypeParameter_in_ruleType187 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_30_in_ruleType195 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_31_in_ruleType207 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleType209 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_29_in_ruleType217 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleType219 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_33_in_ruleType232 = new BitSet(new long[]{0xDFFFF9BC0A000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_ruleMember_in_ruleType234 = new BitSet(new long[]{0xDFFFF9BC0A000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_34_in_ruleType237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonModifier_in_ruleType243 = new BitSet(new long[]{0x00FFF01002000000L});
    public static final BitSet FOLLOW_36_in_ruleType246 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleType248 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleType250 = new BitSet(new long[]{0xD000002404000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleXtendEnumLiteral_in_ruleType257 = new BitSet(new long[]{0x0000000424000000L});
    public static final BitSet FOLLOW_29_in_ruleType265 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleXtendEnumLiteral_in_ruleType267 = new BitSet(new long[]{0x0000000424000000L});
    public static final BitSet FOLLOW_26_in_ruleType280 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleType283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonModifier_in_ruleType289 = new BitSet(new long[]{0x00FFF02002000000L});
    public static final BitSet FOLLOW_37_in_ruleType292 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleType294 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleType296 = new BitSet(new long[]{0xD3FFF1BC0A000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_ruleAnnotationField_in_ruleType298 = new BitSet(new long[]{0xD3FFF1BC0A000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_34_in_ruleType301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAnnotation_in_ruleAnnotationField315 = new BitSet(new long[]{0xD3FFF1B80A000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_ruleCommonModifier_in_ruleAnnotationField327 = new BitSet(new long[]{0x03FFF00002000000L});
    public static final BitSet FOLLOW_ruleFieldModifier_in_ruleAnnotationField330 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleCommonModifier_in_ruleAnnotationField332 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleAnnotationField338 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleAnnotationField341 = new BitSet(new long[]{0x0000004004000002L});
    public static final BitSet FOLLOW_ruleCommonModifier_in_ruleAnnotationField348 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleAnnotationField351 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleAnnotationField353 = new BitSet(new long[]{0x0000004004000002L});
    public static final BitSet FOLLOW_38_in_ruleAnnotationField364 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXAnnotationElementValue_in_ruleAnnotationField366 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleAnnotationField373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonModifier_in_ruleAnnotationField380 = new BitSet(new long[]{0x00FFF0000A000000L});
    public static final BitSet FOLLOW_27_in_ruleAnnotationField383 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleAnnotationField385 = new BitSet(new long[]{0x0000000390000000L});
    public static final BitSet FOLLOW_28_in_ruleAnnotationField392 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmTypeParameter_in_ruleAnnotationField394 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleAnnotationField402 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmTypeParameter_in_ruleAnnotationField404 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_30_in_ruleAnnotationField412 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_31_in_ruleAnnotationField424 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleAnnotationField426 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleAnnotationField438 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleAnnotationField440 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_29_in_ruleAnnotationField448 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleAnnotationField450 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_33_in_ruleAnnotationField463 = new BitSet(new long[]{0xDFFFF9BC0A000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_ruleMember_in_ruleAnnotationField465 = new BitSet(new long[]{0xDFFFF9BC0A000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_34_in_ruleAnnotationField468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonModifier_in_ruleAnnotationField474 = new BitSet(new long[]{0x00FFF00802000000L});
    public static final BitSet FOLLOW_35_in_ruleAnnotationField477 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleAnnotationField479 = new BitSet(new long[]{0x0000000290000000L});
    public static final BitSet FOLLOW_28_in_ruleAnnotationField486 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmTypeParameter_in_ruleAnnotationField488 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleAnnotationField496 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmTypeParameter_in_ruleAnnotationField498 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_30_in_ruleAnnotationField506 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_31_in_ruleAnnotationField518 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleAnnotationField520 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_29_in_ruleAnnotationField528 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleAnnotationField530 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_33_in_ruleAnnotationField543 = new BitSet(new long[]{0xDFFFF9BC0A000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_ruleMember_in_ruleAnnotationField545 = new BitSet(new long[]{0xDFFFF9BC0A000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_34_in_ruleAnnotationField548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonModifier_in_ruleAnnotationField554 = new BitSet(new long[]{0x00FFF01002000000L});
    public static final BitSet FOLLOW_36_in_ruleAnnotationField557 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleAnnotationField559 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAnnotationField561 = new BitSet(new long[]{0xD000002404000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleXtendEnumLiteral_in_ruleAnnotationField568 = new BitSet(new long[]{0x0000000424000000L});
    public static final BitSet FOLLOW_29_in_ruleAnnotationField576 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleXtendEnumLiteral_in_ruleAnnotationField578 = new BitSet(new long[]{0x0000000424000000L});
    public static final BitSet FOLLOW_26_in_ruleAnnotationField591 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleAnnotationField594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonModifier_in_ruleAnnotationField600 = new BitSet(new long[]{0x00FFF02002000000L});
    public static final BitSet FOLLOW_37_in_ruleAnnotationField603 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleAnnotationField605 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAnnotationField607 = new BitSet(new long[]{0xD3FFF1BC0A000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_ruleAnnotationField_in_ruleAnnotationField609 = new BitSet(new long[]{0xD3FFF1BC0A000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_34_in_ruleAnnotationField612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAnnotation_in_ruleMember626 = new BitSet(new long[]{0xDFFFF9B80A000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_ruleCommonModifier_in_ruleMember633 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleFieldModifier_in_ruleMember641 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleCommonModifier_in_ruleMember643 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleMember646 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMember649 = new BitSet(new long[]{0x0000004004000002L});
    public static final BitSet FOLLOW_39_in_ruleMember656 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleFieldModifier_in_ruleMember664 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleCommonModifier_in_ruleMember672 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleMember680 = new BitSet(new long[]{0xD000006004000012L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMember682 = new BitSet(new long[]{0x0000004004000002L});
    public static final BitSet FOLLOW_ruleFieldModifier_in_ruleMember690 = new BitSet(new long[]{0x00FFF08002000000L});
    public static final BitSet FOLLOW_ruleCommonModifier_in_ruleMember692 = new BitSet(new long[]{0x00FFF08002000000L});
    public static final BitSet FOLLOW_39_in_ruleMember695 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleCommonModifier_in_ruleMember697 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleMember703 = new BitSet(new long[]{0xD000006004000012L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMember705 = new BitSet(new long[]{0x0000004004000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleMember713 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMember715 = new BitSet(new long[]{0x0000004004000002L});
    public static final BitSet FOLLOW_38_in_ruleMember726 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleMember728 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleMember735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonModifier_in_ruleMember742 = new BitSet(new long[]{0x0CFFF00002000000L});
    public static final BitSet FOLLOW_ruleMethodModifier_in_ruleMember745 = new BitSet(new long[]{0xDFFFF1A052000010L,0x00000DFFF7FF8001L});
    public static final BitSet FOLLOW_ruleCommonModifier_in_ruleMember752 = new BitSet(new long[]{0xDFFFF1A052000010L,0x00000DFFF7FF8001L});
    public static final BitSet FOLLOW_ruleMethodModifier_in_ruleMember759 = new BitSet(new long[]{0xDFFFF1A052000010L,0x00000DFFF7FF8001L});
    public static final BitSet FOLLOW_28_in_ruleMember771 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmTypeParameter_in_ruleMember773 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleMember781 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmTypeParameter_in_ruleMember783 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_30_in_ruleMember791 = new BitSet(new long[]{0xDFFFF1A052000010L,0x00000DFFF7FF8001L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleMember831 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ruleCreateExtensionInfo_in_ruleMember833 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMember835 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleMember837 = new BitSet(new long[]{0xD3FFF3A002000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleMember877 = new BitSet(new long[]{0xDFFFF1A052000010L,0x00000DFFF7FF8001L});
    public static final BitSet FOLLOW_ruleFunctionID_in_ruleMember879 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleMember881 = new BitSet(new long[]{0xD3FFF3A002000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_ruleTypeReferenceNoTypeArgs_in_ruleMember921 = new BitSet(new long[]{0xDFFFF1A052000010L,0x00000DFFF7FF8001L});
    public static final BitSet FOLLOW_ruleFunctionID_in_ruleMember923 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleMember925 = new BitSet(new long[]{0xD3FFF3A002000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_ruleCreateExtensionInfo_in_ruleMember965 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMember967 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleMember969 = new BitSet(new long[]{0xD3FFF3A002000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_ruleFunctionID_in_ruleMember983 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleMember985 = new BitSet(new long[]{0xD3FFF3A002000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMember996 = new BitSet(new long[]{0x0000020020000000L});
    public static final BitSet FOLLOW_29_in_ruleMember1004 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMember1006 = new BitSet(new long[]{0x0000020020000000L});
    public static final BitSet FOLLOW_41_in_ruleMember1019 = new BitSet(new long[]{0x00000402040000E2L});
    public static final BitSet FOLLOW_42_in_ruleMember1026 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleMember1028 = new BitSet(new long[]{0x00000002240000E2L});
    public static final BitSet FOLLOW_29_in_ruleMember1036 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleMember1038 = new BitSet(new long[]{0x00000002240000E2L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleMember1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichString_in_ruleMember1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMember1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonModifier_in_ruleMember1081 = new BitSet(new long[]{0x00FFF80002000000L});
    public static final BitSet FOLLOW_43_in_ruleMember1084 = new BitSet(new long[]{0x0000010010000000L});
    public static final BitSet FOLLOW_28_in_ruleMember1091 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmTypeParameter_in_ruleMember1093 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleMember1101 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmTypeParameter_in_ruleMember1103 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_30_in_ruleMember1111 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleMember1118 = new BitSet(new long[]{0xD3FFF3A002000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMember1125 = new BitSet(new long[]{0x0000020020000000L});
    public static final BitSet FOLLOW_29_in_ruleMember1133 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMember1135 = new BitSet(new long[]{0x0000020020000000L});
    public static final BitSet FOLLOW_41_in_ruleMember1148 = new BitSet(new long[]{0x0000040200000000L});
    public static final BitSet FOLLOW_42_in_ruleMember1155 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleMember1157 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_29_in_ruleMember1165 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleMember1167 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleMember1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonModifier_in_ruleMember1186 = new BitSet(new long[]{0x00FFF0000A000000L});
    public static final BitSet FOLLOW_27_in_ruleMember1189 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMember1191 = new BitSet(new long[]{0x0000000390000000L});
    public static final BitSet FOLLOW_28_in_ruleMember1198 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmTypeParameter_in_ruleMember1200 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleMember1208 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmTypeParameter_in_ruleMember1210 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_30_in_ruleMember1218 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_31_in_ruleMember1230 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleMember1232 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleMember1244 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleMember1246 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_29_in_ruleMember1254 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleMember1256 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_33_in_ruleMember1269 = new BitSet(new long[]{0xDFFFF9BC0A000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_ruleMember_in_ruleMember1271 = new BitSet(new long[]{0xDFFFF9BC0A000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_34_in_ruleMember1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonModifier_in_ruleMember1280 = new BitSet(new long[]{0x00FFF00802000000L});
    public static final BitSet FOLLOW_35_in_ruleMember1283 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMember1285 = new BitSet(new long[]{0x0000000290000000L});
    public static final BitSet FOLLOW_28_in_ruleMember1292 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmTypeParameter_in_ruleMember1294 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleMember1302 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmTypeParameter_in_ruleMember1304 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_30_in_ruleMember1312 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_31_in_ruleMember1324 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleMember1326 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_29_in_ruleMember1334 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleMember1336 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_33_in_ruleMember1349 = new BitSet(new long[]{0xDFFFF9BC0A000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_ruleMember_in_ruleMember1351 = new BitSet(new long[]{0xDFFFF9BC0A000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_34_in_ruleMember1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonModifier_in_ruleMember1360 = new BitSet(new long[]{0x00FFF01002000000L});
    public static final BitSet FOLLOW_36_in_ruleMember1363 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMember1365 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleMember1367 = new BitSet(new long[]{0xD000002404000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleXtendEnumLiteral_in_ruleMember1374 = new BitSet(new long[]{0x0000000424000000L});
    public static final BitSet FOLLOW_29_in_ruleMember1382 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleXtendEnumLiteral_in_ruleMember1384 = new BitSet(new long[]{0x0000000424000000L});
    public static final BitSet FOLLOW_26_in_ruleMember1397 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleMember1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonModifier_in_ruleMember1406 = new BitSet(new long[]{0x00FFF02002000000L});
    public static final BitSet FOLLOW_37_in_ruleMember1409 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMember1411 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleMember1413 = new BitSet(new long[]{0xD3FFF1BC0A000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_ruleAnnotationField_in_ruleMember1415 = new BitSet(new long[]{0xD3FFF1BC0A000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_34_in_ruleMember1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeReferenceNoTypeArgs1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFunctionID1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperators_in_ruleFunctionID1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleOperators1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleOperators1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleOperators1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleOperators1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleOperators1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleOperators1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleOperators1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleOperators1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpPostfix_in_ruleOperators1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXtendEnumLiteral1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ruleCommonModifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ruleFieldModifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ruleMethodModifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleCreateExtensionInfo1624 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleCreateExtensionInfo1630 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleCreateExtensionInfo1632 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleCreateExtensionInfo1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ruleValidID0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerVarID_in_ruleFeatureCallID1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleFeatureCallID1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ruleInnerVarID0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAnnotation_in_ruleParameter1847 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_39_in_ruleParameter1854 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_ruleXAnnotation_in_ruleParameter1856 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleParameter1863 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000005L});
    public static final BitSet FOLLOW_66_in_ruleParameter1865 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleParameter1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ruleXVariableDeclaration1931 = new BitSet(new long[]{0xDFFFF5B98A000010L,0x0000000080000003L});
    public static final BitSet FOLLOW_39_in_ruleXVariableDeclaration1949 = new BitSet(new long[]{0xDFFFF5B98A000010L,0x0000000080000003L});
    public static final BitSet FOLLOW_39_in_ruleXVariableDeclaration1956 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_set_in_ruleXVariableDeclaration1958 = new BitSet(new long[]{0xDFFFF5B98A000010L,0x0000000080000003L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration2006 = new BitSet(new long[]{0xDCFFF4398A000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleInnerVarID_in_ruleXVariableDeclaration2008 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleInnerVarID_in_ruleXVariableDeclaration2020 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleXVariableDeclaration2029 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXbaseConstructorCall_in_ruleXConstructorCall2046 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleXConstructorCall2066 = new BitSet(new long[]{0xDFFFF9BC0A000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_ruleMember_in_ruleXConstructorCall2070 = new BitSet(new long[]{0xDFFFF9BC0A000010L,0x0000000080000801L});
    public static final BitSet FOLLOW_34_in_ruleXConstructorCall2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXbaseConstructorCall2088 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXbaseConstructorCall2090 = new BitSet(new long[]{0x0000010010000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_28_in_ruleXbaseConstructorCall2110 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXbaseConstructorCall2114 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleXbaseConstructorCall2121 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXbaseConstructorCall2123 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_30_in_ruleXbaseConstructorCall2130 = new BitSet(new long[]{0x0000010000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_40_in_ruleXbaseConstructorCall2154 = new BitSet(new long[]{0xDFFFFFBB9A0070F0L,0x3FF9810C8000380BL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXbaseConstructorCall2211 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXbaseConstructorCall2220 = new BitSet(new long[]{0x0000020020000000L});
    public static final BitSet FOLLOW_29_in_ruleXbaseConstructorCall2228 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXbaseConstructorCall2230 = new BitSet(new long[]{0x0000020020000000L});
    public static final BitSet FOLLOW_41_in_ruleXbaseConstructorCall2243 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXbaseConstructorCall2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleJvmFormalParameter2275 = new BitSet(new long[]{0xDFFFF5B98A000010L,0x0000000080000003L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter2278 = new BitSet(new long[]{0xDCFFF4398A000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleInnerVarID_in_ruleJvmFormalParameter2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleFullJvmFormalParameter2292 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter2295 = new BitSet(new long[]{0xDCFFF4398A000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleInnerVarID_in_ruleFullJvmFormalParameter2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleStringLiteral_in_ruleXStringLiteral2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichString_in_ruleXStringLiteral2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXSwitchExpression2324 = new BitSet(new long[]{0xDFFFFDBB9A0070F0L,0x3FF9010C8000380BL});
    public static final BitSet FOLLOW_40_in_ruleXSwitchExpression2353 = new BitSet(new long[]{0xDFFFF5B98A000010L,0x0000000080000003L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXSwitchExpression2355 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleXSwitchExpression2357 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression2365 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXSwitchExpression2367 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXSwitchExpression2394 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleXSwitchExpression2396 = new BitSet(new long[]{0xDFFFFDBB9A0070F0L,0x3FF9010C8000380BL});
    public static final BitSet FOLLOW_ruleXExpressionOrSimpleConstructorCall_in_ruleXSwitchExpression2405 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleXSwitchExpression2410 = new BitSet(new long[]{0xF3FFF1A422000010L,0x0004000080000011L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression2412 = new BitSet(new long[]{0xF3FFF1A422000010L,0x0004000080000011L});
    public static final BitSet FOLLOW_68_in_ruleXSwitchExpression2419 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleXSwitchExpression2421 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression2423 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleXSwitchExpression2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXbaseConstructorCall_in_ruleXExpressionOrSimpleConstructorCall2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionOrSimpleConstructorCall2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleStringLiteral2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteral_in_ruleRichString2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteralStart_in_ruleRichString2486 = new BitSet(new long[]{0xDFFFFDBB9A007FF0L,0x3FF9010C000038ABL});
    public static final BitSet FOLLOW_ruleRichStringPart_in_ruleRichString2488 = new BitSet(new long[]{0xDFFFFDBB9A007FF0L,0x3FF9010C000038ABL});
    public static final BitSet FOLLOW_ruleRichStringLiteralInbetween_in_ruleRichString2495 = new BitSet(new long[]{0xDFFFFDBB9A007FF0L,0x3FF9010C000038ABL});
    public static final BitSet FOLLOW_ruleRichStringPart_in_ruleRichString2497 = new BitSet(new long[]{0xDFFFFDBB9A007FF0L,0x3FF9010C000038ABL});
    public static final BitSet FOLLOW_ruleRichStringLiteralEnd_in_ruleRichString2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RICH_TEXT_in_ruleRichStringLiteral2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RICH_TEXT_START_in_ruleRichStringLiteralStart2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ruleRichStringLiteralInbetween0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ruleRichStringLiteralEnd0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteralInbetween_in_ruleInternalRichString2569 = new BitSet(new long[]{0xDFFFFDBB9A0073F2L,0x3FF9010C000038ABL});
    public static final BitSet FOLLOW_ruleRichStringPart_in_ruleInternalRichString2575 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_ruleRichStringLiteralInbetween_in_ruleInternalRichString2578 = new BitSet(new long[]{0xDFFFFDBB9A0073F2L,0x3FF9010C000038ABL});
    public static final BitSet FOLLOW_ruleXExpressionOrVarDeclaration_in_ruleRichStringPart2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringForLoop_in_ruleRichStringPart2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringIf_in_ruleRichStringPart2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleRichStringForLoop2614 = new BitSet(new long[]{0xDFFFF5B98A000010L,0x0000000080000003L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleRichStringForLoop2616 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleRichStringForLoop2618 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleRichStringForLoop2620 = new BitSet(new long[]{0xC000000000000300L,0x0000000000000001L});
    public static final BitSet FOLLOW_63_in_ruleRichStringForLoop2626 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleRichStringForLoop2628 = new BitSet(new long[]{0xC000000000000300L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleRichStringForLoop2638 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleRichStringForLoop2640 = new BitSet(new long[]{0xC000000000000300L,0x0000000000000001L});
    public static final BitSet FOLLOW_62_in_ruleRichStringForLoop2650 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleRichStringForLoop2652 = new BitSet(new long[]{0xC000000000000300L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleInternalRichString_in_ruleRichStringForLoop2658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleRichStringForLoop2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleRichStringIf2671 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleRichStringIf2673 = new BitSet(new long[]{0xC000000000000300L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleInternalRichString_in_ruleRichStringIf2675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000700L});
    public static final BitSet FOLLOW_ruleRichStringElseIf_in_ruleRichStringIf2677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000700L});
    public static final BitSet FOLLOW_72_in_ruleRichStringIf2684 = new BitSet(new long[]{0xC000000000000300L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleInternalRichString_in_ruleRichStringIf2686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleRichStringIf2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleRichStringElseIf2703 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleRichStringElseIf2705 = new BitSet(new long[]{0xC000000000000300L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleInternalRichString_in_ruleRichStringElseIf2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXAnnotation2718 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXAnnotation2720 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleXAnnotation2740 = new BitSet(new long[]{0xDCFFFFBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXAnnotationElementValuePair_in_ruleXAnnotation2767 = new BitSet(new long[]{0x0000020020000000L});
    public static final BitSet FOLLOW_29_in_ruleXAnnotation2777 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleXAnnotationElementValuePair_in_ruleXAnnotation2799 = new BitSet(new long[]{0x0000020020000000L});
    public static final BitSet FOLLOW_ruleXAnnotationElementValueOrCommaList_in_ruleXAnnotation2814 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXAnnotation2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAnnotationElementValuePair2854 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXAnnotationElementValuePair2856 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXAnnotationElementValue_in_ruleXAnnotationElementValuePair2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXAnnotationElementValueOrCommaList2892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleXAnnotationElementValueOrCommaList2894 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000780BL});
    public static final BitSet FOLLOW_ruleXAnnotationOrExpression_in_ruleXAnnotationElementValueOrCommaList2905 = new BitSet(new long[]{0x0000000020000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_29_in_ruleXAnnotationElementValueOrCommaList2912 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXAnnotationOrExpression_in_ruleXAnnotationElementValueOrCommaList2914 = new BitSet(new long[]{0x0000000020000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleXAnnotationElementValueOrCommaList2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAnnotationOrExpression_in_ruleXAnnotationElementValueOrCommaList2930 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleXAnnotationElementValueOrCommaList2941 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXAnnotationOrExpression_in_ruleXAnnotationElementValueOrCommaList2943 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_76_in_ruleXAnnotationElementValue2981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleXAnnotationElementValue2983 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000780BL});
    public static final BitSet FOLLOW_ruleXAnnotationOrExpression_in_ruleXAnnotationElementValue2994 = new BitSet(new long[]{0x0000000020000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_29_in_ruleXAnnotationElementValue3001 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXAnnotationOrExpression_in_ruleXAnnotationElementValue3003 = new BitSet(new long[]{0x0000000020000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleXAnnotationElementValue3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAnnotationOrExpression_in_ruleXAnnotationElementValue3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAnnotation_in_ruleXAnnotationOrExpression3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXAnnotationOrExpression3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleXAssignment3057 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment3059 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment3066 = new BitSet(new long[]{0x0000000050000002L,0x00000000000F8000L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment3086 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpSingleAssign3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleOpMultiAssign3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleOpMultiAssign3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleOpMultiAssign3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleOpMultiAssign3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleOpMultiAssign3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpMultiAssign3141 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleOpMultiAssign3143 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleOpMultiAssign3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpMultiAssign3150 = new BitSet(new long[]{0x0000000040000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_30_in_ruleOpMultiAssign3152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleOpMultiAssign3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression3166 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression3186 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression3190 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ruleOpOr3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3216 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression3236 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3240 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleOpAnd3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3266 = new BitSet(new long[]{0x0000000000000002L,0x0000000007800000L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3286 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3290 = new BitSet(new long[]{0x0000000000000002L,0x0000000007800000L});
    public static final BitSet FOLLOW_set_in_ruleOpEquality0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3331 = new BitSet(new long[]{0x0000000050000002L,0x0000000008100000L});
    public static final BitSet FOLLOW_91_in_ruleXRelationalExpression3351 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression3355 = new BitSet(new long[]{0x0000000050000002L,0x0000000008100000L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3375 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3379 = new BitSet(new long[]{0x0000000050000002L,0x0000000008100000L});
    public static final BitSet FOLLOW_84_in_ruleOpCompare3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpCompare3399 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleOpCompare3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpCompare3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpCompare3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3422 = new BitSet(new long[]{0x0000000050000002L,0x00000003F0000000L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3442 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3446 = new BitSet(new long[]{0x0000000050000002L,0x00000003F0000000L});
    public static final BitSet FOLLOW_92_in_ruleOpOther3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleOpOther3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther3471 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_ruleOpOther3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleOpOther3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleOpOther3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther3488 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleOpOther3515 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleOpOther3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther3537 = new BitSet(new long[]{0x0000000010000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_28_in_ruleOpOther3564 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleOpOther3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleOpOther3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleOpOther3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleOpOther3597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3608 = new BitSet(new long[]{0x0000000000000002L,0x0000000C00000000L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3628 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3632 = new BitSet(new long[]{0x0000000000000002L,0x0000000C00000000L});
    public static final BitSet FOLLOW_set_in_ruleOpAdd0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3663 = new BitSet(new long[]{0x0000000000000002L,0x000000F000000000L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3683 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3687 = new BitSet(new long[]{0x0000000000000002L,0x000000F000000000L});
    public static final BitSet FOLLOW_set_in_ruleOpMulti0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3728 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXUnaryOperation3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ruleOpUnary0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPostfixOperation_in_ruleXCastedExpression3767 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_ruleXCastedExpression3787 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3791 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXPostfixOperation3806 = new BitSet(new long[]{0xDFFFF1A052000012L,0x00000DFFF7FF8001L});
    public static final BitSet FOLLOW_ruleOpPostfix_in_ruleXPostfixOperation3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ruleOpPostfix0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3850 = new BitSet(new long[]{0x0000000000000002L,0x0000700000000000L});
    public static final BitSet FOLLOW_set_in_ruleXMemberFeatureCall3895 = new BitSet(new long[]{0xDCFFF4B98A000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall3916 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3918 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3926 = new BitSet(new long[]{0x0000000000000002L,0x0000700000000000L});
    public static final BitSet FOLLOW_set_in_ruleXMemberFeatureCall3958 = new BitSet(new long[]{0xDCFFF4B99A000010L,0x0040000000000003L});
    public static final BitSet FOLLOW_28_in_ruleXMemberFeatureCall3990 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3992 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleXMemberFeatureCall4000 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4002 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_30_in_ruleXMemberFeatureCall4010 = new BitSet(new long[]{0xDCFFF4B99A000010L,0x0040000000000003L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXMemberFeatureCall4017 = new BitSet(new long[]{0x0000010000000002L,0x0000700000002000L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall4040 = new BitSet(new long[]{0xDFFFFFBB9A0070F0L,0x3FF9810C8000380BL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4104 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4114 = new BitSet(new long[]{0x0000020020000000L});
    public static final BitSet FOLLOW_29_in_ruleXMemberFeatureCall4123 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4125 = new BitSet(new long[]{0x0000020020000000L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4140 = new BitSet(new long[]{0x0000000000000002L,0x0000700000002000L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4161 = new BitSet(new long[]{0x0000000000000002L,0x0000700000000000L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSynchronizedExpression_in_ruleXPrimaryExpression4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBasicForLoopExpression_in_ruleXPrimaryExpression4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCollectionLiteral_in_ruleXLiteral4296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSetLiteral_in_ruleXCollectionLiteral4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXListLiteral_in_ruleXCollectionLiteral4356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXSetLiteral4367 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleXSetLiteral4369 = new BitSet(new long[]{0xDCFFFDBF9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSetLiteral4375 = new BitSet(new long[]{0x0000000420000000L});
    public static final BitSet FOLLOW_29_in_ruleXSetLiteral4382 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSetLiteral4384 = new BitSet(new long[]{0x0000000420000000L});
    public static final BitSet FOLLOW_34_in_ruleXSetLiteral4395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXListLiteral4406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleXListLiteral4408 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000780BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXListLiteral4414 = new BitSet(new long[]{0x0000000020000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_29_in_ruleXListLiteral4421 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXListLiteral4423 = new BitSet(new long[]{0x0000000020000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleXListLiteral4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXClosure4457 = new BitSet(new long[]{0xDFFFFDBB9A0070F0L,0x3FF9810C8000780BL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure4506 = new BitSet(new long[]{0x0000000020000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_29_in_ruleXClosure4514 = new BitSet(new long[]{0xDFFFF5B98A000010L,0x0000000080000003L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure4516 = new BitSet(new long[]{0x0000000020000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleXClosure4529 = new BitSet(new long[]{0xDFFFFDBB9A0070F0L,0x3FF9010C0000780BL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure4537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleXClosure4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionOrVarDeclaration_in_ruleXExpressionInClosure4554 = new BitSet(new long[]{0xDFFFFDBB9E0070F2L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_26_in_ruleXExpressionInClosure4556 = new BitSet(new long[]{0xDFFFFDBB9A0070F2L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure4617 = new BitSet(new long[]{0x0000000020000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_29_in_ruleXShortClosure4625 = new BitSet(new long[]{0xDFFFF5B98A000010L,0x0000000080000003L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure4627 = new BitSet(new long[]{0x0000000020000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleXShortClosure4640 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXParenthesizedExpression4658 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression4660 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXParenthesizedExpression4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleXIfExpression4673 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXIfExpression4675 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression4677 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXIfExpression4679 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression4681 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleXIfExpression4701 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart4720 = new BitSet(new long[]{0x2000000020000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleXCasePart4727 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart4729 = new BitSet(new long[]{0x2000000020000000L});
    public static final BitSet FOLLOW_61_in_ruleXCasePart4739 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleXCasePart4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleXForLoopExpression4783 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXForLoopExpression4785 = new BitSet(new long[]{0xDFFFF5B98A000010L,0x0000000080000003L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression4787 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleXForLoopExpression4789 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression4796 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXForLoopExpression4798 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleXBasicForLoopExpression4811 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXBasicForLoopExpression4813 = new BitSet(new long[]{0xDFFFFDBB9E0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpressionOrVarDeclaration_in_ruleXBasicForLoopExpression4819 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_29_in_ruleXBasicForLoopExpression4826 = new BitSet(new long[]{0xDFFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpressionOrVarDeclaration_in_ruleXBasicForLoopExpression4828 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_26_in_ruleXBasicForLoopExpression4839 = new BitSet(new long[]{0xDCFFFDBB9E0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXBasicForLoopExpression4841 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXBasicForLoopExpression4844 = new BitSet(new long[]{0xDCFFFFBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXBasicForLoopExpression4850 = new BitSet(new long[]{0x0000020020000000L});
    public static final BitSet FOLLOW_29_in_ruleXBasicForLoopExpression4857 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXBasicForLoopExpression4859 = new BitSet(new long[]{0x0000020020000000L});
    public static final BitSet FOLLOW_41_in_ruleXBasicForLoopExpression4870 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXBasicForLoopExpression4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleXWhileExpression4883 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXWhileExpression4885 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression4887 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXWhileExpression4889 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression4891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleXDoWhileExpression4902 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression4904 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_ruleXDoWhileExpression4906 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXDoWhileExpression4908 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression4910 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXDoWhileExpression4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleXBlockExpression4923 = new BitSet(new long[]{0xDFFFFDBF9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpressionOrVarDeclaration_in_ruleXBlockExpression4929 = new BitSet(new long[]{0xDFFFFDBF9E0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_26_in_ruleXBlockExpression4931 = new BitSet(new long[]{0xDFFFFDBF9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_34_in_ruleXBlockExpression4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionOrVarDeclaration4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionOrVarDeclaration5004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleXFeatureCall5019 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall5021 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleXFeatureCall5028 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall5030 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_30_in_ruleXFeatureCall5037 = new BitSet(new long[]{0xDCFFF4B99A000010L,0x0040000000000003L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall5043 = new BitSet(new long[]{0x0000010000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_40_in_ruleXFeatureCall5063 = new BitSet(new long[]{0xDFFFFFBB9A0070F0L,0x3FF9810C8000380BL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall5120 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall5129 = new BitSet(new long[]{0x0000020020000000L});
    public static final BitSet FOLLOW_29_in_ruleXFeatureCall5137 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall5139 = new BitSet(new long[]{0x0000020020000000L});
    public static final BitSet FOLLOW_41_in_ruleXFeatureCall5152 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall5170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleIdOrSuper5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleIdOrSuper5189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ruleXBooleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleXNullLiteral5216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral5227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleXTypeLiteral5238 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXTypeLiteral5240 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral5242 = new BitSet(new long[]{0x0000020000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_ruleXTypeLiteral5244 = new BitSet(new long[]{0x0000020000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_41_in_ruleXTypeLiteral5247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleXThrowExpression5258 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression5260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleXReturnExpression5271 = new BitSet(new long[]{0xDCFFFDBB9A0070F2L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression5565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleXTryCatchFinallyExpression5579 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression5581 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression5601 = new BitSet(new long[]{0x0000000000000002L,0xC000000000000000L});
    public static final BitSet FOLLOW_126_in_ruleXTryCatchFinallyExpression5627 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression5631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleXTryCatchFinallyExpression5642 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXSynchronizedExpression5676 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXSynchronizedExpression5678 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSynchronizedExpression5685 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXSynchronizedExpression5687 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSynchronizedExpression5689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleXCatchClause5712 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXCatchClause5716 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause5718 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXCatchClause5720 = new BitSet(new long[]{0xDCFFFDBB9A0070F0L,0x3FF9010C0000380BL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause5722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName5733 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_ruleQualifiedName5753 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName5757 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber5772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ruleNumber5777 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_ruleNumber5796 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_set_in_ruleNumber5798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference5829 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_ruleJvmTypeReference5843 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference5851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleArrayBrackets5862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleArrayBrackets5864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXFunctionTypeRef5879 = new BitSet(new long[]{0xD3FFF3A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef5886 = new BitSet(new long[]{0x0000020020000000L});
    public static final BitSet FOLLOW_29_in_ruleXFunctionTypeRef5894 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef5896 = new BitSet(new long[]{0x0000020020000000L});
    public static final BitSet FOLLOW_41_in_ruleXFunctionTypeRef5909 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_ruleXFunctionTypeRef5915 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef5917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference5928 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleJvmParameterizedTypeReference5948 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference5952 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleJvmParameterizedTypeReference5959 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference5961 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_30_in_ruleJvmParameterizedTypeReference5968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference5983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference5988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleJvmWildcardTypeReference5999 = new BitSet(new long[]{0x0000000080000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference6005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleJvmUpperBound6026 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound6028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleJvmUpperBoundAnded6039 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleJvmLowerBound6052 = new BitSet(new long[]{0xD3FFF1A002000010L,0x0000000080000001L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound6054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmTypeParameter6065 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmTypeParameter6071 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_ruleJvmTypeParameter6073 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard6089 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_ruleQualifiedNameWithWildcard6091 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_ruleQualifiedNameWithWildcard6093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXImportDeclaration_in_ruleXImportSection6104 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXImportDeclaration6116 = new BitSet(new long[]{0xD001002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_48_in_ruleXImportDeclaration6122 = new BitSet(new long[]{0xD00000A000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_39_in_ruleXImportDeclaration6124 = new BitSet(new long[]{0xD00000A000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleQualifiedNameInStaticImport_in_ruleXImportDeclaration6127 = new BitSet(new long[]{0xD000002000000010L,0x0000001000000001L});
    public static final BitSet FOLLOW_100_in_ruleXImportDeclaration6134 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXImportDeclaration6141 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration6151 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleXImportDeclaration6157 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleXImportDeclaration6162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedNameInStaticImport6178 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_ruleQualifiedNameInStaticImport6180 = new BitSet(new long[]{0xD000002000000012L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred1_Xtend810 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ruleCreateExtensionInfo_in_synpred1_Xtend812 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred1_Xtend814 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_synpred1_Xtend816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred2_Xtend858 = new BitSet(new long[]{0xDFFFF1A052000010L,0x00000DFFF7FF8001L});
    public static final BitSet FOLLOW_ruleFunctionID_in_synpred2_Xtend860 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_synpred2_Xtend862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReferenceNoTypeArgs_in_synpred3_Xtend902 = new BitSet(new long[]{0xDFFFF1A052000010L,0x00000DFFF7FF8001L});
    public static final BitSet FOLLOW_ruleFunctionID_in_synpred3_Xtend904 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_synpred3_Xtend906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateExtensionInfo_in_synpred4_Xtend946 = new BitSet(new long[]{0xD000002000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred4_Xtend948 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_synpred4_Xtend950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred6_Xtend1991 = new BitSet(new long[]{0xDCFFF4398A000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleInnerVarID_in_synpred6_Xtend1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred7_Xtend2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred8_Xtend2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred9_Xtend2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred10_Xtend2176 = new BitSet(new long[]{0x0000000020000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_29_in_synpred10_Xtend2185 = new BitSet(new long[]{0xDFFFF5B98A000010L,0x0000000080000003L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred10_Xtend2187 = new BitSet(new long[]{0x0000000020000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_synpred10_Xtend2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_synpred11_Xtend2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred12_Xtend2336 = new BitSet(new long[]{0xDFFFF5B98A000010L,0x0000000080000003L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred12_Xtend2338 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_synpred12_Xtend2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred13_Xtend2379 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_synpred13_Xtend2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred14_Xtend2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred15_Xtend2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred16_Xtend2756 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred16_Xtend2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_synpred19_Xtend2879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_synpred19_Xtend2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_synpred20_Xtend2968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_synpred20_Xtend2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred21_Xtend3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred22_Xtend3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred23_Xtend3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred24_Xtend3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_synpred25_Xtend3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred26_Xtend3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred27_Xtend3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred28_Xtend3500 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_synpred28_Xtend3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred29_Xtend3549 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_synpred29_Xtend3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred30_Xtend3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred31_Xtend3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_synpred32_Xtend3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpPostfix_in_synpred33_Xtend3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred34_Xtend3862 = new BitSet(new long[]{0xDCFFF4B98A000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_synpred34_Xtend3880 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred34_Xtend3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred35_Xtend3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred36_Xtend4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred37_Xtend4065 = new BitSet(new long[]{0x0000000020000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_29_in_synpred37_Xtend4075 = new BitSet(new long[]{0xDFFFF5B98A000010L,0x0000000080000003L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred37_Xtend4077 = new BitSet(new long[]{0x0000000020000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_synpred37_Xtend4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_synpred38_Xtend4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred39_Xtend4199 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_synpred39_Xtend4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_synpred40_Xtend4235 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_synpred40_Xtend4237 = new BitSet(new long[]{0xDFFFF5B98A000010L,0x0000000080000003L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred40_Xtend4239 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_synpred40_Xtend4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_synpred41_Xtend4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred43_Xtend4470 = new BitSet(new long[]{0x0000000020000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_29_in_synpred43_Xtend4477 = new BitSet(new long[]{0xDFFFF5B98A000010L,0x0000000080000003L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred43_Xtend4479 = new BitSet(new long[]{0x0000000020000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_synpred43_Xtend4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_synpred45_Xtend4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred47_Xtend4954 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_synpred47_Xtend4969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred47_Xtend4975 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_set_in_synpred47_Xtend4977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred48_Xtend5055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred49_Xtend5085 = new BitSet(new long[]{0x0000000020000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_29_in_synpred49_Xtend5094 = new BitSet(new long[]{0xDFFFF5B98A000010L,0x0000000080000003L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred49_Xtend5096 = new BitSet(new long[]{0x0000000020000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_synpred49_Xtend5111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_synpred50_Xtend5163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred51_Xtend5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_synpred52_Xtend5593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_synpred53_Xtend5618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_synpred56_Xtend5745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_synpred57_Xtend5836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred58_Xtend5940 = new BitSet(new long[]{0x0000000000000002L});

}