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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, WS=17, 
		ENDL=18, Identifier=19, COMENTARIO=20, CADEIA=21, COMENTARIO_NAO_FECHADO=22, 
		ERRO_LEXICO=23;
	public static final int
		RULE_program = 0, RULE_source = 1, RULE_parameters = 2, RULE_parameter = 3, 
		RULE_header = 4, RULE_content = 5, RULE_footer = 6, RULE_element = 7, 
		RULE_logo_element = 8, RULE_button_element = 9, RULE_search_element = 10, 
		RULE_carousel_element = 11, RULE_text_element = 12, RULE_card_element = 13, 
		RULE_container_element = 14, RULE_image_element = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "source", "parameters", "parameter", "header", "content", 
			"footer", "element", "logo_element", "button_element", "search_element", 
			"carousel_element", "text_element", "card_element", "container_element", 
			"image_element"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'header('", "'){'", "'};'", "'content('", "'footer'", "'{'", 
			"'logo('", "'button('", "'search('", "'carousel('", "'text('", "');'", 
			"'card('", "'container('", "'image('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "WS", "ENDL", "Identifier", "COMENTARIO", 
			"CADEIA", "COMENTARIO_NAO_FECHADO", "ERRO_LEXICO"
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(32);
				header();
				}
			}

			setState(35);
			content();
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(36);
				footer();
				}
			}

			setState(39);
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
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(41);
				header();
				}
			}

			setState(44);
			content();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(45);
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(48);
				parameter();
				}
				}
				setState(53);
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
			setState(54);
			match(Identifier);
			setState(55);
			match(T__0);
			setState(56);
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
			setState(58);
			match(T__1);
			setState(59);
			parameters();
			setState(60);
			match(T__2);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				{
				setState(61);
				element();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
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
			setState(69);
			match(T__4);
			setState(70);
			parameters();
			setState(71);
			match(T__2);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				{
				setState(72);
				element();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
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
			setState(80);
			match(T__5);
			{
			setState(81);
			parameters();
			}
			setState(82);
			match(T__6);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				{
				setState(83);
				element();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
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
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				logo_element();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				button_element();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				search_element();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				carousel_element();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				text_element();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				card_element();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 7);
				{
				setState(97);
				container_element();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
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

	public static class Logo_elementContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
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
		enterRule(_localctx, 16, RULE_logo_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__7);
			setState(102);
			parameters();
			setState(103);
			match(T__2);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				{
				setState(104);
				element();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
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
		enterRule(_localctx, 18, RULE_button_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__8);
			setState(113);
			parameters();
			setState(114);
			match(T__2);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				{
				setState(115);
				element();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
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
		enterRule(_localctx, 20, RULE_search_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__9);
			setState(124);
			parameters();
			setState(125);
			match(T__2);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				{
				setState(126);
				element();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
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
		enterRule(_localctx, 22, RULE_carousel_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__10);
			setState(135);
			parameters();
			setState(136);
			match(T__2);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				{
				setState(137);
				element();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
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
		enterRule(_localctx, 24, RULE_text_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__11);
			setState(146);
			match(CADEIA);
			setState(147);
			match(T__12);
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
		enterRule(_localctx, 26, RULE_card_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__13);
			setState(150);
			parameters();
			setState(151);
			match(T__2);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				{
				setState(152);
				element();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
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
		enterRule(_localctx, 28, RULE_container_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__14);
			setState(161);
			parameters();
			setState(162);
			match(T__2);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				{
				setState(163);
				element();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
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
		enterRule(_localctx, 30, RULE_image_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__15);
			setState(172);
			parameters();
			setState(173);
			match(T__12);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00b2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\5\2"+
		"$\n\2\3\2\3\2\5\2(\n\2\3\2\3\2\3\3\5\3-\n\3\3\3\3\3\5\3\61\n\3\3\4\7\4"+
		"\64\n\4\f\4\16\4\67\13\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6A\n\6\f\6"+
		"\16\6D\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7L\n\7\f\7\16\7O\13\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\7\bW\n\b\f\b\16\bZ\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\tf\n\t\3\n\3\n\3\n\3\n\7\nl\n\n\f\n\16\no\13\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\7\13w\n\13\f\13\16\13z\13\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\7\f\u0082\n\f\f\f\16\f\u0085\13\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u008d\n"+
		"\r\f\r\16\r\u0090\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\7\17\u009c\n\17\f\17\16\17\u009f\13\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\7\20\u00a7\n\20\f\20\16\20\u00aa\13\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\2\u00b6\2#\3"+
		"\2\2\2\4,\3\2\2\2\6\65\3\2\2\2\b8\3\2\2\2\n<\3\2\2\2\fG\3\2\2\2\16R\3"+
		"\2\2\2\20e\3\2\2\2\22g\3\2\2\2\24r\3\2\2\2\26}\3\2\2\2\30\u0088\3\2\2"+
		"\2\32\u0093\3\2\2\2\34\u0097\3\2\2\2\36\u00a2\3\2\2\2 \u00ad\3\2\2\2\""+
		"$\5\n\6\2#\"\3\2\2\2#$\3\2\2\2$%\3\2\2\2%\'\5\f\7\2&(\5\16\b\2\'&\3\2"+
		"\2\2\'(\3\2\2\2()\3\2\2\2)*\7\2\2\3*\3\3\2\2\2+-\5\n\6\2,+\3\2\2\2,-\3"+
		"\2\2\2-.\3\2\2\2.\60\5\f\7\2/\61\5\16\b\2\60/\3\2\2\2\60\61\3\2\2\2\61"+
		"\5\3\2\2\2\62\64\5\b\5\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65"+
		"\66\3\2\2\2\66\7\3\2\2\2\67\65\3\2\2\289\7\25\2\29:\7\3\2\2:;\7\27\2\2"+
		";\t\3\2\2\2<=\7\4\2\2=>\5\6\4\2>B\7\5\2\2?A\5\20\t\2@?\3\2\2\2AD\3\2\2"+
		"\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\6\2\2F\13\3\2\2\2GH\7\7"+
		"\2\2HI\5\6\4\2IM\7\5\2\2JL\5\20\t\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3"+
		"\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\6\2\2Q\r\3\2\2\2RS\7\b\2\2ST\5\6\4\2TX"+
		"\7\t\2\2UW\5\20\t\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2"+
		"ZX\3\2\2\2[\\\7\6\2\2\\\17\3\2\2\2]f\5\22\n\2^f\5\24\13\2_f\5\26\f\2`"+
		"f\5\30\r\2af\5\32\16\2bf\5\34\17\2cf\5\36\20\2df\5 \21\2e]\3\2\2\2e^\3"+
		"\2\2\2e_\3\2\2\2e`\3\2\2\2ea\3\2\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\21"+
		"\3\2\2\2gh\7\n\2\2hi\5\6\4\2im\7\5\2\2jl\5\20\t\2kj\3\2\2\2lo\3\2\2\2"+
		"mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\6\2\2q\23\3\2\2\2rs\7\13"+
		"\2\2st\5\6\4\2tx\7\5\2\2uw\5\20\t\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3"+
		"\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7\6\2\2|\25\3\2\2\2}~\7\f\2\2~\177\5\6\4"+
		"\2\177\u0083\7\5\2\2\u0080\u0082\5\20\t\2\u0081\u0080\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0087\7\6\2\2\u0087\27\3\2\2\2\u0088\u0089\7\r\2"+
		"\2\u0089\u008a\5\6\4\2\u008a\u008e\7\5\2\2\u008b\u008d\5\20\t\2\u008c"+
		"\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\6\2\2\u0092"+
		"\31\3\2\2\2\u0093\u0094\7\16\2\2\u0094\u0095\7\27\2\2\u0095\u0096\7\17"+
		"\2\2\u0096\33\3\2\2\2\u0097\u0098\7\20\2\2\u0098\u0099\5\6\4\2\u0099\u009d"+
		"\7\5\2\2\u009a\u009c\5\20\t\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2"+
		"\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u00a0\u00a1\7\6\2\2\u00a1\35\3\2\2\2\u00a2\u00a3\7\21\2\2\u00a3"+
		"\u00a4\5\6\4\2\u00a4\u00a8\7\5\2\2\u00a5\u00a7\5\20\t\2\u00a6\u00a5\3"+
		"\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\6\2\2\u00ac\37\3\2\2"+
		"\2\u00ad\u00ae\7\22\2\2\u00ae\u00af\5\6\4\2\u00af\u00b0\7\17\2\2\u00b0"+
		"!\3\2\2\2\21#\',\60\65BMXemx\u0083\u008e\u009d\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}