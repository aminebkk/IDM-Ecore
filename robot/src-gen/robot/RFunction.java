/**
 */
package robot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RFunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.RFunction#getFunctionidentifier <em>Functionidentifier</em>}</li>
 *   <li>{@link robot.RFunction#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see robot.RobotPackage#getRFunction()
 * @model
 * @generated
 */
public interface RFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>Functionidentifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionidentifier</em>' containment reference.
	 * @see #setFunctionidentifier(FunctionIdentifier)
	 * @see robot.RobotPackage#getRFunction_Functionidentifier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FunctionIdentifier getFunctionidentifier();

	/**
	 * Sets the value of the '{@link robot.RFunction#getFunctionidentifier <em>Functionidentifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functionidentifier</em>' containment reference.
	 * @see #getFunctionidentifier()
	 * @generated
	 */
	void setFunctionidentifier(FunctionIdentifier value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference list.
	 * The list contents are of type {@link robot.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference list.
	 * @see robot.RobotPackage#getRFunction_Block()
	 * @model containment="true"
	 * @generated
	 */
	EList<Block> getBlock();

} // RFunction
