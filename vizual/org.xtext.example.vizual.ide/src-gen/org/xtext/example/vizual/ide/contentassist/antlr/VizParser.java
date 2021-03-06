/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.vizual.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.vizual.ide.contentassist.antlr.internal.InternalVizParser;
import org.xtext.example.vizual.services.VizGrammarAccess;

public class VizParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(VizGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, VizGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
			builder.put(grammarAccess.getCommonCommandAccess().getAlternatives(), "rule__CommonCommand__Alternatives");
			builder.put(grammarAccess.getTextHeadingAccess().getAlternatives(), "rule__TextHeading__Alternatives");
			builder.put(grammarAccess.getTableRowAccess().getDataAlternatives_3_0(), "rule__TableRow__DataAlternatives_3_0");
			builder.put(grammarAccess.getHeadCommandAccess().getGroup(), "rule__HeadCommand__Group__0");
			builder.put(grammarAccess.getBodyCommandAccess().getGroup(), "rule__BodyCommand__Group__0");
			builder.put(grammarAccess.getTitleCommandAccess().getGroup(), "rule__TitleCommand__Group__0");
			builder.put(grammarAccess.getDivCommandAccess().getGroup(), "rule__DivCommand__Group__0");
			builder.put(grammarAccess.getCreateAccess().getGroup(), "rule__Create__Group__0");
			builder.put(grammarAccess.getTextCommandAccess().getGroup(), "rule__TextCommand__Group__0");
			builder.put(grammarAccess.getTableCommandAccess().getGroup(), "rule__TableCommand__Group__0");
			builder.put(grammarAccess.getTableRowAccess().getGroup(), "rule__TableRow__Group__0");
			builder.put(grammarAccess.getTableHeaderAccess().getGroup(), "rule__TableHeader__Group__0");
			builder.put(grammarAccess.getTableDataAccess().getGroup(), "rule__TableData__Group__0");
			builder.put(grammarAccess.getInitializerAccess().getGroup(), "rule__Initializer__Group__0");
			builder.put(grammarAccess.getDropDownCommandAccess().getGroup(), "rule__DropDownCommand__Group__0");
			builder.put(grammarAccess.getBulletPointCommandAccess().getGroup(), "rule__BulletPointCommand__Group__0");
			builder.put(grammarAccess.getNumberedListCommandAccess().getGroup(), "rule__NumberedListCommand__Group__0");
			builder.put(grammarAccess.getModelAccess().getCommandsAssignment(), "rule__Model__CommandsAssignment");
			builder.put(grammarAccess.getCommandAccess().getHtmlAssignment_1(), "rule__Command__HtmlAssignment_1");
			builder.put(grammarAccess.getCommandAccess().getEndHtmlAssignment_2(), "rule__Command__EndHtmlAssignment_2");
			builder.put(grammarAccess.getHeadCommandAccess().getTitleAssignment_1(), "rule__HeadCommand__TitleAssignment_1");
			builder.put(grammarAccess.getBodyCommandAccess().getChildrenAssignment_3(), "rule__BodyCommand__ChildrenAssignment_3");
			builder.put(grammarAccess.getTitleCommandAccess().getTextAssignment_1(), "rule__TitleCommand__TextAssignment_1");
			builder.put(grammarAccess.getDivCommandAccess().getDivAssignment_0(), "rule__DivCommand__DivAssignment_0");
			builder.put(grammarAccess.getDivCommandAccess().getDivTextAssignment_1(), "rule__DivCommand__DivTextAssignment_1");
			builder.put(grammarAccess.getCreateAccess().getCommandAssignment_0(), "rule__Create__CommandAssignment_0");
			builder.put(grammarAccess.getCreateAccess().getBulletsAssignment_2(), "rule__Create__BulletsAssignment_2");
			builder.put(grammarAccess.getTextCommandAccess().getHeadingAssignment_0(), "rule__TextCommand__HeadingAssignment_0");
			builder.put(grammarAccess.getTextCommandAccess().getTextAssignment_1(), "rule__TextCommand__TextAssignment_1");
			builder.put(grammarAccess.getDivAccess().getDivisionAssignment(), "rule__Div__DivisionAssignment");
			builder.put(grammarAccess.getTableCommandAccess().getRowsAssignment_3(), "rule__TableCommand__RowsAssignment_3");
			builder.put(grammarAccess.getTableRowAccess().getDataAssignment_3(), "rule__TableRow__DataAssignment_3");
			builder.put(grammarAccess.getTableHeaderAccess().getTextAssignment_1(), "rule__TableHeader__TextAssignment_1");
			builder.put(grammarAccess.getTableDataAccess().getDataValueAssignment_1(), "rule__TableData__DataValueAssignment_1");
			builder.put(grammarAccess.getInitializerAccess().getLangAssignment_1(), "rule__Initializer__LangAssignment_1");
			builder.put(grammarAccess.getDropDownCommandAccess().getLabelAssignment_3(), "rule__DropDownCommand__LabelAssignment_3");
			builder.put(grammarAccess.getDropDownCommandAccess().getOptionsAssignment_6(), "rule__DropDownCommand__OptionsAssignment_6");
			builder.put(grammarAccess.getBulletPointCommandAccess().getChildrenAssignment_3(), "rule__BulletPointCommand__ChildrenAssignment_3");
			builder.put(grammarAccess.getNumberedListCommandAccess().getChildrenAssignment_3(), "rule__NumberedListCommand__ChildrenAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private VizGrammarAccess grammarAccess;

	@Override
	protected InternalVizParser createParser() {
		InternalVizParser result = new InternalVizParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public VizGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(VizGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
