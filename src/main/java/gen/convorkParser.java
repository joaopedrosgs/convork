// Generated from /home/pedro/convork/src/main/java/convork.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class convorkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, WS=22, ENDL=23, Identifier=24, 
		COMENTARIO=25, CADEIA=26, COMENTARIO_NAO_FECHADO=27, ERRO_LEXICO=28;
	public static final int
		RULE_program = 0, RULE_source = 1, RULE_parameters = 2, RULE_parameter = 3, 
		RULE_header = 4, RULE_content = 5, RULE_footer = 6, RULE_element = 7, 
		RULE_colorParameter = 8, RULE_paddingParameter = 9, RULE_marginParameter = 10, 
		RULE_sizeParameter = 11, RULE_iconParameter = 12, RULE_logo_element = 13, 
		RULE_button_element = 14, RULE_search_element = 15, RULE_carousel_element = 16, 
		RULE_text_element = 17, RULE_card_element = 18, RULE_container_element = 19, 
		RULE_image_element = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "source", "parameters", "parameter", "header", "content", 
			"footer", "element", "colorParameter", "paddingParameter", "marginParameter", 
			"sizeParameter", "iconParameter", "logo_element", "button_element", "search_element", 
			"carousel_element", "text_element", "card_element", "container_element", 
			"image_element"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'header('", "'){'", "'};'", "'content('", "'footer'", "'{'", 
			"'color='", "'padding='", "'margin='", "'size='", "'icon='", "'logo('", 
			"'button('", "'search('", "'carousel('", "'text('", "');'", "'card('", 
			"'container('", "'image('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "WS", "ENDL", 
			"Identifier", "COMENTARIO", "CADEIA", "COMENTARIO_NAO_FECHADO", "ERRO_LEXICO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "convork.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public convorkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode EOF() { return getToken(convorkParser.EOF, 0); }
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public FooterContext footer() {
			return getRuleContext(FooterContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(42);
				header();
				}
			}

			setState(45);
			content();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(46);
				footer();
				}
			}

			setState(49);
			match(EOF);
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

	public static class SourceContext extends ParserRuleContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public FooterContext footer() {
			return getRuleContext(FooterContext.class,0);
		}
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(51);
				header();
				}
			}

			setState(54);
			content();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(55);
				footer();
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

	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(58);
				parameter();
				}
				}
				setState(63);
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(convorkParser.Identifier, 0); }
		public TerminalNode CADEIA() { return getToken(convorkParser.CADEIA, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(Identifier);
			setState(65);
			match(T__0);
			setState(66);
			match(CADEIA);
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

	public static class HeaderContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__1);
			setState(69);
			parameters();
			setState(70);
			match(T__2);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
				{
				{
				setState(71);
				element();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(T__3);
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

	public static class ContentContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__4);
			setState(80);
			parameters();
			setState(81);
			match(T__2);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
				{
				{
				setState(82);
				element();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(T__3);
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

	public static class FooterContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public FooterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterFooter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitFooter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitFooter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FooterContext footer() throws RecognitionException {
		FooterContext _localctx = new FooterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_footer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__5);
			{
			setState(91);
			parameters();
			}
			setState(92);
			match(T__6);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
				{
				{
				setState(93);
				element();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__3);
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

	public static class ElementContext extends ParserRuleContext {
		public Logo_elementContext logo_element() {
			return getRuleContext(Logo_elementContext.class,0);
		}
		public Button_elementContext button_element() {
			return getRuleContext(Button_elementContext.class,0);
		}
		public Search_elementContext search_element() {
			return getRuleContext(Search_elementContext.class,0);
		}
		public Carousel_elementContext carousel_element() {
			return getRuleContext(Carousel_elementContext.class,0);
		}
		public Text_elementContext text_element() {
			return getRuleContext(Text_elementContext.class,0);
		}
		public Card_elementContext card_element() {
			return getRuleContext(Card_elementContext.class,0);
		}
		public Container_elementContext container_element() {
			return getRuleContext(Container_elementContext.class,0);
		}
		public Image_elementContext image_element() {
			return getRuleContext(Image_elementContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_element);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				logo_element();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				button_element();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				search_element();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				carousel_element();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				text_element();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				card_element();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				container_element();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 8);
				{
				setState(108);
				image_element();
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

	public static class ColorParameterContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(convorkParser.CADEIA, 0); }
		public ColorParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterColorParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitColorParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitColorParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorParameterContext colorParameter() throws RecognitionException {
		ColorParameterContext _localctx = new ColorParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_colorParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__7);
			setState(112);
			match(CADEIA);
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

	public static class PaddingParameterContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(convorkParser.CADEIA, 0); }
		public PaddingParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paddingParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterPaddingParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitPaddingParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitPaddingParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaddingParameterContext paddingParameter() throws RecognitionException {
		PaddingParameterContext _localctx = new PaddingParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_paddingParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__8);
			setState(115);
			match(CADEIA);
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

	public static class MarginParameterContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(convorkParser.CADEIA, 0); }
		public MarginParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_marginParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterMarginParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitMarginParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitMarginParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarginParameterContext marginParameter() throws RecognitionException {
		MarginParameterContext _localctx = new MarginParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_marginParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__9);
			setState(118);
			match(CADEIA);
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

	public static class SizeParameterContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(convorkParser.CADEIA, 0); }
		public SizeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterSizeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitSizeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitSizeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeParameterContext sizeParameter() throws RecognitionException {
		SizeParameterContext _localctx = new SizeParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sizeParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__10);
			setState(121);
			match(CADEIA);
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

	public static class IconParameterContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(convorkParser.CADEIA, 0); }
		public IconParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iconParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterIconParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitIconParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitIconParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IconParameterContext iconParameter() throws RecognitionException {
		IconParameterContext _localctx = new IconParameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_iconParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__11);
			setState(124);
			match(CADEIA);
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

	public static class Logo_elementContext extends ParserRuleContext {
		public List<SizeParameterContext> sizeParameter() {
			return getRuleContexts(SizeParameterContext.class);
		}
		public SizeParameterContext sizeParameter(int i) {
			return getRuleContext(SizeParameterContext.class,i);
		}
		public List<MarginParameterContext> marginParameter() {
			return getRuleContexts(MarginParameterContext.class);
		}
		public MarginParameterContext marginParameter(int i) {
			return getRuleContext(MarginParameterContext.class,i);
		}
		public List<PaddingParameterContext> paddingParameter() {
			return getRuleContexts(PaddingParameterContext.class);
		}
		public PaddingParameterContext paddingParameter(int i) {
			return getRuleContext(PaddingParameterContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Logo_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logo_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterLogo_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitLogo_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitLogo_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logo_elementContext logo_element() throws RecognitionException {
		Logo_elementContext _localctx = new Logo_elementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logo_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__12);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
				{
				setState(130);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(127);
					sizeParameter();
					}
					break;
				case T__9:
					{
					setState(128);
					marginParameter();
					}
					break;
				case T__8:
					{
					setState(129);
					paddingParameter();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			match(T__2);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
				{
				{
				setState(136);
				element();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(T__3);
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

	public static class Button_elementContext extends ParserRuleContext {
		public List<SizeParameterContext> sizeParameter() {
			return getRuleContexts(SizeParameterContext.class);
		}
		public SizeParameterContext sizeParameter(int i) {
			return getRuleContext(SizeParameterContext.class,i);
		}
		public List<MarginParameterContext> marginParameter() {
			return getRuleContexts(MarginParameterContext.class);
		}
		public MarginParameterContext marginParameter(int i) {
			return getRuleContext(MarginParameterContext.class,i);
		}
		public List<PaddingParameterContext> paddingParameter() {
			return getRuleContexts(PaddingParameterContext.class);
		}
		public PaddingParameterContext paddingParameter(int i) {
			return getRuleContext(PaddingParameterContext.class,i);
		}
		public List<IconParameterContext> iconParameter() {
			return getRuleContexts(IconParameterContext.class);
		}
		public IconParameterContext iconParameter(int i) {
			return getRuleContext(IconParameterContext.class,i);
		}
		public List<ColorParameterContext> colorParameter() {
			return getRuleContexts(ColorParameterContext.class);
		}
		public ColorParameterContext colorParameter(int i) {
			return getRuleContext(ColorParameterContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Button_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_button_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterButton_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitButton_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitButton_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Button_elementContext button_element() throws RecognitionException {
		Button_elementContext _localctx = new Button_elementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_button_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__13);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				setState(150);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(145);
					sizeParameter();
					}
					break;
				case T__9:
					{
					setState(146);
					marginParameter();
					}
					break;
				case T__8:
					{
					setState(147);
					paddingParameter();
					}
					break;
				case T__11:
					{
					setState(148);
					iconParameter();
					}
					break;
				case T__7:
					{
					setState(149);
					colorParameter();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(T__2);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
				{
				{
				setState(156);
				element();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(T__3);
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

	public static class Search_elementContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Search_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterSearch_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitSearch_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitSearch_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Search_elementContext search_element() throws RecognitionException {
		Search_elementContext _localctx = new Search_elementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_search_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__14);
			setState(165);
			parameters();
			setState(166);
			match(T__2);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
				{
				{
				setState(167);
				element();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(T__3);
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

	public static class Carousel_elementContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Carousel_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_carousel_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterCarousel_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitCarousel_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitCarousel_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Carousel_elementContext carousel_element() throws RecognitionException {
		Carousel_elementContext _localctx = new Carousel_elementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_carousel_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__15);
			setState(176);
			parameters();
			setState(177);
			match(T__2);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
				{
				{
				setState(178);
				element();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			match(T__3);
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

	public static class Text_elementContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(convorkParser.CADEIA, 0); }
		public Text_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterText_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitText_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitText_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_elementContext text_element() throws RecognitionException {
		Text_elementContext _localctx = new Text_elementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_text_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__16);
			setState(187);
			match(CADEIA);
			setState(188);
			match(T__17);
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

	public static class Card_elementContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Card_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_card_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterCard_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitCard_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitCard_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Card_elementContext card_element() throws RecognitionException {
		Card_elementContext _localctx = new Card_elementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_card_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__18);
			setState(191);
			parameters();
			setState(192);
			match(T__2);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
				{
				{
				setState(193);
				element();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(T__3);
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

	public static class Container_elementContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Container_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterContainer_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitContainer_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitContainer_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Container_elementContext container_element() throws RecognitionException {
		Container_elementContext _localctx = new Container_elementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_container_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__19);
			setState(202);
			parameters();
			setState(203);
			match(T__2);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
				{
				{
				setState(204);
				element();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			match(T__3);
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

	public static class Image_elementContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Image_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterImage_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitImage_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitImage_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Image_elementContext image_element() throws RecognitionException {
		Image_elementContext _localctx = new Image_elementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_image_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__20);
			setState(213);
			parameters();
			setState(214);
			match(T__17);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00db\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\5\2.\n\2\3\2\3\2\5\2\62\n"+
		"\2\3\2\3\2\3\3\5\3\67\n\3\3\3\3\3\5\3;\n\3\3\4\7\4>\n\4\f\4\16\4A\13\4"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\7\7V\n\7\f\7\16\7Y\13\7\3\7\3\7\3\b\3\b\3\b\3\b\7\ba\n\b\f"+
		"\b\16\bd\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tp\n\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\7\17\u0085\n\17\f\17\16\17\u0088\13\17\3\17\3\17\7\17\u008c\n"+
		"\17\f\17\16\17\u008f\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u0099\n\20\f\20\16\20\u009c\13\20\3\20\3\20\7\20\u00a0\n\20\f\20\16\20"+
		"\u00a3\13\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00ab\n\21\f\21\16\21"+
		"\u00ae\13\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00b6\n\22\f\22\16\22"+
		"\u00b9\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00c5"+
		"\n\24\f\24\16\24\u00c8\13\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00d0"+
		"\n\25\f\25\16\25\u00d3\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\2\2\27"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\2\2\u00e2\2-\3\2\2\2"+
		"\4\66\3\2\2\2\6?\3\2\2\2\bB\3\2\2\2\nF\3\2\2\2\fQ\3\2\2\2\16\\\3\2\2\2"+
		"\20o\3\2\2\2\22q\3\2\2\2\24t\3\2\2\2\26w\3\2\2\2\30z\3\2\2\2\32}\3\2\2"+
		"\2\34\u0080\3\2\2\2\36\u0092\3\2\2\2 \u00a6\3\2\2\2\"\u00b1\3\2\2\2$\u00bc"+
		"\3\2\2\2&\u00c0\3\2\2\2(\u00cb\3\2\2\2*\u00d6\3\2\2\2,.\5\n\6\2-,\3\2"+
		"\2\2-.\3\2\2\2./\3\2\2\2/\61\5\f\7\2\60\62\5\16\b\2\61\60\3\2\2\2\61\62"+
		"\3\2\2\2\62\63\3\2\2\2\63\64\7\2\2\3\64\3\3\2\2\2\65\67\5\n\6\2\66\65"+
		"\3\2\2\2\66\67\3\2\2\2\678\3\2\2\28:\5\f\7\29;\5\16\b\2:9\3\2\2\2:;\3"+
		"\2\2\2;\5\3\2\2\2<>\5\b\5\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\7"+
		"\3\2\2\2A?\3\2\2\2BC\7\32\2\2CD\7\3\2\2DE\7\34\2\2E\t\3\2\2\2FG\7\4\2"+
		"\2GH\5\6\4\2HL\7\5\2\2IK\5\20\t\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2"+
		"\2\2MO\3\2\2\2NL\3\2\2\2OP\7\6\2\2P\13\3\2\2\2QR\7\7\2\2RS\5\6\4\2SW\7"+
		"\5\2\2TV\5\20\t\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW"+
		"\3\2\2\2Z[\7\6\2\2[\r\3\2\2\2\\]\7\b\2\2]^\5\6\4\2^b\7\t\2\2_a\5\20\t"+
		"\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\6\2"+
		"\2f\17\3\2\2\2gp\5\34\17\2hp\5\36\20\2ip\5 \21\2jp\5\"\22\2kp\5$\23\2"+
		"lp\5&\24\2mp\5(\25\2np\5*\26\2og\3\2\2\2oh\3\2\2\2oi\3\2\2\2oj\3\2\2\2"+
		"ok\3\2\2\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\21\3\2\2\2qr\7\n\2\2rs\7\34"+
		"\2\2s\23\3\2\2\2tu\7\13\2\2uv\7\34\2\2v\25\3\2\2\2wx\7\f\2\2xy\7\34\2"+
		"\2y\27\3\2\2\2z{\7\r\2\2{|\7\34\2\2|\31\3\2\2\2}~\7\16\2\2~\177\7\34\2"+
		"\2\177\33\3\2\2\2\u0080\u0086\7\17\2\2\u0081\u0085\5\30\r\2\u0082\u0085"+
		"\5\26\f\2\u0083\u0085\5\24\13\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2"+
		"\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008d\7\5\2\2\u008a"+
		"\u008c\5\20\t\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0091\7\6\2\2\u0091\35\3\2\2\2\u0092\u009a\7\20\2\2\u0093\u0099\5\30"+
		"\r\2\u0094\u0099\5\26\f\2\u0095\u0099\5\24\13\2\u0096\u0099\5\32\16\2"+
		"\u0097\u0099\5\22\n\2\u0098\u0093\3\2\2\2\u0098\u0094\3\2\2\2\u0098\u0095"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009d\u00a1\7\5\2\2\u009e\u00a0\5\20\t\2\u009f\u009e\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\6\2\2\u00a5\37\3\2\2\2\u00a6\u00a7"+
		"\7\21\2\2\u00a7\u00a8\5\6\4\2\u00a8\u00ac\7\5\2\2\u00a9\u00ab\5\20\t\2"+
		"\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\6\2\2\u00b0"+
		"!\3\2\2\2\u00b1\u00b2\7\22\2\2\u00b2\u00b3\5\6\4\2\u00b3\u00b7\7\5\2\2"+
		"\u00b4\u00b6\5\20\t\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"\u00bb\7\6\2\2\u00bb#\3\2\2\2\u00bc\u00bd\7\23\2\2\u00bd\u00be\7\34\2"+
		"\2\u00be\u00bf\7\24\2\2\u00bf%\3\2\2\2\u00c0\u00c1\7\25\2\2\u00c1\u00c2"+
		"\5\6\4\2\u00c2\u00c6\7\5\2\2\u00c3\u00c5\5\20\t\2\u00c4\u00c3\3\2\2\2"+
		"\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9"+
		"\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\6\2\2\u00ca\'\3\2\2\2\u00cb"+
		"\u00cc\7\26\2\2\u00cc\u00cd\5\6\4\2\u00cd\u00d1\7\5\2\2\u00ce\u00d0\5"+
		"\20\t\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7\6"+
		"\2\2\u00d5)\3\2\2\2\u00d6\u00d7\7\27\2\2\u00d7\u00d8\5\6\4\2\u00d8\u00d9"+
		"\7\24\2\2\u00d9+\3\2\2\2\25-\61\66:?LWbo\u0084\u0086\u008d\u0098\u009a"+
		"\u00a1\u00ac\u00b7\u00c6\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}