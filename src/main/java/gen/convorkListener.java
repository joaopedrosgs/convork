// Generated from /home/pedro/convork/src/main/java/convork.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link convorkParser}.
 */
public interface convorkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link convorkParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(convorkParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(convorkParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link convorkParser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(convorkParser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(convorkParser.SourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link convorkParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(convorkParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(convorkParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link convorkParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(convorkParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(convorkParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link convorkParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(convorkParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(convorkParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link convorkParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(convorkParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(convorkParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link convorkParser#footer}.
	 * @param ctx the parse tree
	 */
	void enterFooter(convorkParser.FooterContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#footer}.
	 * @param ctx the parse tree
	 */
	void exitFooter(convorkParser.FooterContext ctx);
	/**
	 * Enter a parse tree produced by {@link convorkParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(convorkParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(convorkParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link convorkParser#colorParameter}.
	 * @param ctx the parse tree
	 */
	void enterColorParameter(convorkParser.ColorParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#colorParameter}.
	 * @param ctx the parse tree
	 */
	void exitColorParameter(convorkParser.ColorParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link convorkParser#paddingParameter}.
	 * @param ctx the parse tree
	 */
	void enterPaddingParameter(convorkParser.PaddingParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#paddingParameter}.
	 * @param ctx the parse tree
	 */
	void exitPaddingParameter(convorkParser.PaddingParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link convorkParser#marginParameter}.
	 * @param ctx the parse tree
	 */
	void enterMarginParameter(convorkParser.MarginParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#marginParameter}.
	 * @param ctx the parse tree
	 */
	void exitMarginParameter(convorkParser.MarginParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link convorkParser#sizeParameter}.
	 * @param ctx the parse tree
	 */
	void enterSizeParameter(convorkParser.SizeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#sizeParameter}.
	 * @param ctx the parse tree
	 */
	void exitSizeParameter(convorkParser.SizeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link convorkParser#iconParameter}.
	 * @param ctx the parse tree
	 */
	void enterIconParameter(convorkParser.IconParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#iconParameter}.
	 * @param ctx the parse tree
	 */
	void exitIconParameter(convorkParser.IconParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link convorkParser#hrefParameter}.
	 * @param ctx the parse tree
	 */
	void enterHrefParameter(convorkParser.HrefParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#hrefParameter}.
	 * @param ctx the parse tree
	 */
	void exitHrefParameter(convorkParser.HrefParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link convorkParser#logo_element}.
	 * @param ctx the parse tree
	 */
	void enterLogo_element(convorkParser.Logo_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#logo_element}.
	 * @param ctx the parse tree
	 */
	void exitLogo_element(convorkParser.Logo_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link convorkParser#button_element}.
	 * @param ctx the parse tree
	 */
	void enterButton_element(convorkParser.Button_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#button_element}.
	 * @param ctx the parse tree
	 */
	void exitButton_element(convorkParser.Button_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link convorkParser#search_element}.
	 * @param ctx the parse tree
	 */
	void enterSearch_element(convorkParser.Search_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#search_element}.
	 * @param ctx the parse tree
	 */
	void exitSearch_element(convorkParser.Search_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link convorkParser#carousel_element}.
	 * @param ctx the parse tree
	 */
	void enterCarousel_element(convorkParser.Carousel_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#carousel_element}.
	 * @param ctx the parse tree
	 */
	void exitCarousel_element(convorkParser.Carousel_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link convorkParser#text_element}.
	 * @param ctx the parse tree
	 */
	void enterText_element(convorkParser.Text_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#text_element}.
	 * @param ctx the parse tree
	 */
	void exitText_element(convorkParser.Text_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link convorkParser#card_element}.
	 * @param ctx the parse tree
	 */
	void enterCard_element(convorkParser.Card_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#card_element}.
	 * @param ctx the parse tree
	 */
	void exitCard_element(convorkParser.Card_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link convorkParser#container_element}.
	 * @param ctx the parse tree
	 */
	void enterContainer_element(convorkParser.Container_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#container_element}.
	 * @param ctx the parse tree
	 */
	void exitContainer_element(convorkParser.Container_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link convorkParser#image_element}.
	 * @param ctx the parse tree
	 */
	void enterImage_element(convorkParser.Image_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#image_element}.
	 * @param ctx the parse tree
	 */
	void exitImage_element(convorkParser.Image_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link convorkParser#section_element}.
	 * @param ctx the parse tree
	 */
	void enterSection_element(convorkParser.Section_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#section_element}.
	 * @param ctx the parse tree
	 */
	void exitSection_element(convorkParser.Section_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link convorkParser#row_element}.
	 * @param ctx the parse tree
	 */
	void enterRow_element(convorkParser.Row_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#row_element}.
	 * @param ctx the parse tree
	 */
	void exitRow_element(convorkParser.Row_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link convorkParser#col_element}.
	 * @param ctx the parse tree
	 */
	void enterCol_element(convorkParser.Col_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link convorkParser#col_element}.
	 * @param ctx the parse tree
	 */
	void exitCol_element(convorkParser.Col_elementContext ctx);
}