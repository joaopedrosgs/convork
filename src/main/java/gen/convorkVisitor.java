// Generated from /home/pedro/convork/src/main/java/convork.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link convorkParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface convorkVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link convorkParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(convorkParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link convorkParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(convorkParser.SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link convorkParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(convorkParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link convorkParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(convorkParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link convorkParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(convorkParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link convorkParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(convorkParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link convorkParser#footer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFooter(convorkParser.FooterContext ctx);
	/**
	 * Visit a parse tree produced by {@link convorkParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(convorkParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link convorkParser#colorParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorParameter(convorkParser.ColorParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link convorkParser#paddingParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaddingParameter(convorkParser.PaddingParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link convorkParser#marginParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarginParameter(convorkParser.MarginParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link convorkParser#sizeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeParameter(convorkParser.SizeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link convorkParser#iconParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIconParameter(convorkParser.IconParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link convorkParser#logo_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogo_element(convorkParser.Logo_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link convorkParser#button_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButton_element(convorkParser.Button_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link convorkParser#search_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_element(convorkParser.Search_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link convorkParser#carousel_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCarousel_element(convorkParser.Carousel_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link convorkParser#text_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_element(convorkParser.Text_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link convorkParser#card_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCard_element(convorkParser.Card_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link convorkParser#container_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer_element(convorkParser.Container_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link convorkParser#image_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage_element(convorkParser.Image_elementContext ctx);
}