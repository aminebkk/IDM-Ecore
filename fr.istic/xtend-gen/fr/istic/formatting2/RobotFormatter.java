/**
 * generated by Xtext 2.34.0
 */
package fr.istic.formatting2;

import com.google.inject.Inject;
import fr.istic.services.RobotGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import robot.Block;
import robot.FunctionIdentifier;
import robot.Program;
import robot.RFunction;

@SuppressWarnings("all")
public class RobotFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private RobotGrammarAccess _robotGrammarAccess;

  protected void _format(final Program program, @Extension final IFormattableDocument document) {
    EList<RFunction> _function = program.getFunction();
    for (final RFunction rFunction : _function) {
      document.<RFunction>format(rFunction);
    }
  }

  protected void _format(final RFunction rFunction, @Extension final IFormattableDocument document) {
    document.<FunctionIdentifier>format(rFunction.getFunctionidentifier());
    EList<Block> _block = rFunction.getBlock();
    for (final Block block : _block) {
      document.<Block>format(block);
    }
  }

  public void format(final Object program, final IFormattableDocument document) {
    if (program instanceof XtextResource) {
      _format((XtextResource)program, document);
      return;
    } else if (program instanceof Program) {
      _format((Program)program, document);
      return;
    } else if (program instanceof RFunction) {
      _format((RFunction)program, document);
      return;
    } else if (program instanceof EObject) {
      _format((EObject)program, document);
      return;
    } else if (program == null) {
      _format((Void)null, document);
      return;
    } else if (program != null) {
      _format(program, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(program, document).toString());
    }
  }
}
