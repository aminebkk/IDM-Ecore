/*
 * generated by Xtext 2.34.0
 */
package fr.istic.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.istic.ide.contentassist.antlr.internal.InternalRobotParser;
import fr.istic.services.RobotGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class RobotParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(RobotGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, RobotGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
			builder.put(grammarAccess.getUnitAccess().getAlternatives(), "rule__Unit__Alternatives");
			builder.put(grammarAccess.getBooleanExpressionAccess().getAlternatives(), "rule__BooleanExpression__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
			builder.put(grammarAccess.getProgramAccess().getGroup_3(), "rule__Program__Group_3__0");
			builder.put(grammarAccess.getProgramAccess().getGroup_3_3(), "rule__Program__Group_3_3__0");
			builder.put(grammarAccess.getRFunctionAccess().getGroup(), "rule__RFunction__Group__0");
			builder.put(grammarAccess.getRFunctionAccess().getGroup_4(), "rule__RFunction__Group_4__0");
			builder.put(grammarAccess.getRFunctionAccess().getGroup_4_3(), "rule__RFunction__Group_4_3__0");
			builder.put(grammarAccess.getFunctionIdentifierAccess().getGroup(), "rule__FunctionIdentifier__Group__0");
			builder.put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
			builder.put(grammarAccess.getBlockAccess().getGroup_3(), "rule__Block__Group_3__0");
			builder.put(grammarAccess.getBlockAccess().getGroup_3_3(), "rule__Block__Group_3_3__0");
			builder.put(grammarAccess.getForwardAccess().getGroup(), "rule__Forward__Group__0");
			builder.put(grammarAccess.getClockAccess().getGroup(), "rule__Clock__Group__0");
			builder.put(grammarAccess.getClockAccess().getGroup_3(), "rule__Clock__Group_3__0");
			builder.put(grammarAccess.getCallFunctionAccess().getGroup(), "rule__CallFunction__Group__0");
			builder.put(grammarAccess.getCallFunctionAccess().getGroup_4(), "rule__CallFunction__Group_4__0");
			builder.put(grammarAccess.getCallFunctionAccess().getGroup_4_3(), "rule__CallFunction__Group_4_3__0");
			builder.put(grammarAccess.getVarAccess().getGroup(), "rule__Var__Group__0");
			builder.put(grammarAccess.getCallVarAccess().getGroup(), "rule__CallVar__Group__0");
			builder.put(grammarAccess.getConstAccess().getGroup(), "rule__Const__Group__0");
			builder.put(grammarAccess.getConstAccess().getGroup_3(), "rule__Const__Group_3__0");
			builder.put(grammarAccess.getEqualsAccess().getGroup(), "rule__Equals__Group__0");
			builder.put(grammarAccess.getEqualsAccess().getGroup_5(), "rule__Equals__Group_5__0");
			builder.put(grammarAccess.getGreaterAccess().getGroup(), "rule__Greater__Group__0");
			builder.put(grammarAccess.getGreaterAccess().getGroup_5(), "rule__Greater__Group_5__0");
			builder.put(grammarAccess.getLesserAccess().getGroup(), "rule__Lesser__Group__0");
			builder.put(grammarAccess.getLesserAccess().getGroup_5(), "rule__Lesser__Group_5__0");
			builder.put(grammarAccess.getAddAccess().getGroup(), "rule__Add__Group__0");
			builder.put(grammarAccess.getAddAccess().getGroup_5(), "rule__Add__Group_5__0");
			builder.put(grammarAccess.getMinusAccess().getGroup(), "rule__Minus__Group__0");
			builder.put(grammarAccess.getMinusAccess().getGroup_5(), "rule__Minus__Group_5__0");
			builder.put(grammarAccess.getMulAccess().getGroup(), "rule__Mul__Group__0");
			builder.put(grammarAccess.getMulAccess().getGroup_5(), "rule__Mul__Group_5__0");
			builder.put(grammarAccess.getDivAccess().getGroup(), "rule__Div__Group__0");
			builder.put(grammarAccess.getDivAccess().getGroup_5(), "rule__Div__Group_5__0");
			builder.put(grammarAccess.getDistanceAccess().getGroup(), "rule__Distance__Group__0");
			builder.put(grammarAccess.getDistanceAccess().getGroup_2(), "rule__Distance__Group_2__0");
			builder.put(grammarAccess.getBackwardAccess().getGroup(), "rule__Backward__Group__0");
			builder.put(grammarAccess.getLeftAccess().getGroup(), "rule__Left__Group__0");
			builder.put(grammarAccess.getRightAccess().getGroup(), "rule__Right__Group__0");
			builder.put(grammarAccess.getDistanceSensorAccess().getGroup(), "rule__DistanceSensor__Group__0");
			builder.put(grammarAccess.getTimeSensorAccess().getGroup(), "rule__TimeSensor__Group__0");
			builder.put(grammarAccess.getTimeSensorAccess().getGroup_3(), "rule__TimeSensor__Group_3__0");
			builder.put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
			builder.put(grammarAccess.getConditionAccess().getGroup_6(), "rule__Condition__Group_6__0");
			builder.put(grammarAccess.getLoopAccess().getGroup(), "rule__Loop__Group__0");
			builder.put(grammarAccess.getORAccess().getGroup(), "rule__OR__Group__0");
			builder.put(grammarAccess.getANDAccess().getGroup(), "rule__AND__Group__0");
			builder.put(grammarAccess.getNOTAccess().getGroup(), "rule__NOT__Group__0");
			builder.put(grammarAccess.getTRUEAccess().getGroup(), "rule__TRUE__Group__0");
			builder.put(grammarAccess.getFALSEAccess().getGroup(), "rule__FALSE__Group__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getVarIdentifierAccess().getGroup(), "rule__VarIdentifier__Group__0");
			builder.put(grammarAccess.getCmAccess().getGroup(), "rule__Cm__Group__0");
			builder.put(grammarAccess.getMmAccess().getGroup(), "rule__Mm__Group__0");
			builder.put(grammarAccess.getProgramAccess().getFunctionAssignment_3_2(), "rule__Program__FunctionAssignment_3_2");
			builder.put(grammarAccess.getProgramAccess().getFunctionAssignment_3_3_1(), "rule__Program__FunctionAssignment_3_3_1");
			builder.put(grammarAccess.getRFunctionAccess().getFunctionidentifierAssignment_3(), "rule__RFunction__FunctionidentifierAssignment_3");
			builder.put(grammarAccess.getRFunctionAccess().getBlockAssignment_4_2(), "rule__RFunction__BlockAssignment_4_2");
			builder.put(grammarAccess.getRFunctionAccess().getBlockAssignment_4_3_1(), "rule__RFunction__BlockAssignment_4_3_1");
			builder.put(grammarAccess.getFunctionIdentifierAccess().getNameAssignment_2(), "rule__FunctionIdentifier__NameAssignment_2");
			builder.put(grammarAccess.getBlockAccess().getStatementAssignment_3_2(), "rule__Block__StatementAssignment_3_2");
			builder.put(grammarAccess.getBlockAccess().getStatementAssignment_3_3_1(), "rule__Block__StatementAssignment_3_3_1");
			builder.put(grammarAccess.getForwardAccess().getDistanceAssignment_3(), "rule__Forward__DistanceAssignment_3");
			builder.put(grammarAccess.getClockAccess().getAngleAssignment_3_1(), "rule__Clock__AngleAssignment_3_1");
			builder.put(grammarAccess.getCallFunctionAccess().getFunctionidentifierAssignment_3(), "rule__CallFunction__FunctionidentifierAssignment_3");
			builder.put(grammarAccess.getCallFunctionAccess().getParametersAssignment_4_2(), "rule__CallFunction__ParametersAssignment_4_2");
			builder.put(grammarAccess.getCallFunctionAccess().getParametersAssignment_4_3_1(), "rule__CallFunction__ParametersAssignment_4_3_1");
			builder.put(grammarAccess.getVarAccess().getVaridentifierAssignment_3(), "rule__Var__VaridentifierAssignment_3");
			builder.put(grammarAccess.getVarAccess().getExpressionAssignment_5(), "rule__Var__ExpressionAssignment_5");
			builder.put(grammarAccess.getCallVarAccess().getVaridentifierAssignment_3(), "rule__CallVar__VaridentifierAssignment_3");
			builder.put(grammarAccess.getConstAccess().getValueAssignment_3_1(), "rule__Const__ValueAssignment_3_1");
			builder.put(grammarAccess.getEqualsAccess().getExpressionAssignment_4(), "rule__Equals__ExpressionAssignment_4");
			builder.put(grammarAccess.getEqualsAccess().getExpressionAssignment_5_1(), "rule__Equals__ExpressionAssignment_5_1");
			builder.put(grammarAccess.getGreaterAccess().getExpressionAssignment_4(), "rule__Greater__ExpressionAssignment_4");
			builder.put(grammarAccess.getGreaterAccess().getExpressionAssignment_5_1(), "rule__Greater__ExpressionAssignment_5_1");
			builder.put(grammarAccess.getLesserAccess().getExpressionAssignment_4(), "rule__Lesser__ExpressionAssignment_4");
			builder.put(grammarAccess.getLesserAccess().getExpressionAssignment_5_1(), "rule__Lesser__ExpressionAssignment_5_1");
			builder.put(grammarAccess.getAddAccess().getExpressionAssignment_4(), "rule__Add__ExpressionAssignment_4");
			builder.put(grammarAccess.getAddAccess().getExpressionAssignment_5_1(), "rule__Add__ExpressionAssignment_5_1");
			builder.put(grammarAccess.getMinusAccess().getExpressionAssignment_4(), "rule__Minus__ExpressionAssignment_4");
			builder.put(grammarAccess.getMinusAccess().getExpressionAssignment_5_1(), "rule__Minus__ExpressionAssignment_5_1");
			builder.put(grammarAccess.getMulAccess().getExpressionAssignment_4(), "rule__Mul__ExpressionAssignment_4");
			builder.put(grammarAccess.getMulAccess().getExpressionAssignment_5_1(), "rule__Mul__ExpressionAssignment_5_1");
			builder.put(grammarAccess.getDivAccess().getExpressionAssignment_4(), "rule__Div__ExpressionAssignment_4");
			builder.put(grammarAccess.getDivAccess().getExpressionAssignment_5_1(), "rule__Div__ExpressionAssignment_5_1");
			builder.put(grammarAccess.getDistanceAccess().getValeurAssignment_2_1(), "rule__Distance__ValeurAssignment_2_1");
			builder.put(grammarAccess.getDistanceAccess().getUnitAssignment_4(), "rule__Distance__UnitAssignment_4");
			builder.put(grammarAccess.getBackwardAccess().getDistanceAssignment_3(), "rule__Backward__DistanceAssignment_3");
			builder.put(grammarAccess.getLeftAccess().getDistanceAssignment_3(), "rule__Left__DistanceAssignment_3");
			builder.put(grammarAccess.getRightAccess().getDistanceAssignment_3(), "rule__Right__DistanceAssignment_3");
			builder.put(grammarAccess.getDistanceSensorAccess().getDistanceAssignment_3(), "rule__DistanceSensor__DistanceAssignment_3");
			builder.put(grammarAccess.getTimeSensorAccess().getCurrentMillisAssignment_3_1(), "rule__TimeSensor__CurrentMillisAssignment_3_1");
			builder.put(grammarAccess.getConditionAccess().getConditionAssignment_3(), "rule__Condition__ConditionAssignment_3");
			builder.put(grammarAccess.getConditionAccess().getThenAssignment_5(), "rule__Condition__ThenAssignment_5");
			builder.put(grammarAccess.getConditionAccess().getElseAssignment_6_1(), "rule__Condition__ElseAssignment_6_1");
			builder.put(grammarAccess.getLoopAccess().getConditionAssignment_3(), "rule__Loop__ConditionAssignment_3");
			builder.put(grammarAccess.getLoopAccess().getStatementAssignment_5(), "rule__Loop__StatementAssignment_5");
			builder.put(grammarAccess.getVarIdentifierAccess().getNameAssignment_2(), "rule__VarIdentifier__NameAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private RobotGrammarAccess grammarAccess;

	@Override
	protected InternalRobotParser createParser() {
		InternalRobotParser result = new InternalRobotParser(null);
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

	public RobotGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RobotGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
