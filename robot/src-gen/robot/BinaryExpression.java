/**
 */
package robot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.BinaryExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see robot.RobotPackage#getBinaryExpression()
 * @model abstract="true"
 * @generated
 */
public interface BinaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link robot.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see robot.RobotPackage#getBinaryExpression_Expression()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Expression> getExpression();

} // BinaryExpression
