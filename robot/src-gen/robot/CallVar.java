/**
 */
package robot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.CallVar#getVaridentifier <em>Varidentifier</em>}</li>
 * </ul>
 *
 * @see robot.RobotPackage#getCallVar()
 * @model
 * @generated
 */
public interface CallVar extends Expression {
	/**
	 * Returns the value of the '<em><b>Varidentifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varidentifier</em>' reference.
	 * @see #setVaridentifier(VarIdentifier)
	 * @see robot.RobotPackage#getCallVar_Varidentifier()
	 * @model required="true"
	 * @generated
	 */
	VarIdentifier getVaridentifier();

	/**
	 * Sets the value of the '{@link robot.CallVar#getVaridentifier <em>Varidentifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varidentifier</em>' reference.
	 * @see #getVaridentifier()
	 * @generated
	 */
	void setVaridentifier(VarIdentifier value);

} // CallVar
