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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		WS=25, ENDL=26, Identifier=27, COMENTARIO=28, CADEIA=29, COMENTARIO_NAO_FECHADO=30, 
		ERRO_LEXICO=31;
	public static final int
		RULE_program = 0, RULE_source = 1, RULE_parameters = 2, RULE_parameter = 3, 
		RULE_header = 4, RULE_content = 5, RULE_footer = 6, RULE_element = 7, 
		RULE_colorParameter = 8, RULE_paddingParameter = 9, RULE_marginParameter = 10, 
		RULE_sizeParameter = 11, RULE_iconParameter = 12, RULE_logo_element = 13, 
		RULE_button_element = 14, RULE_search_element = 15, RULE_carousel_element = 16, 
		RULE_text_element = 17, RULE_card_element = 18, RULE_container_element = 19, 
		RULE_image_element = 20, RULE_section_element = 21, RULE_row_element = 22, 
		RULE_col_element = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "source", "parameters", "parameter", "header", "content", 
			"footer", "element", "colorParameter", "paddingParameter", "marginParameter", 
			"sizeParameter", "iconParameter", "logo_element", "button_element", "search_element", 
			"carousel_element", "text_element", "card_element", "container_element", 
			"image_element", "section_element", "row_element", "col_element"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'header('", "')'", "'{'", "'};'", "'content('", "'footer('", 
			"'color'", "'padding'", "'margin'", "'size'", "'icon'", "'logo('", "'button('", 
			"'search('", "'carousel('", "'text('", "');'", "'card('", "'container('", 
			"'image('", "'section('", "'row('", "'col('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "WS", "ENDL", "Identifier", "COMENTARIO", "CADEIA", "COMENTARIO_NAO_FECHADO", 
			"ERRO_LEXICO"
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
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(48);
				header();
				}
			}

			setState(51);
			content();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(52);
				footer();
				}
			}

			setState(55);
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
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(57);
				header();
				}
			}

			setState(60);
			content();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(61);
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
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(64);
				parameter();
				}
				}
				setState(69);
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
			setState(70);
			match(Identifier);
			setState(71);
			match(T__0);
			setState(72);
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
			setState(74);
			match(T__1);
			setState(75);
			parameters();
			setState(76);
			match(T__2);
			setState(77);
			match(T__3);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) {
				{
				{
				setState(78);
				element();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			match(T__4);
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
			setState(86);
			match(T__5);
			setState(87);
			parameters();
			setState(88);
			match(T__2);
			setState(89);
			match(T__3);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) {
				{
				{
				setState(90);
				element();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(T__4);
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
			setState(98);
			match(T__6);
			setState(99);
			parameters();
			setState(100);
			match(T__2);
			setState(101);
			match(T__3);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) {
				{
				{
				setState(102);
				element();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(T__4);
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
		public Section_elementContext section_element() {
			return getRuleContext(Section_elementContext.class,0);
		}
		public Row_elementContext row_element() {
			return getRuleContext(Row_elementContext.class,0);
		}
		public Col_elementContext col_element() {
			return getRuleContext(Col_elementContext.class,0);
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
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				logo_element();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				button_element();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				search_element();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				carousel_element();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				text_element();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				section_element();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				row_element();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 8);
				{
				setState(117);
				col_element();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 9);
				{
				setState(118);
				card_element();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 10);
				{
				setState(119);
				container_element();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 11);
				{
				setState(120);
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
			setState(123);
			match(T__7);
			setState(124);
			match(T__0);
			setState(125);
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
			setState(127);
			match(T__8);
			setState(128);
			match(T__0);
			setState(129);
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
			setState(131);
			match(T__9);
			setState(132);
			match(T__0);
			setState(133);
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
			setState(135);
			match(T__10);
			setState(136);
			match(T__0);
			setState(137);
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
			setState(139);
			match(T__11);
			setState(140);
			match(T__0);
			setState(141);
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
			setState(143);
			match(T__12);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
				{
				setState(147);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(144);
					sizeParameter();
					}
					break;
				case T__9:
					{
					setState(145);
					marginParameter();
					}
					break;
				case T__8:
					{
					setState(146);
					paddingParameter();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(T__2);
			setState(153);
			match(T__3);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) {
				{
				{
				setState(154);
				element();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(T__4);
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
			setState(162);
			match(T__13);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				setState(168);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(163);
					sizeParameter();
					}
					break;
				case T__9:
					{
					setState(164);
					marginParameter();
					}
					break;
				case T__8:
					{
					setState(165);
					paddingParameter();
					}
					break;
				case T__11:
					{
					setState(166);
					iconParameter();
					}
					break;
				case T__7:
					{
					setState(167);
					colorParameter();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(T__2);
			setState(174);
			match(T__3);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) {
				{
				{
				setState(175);
				element();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			match(T__4);
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
			setState(183);
			match(T__14);
			setState(184);
			parameters();
			setState(185);
			match(T__2);
			setState(186);
			match(T__3);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) {
				{
				{
				setState(187);
				element();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(T__4);
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
			setState(195);
			match(T__15);
			setState(196);
			parameters();
			setState(197);
			match(T__2);
			setState(198);
			match(T__3);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) {
				{
				{
				setState(199);
				element();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			match(T__4);
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
			setState(207);
			match(T__16);
			setState(208);
			match(CADEIA);
			setState(209);
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
			setState(211);
			match(T__18);
			setState(212);
			parameters();
			setState(213);
			match(T__2);
			setState(214);
			match(T__3);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) {
				{
				{
				setState(215);
				element();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			match(T__4);
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
			setState(223);
			match(T__19);
			setState(224);
			parameters();
			setState(225);
			match(T__2);
			setState(226);
			match(T__3);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) {
				{
				{
				setState(227);
				element();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
			match(T__4);
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
			setState(235);
			match(T__20);
			setState(236);
			parameters();
			setState(237);
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

	public static class Section_elementContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Section_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterSection_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitSection_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitSection_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Section_elementContext section_element() throws RecognitionException {
		Section_elementContext _localctx = new Section_elementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_section_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__21);
			setState(240);
			parameters();
			setState(241);
			match(T__2);
			setState(242);
			match(T__3);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) {
				{
				{
				setState(243);
				element();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			match(T__4);
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

	public static class Row_elementContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<Col_elementContext> col_element() {
			return getRuleContexts(Col_elementContext.class);
		}
		public Col_elementContext col_element(int i) {
			return getRuleContext(Col_elementContext.class,i);
		}
		public Row_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterRow_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitRow_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitRow_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Row_elementContext row_element() throws RecognitionException {
		Row_elementContext _localctx = new Row_elementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_row_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__22);
			setState(252);
			parameters();
			setState(253);
			match(T__2);
			setState(254);
			match(T__3);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(255);
				col_element();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			match(T__4);
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

	public static class Col_elementContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Col_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterCol_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitCol_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitCol_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Col_elementContext col_element() throws RecognitionException {
		Col_elementContext _localctx = new Col_elementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_col_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__23);
			setState(264);
			parameters();
			setState(265);
			match(T__2);
			setState(266);
			match(T__3);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) {
				{
				{
				setState(267);
				element();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			match(T__4);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u0116\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\5\2\64\n\2\3\2\3\2\5\28\n\2\3\2\3\2\3\3\5\3=\n\3\3\3\3\3\5\3A\n\3"+
		"\3\4\7\4D\n\4\f\4\16\4G\13\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6R"+
		"\n\6\f\6\16\6U\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7^\n\7\f\7\16\7a\13"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\bj\n\b\f\b\16\bm\13\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t|\n\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\7\17\u0096\n\17\f\17\16\17\u0099\13\17\3\17\3\17\3\17\7"+
		"\17\u009e\n\17\f\17\16\17\u00a1\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\7\20\u00ab\n\20\f\20\16\20\u00ae\13\20\3\20\3\20\3\20\7\20\u00b3"+
		"\n\20\f\20\16\20\u00b6\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u00bf"+
		"\n\21\f\21\16\21\u00c2\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u00cb"+
		"\n\22\f\22\16\22\u00ce\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\7\24\u00db\n\24\f\24\16\24\u00de\13\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\7\25\u00e7\n\25\f\25\16\25\u00ea\13\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\7\27\u00f7\n\27\f\27\16\27"+
		"\u00fa\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\7\30\u0103\n\30\f\30\16"+
		"\30\u0106\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\7\31\u010f\n\31\f\31"+
		"\16\31\u0112\13\31\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\2\2\2\u0120\2\63\3\2\2\2\4<\3\2\2\2\6E\3\2\2\2\b"+
		"H\3\2\2\2\nL\3\2\2\2\fX\3\2\2\2\16d\3\2\2\2\20{\3\2\2\2\22}\3\2\2\2\24"+
		"\u0081\3\2\2\2\26\u0085\3\2\2\2\30\u0089\3\2\2\2\32\u008d\3\2\2\2\34\u0091"+
		"\3\2\2\2\36\u00a4\3\2\2\2 \u00b9\3\2\2\2\"\u00c5\3\2\2\2$\u00d1\3\2\2"+
		"\2&\u00d5\3\2\2\2(\u00e1\3\2\2\2*\u00ed\3\2\2\2,\u00f1\3\2\2\2.\u00fd"+
		"\3\2\2\2\60\u0109\3\2\2\2\62\64\5\n\6\2\63\62\3\2\2\2\63\64\3\2\2\2\64"+
		"\65\3\2\2\2\65\67\5\f\7\2\668\5\16\b\2\67\66\3\2\2\2\678\3\2\2\289\3\2"+
		"\2\29:\7\2\2\3:\3\3\2\2\2;=\5\n\6\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>@\5"+
		"\f\7\2?A\5\16\b\2@?\3\2\2\2@A\3\2\2\2A\5\3\2\2\2BD\5\b\5\2CB\3\2\2\2D"+
		"G\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\7\3\2\2\2GE\3\2\2\2HI\7\35\2\2IJ\7\3\2"+
		"\2JK\7\37\2\2K\t\3\2\2\2LM\7\4\2\2MN\5\6\4\2NO\7\5\2\2OS\7\6\2\2PR\5\20"+
		"\t\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7\7"+
		"\2\2W\13\3\2\2\2XY\7\b\2\2YZ\5\6\4\2Z[\7\5\2\2[_\7\6\2\2\\^\5\20\t\2]"+
		"\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7\7\2\2"+
		"c\r\3\2\2\2de\7\t\2\2ef\5\6\4\2fg\7\5\2\2gk\7\6\2\2hj\5\20\t\2ih\3\2\2"+
		"\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\7\2\2o\17\3\2"+
		"\2\2p|\5\34\17\2q|\5\36\20\2r|\5 \21\2s|\5\"\22\2t|\5$\23\2u|\5,\27\2"+
		"v|\5.\30\2w|\5\60\31\2x|\5&\24\2y|\5(\25\2z|\5*\26\2{p\3\2\2\2{q\3\2\2"+
		"\2{r\3\2\2\2{s\3\2\2\2{t\3\2\2\2{u\3\2\2\2{v\3\2\2\2{w\3\2\2\2{x\3\2\2"+
		"\2{y\3\2\2\2{z\3\2\2\2|\21\3\2\2\2}~\7\n\2\2~\177\7\3\2\2\177\u0080\7"+
		"\37\2\2\u0080\23\3\2\2\2\u0081\u0082\7\13\2\2\u0082\u0083\7\3\2\2\u0083"+
		"\u0084\7\37\2\2\u0084\25\3\2\2\2\u0085\u0086\7\f\2\2\u0086\u0087\7\3\2"+
		"\2\u0087\u0088\7\37\2\2\u0088\27\3\2\2\2\u0089\u008a\7\r\2\2\u008a\u008b"+
		"\7\3\2\2\u008b\u008c\7\37\2\2\u008c\31\3\2\2\2\u008d\u008e\7\16\2\2\u008e"+
		"\u008f\7\3\2\2\u008f\u0090\7\37\2\2\u0090\33\3\2\2\2\u0091\u0097\7\17"+
		"\2\2\u0092\u0096\5\30\r\2\u0093\u0096\5\26\f\2\u0094\u0096\5\24\13\2\u0095"+
		"\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009b\7\5\2\2\u009b\u009f\7\6\2\2\u009c\u009e\5\20"+
		"\t\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\7"+
		"\2\2\u00a3\35\3\2\2\2\u00a4\u00ac\7\20\2\2\u00a5\u00ab\5\30\r\2\u00a6"+
		"\u00ab\5\26\f\2\u00a7\u00ab\5\24\13\2\u00a8\u00ab\5\32\16\2\u00a9\u00ab"+
		"\5\22\n\2\u00aa\u00a5\3\2\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00a7\3\2\2\2"+
		"\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00b0\7\5\2\2\u00b0\u00b4\7\6\2\2\u00b1\u00b3\5\20\t\2\u00b2\u00b1\3"+
		"\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\7\2\2\u00b8\37\3\2\2"+
		"\2\u00b9\u00ba\7\21\2\2\u00ba\u00bb\5\6\4\2\u00bb\u00bc\7\5\2\2\u00bc"+
		"\u00c0\7\6\2\2\u00bd\u00bf\5\20\t\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3"+
		"\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c4\7\7\2\2\u00c4!\3\2\2\2\u00c5\u00c6\7\22\2\2"+
		"\u00c6\u00c7\5\6\4\2\u00c7\u00c8\7\5\2\2\u00c8\u00cc\7\6\2\2\u00c9\u00cb"+
		"\5\20\t\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2"+
		"\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0"+
		"\7\7\2\2\u00d0#\3\2\2\2\u00d1\u00d2\7\23\2\2\u00d2\u00d3\7\37\2\2\u00d3"+
		"\u00d4\7\24\2\2\u00d4%\3\2\2\2\u00d5\u00d6\7\25\2\2\u00d6\u00d7\5\6\4"+
		"\2\u00d7\u00d8\7\5\2\2\u00d8\u00dc\7\6\2\2\u00d9\u00db\5\20\t\2\u00da"+
		"\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\7\2\2\u00e0"+
		"\'\3\2\2\2\u00e1\u00e2\7\26\2\2\u00e2\u00e3\5\6\4\2\u00e3\u00e4\7\5\2"+
		"\2\u00e4\u00e8\7\6\2\2\u00e5\u00e7\5\20\t\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7\7\2\2\u00ec)\3\2\2\2\u00ed\u00ee"+
		"\7\27\2\2\u00ee\u00ef\5\6\4\2\u00ef\u00f0\7\24\2\2\u00f0+\3\2\2\2\u00f1"+
		"\u00f2\7\30\2\2\u00f2\u00f3\5\6\4\2\u00f3\u00f4\7\5\2\2\u00f4\u00f8\7"+
		"\6\2\2\u00f5\u00f7\5\20\t\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fb\u00fc\7\7\2\2\u00fc-\3\2\2\2\u00fd\u00fe\7\31\2\2\u00fe\u00ff"+
		"\5\6\4\2\u00ff\u0100\7\5\2\2\u0100\u0104\7\6\2\2\u0101\u0103\5\60\31\2"+
		"\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7\7\2\2\u0108"+
		"/\3\2\2\2\u0109\u010a\7\32\2\2\u010a\u010b\5\6\4\2\u010b\u010c\7\5\2\2"+
		"\u010c\u0110\7\6\2\2\u010d\u010f\5\20\t\2\u010e\u010d\3\2\2\2\u010f\u0112"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0113\u0114\7\7\2\2\u0114\61\3\2\2\2\30\63\67<@ES_k{\u0095"+
		"\u0097\u009f\u00aa\u00ac\u00b4\u00c0\u00cc\u00dc\u00e8\u00f8\u0104\u0110";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}