/**
 */
package robot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.Program#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see robot.RobotPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link robot.RFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see robot.RobotPackage#getProgram_Function()
	 * @model containment="true"
	 * @generated
	 */
	EList<RFunction> getFunction();

} // Program
