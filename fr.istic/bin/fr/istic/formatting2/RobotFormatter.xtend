/*
 * generated by Xtext 2.34.0
 */
package fr.istic.formatting2

import com.google.inject.Inject
import fr.istic.services.RobotGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import robot.Program
import robot.RFunction

class RobotFormatter extends AbstractFormatter2 {
	
	@Inject extension RobotGrammarAccess

	def dispatch void format(Program program, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (rFunction : program.function) {
			rFunction.format
		}
	}

	def dispatch void format(RFunction rFunction, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		rFunction.functionidentifier.format
		for (block : rFunction.block) {
			block.format
		}
	}
	
	// TODO: implement for Block, Forward, CallFunction, Var, Equals, Greater, Lesser, Add, Minus, Mul, Div, Distance, Backward, Left, Right, DistanceSensor, Condition, Loop
}
