/*
 * generated by Xtext 2.34.0
 */
package fr.istic.ui.tests;

import com.google.inject.Injector;
import fr.istic.ui.internal.IsticActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class RobotUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return IsticActivator.getInstance().getInjector("fr.istic.Robot");
	}

}
