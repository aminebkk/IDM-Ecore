/**
 */
package robot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.Condition#getThen <em>Then</em>}</li>
 *   <li>{@link robot.Condition#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see robot.RobotPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends Structure {
	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(Statement)
	 * @see robot.RobotPackage#getCondition_Then()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getThen();

	/**
	 * Sets the value of the '{@link robot.Condition#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(Statement value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(Statement)
	 * @see robot.RobotPackage#getCondition_Else()
	 * @model containment="true"
	 * @generated
	 */
	Statement getElse();

	/**
	 * Sets the value of the '{@link robot.Condition#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(Statement value);

} // Condition
