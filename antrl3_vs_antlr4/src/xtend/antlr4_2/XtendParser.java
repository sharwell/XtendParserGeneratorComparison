// Generated from src/xtend/antlr4_2/Xtend.g4 by ANTLR 4.2.2

package xtend.antlr4_2; 

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XtendParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__104=1, T__103=2, T__102=3, T__101=4, T__100=5, T__99=6, T__98=7, T__97=8, 
		T__96=9, T__95=10, T__94=11, T__93=12, T__92=13, T__91=14, T__90=15, T__89=16, 
		T__88=17, T__87=18, T__86=19, T__85=20, T__84=21, T__83=22, T__82=23, 
		T__81=24, T__80=25, T__79=26, T__78=27, T__77=28, T__76=29, T__75=30, 
		T__74=31, T__73=32, T__72=33, T__71=34, T__70=35, T__69=36, T__68=37, 
		T__67=38, T__66=39, T__65=40, T__64=41, T__63=42, T__62=43, T__61=44, 
		T__60=45, T__59=46, T__58=47, T__57=48, T__56=49, T__55=50, T__54=51, 
		T__53=52, T__52=53, T__51=54, T__50=55, T__49=56, T__48=57, T__47=58, 
		T__46=59, T__45=60, T__44=61, T__43=62, T__42=63, T__41=64, T__40=65, 
		T__39=66, T__38=67, T__37=68, T__36=69, T__35=70, T__34=71, T__33=72, 
		T__32=73, T__31=74, T__30=75, T__29=76, T__28=77, T__27=78, T__26=79, 
		T__25=80, T__24=81, T__23=82, T__22=83, T__21=84, T__20=85, T__19=86, 
		T__18=87, T__17=88, T__16=89, T__15=90, T__14=91, T__13=92, T__12=93, 
		T__11=94, T__10=95, T__9=96, T__8=97, T__7=98, T__6=99, T__5=100, T__4=101, 
		T__3=102, T__2=103, T__1=104, T__0=105, RULE_ID=106, RULE_RICH_TEXT=107, 
		RULE_RICH_TEXT_START=108, RULE_RICH_TEXT_END=109, RULE_RICH_TEXT_INBETWEEN=110, 
		RULE_COMMENT_RICH_TEXT_INBETWEEN=111, RULE_COMMENT_RICH_TEXT_END=112, 
		RULE_HEX=113, RULE_INT=114, RULE_DECIMAL=115, RULE_STRING=116, RULE_ML_COMMENT=117, 
		RULE_SL_COMMENT=118, RULE_WS=119, RULE_ANY_OTHER=120;
	public static final String[] tokenNames = {
		"<INVALID>", "'interface'", "'*'", "'ELSEIF'", "'false'", "'IF'", "'abstract'", 
		"'}'", "'strictfp'", "'do'", "'*='", "')'", "'::'", "'throw'", "'@'", 
		"'dispatch'", "'typeof'", "'SEPARATOR'", "'null'", "'class'", "'|'", "'!'", 
		"'..'", "'-='", "','", "'while'", "'-'", "'if'", "'private'", "'?'", "'as'", 
		"'...'", "'+='", "'native'", "'final'", "'else'", "'true'", "'FOR'", "'++'", 
		"'?:'", "'import'", "'.'", "'+'", "'&&'", "'||'", "'>'", "'%='", "'/='", 
		"'switch'", "'/'", "'#'", "'instanceof'", "'BEFORE'", "'&'", "'['", "'--'", 
		"'<'", "'!=='", "'!='", "'ELSE'", "'ENDIF'", "'override'", "'case'", "'super'", 
		"'%'", "'->'", "'='", "'throws'", "'ENDFOR'", "'val'", "'new'", "'..<'", 
		"'finally'", "'transient'", "'enum'", "']'", "'public'", "'annotation'", 
		"'default'", "'synchronized'", "'**'", "'('", "':'", "'var'", "'try'", 
		"'package'", "'def'", "'{'", "'extends'", "'catch'", "'static'", "'=>'", 
		"'?.'", "'for'", "'protected'", "'<>'", "'create'", "'==='", "'return'", 
		"';'", "'volatile'", "'extension'", "'implements'", "'AFTER'", "'=='", 
		"'>='", "RULE_ID", "RULE_RICH_TEXT", "RULE_RICH_TEXT_START", "RULE_RICH_TEXT_END", 
		"RULE_RICH_TEXT_INBETWEEN", "RULE_COMMENT_RICH_TEXT_INBETWEEN", "RULE_COMMENT_RICH_TEXT_END", 
		"RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_STRING", "RULE_ML_COMMENT", 
		"RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
	};
	public static final int
		RULE_ruleFile = 0, RULE_ruleType = 1, RULE_ruleAnnotationField = 2, RULE_ruleMember = 3, 
		RULE_ruleTypeReferenceNoTypeArgs = 4, RULE_ruleFunctionID = 5, RULE_ruleOperators = 6, 
		RULE_ruleXtendEnumLiteral = 7, RULE_ruleCommonModifier = 8, RULE_ruleFieldModifier = 9, 
		RULE_ruleMethodModifier = 10, RULE_ruleCreateExtensionInfo = 11, RULE_ruleValidID = 12, 
		RULE_ruleFeatureCallID = 13, RULE_ruleInnerVarID = 14, RULE_ruleParameter = 15, 
		RULE_ruleXVariableDeclaration = 16, RULE_ruleXConstructorCall = 17, RULE_ruleXbaseConstructorCall = 18, 
		RULE_ruleJvmFormalParameter = 19, RULE_ruleFullJvmFormalParameter = 20, 
		RULE_ruleXStringLiteral = 21, RULE_ruleXSwitchExpression = 22, RULE_ruleXExpressionOrSimpleConstructorCall = 23, 
		RULE_ruleSimpleStringLiteral = 24, RULE_ruleRichString = 25, RULE_ruleRichStringLiteral = 26, 
		RULE_ruleRichStringLiteralStart = 27, RULE_ruleRichStringLiteralInbetween = 28, 
		RULE_ruleRichStringLiteralEnd = 29, RULE_ruleInternalRichString = 30, 
		RULE_ruleRichStringPart = 31, RULE_ruleRichStringForLoop = 32, RULE_ruleRichStringIf = 33, 
		RULE_ruleRichStringElseIf = 34, RULE_ruleXAnnotation = 35, RULE_ruleXAnnotationElementValuePair = 36, 
		RULE_ruleXAnnotationElementValueOrCommaList = 37, RULE_ruleXAnnotationElementValue = 38, 
		RULE_ruleXAnnotationOrExpression = 39, RULE_ruleXExpression = 40, RULE_ruleXAssignment = 41, 
		RULE_ruleOpSingleAssign = 42, RULE_ruleOpMultiAssign = 43, RULE_ruleXOrExpression = 44, 
		RULE_ruleOpOr = 45, RULE_ruleXAndExpression = 46, RULE_ruleOpAnd = 47, 
		RULE_ruleXEqualityExpression = 48, RULE_ruleOpEquality = 49, RULE_ruleXRelationalExpression = 50, 
		RULE_ruleOpCompare = 51, RULE_ruleXOtherOperatorExpression = 52, RULE_ruleOpOther = 53, 
		RULE_ruleXAdditiveExpression = 54, RULE_ruleOpAdd = 55, RULE_ruleXMultiplicativeExpression = 56, 
		RULE_ruleOpMulti = 57, RULE_ruleXUnaryOperation = 58, RULE_ruleOpUnary = 59, 
		RULE_ruleXCastedExpression = 60, RULE_ruleXPostfixOperation = 61, RULE_ruleOpPostfix = 62, 
		RULE_ruleXMemberFeatureCall = 63, RULE_ruleXPrimaryExpression = 64, RULE_ruleXLiteral = 65, 
		RULE_ruleXCollectionLiteral = 66, RULE_ruleXSetLiteral = 67, RULE_ruleXListLiteral = 68, 
		RULE_ruleXClosure = 69, RULE_ruleXExpressionInClosure = 70, RULE_ruleXShortClosure = 71, 
		RULE_ruleXParenthesizedExpression = 72, RULE_ruleXIfExpression = 73, RULE_ruleXCasePart = 74, 
		RULE_ruleXForLoopExpression = 75, RULE_ruleXBasicForLoopExpression = 76, 
		RULE_ruleXWhileExpression = 77, RULE_ruleXDoWhileExpression = 78, RULE_ruleXBlockExpression = 79, 
		RULE_ruleXExpressionOrVarDeclaration = 80, RULE_ruleXFeatureCall = 81, 
		RULE_ruleIdOrSuper = 82, RULE_ruleXBooleanLiteral = 83, RULE_ruleXNullLiteral = 84, 
		RULE_ruleXNumberLiteral = 85, RULE_ruleXTypeLiteral = 86, RULE_ruleXThrowExpression = 87, 
		RULE_ruleXReturnExpression = 88, RULE_ruleXTryCatchFinallyExpression = 89, 
		RULE_ruleXSynchronizedExpression = 90, RULE_ruleXCatchClause = 91, RULE_ruleQualifiedName = 92, 
		RULE_ruleNumber = 93, RULE_ruleJvmTypeReference = 94, RULE_ruleArrayBrackets = 95, 
		RULE_ruleXFunctionTypeRef = 96, RULE_ruleJvmParameterizedTypeReference = 97, 
		RULE_ruleJvmArgumentTypeReference = 98, RULE_ruleJvmWildcardTypeReference = 99, 
		RULE_ruleJvmUpperBound = 100, RULE_ruleJvmUpperBoundAnded = 101, RULE_ruleJvmLowerBound = 102, 
		RULE_ruleJvmTypeParameter = 103, RULE_ruleQualifiedNameWithWildcard = 104, 
		RULE_ruleXImportSection = 105, RULE_ruleXImportDeclaration = 106, RULE_ruleQualifiedNameInStaticImport = 107;
	public static final String[] ruleNames = {
		"ruleFile", "ruleType", "ruleAnnotationField", "ruleMember", "ruleTypeReferenceNoTypeArgs", 
		"ruleFunctionID", "ruleOperators", "ruleXtendEnumLiteral", "ruleCommonModifier", 
		"ruleFieldModifier", "ruleMethodModifier", "ruleCreateExtensionInfo", 
		"ruleValidID", "ruleFeatureCallID", "ruleInnerVarID", "ruleParameter", 
		"ruleXVariableDeclaration", "ruleXConstructorCall", "ruleXbaseConstructorCall", 
		"ruleJvmFormalParameter", "ruleFullJvmFormalParameter", "ruleXStringLiteral", 
		"ruleXSwitchExpression", "ruleXExpressionOrSimpleConstructorCall", "ruleSimpleStringLiteral", 
		"ruleRichString", "ruleRichStringLiteral", "ruleRichStringLiteralStart", 
		"ruleRichStringLiteralInbetween", "ruleRichStringLiteralEnd", "ruleInternalRichString", 
		"ruleRichStringPart", "ruleRichStringForLoop", "ruleRichStringIf", "ruleRichStringElseIf", 
		"ruleXAnnotation", "ruleXAnnotationElementValuePair", "ruleXAnnotationElementValueOrCommaList", 
		"ruleXAnnotationElementValue", "ruleXAnnotationOrExpression", "ruleXExpression", 
		"ruleXAssignment", "ruleOpSingleAssign", "ruleOpMultiAssign", "ruleXOrExpression", 
		"ruleOpOr", "ruleXAndExpression", "ruleOpAnd", "ruleXEqualityExpression", 
		"ruleOpEquality", "ruleXRelationalExpression", "ruleOpCompare", "ruleXOtherOperatorExpression", 
		"ruleOpOther", "ruleXAdditiveExpression", "ruleOpAdd", "ruleXMultiplicativeExpression", 
		"ruleOpMulti", "ruleXUnaryOperation", "ruleOpUnary", "ruleXCastedExpression", 
		"ruleXPostfixOperation", "ruleOpPostfix", "ruleXMemberFeatureCall", "ruleXPrimaryExpression", 
		"ruleXLiteral", "ruleXCollectionLiteral", "ruleXSetLiteral", "ruleXListLiteral", 
		"ruleXClosure", "ruleXExpressionInClosure", "ruleXShortClosure", "ruleXParenthesizedExpression", 
		"ruleXIfExpression", "ruleXCasePart", "ruleXForLoopExpression", "ruleXBasicForLoopExpression", 
		"ruleXWhileExpression", "ruleXDoWhileExpression", "ruleXBlockExpression", 
		"ruleXExpressionOrVarDeclaration", "ruleXFeatureCall", "ruleIdOrSuper", 
		"ruleXBooleanLiteral", "ruleXNullLiteral", "ruleXNumberLiteral", "ruleXTypeLiteral", 
		"ruleXThrowExpression", "ruleXReturnExpression", "ruleXTryCatchFinallyExpression", 
		"ruleXSynchronizedExpression", "ruleXCatchClause", "ruleQualifiedName", 
		"ruleNumber", "ruleJvmTypeReference", "ruleArrayBrackets", "ruleXFunctionTypeRef", 
		"ruleJvmParameterizedTypeReference", "ruleJvmArgumentTypeReference", "ruleJvmWildcardTypeReference", 
		"ruleJvmUpperBound", "ruleJvmUpperBoundAnded", "ruleJvmLowerBound", "ruleJvmTypeParameter", 
		"ruleQualifiedNameWithWildcard", "ruleXImportSection", "ruleXImportDeclaration", 
		"ruleQualifiedNameInStaticImport"
	};

	@Override
	public String getGrammarFileName() { return "Xtend.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XtendParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RuleFileContext extends ParserRuleContext {
		public RuleXImportSectionContext ruleXImportSection() {
			return getRuleContext(RuleXImportSectionContext.class,0);
		}
		public RuleTypeContext ruleType(int i) {
			return getRuleContext(RuleTypeContext.class,i);
		}
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public List<RuleTypeContext> ruleType() {
			return getRuleContexts(RuleTypeContext.class);
		}
		public RuleFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleFile(this);
		}
	}

	public final RuleFileContext ruleFile() throws RecognitionException {
		RuleFileContext _localctx = new RuleFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ruleFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(216); match(85);
				setState(217); ruleQualifiedName();
				setState(219);
				_la = _input.LA(1);
				if (_la==99) {
					{
					setState(218); match(99);
					}
				}

				}
				break;
			}
			setState(224);
			_la = _input.LA(1);
			if (_la==40) {
				{
				setState(223); ruleXImportSection();
				}
			}

			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 8) | (1L << 14) | (1L << 15) | (1L << 19) | (1L << 28) | (1L << 33) | (1L << 34))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (73 - 73)) | (1L << (74 - 73)) | (1L << (76 - 73)) | (1L << (77 - 73)) | (1L << (79 - 73)) | (1L << (85 - 73)) | (1L << (90 - 73)) | (1L << (94 - 73)) | (1L << (100 - 73)))) != 0)) {
				{
				{
				setState(226); ruleType();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleTypeContext extends ParserRuleContext {
		public List<RuleCommonModifierContext> ruleCommonModifier() {
			return getRuleContexts(RuleCommonModifierContext.class);
		}
		public List<RuleJvmParameterizedTypeReferenceContext> ruleJvmParameterizedTypeReference() {
			return getRuleContexts(RuleJvmParameterizedTypeReferenceContext.class);
		}
		public RuleXtendEnumLiteralContext ruleXtendEnumLiteral(int i) {
			return getRuleContext(RuleXtendEnumLiteralContext.class,i);
		}
		public RuleJvmParameterizedTypeReferenceContext ruleJvmParameterizedTypeReference(int i) {
			return getRuleContext(RuleJvmParameterizedTypeReferenceContext.class,i);
		}
		public RuleAnnotationFieldContext ruleAnnotationField(int i) {
			return getRuleContext(RuleAnnotationFieldContext.class,i);
		}
		public RuleValidIDContext ruleValidID() {
			return getRuleContext(RuleValidIDContext.class,0);
		}
		public RuleCommonModifierContext ruleCommonModifier(int i) {
			return getRuleContext(RuleCommonModifierContext.class,i);
		}
		public List<RuleXAnnotationContext> ruleXAnnotation() {
			return getRuleContexts(RuleXAnnotationContext.class);
		}
		public RuleMemberContext ruleMember(int i) {
			return getRuleContext(RuleMemberContext.class,i);
		}
		public List<RuleAnnotationFieldContext> ruleAnnotationField() {
			return getRuleContexts(RuleAnnotationFieldContext.class);
		}
		public RuleJvmTypeParameterContext ruleJvmTypeParameter(int i) {
			return getRuleContext(RuleJvmTypeParameterContext.class,i);
		}
		public List<RuleMemberContext> ruleMember() {
			return getRuleContexts(RuleMemberContext.class);
		}
		public RuleXAnnotationContext ruleXAnnotation(int i) {
			return getRuleContext(RuleXAnnotationContext.class,i);
		}
		public List<RuleJvmTypeParameterContext> ruleJvmTypeParameter() {
			return getRuleContexts(RuleJvmTypeParameterContext.class);
		}
		public List<RuleXtendEnumLiteralContext> ruleXtendEnumLiteral() {
			return getRuleContexts(RuleXtendEnumLiteralContext.class);
		}
		public RuleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleType(this);
		}
	}

	public final RuleTypeContext ruleType() throws RecognitionException {
		RuleTypeContext _localctx = new RuleTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ruleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==14) {
				{
				{
				setState(232); ruleXAnnotation();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 34))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (73 - 73)) | (1L << (76 - 73)) | (1L << (79 - 73)) | (1L << (85 - 73)) | (1L << (90 - 73)) | (1L << (94 - 73)) | (1L << (100 - 73)))) != 0)) {
					{
					{
					setState(238); ruleCommonModifier();
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(244); match(19);
				setState(245); ruleValidID();
				setState(257);
				_la = _input.LA(1);
				if (_la==56) {
					{
					setState(246); match(56);
					setState(247); ruleJvmTypeParameter();
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(248); match(24);
						setState(249); ruleJvmTypeParameter();
						}
						}
						setState(254);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(255); match(45);
					}
				}

				setState(261);
				_la = _input.LA(1);
				if (_la==88) {
					{
					setState(259); match(88);
					setState(260); ruleJvmParameterizedTypeReference();
					}
				}

				setState(272);
				_la = _input.LA(1);
				if (_la==102) {
					{
					setState(263); match(102);
					setState(264); ruleJvmParameterizedTypeReference();
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(265); match(24);
						setState(266); ruleJvmParameterizedTypeReference();
						}
						}
						setState(271);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(274); match(87);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 8) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << 19) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 52) | (1L << 61))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (70 - 69)) | (1L << (73 - 69)) | (1L << (74 - 69)) | (1L << (76 - 69)) | (1L << (77 - 69)) | (1L << (79 - 69)) | (1L << (81 - 69)) | (1L << (83 - 69)) | (1L << (85 - 69)) | (1L << (86 - 69)) | (1L << (90 - 69)) | (1L << (91 - 69)) | (1L << (94 - 69)) | (1L << (96 - 69)) | (1L << (100 - 69)) | (1L << (101 - 69)) | (1L << (103 - 69)) | (1L << (RULE_ID - 69)))) != 0)) {
					{
					{
					setState(275); ruleMember();
					}
					}
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(281); match(7);
				}
				break;

			case 2:
				{
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 34))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (73 - 73)) | (1L << (76 - 73)) | (1L << (79 - 73)) | (1L << (85 - 73)) | (1L << (90 - 73)) | (1L << (94 - 73)) | (1L << (100 - 73)))) != 0)) {
					{
					{
					setState(283); ruleCommonModifier();
					}
					}
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(289); match(1);
				setState(290); ruleValidID();
				setState(302);
				_la = _input.LA(1);
				if (_la==56) {
					{
					setState(291); match(56);
					setState(292); ruleJvmTypeParameter();
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(293); match(24);
						setState(294); ruleJvmTypeParameter();
						}
						}
						setState(299);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(300); match(45);
					}
				}

				setState(313);
				_la = _input.LA(1);
				if (_la==88) {
					{
					setState(304); match(88);
					setState(305); ruleJvmParameterizedTypeReference();
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(306); match(24);
						setState(307); ruleJvmParameterizedTypeReference();
						}
						}
						setState(312);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(315); match(87);
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 8) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << 19) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 52) | (1L << 61))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (70 - 69)) | (1L << (73 - 69)) | (1L << (74 - 69)) | (1L << (76 - 69)) | (1L << (77 - 69)) | (1L << (79 - 69)) | (1L << (81 - 69)) | (1L << (83 - 69)) | (1L << (85 - 69)) | (1L << (86 - 69)) | (1L << (90 - 69)) | (1L << (91 - 69)) | (1L << (94 - 69)) | (1L << (96 - 69)) | (1L << (100 - 69)) | (1L << (101 - 69)) | (1L << (103 - 69)) | (1L << (RULE_ID - 69)))) != 0)) {
					{
					{
					setState(316); ruleMember();
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(322); match(7);
				}
				break;

			case 3:
				{
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 34))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (73 - 73)) | (1L << (76 - 73)) | (1L << (79 - 73)) | (1L << (85 - 73)) | (1L << (90 - 73)) | (1L << (94 - 73)) | (1L << (100 - 73)))) != 0)) {
					{
					{
					setState(324); ruleCommonModifier();
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(330); match(74);
				setState(331); ruleValidID();
				setState(332); match(87);
				setState(341);
				_la = _input.LA(1);
				if (_la==17 || _la==52 || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (77 - 77)) | (1L << (96 - 77)) | (1L << (103 - 77)) | (1L << (RULE_ID - 77)))) != 0)) {
					{
					setState(333); ruleXtendEnumLiteral();
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(334); match(24);
						setState(335); ruleXtendEnumLiteral();
						}
						}
						setState(340);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(344);
				_la = _input.LA(1);
				if (_la==99) {
					{
					setState(343); match(99);
					}
				}

				setState(346); match(7);
				}
				break;

			case 4:
				{
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 34))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (73 - 73)) | (1L << (76 - 73)) | (1L << (79 - 73)) | (1L << (85 - 73)) | (1L << (90 - 73)) | (1L << (94 - 73)) | (1L << (100 - 73)))) != 0)) {
					{
					{
					setState(348); ruleCommonModifier();
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(354); match(77);
				setState(355); ruleValidID();
				setState(356); match(87);
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 8) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << 19) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 52))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (73 - 69)) | (1L << (74 - 69)) | (1L << (76 - 69)) | (1L << (77 - 69)) | (1L << (79 - 69)) | (1L << (81 - 69)) | (1L << (83 - 69)) | (1L << (85 - 69)) | (1L << (90 - 69)) | (1L << (91 - 69)) | (1L << (94 - 69)) | (1L << (96 - 69)) | (1L << (100 - 69)) | (1L << (103 - 69)) | (1L << (RULE_ID - 69)))) != 0)) {
					{
					{
					setState(357); ruleAnnotationField();
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(363); match(7);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleAnnotationFieldContext extends ParserRuleContext {
		public RuleJvmTypeReferenceContext ruleJvmTypeReference() {
			return getRuleContext(RuleJvmTypeReferenceContext.class,0);
		}
		public RuleXAnnotationElementValueContext ruleXAnnotationElementValue() {
			return getRuleContext(RuleXAnnotationElementValueContext.class,0);
		}
		public List<RuleCommonModifierContext> ruleCommonModifier() {
			return getRuleContexts(RuleCommonModifierContext.class);
		}
		public List<RuleJvmParameterizedTypeReferenceContext> ruleJvmParameterizedTypeReference() {
			return getRuleContexts(RuleJvmParameterizedTypeReferenceContext.class);
		}
		public RuleXtendEnumLiteralContext ruleXtendEnumLiteral(int i) {
			return getRuleContext(RuleXtendEnumLiteralContext.class,i);
		}
		public RuleFieldModifierContext ruleFieldModifier() {
			return getRuleContext(RuleFieldModifierContext.class,0);
		}
		public RuleJvmParameterizedTypeReferenceContext ruleJvmParameterizedTypeReference(int i) {
			return getRuleContext(RuleJvmParameterizedTypeReferenceContext.class,i);
		}
		public RuleAnnotationFieldContext ruleAnnotationField(int i) {
			return getRuleContext(RuleAnnotationFieldContext.class,i);
		}
		public RuleValidIDContext ruleValidID() {
			return getRuleContext(RuleValidIDContext.class,0);
		}
		public RuleCommonModifierContext ruleCommonModifier(int i) {
			return getRuleContext(RuleCommonModifierContext.class,i);
		}
		public RuleMemberContext ruleMember(int i) {
			return getRuleContext(RuleMemberContext.class,i);
		}
		public List<RuleXAnnotationContext> ruleXAnnotation() {
			return getRuleContexts(RuleXAnnotationContext.class);
		}
		public List<RuleAnnotationFieldContext> ruleAnnotationField() {
			return getRuleContexts(RuleAnnotationFieldContext.class);
		}
		public RuleJvmTypeParameterContext ruleJvmTypeParameter(int i) {
			return getRuleContext(RuleJvmTypeParameterContext.class,i);
		}
		public List<RuleMemberContext> ruleMember() {
			return getRuleContexts(RuleMemberContext.class);
		}
		public RuleXAnnotationContext ruleXAnnotation(int i) {
			return getRuleContext(RuleXAnnotationContext.class,i);
		}
		public List<RuleJvmTypeParameterContext> ruleJvmTypeParameter() {
			return getRuleContexts(RuleJvmTypeParameterContext.class);
		}
		public List<RuleXtendEnumLiteralContext> ruleXtendEnumLiteral() {
			return getRuleContexts(RuleXtendEnumLiteralContext.class);
		}
		public RuleAnnotationFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleAnnotationField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleAnnotationField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleAnnotationField(this);
		}
	}

	public final RuleAnnotationFieldContext ruleAnnotationField() throws RecognitionException {
		RuleAnnotationFieldContext _localctx = new RuleAnnotationFieldContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ruleAnnotationField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==14) {
				{
				{
				setState(367); ruleXAnnotation();
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(536);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(400);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(376);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 34))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (73 - 73)) | (1L << (76 - 73)) | (1L << (79 - 73)) | (1L << (85 - 73)) | (1L << (90 - 73)) | (1L << (94 - 73)) | (1L << (100 - 73)))) != 0)) {
						{
						{
						setState(373); ruleCommonModifier();
						}
						}
						setState(378);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(379); ruleFieldModifier();
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 34))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (73 - 73)) | (1L << (76 - 73)) | (1L << (79 - 73)) | (1L << (85 - 73)) | (1L << (90 - 73)) | (1L << (94 - 73)) | (1L << (100 - 73)))) != 0)) {
						{
						{
						setState(380); ruleCommonModifier();
						}
						}
						setState(385);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(387);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(386); ruleJvmTypeReference();
						}
						break;
					}
					setState(389); ruleValidID();
					}
					break;

				case 2:
					{
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 34))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (73 - 73)) | (1L << (76 - 73)) | (1L << (79 - 73)) | (1L << (85 - 73)) | (1L << (90 - 73)) | (1L << (94 - 73)) | (1L << (100 - 73)))) != 0)) {
						{
						{
						setState(391); ruleCommonModifier();
						}
						}
						setState(396);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(397); ruleJvmTypeReference();
					setState(398); ruleValidID();
					}
					break;
				}
				setState(404);
				_la = _input.LA(1);
				if (_la==66) {
					{
					setState(402); match(66);
					setState(403); ruleXAnnotationElementValue();
					}
				}

				setState(407);
				_la = _input.LA(1);
				if (_la==99) {
					{
					setState(406); match(99);
					}
				}

				}
				break;

			case 2:
				{
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 34))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (73 - 73)) | (1L << (76 - 73)) | (1L << (79 - 73)) | (1L << (85 - 73)) | (1L << (90 - 73)) | (1L << (94 - 73)) | (1L << (100 - 73)))) != 0)) {
					{
					{
					setState(409); ruleCommonModifier();
					}
					}
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(415); match(19);
				setState(416); ruleValidID();
				setState(428);
				_la = _input.LA(1);
				if (_la==56) {
					{
					setState(417); match(56);
					setState(418); ruleJvmTypeParameter();
					setState(423);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(419); match(24);
						setState(420); ruleJvmTypeParameter();
						}
						}
						setState(425);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(426); match(45);
					}
				}

				setState(432);
				_la = _input.LA(1);
				if (_la==88) {
					{
					setState(430); match(88);
					setState(431); ruleJvmParameterizedTypeReference();
					}
				}

				setState(443);
				_la = _input.LA(1);
				if (_la==102) {
					{
					setState(434); match(102);
					setState(435); ruleJvmParameterizedTypeReference();
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(436); match(24);
						setState(437); ruleJvmParameterizedTypeReference();
						}
						}
						setState(442);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(445); match(87);
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 8) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << 19) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 52) | (1L << 61))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (70 - 69)) | (1L << (73 - 69)) | (1L << (74 - 69)) | (1L << (76 - 69)) | (1L << (77 - 69)) | (1L << (79 - 69)) | (1L << (81 - 69)) | (1L << (83 - 69)) | (1L << (85 - 69)) | (1L << (86 - 69)) | (1L << (90 - 69)) | (1L << (91 - 69)) | (1L << (94 - 69)) | (1L << (96 - 69)) | (1L << (100 - 69)) | (1L << (101 - 69)) | (1L << (103 - 69)) | (1L << (RULE_ID - 69)))) != 0)) {
					{
					{
					setState(446); ruleMember();
					}
					}
					setState(451);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(452); match(7);
				}
				break;

			case 3:
				{
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 34))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (73 - 73)) | (1L << (76 - 73)) | (1L << (79 - 73)) | (1L << (85 - 73)) | (1L << (90 - 73)) | (1L << (94 - 73)) | (1L << (100 - 73)))) != 0)) {
					{
					{
					setState(454); ruleCommonModifier();
					}
					}
					setState(459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(460); match(1);
				setState(461); ruleValidID();
				setState(473);
				_la = _input.LA(1);
				if (_la==56) {
					{
					setState(462); match(56);
					setState(463); ruleJvmTypeParameter();
					setState(468);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(464); match(24);
						setState(465); ruleJvmTypeParameter();
						}
						}
						setState(470);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(471); match(45);
					}
				}

				setState(484);
				_la = _input.LA(1);
				if (_la==88) {
					{
					setState(475); match(88);
					setState(476); ruleJvmParameterizedTypeReference();
					setState(481);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(477); match(24);
						setState(478); ruleJvmParameterizedTypeReference();
						}
						}
						setState(483);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(486); match(87);
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 8) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << 19) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 52) | (1L << 61))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (70 - 69)) | (1L << (73 - 69)) | (1L << (74 - 69)) | (1L << (76 - 69)) | (1L << (77 - 69)) | (1L << (79 - 69)) | (1L << (81 - 69)) | (1L << (83 - 69)) | (1L << (85 - 69)) | (1L << (86 - 69)) | (1L << (90 - 69)) | (1L << (91 - 69)) | (1L << (94 - 69)) | (1L << (96 - 69)) | (1L << (100 - 69)) | (1L << (101 - 69)) | (1L << (103 - 69)) | (1L << (RULE_ID - 69)))) != 0)) {
					{
					{
					setState(487); ruleMember();
					}
					}
					setState(492);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(493); match(7);
				}
				break;

			case 4:
				{
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 34))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (73 - 73)) | (1L << (76 - 73)) | (1L << (79 - 73)) | (1L << (85 - 73)) | (1L << (90 - 73)) | (1L << (94 - 73)) | (1L << (100 - 73)))) != 0)) {
					{
					{
					setState(495); ruleCommonModifier();
					}
					}
					setState(500);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(501); match(74);
				setState(502); ruleValidID();
				setState(503); match(87);
				setState(512);
				_la = _input.LA(1);
				if (_la==17 || _la==52 || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (77 - 77)) | (1L << (96 - 77)) | (1L << (103 - 77)) | (1L << (RULE_ID - 77)))) != 0)) {
					{
					setState(504); ruleXtendEnumLiteral();
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(505); match(24);
						setState(506); ruleXtendEnumLiteral();
						}
						}
						setState(511);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(515);
				_la = _input.LA(1);
				if (_la==99) {
					{
					setState(514); match(99);
					}
				}

				setState(517); match(7);
				}
				break;

			case 5:
				{
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 34))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (73 - 73)) | (1L << (76 - 73)) | (1L << (79 - 73)) | (1L << (85 - 73)) | (1L << (90 - 73)) | (1L << (94 - 73)) | (1L << (100 - 73)))) != 0)) {
					{
					{
					setState(519); ruleCommonModifier();
					}
					}
					setState(524);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(525); match(77);
				setState(526); ruleValidID();
				setState(527); match(87);
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 8) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << 19) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 52))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (73 - 69)) | (1L << (74 - 69)) | (1L << (76 - 69)) | (1L << (77 - 69)) | (1L << (79 - 69)) | (1L << (81 - 69)) | (1L << (83 - 69)) | (1L << (85 - 69)) | (1L << (90 - 69)) | (1L << (91 - 69)) | (1L << (94 - 69)) | (1L << (96 - 69)) | (1L << (100 - 69)) | (1L << (103 - 69)) | (1L << (RULE_ID - 69)))) != 0)) {
					{
					{
					setState(528); ruleAnnotationField();
					}
					}
					setState(533);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(534); match(7);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleMemberContext extends ParserRuleContext {
		public List<RuleJvmTypeReferenceContext> ruleJvmTypeReference() {
			return getRuleContexts(RuleJvmTypeReferenceContext.class);
		}
		public RuleXExpressionContext ruleXExpression() {
			return getRuleContext(RuleXExpressionContext.class,0);
		}
		public RuleTypeReferenceNoTypeArgsContext ruleTypeReferenceNoTypeArgs() {
			return getRuleContext(RuleTypeReferenceNoTypeArgsContext.class,0);
		}
		public RuleCreateExtensionInfoContext ruleCreateExtensionInfo() {
			return getRuleContext(RuleCreateExtensionInfoContext.class,0);
		}
		public RuleMethodModifierContext ruleMethodModifier(int i) {
			return getRuleContext(RuleMethodModifierContext.class,i);
		}
		public RuleJvmTypeReferenceContext ruleJvmTypeReference(int i) {
			return getRuleContext(RuleJvmTypeReferenceContext.class,i);
		}
		public RuleXtendEnumLiteralContext ruleXtendEnumLiteral(int i) {
			return getRuleContext(RuleXtendEnumLiteralContext.class,i);
		}
		public List<RuleFieldModifierContext> ruleFieldModifier() {
			return getRuleContexts(RuleFieldModifierContext.class);
		}
		public RuleAnnotationFieldContext ruleAnnotationField(int i) {
			return getRuleContext(RuleAnnotationFieldContext.class,i);
		}
		public RuleCommonModifierContext ruleCommonModifier(int i) {
			return getRuleContext(RuleCommonModifierContext.class,i);
		}
		public List<RuleXAnnotationContext> ruleXAnnotation() {
			return getRuleContexts(RuleXAnnotationContext.class);
		}
		public RuleMemberContext ruleMember(int i) {
			return getRuleContext(RuleMemberContext.class,i);
		}
		public RuleFieldModifierContext ruleFieldModifier(int i) {
			return getRuleContext(RuleFieldModifierContext.class,i);
		}
		public RuleParameterContext ruleParameter(int i) {
			return getRuleContext(RuleParameterContext.class,i);
		}
		public List<RuleMemberContext> ruleMember() {
			return getRuleContexts(RuleMemberContext.class);
		}
		public List<RuleJvmTypeParameterContext> ruleJvmTypeParameter() {
			return getRuleContexts(RuleJvmTypeParameterContext.class);
		}
		public List<RuleXtendEnumLiteralContext> ruleXtendEnumLiteral() {
			return getRuleContexts(RuleXtendEnumLiteralContext.class);
		}
		public List<RuleCommonModifierContext> ruleCommonModifier() {
			return getRuleContexts(RuleCommonModifierContext.class);
		}
		public RuleFunctionIDContext ruleFunctionID() {
			return getRuleContext(RuleFunctionIDContext.class,0);
		}
		public RuleRichStringContext ruleRichString() {
			return getRuleContext(RuleRichStringContext.class,0);
		}
		public List<RuleJvmParameterizedTypeReferenceContext> ruleJvmParameterizedTypeReference() {
			return getRuleContexts(RuleJvmParameterizedTypeReferenceContext.class);
		}
		public RuleJvmParameterizedTypeReferenceContext ruleJvmParameterizedTypeReference(int i) {
			return getRuleContext(RuleJvmParameterizedTypeReferenceContext.class,i);
		}
		public RuleValidIDContext ruleValidID() {
			return getRuleContext(RuleValidIDContext.class,0);
		}
		public List<RuleParameterContext> ruleParameter() {
			return getRuleContexts(RuleParameterContext.class);
		}
		public List<RuleAnnotationFieldContext> ruleAnnotationField() {
			return getRuleContexts(RuleAnnotationFieldContext.class);
		}
		public RuleJvmTypeParameterContext ruleJvmTypeParameter(int i) {
			return getRuleContext(RuleJvmTypeParameterContext.class,i);
		}
		public RuleXAnnotationContext ruleXAnnotation(int i) {
			return getRuleContext(RuleXAnnotationContext.class,i);
		}
		public RuleXBlockExpressionContext ruleXBlockExpression() {
			return getRuleContext(RuleXBlockExpressionContext.class,0);
		}
		public List<RuleMethodModifierContext> ruleMethodModifier() {
			return getRuleContexts(RuleMethodModifierContext.class);
		}
		public RuleMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleMember(this);
		}
	}

	public final RuleMemberContext ruleMember() throws RecognitionException {
		RuleMemberContext _localctx = new RuleMemberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ruleMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==14) {
				{
				{
				setState(538); ruleXAnnotation();
				}
				}
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(851);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 34))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (73 - 73)) | (1L << (76 - 73)) | (1L << (79 - 73)) | (1L << (85 - 73)) | (1L << (90 - 73)) | (1L << (94 - 73)) | (1L << (100 - 73)))) != 0)) {
					{
					{
					setState(544); ruleCommonModifier();
					}
					}
					setState(549);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(595);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(550); ruleFieldModifier();
					setState(554);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 34))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (73 - 73)) | (1L << (76 - 73)) | (1L << (79 - 73)) | (1L << (85 - 73)) | (1L << (90 - 73)) | (1L << (94 - 73)) | (1L << (100 - 73)))) != 0)) {
						{
						{
						setState(551); ruleCommonModifier();
						}
						}
						setState(556);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(558);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						setState(557); ruleJvmTypeReference();
						}
						break;
					}
					setState(560); ruleValidID();
					}
					break;

				case 2:
					{
					setState(562); match(101);
					setState(567);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 34))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (73 - 69)) | (1L << (76 - 69)) | (1L << (79 - 69)) | (1L << (83 - 69)) | (1L << (85 - 69)) | (1L << (90 - 69)) | (1L << (94 - 69)) | (1L << (100 - 69)))) != 0)) {
						{
						setState(565);
						switch (_input.LA(1)) {
						case 69:
						case 83:
							{
							setState(563); ruleFieldModifier();
							}
							break;
						case 6:
						case 8:
						case 15:
						case 28:
						case 33:
						case 34:
						case 73:
						case 76:
						case 79:
						case 85:
						case 90:
						case 94:
						case 100:
							{
							setState(564); ruleCommonModifier();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(569);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(570); ruleJvmTypeReference();
					setState(572);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						setState(571); ruleValidID();
						}
						break;
					}
					}
					break;

				case 3:
					{
					setState(574); ruleFieldModifier();
					setState(578);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 34))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (73 - 73)) | (1L << (76 - 73)) | (1L << (79 - 73)) | (1L << (85 - 73)) | (1L << (90 - 73)) | (1L << (94 - 73)) | (1L << (100 - 73)))) != 0)) {
						{
						{
						setState(575); ruleCommonModifier();
						}
						}
						setState(580);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(581); match(101);
					setState(585);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 34))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (73 - 73)) | (1L << (76 - 73)) | (1L << (79 - 73)) | (1L << (85 - 73)) | (1L << (90 - 73)) | (1L << (94 - 73)) | (1L << (100 - 73)))) != 0)) {
						{
						{
						setState(582); ruleCommonModifier();
						}
						}
						setState(587);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(588); ruleJvmTypeReference();
					setState(590);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(589); ruleValidID();
						}
						break;
					}
					}
					break;

				case 4:
					{
					setState(592); ruleJvmTypeReference();
					setState(593); ruleValidID();
					}
					break;
				}
				setState(599);
				_la = _input.LA(1);
				if (_la==66) {
					{
					setState(597); match(66);
					setState(598); ruleXExpression();
					}
				}

				setState(602);
				_la = _input.LA(1);
				if (_la==99) {
					{
					setState(601); match(99);
					}
				}

				}
				break;

			case 2:
				{
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 34))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (73 - 73)) | (1L << (76 - 73)) | (1L << (79 - 73)) | (1L << (85 - 73)) | (1L << (90 - 73)) | (1L << (94 - 73)) | (1L << (100 - 73)))) != 0)) {
					{
					{
					setState(604); ruleCommonModifier();
					}
					}
					setState(609);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(610); ruleMethodModifier();
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 61))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (73 - 73)) | (1L << (76 - 73)) | (1L << (79 - 73)) | (1L << (85 - 73)) | (1L << (86 - 73)) | (1L << (90 - 73)) | (1L << (94 - 73)) | (1L << (100 - 73)))) != 0)) {
					{
					setState(613);
					switch (_input.LA(1)) {
					case 6:
					case 8:
					case 15:
					case 28:
					case 33:
					case 34:
					case 73:
					case 76:
					case 79:
					case 85:
					case 90:
					case 94:
					case 100:
						{
						setState(611); ruleCommonModifier();
						}
						break;
					case 61:
					case 86:
						{
						setState(612); ruleMethodModifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(617);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(629);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(618); match(56);
					setState(619); ruleJvmTypeParameter();
					setState(624);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(620); match(24);
						setState(621); ruleJvmTypeParameter();
						}
						}
						setState(626);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(627); match(45);
					}
					break;
				}
				setState(651);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					{
					{
					setState(631); ruleJvmTypeReference();
					setState(632); ruleCreateExtensionInfo();
					setState(633); ruleValidID();
					setState(634); match(81);
					}
					}
					}
					break;

				case 2:
					{
					{
					{
					setState(636); ruleJvmTypeReference();
					setState(637); ruleFunctionID();
					setState(638); match(81);
					}
					}
					}
					break;

				case 3:
					{
					{
					{
					setState(640); ruleTypeReferenceNoTypeArgs();
					setState(641); ruleFunctionID();
					setState(642); match(81);
					}
					}
					}
					break;

				case 4:
					{
					{
					{
					setState(644); ruleCreateExtensionInfo();
					setState(645); ruleValidID();
					setState(646); match(81);
					}
					}
					}
					break;

				case 5:
					{
					setState(648); ruleFunctionID();
					setState(649); match(81);
					}
					break;
				}
				setState(661);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14) | (1L << 17) | (1L << 52))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (77 - 77)) | (1L << (81 - 77)) | (1L << (91 - 77)) | (1L << (96 - 77)) | (1L << (101 - 77)) | (1L << (103 - 77)) | (1L << (RULE_ID - 77)))) != 0)) {
					{
					setState(653); ruleParameter();
					setState(658);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(654); match(24);
						setState(655); ruleParameter();
						}
						}
						setState(660);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(663); match(11);
				setState(673);
				_la = _input.LA(1);
				if (_la==67) {
					{
					setState(664); match(67);
					setState(665); ruleJvmTypeReference();
					setState(670);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(666); match(24);
						setState(667); ruleJvmTypeReference();
						}
						}
						setState(672);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(678);
				switch (_input.LA(1)) {
				case 87:
					{
					setState(675); ruleXBlockExpression();
					}
					break;
				case RULE_RICH_TEXT:
				case RULE_RICH_TEXT_START:
					{
					setState(676); ruleRichString();
					}
					break;
				case 99:
					{
					setState(677); match(99);
					}
					break;
				case 1:
				case 6:
				case 7:
				case 8:
				case 14:
				case 15:
				case 17:
				case 19:
				case 28:
				case 33:
				case 34:
				case 52:
				case 61:
				case 69:
				case 70:
				case 73:
				case 74:
				case 76:
				case 77:
				case 79:
				case 81:
				case 83:
				case 85:
				case 86:
				case 90:
				case 91:
				case 94:
				case 96:
				case 100:
				case 101:
				case 103:
				case RULE_ID:
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 3:
				{
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 34))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (73 - 73)) | (1L << (76 - 73)) | (1L << (79 - 73)) | (1L << (85 - 73)) | (1L << (90 - 73)) | (1L << (94 - 73)) | (1L << (100 - 73)))) != 0)) {
					{
					{
					setState(680); ruleCommonModifier();
					}
					}
					setState(685);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(686); match(70);
				setState(698);
				_la = _input.LA(1);
				if (_la==56) {
					{
					setState(687); match(56);
					setState(688); ruleJvmTypeParameter();
					setState(693);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(689); match(24);
						setState(690); ruleJvmTypeParameter();
						}
						}
						setState(695);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(696); match(45);
					}
				}

				setState(700); match(81);
				setState(709);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14) | (1L << 17) | (1L << 52))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (77 - 77)) | (1L << (81 - 77)) | (1L << (91 - 77)) | (1L << (96 - 77)) | (1L << (101 - 77)) | (1L << (103 - 77)) | (1L << (RULE_ID - 77)))) != 0)) {
					{
					setState(701); ruleParameter();
					setState(706);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(702); match(24);
						setState(703); ruleParameter();
						}
						}
						setState(708);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(711); match(11);
				setState(721);
				_la = _input.LA(1);
				if (_la==67) {
					{
					setState(712); match(67);
					setState(713); ruleJvmTypeReference();
					setState(718);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(714); match(24);
						setState(715); ruleJvmTypeReference();
						}
						}
						setState(720);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(723); ruleXBlockExpression();
				}
				break;

			case 4:
				{
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 34))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (73 - 73)) | (1L << (76 - 73)) | (1L << (79 - 73)) | (1L << (85 - 73)) | (1L << (90 - 73)) | (1L << (94 - 73)) | (1L << (100 - 73)))) != 0)) {
					{
					{
					setState(724); ruleCommonModifier();
					}
					}
					setState(729);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(730); match(19);
				setState(731); ruleValidID();
				setState(743);
				_la = _input.LA(1);
				if (_la==56) {
					{
					setState(732); match(56);
					setState(733); ruleJvmTypeParameter();
					setState(738);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(734); match(24);
						setState(735); ruleJvmTypeParameter();
						}
						}
						setState(740);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(741); match(45);
					}
				}

				setState(747);
				_la = _input.LA(1);
				if (_la==88) {
					{
					setState(745); match(88);
					setState(746); ruleJvmParameterizedTypeReference();
					}
				}

				setState(758);
				_la = _input.LA(1);
				if (_la==102) {
					{
					setState(749); match(102);
					setState(750); ruleJvmParameterizedTypeReference();
					setState(755);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(751); match(24);
						setState(752); ruleJvmParameterizedTypeReference();
						}
						}
						setState(757);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(760); match(87);
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 8) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << 19) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 52) | (1L << 61))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (70 - 69)) | (1L << (73 - 69)) | (1L << (74 - 69)) | (1L << (76 - 69)) | (1L << (77 - 69)) | (1L << (79 - 69)) | (1L << (81 - 69)) | (1L << (83 - 69)) | (1L << (85 - 69)) | (1L << (86 - 69)) | (1L << (90 - 69)) | (1L << (91 - 69)) | (1L << (94 - 69)) | (1L << (96 - 69)) | (1L << (100 - 69)) | (1L << (101 - 69)) | (1L << (103 - 69)) | (1L << (RULE_ID - 69)))) != 0)) {
					{
					{
					setState(761); ruleMember();
					}
					}
					setState(766);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(767); match(7);
				}
				break;

			case 5:
				{
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 34))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (73 - 73)) | (1L << (76 - 73)) | (1L << (79 - 73)) | (1L << (85 - 73)) | (1L << (90 - 73)) | (1L << (94 - 73)) | (1L << (100 - 73)))) != 0)) {
					{
					{
					setState(769); ruleCommonModifier();
					}
					}
					setState(774);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(775); match(1);
				setState(776); ruleValidID();
				setState(788);
				_la = _input.LA(1);
				if (_la==56) {
					{
					setState(777); match(56);
					setState(778); ruleJvmTypeParameter();
					setState(783);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(779); match(24);
						setState(780); ruleJvmTypeParameter();
						}
						}
						setState(785);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(786); match(45);
					}
				}

				setState(799);
				_la = _input.LA(1);
				if (_la==88) {
					{
					setState(790); match(88);
					setState(791); ruleJvmParameterizedTypeReference();
					setState(796);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(792); match(24);
						setState(793); ruleJvmParameterizedTypeReference();
						}
						}
						setState(798);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(801); match(87);
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 8) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << 19) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 52) | (1L << 61))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (70 - 69)) | (1L << (73 - 69)) | (1L << (74 - 69)) | (1L << (76 - 69)) | (1L << (77 - 69)) | (1L << (79 - 69)) | (1L << (81 - 69)) | (1L << (83 - 69)) | (1L << (85 - 69)) | (1L << (86 - 69)) | (1L << (90 - 69)) | (1L << (91 - 69)) | (1L << (94 - 69)) | (1L << (96 - 69)) | (1L << (100 - 69)) | (1L << (101 - 69)) | (1L << (103 - 69)) | (1L << (RULE_ID - 69)))) != 0)) {
					{
					{
					setState(802); ruleMember();
					}
					}
					setState(807);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(808); match(7);
				}
				break;

			case 6:
				{
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 34))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (73 - 73)) | (1L << (76 - 73)) | (1L << (79 - 73)) | (1L << (85 - 73)) | (1L << (90 - 73)) | (1L << (94 - 73)) | (1L << (100 - 73)))) != 0)) {
					{
					{
					setState(810); ruleCommonModifier();
					}
					}
					setState(815);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(816); match(74);
				setState(817); ruleValidID();
				setState(818); match(87);
				setState(827);
				_la = _input.LA(1);
				if (_la==17 || _la==52 || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (77 - 77)) | (1L << (96 - 77)) | (1L << (103 - 77)) | (1L << (RULE_ID - 77)))) != 0)) {
					{
					setState(819); ruleXtendEnumLiteral();
					setState(824);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(820); match(24);
						setState(821); ruleXtendEnumLiteral();
						}
						}
						setState(826);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(830);
				_la = _input.LA(1);
				if (_la==99) {
					{
					setState(829); match(99);
					}
				}

				setState(832); match(7);
				}
				break;

			case 7:
				{
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 34))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (73 - 73)) | (1L << (76 - 73)) | (1L << (79 - 73)) | (1L << (85 - 73)) | (1L << (90 - 73)) | (1L << (94 - 73)) | (1L << (100 - 73)))) != 0)) {
					{
					{
					setState(834); ruleCommonModifier();
					}
					}
					setState(839);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(840); match(77);
				setState(841); ruleValidID();
				setState(842); match(87);
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 8) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << 19) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 52))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (73 - 69)) | (1L << (74 - 69)) | (1L << (76 - 69)) | (1L << (77 - 69)) | (1L << (79 - 69)) | (1L << (81 - 69)) | (1L << (83 - 69)) | (1L << (85 - 69)) | (1L << (90 - 69)) | (1L << (91 - 69)) | (1L << (94 - 69)) | (1L << (96 - 69)) | (1L << (100 - 69)) | (1L << (103 - 69)) | (1L << (RULE_ID - 69)))) != 0)) {
					{
					{
					setState(843); ruleAnnotationField();
					}
					}
					setState(848);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(849); match(7);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleTypeReferenceNoTypeArgsContext extends ParserRuleContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleTypeReferenceNoTypeArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleTypeReferenceNoTypeArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleTypeReferenceNoTypeArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleTypeReferenceNoTypeArgs(this);
		}
	}

	public final RuleTypeReferenceNoTypeArgsContext ruleTypeReferenceNoTypeArgs() throws RecognitionException {
		RuleTypeReferenceNoTypeArgsContext _localctx = new RuleTypeReferenceNoTypeArgsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ruleTypeReferenceNoTypeArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853); ruleQualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleFunctionIDContext extends ParserRuleContext {
		public RuleOperatorsContext ruleOperators() {
			return getRuleContext(RuleOperatorsContext.class,0);
		}
		public RuleValidIDContext ruleValidID() {
			return getRuleContext(RuleValidIDContext.class,0);
		}
		public RuleFunctionIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFunctionID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleFunctionID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleFunctionID(this);
		}
	}

	public final RuleFunctionIDContext ruleFunctionID() throws RecognitionException {
		RuleFunctionIDContext _localctx = new RuleFunctionIDContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ruleFunctionID);
		try {
			setState(857);
			switch (_input.LA(1)) {
			case 17:
			case 52:
			case 77:
			case 96:
			case 103:
			case RULE_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(855); ruleValidID();
				}
				break;
			case 2:
			case 10:
			case 21:
			case 22:
			case 23:
			case 26:
			case 32:
			case 38:
			case 39:
			case 42:
			case 43:
			case 44:
			case 45:
			case 46:
			case 47:
			case 49:
			case 55:
			case 56:
			case 57:
			case 58:
			case 64:
			case 65:
			case 71:
			case 80:
			case 91:
			case 95:
			case 97:
			case 104:
			case 105:
				enterOuterAlt(_localctx, 2);
				{
				setState(856); ruleOperators();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleOperatorsContext extends ParserRuleContext {
		public RuleOpPostfixContext ruleOpPostfix() {
			return getRuleContext(RuleOpPostfixContext.class,0);
		}
		public RuleOpAndContext ruleOpAnd() {
			return getRuleContext(RuleOpAndContext.class,0);
		}
		public RuleOpMultiAssignContext ruleOpMultiAssign() {
			return getRuleContext(RuleOpMultiAssignContext.class,0);
		}
		public RuleOpEqualityContext ruleOpEquality() {
			return getRuleContext(RuleOpEqualityContext.class,0);
		}
		public RuleOpMultiContext ruleOpMulti() {
			return getRuleContext(RuleOpMultiContext.class,0);
		}
		public RuleOpUnaryContext ruleOpUnary() {
			return getRuleContext(RuleOpUnaryContext.class,0);
		}
		public RuleOpOtherContext ruleOpOther() {
			return getRuleContext(RuleOpOtherContext.class,0);
		}
		public RuleOpOrContext ruleOpOr() {
			return getRuleContext(RuleOpOrContext.class,0);
		}
		public RuleOpCompareContext ruleOpCompare() {
			return getRuleContext(RuleOpCompareContext.class,0);
		}
		public RuleOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleOperators(this);
		}
	}

	public final RuleOperatorsContext ruleOperators() throws RecognitionException {
		RuleOperatorsContext _localctx = new RuleOperatorsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ruleOperators);
		try {
			setState(868);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(859); ruleOpMultiAssign();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(860); ruleOpOr();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(861); ruleOpAnd();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(862); ruleOpEquality();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(863); ruleOpCompare();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(864); ruleOpOther();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(865); ruleOpMulti();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(866); ruleOpUnary();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(867); ruleOpPostfix();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXtendEnumLiteralContext extends ParserRuleContext {
		public RuleValidIDContext ruleValidID() {
			return getRuleContext(RuleValidIDContext.class,0);
		}
		public RuleXtendEnumLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXtendEnumLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXtendEnumLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXtendEnumLiteral(this);
		}
	}

	public final RuleXtendEnumLiteralContext ruleXtendEnumLiteral() throws RecognitionException {
		RuleXtendEnumLiteralContext _localctx = new RuleXtendEnumLiteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ruleXtendEnumLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870); ruleValidID();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleCommonModifierContext extends ParserRuleContext {
		public RuleCommonModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleCommonModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleCommonModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleCommonModifier(this);
		}
	}

	public final RuleCommonModifierContext ruleCommonModifier() throws RecognitionException {
		RuleCommonModifierContext _localctx = new RuleCommonModifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ruleCommonModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 15) | (1L << 28) | (1L << 33) | (1L << 34))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (73 - 73)) | (1L << (76 - 73)) | (1L << (79 - 73)) | (1L << (85 - 73)) | (1L << (90 - 73)) | (1L << (94 - 73)) | (1L << (100 - 73)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleFieldModifierContext extends ParserRuleContext {
		public RuleFieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleFieldModifier(this);
		}
	}

	public final RuleFieldModifierContext ruleFieldModifier() throws RecognitionException {
		RuleFieldModifierContext _localctx = new RuleFieldModifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ruleFieldModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			_la = _input.LA(1);
			if ( !(_la==69 || _la==83) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleMethodModifierContext extends ParserRuleContext {
		public RuleMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleMethodModifier(this);
		}
	}

	public final RuleMethodModifierContext ruleMethodModifier() throws RecognitionException {
		RuleMethodModifierContext _localctx = new RuleMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ruleMethodModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			_la = _input.LA(1);
			if ( !(_la==61 || _la==86) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleCreateExtensionInfoContext extends ParserRuleContext {
		public RuleXExpressionContext ruleXExpression() {
			return getRuleContext(RuleXExpressionContext.class,0);
		}
		public RuleValidIDContext ruleValidID() {
			return getRuleContext(RuleValidIDContext.class,0);
		}
		public RuleCreateExtensionInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleCreateExtensionInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleCreateExtensionInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleCreateExtensionInfo(this);
		}
	}

	public final RuleCreateExtensionInfoContext ruleCreateExtensionInfo() throws RecognitionException {
		RuleCreateExtensionInfoContext _localctx = new RuleCreateExtensionInfoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ruleCreateExtensionInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878); match(96);
			setState(882);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(879); ruleValidID();
				setState(880); match(82);
				}
				break;
			}
			setState(884); ruleXExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleValidIDContext extends ParserRuleContext {
		public TerminalNode RULE_ID() { return getToken(XtendParser.RULE_ID, 0); }
		public RuleValidIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleValidID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleValidID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleValidID(this);
		}
	}

	public final RuleValidIDContext ruleValidID() throws RecognitionException {
		RuleValidIDContext _localctx = new RuleValidIDContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ruleValidID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			_la = _input.LA(1);
			if ( !(_la==17 || _la==52 || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (77 - 77)) | (1L << (96 - 77)) | (1L << (103 - 77)) | (1L << (RULE_ID - 77)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleFeatureCallIDContext extends ParserRuleContext {
		public RuleInnerVarIDContext ruleInnerVarID() {
			return getRuleContext(RuleInnerVarIDContext.class,0);
		}
		public RuleFeatureCallIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFeatureCallID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleFeatureCallID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleFeatureCallID(this);
		}
	}

	public final RuleFeatureCallIDContext ruleFeatureCallID() throws RecognitionException {
		RuleFeatureCallIDContext _localctx = new RuleFeatureCallIDContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ruleFeatureCallID);
		try {
			setState(890);
			switch (_input.LA(1)) {
			case 1:
			case 6:
			case 8:
			case 15:
			case 17:
			case 19:
			case 28:
			case 33:
			case 34:
			case 40:
			case 52:
			case 61:
			case 67:
			case 73:
			case 74:
			case 76:
			case 77:
			case 79:
			case 85:
			case 86:
			case 88:
			case 90:
			case 94:
			case 96:
			case 100:
			case 102:
			case 103:
			case RULE_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(888); ruleInnerVarID();
				}
				break;
			case 101:
				enterOuterAlt(_localctx, 2);
				{
				setState(889); match(101);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleInnerVarIDContext extends ParserRuleContext {
		public TerminalNode RULE_ID() { return getToken(XtendParser.RULE_ID, 0); }
		public RuleInnerVarIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleInnerVarID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleInnerVarID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleInnerVarID(this);
		}
	}

	public final RuleInnerVarIDContext ruleInnerVarID() throws RecognitionException {
		RuleInnerVarIDContext _localctx = new RuleInnerVarIDContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ruleInnerVarID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 8) | (1L << 15) | (1L << 17) | (1L << 19) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 40) | (1L << 52) | (1L << 61))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (67 - 67)) | (1L << (73 - 67)) | (1L << (74 - 67)) | (1L << (76 - 67)) | (1L << (77 - 67)) | (1L << (79 - 67)) | (1L << (85 - 67)) | (1L << (86 - 67)) | (1L << (88 - 67)) | (1L << (90 - 67)) | (1L << (94 - 67)) | (1L << (96 - 67)) | (1L << (100 - 67)) | (1L << (102 - 67)) | (1L << (103 - 67)) | (1L << (RULE_ID - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleParameterContext extends ParserRuleContext {
		public RuleJvmTypeReferenceContext ruleJvmTypeReference() {
			return getRuleContext(RuleJvmTypeReferenceContext.class,0);
		}
		public List<RuleXAnnotationContext> ruleXAnnotation() {
			return getRuleContexts(RuleXAnnotationContext.class);
		}
		public RuleXAnnotationContext ruleXAnnotation(int i) {
			return getRuleContext(RuleXAnnotationContext.class,i);
		}
		public RuleValidIDContext ruleValidID() {
			return getRuleContext(RuleValidIDContext.class,0);
		}
		public RuleParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleParameter(this);
		}
	}

	public final RuleParameterContext ruleParameter() throws RecognitionException {
		RuleParameterContext _localctx = new RuleParameterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ruleParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==14) {
				{
				{
				setState(894); ruleXAnnotation();
				}
				}
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(907);
			_la = _input.LA(1);
			if (_la==101) {
				{
				setState(900); match(101);
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==14) {
					{
					{
					setState(901); ruleXAnnotation();
					}
					}
					setState(906);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(909); ruleJvmTypeReference();
			setState(911);
			_la = _input.LA(1);
			if (_la==31) {
				{
				setState(910); match(31);
				}
			}

			setState(913); ruleValidID();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXVariableDeclarationContext extends ParserRuleContext {
		public RuleJvmTypeReferenceContext ruleJvmTypeReference() {
			return getRuleContext(RuleJvmTypeReferenceContext.class,0);
		}
		public RuleXExpressionContext ruleXExpression() {
			return getRuleContext(RuleXExpressionContext.class,0);
		}
		public RuleInnerVarIDContext ruleInnerVarID() {
			return getRuleContext(RuleInnerVarIDContext.class,0);
		}
		public RuleXVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXVariableDeclaration(this);
		}
	}

	public final RuleXVariableDeclarationContext ruleXVariableDeclaration() throws RecognitionException {
		RuleXVariableDeclarationContext _localctx = new RuleXVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ruleXVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(921);
			switch (_input.LA(1)) {
			case 69:
			case 83:
				{
				setState(915);
				_la = _input.LA(1);
				if ( !(_la==69 || _la==83) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(917);
				_la = _input.LA(1);
				if (_la==101) {
					{
					setState(916); match(101);
					}
				}

				}
				break;
			case 101:
				{
				setState(919); match(101);
				setState(920);
				_la = _input.LA(1);
				if ( !(_la==69 || _la==83) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(927);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				{
				{
				setState(923); ruleJvmTypeReference();
				setState(924); ruleInnerVarID();
				}
				}
				}
				break;

			case 2:
				{
				setState(926); ruleInnerVarID();
				}
				break;
			}
			setState(931);
			_la = _input.LA(1);
			if (_la==66) {
				{
				setState(929); match(66);
				setState(930); ruleXExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXConstructorCallContext extends ParserRuleContext {
		public RuleMemberContext ruleMember(int i) {
			return getRuleContext(RuleMemberContext.class,i);
		}
		public RuleXbaseConstructorCallContext ruleXbaseConstructorCall() {
			return getRuleContext(RuleXbaseConstructorCallContext.class,0);
		}
		public List<RuleMemberContext> ruleMember() {
			return getRuleContexts(RuleMemberContext.class);
		}
		public RuleXConstructorCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXConstructorCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXConstructorCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXConstructorCall(this);
		}
	}

	public final RuleXConstructorCallContext ruleXConstructorCall() throws RecognitionException {
		RuleXConstructorCallContext _localctx = new RuleXConstructorCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ruleXConstructorCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933); ruleXbaseConstructorCall();
			setState(942);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				{
				setState(934); match(87);
				}
				setState(938);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 8) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << 19) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 52) | (1L << 61))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (70 - 69)) | (1L << (73 - 69)) | (1L << (74 - 69)) | (1L << (76 - 69)) | (1L << (77 - 69)) | (1L << (79 - 69)) | (1L << (81 - 69)) | (1L << (83 - 69)) | (1L << (85 - 69)) | (1L << (86 - 69)) | (1L << (90 - 69)) | (1L << (91 - 69)) | (1L << (94 - 69)) | (1L << (96 - 69)) | (1L << (100 - 69)) | (1L << (101 - 69)) | (1L << (103 - 69)) | (1L << (RULE_ID - 69)))) != 0)) {
					{
					{
					setState(935); ruleMember();
					}
					}
					setState(940);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(941); match(7);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXbaseConstructorCallContext extends ParserRuleContext {
		public List<RuleXExpressionContext> ruleXExpression() {
			return getRuleContexts(RuleXExpressionContext.class);
		}
		public List<RuleJvmArgumentTypeReferenceContext> ruleJvmArgumentTypeReference() {
			return getRuleContexts(RuleJvmArgumentTypeReferenceContext.class);
		}
		public RuleXShortClosureContext ruleXShortClosure() {
			return getRuleContext(RuleXShortClosureContext.class,0);
		}
		public RuleXClosureContext ruleXClosure() {
			return getRuleContext(RuleXClosureContext.class,0);
		}
		public RuleJvmArgumentTypeReferenceContext ruleJvmArgumentTypeReference(int i) {
			return getRuleContext(RuleJvmArgumentTypeReferenceContext.class,i);
		}
		public RuleXExpressionContext ruleXExpression(int i) {
			return getRuleContext(RuleXExpressionContext.class,i);
		}
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleXbaseConstructorCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXbaseConstructorCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXbaseConstructorCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXbaseConstructorCall(this);
		}
	}

	public final RuleXbaseConstructorCallContext ruleXbaseConstructorCall() throws RecognitionException {
		RuleXbaseConstructorCallContext _localctx = new RuleXbaseConstructorCallContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ruleXbaseConstructorCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944); match(70);
			setState(945); ruleQualifiedName();
			setState(957);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				{
				setState(946); match(56);
				}
				setState(947); ruleJvmArgumentTypeReference();
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==24) {
					{
					{
					setState(948); match(24);
					setState(949); ruleJvmArgumentTypeReference();
					}
					}
					setState(954);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(955); match(45);
				}
				break;
			}
			setState(972);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				{
				setState(959); match(81);
				}
				setState(969);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					{
					setState(960); ruleXShortClosure();
					}
					}
					break;

				case 2:
					{
					setState(961); ruleXExpression();
					setState(966);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(962); match(24);
						setState(963); ruleXExpression();
						}
						}
						setState(968);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(971); match(11);
				}
				break;
			}
			setState(975);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(974); ruleXClosure();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleJvmFormalParameterContext extends ParserRuleContext {
		public RuleJvmTypeReferenceContext ruleJvmTypeReference() {
			return getRuleContext(RuleJvmTypeReferenceContext.class,0);
		}
		public RuleInnerVarIDContext ruleInnerVarID() {
			return getRuleContext(RuleInnerVarIDContext.class,0);
		}
		public RuleJvmFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleJvmFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleJvmFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleJvmFormalParameter(this);
		}
	}

	public final RuleJvmFormalParameterContext ruleJvmFormalParameter() throws RecognitionException {
		RuleJvmFormalParameterContext _localctx = new RuleJvmFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ruleJvmFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			_la = _input.LA(1);
			if (_la==101) {
				{
				setState(977); match(101);
				}
			}

			setState(981);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(980); ruleJvmTypeReference();
				}
				break;
			}
			setState(983); ruleInnerVarID();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleFullJvmFormalParameterContext extends ParserRuleContext {
		public RuleJvmTypeReferenceContext ruleJvmTypeReference() {
			return getRuleContext(RuleJvmTypeReferenceContext.class,0);
		}
		public RuleInnerVarIDContext ruleInnerVarID() {
			return getRuleContext(RuleInnerVarIDContext.class,0);
		}
		public RuleFullJvmFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFullJvmFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleFullJvmFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleFullJvmFormalParameter(this);
		}
	}

	public final RuleFullJvmFormalParameterContext ruleFullJvmFormalParameter() throws RecognitionException {
		RuleFullJvmFormalParameterContext _localctx = new RuleFullJvmFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ruleFullJvmFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			_la = _input.LA(1);
			if (_la==101) {
				{
				setState(985); match(101);
				}
			}

			setState(988); ruleJvmTypeReference();
			setState(989); ruleInnerVarID();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXStringLiteralContext extends ParserRuleContext {
		public RuleRichStringContext ruleRichString() {
			return getRuleContext(RuleRichStringContext.class,0);
		}
		public RuleSimpleStringLiteralContext ruleSimpleStringLiteral() {
			return getRuleContext(RuleSimpleStringLiteralContext.class,0);
		}
		public RuleXStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXStringLiteral(this);
		}
	}

	public final RuleXStringLiteralContext ruleXStringLiteral() throws RecognitionException {
		RuleXStringLiteralContext _localctx = new RuleXStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ruleXStringLiteral);
		try {
			setState(993);
			switch (_input.LA(1)) {
			case RULE_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(991); ruleSimpleStringLiteral();
				}
				break;
			case RULE_RICH_TEXT:
			case RULE_RICH_TEXT_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(992); ruleRichString();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXSwitchExpressionContext extends ParserRuleContext {
		public List<RuleXExpressionContext> ruleXExpression() {
			return getRuleContexts(RuleXExpressionContext.class);
		}
		public RuleXCasePartContext ruleXCasePart(int i) {
			return getRuleContext(RuleXCasePartContext.class,i);
		}
		public RuleJvmFormalParameterContext ruleJvmFormalParameter() {
			return getRuleContext(RuleJvmFormalParameterContext.class,0);
		}
		public List<RuleXCasePartContext> ruleXCasePart() {
			return getRuleContexts(RuleXCasePartContext.class);
		}
		public RuleXExpressionContext ruleXExpression(int i) {
			return getRuleContext(RuleXExpressionContext.class,i);
		}
		public RuleXExpressionOrSimpleConstructorCallContext ruleXExpressionOrSimpleConstructorCall() {
			return getRuleContext(RuleXExpressionOrSimpleConstructorCallContext.class,0);
		}
		public RuleXSwitchExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXSwitchExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXSwitchExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXSwitchExpression(this);
		}
	}

	public final RuleXSwitchExpressionContext ruleXSwitchExpression() throws RecognitionException {
		RuleXSwitchExpressionContext _localctx = new RuleXSwitchExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ruleXSwitchExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995); match(48);
			setState(1009);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				{
				{
				setState(996); match(81);
				setState(997); ruleJvmFormalParameter();
				setState(998); match(82);
				}
				}
				setState(1000); ruleXExpression();
				setState(1001); match(11);
				}
				break;

			case 2:
				{
				setState(1006);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					{
					setState(1003); ruleJvmFormalParameter();
					setState(1004); match(82);
					}
					}
					break;
				}
				setState(1008); ruleXExpressionOrSimpleConstructorCall();
				}
				break;
			}
			setState(1011); match(87);
			setState(1015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 17) | (1L << 24) | (1L << 52) | (1L << 62))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (77 - 77)) | (1L << (81 - 77)) | (1L << (82 - 77)) | (1L << (91 - 77)) | (1L << (96 - 77)) | (1L << (103 - 77)) | (1L << (RULE_ID - 77)))) != 0)) {
				{
				{
				setState(1012); ruleXCasePart();
				}
				}
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1021);
			_la = _input.LA(1);
			if (_la==78) {
				{
				setState(1018); match(78);
				setState(1019); match(82);
				setState(1020); ruleXExpression();
				}
			}

			setState(1023); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXExpressionOrSimpleConstructorCallContext extends ParserRuleContext {
		public RuleXExpressionContext ruleXExpression() {
			return getRuleContext(RuleXExpressionContext.class,0);
		}
		public RuleXbaseConstructorCallContext ruleXbaseConstructorCall() {
			return getRuleContext(RuleXbaseConstructorCallContext.class,0);
		}
		public RuleXExpressionOrSimpleConstructorCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXExpressionOrSimpleConstructorCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXExpressionOrSimpleConstructorCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXExpressionOrSimpleConstructorCall(this);
		}
	}

	public final RuleXExpressionOrSimpleConstructorCallContext ruleXExpressionOrSimpleConstructorCall() throws RecognitionException {
		RuleXExpressionOrSimpleConstructorCallContext _localctx = new RuleXExpressionOrSimpleConstructorCallContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ruleXExpressionOrSimpleConstructorCall);
		try {
			setState(1027);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1025); ruleXbaseConstructorCall();
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1026); ruleXExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleSimpleStringLiteralContext extends ParserRuleContext {
		public TerminalNode RULE_STRING() { return getToken(XtendParser.RULE_STRING, 0); }
		public RuleSimpleStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSimpleStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleSimpleStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleSimpleStringLiteral(this);
		}
	}

	public final RuleSimpleStringLiteralContext ruleSimpleStringLiteral() throws RecognitionException {
		RuleSimpleStringLiteralContext _localctx = new RuleSimpleStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ruleSimpleStringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029); match(RULE_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleRichStringContext extends ParserRuleContext {
		public List<RuleRichStringPartContext> ruleRichStringPart() {
			return getRuleContexts(RuleRichStringPartContext.class);
		}
		public RuleRichStringLiteralEndContext ruleRichStringLiteralEnd() {
			return getRuleContext(RuleRichStringLiteralEndContext.class,0);
		}
		public RuleRichStringLiteralStartContext ruleRichStringLiteralStart() {
			return getRuleContext(RuleRichStringLiteralStartContext.class,0);
		}
		public RuleRichStringLiteralContext ruleRichStringLiteral() {
			return getRuleContext(RuleRichStringLiteralContext.class,0);
		}
		public List<RuleRichStringLiteralInbetweenContext> ruleRichStringLiteralInbetween() {
			return getRuleContexts(RuleRichStringLiteralInbetweenContext.class);
		}
		public RuleRichStringPartContext ruleRichStringPart(int i) {
			return getRuleContext(RuleRichStringPartContext.class,i);
		}
		public RuleRichStringLiteralInbetweenContext ruleRichStringLiteralInbetween(int i) {
			return getRuleContext(RuleRichStringLiteralInbetweenContext.class,i);
		}
		public RuleRichStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleRichString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleRichString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleRichString(this);
		}
	}

	public final RuleRichStringContext ruleRichString() throws RecognitionException {
		RuleRichStringContext _localctx = new RuleRichStringContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ruleRichString);
		int _la;
		try {
			setState(1047);
			switch (_input.LA(1)) {
			case RULE_RICH_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1031); ruleRichStringLiteral();
				}
				break;
			case RULE_RICH_TEXT_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(1032); ruleRichStringLiteralStart();
				setState(1034);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 13) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 37) | (1L << 40) | (1L << 42) | (1L << 48) | (1L << 50) | (1L << 52) | (1L << 54) | (1L << 56) | (1L << 61) | (1L << 63))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (67 - 67)) | (1L << (69 - 67)) | (1L << (70 - 67)) | (1L << (73 - 67)) | (1L << (74 - 67)) | (1L << (76 - 67)) | (1L << (77 - 67)) | (1L << (79 - 67)) | (1L << (81 - 67)) | (1L << (83 - 67)) | (1L << (84 - 67)) | (1L << (85 - 67)) | (1L << (86 - 67)) | (1L << (87 - 67)) | (1L << (88 - 67)) | (1L << (90 - 67)) | (1L << (93 - 67)) | (1L << (94 - 67)) | (1L << (96 - 67)) | (1L << (98 - 67)) | (1L << (100 - 67)) | (1L << (101 - 67)) | (1L << (102 - 67)) | (1L << (103 - 67)) | (1L << (RULE_ID - 67)) | (1L << (RULE_RICH_TEXT - 67)) | (1L << (RULE_RICH_TEXT_START - 67)) | (1L << (RULE_HEX - 67)) | (1L << (RULE_INT - 67)) | (1L << (RULE_DECIMAL - 67)) | (1L << (RULE_STRING - 67)))) != 0)) {
					{
					setState(1033); ruleRichStringPart();
					}
				}

				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RULE_RICH_TEXT_INBETWEEN || _la==RULE_COMMENT_RICH_TEXT_INBETWEEN) {
					{
					{
					setState(1036); ruleRichStringLiteralInbetween();
					setState(1038);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 13) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 37) | (1L << 40) | (1L << 42) | (1L << 48) | (1L << 50) | (1L << 52) | (1L << 54) | (1L << 56) | (1L << 61) | (1L << 63))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (67 - 67)) | (1L << (69 - 67)) | (1L << (70 - 67)) | (1L << (73 - 67)) | (1L << (74 - 67)) | (1L << (76 - 67)) | (1L << (77 - 67)) | (1L << (79 - 67)) | (1L << (81 - 67)) | (1L << (83 - 67)) | (1L << (84 - 67)) | (1L << (85 - 67)) | (1L << (86 - 67)) | (1L << (87 - 67)) | (1L << (88 - 67)) | (1L << (90 - 67)) | (1L << (93 - 67)) | (1L << (94 - 67)) | (1L << (96 - 67)) | (1L << (98 - 67)) | (1L << (100 - 67)) | (1L << (101 - 67)) | (1L << (102 - 67)) | (1L << (103 - 67)) | (1L << (RULE_ID - 67)) | (1L << (RULE_RICH_TEXT - 67)) | (1L << (RULE_RICH_TEXT_START - 67)) | (1L << (RULE_HEX - 67)) | (1L << (RULE_INT - 67)) | (1L << (RULE_DECIMAL - 67)) | (1L << (RULE_STRING - 67)))) != 0)) {
						{
						setState(1037); ruleRichStringPart();
						}
					}

					}
					}
					setState(1044);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1045); ruleRichStringLiteralEnd();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleRichStringLiteralContext extends ParserRuleContext {
		public TerminalNode RULE_RICH_TEXT() { return getToken(XtendParser.RULE_RICH_TEXT, 0); }
		public RuleRichStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleRichStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleRichStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleRichStringLiteral(this);
		}
	}

	public final RuleRichStringLiteralContext ruleRichStringLiteral() throws RecognitionException {
		RuleRichStringLiteralContext _localctx = new RuleRichStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ruleRichStringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049); match(RULE_RICH_TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleRichStringLiteralStartContext extends ParserRuleContext {
		public TerminalNode RULE_RICH_TEXT_START() { return getToken(XtendParser.RULE_RICH_TEXT_START, 0); }
		public RuleRichStringLiteralStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleRichStringLiteralStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleRichStringLiteralStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleRichStringLiteralStart(this);
		}
	}

	public final RuleRichStringLiteralStartContext ruleRichStringLiteralStart() throws RecognitionException {
		RuleRichStringLiteralStartContext _localctx = new RuleRichStringLiteralStartContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ruleRichStringLiteralStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051); match(RULE_RICH_TEXT_START);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleRichStringLiteralInbetweenContext extends ParserRuleContext {
		public TerminalNode RULE_COMMENT_RICH_TEXT_INBETWEEN() { return getToken(XtendParser.RULE_COMMENT_RICH_TEXT_INBETWEEN, 0); }
		public TerminalNode RULE_RICH_TEXT_INBETWEEN() { return getToken(XtendParser.RULE_RICH_TEXT_INBETWEEN, 0); }
		public RuleRichStringLiteralInbetweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleRichStringLiteralInbetween; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleRichStringLiteralInbetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleRichStringLiteralInbetween(this);
		}
	}

	public final RuleRichStringLiteralInbetweenContext ruleRichStringLiteralInbetween() throws RecognitionException {
		RuleRichStringLiteralInbetweenContext _localctx = new RuleRichStringLiteralInbetweenContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ruleRichStringLiteralInbetween);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			_la = _input.LA(1);
			if ( !(_la==RULE_RICH_TEXT_INBETWEEN || _la==RULE_COMMENT_RICH_TEXT_INBETWEEN) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleRichStringLiteralEndContext extends ParserRuleContext {
		public TerminalNode RULE_RICH_TEXT_END() { return getToken(XtendParser.RULE_RICH_TEXT_END, 0); }
		public TerminalNode RULE_COMMENT_RICH_TEXT_END() { return getToken(XtendParser.RULE_COMMENT_RICH_TEXT_END, 0); }
		public RuleRichStringLiteralEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleRichStringLiteralEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleRichStringLiteralEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleRichStringLiteralEnd(this);
		}
	}

	public final RuleRichStringLiteralEndContext ruleRichStringLiteralEnd() throws RecognitionException {
		RuleRichStringLiteralEndContext _localctx = new RuleRichStringLiteralEndContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ruleRichStringLiteralEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			_la = _input.LA(1);
			if ( !(_la==RULE_RICH_TEXT_END || _la==RULE_COMMENT_RICH_TEXT_END) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleInternalRichStringContext extends ParserRuleContext {
		public List<RuleRichStringPartContext> ruleRichStringPart() {
			return getRuleContexts(RuleRichStringPartContext.class);
		}
		public List<RuleRichStringLiteralInbetweenContext> ruleRichStringLiteralInbetween() {
			return getRuleContexts(RuleRichStringLiteralInbetweenContext.class);
		}
		public RuleRichStringPartContext ruleRichStringPart(int i) {
			return getRuleContext(RuleRichStringPartContext.class,i);
		}
		public RuleRichStringLiteralInbetweenContext ruleRichStringLiteralInbetween(int i) {
			return getRuleContext(RuleRichStringLiteralInbetweenContext.class,i);
		}
		public RuleInternalRichStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleInternalRichString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleInternalRichString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleInternalRichString(this);
		}
	}

	public final RuleInternalRichStringContext ruleInternalRichString() throws RecognitionException {
		RuleInternalRichStringContext _localctx = new RuleInternalRichStringContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ruleInternalRichString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057); ruleRichStringLiteralInbetween();
			setState(1064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 13) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 37) | (1L << 40) | (1L << 42) | (1L << 48) | (1L << 50) | (1L << 52) | (1L << 54) | (1L << 56) | (1L << 61) | (1L << 63))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (67 - 67)) | (1L << (69 - 67)) | (1L << (70 - 67)) | (1L << (73 - 67)) | (1L << (74 - 67)) | (1L << (76 - 67)) | (1L << (77 - 67)) | (1L << (79 - 67)) | (1L << (81 - 67)) | (1L << (83 - 67)) | (1L << (84 - 67)) | (1L << (85 - 67)) | (1L << (86 - 67)) | (1L << (87 - 67)) | (1L << (88 - 67)) | (1L << (90 - 67)) | (1L << (93 - 67)) | (1L << (94 - 67)) | (1L << (96 - 67)) | (1L << (98 - 67)) | (1L << (100 - 67)) | (1L << (101 - 67)) | (1L << (102 - 67)) | (1L << (103 - 67)) | (1L << (RULE_ID - 67)) | (1L << (RULE_RICH_TEXT - 67)) | (1L << (RULE_RICH_TEXT_START - 67)) | (1L << (RULE_RICH_TEXT_INBETWEEN - 67)) | (1L << (RULE_COMMENT_RICH_TEXT_INBETWEEN - 67)) | (1L << (RULE_HEX - 67)) | (1L << (RULE_INT - 67)) | (1L << (RULE_DECIMAL - 67)) | (1L << (RULE_STRING - 67)))) != 0)) {
				{
				{
				setState(1059);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 13) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 37) | (1L << 40) | (1L << 42) | (1L << 48) | (1L << 50) | (1L << 52) | (1L << 54) | (1L << 56) | (1L << 61) | (1L << 63))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (67 - 67)) | (1L << (69 - 67)) | (1L << (70 - 67)) | (1L << (73 - 67)) | (1L << (74 - 67)) | (1L << (76 - 67)) | (1L << (77 - 67)) | (1L << (79 - 67)) | (1L << (81 - 67)) | (1L << (83 - 67)) | (1L << (84 - 67)) | (1L << (85 - 67)) | (1L << (86 - 67)) | (1L << (87 - 67)) | (1L << (88 - 67)) | (1L << (90 - 67)) | (1L << (93 - 67)) | (1L << (94 - 67)) | (1L << (96 - 67)) | (1L << (98 - 67)) | (1L << (100 - 67)) | (1L << (101 - 67)) | (1L << (102 - 67)) | (1L << (103 - 67)) | (1L << (RULE_ID - 67)) | (1L << (RULE_RICH_TEXT - 67)) | (1L << (RULE_RICH_TEXT_START - 67)) | (1L << (RULE_HEX - 67)) | (1L << (RULE_INT - 67)) | (1L << (RULE_DECIMAL - 67)) | (1L << (RULE_STRING - 67)))) != 0)) {
					{
					setState(1058); ruleRichStringPart();
					}
				}

				setState(1061); ruleRichStringLiteralInbetween();
				}
				}
				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleRichStringPartContext extends ParserRuleContext {
		public RuleRichStringForLoopContext ruleRichStringForLoop() {
			return getRuleContext(RuleRichStringForLoopContext.class,0);
		}
		public RuleXExpressionOrVarDeclarationContext ruleXExpressionOrVarDeclaration() {
			return getRuleContext(RuleXExpressionOrVarDeclarationContext.class,0);
		}
		public RuleRichStringIfContext ruleRichStringIf() {
			return getRuleContext(RuleRichStringIfContext.class,0);
		}
		public RuleRichStringPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleRichStringPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleRichStringPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleRichStringPart(this);
		}
	}

	public final RuleRichStringPartContext ruleRichStringPart() throws RecognitionException {
		RuleRichStringPartContext _localctx = new RuleRichStringPartContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ruleRichStringPart);
		try {
			setState(1070);
			switch (_input.LA(1)) {
			case 1:
			case 4:
			case 6:
			case 8:
			case 9:
			case 13:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
			case 21:
			case 25:
			case 26:
			case 27:
			case 28:
			case 33:
			case 34:
			case 36:
			case 40:
			case 42:
			case 48:
			case 50:
			case 52:
			case 54:
			case 56:
			case 61:
			case 63:
			case 67:
			case 69:
			case 70:
			case 73:
			case 74:
			case 76:
			case 77:
			case 79:
			case 81:
			case 83:
			case 84:
			case 85:
			case 86:
			case 87:
			case 88:
			case 90:
			case 93:
			case 94:
			case 96:
			case 98:
			case 100:
			case 101:
			case 102:
			case 103:
			case RULE_ID:
			case RULE_RICH_TEXT:
			case RULE_RICH_TEXT_START:
			case RULE_HEX:
			case RULE_INT:
			case RULE_DECIMAL:
			case RULE_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1067); ruleXExpressionOrVarDeclaration();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 2);
				{
				setState(1068); ruleRichStringForLoop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 3);
				{
				setState(1069); ruleRichStringIf();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleRichStringForLoopContext extends ParserRuleContext {
		public List<RuleXExpressionContext> ruleXExpression() {
			return getRuleContexts(RuleXExpressionContext.class);
		}
		public RuleJvmFormalParameterContext ruleJvmFormalParameter() {
			return getRuleContext(RuleJvmFormalParameterContext.class,0);
		}
		public RuleInternalRichStringContext ruleInternalRichString() {
			return getRuleContext(RuleInternalRichStringContext.class,0);
		}
		public RuleXExpressionContext ruleXExpression(int i) {
			return getRuleContext(RuleXExpressionContext.class,i);
		}
		public RuleRichStringForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleRichStringForLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleRichStringForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleRichStringForLoop(this);
		}
	}

	public final RuleRichStringForLoopContext ruleRichStringForLoop() throws RecognitionException {
		RuleRichStringForLoopContext _localctx = new RuleRichStringForLoopContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ruleRichStringForLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072); match(37);
			setState(1073); ruleJvmFormalParameter();
			setState(1074); match(82);
			setState(1075); ruleXExpression();
			setState(1078);
			_la = _input.LA(1);
			if (_la==52) {
				{
				setState(1076); match(52);
				setState(1077); ruleXExpression();
				}
			}

			setState(1082);
			_la = _input.LA(1);
			if (_la==17) {
				{
				setState(1080); match(17);
				setState(1081); ruleXExpression();
				}
			}

			setState(1086);
			_la = _input.LA(1);
			if (_la==103) {
				{
				setState(1084); match(103);
				setState(1085); ruleXExpression();
				}
			}

			setState(1088); ruleInternalRichString();
			setState(1089); match(68);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleRichStringIfContext extends ParserRuleContext {
		public RuleXExpressionContext ruleXExpression() {
			return getRuleContext(RuleXExpressionContext.class,0);
		}
		public RuleRichStringElseIfContext ruleRichStringElseIf(int i) {
			return getRuleContext(RuleRichStringElseIfContext.class,i);
		}
		public RuleInternalRichStringContext ruleInternalRichString(int i) {
			return getRuleContext(RuleInternalRichStringContext.class,i);
		}
		public List<RuleInternalRichStringContext> ruleInternalRichString() {
			return getRuleContexts(RuleInternalRichStringContext.class);
		}
		public List<RuleRichStringElseIfContext> ruleRichStringElseIf() {
			return getRuleContexts(RuleRichStringElseIfContext.class);
		}
		public RuleRichStringIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleRichStringIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleRichStringIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleRichStringIf(this);
		}
	}

	public final RuleRichStringIfContext ruleRichStringIf() throws RecognitionException {
		RuleRichStringIfContext _localctx = new RuleRichStringIfContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ruleRichStringIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091); match(5);
			setState(1092); ruleXExpression();
			setState(1093); ruleInternalRichString();
			setState(1097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(1094); ruleRichStringElseIf();
				}
				}
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1102);
			_la = _input.LA(1);
			if (_la==59) {
				{
				setState(1100); match(59);
				setState(1101); ruleInternalRichString();
				}
			}

			setState(1104); match(60);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleRichStringElseIfContext extends ParserRuleContext {
		public RuleXExpressionContext ruleXExpression() {
			return getRuleContext(RuleXExpressionContext.class,0);
		}
		public RuleInternalRichStringContext ruleInternalRichString() {
			return getRuleContext(RuleInternalRichStringContext.class,0);
		}
		public RuleRichStringElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleRichStringElseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleRichStringElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleRichStringElseIf(this);
		}
	}

	public final RuleRichStringElseIfContext ruleRichStringElseIf() throws RecognitionException {
		RuleRichStringElseIfContext _localctx = new RuleRichStringElseIfContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ruleRichStringElseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106); match(3);
			setState(1107); ruleXExpression();
			setState(1108); ruleInternalRichString();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXAnnotationContext extends ParserRuleContext {
		public RuleXAnnotationElementValueOrCommaListContext ruleXAnnotationElementValueOrCommaList() {
			return getRuleContext(RuleXAnnotationElementValueOrCommaListContext.class,0);
		}
		public RuleXAnnotationElementValuePairContext ruleXAnnotationElementValuePair(int i) {
			return getRuleContext(RuleXAnnotationElementValuePairContext.class,i);
		}
		public List<RuleXAnnotationElementValuePairContext> ruleXAnnotationElementValuePair() {
			return getRuleContexts(RuleXAnnotationElementValuePairContext.class);
		}
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleXAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXAnnotation(this);
		}
	}

	public final RuleXAnnotationContext ruleXAnnotation() throws RecognitionException {
		RuleXAnnotationContext _localctx = new RuleXAnnotationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ruleXAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110); match(14);
			setState(1111); ruleQualifiedName();
			setState(1125);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				{
				setState(1112); match(81);
				}
				setState(1122);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					{
					setState(1113); ruleXAnnotationElementValuePair();
					}
					setState(1118);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(1114); match(24);
						{
						setState(1115); ruleXAnnotationElementValuePair();
						}
						}
						}
						setState(1120);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;

				case 2:
					{
					setState(1121); ruleXAnnotationElementValueOrCommaList();
					}
					break;
				}
				setState(1124); match(11);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXAnnotationElementValuePairContext extends ParserRuleContext {
		public RuleXAnnotationElementValueContext ruleXAnnotationElementValue() {
			return getRuleContext(RuleXAnnotationElementValueContext.class,0);
		}
		public RuleValidIDContext ruleValidID() {
			return getRuleContext(RuleValidIDContext.class,0);
		}
		public RuleXAnnotationElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXAnnotationElementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXAnnotationElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXAnnotationElementValuePair(this);
		}
	}

	public final RuleXAnnotationElementValuePairContext ruleXAnnotationElementValuePair() throws RecognitionException {
		RuleXAnnotationElementValuePairContext _localctx = new RuleXAnnotationElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ruleXAnnotationElementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(1127); ruleValidID();
			setState(1128); match(66);
			}
			}
			setState(1130); ruleXAnnotationElementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXAnnotationElementValueOrCommaListContext extends ParserRuleContext {
		public RuleXAnnotationOrExpressionContext ruleXAnnotationOrExpression(int i) {
			return getRuleContext(RuleXAnnotationOrExpressionContext.class,i);
		}
		public List<RuleXAnnotationOrExpressionContext> ruleXAnnotationOrExpression() {
			return getRuleContexts(RuleXAnnotationOrExpressionContext.class);
		}
		public RuleXAnnotationElementValueOrCommaListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXAnnotationElementValueOrCommaList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXAnnotationElementValueOrCommaList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXAnnotationElementValueOrCommaList(this);
		}
	}

	public final RuleXAnnotationElementValueOrCommaListContext ruleXAnnotationElementValueOrCommaList() throws RecognitionException {
		RuleXAnnotationElementValueOrCommaListContext _localctx = new RuleXAnnotationElementValueOrCommaListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ruleXAnnotationElementValueOrCommaList);
		int _la;
		try {
			setState(1155);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(1132); match(50);
				setState(1133); match(54);
				}
				}
				setState(1143);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 40) | (1L << 42) | (1L << 48) | (1L << 50) | (1L << 52) | (1L << 54) | (1L << 56) | (1L << 61) | (1L << 63))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (67 - 67)) | (1L << (70 - 67)) | (1L << (73 - 67)) | (1L << (74 - 67)) | (1L << (76 - 67)) | (1L << (77 - 67)) | (1L << (79 - 67)) | (1L << (81 - 67)) | (1L << (84 - 67)) | (1L << (85 - 67)) | (1L << (86 - 67)) | (1L << (87 - 67)) | (1L << (88 - 67)) | (1L << (90 - 67)) | (1L << (93 - 67)) | (1L << (94 - 67)) | (1L << (96 - 67)) | (1L << (98 - 67)) | (1L << (100 - 67)) | (1L << (101 - 67)) | (1L << (102 - 67)) | (1L << (103 - 67)) | (1L << (RULE_ID - 67)) | (1L << (RULE_RICH_TEXT - 67)) | (1L << (RULE_RICH_TEXT_START - 67)) | (1L << (RULE_HEX - 67)) | (1L << (RULE_INT - 67)) | (1L << (RULE_DECIMAL - 67)) | (1L << (RULE_STRING - 67)))) != 0)) {
					{
					setState(1135); ruleXAnnotationOrExpression();
					setState(1140);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(1136); match(24);
						setState(1137); ruleXAnnotationOrExpression();
						}
						}
						setState(1142);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1145); match(75);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1146); ruleXAnnotationOrExpression();
				setState(1153);
				_la = _input.LA(1);
				if (_la==24) {
					{
					setState(1149); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1147); match(24);
						setState(1148); ruleXAnnotationOrExpression();
						}
						}
						setState(1151); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==24 );
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXAnnotationElementValueContext extends ParserRuleContext {
		public RuleXAnnotationOrExpressionContext ruleXAnnotationOrExpression(int i) {
			return getRuleContext(RuleXAnnotationOrExpressionContext.class,i);
		}
		public List<RuleXAnnotationOrExpressionContext> ruleXAnnotationOrExpression() {
			return getRuleContexts(RuleXAnnotationOrExpressionContext.class);
		}
		public RuleXAnnotationElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXAnnotationElementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXAnnotationElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXAnnotationElementValue(this);
		}
	}

	public final RuleXAnnotationElementValueContext ruleXAnnotationElementValue() throws RecognitionException {
		RuleXAnnotationElementValueContext _localctx = new RuleXAnnotationElementValueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_ruleXAnnotationElementValue);
		int _la;
		try {
			setState(1172);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(1157); match(50);
				setState(1158); match(54);
				}
				}
				setState(1168);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 40) | (1L << 42) | (1L << 48) | (1L << 50) | (1L << 52) | (1L << 54) | (1L << 56) | (1L << 61) | (1L << 63))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (67 - 67)) | (1L << (70 - 67)) | (1L << (73 - 67)) | (1L << (74 - 67)) | (1L << (76 - 67)) | (1L << (77 - 67)) | (1L << (79 - 67)) | (1L << (81 - 67)) | (1L << (84 - 67)) | (1L << (85 - 67)) | (1L << (86 - 67)) | (1L << (87 - 67)) | (1L << (88 - 67)) | (1L << (90 - 67)) | (1L << (93 - 67)) | (1L << (94 - 67)) | (1L << (96 - 67)) | (1L << (98 - 67)) | (1L << (100 - 67)) | (1L << (101 - 67)) | (1L << (102 - 67)) | (1L << (103 - 67)) | (1L << (RULE_ID - 67)) | (1L << (RULE_RICH_TEXT - 67)) | (1L << (RULE_RICH_TEXT_START - 67)) | (1L << (RULE_HEX - 67)) | (1L << (RULE_INT - 67)) | (1L << (RULE_DECIMAL - 67)) | (1L << (RULE_STRING - 67)))) != 0)) {
					{
					setState(1160); ruleXAnnotationOrExpression();
					setState(1165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(1161); match(24);
						setState(1162); ruleXAnnotationOrExpression();
						}
						}
						setState(1167);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1170); match(75);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1171); ruleXAnnotationOrExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXAnnotationOrExpressionContext extends ParserRuleContext {
		public RuleXExpressionContext ruleXExpression() {
			return getRuleContext(RuleXExpressionContext.class,0);
		}
		public RuleXAnnotationContext ruleXAnnotation() {
			return getRuleContext(RuleXAnnotationContext.class,0);
		}
		public RuleXAnnotationOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXAnnotationOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXAnnotationOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXAnnotationOrExpression(this);
		}
	}

	public final RuleXAnnotationOrExpressionContext ruleXAnnotationOrExpression() throws RecognitionException {
		RuleXAnnotationOrExpressionContext _localctx = new RuleXAnnotationOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_ruleXAnnotationOrExpression);
		try {
			setState(1176);
			switch (_input.LA(1)) {
			case 14:
				enterOuterAlt(_localctx, 1);
				{
				setState(1174); ruleXAnnotation();
				}
				break;
			case 1:
			case 4:
			case 6:
			case 8:
			case 9:
			case 13:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
			case 21:
			case 25:
			case 26:
			case 27:
			case 28:
			case 33:
			case 34:
			case 36:
			case 40:
			case 42:
			case 48:
			case 50:
			case 52:
			case 54:
			case 56:
			case 61:
			case 63:
			case 67:
			case 70:
			case 73:
			case 74:
			case 76:
			case 77:
			case 79:
			case 81:
			case 84:
			case 85:
			case 86:
			case 87:
			case 88:
			case 90:
			case 93:
			case 94:
			case 96:
			case 98:
			case 100:
			case 101:
			case 102:
			case 103:
			case RULE_ID:
			case RULE_RICH_TEXT:
			case RULE_RICH_TEXT_START:
			case RULE_HEX:
			case RULE_INT:
			case RULE_DECIMAL:
			case RULE_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1175); ruleXExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXExpressionContext extends ParserRuleContext {
		public RuleXAssignmentContext ruleXAssignment() {
			return getRuleContext(RuleXAssignmentContext.class,0);
		}
		public RuleXExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXExpression(this);
		}
	}

	public final RuleXExpressionContext ruleXExpression() throws RecognitionException {
		RuleXExpressionContext _localctx = new RuleXExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_ruleXExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178); ruleXAssignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXAssignmentContext extends ParserRuleContext {
		public RuleXOrExpressionContext ruleXOrExpression() {
			return getRuleContext(RuleXOrExpressionContext.class,0);
		}
		public RuleOpMultiAssignContext ruleOpMultiAssign() {
			return getRuleContext(RuleOpMultiAssignContext.class,0);
		}
		public RuleOpSingleAssignContext ruleOpSingleAssign() {
			return getRuleContext(RuleOpSingleAssignContext.class,0);
		}
		public RuleFeatureCallIDContext ruleFeatureCallID() {
			return getRuleContext(RuleFeatureCallIDContext.class,0);
		}
		public RuleXAssignmentContext ruleXAssignment() {
			return getRuleContext(RuleXAssignmentContext.class,0);
		}
		public RuleXAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXAssignment(this);
		}
	}

	public final RuleXAssignmentContext ruleXAssignment() throws RecognitionException {
		RuleXAssignmentContext _localctx = new RuleXAssignmentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_ruleXAssignment);
		try {
			setState(1190);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1180); ruleFeatureCallID();
				setState(1181); ruleOpSingleAssign();
				setState(1182); ruleXAssignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1184); ruleXOrExpression();
				setState(1188);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					{
					setState(1185); ruleOpMultiAssign();
					}
					setState(1186); ruleXAssignment();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleOpSingleAssignContext extends ParserRuleContext {
		public RuleOpSingleAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOpSingleAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleOpSingleAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleOpSingleAssign(this);
		}
	}

	public final RuleOpSingleAssignContext ruleOpSingleAssign() throws RecognitionException {
		RuleOpSingleAssignContext _localctx = new RuleOpSingleAssignContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ruleOpSingleAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192); match(66);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleOpMultiAssignContext extends ParserRuleContext {
		public RuleOpMultiAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOpMultiAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleOpMultiAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleOpMultiAssign(this);
		}
	}

	public final RuleOpMultiAssignContext ruleOpMultiAssign() throws RecognitionException {
		RuleOpMultiAssignContext _localctx = new RuleOpMultiAssignContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_ruleOpMultiAssign);
		int _la;
		try {
			setState(1207);
			switch (_input.LA(1)) {
			case 32:
				enterOuterAlt(_localctx, 1);
				{
				setState(1194); match(32);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 2);
				{
				setState(1195); match(23);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 3);
				{
				setState(1196); match(10);
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 4);
				{
				setState(1197); match(47);
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 5);
				{
				setState(1198); match(46);
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 6);
				{
				setState(1199); match(56);
				setState(1200); match(56);
				setState(1201); match(66);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 7);
				{
				setState(1202); match(45);
				setState(1204);
				_la = _input.LA(1);
				if (_la==45) {
					{
					setState(1203); match(45);
					}
				}

				setState(1206); match(105);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXOrExpressionContext extends ParserRuleContext {
		public RuleXAndExpressionContext ruleXAndExpression(int i) {
			return getRuleContext(RuleXAndExpressionContext.class,i);
		}
		public List<RuleXAndExpressionContext> ruleXAndExpression() {
			return getRuleContexts(RuleXAndExpressionContext.class);
		}
		public List<RuleOpOrContext> ruleOpOr() {
			return getRuleContexts(RuleOpOrContext.class);
		}
		public RuleOpOrContext ruleOpOr(int i) {
			return getRuleContext(RuleOpOrContext.class,i);
		}
		public RuleXOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXOrExpression(this);
		}
	}

	public final RuleXOrExpressionContext ruleXOrExpression() throws RecognitionException {
		RuleXOrExpressionContext _localctx = new RuleXOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_ruleXOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1209); ruleXAndExpression();
			setState(1215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(1210); ruleOpOr();
					}
					setState(1211); ruleXAndExpression();
					}
					} 
				}
				setState(1217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleOpOrContext extends ParserRuleContext {
		public RuleOpOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOpOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleOpOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleOpOr(this);
		}
	}

	public final RuleOpOrContext ruleOpOr() throws RecognitionException {
		RuleOpOrContext _localctx = new RuleOpOrContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_ruleOpOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218); match(44);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXAndExpressionContext extends ParserRuleContext {
		public List<RuleOpAndContext> ruleOpAnd() {
			return getRuleContexts(RuleOpAndContext.class);
		}
		public List<RuleXEqualityExpressionContext> ruleXEqualityExpression() {
			return getRuleContexts(RuleXEqualityExpressionContext.class);
		}
		public RuleOpAndContext ruleOpAnd(int i) {
			return getRuleContext(RuleOpAndContext.class,i);
		}
		public RuleXEqualityExpressionContext ruleXEqualityExpression(int i) {
			return getRuleContext(RuleXEqualityExpressionContext.class,i);
		}
		public RuleXAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXAndExpression(this);
		}
	}

	public final RuleXAndExpressionContext ruleXAndExpression() throws RecognitionException {
		RuleXAndExpressionContext _localctx = new RuleXAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ruleXAndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1220); ruleXEqualityExpression();
			setState(1226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(1221); ruleOpAnd();
					}
					setState(1222); ruleXEqualityExpression();
					}
					} 
				}
				setState(1228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleOpAndContext extends ParserRuleContext {
		public RuleOpAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOpAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleOpAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleOpAnd(this);
		}
	}

	public final RuleOpAndContext ruleOpAnd() throws RecognitionException {
		RuleOpAndContext _localctx = new RuleOpAndContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_ruleOpAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229); match(43);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXEqualityExpressionContext extends ParserRuleContext {
		public List<RuleXRelationalExpressionContext> ruleXRelationalExpression() {
			return getRuleContexts(RuleXRelationalExpressionContext.class);
		}
		public RuleXRelationalExpressionContext ruleXRelationalExpression(int i) {
			return getRuleContext(RuleXRelationalExpressionContext.class,i);
		}
		public List<RuleOpEqualityContext> ruleOpEquality() {
			return getRuleContexts(RuleOpEqualityContext.class);
		}
		public RuleOpEqualityContext ruleOpEquality(int i) {
			return getRuleContext(RuleOpEqualityContext.class,i);
		}
		public RuleXEqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXEqualityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXEqualityExpression(this);
		}
	}

	public final RuleXEqualityExpressionContext ruleXEqualityExpression() throws RecognitionException {
		RuleXEqualityExpressionContext _localctx = new RuleXEqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_ruleXEqualityExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1231); ruleXRelationalExpression();
			setState(1237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(1232); ruleOpEquality();
					}
					setState(1233); ruleXRelationalExpression();
					}
					} 
				}
				setState(1239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleOpEqualityContext extends ParserRuleContext {
		public RuleOpEqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOpEquality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleOpEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleOpEquality(this);
		}
	}

	public final RuleOpEqualityContext ruleOpEquality() throws RecognitionException {
		RuleOpEqualityContext _localctx = new RuleOpEqualityContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_ruleOpEquality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			_la = _input.LA(1);
			if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (57 - 57)) | (1L << (58 - 57)) | (1L << (97 - 57)) | (1L << (104 - 57)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXRelationalExpressionContext extends ParserRuleContext {
		public List<RuleJvmTypeReferenceContext> ruleJvmTypeReference() {
			return getRuleContexts(RuleJvmTypeReferenceContext.class);
		}
		public RuleXOtherOperatorExpressionContext ruleXOtherOperatorExpression(int i) {
			return getRuleContext(RuleXOtherOperatorExpressionContext.class,i);
		}
		public List<RuleXOtherOperatorExpressionContext> ruleXOtherOperatorExpression() {
			return getRuleContexts(RuleXOtherOperatorExpressionContext.class);
		}
		public RuleJvmTypeReferenceContext ruleJvmTypeReference(int i) {
			return getRuleContext(RuleJvmTypeReferenceContext.class,i);
		}
		public RuleOpCompareContext ruleOpCompare(int i) {
			return getRuleContext(RuleOpCompareContext.class,i);
		}
		public List<RuleOpCompareContext> ruleOpCompare() {
			return getRuleContexts(RuleOpCompareContext.class);
		}
		public RuleXRelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXRelationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXRelationalExpression(this);
		}
	}

	public final RuleXRelationalExpressionContext ruleXRelationalExpression() throws RecognitionException {
		RuleXRelationalExpressionContext _localctx = new RuleXRelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_ruleXRelationalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1242); ruleXOtherOperatorExpression();
			setState(1250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1248);
					switch (_input.LA(1)) {
					case 51:
						{
						{
						setState(1243); match(51);
						}
						setState(1244); ruleJvmTypeReference();
						}
						break;
					case 45:
					case 56:
					case 105:
						{
						{
						setState(1245); ruleOpCompare();
						}
						setState(1246); ruleXOtherOperatorExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleOpCompareContext extends ParserRuleContext {
		public RuleOpCompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOpCompare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleOpCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleOpCompare(this);
		}
	}

	public final RuleOpCompareContext ruleOpCompare() throws RecognitionException {
		RuleOpCompareContext _localctx = new RuleOpCompareContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_ruleOpCompare);
		try {
			setState(1258);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1253); match(105);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1254); match(56);
				setState(1255); match(66);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1256); match(45);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1257); match(56);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXOtherOperatorExpressionContext extends ParserRuleContext {
		public List<RuleXAdditiveExpressionContext> ruleXAdditiveExpression() {
			return getRuleContexts(RuleXAdditiveExpressionContext.class);
		}
		public List<RuleOpOtherContext> ruleOpOther() {
			return getRuleContexts(RuleOpOtherContext.class);
		}
		public RuleXAdditiveExpressionContext ruleXAdditiveExpression(int i) {
			return getRuleContext(RuleXAdditiveExpressionContext.class,i);
		}
		public RuleOpOtherContext ruleOpOther(int i) {
			return getRuleContext(RuleOpOtherContext.class,i);
		}
		public RuleXOtherOperatorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXOtherOperatorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXOtherOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXOtherOperatorExpression(this);
		}
	}

	public final RuleXOtherOperatorExpressionContext ruleXOtherOperatorExpression() throws RecognitionException {
		RuleXOtherOperatorExpressionContext _localctx = new RuleXOtherOperatorExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_ruleXOtherOperatorExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1260); ruleXAdditiveExpression();
			setState(1266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(1261); ruleOpOther();
					}
					setState(1262); ruleXAdditiveExpression();
					}
					} 
				}
				setState(1268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleOpOtherContext extends ParserRuleContext {
		public RuleOpOtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOpOther; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleOpOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleOpOther(this);
		}
	}

	public final RuleOpOtherContext ruleOpOther() throws RecognitionException {
		RuleOpOtherContext _localctx = new RuleOpOtherContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_ruleOpOther);
		try {
			setState(1290);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1269); match(65);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1270); match(71);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1271); match(45);
				setState(1272); match(22);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1273); match(22);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1274); match(91);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1275); match(45);
				setState(1279);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					{
					{
					setState(1276); match(45);
					setState(1277); match(45);
					}
					}
					}
					break;

				case 2:
					{
					setState(1278); match(45);
					}
					break;
				}
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1281); match(56);
				setState(1286);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					{
					{
					setState(1282); match(56);
					setState(1283); match(56);
					}
					}
					}
					break;

				case 2:
					{
					setState(1284); match(56);
					}
					break;

				case 3:
					{
					setState(1285); match(91);
					}
					break;
				}
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1288); match(95);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1289); match(39);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXAdditiveExpressionContext extends ParserRuleContext {
		public RuleOpAddContext ruleOpAdd(int i) {
			return getRuleContext(RuleOpAddContext.class,i);
		}
		public List<RuleOpAddContext> ruleOpAdd() {
			return getRuleContexts(RuleOpAddContext.class);
		}
		public RuleXMultiplicativeExpressionContext ruleXMultiplicativeExpression(int i) {
			return getRuleContext(RuleXMultiplicativeExpressionContext.class,i);
		}
		public List<RuleXMultiplicativeExpressionContext> ruleXMultiplicativeExpression() {
			return getRuleContexts(RuleXMultiplicativeExpressionContext.class);
		}
		public RuleXAdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXAdditiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXAdditiveExpression(this);
		}
	}

	public final RuleXAdditiveExpressionContext ruleXAdditiveExpression() throws RecognitionException {
		RuleXAdditiveExpressionContext _localctx = new RuleXAdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_ruleXAdditiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1292); ruleXMultiplicativeExpression();
			setState(1298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(1293); ruleOpAdd();
					}
					setState(1294); ruleXMultiplicativeExpression();
					}
					} 
				}
				setState(1300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleOpAddContext extends ParserRuleContext {
		public RuleOpAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOpAdd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleOpAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleOpAdd(this);
		}
	}

	public final RuleOpAddContext ruleOpAdd() throws RecognitionException {
		RuleOpAddContext _localctx = new RuleOpAddContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_ruleOpAdd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			_la = _input.LA(1);
			if ( !(_la==26 || _la==42) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXMultiplicativeExpressionContext extends ParserRuleContext {
		public List<RuleOpMultiContext> ruleOpMulti() {
			return getRuleContexts(RuleOpMultiContext.class);
		}
		public RuleXUnaryOperationContext ruleXUnaryOperation(int i) {
			return getRuleContext(RuleXUnaryOperationContext.class,i);
		}
		public List<RuleXUnaryOperationContext> ruleXUnaryOperation() {
			return getRuleContexts(RuleXUnaryOperationContext.class);
		}
		public RuleOpMultiContext ruleOpMulti(int i) {
			return getRuleContext(RuleOpMultiContext.class,i);
		}
		public RuleXMultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXMultiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXMultiplicativeExpression(this);
		}
	}

	public final RuleXMultiplicativeExpressionContext ruleXMultiplicativeExpression() throws RecognitionException {
		RuleXMultiplicativeExpressionContext _localctx = new RuleXMultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_ruleXMultiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1303); ruleXUnaryOperation();
			setState(1309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(1304); ruleOpMulti();
					}
					setState(1305); ruleXUnaryOperation();
					}
					} 
				}
				setState(1311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleOpMultiContext extends ParserRuleContext {
		public RuleOpMultiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOpMulti; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleOpMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleOpMulti(this);
		}
	}

	public final RuleOpMultiContext ruleOpMulti() throws RecognitionException {
		RuleOpMultiContext _localctx = new RuleOpMultiContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_ruleOpMulti);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1312);
			_la = _input.LA(1);
			if ( !(_la==2 || _la==49 || _la==64 || _la==80) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXUnaryOperationContext extends ParserRuleContext {
		public RuleOpUnaryContext ruleOpUnary() {
			return getRuleContext(RuleOpUnaryContext.class,0);
		}
		public RuleXUnaryOperationContext ruleXUnaryOperation() {
			return getRuleContext(RuleXUnaryOperationContext.class,0);
		}
		public RuleXCastedExpressionContext ruleXCastedExpression() {
			return getRuleContext(RuleXCastedExpressionContext.class,0);
		}
		public RuleXUnaryOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXUnaryOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXUnaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXUnaryOperation(this);
		}
	}

	public final RuleXUnaryOperationContext ruleXUnaryOperation() throws RecognitionException {
		RuleXUnaryOperationContext _localctx = new RuleXUnaryOperationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_ruleXUnaryOperation);
		try {
			setState(1318);
			switch (_input.LA(1)) {
			case 21:
			case 26:
			case 42:
				enterOuterAlt(_localctx, 1);
				{
				setState(1314); ruleOpUnary();
				setState(1315); ruleXUnaryOperation();
				}
				break;
			case 1:
			case 4:
			case 6:
			case 8:
			case 9:
			case 13:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
			case 25:
			case 27:
			case 28:
			case 33:
			case 34:
			case 36:
			case 40:
			case 48:
			case 50:
			case 52:
			case 54:
			case 56:
			case 61:
			case 63:
			case 67:
			case 70:
			case 73:
			case 74:
			case 76:
			case 77:
			case 79:
			case 81:
			case 84:
			case 85:
			case 86:
			case 87:
			case 88:
			case 90:
			case 93:
			case 94:
			case 96:
			case 98:
			case 100:
			case 101:
			case 102:
			case 103:
			case RULE_ID:
			case RULE_RICH_TEXT:
			case RULE_RICH_TEXT_START:
			case RULE_HEX:
			case RULE_INT:
			case RULE_DECIMAL:
			case RULE_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1317); ruleXCastedExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleOpUnaryContext extends ParserRuleContext {
		public RuleOpUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOpUnary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleOpUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleOpUnary(this);
		}
	}

	public final RuleOpUnaryContext ruleOpUnary() throws RecognitionException {
		RuleOpUnaryContext _localctx = new RuleOpUnaryContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_ruleOpUnary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 21) | (1L << 26) | (1L << 42))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXCastedExpressionContext extends ParserRuleContext {
		public List<RuleJvmTypeReferenceContext> ruleJvmTypeReference() {
			return getRuleContexts(RuleJvmTypeReferenceContext.class);
		}
		public RuleJvmTypeReferenceContext ruleJvmTypeReference(int i) {
			return getRuleContext(RuleJvmTypeReferenceContext.class,i);
		}
		public RuleXPostfixOperationContext ruleXPostfixOperation() {
			return getRuleContext(RuleXPostfixOperationContext.class,0);
		}
		public RuleXCastedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXCastedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXCastedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXCastedExpression(this);
		}
	}

	public final RuleXCastedExpressionContext ruleXCastedExpression() throws RecognitionException {
		RuleXCastedExpressionContext _localctx = new RuleXCastedExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_ruleXCastedExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1322); ruleXPostfixOperation();
			setState(1327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(1323); match(30);
					}
					setState(1324); ruleJvmTypeReference();
					}
					} 
				}
				setState(1329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXPostfixOperationContext extends ParserRuleContext {
		public RuleOpPostfixContext ruleOpPostfix() {
			return getRuleContext(RuleOpPostfixContext.class,0);
		}
		public RuleXMemberFeatureCallContext ruleXMemberFeatureCall() {
			return getRuleContext(RuleXMemberFeatureCallContext.class,0);
		}
		public RuleXPostfixOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXPostfixOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXPostfixOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXPostfixOperation(this);
		}
	}

	public final RuleXPostfixOperationContext ruleXPostfixOperation() throws RecognitionException {
		RuleXPostfixOperationContext _localctx = new RuleXPostfixOperationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_ruleXPostfixOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330); ruleXMemberFeatureCall();
			setState(1332);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1331); ruleOpPostfix();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleOpPostfixContext extends ParserRuleContext {
		public RuleOpPostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOpPostfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleOpPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleOpPostfix(this);
		}
	}

	public final RuleOpPostfixContext ruleOpPostfix() throws RecognitionException {
		RuleOpPostfixContext _localctx = new RuleOpPostfixContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_ruleOpPostfix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			_la = _input.LA(1);
			if ( !(_la==38 || _la==55) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXMemberFeatureCallContext extends ParserRuleContext {
		public List<RuleXExpressionContext> ruleXExpression() {
			return getRuleContexts(RuleXExpressionContext.class);
		}
		public List<RuleXShortClosureContext> ruleXShortClosure() {
			return getRuleContexts(RuleXShortClosureContext.class);
		}
		public List<RuleXClosureContext> ruleXClosure() {
			return getRuleContexts(RuleXClosureContext.class);
		}
		public List<RuleOpSingleAssignContext> ruleOpSingleAssign() {
			return getRuleContexts(RuleOpSingleAssignContext.class);
		}
		public RuleJvmArgumentTypeReferenceContext ruleJvmArgumentTypeReference(int i) {
			return getRuleContext(RuleJvmArgumentTypeReferenceContext.class,i);
		}
		public RuleOpSingleAssignContext ruleOpSingleAssign(int i) {
			return getRuleContext(RuleOpSingleAssignContext.class,i);
		}
		public RuleXClosureContext ruleXClosure(int i) {
			return getRuleContext(RuleXClosureContext.class,i);
		}
		public List<RuleIdOrSuperContext> ruleIdOrSuper() {
			return getRuleContexts(RuleIdOrSuperContext.class);
		}
		public List<RuleXAssignmentContext> ruleXAssignment() {
			return getRuleContexts(RuleXAssignmentContext.class);
		}
		public RuleXAssignmentContext ruleXAssignment(int i) {
			return getRuleContext(RuleXAssignmentContext.class,i);
		}
		public List<RuleJvmArgumentTypeReferenceContext> ruleJvmArgumentTypeReference() {
			return getRuleContexts(RuleJvmArgumentTypeReferenceContext.class);
		}
		public RuleIdOrSuperContext ruleIdOrSuper(int i) {
			return getRuleContext(RuleIdOrSuperContext.class,i);
		}
		public RuleXExpressionContext ruleXExpression(int i) {
			return getRuleContext(RuleXExpressionContext.class,i);
		}
		public RuleXPrimaryExpressionContext ruleXPrimaryExpression() {
			return getRuleContext(RuleXPrimaryExpressionContext.class,0);
		}
		public RuleFeatureCallIDContext ruleFeatureCallID(int i) {
			return getRuleContext(RuleFeatureCallIDContext.class,i);
		}
		public RuleXShortClosureContext ruleXShortClosure(int i) {
			return getRuleContext(RuleXShortClosureContext.class,i);
		}
		public List<RuleFeatureCallIDContext> ruleFeatureCallID() {
			return getRuleContexts(RuleFeatureCallIDContext.class);
		}
		public RuleXMemberFeatureCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXMemberFeatureCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXMemberFeatureCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXMemberFeatureCall(this);
		}
	}

	public final RuleXMemberFeatureCallContext ruleXMemberFeatureCall() throws RecognitionException {
		RuleXMemberFeatureCallContext _localctx = new RuleXMemberFeatureCallContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_ruleXMemberFeatureCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1336); ruleXPrimaryExpression();
			setState(1378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1376);
					switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
					case 1:
						{
						{
						{
						setState(1337);
						_la = _input.LA(1);
						if ( !(_la==12 || _la==41) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1338); ruleFeatureCallID();
						setState(1339); ruleOpSingleAssign();
						}
						}
						setState(1341); ruleXAssignment();
						}
						break;

					case 2:
						{
						{
						setState(1343);
						_la = _input.LA(1);
						if ( !(_la==12 || _la==41 || _la==92) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						setState(1355);
						_la = _input.LA(1);
						if (_la==56) {
							{
							setState(1344); match(56);
							setState(1345); ruleJvmArgumentTypeReference();
							setState(1350);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==24) {
								{
								{
								setState(1346); match(24);
								setState(1347); ruleJvmArgumentTypeReference();
								}
								}
								setState(1352);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1353); match(45);
							}
						}

						setState(1357); ruleIdOrSuper();
						setState(1371);
						switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
						case 1:
							{
							{
							setState(1358); match(81);
							}
							setState(1368);
							switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
							case 1:
								{
								{
								setState(1359); ruleXShortClosure();
								}
								}
								break;

							case 2:
								{
								setState(1360); ruleXExpression();
								setState(1365);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==24) {
									{
									{
									setState(1361); match(24);
									setState(1362); ruleXExpression();
									}
									}
									setState(1367);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1370); match(11);
							}
							break;
						}
						setState(1374);
						switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
						case 1:
							{
							setState(1373); ruleXClosure();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXPrimaryExpressionContext extends ParserRuleContext {
		public RuleXSwitchExpressionContext ruleXSwitchExpression() {
			return getRuleContext(RuleXSwitchExpressionContext.class,0);
		}
		public RuleXIfExpressionContext ruleXIfExpression() {
			return getRuleContext(RuleXIfExpressionContext.class,0);
		}
		public RuleXReturnExpressionContext ruleXReturnExpression() {
			return getRuleContext(RuleXReturnExpressionContext.class,0);
		}
		public RuleXThrowExpressionContext ruleXThrowExpression() {
			return getRuleContext(RuleXThrowExpressionContext.class,0);
		}
		public RuleXForLoopExpressionContext ruleXForLoopExpression() {
			return getRuleContext(RuleXForLoopExpressionContext.class,0);
		}
		public RuleXParenthesizedExpressionContext ruleXParenthesizedExpression() {
			return getRuleContext(RuleXParenthesizedExpressionContext.class,0);
		}
		public RuleXWhileExpressionContext ruleXWhileExpression() {
			return getRuleContext(RuleXWhileExpressionContext.class,0);
		}
		public RuleXDoWhileExpressionContext ruleXDoWhileExpression() {
			return getRuleContext(RuleXDoWhileExpressionContext.class,0);
		}
		public RuleXSynchronizedExpressionContext ruleXSynchronizedExpression() {
			return getRuleContext(RuleXSynchronizedExpressionContext.class,0);
		}
		public RuleXTryCatchFinallyExpressionContext ruleXTryCatchFinallyExpression() {
			return getRuleContext(RuleXTryCatchFinallyExpressionContext.class,0);
		}
		public RuleXConstructorCallContext ruleXConstructorCall() {
			return getRuleContext(RuleXConstructorCallContext.class,0);
		}
		public RuleXBlockExpressionContext ruleXBlockExpression() {
			return getRuleContext(RuleXBlockExpressionContext.class,0);
		}
		public RuleXFeatureCallContext ruleXFeatureCall() {
			return getRuleContext(RuleXFeatureCallContext.class,0);
		}
		public RuleXLiteralContext ruleXLiteral() {
			return getRuleContext(RuleXLiteralContext.class,0);
		}
		public RuleXBasicForLoopExpressionContext ruleXBasicForLoopExpression() {
			return getRuleContext(RuleXBasicForLoopExpressionContext.class,0);
		}
		public RuleXPrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXPrimaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXPrimaryExpression(this);
		}
	}

	public final RuleXPrimaryExpressionContext ruleXPrimaryExpression() throws RecognitionException {
		RuleXPrimaryExpressionContext _localctx = new RuleXPrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_ruleXPrimaryExpression);
		try {
			setState(1396);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1381); ruleXConstructorCall();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1382); ruleXBlockExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1383); ruleXSwitchExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1384); ruleXSynchronizedExpression();
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1385); ruleXFeatureCall();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1386); ruleXLiteral();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1387); ruleXIfExpression();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(1388); ruleXForLoopExpression();
				}
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1389); ruleXBasicForLoopExpression();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1390); ruleXWhileExpression();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1391); ruleXDoWhileExpression();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1392); ruleXThrowExpression();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1393); ruleXReturnExpression();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1394); ruleXTryCatchFinallyExpression();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1395); ruleXParenthesizedExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXLiteralContext extends ParserRuleContext {
		public RuleXBooleanLiteralContext ruleXBooleanLiteral() {
			return getRuleContext(RuleXBooleanLiteralContext.class,0);
		}
		public RuleXTypeLiteralContext ruleXTypeLiteral() {
			return getRuleContext(RuleXTypeLiteralContext.class,0);
		}
		public RuleXClosureContext ruleXClosure() {
			return getRuleContext(RuleXClosureContext.class,0);
		}
		public RuleXNullLiteralContext ruleXNullLiteral() {
			return getRuleContext(RuleXNullLiteralContext.class,0);
		}
		public RuleXCollectionLiteralContext ruleXCollectionLiteral() {
			return getRuleContext(RuleXCollectionLiteralContext.class,0);
		}
		public RuleXStringLiteralContext ruleXStringLiteral() {
			return getRuleContext(RuleXStringLiteralContext.class,0);
		}
		public RuleXNumberLiteralContext ruleXNumberLiteral() {
			return getRuleContext(RuleXNumberLiteralContext.class,0);
		}
		public RuleXLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXLiteral(this);
		}
	}

	public final RuleXLiteralContext ruleXLiteral() throws RecognitionException {
		RuleXLiteralContext _localctx = new RuleXLiteralContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_ruleXLiteral);
		try {
			setState(1405);
			switch (_input.LA(1)) {
			case 50:
				enterOuterAlt(_localctx, 1);
				{
				setState(1398); ruleXCollectionLiteral();
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1399); ruleXClosure();
				}
				}
				break;
			case 4:
			case 36:
				enterOuterAlt(_localctx, 3);
				{
				setState(1400); ruleXBooleanLiteral();
				}
				break;
			case RULE_HEX:
			case RULE_INT:
			case RULE_DECIMAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1401); ruleXNumberLiteral();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 5);
				{
				setState(1402); ruleXNullLiteral();
				}
				break;
			case RULE_RICH_TEXT:
			case RULE_RICH_TEXT_START:
			case RULE_STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(1403); ruleXStringLiteral();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 7);
				{
				setState(1404); ruleXTypeLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXCollectionLiteralContext extends ParserRuleContext {
		public RuleXListLiteralContext ruleXListLiteral() {
			return getRuleContext(RuleXListLiteralContext.class,0);
		}
		public RuleXSetLiteralContext ruleXSetLiteral() {
			return getRuleContext(RuleXSetLiteralContext.class,0);
		}
		public RuleXCollectionLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXCollectionLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXCollectionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXCollectionLiteral(this);
		}
	}

	public final RuleXCollectionLiteralContext ruleXCollectionLiteral() throws RecognitionException {
		RuleXCollectionLiteralContext _localctx = new RuleXCollectionLiteralContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_ruleXCollectionLiteral);
		try {
			setState(1409);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1407); ruleXSetLiteral();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1408); ruleXListLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXSetLiteralContext extends ParserRuleContext {
		public List<RuleXExpressionContext> ruleXExpression() {
			return getRuleContexts(RuleXExpressionContext.class);
		}
		public RuleXExpressionContext ruleXExpression(int i) {
			return getRuleContext(RuleXExpressionContext.class,i);
		}
		public RuleXSetLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXSetLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXSetLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXSetLiteral(this);
		}
	}

	public final RuleXSetLiteralContext ruleXSetLiteral() throws RecognitionException {
		RuleXSetLiteralContext _localctx = new RuleXSetLiteralContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_ruleXSetLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1411); match(50);
			setState(1412); match(87);
			setState(1421);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 13) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 40) | (1L << 42) | (1L << 48) | (1L << 50) | (1L << 52) | (1L << 54) | (1L << 56) | (1L << 61) | (1L << 63))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (67 - 67)) | (1L << (70 - 67)) | (1L << (73 - 67)) | (1L << (74 - 67)) | (1L << (76 - 67)) | (1L << (77 - 67)) | (1L << (79 - 67)) | (1L << (81 - 67)) | (1L << (84 - 67)) | (1L << (85 - 67)) | (1L << (86 - 67)) | (1L << (87 - 67)) | (1L << (88 - 67)) | (1L << (90 - 67)) | (1L << (93 - 67)) | (1L << (94 - 67)) | (1L << (96 - 67)) | (1L << (98 - 67)) | (1L << (100 - 67)) | (1L << (101 - 67)) | (1L << (102 - 67)) | (1L << (103 - 67)) | (1L << (RULE_ID - 67)) | (1L << (RULE_RICH_TEXT - 67)) | (1L << (RULE_RICH_TEXT_START - 67)) | (1L << (RULE_HEX - 67)) | (1L << (RULE_INT - 67)) | (1L << (RULE_DECIMAL - 67)) | (1L << (RULE_STRING - 67)))) != 0)) {
				{
				setState(1413); ruleXExpression();
				setState(1418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==24) {
					{
					{
					setState(1414); match(24);
					setState(1415); ruleXExpression();
					}
					}
					setState(1420);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1423); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXListLiteralContext extends ParserRuleContext {
		public List<RuleXExpressionContext> ruleXExpression() {
			return getRuleContexts(RuleXExpressionContext.class);
		}
		public RuleXExpressionContext ruleXExpression(int i) {
			return getRuleContext(RuleXExpressionContext.class,i);
		}
		public RuleXListLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXListLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXListLiteral(this);
		}
	}

	public final RuleXListLiteralContext ruleXListLiteral() throws RecognitionException {
		RuleXListLiteralContext _localctx = new RuleXListLiteralContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_ruleXListLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1425); match(50);
			setState(1426); match(54);
			setState(1435);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 13) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 40) | (1L << 42) | (1L << 48) | (1L << 50) | (1L << 52) | (1L << 54) | (1L << 56) | (1L << 61) | (1L << 63))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (67 - 67)) | (1L << (70 - 67)) | (1L << (73 - 67)) | (1L << (74 - 67)) | (1L << (76 - 67)) | (1L << (77 - 67)) | (1L << (79 - 67)) | (1L << (81 - 67)) | (1L << (84 - 67)) | (1L << (85 - 67)) | (1L << (86 - 67)) | (1L << (87 - 67)) | (1L << (88 - 67)) | (1L << (90 - 67)) | (1L << (93 - 67)) | (1L << (94 - 67)) | (1L << (96 - 67)) | (1L << (98 - 67)) | (1L << (100 - 67)) | (1L << (101 - 67)) | (1L << (102 - 67)) | (1L << (103 - 67)) | (1L << (RULE_ID - 67)) | (1L << (RULE_RICH_TEXT - 67)) | (1L << (RULE_RICH_TEXT_START - 67)) | (1L << (RULE_HEX - 67)) | (1L << (RULE_INT - 67)) | (1L << (RULE_DECIMAL - 67)) | (1L << (RULE_STRING - 67)))) != 0)) {
				{
				setState(1427); ruleXExpression();
				setState(1432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==24) {
					{
					{
					setState(1428); match(24);
					setState(1429); ruleXExpression();
					}
					}
					setState(1434);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1437); match(75);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXClosureContext extends ParserRuleContext {
		public List<RuleJvmFormalParameterContext> ruleJvmFormalParameter() {
			return getRuleContexts(RuleJvmFormalParameterContext.class);
		}
		public RuleXExpressionInClosureContext ruleXExpressionInClosure() {
			return getRuleContext(RuleXExpressionInClosureContext.class,0);
		}
		public RuleJvmFormalParameterContext ruleJvmFormalParameter(int i) {
			return getRuleContext(RuleJvmFormalParameterContext.class,i);
		}
		public RuleXClosureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXClosure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXClosure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXClosure(this);
		}
	}

	public final RuleXClosureContext ruleXClosure() throws RecognitionException {
		RuleXClosureContext _localctx = new RuleXClosureContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_ruleXClosure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1439); match(54);
			}
			setState(1451);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				{
				setState(1448);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 8) | (1L << 15) | (1L << 17) | (1L << 19) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 40) | (1L << 52) | (1L << 61))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (67 - 67)) | (1L << (73 - 67)) | (1L << (74 - 67)) | (1L << (76 - 67)) | (1L << (77 - 67)) | (1L << (79 - 67)) | (1L << (81 - 67)) | (1L << (85 - 67)) | (1L << (86 - 67)) | (1L << (88 - 67)) | (1L << (90 - 67)) | (1L << (91 - 67)) | (1L << (94 - 67)) | (1L << (96 - 67)) | (1L << (100 - 67)) | (1L << (101 - 67)) | (1L << (102 - 67)) | (1L << (103 - 67)) | (1L << (RULE_ID - 67)))) != 0)) {
					{
					setState(1440); ruleJvmFormalParameter();
					setState(1445);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(1441); match(24);
						setState(1442); ruleJvmFormalParameter();
						}
						}
						setState(1447);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1450); match(20);
				}
				}
				break;
			}
			setState(1453); ruleXExpressionInClosure();
			setState(1454); match(75);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXExpressionInClosureContext extends ParserRuleContext {
		public List<RuleXExpressionOrVarDeclarationContext> ruleXExpressionOrVarDeclaration() {
			return getRuleContexts(RuleXExpressionOrVarDeclarationContext.class);
		}
		public RuleXExpressionOrVarDeclarationContext ruleXExpressionOrVarDeclaration(int i) {
			return getRuleContext(RuleXExpressionOrVarDeclarationContext.class,i);
		}
		public RuleXExpressionInClosureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXExpressionInClosure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXExpressionInClosure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXExpressionInClosure(this);
		}
	}

	public final RuleXExpressionInClosureContext ruleXExpressionInClosure() throws RecognitionException {
		RuleXExpressionInClosureContext _localctx = new RuleXExpressionInClosureContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_ruleXExpressionInClosure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 13) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 40) | (1L << 42) | (1L << 48) | (1L << 50) | (1L << 52) | (1L << 54) | (1L << 56) | (1L << 61) | (1L << 63))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (67 - 67)) | (1L << (69 - 67)) | (1L << (70 - 67)) | (1L << (73 - 67)) | (1L << (74 - 67)) | (1L << (76 - 67)) | (1L << (77 - 67)) | (1L << (79 - 67)) | (1L << (81 - 67)) | (1L << (83 - 67)) | (1L << (84 - 67)) | (1L << (85 - 67)) | (1L << (86 - 67)) | (1L << (87 - 67)) | (1L << (88 - 67)) | (1L << (90 - 67)) | (1L << (93 - 67)) | (1L << (94 - 67)) | (1L << (96 - 67)) | (1L << (98 - 67)) | (1L << (100 - 67)) | (1L << (101 - 67)) | (1L << (102 - 67)) | (1L << (103 - 67)) | (1L << (RULE_ID - 67)) | (1L << (RULE_RICH_TEXT - 67)) | (1L << (RULE_RICH_TEXT_START - 67)) | (1L << (RULE_HEX - 67)) | (1L << (RULE_INT - 67)) | (1L << (RULE_DECIMAL - 67)) | (1L << (RULE_STRING - 67)))) != 0)) {
				{
				{
				setState(1456); ruleXExpressionOrVarDeclaration();
				setState(1458);
				_la = _input.LA(1);
				if (_la==99) {
					{
					setState(1457); match(99);
					}
				}

				}
				}
				setState(1464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXShortClosureContext extends ParserRuleContext {
		public RuleXExpressionContext ruleXExpression() {
			return getRuleContext(RuleXExpressionContext.class,0);
		}
		public List<RuleJvmFormalParameterContext> ruleJvmFormalParameter() {
			return getRuleContexts(RuleJvmFormalParameterContext.class);
		}
		public RuleJvmFormalParameterContext ruleJvmFormalParameter(int i) {
			return getRuleContext(RuleJvmFormalParameterContext.class,i);
		}
		public RuleXShortClosureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXShortClosure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXShortClosure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXShortClosure(this);
		}
	}

	public final RuleXShortClosureContext ruleXShortClosure() throws RecognitionException {
		RuleXShortClosureContext _localctx = new RuleXShortClosureContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_ruleXShortClosure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(1473);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 8) | (1L << 15) | (1L << 17) | (1L << 19) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 40) | (1L << 52) | (1L << 61))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (67 - 67)) | (1L << (73 - 67)) | (1L << (74 - 67)) | (1L << (76 - 67)) | (1L << (77 - 67)) | (1L << (79 - 67)) | (1L << (81 - 67)) | (1L << (85 - 67)) | (1L << (86 - 67)) | (1L << (88 - 67)) | (1L << (90 - 67)) | (1L << (91 - 67)) | (1L << (94 - 67)) | (1L << (96 - 67)) | (1L << (100 - 67)) | (1L << (101 - 67)) | (1L << (102 - 67)) | (1L << (103 - 67)) | (1L << (RULE_ID - 67)))) != 0)) {
				{
				setState(1465); ruleJvmFormalParameter();
				setState(1470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==24) {
					{
					{
					setState(1466); match(24);
					setState(1467); ruleJvmFormalParameter();
					}
					}
					setState(1472);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1475); match(20);
			}
			}
			setState(1477); ruleXExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXParenthesizedExpressionContext extends ParserRuleContext {
		public RuleXExpressionContext ruleXExpression() {
			return getRuleContext(RuleXExpressionContext.class,0);
		}
		public RuleXParenthesizedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXParenthesizedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXParenthesizedExpression(this);
		}
	}

	public final RuleXParenthesizedExpressionContext ruleXParenthesizedExpression() throws RecognitionException {
		RuleXParenthesizedExpressionContext _localctx = new RuleXParenthesizedExpressionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_ruleXParenthesizedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479); match(81);
			setState(1480); ruleXExpression();
			setState(1481); match(11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXIfExpressionContext extends ParserRuleContext {
		public List<RuleXExpressionContext> ruleXExpression() {
			return getRuleContexts(RuleXExpressionContext.class);
		}
		public RuleXExpressionContext ruleXExpression(int i) {
			return getRuleContext(RuleXExpressionContext.class,i);
		}
		public RuleXIfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXIfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXIfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXIfExpression(this);
		}
	}

	public final RuleXIfExpressionContext ruleXIfExpression() throws RecognitionException {
		RuleXIfExpressionContext _localctx = new RuleXIfExpressionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_ruleXIfExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1483); match(27);
			setState(1484); match(81);
			setState(1485); ruleXExpression();
			setState(1486); match(11);
			setState(1487); ruleXExpression();
			setState(1490);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				{
				setState(1488); match(35);
				}
				setState(1489); ruleXExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXCasePartContext extends ParserRuleContext {
		public RuleJvmTypeReferenceContext ruleJvmTypeReference() {
			return getRuleContext(RuleJvmTypeReferenceContext.class,0);
		}
		public List<RuleXExpressionContext> ruleXExpression() {
			return getRuleContexts(RuleXExpressionContext.class);
		}
		public RuleXExpressionContext ruleXExpression(int i) {
			return getRuleContext(RuleXExpressionContext.class,i);
		}
		public RuleXCasePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXCasePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXCasePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXCasePart(this);
		}
	}

	public final RuleXCasePartContext ruleXCasePart() throws RecognitionException {
		RuleXCasePartContext _localctx = new RuleXCasePartContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_ruleXCasePart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493);
			_la = _input.LA(1);
			if (_la==17 || _la==52 || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (77 - 77)) | (1L << (81 - 77)) | (1L << (91 - 77)) | (1L << (96 - 77)) | (1L << (103 - 77)) | (1L << (RULE_ID - 77)))) != 0)) {
				{
				setState(1492); ruleJvmTypeReference();
				}
			}

			setState(1497);
			_la = _input.LA(1);
			if (_la==62) {
				{
				setState(1495); match(62);
				setState(1496); ruleXExpression();
				}
			}

			setState(1502);
			switch (_input.LA(1)) {
			case 82:
				{
				setState(1499); match(82);
				setState(1500); ruleXExpression();
				}
				break;
			case 24:
				{
				setState(1501); match(24);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXForLoopExpressionContext extends ParserRuleContext {
		public List<RuleXExpressionContext> ruleXExpression() {
			return getRuleContexts(RuleXExpressionContext.class);
		}
		public RuleJvmFormalParameterContext ruleJvmFormalParameter() {
			return getRuleContext(RuleJvmFormalParameterContext.class,0);
		}
		public RuleXExpressionContext ruleXExpression(int i) {
			return getRuleContext(RuleXExpressionContext.class,i);
		}
		public RuleXForLoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXForLoopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXForLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXForLoopExpression(this);
		}
	}

	public final RuleXForLoopExpressionContext ruleXForLoopExpression() throws RecognitionException {
		RuleXForLoopExpressionContext _localctx = new RuleXForLoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_ruleXForLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(1504); match(93);
			setState(1505); match(81);
			setState(1506); ruleJvmFormalParameter();
			setState(1507); match(82);
			}
			}
			setState(1509); ruleXExpression();
			setState(1510); match(11);
			setState(1511); ruleXExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXBasicForLoopExpressionContext extends ParserRuleContext {
		public List<RuleXExpressionContext> ruleXExpression() {
			return getRuleContexts(RuleXExpressionContext.class);
		}
		public List<RuleXExpressionOrVarDeclarationContext> ruleXExpressionOrVarDeclaration() {
			return getRuleContexts(RuleXExpressionOrVarDeclarationContext.class);
		}
		public RuleXExpressionContext ruleXExpression(int i) {
			return getRuleContext(RuleXExpressionContext.class,i);
		}
		public RuleXExpressionOrVarDeclarationContext ruleXExpressionOrVarDeclaration(int i) {
			return getRuleContext(RuleXExpressionOrVarDeclarationContext.class,i);
		}
		public RuleXBasicForLoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXBasicForLoopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXBasicForLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXBasicForLoopExpression(this);
		}
	}

	public final RuleXBasicForLoopExpressionContext ruleXBasicForLoopExpression() throws RecognitionException {
		RuleXBasicForLoopExpressionContext _localctx = new RuleXBasicForLoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_ruleXBasicForLoopExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1513); match(93);
			setState(1514); match(81);
			setState(1523);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 13) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 40) | (1L << 42) | (1L << 48) | (1L << 50) | (1L << 52) | (1L << 54) | (1L << 56) | (1L << 61) | (1L << 63))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (67 - 67)) | (1L << (69 - 67)) | (1L << (70 - 67)) | (1L << (73 - 67)) | (1L << (74 - 67)) | (1L << (76 - 67)) | (1L << (77 - 67)) | (1L << (79 - 67)) | (1L << (81 - 67)) | (1L << (83 - 67)) | (1L << (84 - 67)) | (1L << (85 - 67)) | (1L << (86 - 67)) | (1L << (87 - 67)) | (1L << (88 - 67)) | (1L << (90 - 67)) | (1L << (93 - 67)) | (1L << (94 - 67)) | (1L << (96 - 67)) | (1L << (98 - 67)) | (1L << (100 - 67)) | (1L << (101 - 67)) | (1L << (102 - 67)) | (1L << (103 - 67)) | (1L << (RULE_ID - 67)) | (1L << (RULE_RICH_TEXT - 67)) | (1L << (RULE_RICH_TEXT_START - 67)) | (1L << (RULE_HEX - 67)) | (1L << (RULE_INT - 67)) | (1L << (RULE_DECIMAL - 67)) | (1L << (RULE_STRING - 67)))) != 0)) {
				{
				setState(1515); ruleXExpressionOrVarDeclaration();
				setState(1520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==24) {
					{
					{
					setState(1516); match(24);
					setState(1517); ruleXExpressionOrVarDeclaration();
					}
					}
					setState(1522);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1525); match(99);
			setState(1527);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 13) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 40) | (1L << 42) | (1L << 48) | (1L << 50) | (1L << 52) | (1L << 54) | (1L << 56) | (1L << 61) | (1L << 63))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (67 - 67)) | (1L << (70 - 67)) | (1L << (73 - 67)) | (1L << (74 - 67)) | (1L << (76 - 67)) | (1L << (77 - 67)) | (1L << (79 - 67)) | (1L << (81 - 67)) | (1L << (84 - 67)) | (1L << (85 - 67)) | (1L << (86 - 67)) | (1L << (87 - 67)) | (1L << (88 - 67)) | (1L << (90 - 67)) | (1L << (93 - 67)) | (1L << (94 - 67)) | (1L << (96 - 67)) | (1L << (98 - 67)) | (1L << (100 - 67)) | (1L << (101 - 67)) | (1L << (102 - 67)) | (1L << (103 - 67)) | (1L << (RULE_ID - 67)) | (1L << (RULE_RICH_TEXT - 67)) | (1L << (RULE_RICH_TEXT_START - 67)) | (1L << (RULE_HEX - 67)) | (1L << (RULE_INT - 67)) | (1L << (RULE_DECIMAL - 67)) | (1L << (RULE_STRING - 67)))) != 0)) {
				{
				setState(1526); ruleXExpression();
				}
			}

			setState(1529); match(99);
			setState(1538);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 13) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 40) | (1L << 42) | (1L << 48) | (1L << 50) | (1L << 52) | (1L << 54) | (1L << 56) | (1L << 61) | (1L << 63))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (67 - 67)) | (1L << (70 - 67)) | (1L << (73 - 67)) | (1L << (74 - 67)) | (1L << (76 - 67)) | (1L << (77 - 67)) | (1L << (79 - 67)) | (1L << (81 - 67)) | (1L << (84 - 67)) | (1L << (85 - 67)) | (1L << (86 - 67)) | (1L << (87 - 67)) | (1L << (88 - 67)) | (1L << (90 - 67)) | (1L << (93 - 67)) | (1L << (94 - 67)) | (1L << (96 - 67)) | (1L << (98 - 67)) | (1L << (100 - 67)) | (1L << (101 - 67)) | (1L << (102 - 67)) | (1L << (103 - 67)) | (1L << (RULE_ID - 67)) | (1L << (RULE_RICH_TEXT - 67)) | (1L << (RULE_RICH_TEXT_START - 67)) | (1L << (RULE_HEX - 67)) | (1L << (RULE_INT - 67)) | (1L << (RULE_DECIMAL - 67)) | (1L << (RULE_STRING - 67)))) != 0)) {
				{
				setState(1530); ruleXExpression();
				setState(1535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==24) {
					{
					{
					setState(1531); match(24);
					setState(1532); ruleXExpression();
					}
					}
					setState(1537);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1540); match(11);
			setState(1541); ruleXExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXWhileExpressionContext extends ParserRuleContext {
		public List<RuleXExpressionContext> ruleXExpression() {
			return getRuleContexts(RuleXExpressionContext.class);
		}
		public RuleXExpressionContext ruleXExpression(int i) {
			return getRuleContext(RuleXExpressionContext.class,i);
		}
		public RuleXWhileExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXWhileExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXWhileExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXWhileExpression(this);
		}
	}

	public final RuleXWhileExpressionContext ruleXWhileExpression() throws RecognitionException {
		RuleXWhileExpressionContext _localctx = new RuleXWhileExpressionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_ruleXWhileExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543); match(25);
			setState(1544); match(81);
			setState(1545); ruleXExpression();
			setState(1546); match(11);
			setState(1547); ruleXExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXDoWhileExpressionContext extends ParserRuleContext {
		public List<RuleXExpressionContext> ruleXExpression() {
			return getRuleContexts(RuleXExpressionContext.class);
		}
		public RuleXExpressionContext ruleXExpression(int i) {
			return getRuleContext(RuleXExpressionContext.class,i);
		}
		public RuleXDoWhileExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXDoWhileExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXDoWhileExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXDoWhileExpression(this);
		}
	}

	public final RuleXDoWhileExpressionContext ruleXDoWhileExpression() throws RecognitionException {
		RuleXDoWhileExpressionContext _localctx = new RuleXDoWhileExpressionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_ruleXDoWhileExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1549); match(9);
			setState(1550); ruleXExpression();
			setState(1551); match(25);
			setState(1552); match(81);
			setState(1553); ruleXExpression();
			setState(1554); match(11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXBlockExpressionContext extends ParserRuleContext {
		public List<RuleXExpressionOrVarDeclarationContext> ruleXExpressionOrVarDeclaration() {
			return getRuleContexts(RuleXExpressionOrVarDeclarationContext.class);
		}
		public RuleXExpressionOrVarDeclarationContext ruleXExpressionOrVarDeclaration(int i) {
			return getRuleContext(RuleXExpressionOrVarDeclarationContext.class,i);
		}
		public RuleXBlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXBlockExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXBlockExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXBlockExpression(this);
		}
	}

	public final RuleXBlockExpressionContext ruleXBlockExpression() throws RecognitionException {
		RuleXBlockExpressionContext _localctx = new RuleXBlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_ruleXBlockExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556); match(87);
			setState(1563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 13) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 40) | (1L << 42) | (1L << 48) | (1L << 50) | (1L << 52) | (1L << 54) | (1L << 56) | (1L << 61) | (1L << 63))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (67 - 67)) | (1L << (69 - 67)) | (1L << (70 - 67)) | (1L << (73 - 67)) | (1L << (74 - 67)) | (1L << (76 - 67)) | (1L << (77 - 67)) | (1L << (79 - 67)) | (1L << (81 - 67)) | (1L << (83 - 67)) | (1L << (84 - 67)) | (1L << (85 - 67)) | (1L << (86 - 67)) | (1L << (87 - 67)) | (1L << (88 - 67)) | (1L << (90 - 67)) | (1L << (93 - 67)) | (1L << (94 - 67)) | (1L << (96 - 67)) | (1L << (98 - 67)) | (1L << (100 - 67)) | (1L << (101 - 67)) | (1L << (102 - 67)) | (1L << (103 - 67)) | (1L << (RULE_ID - 67)) | (1L << (RULE_RICH_TEXT - 67)) | (1L << (RULE_RICH_TEXT_START - 67)) | (1L << (RULE_HEX - 67)) | (1L << (RULE_INT - 67)) | (1L << (RULE_DECIMAL - 67)) | (1L << (RULE_STRING - 67)))) != 0)) {
				{
				{
				setState(1557); ruleXExpressionOrVarDeclaration();
				setState(1559);
				_la = _input.LA(1);
				if (_la==99) {
					{
					setState(1558); match(99);
					}
				}

				}
				}
				setState(1565);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1566); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXExpressionOrVarDeclarationContext extends ParserRuleContext {
		public RuleXExpressionContext ruleXExpression() {
			return getRuleContext(RuleXExpressionContext.class,0);
		}
		public RuleXVariableDeclarationContext ruleXVariableDeclaration() {
			return getRuleContext(RuleXVariableDeclarationContext.class,0);
		}
		public RuleXExpressionOrVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXExpressionOrVarDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXExpressionOrVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXExpressionOrVarDeclaration(this);
		}
	}

	public final RuleXExpressionOrVarDeclarationContext ruleXExpressionOrVarDeclaration() throws RecognitionException {
		RuleXExpressionOrVarDeclarationContext _localctx = new RuleXExpressionOrVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_ruleXExpressionOrVarDeclaration);
		try {
			setState(1570);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1568); ruleXVariableDeclaration();
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1569); ruleXExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXFeatureCallContext extends ParserRuleContext {
		public List<RuleXExpressionContext> ruleXExpression() {
			return getRuleContexts(RuleXExpressionContext.class);
		}
		public List<RuleJvmArgumentTypeReferenceContext> ruleJvmArgumentTypeReference() {
			return getRuleContexts(RuleJvmArgumentTypeReferenceContext.class);
		}
		public RuleXShortClosureContext ruleXShortClosure() {
			return getRuleContext(RuleXShortClosureContext.class,0);
		}
		public RuleXClosureContext ruleXClosure() {
			return getRuleContext(RuleXClosureContext.class,0);
		}
		public RuleJvmArgumentTypeReferenceContext ruleJvmArgumentTypeReference(int i) {
			return getRuleContext(RuleJvmArgumentTypeReferenceContext.class,i);
		}
		public RuleXExpressionContext ruleXExpression(int i) {
			return getRuleContext(RuleXExpressionContext.class,i);
		}
		public RuleIdOrSuperContext ruleIdOrSuper() {
			return getRuleContext(RuleIdOrSuperContext.class,0);
		}
		public RuleXFeatureCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXFeatureCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXFeatureCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXFeatureCall(this);
		}
	}

	public final RuleXFeatureCallContext ruleXFeatureCall() throws RecognitionException {
		RuleXFeatureCallContext _localctx = new RuleXFeatureCallContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_ruleXFeatureCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1583);
			_la = _input.LA(1);
			if (_la==56) {
				{
				setState(1572); match(56);
				setState(1573); ruleJvmArgumentTypeReference();
				setState(1578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==24) {
					{
					{
					setState(1574); match(24);
					setState(1575); ruleJvmArgumentTypeReference();
					}
					}
					setState(1580);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1581); match(45);
				}
			}

			setState(1585); ruleIdOrSuper();
			setState(1599);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				{
				setState(1586); match(81);
				}
				setState(1596);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					{
					setState(1587); ruleXShortClosure();
					}
					}
					break;

				case 2:
					{
					setState(1588); ruleXExpression();
					setState(1593);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(1589); match(24);
						setState(1590); ruleXExpression();
						}
						}
						setState(1595);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1598); match(11);
				}
				break;
			}
			setState(1602);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				{
				setState(1601); ruleXClosure();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleIdOrSuperContext extends ParserRuleContext {
		public RuleFeatureCallIDContext ruleFeatureCallID() {
			return getRuleContext(RuleFeatureCallIDContext.class,0);
		}
		public RuleIdOrSuperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleIdOrSuper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleIdOrSuper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleIdOrSuper(this);
		}
	}

	public final RuleIdOrSuperContext ruleIdOrSuper() throws RecognitionException {
		RuleIdOrSuperContext _localctx = new RuleIdOrSuperContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_ruleIdOrSuper);
		try {
			setState(1606);
			switch (_input.LA(1)) {
			case 1:
			case 6:
			case 8:
			case 15:
			case 17:
			case 19:
			case 28:
			case 33:
			case 34:
			case 40:
			case 52:
			case 61:
			case 67:
			case 73:
			case 74:
			case 76:
			case 77:
			case 79:
			case 85:
			case 86:
			case 88:
			case 90:
			case 94:
			case 96:
			case 100:
			case 101:
			case 102:
			case 103:
			case RULE_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1604); ruleFeatureCallID();
				}
				break;
			case 63:
				enterOuterAlt(_localctx, 2);
				{
				setState(1605); match(63);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXBooleanLiteralContext extends ParserRuleContext {
		public RuleXBooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXBooleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXBooleanLiteral(this);
		}
	}

	public final RuleXBooleanLiteralContext ruleXBooleanLiteral() throws RecognitionException {
		RuleXBooleanLiteralContext _localctx = new RuleXBooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_ruleXBooleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			_la = _input.LA(1);
			if ( !(_la==4 || _la==36) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXNullLiteralContext extends ParserRuleContext {
		public RuleXNullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXNullLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXNullLiteral(this);
		}
	}

	public final RuleXNullLiteralContext ruleXNullLiteral() throws RecognitionException {
		RuleXNullLiteralContext _localctx = new RuleXNullLiteralContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_ruleXNullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1610); match(18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXNumberLiteralContext extends ParserRuleContext {
		public RuleNumberContext ruleNumber() {
			return getRuleContext(RuleNumberContext.class,0);
		}
		public RuleXNumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXNumberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXNumberLiteral(this);
		}
	}

	public final RuleXNumberLiteralContext ruleXNumberLiteral() throws RecognitionException {
		RuleXNumberLiteralContext _localctx = new RuleXNumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_ruleXNumberLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1612); ruleNumber();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXTypeLiteralContext extends ParserRuleContext {
		public RuleArrayBracketsContext ruleArrayBrackets(int i) {
			return getRuleContext(RuleArrayBracketsContext.class,i);
		}
		public List<RuleArrayBracketsContext> ruleArrayBrackets() {
			return getRuleContexts(RuleArrayBracketsContext.class);
		}
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleXTypeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXTypeLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXTypeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXTypeLiteral(this);
		}
	}

	public final RuleXTypeLiteralContext ruleXTypeLiteral() throws RecognitionException {
		RuleXTypeLiteralContext _localctx = new RuleXTypeLiteralContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_ruleXTypeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1614); match(16);
			setState(1615); match(81);
			setState(1616); ruleQualifiedName();
			setState(1620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==54) {
				{
				{
				setState(1617); ruleArrayBrackets();
				}
				}
				setState(1622);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1623); match(11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXThrowExpressionContext extends ParserRuleContext {
		public RuleXExpressionContext ruleXExpression() {
			return getRuleContext(RuleXExpressionContext.class,0);
		}
		public RuleXThrowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXThrowExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXThrowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXThrowExpression(this);
		}
	}

	public final RuleXThrowExpressionContext ruleXThrowExpression() throws RecognitionException {
		RuleXThrowExpressionContext _localctx = new RuleXThrowExpressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_ruleXThrowExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1625); match(13);
			setState(1626); ruleXExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXReturnExpressionContext extends ParserRuleContext {
		public RuleXExpressionContext ruleXExpression() {
			return getRuleContext(RuleXExpressionContext.class,0);
		}
		public RuleXReturnExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXReturnExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXReturnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXReturnExpression(this);
		}
	}

	public final RuleXReturnExpressionContext ruleXReturnExpression() throws RecognitionException {
		RuleXReturnExpressionContext _localctx = new RuleXReturnExpressionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_ruleXReturnExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628); match(98);
			setState(1630);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1629); ruleXExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXTryCatchFinallyExpressionContext extends ParserRuleContext {
		public List<RuleXExpressionContext> ruleXExpression() {
			return getRuleContexts(RuleXExpressionContext.class);
		}
		public List<RuleXCatchClauseContext> ruleXCatchClause() {
			return getRuleContexts(RuleXCatchClauseContext.class);
		}
		public RuleXExpressionContext ruleXExpression(int i) {
			return getRuleContext(RuleXExpressionContext.class,i);
		}
		public RuleXCatchClauseContext ruleXCatchClause(int i) {
			return getRuleContext(RuleXCatchClauseContext.class,i);
		}
		public RuleXTryCatchFinallyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXTryCatchFinallyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXTryCatchFinallyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXTryCatchFinallyExpression(this);
		}
	}

	public final RuleXTryCatchFinallyExpressionContext ruleXTryCatchFinallyExpression() throws RecognitionException {
		RuleXTryCatchFinallyExpressionContext _localctx = new RuleXTryCatchFinallyExpressionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_ruleXTryCatchFinallyExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1632); match(84);
			setState(1633); ruleXExpression();
			setState(1645);
			switch (_input.LA(1)) {
			case 89:
				{
				setState(1635); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1634); ruleXCatchClause();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1637); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
				} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
				setState(1641);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					{
					setState(1639); match(72);
					}
					setState(1640); ruleXExpression();
					}
					break;
				}
				}
				break;
			case 72:
				{
				setState(1643); match(72);
				setState(1644); ruleXExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXSynchronizedExpressionContext extends ParserRuleContext {
		public List<RuleXExpressionContext> ruleXExpression() {
			return getRuleContexts(RuleXExpressionContext.class);
		}
		public RuleXExpressionContext ruleXExpression(int i) {
			return getRuleContext(RuleXExpressionContext.class,i);
		}
		public RuleXSynchronizedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXSynchronizedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXSynchronizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXSynchronizedExpression(this);
		}
	}

	public final RuleXSynchronizedExpressionContext ruleXSynchronizedExpression() throws RecognitionException {
		RuleXSynchronizedExpressionContext _localctx = new RuleXSynchronizedExpressionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_ruleXSynchronizedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(1647); match(79);
			setState(1648); match(81);
			}
			}
			setState(1650); ruleXExpression();
			setState(1651); match(11);
			setState(1652); ruleXExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXCatchClauseContext extends ParserRuleContext {
		public RuleXExpressionContext ruleXExpression() {
			return getRuleContext(RuleXExpressionContext.class,0);
		}
		public RuleFullJvmFormalParameterContext ruleFullJvmFormalParameter() {
			return getRuleContext(RuleFullJvmFormalParameterContext.class,0);
		}
		public RuleXCatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXCatchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXCatchClause(this);
		}
	}

	public final RuleXCatchClauseContext ruleXCatchClause() throws RecognitionException {
		RuleXCatchClauseContext _localctx = new RuleXCatchClauseContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_ruleXCatchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1654); match(89);
			}
			setState(1655); match(81);
			setState(1656); ruleFullJvmFormalParameter();
			setState(1657); match(11);
			setState(1658); ruleXExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleQualifiedNameContext extends ParserRuleContext {
		public RuleValidIDContext ruleValidID(int i) {
			return getRuleContext(RuleValidIDContext.class,i);
		}
		public List<RuleValidIDContext> ruleValidID() {
			return getRuleContexts(RuleValidIDContext.class);
		}
		public RuleQualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleQualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleQualifiedName(this);
		}
	}

	public final RuleQualifiedNameContext ruleQualifiedName() throws RecognitionException {
		RuleQualifiedNameContext _localctx = new RuleQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_ruleQualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1660); ruleValidID();
			setState(1665);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(1661); match(41);
					}
					setState(1662); ruleValidID();
					}
					} 
				}
				setState(1667);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleNumberContext extends ParserRuleContext {
		public TerminalNode RULE_INT(int i) {
			return getToken(XtendParser.RULE_INT, i);
		}
		public List<TerminalNode> RULE_INT() { return getTokens(XtendParser.RULE_INT); }
		public TerminalNode RULE_HEX() { return getToken(XtendParser.RULE_HEX, 0); }
		public TerminalNode RULE_DECIMAL(int i) {
			return getToken(XtendParser.RULE_DECIMAL, i);
		}
		public List<TerminalNode> RULE_DECIMAL() { return getTokens(XtendParser.RULE_DECIMAL); }
		public RuleNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleNumber(this);
		}
	}

	public final RuleNumberContext ruleNumber() throws RecognitionException {
		RuleNumberContext _localctx = new RuleNumberContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_ruleNumber);
		int _la;
		try {
			setState(1674);
			switch (_input.LA(1)) {
			case RULE_HEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(1668); match(RULE_HEX);
				}
				break;
			case RULE_INT:
			case RULE_DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1669);
				_la = _input.LA(1);
				if ( !(_la==RULE_INT || _la==RULE_DECIMAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1672);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1670); match(41);
					setState(1671);
					_la = _input.LA(1);
					if ( !(_la==RULE_INT || _la==RULE_DECIMAL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleJvmTypeReferenceContext extends ParserRuleContext {
		public RuleXFunctionTypeRefContext ruleXFunctionTypeRef() {
			return getRuleContext(RuleXFunctionTypeRefContext.class,0);
		}
		public RuleArrayBracketsContext ruleArrayBrackets(int i) {
			return getRuleContext(RuleArrayBracketsContext.class,i);
		}
		public RuleJvmParameterizedTypeReferenceContext ruleJvmParameterizedTypeReference() {
			return getRuleContext(RuleJvmParameterizedTypeReferenceContext.class,0);
		}
		public List<RuleArrayBracketsContext> ruleArrayBrackets() {
			return getRuleContexts(RuleArrayBracketsContext.class);
		}
		public RuleJvmTypeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleJvmTypeReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleJvmTypeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleJvmTypeReference(this);
		}
	}

	public final RuleJvmTypeReferenceContext ruleJvmTypeReference() throws RecognitionException {
		RuleJvmTypeReferenceContext _localctx = new RuleJvmTypeReferenceContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_ruleJvmTypeReference);
		try {
			int _alt;
			setState(1684);
			switch (_input.LA(1)) {
			case 17:
			case 52:
			case 77:
			case 96:
			case 103:
			case RULE_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1676); ruleJvmParameterizedTypeReference();
				setState(1680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1677); ruleArrayBrackets();
						}
						} 
					}
					setState(1682);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
				}
				}
				break;
			case 81:
			case 91:
				enterOuterAlt(_localctx, 2);
				{
				setState(1683); ruleXFunctionTypeRef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleArrayBracketsContext extends ParserRuleContext {
		public RuleArrayBracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleArrayBrackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleArrayBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleArrayBrackets(this);
		}
	}

	public final RuleArrayBracketsContext ruleArrayBrackets() throws RecognitionException {
		RuleArrayBracketsContext _localctx = new RuleArrayBracketsContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_ruleArrayBrackets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1686); match(54);
			setState(1687); match(75);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXFunctionTypeRefContext extends ParserRuleContext {
		public List<RuleJvmTypeReferenceContext> ruleJvmTypeReference() {
			return getRuleContexts(RuleJvmTypeReferenceContext.class);
		}
		public RuleJvmTypeReferenceContext ruleJvmTypeReference(int i) {
			return getRuleContext(RuleJvmTypeReferenceContext.class,i);
		}
		public RuleXFunctionTypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXFunctionTypeRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXFunctionTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXFunctionTypeRef(this);
		}
	}

	public final RuleXFunctionTypeRefContext ruleXFunctionTypeRef() throws RecognitionException {
		RuleXFunctionTypeRefContext _localctx = new RuleXFunctionTypeRefContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_ruleXFunctionTypeRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
			_la = _input.LA(1);
			if (_la==81) {
				{
				setState(1689); match(81);
				setState(1698);
				_la = _input.LA(1);
				if (_la==17 || _la==52 || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (77 - 77)) | (1L << (81 - 77)) | (1L << (91 - 77)) | (1L << (96 - 77)) | (1L << (103 - 77)) | (1L << (RULE_ID - 77)))) != 0)) {
					{
					setState(1690); ruleJvmTypeReference();
					setState(1695);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==24) {
						{
						{
						setState(1691); match(24);
						setState(1692); ruleJvmTypeReference();
						}
						}
						setState(1697);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1700); match(11);
				}
			}

			setState(1703); match(91);
			setState(1704); ruleJvmTypeReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleJvmParameterizedTypeReferenceContext extends ParserRuleContext {
		public List<RuleJvmArgumentTypeReferenceContext> ruleJvmArgumentTypeReference() {
			return getRuleContexts(RuleJvmArgumentTypeReferenceContext.class);
		}
		public RuleJvmArgumentTypeReferenceContext ruleJvmArgumentTypeReference(int i) {
			return getRuleContext(RuleJvmArgumentTypeReferenceContext.class,i);
		}
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleJvmParameterizedTypeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleJvmParameterizedTypeReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleJvmParameterizedTypeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleJvmParameterizedTypeReference(this);
		}
	}

	public final RuleJvmParameterizedTypeReferenceContext ruleJvmParameterizedTypeReference() throws RecognitionException {
		RuleJvmParameterizedTypeReferenceContext _localctx = new RuleJvmParameterizedTypeReferenceContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_ruleJvmParameterizedTypeReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706); ruleQualifiedName();
			setState(1718);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				{
				setState(1707); match(56);
				}
				setState(1708); ruleJvmArgumentTypeReference();
				setState(1713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==24) {
					{
					{
					setState(1709); match(24);
					setState(1710); ruleJvmArgumentTypeReference();
					}
					}
					setState(1715);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1716); match(45);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleJvmArgumentTypeReferenceContext extends ParserRuleContext {
		public RuleJvmTypeReferenceContext ruleJvmTypeReference() {
			return getRuleContext(RuleJvmTypeReferenceContext.class,0);
		}
		public RuleJvmWildcardTypeReferenceContext ruleJvmWildcardTypeReference() {
			return getRuleContext(RuleJvmWildcardTypeReferenceContext.class,0);
		}
		public RuleJvmArgumentTypeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleJvmArgumentTypeReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleJvmArgumentTypeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleJvmArgumentTypeReference(this);
		}
	}

	public final RuleJvmArgumentTypeReferenceContext ruleJvmArgumentTypeReference() throws RecognitionException {
		RuleJvmArgumentTypeReferenceContext _localctx = new RuleJvmArgumentTypeReferenceContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_ruleJvmArgumentTypeReference);
		try {
			setState(1722);
			switch (_input.LA(1)) {
			case 17:
			case 52:
			case 77:
			case 81:
			case 91:
			case 96:
			case 103:
			case RULE_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1720); ruleJvmTypeReference();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 2);
				{
				setState(1721); ruleJvmWildcardTypeReference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleJvmWildcardTypeReferenceContext extends ParserRuleContext {
		public RuleJvmUpperBoundContext ruleJvmUpperBound() {
			return getRuleContext(RuleJvmUpperBoundContext.class,0);
		}
		public RuleJvmLowerBoundContext ruleJvmLowerBound() {
			return getRuleContext(RuleJvmLowerBoundContext.class,0);
		}
		public RuleJvmWildcardTypeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleJvmWildcardTypeReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleJvmWildcardTypeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleJvmWildcardTypeReference(this);
		}
	}

	public final RuleJvmWildcardTypeReferenceContext ruleJvmWildcardTypeReference() throws RecognitionException {
		RuleJvmWildcardTypeReferenceContext _localctx = new RuleJvmWildcardTypeReferenceContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_ruleJvmWildcardTypeReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724); match(29);
			setState(1727);
			switch (_input.LA(1)) {
			case 88:
				{
				setState(1725); ruleJvmUpperBound();
				}
				break;
			case 63:
				{
				setState(1726); ruleJvmLowerBound();
				}
				break;
			case 24:
			case 45:
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleJvmUpperBoundContext extends ParserRuleContext {
		public RuleJvmTypeReferenceContext ruleJvmTypeReference() {
			return getRuleContext(RuleJvmTypeReferenceContext.class,0);
		}
		public RuleJvmUpperBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleJvmUpperBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleJvmUpperBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleJvmUpperBound(this);
		}
	}

	public final RuleJvmUpperBoundContext ruleJvmUpperBound() throws RecognitionException {
		RuleJvmUpperBoundContext _localctx = new RuleJvmUpperBoundContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_ruleJvmUpperBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1729); match(88);
			setState(1730); ruleJvmTypeReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleJvmUpperBoundAndedContext extends ParserRuleContext {
		public RuleJvmTypeReferenceContext ruleJvmTypeReference() {
			return getRuleContext(RuleJvmTypeReferenceContext.class,0);
		}
		public RuleJvmUpperBoundAndedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleJvmUpperBoundAnded; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleJvmUpperBoundAnded(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleJvmUpperBoundAnded(this);
		}
	}

	public final RuleJvmUpperBoundAndedContext ruleJvmUpperBoundAnded() throws RecognitionException {
		RuleJvmUpperBoundAndedContext _localctx = new RuleJvmUpperBoundAndedContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_ruleJvmUpperBoundAnded);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1732); match(53);
			setState(1733); ruleJvmTypeReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleJvmLowerBoundContext extends ParserRuleContext {
		public RuleJvmTypeReferenceContext ruleJvmTypeReference() {
			return getRuleContext(RuleJvmTypeReferenceContext.class,0);
		}
		public RuleJvmLowerBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleJvmLowerBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleJvmLowerBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleJvmLowerBound(this);
		}
	}

	public final RuleJvmLowerBoundContext ruleJvmLowerBound() throws RecognitionException {
		RuleJvmLowerBoundContext _localctx = new RuleJvmLowerBoundContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_ruleJvmLowerBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1735); match(63);
			setState(1736); ruleJvmTypeReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleJvmTypeParameterContext extends ParserRuleContext {
		public List<RuleJvmUpperBoundAndedContext> ruleJvmUpperBoundAnded() {
			return getRuleContexts(RuleJvmUpperBoundAndedContext.class);
		}
		public RuleJvmUpperBoundContext ruleJvmUpperBound() {
			return getRuleContext(RuleJvmUpperBoundContext.class,0);
		}
		public RuleJvmUpperBoundAndedContext ruleJvmUpperBoundAnded(int i) {
			return getRuleContext(RuleJvmUpperBoundAndedContext.class,i);
		}
		public RuleValidIDContext ruleValidID() {
			return getRuleContext(RuleValidIDContext.class,0);
		}
		public RuleJvmTypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleJvmTypeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleJvmTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleJvmTypeParameter(this);
		}
	}

	public final RuleJvmTypeParameterContext ruleJvmTypeParameter() throws RecognitionException {
		RuleJvmTypeParameterContext _localctx = new RuleJvmTypeParameterContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_ruleJvmTypeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1738); ruleValidID();
			setState(1746);
			_la = _input.LA(1);
			if (_la==88) {
				{
				setState(1739); ruleJvmUpperBound();
				setState(1743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==53) {
					{
					{
					setState(1740); ruleJvmUpperBoundAnded();
					}
					}
					setState(1745);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleQualifiedNameWithWildcardContext extends ParserRuleContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleQualifiedNameWithWildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleQualifiedNameWithWildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleQualifiedNameWithWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleQualifiedNameWithWildcard(this);
		}
	}

	public final RuleQualifiedNameWithWildcardContext ruleQualifiedNameWithWildcard() throws RecognitionException {
		RuleQualifiedNameWithWildcardContext _localctx = new RuleQualifiedNameWithWildcardContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_ruleQualifiedNameWithWildcard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748); ruleQualifiedName();
			setState(1749); match(41);
			setState(1750); match(2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXImportSectionContext extends ParserRuleContext {
		public RuleXImportDeclarationContext ruleXImportDeclaration(int i) {
			return getRuleContext(RuleXImportDeclarationContext.class,i);
		}
		public List<RuleXImportDeclarationContext> ruleXImportDeclaration() {
			return getRuleContexts(RuleXImportDeclarationContext.class);
		}
		public RuleXImportSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXImportSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXImportSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXImportSection(this);
		}
	}

	public final RuleXImportSectionContext ruleXImportSection() throws RecognitionException {
		RuleXImportSectionContext _localctx = new RuleXImportSectionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_ruleXImportSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1753); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1752); ruleXImportDeclaration();
				}
				}
				setState(1755); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==40 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleXImportDeclarationContext extends ParserRuleContext {
		public RuleQualifiedNameInStaticImportContext ruleQualifiedNameInStaticImport() {
			return getRuleContext(RuleQualifiedNameInStaticImportContext.class,0);
		}
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleValidIDContext ruleValidID() {
			return getRuleContext(RuleValidIDContext.class,0);
		}
		public RuleQualifiedNameWithWildcardContext ruleQualifiedNameWithWildcard() {
			return getRuleContext(RuleQualifiedNameWithWildcardContext.class,0);
		}
		public RuleXImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleXImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleXImportDeclaration(this);
		}
	}

	public final RuleXImportDeclarationContext ruleXImportDeclaration() throws RecognitionException {
		RuleXImportDeclarationContext _localctx = new RuleXImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_ruleXImportDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1757); match(40);
			setState(1769);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				{
				setState(1758); match(90);
				setState(1760);
				_la = _input.LA(1);
				if (_la==101) {
					{
					setState(1759); match(101);
					}
				}

				setState(1762); ruleQualifiedNameInStaticImport();
				setState(1765);
				switch (_input.LA(1)) {
				case 2:
					{
					setState(1763); match(2);
					}
					break;
				case 17:
				case 52:
				case 77:
				case 96:
				case 103:
				case RULE_ID:
					{
					setState(1764); ruleValidID();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 2:
				{
				setState(1767); ruleQualifiedName();
				}
				break;

			case 3:
				{
				setState(1768); ruleQualifiedNameWithWildcard();
				}
				break;
			}
			setState(1772);
			_la = _input.LA(1);
			if (_la==99) {
				{
				setState(1771); match(99);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleQualifiedNameInStaticImportContext extends ParserRuleContext {
		public RuleValidIDContext ruleValidID(int i) {
			return getRuleContext(RuleValidIDContext.class,i);
		}
		public List<RuleValidIDContext> ruleValidID() {
			return getRuleContexts(RuleValidIDContext.class);
		}
		public RuleQualifiedNameInStaticImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleQualifiedNameInStaticImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).enterRuleQualifiedNameInStaticImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XtendListener ) ((XtendListener)listener).exitRuleQualifiedNameInStaticImport(this);
		}
	}

	public final RuleQualifiedNameInStaticImportContext ruleQualifiedNameInStaticImport() throws RecognitionException {
		RuleQualifiedNameInStaticImportContext _localctx = new RuleQualifiedNameInStaticImportContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_ruleQualifiedNameInStaticImport);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1777); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1774); ruleValidID();
					setState(1775); match(41);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1779); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3z\u06f8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\3\2\3\2\3\2\5\2\u00de\n\2\5\2\u00e0\n\2\3\2\5\2\u00e3\n"+
		"\2\3\2\7\2\u00e6\n\2\f\2\16\2\u00e9\13\2\3\3\7\3\u00ec\n\3\f\3\16\3\u00ef"+
		"\13\3\3\3\7\3\u00f2\n\3\f\3\16\3\u00f5\13\3\3\3\3\3\3\3\3\3\3\3\3\3\7"+
		"\3\u00fd\n\3\f\3\16\3\u0100\13\3\3\3\3\3\5\3\u0104\n\3\3\3\3\3\5\3\u0108"+
		"\n\3\3\3\3\3\3\3\3\3\7\3\u010e\n\3\f\3\16\3\u0111\13\3\5\3\u0113\n\3\3"+
		"\3\3\3\7\3\u0117\n\3\f\3\16\3\u011a\13\3\3\3\3\3\3\3\7\3\u011f\n\3\f\3"+
		"\16\3\u0122\13\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u012a\n\3\f\3\16\3\u012d"+
		"\13\3\3\3\3\3\5\3\u0131\n\3\3\3\3\3\3\3\3\3\7\3\u0137\n\3\f\3\16\3\u013a"+
		"\13\3\5\3\u013c\n\3\3\3\3\3\7\3\u0140\n\3\f\3\16\3\u0143\13\3\3\3\3\3"+
		"\3\3\7\3\u0148\n\3\f\3\16\3\u014b\13\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0153"+
		"\n\3\f\3\16\3\u0156\13\3\5\3\u0158\n\3\3\3\5\3\u015b\n\3\3\3\3\3\3\3\7"+
		"\3\u0160\n\3\f\3\16\3\u0163\13\3\3\3\3\3\3\3\3\3\7\3\u0169\n\3\f\3\16"+
		"\3\u016c\13\3\3\3\3\3\5\3\u0170\n\3\3\4\7\4\u0173\n\4\f\4\16\4\u0176\13"+
		"\4\3\4\7\4\u0179\n\4\f\4\16\4\u017c\13\4\3\4\3\4\7\4\u0180\n\4\f\4\16"+
		"\4\u0183\13\4\3\4\5\4\u0186\n\4\3\4\3\4\3\4\7\4\u018b\n\4\f\4\16\4\u018e"+
		"\13\4\3\4\3\4\3\4\5\4\u0193\n\4\3\4\3\4\5\4\u0197\n\4\3\4\5\4\u019a\n"+
		"\4\3\4\7\4\u019d\n\4\f\4\16\4\u01a0\13\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u01a8"+
		"\n\4\f\4\16\4\u01ab\13\4\3\4\3\4\5\4\u01af\n\4\3\4\3\4\5\4\u01b3\n\4\3"+
		"\4\3\4\3\4\3\4\7\4\u01b9\n\4\f\4\16\4\u01bc\13\4\5\4\u01be\n\4\3\4\3\4"+
		"\7\4\u01c2\n\4\f\4\16\4\u01c5\13\4\3\4\3\4\3\4\7\4\u01ca\n\4\f\4\16\4"+
		"\u01cd\13\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u01d5\n\4\f\4\16\4\u01d8\13\4"+
		"\3\4\3\4\5\4\u01dc\n\4\3\4\3\4\3\4\3\4\7\4\u01e2\n\4\f\4\16\4\u01e5\13"+
		"\4\5\4\u01e7\n\4\3\4\3\4\7\4\u01eb\n\4\f\4\16\4\u01ee\13\4\3\4\3\4\3\4"+
		"\7\4\u01f3\n\4\f\4\16\4\u01f6\13\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u01fe\n"+
		"\4\f\4\16\4\u0201\13\4\5\4\u0203\n\4\3\4\5\4\u0206\n\4\3\4\3\4\3\4\7\4"+
		"\u020b\n\4\f\4\16\4\u020e\13\4\3\4\3\4\3\4\3\4\7\4\u0214\n\4\f\4\16\4"+
		"\u0217\13\4\3\4\3\4\5\4\u021b\n\4\3\5\7\5\u021e\n\5\f\5\16\5\u0221\13"+
		"\5\3\5\7\5\u0224\n\5\f\5\16\5\u0227\13\5\3\5\3\5\7\5\u022b\n\5\f\5\16"+
		"\5\u022e\13\5\3\5\5\5\u0231\n\5\3\5\3\5\3\5\3\5\3\5\7\5\u0238\n\5\f\5"+
		"\16\5\u023b\13\5\3\5\3\5\5\5\u023f\n\5\3\5\3\5\7\5\u0243\n\5\f\5\16\5"+
		"\u0246\13\5\3\5\3\5\7\5\u024a\n\5\f\5\16\5\u024d\13\5\3\5\3\5\5\5\u0251"+
		"\n\5\3\5\3\5\3\5\5\5\u0256\n\5\3\5\3\5\5\5\u025a\n\5\3\5\5\5\u025d\n\5"+
		"\3\5\7\5\u0260\n\5\f\5\16\5\u0263\13\5\3\5\3\5\3\5\7\5\u0268\n\5\f\5\16"+
		"\5\u026b\13\5\3\5\3\5\3\5\3\5\7\5\u0271\n\5\f\5\16\5\u0274\13\5\3\5\3"+
		"\5\5\5\u0278\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u028e\n\5\3\5\3\5\3\5\7\5\u0293\n\5\f\5"+
		"\16\5\u0296\13\5\5\5\u0298\n\5\3\5\3\5\3\5\3\5\3\5\7\5\u029f\n\5\f\5\16"+
		"\5\u02a2\13\5\5\5\u02a4\n\5\3\5\3\5\3\5\5\5\u02a9\n\5\3\5\7\5\u02ac\n"+
		"\5\f\5\16\5\u02af\13\5\3\5\3\5\3\5\3\5\3\5\7\5\u02b6\n\5\f\5\16\5\u02b9"+
		"\13\5\3\5\3\5\5\5\u02bd\n\5\3\5\3\5\3\5\3\5\7\5\u02c3\n\5\f\5\16\5\u02c6"+
		"\13\5\5\5\u02c8\n\5\3\5\3\5\3\5\3\5\3\5\7\5\u02cf\n\5\f\5\16\5\u02d2\13"+
		"\5\5\5\u02d4\n\5\3\5\3\5\7\5\u02d8\n\5\f\5\16\5\u02db\13\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\7\5\u02e3\n\5\f\5\16\5\u02e6\13\5\3\5\3\5\5\5\u02ea\n\5\3"+
		"\5\3\5\5\5\u02ee\n\5\3\5\3\5\3\5\3\5\7\5\u02f4\n\5\f\5\16\5\u02f7\13\5"+
		"\5\5\u02f9\n\5\3\5\3\5\7\5\u02fd\n\5\f\5\16\5\u0300\13\5\3\5\3\5\3\5\7"+
		"\5\u0305\n\5\f\5\16\5\u0308\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0310\n\5"+
		"\f\5\16\5\u0313\13\5\3\5\3\5\5\5\u0317\n\5\3\5\3\5\3\5\3\5\7\5\u031d\n"+
		"\5\f\5\16\5\u0320\13\5\5\5\u0322\n\5\3\5\3\5\7\5\u0326\n\5\f\5\16\5\u0329"+
		"\13\5\3\5\3\5\3\5\7\5\u032e\n\5\f\5\16\5\u0331\13\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5\u0339\n\5\f\5\16\5\u033c\13\5\5\5\u033e\n\5\3\5\5\5\u0341\n"+
		"\5\3\5\3\5\3\5\7\5\u0346\n\5\f\5\16\5\u0349\13\5\3\5\3\5\3\5\3\5\7\5\u034f"+
		"\n\5\f\5\16\5\u0352\13\5\3\5\3\5\5\5\u0356\n\5\3\6\3\6\3\7\3\7\5\7\u035c"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0367\n\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0375\n\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\5\17\u037d\n\17\3\20\3\20\3\21\7\21\u0382\n\21\f\21\16\21\u0385"+
		"\13\21\3\21\3\21\7\21\u0389\n\21\f\21\16\21\u038c\13\21\5\21\u038e\n\21"+
		"\3\21\3\21\5\21\u0392\n\21\3\21\3\21\3\22\3\22\5\22\u0398\n\22\3\22\3"+
		"\22\5\22\u039c\n\22\3\22\3\22\3\22\3\22\5\22\u03a2\n\22\3\22\3\22\5\22"+
		"\u03a6\n\22\3\23\3\23\3\23\7\23\u03ab\n\23\f\23\16\23\u03ae\13\23\3\23"+
		"\5\23\u03b1\n\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u03b9\n\24\f\24\16"+
		"\24\u03bc\13\24\3\24\3\24\5\24\u03c0\n\24\3\24\3\24\3\24\3\24\3\24\7\24"+
		"\u03c7\n\24\f\24\16\24\u03ca\13\24\5\24\u03cc\n\24\3\24\5\24\u03cf\n\24"+
		"\3\24\5\24\u03d2\n\24\3\25\5\25\u03d5\n\25\3\25\5\25\u03d8\n\25\3\25\3"+
		"\25\3\26\5\26\u03dd\n\26\3\26\3\26\3\26\3\27\3\27\5\27\u03e4\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u03f1\n\30\3\30"+
		"\5\30\u03f4\n\30\3\30\3\30\7\30\u03f8\n\30\f\30\16\30\u03fb\13\30\3\30"+
		"\3\30\3\30\5\30\u0400\n\30\3\30\3\30\3\31\3\31\5\31\u0406\n\31\3\32\3"+
		"\32\3\33\3\33\3\33\5\33\u040d\n\33\3\33\3\33\5\33\u0411\n\33\7\33\u0413"+
		"\n\33\f\33\16\33\u0416\13\33\3\33\3\33\5\33\u041a\n\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \5 \u0426\n \3 \7 \u0429\n \f \16 \u042c"+
		"\13 \3!\3!\3!\5!\u0431\n!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0439\n\"\3\"\3"+
		"\"\5\"\u043d\n\"\3\"\3\"\5\"\u0441\n\"\3\"\3\"\3\"\3#\3#\3#\3#\7#\u044a"+
		"\n#\f#\16#\u044d\13#\3#\3#\5#\u0451\n#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3%\7%\u045f\n%\f%\16%\u0462\13%\3%\5%\u0465\n%\3%\5%\u0468\n%\3&\3&"+
		"\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0475\n\'\f\'\16\'\u0478\13\'\5"+
		"\'\u047a\n\'\3\'\3\'\3\'\3\'\6\'\u0480\n\'\r\'\16\'\u0481\5\'\u0484\n"+
		"\'\5\'\u0486\n\'\3(\3(\3(\3(\3(\3(\7(\u048e\n(\f(\16(\u0491\13(\5(\u0493"+
		"\n(\3(\3(\5(\u0497\n(\3)\3)\5)\u049b\n)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\5+\u04a7\n+\5+\u04a9\n+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u04b7"+
		"\n-\3-\5-\u04ba\n-\3.\3.\3.\3.\7.\u04c0\n.\f.\16.\u04c3\13.\3/\3/\3\60"+
		"\3\60\3\60\3\60\7\60\u04cb\n\60\f\60\16\60\u04ce\13\60\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\7\62\u04d6\n\62\f\62\16\62\u04d9\13\62\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\7\64\u04e3\n\64\f\64\16\64\u04e6\13\64\3\65"+
		"\3\65\3\65\3\65\3\65\5\65\u04ed\n\65\3\66\3\66\3\66\3\66\7\66\u04f3\n"+
		"\66\f\66\16\66\u04f6\13\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\5\67\u0502\n\67\3\67\3\67\3\67\3\67\3\67\5\67\u0509\n\67\3\67\3"+
		"\67\5\67\u050d\n\67\38\38\38\38\78\u0513\n8\f8\168\u0516\138\39\39\3:"+
		"\3:\3:\3:\7:\u051e\n:\f:\16:\u0521\13:\3;\3;\3<\3<\3<\3<\5<\u0529\n<\3"+
		"=\3=\3>\3>\3>\7>\u0530\n>\f>\16>\u0533\13>\3?\3?\5?\u0537\n?\3@\3@\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\7A\u0547\nA\fA\16A\u054a\13A\3A\3A\5"+
		"A\u054e\nA\3A\3A\3A\3A\3A\3A\7A\u0556\nA\fA\16A\u0559\13A\5A\u055b\nA"+
		"\3A\5A\u055e\nA\3A\5A\u0561\nA\7A\u0563\nA\fA\16A\u0566\13A\3B\3B\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u0577\nB\3C\3C\3C\3C\3C\3C\3C\5"+
		"C\u0580\nC\3D\3D\5D\u0584\nD\3E\3E\3E\3E\3E\7E\u058b\nE\fE\16E\u058e\13"+
		"E\5E\u0590\nE\3E\3E\3F\3F\3F\3F\3F\7F\u0599\nF\fF\16F\u059c\13F\5F\u059e"+
		"\nF\3F\3F\3G\3G\3G\3G\7G\u05a6\nG\fG\16G\u05a9\13G\5G\u05ab\nG\3G\5G\u05ae"+
		"\nG\3G\3G\3G\3H\3H\5H\u05b5\nH\7H\u05b7\nH\fH\16H\u05ba\13H\3I\3I\3I\7"+
		"I\u05bf\nI\fI\16I\u05c2\13I\5I\u05c4\nI\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K"+
		"\3K\3K\3K\3K\3K\5K\u05d5\nK\3L\5L\u05d8\nL\3L\3L\5L\u05dc\nL\3L\3L\3L"+
		"\5L\u05e1\nL\3M\3M\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\7N\u05f1\nN\fN"+
		"\16N\u05f4\13N\5N\u05f6\nN\3N\3N\5N\u05fa\nN\3N\3N\3N\3N\7N\u0600\nN\f"+
		"N\16N\u0603\13N\5N\u0605\nN\3N\3N\3N\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P"+
		"\3P\3P\3Q\3Q\3Q\5Q\u061a\nQ\7Q\u061c\nQ\fQ\16Q\u061f\13Q\3Q\3Q\3R\3R\5"+
		"R\u0625\nR\3S\3S\3S\3S\7S\u062b\nS\fS\16S\u062e\13S\3S\3S\5S\u0632\nS"+
		"\3S\3S\3S\3S\3S\3S\7S\u063a\nS\fS\16S\u063d\13S\5S\u063f\nS\3S\5S\u0642"+
		"\nS\3S\5S\u0645\nS\3T\3T\5T\u0649\nT\3U\3U\3V\3V\3W\3W\3X\3X\3X\3X\7X"+
		"\u0655\nX\fX\16X\u0658\13X\3X\3X\3Y\3Y\3Y\3Z\3Z\5Z\u0661\nZ\3[\3[\3[\6"+
		"[\u0666\n[\r[\16[\u0667\3[\3[\5[\u066c\n[\3[\3[\5[\u0670\n[\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3^\3^\3^\7^\u0682\n^\f^\16^\u0685"+
		"\13^\3_\3_\3_\3_\5_\u068b\n_\5_\u068d\n_\3`\3`\7`\u0691\n`\f`\16`\u0694"+
		"\13`\3`\5`\u0697\n`\3a\3a\3a\3b\3b\3b\3b\7b\u06a0\nb\fb\16b\u06a3\13b"+
		"\5b\u06a5\nb\3b\5b\u06a8\nb\3b\3b\3b\3c\3c\3c\3c\3c\7c\u06b2\nc\fc\16"+
		"c\u06b5\13c\3c\3c\5c\u06b9\nc\3d\3d\5d\u06bd\nd\3e\3e\3e\5e\u06c2\ne\3"+
		"f\3f\3f\3g\3g\3g\3h\3h\3h\3i\3i\3i\7i\u06d0\ni\fi\16i\u06d3\13i\5i\u06d5"+
		"\ni\3j\3j\3j\3j\3k\6k\u06dc\nk\rk\16k\u06dd\3l\3l\3l\5l\u06e3\nl\3l\3"+
		"l\3l\5l\u06e8\nl\3l\3l\5l\u06ec\nl\3l\5l\u06ef\nl\3m\3m\3m\6m\u06f4\n"+
		"m\rm\16m\u06f5\3m\2\2n\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\2\22\16\2\b\b\n\n\21\21\36\36#$KKNNQQW"+
		"W\\\\``ff\4\2GGUU\4\2??XX\b\2\23\23\66\66OObbiill\31\2\3\3\b\b\n\n\21"+
		"\21\23\23\25\25\36\36#$**\66\66??EEKLNOQQWXZZ\\\\``bbffhill\3\2pq\4\2"+
		"oorr\5\2;<ccjj\4\2\34\34,,\6\2\4\4\63\63BBRR\5\2\27\27\34\34,,\4\2((9"+
		"9\4\2\16\16++\5\2\16\16++^^\4\2\6\6&&\3\2tu\u07bd\2\u00df\3\2\2\2\4\u00ed"+
		"\3\2\2\2\6\u0174\3\2\2\2\b\u021f\3\2\2\2\n\u0357\3\2\2\2\f\u035b\3\2\2"+
		"\2\16\u0366\3\2\2\2\20\u0368\3\2\2\2\22\u036a\3\2\2\2\24\u036c\3\2\2\2"+
		"\26\u036e\3\2\2\2\30\u0370\3\2\2\2\32\u0378\3\2\2\2\34\u037c\3\2\2\2\36"+
		"\u037e\3\2\2\2 \u0383\3\2\2\2\"\u039b\3\2\2\2$\u03a7\3\2\2\2&\u03b2\3"+
		"\2\2\2(\u03d4\3\2\2\2*\u03dc\3\2\2\2,\u03e3\3\2\2\2.\u03e5\3\2\2\2\60"+
		"\u0405\3\2\2\2\62\u0407\3\2\2\2\64\u0419\3\2\2\2\66\u041b\3\2\2\28\u041d"+
		"\3\2\2\2:\u041f\3\2\2\2<\u0421\3\2\2\2>\u0423\3\2\2\2@\u0430\3\2\2\2B"+
		"\u0432\3\2\2\2D\u0445\3\2\2\2F\u0454\3\2\2\2H\u0458\3\2\2\2J\u0469\3\2"+
		"\2\2L\u0485\3\2\2\2N\u0496\3\2\2\2P\u049a\3\2\2\2R\u049c\3\2\2\2T\u04a8"+
		"\3\2\2\2V\u04aa\3\2\2\2X\u04b9\3\2\2\2Z\u04bb\3\2\2\2\\\u04c4\3\2\2\2"+
		"^\u04c6\3\2\2\2`\u04cf\3\2\2\2b\u04d1\3\2\2\2d\u04da\3\2\2\2f\u04dc\3"+
		"\2\2\2h\u04ec\3\2\2\2j\u04ee\3\2\2\2l\u050c\3\2\2\2n\u050e\3\2\2\2p\u0517"+
		"\3\2\2\2r\u0519\3\2\2\2t\u0522\3\2\2\2v\u0528\3\2\2\2x\u052a\3\2\2\2z"+
		"\u052c\3\2\2\2|\u0534\3\2\2\2~\u0538\3\2\2\2\u0080\u053a\3\2\2\2\u0082"+
		"\u0576\3\2\2\2\u0084\u057f\3\2\2\2\u0086\u0583\3\2\2\2\u0088\u0585\3\2"+
		"\2\2\u008a\u0593\3\2\2\2\u008c\u05a1\3\2\2\2\u008e\u05b8\3\2\2\2\u0090"+
		"\u05c3\3\2\2\2\u0092\u05c9\3\2\2\2\u0094\u05cd\3\2\2\2\u0096\u05d7\3\2"+
		"\2\2\u0098\u05e2\3\2\2\2\u009a\u05eb\3\2\2\2\u009c\u0609\3\2\2\2\u009e"+
		"\u060f\3\2\2\2\u00a0\u0616\3\2\2\2\u00a2\u0624\3\2\2\2\u00a4\u0631\3\2"+
		"\2\2\u00a6\u0648\3\2\2\2\u00a8\u064a\3\2\2\2\u00aa\u064c\3\2\2\2\u00ac"+
		"\u064e\3\2\2\2\u00ae\u0650\3\2\2\2\u00b0\u065b\3\2\2\2\u00b2\u065e\3\2"+
		"\2\2\u00b4\u0662\3\2\2\2\u00b6\u0671\3\2\2\2\u00b8\u0678\3\2\2\2\u00ba"+
		"\u067e\3\2\2\2\u00bc\u068c\3\2\2\2\u00be\u0696\3\2\2\2\u00c0\u0698\3\2"+
		"\2\2\u00c2\u06a7\3\2\2\2\u00c4\u06ac\3\2\2\2\u00c6\u06bc\3\2\2\2\u00c8"+
		"\u06be\3\2\2\2\u00ca\u06c3\3\2\2\2\u00cc\u06c6\3\2\2\2\u00ce\u06c9\3\2"+
		"\2\2\u00d0\u06cc\3\2\2\2\u00d2\u06d6\3\2\2\2\u00d4\u06db\3\2\2\2\u00d6"+
		"\u06df\3\2\2\2\u00d8\u06f3\3\2\2\2\u00da\u00db\7W\2\2\u00db\u00dd\5\u00ba"+
		"^\2\u00dc\u00de\7e\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0"+
		"\3\2\2\2\u00df\u00da\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00e3\5\u00d4k\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e7"+
		"\3\2\2\2\u00e4\u00e6\5\4\3\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\3\3\2\2\2\u00e9\u00e7\3\2\2\2"+
		"\u00ea\u00ec\5H%\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u016f\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f2\5\22\n\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3"+
		"\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6"+
		"\u00f7\7\25\2\2\u00f7\u0103\5\32\16\2\u00f8\u00f9\7:\2\2\u00f9\u00fe\5"+
		"\u00d0i\2\u00fa\u00fb\7\32\2\2\u00fb\u00fd\5\u00d0i\2\u00fc\u00fa\3\2"+
		"\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7/\2\2\u0102\u0104\3\2"+
		"\2\2\u0103\u00f8\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0106\7Z\2\2\u0106\u0108\5\u00c4c\2\u0107\u0105\3\2\2\2\u0107\u0108\3"+
		"\2\2\2\u0108\u0112\3\2\2\2\u0109\u010a\7h\2\2\u010a\u010f\5\u00c4c\2\u010b"+
		"\u010c\7\32\2\2\u010c\u010e\5\u00c4c\2\u010d\u010b\3\2\2\2\u010e\u0111"+
		"\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0112\u0109\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0118\7Y\2\2\u0115\u0117\5\b\5\2\u0116\u0115\3\2\2\2\u0117"+
		"\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2"+
		"\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7\t\2\2\u011c\u0170\3\2\2\2\u011d"+
		"\u011f\5\22\n\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3"+
		"\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123"+
		"\u0124\7\3\2\2\u0124\u0130\5\32\16\2\u0125\u0126\7:\2\2\u0126\u012b\5"+
		"\u00d0i\2\u0127\u0128\7\32\2\2\u0128\u012a\5\u00d0i\2\u0129\u0127\3\2"+
		"\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7/\2\2\u012f\u0131\3\2"+
		"\2\2\u0130\u0125\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u013b\3\2\2\2\u0132"+
		"\u0133\7Z\2\2\u0133\u0138\5\u00c4c\2\u0134\u0135\7\32\2\2\u0135\u0137"+
		"\5\u00c4c\2\u0136\u0134\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2"+
		"\2\u0138\u0139\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u0132"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0141\7Y\2\2\u013e"+
		"\u0140\5\b\5\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u0145\7\t\2\2\u0145\u0170\3\2\2\2\u0146\u0148\5\22\n\2\u0147\u0146\3"+
		"\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\7L\2\2\u014d\u014e\5\32"+
		"\16\2\u014e\u0157\7Y\2\2\u014f\u0154\5\20\t\2\u0150\u0151\7\32\2\2\u0151"+
		"\u0153\5\20\t\2\u0152\u0150\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3"+
		"\2\2\2\u0154\u0155\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0157"+
		"\u014f\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u015b\7e"+
		"\2\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015d\7\t\2\2\u015d\u0170\3\2\2\2\u015e\u0160\5\22\n\2\u015f\u015e\3"+
		"\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\7O\2\2\u0165\u0166\5\32"+
		"\16\2\u0166\u016a\7Y\2\2\u0167\u0169\5\6\4\2\u0168\u0167\3\2\2\2\u0169"+
		"\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2"+
		"\2\2\u016c\u016a\3\2\2\2\u016d\u016e\7\t\2\2\u016e\u0170\3\2\2\2\u016f"+
		"\u00f3\3\2\2\2\u016f\u0120\3\2\2\2\u016f\u0149\3\2\2\2\u016f\u0161\3\2"+
		"\2\2\u0170\5\3\2\2\2\u0171\u0173\5H%\2\u0172\u0171\3\2\2\2\u0173\u0176"+
		"\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u021a\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0177\u0179\5\22\n\2\u0178\u0177\3\2\2\2\u0179\u017c\3"+
		"\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017d\u0181\5\24\13\2\u017e\u0180\5\22\n\2\u017f\u017e"+
		"\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0186\5\u00be`\2\u0185\u0184"+
		"\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\5\32\16\2"+
		"\u0188\u0193\3\2\2\2\u0189\u018b\5\22\n\2\u018a\u0189\3\2\2\2\u018b\u018e"+
		"\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018f\u0190\5\u00be`\2\u0190\u0191\5\32\16\2\u0191\u0193"+
		"\3\2\2\2\u0192\u017a\3\2\2\2\u0192\u018c\3\2\2\2\u0193\u0196\3\2\2\2\u0194"+
		"\u0195\7D\2\2\u0195\u0197\5N(\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2"+
		"\2\u0197\u0199\3\2\2\2\u0198\u019a\7e\2\2\u0199\u0198\3\2\2\2\u0199\u019a"+
		"\3\2\2\2\u019a\u021b\3\2\2\2\u019b\u019d\5\22\n\2\u019c\u019b\3\2\2\2"+
		"\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1"+
		"\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a2\7\25\2\2\u01a2\u01ae\5\32\16"+
		"\2\u01a3\u01a4\7:\2\2\u01a4\u01a9\5\u00d0i\2\u01a5\u01a6\7\32\2\2\u01a6"+
		"\u01a8\5\u00d0i\2\u01a7\u01a5\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7"+
		"\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac"+
		"\u01ad\7/\2\2\u01ad\u01af\3\2\2\2\u01ae\u01a3\3\2\2\2\u01ae\u01af\3\2"+
		"\2\2\u01af\u01b2\3\2\2\2\u01b0\u01b1\7Z\2\2\u01b1\u01b3\5\u00c4c\2\u01b2"+
		"\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01bd\3\2\2\2\u01b4\u01b5\7h"+
		"\2\2\u01b5\u01ba\5\u00c4c\2\u01b6\u01b7\7\32\2\2\u01b7\u01b9\5\u00c4c"+
		"\2\u01b8\u01b6\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb"+
		"\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01b4\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c3\7Y\2\2\u01c0\u01c2\5\b"+
		"\5\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c7\7\t"+
		"\2\2\u01c7\u021b\3\2\2\2\u01c8\u01ca\5\22\n\2\u01c9\u01c8\3\2\2\2\u01ca"+
		"\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\3\2"+
		"\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01cf\7\3\2\2\u01cf\u01db\5\32\16\2\u01d0"+
		"\u01d1\7:\2\2\u01d1\u01d6\5\u00d0i\2\u01d2\u01d3\7\32\2\2\u01d3\u01d5"+
		"\5\u00d0i\2\u01d4\u01d2\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2"+
		"\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da"+
		"\7/\2\2\u01da\u01dc\3\2\2\2\u01db\u01d0\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"\u01e6\3\2\2\2\u01dd\u01de\7Z\2\2\u01de\u01e3\5\u00c4c\2\u01df\u01e0\7"+
		"\32\2\2\u01e0\u01e2\5\u00c4c\2\u01e1\u01df\3\2\2\2\u01e2\u01e5\3\2\2\2"+
		"\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3"+
		"\3\2\2\2\u01e6\u01dd\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"\u01ec\7Y\2\2\u01e9\u01eb\5\b\5\2\u01ea\u01e9\3\2\2\2\u01eb\u01ee\3\2"+
		"\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee"+
		"\u01ec\3\2\2\2\u01ef\u01f0\7\t\2\2\u01f0\u021b\3\2\2\2\u01f1\u01f3\5\22"+
		"\n\2\u01f2\u01f1\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f8\7L"+
		"\2\2\u01f8\u01f9\5\32\16\2\u01f9\u0202\7Y\2\2\u01fa\u01ff\5\20\t\2\u01fb"+
		"\u01fc\7\32\2\2\u01fc\u01fe\5\20\t\2\u01fd\u01fb\3\2\2\2\u01fe\u0201\3"+
		"\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0203\3\2\2\2\u0201"+
		"\u01ff\3\2\2\2\u0202\u01fa\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205\3\2"+
		"\2\2\u0204\u0206\7e\2\2\u0205\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207\u0208\7\t\2\2\u0208\u021b\3\2\2\2\u0209\u020b\5\22"+
		"\n\2\u020a\u0209\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020d\u020f\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0210\7O"+
		"\2\2\u0210\u0211\5\32\16\2\u0211\u0215\7Y\2\2\u0212\u0214\5\6\4\2\u0213"+
		"\u0212\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2"+
		"\2\2\u0216\u0218\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u0219\7\t\2\2\u0219"+
		"\u021b\3\2\2\2\u021a\u0192\3\2\2\2\u021a\u019e\3\2\2\2\u021a\u01cb\3\2"+
		"\2\2\u021a\u01f4\3\2\2\2\u021a\u020c\3\2\2\2\u021b\7\3\2\2\2\u021c\u021e"+
		"\5H%\2\u021d\u021c\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f"+
		"\u0220\3\2\2\2\u0220\u0355\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0224\5\22"+
		"\n\2\u0223\u0222\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0226\u0255\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u022c\5\24"+
		"\13\2\u0229\u022b\5\22\n\2\u022a\u0229\3\2\2\2\u022b\u022e\3\2\2\2\u022c"+
		"\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2"+
		"\2\2\u022f\u0231\5\u00be`\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0232\u0233\5\32\16\2\u0233\u0256\3\2\2\2\u0234\u0239\7"+
		"g\2\2\u0235\u0238\5\24\13\2\u0236\u0238\5\22\n\2\u0237\u0235\3\2\2\2\u0237"+
		"\u0236\3\2\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2"+
		"\2\2\u023a\u023c\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u023e\5\u00be`\2\u023d"+
		"\u023f\5\32\16\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0256\3"+
		"\2\2\2\u0240\u0244\5\24\13\2\u0241\u0243\5\22\n\2\u0242\u0241\3\2\2\2"+
		"\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247"+
		"\3\2\2\2\u0246\u0244\3\2\2\2\u0247\u024b\7g\2\2\u0248\u024a\5\22\n\2\u0249"+
		"\u0248\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2"+
		"\2\2\u024c\u024e\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u0250\5\u00be`\2\u024f"+
		"\u0251\5\32\16\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0256\3"+
		"\2\2\2\u0252\u0253\5\u00be`\2\u0253\u0254\5\32\16\2\u0254\u0256\3\2\2"+
		"\2\u0255\u0228\3\2\2\2\u0255\u0234\3\2\2\2\u0255\u0240\3\2\2\2\u0255\u0252"+
		"\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0258\7D\2\2\u0258\u025a\5R*\2\u0259"+
		"\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u025d\7e"+
		"\2\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u0356\3\2\2\2\u025e"+
		"\u0260\5\22\n\2\u025f\u025e\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3"+
		"\2\2\2\u0261\u0262\3\2\2\2\u0262\u0264\3\2\2\2\u0263\u0261\3\2\2\2\u0264"+
		"\u0269\5\26\f\2\u0265\u0268\5\22\n\2\u0266\u0268\5\26\f\2\u0267\u0265"+
		"\3\2\2\2\u0267\u0266\3\2\2\2\u0268\u026b\3\2\2\2\u0269\u0267\3\2\2\2\u0269"+
		"\u026a\3\2\2\2\u026a\u0277\3\2\2\2\u026b\u0269\3\2\2\2\u026c\u026d\7:"+
		"\2\2\u026d\u0272\5\u00d0i\2\u026e\u026f\7\32\2\2\u026f\u0271\5\u00d0i"+
		"\2\u0270\u026e\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273"+
		"\3\2\2\2\u0273\u0275\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u0276\7/\2\2\u0276"+
		"\u0278\3\2\2\2\u0277\u026c\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u028d\3\2"+
		"\2\2\u0279\u027a\5\u00be`\2\u027a\u027b\5\30\r\2\u027b\u027c\5\32\16\2"+
		"\u027c\u027d\7S\2\2\u027d\u028e\3\2\2\2\u027e\u027f\5\u00be`\2\u027f\u0280"+
		"\5\f\7\2\u0280\u0281\7S\2\2\u0281\u028e\3\2\2\2\u0282\u0283\5\n\6\2\u0283"+
		"\u0284\5\f\7\2\u0284\u0285\7S\2\2\u0285\u028e\3\2\2\2\u0286\u0287\5\30"+
		"\r\2\u0287\u0288\5\32\16\2\u0288\u0289\7S\2\2\u0289\u028e\3\2\2\2\u028a"+
		"\u028b\5\f\7\2\u028b\u028c\7S\2\2\u028c\u028e\3\2\2\2\u028d\u0279\3\2"+
		"\2\2\u028d\u027e\3\2\2\2\u028d\u0282\3\2\2\2\u028d\u0286\3\2\2\2\u028d"+
		"\u028a\3\2\2\2\u028e\u0297\3\2\2\2\u028f\u0294\5 \21\2\u0290\u0291\7\32"+
		"\2\2\u0291\u0293\5 \21\2\u0292\u0290\3\2\2\2\u0293\u0296\3\2\2\2\u0294"+
		"\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0298\3\2\2\2\u0296\u0294\3\2"+
		"\2\2\u0297\u028f\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"\u02a3\7\r\2\2\u029a\u029b\7E\2\2\u029b\u02a0\5\u00be`\2\u029c\u029d\7"+
		"\32\2\2\u029d\u029f\5\u00be`\2\u029e\u029c\3\2\2\2\u029f\u02a2\3\2\2\2"+
		"\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a4\3\2\2\2\u02a2\u02a0"+
		"\3\2\2\2\u02a3\u029a\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a8\3\2\2\2\u02a5"+
		"\u02a9\5\u00a0Q\2\u02a6\u02a9\5\64\33\2\u02a7\u02a9\7e\2\2\u02a8\u02a5"+
		"\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a7\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9"+
		"\u0356\3\2\2\2\u02aa\u02ac\5\22\n\2\u02ab\u02aa\3\2\2\2\u02ac\u02af\3"+
		"\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0\3\2\2\2\u02af"+
		"\u02ad\3\2\2\2\u02b0\u02bc\7H\2\2\u02b1\u02b2\7:\2\2\u02b2\u02b7\5\u00d0"+
		"i\2\u02b3\u02b4\7\32\2\2\u02b4\u02b6\5\u00d0i\2\u02b5\u02b3\3\2\2\2\u02b6"+
		"\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02ba\3\2"+
		"\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02bb\7/\2\2\u02bb\u02bd\3\2\2\2\u02bc"+
		"\u02b1\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c7\7S"+
		"\2\2\u02bf\u02c4\5 \21\2\u02c0\u02c1\7\32\2\2\u02c1\u02c3\5 \21\2\u02c2"+
		"\u02c0\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2"+
		"\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02bf\3\2\2\2\u02c7"+
		"\u02c8\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02d3\7\r\2\2\u02ca\u02cb\7E"+
		"\2\2\u02cb\u02d0\5\u00be`\2\u02cc\u02cd\7\32\2\2\u02cd\u02cf\5\u00be`"+
		"\2\u02ce\u02cc\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1"+
		"\3\2\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02ca\3\2\2\2\u02d3"+
		"\u02d4\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u0356\5\u00a0Q\2\u02d6\u02d8"+
		"\5\22\n\2\u02d7\u02d6\3\2\2\2\u02d8\u02db\3\2\2\2\u02d9\u02d7\3\2\2\2"+
		"\u02d9\u02da\3\2\2\2\u02da\u02dc\3\2\2\2\u02db\u02d9\3\2\2\2\u02dc\u02dd"+
		"\7\25\2\2\u02dd\u02e9\5\32\16\2\u02de\u02df\7:\2\2\u02df\u02e4\5\u00d0"+
		"i\2\u02e0\u02e1\7\32\2\2\u02e1\u02e3\5\u00d0i\2\u02e2\u02e0\3\2\2\2\u02e3"+
		"\u02e6\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e7\3\2"+
		"\2\2\u02e6\u02e4\3\2\2\2\u02e7\u02e8\7/\2\2\u02e8\u02ea\3\2\2\2\u02e9"+
		"\u02de\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02ec\7Z"+
		"\2\2\u02ec\u02ee\5\u00c4c\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee"+
		"\u02f8\3\2\2\2\u02ef\u02f0\7h\2\2\u02f0\u02f5\5\u00c4c\2\u02f1\u02f2\7"+
		"\32\2\2\u02f2\u02f4\5\u00c4c\2\u02f3\u02f1\3\2\2\2\u02f4\u02f7\3\2\2\2"+
		"\u02f5\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5"+
		"\3\2\2\2\u02f8\u02ef\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa"+
		"\u02fe\7Y\2\2\u02fb\u02fd\5\b\5\2\u02fc\u02fb\3\2\2\2\u02fd\u0300\3\2"+
		"\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0301\3\2\2\2\u0300"+
		"\u02fe\3\2\2\2\u0301\u0302\7\t\2\2\u0302\u0356\3\2\2\2\u0303\u0305\5\22"+
		"\n\2\u0304\u0303\3\2\2\2\u0305\u0308\3\2\2\2\u0306\u0304\3\2\2\2\u0306"+
		"\u0307\3\2\2\2\u0307\u0309\3\2\2\2\u0308\u0306\3\2\2\2\u0309\u030a\7\3"+
		"\2\2\u030a\u0316\5\32\16\2\u030b\u030c\7:\2\2\u030c\u0311\5\u00d0i\2\u030d"+
		"\u030e\7\32\2\2\u030e\u0310\5\u00d0i\2\u030f\u030d\3\2\2\2\u0310\u0313"+
		"\3\2\2\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0314\3\2\2\2\u0313"+
		"\u0311\3\2\2\2\u0314\u0315\7/\2\2\u0315\u0317\3\2\2\2\u0316\u030b\3\2"+
		"\2\2\u0316\u0317\3\2\2\2\u0317\u0321\3\2\2\2\u0318\u0319\7Z\2\2\u0319"+
		"\u031e\5\u00c4c\2\u031a\u031b\7\32\2\2\u031b\u031d\5\u00c4c\2\u031c\u031a"+
		"\3\2\2\2\u031d\u0320\3\2\2\2\u031e\u031c\3\2\2\2\u031e\u031f\3\2\2\2\u031f"+
		"\u0322\3\2\2\2\u0320\u031e\3\2\2\2\u0321\u0318\3\2\2\2\u0321\u0322\3\2"+
		"\2\2\u0322\u0323\3\2\2\2\u0323\u0327\7Y\2\2\u0324\u0326\5\b\5\2\u0325"+
		"\u0324\3\2\2\2\u0326\u0329\3\2\2\2\u0327\u0325\3\2\2\2\u0327\u0328\3\2"+
		"\2\2\u0328\u032a\3\2\2\2\u0329\u0327\3\2\2\2\u032a\u032b\7\t\2\2\u032b"+
		"\u0356\3\2\2\2\u032c\u032e\5\22\n\2\u032d\u032c\3\2\2\2\u032e\u0331\3"+
		"\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0332\3\2\2\2\u0331"+
		"\u032f\3\2\2\2\u0332\u0333\7L\2\2\u0333\u0334\5\32\16\2\u0334\u033d\7"+
		"Y\2\2\u0335\u033a\5\20\t\2\u0336\u0337\7\32\2\2\u0337\u0339\5\20\t\2\u0338"+
		"\u0336\3\2\2\2\u0339\u033c\3\2\2\2\u033a\u0338\3\2\2\2\u033a\u033b\3\2"+
		"\2\2\u033b\u033e\3\2\2\2\u033c\u033a\3\2\2\2\u033d\u0335\3\2\2\2\u033d"+
		"\u033e\3\2\2\2\u033e\u0340\3\2\2\2\u033f\u0341\7e\2\2\u0340\u033f\3\2"+
		"\2\2\u0340\u0341\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0343\7\t\2\2\u0343"+
		"\u0356\3\2\2\2\u0344\u0346\5\22\n\2\u0345\u0344\3\2\2\2\u0346\u0349\3"+
		"\2\2\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u034a\3\2\2\2\u0349"+
		"\u0347\3\2\2\2\u034a\u034b\7O\2\2\u034b\u034c\5\32\16\2\u034c\u0350\7"+
		"Y\2\2\u034d\u034f\5\6\4\2\u034e\u034d\3\2\2\2\u034f\u0352\3\2\2\2\u0350"+
		"\u034e\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0353\3\2\2\2\u0352\u0350\3\2"+
		"\2\2\u0353\u0354\7\t\2\2\u0354\u0356\3\2\2\2\u0355\u0225\3\2\2\2\u0355"+
		"\u0261\3\2\2\2\u0355\u02ad\3\2\2\2\u0355\u02d9\3\2\2\2\u0355\u0306\3\2"+
		"\2\2\u0355\u032f\3\2\2\2\u0355\u0347\3\2\2\2\u0356\t\3\2\2\2\u0357\u0358"+
		"\5\u00ba^\2\u0358\13\3\2\2\2\u0359\u035c\5\32\16\2\u035a\u035c\5\16\b"+
		"\2\u035b\u0359\3\2\2\2\u035b\u035a\3\2\2\2\u035c\r\3\2\2\2\u035d\u0367"+
		"\5X-\2\u035e\u0367\5\\/\2\u035f\u0367\5`\61\2\u0360\u0367\5d\63\2\u0361"+
		"\u0367\5h\65\2\u0362\u0367\5l\67\2\u0363\u0367\5t;\2\u0364\u0367\5x=\2"+
		"\u0365\u0367\5~@\2\u0366\u035d\3\2\2\2\u0366\u035e\3\2\2\2\u0366\u035f"+
		"\3\2\2\2\u0366\u0360\3\2\2\2\u0366\u0361\3\2\2\2\u0366\u0362\3\2\2\2\u0366"+
		"\u0363\3\2\2\2\u0366\u0364\3\2\2\2\u0366\u0365\3\2\2\2\u0367\17\3\2\2"+
		"\2\u0368\u0369\5\32\16\2\u0369\21\3\2\2\2\u036a\u036b\t\2\2\2\u036b\23"+
		"\3\2\2\2\u036c\u036d\t\3\2\2\u036d\25\3\2\2\2\u036e\u036f\t\4\2\2\u036f"+
		"\27\3\2\2\2\u0370\u0374\7b\2\2\u0371\u0372\5\32\16\2\u0372\u0373\7T\2"+
		"\2\u0373\u0375\3\2\2\2\u0374\u0371\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376"+
		"\3\2\2\2\u0376\u0377\5R*\2\u0377\31\3\2\2\2\u0378\u0379\t\5\2\2\u0379"+
		"\33\3\2\2\2\u037a\u037d\5\36\20\2\u037b\u037d\7g\2\2\u037c\u037a\3\2\2"+
		"\2\u037c\u037b\3\2\2\2\u037d\35\3\2\2\2\u037e\u037f\t\6\2\2\u037f\37\3"+
		"\2\2\2\u0380\u0382\5H%\2\u0381\u0380\3\2\2\2\u0382\u0385\3\2\2\2\u0383"+
		"\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u038d\3\2\2\2\u0385\u0383\3\2"+
		"\2\2\u0386\u038a\7g\2\2\u0387\u0389\5H%\2\u0388\u0387\3\2\2\2\u0389\u038c"+
		"\3\2\2\2\u038a\u0388\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038e\3\2\2\2\u038c"+
		"\u038a\3\2\2\2\u038d\u0386\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038f\3\2"+
		"\2\2\u038f\u0391\5\u00be`\2\u0390\u0392\7!\2\2\u0391\u0390\3\2\2\2\u0391"+
		"\u0392\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0394\5\32\16\2\u0394!\3\2\2"+
		"\2\u0395\u0397\t\3\2\2\u0396\u0398\7g\2\2\u0397\u0396\3\2\2\2\u0397\u0398"+
		"\3\2\2\2\u0398\u039c\3\2\2\2\u0399\u039a\7g\2\2\u039a\u039c\t\3\2\2\u039b"+
		"\u0395\3\2\2\2\u039b\u0399\3\2\2\2\u039c\u03a1\3\2\2\2\u039d\u039e\5\u00be"+
		"`\2\u039e\u039f\5\36\20\2\u039f\u03a2\3\2\2\2\u03a0\u03a2\5\36\20\2\u03a1"+
		"\u039d\3\2\2\2\u03a1\u03a0\3\2\2\2\u03a2\u03a5\3\2\2\2\u03a3\u03a4\7D"+
		"\2\2\u03a4\u03a6\5R*\2\u03a5\u03a3\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6#"+
		"\3\2\2\2\u03a7\u03b0\5&\24\2\u03a8\u03ac\7Y\2\2\u03a9\u03ab\5\b\5\2\u03aa"+
		"\u03a9\3\2\2\2\u03ab\u03ae\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ac\u03ad\3\2"+
		"\2\2\u03ad\u03af\3\2\2\2\u03ae\u03ac\3\2\2\2\u03af\u03b1\7\t\2\2\u03b0"+
		"\u03a8\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1%\3\2\2\2\u03b2\u03b3\7H\2\2\u03b3"+
		"\u03bf\5\u00ba^\2\u03b4\u03b5\7:\2\2\u03b5\u03ba\5\u00c6d\2\u03b6\u03b7"+
		"\7\32\2\2\u03b7\u03b9\5\u00c6d\2\u03b8\u03b6\3\2\2\2\u03b9\u03bc\3\2\2"+
		"\2\u03ba\u03b8\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bd\3\2\2\2\u03bc\u03ba"+
		"\3\2\2\2\u03bd\u03be\7/\2\2\u03be\u03c0\3\2\2\2\u03bf\u03b4\3\2\2\2\u03bf"+
		"\u03c0\3\2\2\2\u03c0\u03ce\3\2\2\2\u03c1\u03cb\7S\2\2\u03c2\u03cc\5\u0090"+
		"I\2\u03c3\u03c8\5R*\2\u03c4\u03c5\7\32\2\2\u03c5\u03c7\5R*\2\u03c6\u03c4"+
		"\3\2\2\2\u03c7\u03ca\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9"+
		"\u03cc\3\2\2\2\u03ca\u03c8\3\2\2\2\u03cb\u03c2\3\2\2\2\u03cb\u03c3\3\2"+
		"\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03cf\7\r\2\2\u03ce"+
		"\u03c1\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03d2\5\u008c"+
		"G\2\u03d1\u03d0\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\'\3\2\2\2\u03d3\u03d5"+
		"\7g\2\2\u03d4\u03d3\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d7\3\2\2\2\u03d6"+
		"\u03d8\5\u00be`\2\u03d7\u03d6\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03d9"+
		"\3\2\2\2\u03d9\u03da\5\36\20\2\u03da)\3\2\2\2\u03db\u03dd\7g\2\2\u03dc"+
		"\u03db\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df\5\u00be"+
		"`\2\u03df\u03e0\5\36\20\2\u03e0+\3\2\2\2\u03e1\u03e4\5\62\32\2\u03e2\u03e4"+
		"\5\64\33\2\u03e3\u03e1\3\2\2\2\u03e3\u03e2\3\2\2\2\u03e4-\3\2\2\2\u03e5"+
		"\u03f3\7\62\2\2\u03e6\u03e7\7S\2\2\u03e7\u03e8\5(\25\2\u03e8\u03e9\7T"+
		"\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb\5R*\2\u03eb\u03ec\7\r\2\2\u03ec\u03f4"+
		"\3\2\2\2\u03ed\u03ee\5(\25\2\u03ee\u03ef\7T\2\2\u03ef\u03f1\3\2\2\2\u03f0"+
		"\u03ed\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f4\5\60"+
		"\31\2\u03f3\u03e6\3\2\2\2\u03f3\u03f0\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5"+
		"\u03f9\7Y\2\2\u03f6\u03f8\5\u0096L\2\u03f7\u03f6\3\2\2\2\u03f8\u03fb\3"+
		"\2\2\2\u03f9\u03f7\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03ff\3\2\2\2\u03fb"+
		"\u03f9\3\2\2\2\u03fc\u03fd\7P\2\2\u03fd\u03fe\7T\2\2\u03fe\u0400\5R*\2"+
		"\u03ff\u03fc\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0402"+
		"\7\t\2\2\u0402/\3\2\2\2\u0403\u0406\5&\24\2\u0404\u0406\5R*\2\u0405\u0403"+
		"\3\2\2\2\u0405\u0404\3\2\2\2\u0406\61\3\2\2\2\u0407\u0408\7v\2\2\u0408"+
		"\63\3\2\2\2\u0409\u041a\5\66\34\2\u040a\u040c\58\35\2\u040b\u040d\5@!"+
		"\2\u040c\u040b\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u0414\3\2\2\2\u040e\u0410"+
		"\5:\36\2\u040f\u0411\5@!\2\u0410\u040f\3\2\2\2\u0410\u0411\3\2\2\2\u0411"+
		"\u0413\3\2\2\2\u0412\u040e\3\2\2\2\u0413\u0416\3\2\2\2\u0414\u0412\3\2"+
		"\2\2\u0414\u0415\3\2\2\2\u0415\u0417\3\2\2\2\u0416\u0414\3\2\2\2\u0417"+
		"\u0418\5<\37\2\u0418\u041a\3\2\2\2\u0419\u0409\3\2\2\2\u0419\u040a\3\2"+
		"\2\2\u041a\65\3\2\2\2\u041b\u041c\7m\2\2\u041c\67\3\2\2\2\u041d\u041e"+
		"\7n\2\2\u041e9\3\2\2\2\u041f\u0420\t\7\2\2\u0420;\3\2\2\2\u0421\u0422"+
		"\t\b\2\2\u0422=\3\2\2\2\u0423\u042a\5:\36\2\u0424\u0426\5@!\2\u0425\u0424"+
		"\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0429\5:\36\2\u0428"+
		"\u0425\3\2\2\2\u0429\u042c\3\2\2\2\u042a\u0428\3\2\2\2\u042a\u042b\3\2"+
		"\2\2\u042b?\3\2\2\2\u042c\u042a\3\2\2\2\u042d\u0431\5\u00a2R\2\u042e\u0431"+
		"\5B\"\2\u042f\u0431\5D#\2\u0430\u042d\3\2\2\2\u0430\u042e\3\2\2\2\u0430"+
		"\u042f\3\2\2\2\u0431A\3\2\2\2\u0432\u0433\7\'\2\2\u0433\u0434\5(\25\2"+
		"\u0434\u0435\7T\2\2\u0435\u0438\5R*\2\u0436\u0437\7\66\2\2\u0437\u0439"+
		"\5R*\2\u0438\u0436\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043c\3\2\2\2\u043a"+
		"\u043b\7\23\2\2\u043b\u043d\5R*\2\u043c\u043a\3\2\2\2\u043c\u043d\3\2"+
		"\2\2\u043d\u0440\3\2\2\2\u043e\u043f\7i\2\2\u043f\u0441\5R*\2\u0440\u043e"+
		"\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0443\5> \2\u0443"+
		"\u0444\7F\2\2\u0444C\3\2\2\2\u0445\u0446\7\7\2\2\u0446\u0447\5R*\2\u0447"+
		"\u044b\5> \2\u0448\u044a\5F$\2\u0449\u0448\3\2\2\2\u044a\u044d\3\2\2\2"+
		"\u044b\u0449\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u0450\3\2\2\2\u044d\u044b"+
		"\3\2\2\2\u044e\u044f\7=\2\2\u044f\u0451\5> \2\u0450\u044e\3\2\2\2\u0450"+
		"\u0451\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0453\7>\2\2\u0453E\3\2\2\2\u0454"+
		"\u0455\7\5\2\2\u0455\u0456\5R*\2\u0456\u0457\5> \2\u0457G\3\2\2\2\u0458"+
		"\u0459\7\20\2\2\u0459\u0467\5\u00ba^\2\u045a\u0464\7S\2\2\u045b\u0460"+
		"\5J&\2\u045c\u045d\7\32\2\2\u045d\u045f\5J&\2\u045e\u045c\3\2\2\2\u045f"+
		"\u0462\3\2\2\2\u0460\u045e\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0465\3\2"+
		"\2\2\u0462\u0460\3\2\2\2\u0463\u0465\5L\'\2\u0464\u045b\3\2\2\2\u0464"+
		"\u0463\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0468\7\r"+
		"\2\2\u0467\u045a\3\2\2\2\u0467\u0468\3\2\2\2\u0468I\3\2\2\2\u0469\u046a"+
		"\5\32\16\2\u046a\u046b\7D\2\2\u046b\u046c\3\2\2\2\u046c\u046d\5N(\2\u046d"+
		"K\3\2\2\2\u046e\u046f\7\64\2\2\u046f\u0470\78\2\2\u0470\u0479\3\2\2\2"+
		"\u0471\u0476\5P)\2\u0472\u0473\7\32\2\2\u0473\u0475\5P)\2\u0474\u0472"+
		"\3\2\2\2\u0475\u0478\3\2\2\2\u0476\u0474\3\2\2\2\u0476\u0477\3\2\2\2\u0477"+
		"\u047a\3\2\2\2\u0478\u0476\3\2\2\2\u0479\u0471\3\2\2\2\u0479\u047a\3\2"+
		"\2\2\u047a\u047b\3\2\2\2\u047b\u0486\7M\2\2\u047c\u0483\5P)\2\u047d\u047e"+
		"\7\32\2\2\u047e\u0480\5P)\2\u047f\u047d\3\2\2\2\u0480\u0481\3\2\2\2\u0481"+
		"\u047f\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0484\3\2\2\2\u0483\u047f\3\2"+
		"\2\2\u0483\u0484\3\2\2\2\u0484\u0486\3\2\2\2\u0485\u046e\3\2\2\2\u0485"+
		"\u047c\3\2\2\2\u0486M\3\2\2\2\u0487\u0488\7\64\2\2\u0488\u0489\78\2\2"+
		"\u0489\u0492\3\2\2\2\u048a\u048f\5P)\2\u048b\u048c\7\32\2\2\u048c\u048e"+
		"\5P)\2\u048d\u048b\3\2\2\2\u048e\u0491\3\2\2\2\u048f\u048d\3\2\2\2\u048f"+
		"\u0490\3\2\2\2\u0490\u0493\3\2\2\2\u0491\u048f\3\2\2\2\u0492\u048a\3\2"+
		"\2\2\u0492\u0493\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0497\7M\2\2\u0495"+
		"\u0497\5P)\2\u0496\u0487\3\2\2\2\u0496\u0495\3\2\2\2\u0497O\3\2\2\2\u0498"+
		"\u049b\5H%\2\u0499\u049b\5R*\2\u049a\u0498\3\2\2\2\u049a\u0499\3\2\2\2"+
		"\u049bQ\3\2\2\2\u049c\u049d\5T+\2\u049dS\3\2\2\2\u049e\u049f\5\34\17\2"+
		"\u049f\u04a0\5V,\2\u04a0\u04a1\5T+\2\u04a1\u04a9\3\2\2\2\u04a2\u04a6\5"+
		"Z.\2\u04a3\u04a4\5X-\2\u04a4\u04a5\5T+\2\u04a5\u04a7\3\2\2\2\u04a6\u04a3"+
		"\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a9\3\2\2\2\u04a8\u049e\3\2\2\2\u04a8"+
		"\u04a2\3\2\2\2\u04a9U\3\2\2\2\u04aa\u04ab\7D\2\2\u04abW\3\2\2\2\u04ac"+
		"\u04ba\7\"\2\2\u04ad\u04ba\7\31\2\2\u04ae\u04ba\7\f\2\2\u04af\u04ba\7"+
		"\61\2\2\u04b0\u04ba\7\60\2\2\u04b1\u04b2\7:\2\2\u04b2\u04b3\7:\2\2\u04b3"+
		"\u04ba\7D\2\2\u04b4\u04b6\7/\2\2\u04b5\u04b7\7/\2\2\u04b6\u04b5\3\2\2"+
		"\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04ba\7k\2\2\u04b9\u04ac"+
		"\3\2\2\2\u04b9\u04ad\3\2\2\2\u04b9\u04ae\3\2\2\2\u04b9\u04af\3\2\2\2\u04b9"+
		"\u04b0\3\2\2\2\u04b9\u04b1\3\2\2\2\u04b9\u04b4\3\2\2\2\u04baY\3\2\2\2"+
		"\u04bb\u04c1\5^\60\2\u04bc\u04bd\5\\/\2\u04bd\u04be\5^\60\2\u04be\u04c0"+
		"\3\2\2\2\u04bf\u04bc\3\2\2\2\u04c0\u04c3\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c1"+
		"\u04c2\3\2\2\2\u04c2[\3\2\2\2\u04c3\u04c1\3\2\2\2\u04c4\u04c5\7.\2\2\u04c5"+
		"]\3\2\2\2\u04c6\u04cc\5b\62\2\u04c7\u04c8\5`\61\2\u04c8\u04c9\5b\62\2"+
		"\u04c9\u04cb\3\2\2\2\u04ca\u04c7\3\2\2\2\u04cb\u04ce\3\2\2\2\u04cc\u04ca"+
		"\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd_\3\2\2\2\u04ce\u04cc\3\2\2\2\u04cf"+
		"\u04d0\7-\2\2\u04d0a\3\2\2\2\u04d1\u04d7\5f\64\2\u04d2\u04d3\5d\63\2\u04d3"+
		"\u04d4\5f\64\2\u04d4\u04d6\3\2\2\2\u04d5\u04d2\3\2\2\2\u04d6\u04d9\3\2"+
		"\2\2\u04d7\u04d5\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8c\3\2\2\2\u04d9\u04d7"+
		"\3\2\2\2\u04da\u04db\t\t\2\2\u04dbe\3\2\2\2\u04dc\u04e4\5j\66\2\u04dd"+
		"\u04de\7\65\2\2\u04de\u04e3\5\u00be`\2\u04df\u04e0\5h\65\2\u04e0\u04e1"+
		"\5j\66\2\u04e1\u04e3\3\2\2\2\u04e2\u04dd\3\2\2\2\u04e2\u04df\3\2\2\2\u04e3"+
		"\u04e6\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5g\3\2\2\2"+
		"\u04e6\u04e4\3\2\2\2\u04e7\u04ed\7k\2\2\u04e8\u04e9\7:\2\2\u04e9\u04ed"+
		"\7D\2\2\u04ea\u04ed\7/\2\2\u04eb\u04ed\7:\2\2\u04ec\u04e7\3\2\2\2\u04ec"+
		"\u04e8\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ec\u04eb\3\2\2\2\u04edi\3\2\2\2"+
		"\u04ee\u04f4\5n8\2\u04ef\u04f0\5l\67\2\u04f0\u04f1\5n8\2\u04f1\u04f3\3"+
		"\2\2\2\u04f2\u04ef\3\2\2\2\u04f3\u04f6\3\2\2\2\u04f4\u04f2\3\2\2\2\u04f4"+
		"\u04f5\3\2\2\2\u04f5k\3\2\2\2\u04f6\u04f4\3\2\2\2\u04f7\u050d\7C\2\2\u04f8"+
		"\u050d\7I\2\2\u04f9\u04fa\7/\2\2\u04fa\u050d\7\30\2\2\u04fb\u050d\7\30"+
		"\2\2\u04fc\u050d\7]\2\2\u04fd\u0501\7/\2\2\u04fe\u04ff\7/\2\2\u04ff\u0502"+
		"\7/\2\2\u0500\u0502\7/\2\2\u0501\u04fe\3\2\2\2\u0501\u0500\3\2\2\2\u0502"+
		"\u050d\3\2\2\2\u0503\u0508\7:\2\2\u0504\u0505\7:\2\2\u0505\u0509\7:\2"+
		"\2\u0506\u0509\7:\2\2\u0507\u0509\7]\2\2\u0508\u0504\3\2\2\2\u0508\u0506"+
		"\3\2\2\2\u0508\u0507\3\2\2\2\u0509\u050d\3\2\2\2\u050a\u050d\7a\2\2\u050b"+
		"\u050d\7)\2\2\u050c\u04f7\3\2\2\2\u050c\u04f8\3\2\2\2\u050c\u04f9\3\2"+
		"\2\2\u050c\u04fb\3\2\2\2\u050c\u04fc\3\2\2\2\u050c\u04fd\3\2\2\2\u050c"+
		"\u0503\3\2\2\2\u050c\u050a\3\2\2\2\u050c\u050b\3\2\2\2\u050dm\3\2\2\2"+
		"\u050e\u0514\5r:\2\u050f\u0510\5p9\2\u0510\u0511\5r:\2\u0511\u0513\3\2"+
		"\2\2\u0512\u050f\3\2\2\2\u0513\u0516\3\2\2\2\u0514\u0512\3\2\2\2\u0514"+
		"\u0515\3\2\2\2\u0515o\3\2\2\2\u0516\u0514\3\2\2\2\u0517\u0518\t\n\2\2"+
		"\u0518q\3\2\2\2\u0519\u051f\5v<\2\u051a\u051b\5t;\2\u051b\u051c\5v<\2"+
		"\u051c\u051e\3\2\2\2\u051d\u051a\3\2\2\2\u051e\u0521\3\2\2\2\u051f\u051d"+
		"\3\2\2\2\u051f\u0520\3\2\2\2\u0520s\3\2\2\2\u0521\u051f\3\2\2\2\u0522"+
		"\u0523\t\13\2\2\u0523u\3\2\2\2\u0524\u0525\5x=\2\u0525\u0526\5v<\2\u0526"+
		"\u0529\3\2\2\2\u0527\u0529\5z>\2\u0528\u0524\3\2\2\2\u0528\u0527\3\2\2"+
		"\2\u0529w\3\2\2\2\u052a\u052b\t\f\2\2\u052by\3\2\2\2\u052c\u0531\5|?\2"+
		"\u052d\u052e\7 \2\2\u052e\u0530\5\u00be`\2\u052f\u052d\3\2\2\2\u0530\u0533"+
		"\3\2\2\2\u0531\u052f\3\2\2\2\u0531\u0532\3\2\2\2\u0532{\3\2\2\2\u0533"+
		"\u0531\3\2\2\2\u0534\u0536\5\u0080A\2\u0535\u0537\5~@\2\u0536\u0535\3"+
		"\2\2\2\u0536\u0537\3\2\2\2\u0537}\3\2\2\2\u0538\u0539\t\r\2\2\u0539\177"+
		"\3\2\2\2\u053a\u0564\5\u0082B\2\u053b\u053c\t\16\2\2\u053c\u053d\5\34"+
		"\17\2\u053d\u053e\5V,\2\u053e\u053f\3\2\2\2\u053f\u0540\5T+\2\u0540\u0563"+
		"\3\2\2\2\u0541\u054d\t\17\2\2\u0542\u0543\7:\2\2\u0543\u0548\5\u00c6d"+
		"\2\u0544\u0545\7\32\2\2\u0545\u0547\5\u00c6d\2\u0546\u0544\3\2\2\2\u0547"+
		"\u054a\3\2\2\2\u0548\u0546\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054b\3\2"+
		"\2\2\u054a\u0548\3\2\2\2\u054b\u054c\7/\2\2\u054c\u054e\3\2\2\2\u054d"+
		"\u0542\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u055d\5\u00a6"+
		"T\2\u0550\u055a\7S\2\2\u0551\u055b\5\u0090I\2\u0552\u0557\5R*\2\u0553"+
		"\u0554\7\32\2\2\u0554\u0556\5R*\2\u0555\u0553\3\2\2\2\u0556\u0559\3\2"+
		"\2\2\u0557\u0555\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u055b\3\2\2\2\u0559"+
		"\u0557\3\2\2\2\u055a\u0551\3\2\2\2\u055a\u0552\3\2\2\2\u055a\u055b\3\2"+
		"\2\2\u055b\u055c\3\2\2\2\u055c\u055e\7\r\2\2\u055d\u0550\3\2\2\2\u055d"+
		"\u055e\3\2\2\2\u055e\u0560\3\2\2\2\u055f\u0561\5\u008cG\2\u0560\u055f"+
		"\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0563\3\2\2\2\u0562\u053b\3\2\2\2\u0562"+
		"\u0541\3\2\2\2\u0563\u0566\3\2\2\2\u0564\u0562\3\2\2\2\u0564\u0565\3\2"+
		"\2\2\u0565\u0081\3\2\2\2\u0566\u0564\3\2\2\2\u0567\u0577\5$\23\2\u0568"+
		"\u0577\5\u00a0Q\2\u0569\u0577\5.\30\2\u056a\u0577\5\u00b6\\\2\u056b\u0577"+
		"\5\u00a4S\2\u056c\u0577\5\u0084C\2\u056d\u0577\5\u0094K\2\u056e\u0577"+
		"\5\u0098M\2\u056f\u0577\5\u009aN\2\u0570\u0577\5\u009cO\2\u0571\u0577"+
		"\5\u009eP\2\u0572\u0577\5\u00b0Y\2\u0573\u0577\5\u00b2Z\2\u0574\u0577"+
		"\5\u00b4[\2\u0575\u0577\5\u0092J\2\u0576\u0567\3\2\2\2\u0576\u0568\3\2"+
		"\2\2\u0576\u0569\3\2\2\2\u0576\u056a\3\2\2\2\u0576\u056b\3\2\2\2\u0576"+
		"\u056c\3\2\2\2\u0576\u056d\3\2\2\2\u0576\u056e\3\2\2\2\u0576\u056f\3\2"+
		"\2\2\u0576\u0570\3\2\2\2\u0576\u0571\3\2\2\2\u0576\u0572\3\2\2\2\u0576"+
		"\u0573\3\2\2\2\u0576\u0574\3\2\2\2\u0576\u0575\3\2\2\2\u0577\u0083\3\2"+
		"\2\2\u0578\u0580\5\u0086D\2\u0579\u0580\5\u008cG\2\u057a\u0580\5\u00a8"+
		"U\2\u057b\u0580\5\u00acW\2\u057c\u0580\5\u00aaV\2\u057d\u0580\5,\27\2"+
		"\u057e\u0580\5\u00aeX\2\u057f\u0578\3\2\2\2\u057f\u0579\3\2\2\2\u057f"+
		"\u057a\3\2\2\2\u057f\u057b\3\2\2\2\u057f\u057c\3\2\2\2\u057f\u057d\3\2"+
		"\2\2\u057f\u057e\3\2\2\2\u0580\u0085\3\2\2\2\u0581\u0584\5\u0088E\2\u0582"+
		"\u0584\5\u008aF\2\u0583\u0581\3\2\2\2\u0583\u0582\3\2\2\2\u0584\u0087"+
		"\3\2\2\2\u0585\u0586\7\64\2\2\u0586\u058f\7Y\2\2\u0587\u058c\5R*\2\u0588"+
		"\u0589\7\32\2\2\u0589\u058b\5R*\2\u058a\u0588\3\2\2\2\u058b\u058e\3\2"+
		"\2\2\u058c\u058a\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u0590\3\2\2\2\u058e"+
		"\u058c\3\2\2\2\u058f\u0587\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u0591\3\2"+
		"\2\2\u0591\u0592\7\t\2\2\u0592\u0089\3\2\2\2\u0593\u0594\7\64\2\2\u0594"+
		"\u059d\78\2\2\u0595\u059a\5R*\2\u0596\u0597\7\32\2\2\u0597\u0599\5R*\2"+
		"\u0598\u0596\3\2\2\2\u0599\u059c\3\2\2\2\u059a\u0598\3\2\2\2\u059a\u059b"+
		"\3\2\2\2\u059b\u059e\3\2\2\2\u059c\u059a\3\2\2\2\u059d\u0595\3\2\2\2\u059d"+
		"\u059e\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u05a0\7M\2\2\u05a0\u008b\3\2"+
		"\2\2\u05a1\u05ad\78\2\2\u05a2\u05a7\5(\25\2\u05a3\u05a4\7\32\2\2\u05a4"+
		"\u05a6\5(\25\2\u05a5\u05a3\3\2\2\2\u05a6\u05a9\3\2\2\2\u05a7\u05a5\3\2"+
		"\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05ab\3\2\2\2\u05a9\u05a7\3\2\2\2\u05aa"+
		"\u05a2\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05ae\7\26"+
		"\2\2\u05ad\u05aa\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05af\3\2\2\2\u05af"+
		"\u05b0\5\u008eH\2\u05b0\u05b1\7M\2\2\u05b1\u008d\3\2\2\2\u05b2\u05b4\5"+
		"\u00a2R\2\u05b3\u05b5\7e\2\2\u05b4\u05b3\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5"+
		"\u05b7\3\2\2\2\u05b6\u05b2\3\2\2\2\u05b7\u05ba\3\2\2\2\u05b8\u05b6\3\2"+
		"\2\2\u05b8\u05b9\3\2\2\2\u05b9\u008f\3\2\2\2\u05ba\u05b8\3\2\2\2\u05bb"+
		"\u05c0\5(\25\2\u05bc\u05bd\7\32\2\2\u05bd\u05bf\5(\25\2\u05be\u05bc\3"+
		"\2\2\2\u05bf\u05c2\3\2\2\2\u05c0\u05be\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1"+
		"\u05c4\3\2\2\2\u05c2\u05c0\3\2\2\2\u05c3\u05bb\3\2\2\2\u05c3\u05c4\3\2"+
		"\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c6\7\26\2\2\u05c6\u05c7\3\2\2\2\u05c7"+
		"\u05c8\5R*\2\u05c8\u0091\3\2\2\2\u05c9\u05ca\7S\2\2\u05ca\u05cb\5R*\2"+
		"\u05cb\u05cc\7\r\2\2\u05cc\u0093\3\2\2\2\u05cd\u05ce\7\35\2\2\u05ce\u05cf"+
		"\7S\2\2\u05cf\u05d0\5R*\2\u05d0\u05d1\7\r\2\2\u05d1\u05d4\5R*\2\u05d2"+
		"\u05d3\7%\2\2\u05d3\u05d5\5R*\2\u05d4\u05d2\3\2\2\2\u05d4\u05d5\3\2\2"+
		"\2\u05d5\u0095\3\2\2\2\u05d6\u05d8\5\u00be`\2\u05d7\u05d6\3\2\2\2\u05d7"+
		"\u05d8\3\2\2\2\u05d8\u05db\3\2\2\2\u05d9\u05da\7@\2\2\u05da\u05dc\5R*"+
		"\2\u05db\u05d9\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc\u05e0\3\2\2\2\u05dd\u05de"+
		"\7T\2\2\u05de\u05e1\5R*\2\u05df\u05e1\7\32\2\2\u05e0\u05dd\3\2\2\2\u05e0"+
		"\u05df\3\2\2\2\u05e1\u0097\3\2\2\2\u05e2\u05e3\7_\2\2\u05e3\u05e4\7S\2"+
		"\2\u05e4\u05e5\5(\25\2\u05e5\u05e6\7T\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05e8"+
		"\5R*\2\u05e8\u05e9\7\r\2\2\u05e9\u05ea\5R*\2\u05ea\u0099\3\2\2\2\u05eb"+
		"\u05ec\7_\2\2\u05ec\u05f5\7S\2\2\u05ed\u05f2\5\u00a2R\2\u05ee\u05ef\7"+
		"\32\2\2\u05ef\u05f1\5\u00a2R\2\u05f0\u05ee\3\2\2\2\u05f1\u05f4\3\2\2\2"+
		"\u05f2\u05f0\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f6\3\2\2\2\u05f4\u05f2"+
		"\3\2\2\2\u05f5\u05ed\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7"+
		"\u05f9\7e\2\2\u05f8\u05fa\5R*\2\u05f9\u05f8\3\2\2\2\u05f9\u05fa\3\2\2"+
		"\2\u05fa\u05fb\3\2\2\2\u05fb\u0604\7e\2\2\u05fc\u0601\5R*\2\u05fd\u05fe"+
		"\7\32\2\2\u05fe\u0600\5R*\2\u05ff\u05fd\3\2\2\2\u0600\u0603\3\2\2\2\u0601"+
		"\u05ff\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0605\3\2\2\2\u0603\u0601\3\2"+
		"\2\2\u0604\u05fc\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0606\3\2\2\2\u0606"+
		"\u0607\7\r\2\2\u0607\u0608\5R*\2\u0608\u009b\3\2\2\2\u0609\u060a\7\33"+
		"\2\2\u060a\u060b\7S\2\2\u060b\u060c\5R*\2\u060c\u060d\7\r\2\2\u060d\u060e"+
		"\5R*\2\u060e\u009d\3\2\2\2\u060f\u0610\7\13\2\2\u0610\u0611\5R*\2\u0611"+
		"\u0612\7\33\2\2\u0612\u0613\7S\2\2\u0613\u0614\5R*\2\u0614\u0615\7\r\2"+
		"\2\u0615\u009f\3\2\2\2\u0616\u061d\7Y\2\2\u0617\u0619\5\u00a2R\2\u0618"+
		"\u061a\7e\2\2\u0619\u0618\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u061c\3\2"+
		"\2\2\u061b\u0617\3\2\2\2\u061c\u061f\3\2\2\2\u061d\u061b\3\2\2\2\u061d"+
		"\u061e\3\2\2\2\u061e\u0620\3\2\2\2\u061f\u061d\3\2\2\2\u0620\u0621\7\t"+
		"\2\2\u0621\u00a1\3\2\2\2\u0622\u0625\5\"\22\2\u0623\u0625\5R*\2\u0624"+
		"\u0622\3\2\2\2\u0624\u0623\3\2\2\2\u0625\u00a3\3\2\2\2\u0626\u0627\7:"+
		"\2\2\u0627\u062c\5\u00c6d\2\u0628\u0629\7\32\2\2\u0629\u062b\5\u00c6d"+
		"\2\u062a\u0628\3\2\2\2\u062b\u062e\3\2\2\2\u062c\u062a\3\2\2\2\u062c\u062d"+
		"\3\2\2\2\u062d\u062f\3\2\2\2\u062e\u062c\3\2\2\2\u062f\u0630\7/\2\2\u0630"+
		"\u0632\3\2\2\2\u0631\u0626\3\2\2\2\u0631\u0632\3\2\2\2\u0632\u0633\3\2"+
		"\2\2\u0633\u0641\5\u00a6T\2\u0634\u063e\7S\2\2\u0635\u063f\5\u0090I\2"+
		"\u0636\u063b\5R*\2\u0637\u0638\7\32\2\2\u0638\u063a\5R*\2\u0639\u0637"+
		"\3\2\2\2\u063a\u063d\3\2\2\2\u063b\u0639\3\2\2\2\u063b\u063c\3\2\2\2\u063c"+
		"\u063f\3\2\2\2\u063d\u063b\3\2\2\2\u063e\u0635\3\2\2\2\u063e\u0636\3\2"+
		"\2\2\u063e\u063f\3\2\2\2\u063f\u0640\3\2\2\2\u0640\u0642\7\r\2\2\u0641"+
		"\u0634\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0644\3\2\2\2\u0643\u0645\5\u008c"+
		"G\2\u0644\u0643\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u00a5\3\2\2\2\u0646"+
		"\u0649\5\34\17\2\u0647\u0649\7A\2\2\u0648\u0646\3\2\2\2\u0648\u0647\3"+
		"\2\2\2\u0649\u00a7\3\2\2\2\u064a\u064b\t\20\2\2\u064b\u00a9\3\2\2\2\u064c"+
		"\u064d\7\24\2\2\u064d\u00ab\3\2\2\2\u064e\u064f\5\u00bc_\2\u064f\u00ad"+
		"\3\2\2\2\u0650\u0651\7\22\2\2\u0651\u0652\7S\2\2\u0652\u0656\5\u00ba^"+
		"\2\u0653\u0655\5\u00c0a\2\u0654\u0653\3\2\2\2\u0655\u0658\3\2\2\2\u0656"+
		"\u0654\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0659\3\2\2\2\u0658\u0656\3\2"+
		"\2\2\u0659\u065a\7\r\2\2\u065a\u00af\3\2\2\2\u065b\u065c\7\17\2\2\u065c"+
		"\u065d\5R*\2\u065d\u00b1\3\2\2\2\u065e\u0660\7d\2\2\u065f\u0661\5R*\2"+
		"\u0660\u065f\3\2\2\2\u0660\u0661\3\2\2\2\u0661\u00b3\3\2\2\2\u0662\u0663"+
		"\7V\2\2\u0663\u066f\5R*\2\u0664\u0666\5\u00b8]\2\u0665\u0664\3\2\2\2\u0666"+
		"\u0667\3\2\2\2\u0667\u0665\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u066b\3\2"+
		"\2\2\u0669\u066a\7J\2\2\u066a\u066c\5R*\2\u066b\u0669\3\2\2\2\u066b\u066c"+
		"\3\2\2\2\u066c\u0670\3\2\2\2\u066d\u066e\7J\2\2\u066e\u0670\5R*\2\u066f"+
		"\u0665\3\2\2\2\u066f\u066d\3\2\2\2\u0670\u00b5\3\2\2\2\u0671\u0672\7Q"+
		"\2\2\u0672\u0673\7S\2\2\u0673\u0674\3\2\2\2\u0674\u0675\5R*\2\u0675\u0676"+
		"\7\r\2\2\u0676\u0677\5R*\2\u0677\u00b7\3\2\2\2\u0678\u0679\7[\2\2\u0679"+
		"\u067a\7S\2\2\u067a\u067b\5*\26\2\u067b\u067c\7\r\2\2\u067c\u067d\5R*"+
		"\2\u067d\u00b9\3\2\2\2\u067e\u0683\5\32\16\2\u067f\u0680\7+\2\2\u0680"+
		"\u0682\5\32\16\2\u0681\u067f\3\2\2\2\u0682\u0685\3\2\2\2\u0683\u0681\3"+
		"\2\2\2\u0683\u0684\3\2\2\2\u0684\u00bb\3\2\2\2\u0685\u0683\3\2\2\2\u0686"+
		"\u068d\7s\2\2\u0687\u068a\t\21\2\2\u0688\u0689\7+\2\2\u0689\u068b\t\21"+
		"\2\2\u068a\u0688\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u068d\3\2\2\2\u068c"+
		"\u0686\3\2\2\2\u068c\u0687\3\2\2\2\u068d\u00bd\3\2\2\2\u068e\u0692\5\u00c4"+
		"c\2\u068f\u0691\5\u00c0a\2\u0690\u068f\3\2\2\2\u0691\u0694\3\2\2\2\u0692"+
		"\u0690\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u0697\3\2\2\2\u0694\u0692\3\2"+
		"\2\2\u0695\u0697\5\u00c2b\2\u0696\u068e\3\2\2\2\u0696\u0695\3\2\2\2\u0697"+
		"\u00bf\3\2\2\2\u0698\u0699\78\2\2\u0699\u069a\7M\2\2\u069a\u00c1\3\2\2"+
		"\2\u069b\u06a4\7S\2\2\u069c\u06a1\5\u00be`\2\u069d\u069e\7\32\2\2\u069e"+
		"\u06a0\5\u00be`\2\u069f\u069d\3\2\2\2\u06a0\u06a3\3\2\2\2\u06a1\u069f"+
		"\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a5\3\2\2\2\u06a3\u06a1\3\2\2\2\u06a4"+
		"\u069c\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06a8\7\r"+
		"\2\2\u06a7\u069b\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9"+
		"\u06aa\7]\2\2\u06aa\u06ab\5\u00be`\2\u06ab\u00c3\3\2\2\2\u06ac\u06b8\5"+
		"\u00ba^\2\u06ad\u06ae\7:\2\2\u06ae\u06b3\5\u00c6d\2\u06af\u06b0\7\32\2"+
		"\2\u06b0\u06b2\5\u00c6d\2\u06b1\u06af\3\2\2\2\u06b2\u06b5\3\2\2\2\u06b3"+
		"\u06b1\3\2\2\2\u06b3\u06b4\3\2\2\2\u06b4\u06b6\3\2\2\2\u06b5\u06b3\3\2"+
		"\2\2\u06b6\u06b7\7/\2\2\u06b7\u06b9\3\2\2\2\u06b8\u06ad\3\2\2\2\u06b8"+
		"\u06b9\3\2\2\2\u06b9\u00c5\3\2\2\2\u06ba\u06bd\5\u00be`\2\u06bb\u06bd"+
		"\5\u00c8e\2\u06bc\u06ba\3\2\2\2\u06bc\u06bb\3\2\2\2\u06bd\u00c7\3\2\2"+
		"\2\u06be\u06c1\7\37\2\2\u06bf\u06c2\5\u00caf\2\u06c0\u06c2\5\u00ceh\2"+
		"\u06c1\u06bf\3\2\2\2\u06c1\u06c0\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2\u00c9"+
		"\3\2\2\2\u06c3\u06c4\7Z\2\2\u06c4\u06c5\5\u00be`\2\u06c5\u00cb\3\2\2\2"+
		"\u06c6\u06c7\7\67\2\2\u06c7\u06c8\5\u00be`\2\u06c8\u00cd\3\2\2\2\u06c9"+
		"\u06ca\7A\2\2\u06ca\u06cb\5\u00be`\2\u06cb\u00cf\3\2\2\2\u06cc\u06d4\5"+
		"\32\16\2\u06cd\u06d1\5\u00caf\2\u06ce\u06d0\5\u00ccg\2\u06cf\u06ce\3\2"+
		"\2\2\u06d0\u06d3\3\2\2\2\u06d1\u06cf\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2"+
		"\u06d5\3\2\2\2\u06d3\u06d1\3\2\2\2\u06d4\u06cd\3\2\2\2\u06d4\u06d5\3\2"+
		"\2\2\u06d5\u00d1\3\2\2\2\u06d6\u06d7\5\u00ba^\2\u06d7\u06d8\7+\2\2\u06d8"+
		"\u06d9\7\4\2\2\u06d9\u00d3\3\2\2\2\u06da\u06dc\5\u00d6l\2\u06db\u06da"+
		"\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd\u06db\3\2\2\2\u06dd\u06de\3\2\2\2\u06de"+
		"\u00d5\3\2\2\2\u06df\u06eb\7*\2\2\u06e0\u06e2\7\\\2\2\u06e1\u06e3\7g\2"+
		"\2\u06e2\u06e1\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u06e7"+
		"\5\u00d8m\2\u06e5\u06e8\7\4\2\2\u06e6\u06e8\5\32\16\2\u06e7\u06e5\3\2"+
		"\2\2\u06e7\u06e6\3\2\2\2\u06e8\u06ec\3\2\2\2\u06e9\u06ec\5\u00ba^\2\u06ea"+
		"\u06ec\5\u00d2j\2\u06eb\u06e0\3\2\2\2\u06eb\u06e9\3\2\2\2\u06eb\u06ea"+
		"\3\2\2\2\u06ec\u06ee\3\2\2\2\u06ed\u06ef\7e\2\2\u06ee\u06ed\3\2\2\2\u06ee"+
		"\u06ef\3\2\2\2\u06ef\u00d7\3\2\2\2\u06f0\u06f1\5\32\16\2\u06f1\u06f2\7"+
		"+\2\2\u06f2\u06f4\3\2\2\2\u06f3\u06f0\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5"+
		"\u06f3\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6\u00d9\3\2\2\2\u00f4\u00dd\u00df"+
		"\u00e2\u00e7\u00ed\u00f3\u00fe\u0103\u0107\u010f\u0112\u0118\u0120\u012b"+
		"\u0130\u0138\u013b\u0141\u0149\u0154\u0157\u015a\u0161\u016a\u016f\u0174"+
		"\u017a\u0181\u0185\u018c\u0192\u0196\u0199\u019e\u01a9\u01ae\u01b2\u01ba"+
		"\u01bd\u01c3\u01cb\u01d6\u01db\u01e3\u01e6\u01ec\u01f4\u01ff\u0202\u0205"+
		"\u020c\u0215\u021a\u021f\u0225\u022c\u0230\u0237\u0239\u023e\u0244\u024b"+
		"\u0250\u0255\u0259\u025c\u0261\u0267\u0269\u0272\u0277\u028d\u0294\u0297"+
		"\u02a0\u02a3\u02a8\u02ad\u02b7\u02bc\u02c4\u02c7\u02d0\u02d3\u02d9\u02e4"+
		"\u02e9\u02ed\u02f5\u02f8\u02fe\u0306\u0311\u0316\u031e\u0321\u0327\u032f"+
		"\u033a\u033d\u0340\u0347\u0350\u0355\u035b\u0366\u0374\u037c\u0383\u038a"+
		"\u038d\u0391\u0397\u039b\u03a1\u03a5\u03ac\u03b0\u03ba\u03bf\u03c8\u03cb"+
		"\u03ce\u03d1\u03d4\u03d7\u03dc\u03e3\u03f0\u03f3\u03f9\u03ff\u0405\u040c"+
		"\u0410\u0414\u0419\u0425\u042a\u0430\u0438\u043c\u0440\u044b\u0450\u0460"+
		"\u0464\u0467\u0476\u0479\u0481\u0483\u0485\u048f\u0492\u0496\u049a\u04a6"+
		"\u04a8\u04b6\u04b9\u04c1\u04cc\u04d7\u04e2\u04e4\u04ec\u04f4\u0501\u0508"+
		"\u050c\u0514\u051f\u0528\u0531\u0536\u0548\u054d\u0557\u055a\u055d\u0560"+
		"\u0562\u0564\u0576\u057f\u0583\u058c\u058f\u059a\u059d\u05a7\u05aa\u05ad"+
		"\u05b4\u05b8\u05c0\u05c3\u05d4\u05d7\u05db\u05e0\u05f2\u05f5\u05f9\u0601"+
		"\u0604\u0619\u061d\u0624\u062c\u0631\u063b\u063e\u0641\u0644\u0648\u0656"+
		"\u0660\u0667\u066b\u066f\u0683\u068a\u068c\u0692\u0696\u06a1\u06a4\u06a7"+
		"\u06b3\u06b8\u06bc\u06c1\u06d1\u06d4\u06dd\u06e2\u06e7\u06eb\u06ee\u06f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}