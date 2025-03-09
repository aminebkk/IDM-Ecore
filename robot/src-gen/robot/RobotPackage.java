/**
 */
package robot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see robot.RobotFactory
 * @model kind="package"
 * @generated
 */
public interface RobotPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "robot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/robot";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "robot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobotPackage eINSTANCE = robot.impl.RobotPackageImpl.init();

	/**
	 * The meta object id for the '{@link robot.impl.RFunctionImpl <em>RFunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.RFunctionImpl
	 * @see robot.impl.RobotPackageImpl#getRFunction()
	 * @generated
	 */
	int RFUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Functionidentifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFUNCTION__FUNCTIONIDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFUNCTION__BLOCK = 1;

	/**
	 * The number of structural features of the '<em>RFunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFUNCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>RFunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robot.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.StatementImpl
	 * @see robot.impl.RobotPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 2;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robot.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.BlockImpl
	 * @see robot.impl.RobotPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATEMENT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.PrimitiveImpl <em>Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.PrimitiveImpl
	 * @see robot.impl.RobotPackageImpl#getPrimitive()
	 * @generated
	 */
	int PRIMITIVE = 3;

	/**
	 * The number of structural features of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.MovementImpl <em>Movement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.MovementImpl
	 * @see robot.impl.RobotPackageImpl#getMovement()
	 * @generated
	 */
	int MOVEMENT = 29;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT__DISTANCE = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.ForwardImpl <em>Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.ForwardImpl
	 * @see robot.impl.RobotPackageImpl#getForward()
	 * @generated
	 */
	int FORWARD = 4;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD__DISTANCE = MOVEMENT__DISTANCE;

	/**
	 * The number of structural features of the '<em>Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.UnitImpl
	 * @see robot.impl.RobotPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 5;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robot.impl.CmImpl <em>Cm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.CmImpl
	 * @see robot.impl.RobotPackageImpl#getCm()
	 * @generated
	 */
	int CM = 6;

	/**
	 * The number of structural features of the '<em>Cm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.MmImpl <em>Mm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.MmImpl
	 * @see robot.impl.RobotPackageImpl#getMm()
	 * @generated
	 */
	int MM = 7;

	/**
	 * The number of structural features of the '<em>Mm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MM_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MM_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.ClockImpl <em>Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.ClockImpl
	 * @see robot.impl.RobotPackageImpl#getClock()
	 * @generated
	 */
	int CLOCK = 8;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__ANGLE = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.ProgramImpl
	 * @see robot.impl.RobotPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 9;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__FUNCTION = 0;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robot.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.ExpressionImpl
	 * @see robot.impl.RobotPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 15;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.CallFunctionImpl <em>Call Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.CallFunctionImpl
	 * @see robot.impl.RobotPackageImpl#getCallFunction()
	 * @generated
	 */
	int CALL_FUNCTION = 10;

	/**
	 * The feature id for the '<em><b>Functionidentifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUNCTION__FUNCTIONIDENTIFIER = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUNCTION__PARAMETERS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Call Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUNCTION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.FunctionIdentifierImpl <em>Function Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.FunctionIdentifierImpl
	 * @see robot.impl.RobotPackageImpl#getFunctionIdentifier()
	 * @generated
	 */
	int FUNCTION_IDENTIFIER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_IDENTIFIER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Function Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_IDENTIFIER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Function Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_IDENTIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robot.impl.VarImpl <em>Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.VarImpl
	 * @see robot.impl.RobotPackageImpl#getVar()
	 * @generated
	 */
	int VAR = 12;

	/**
	 * The feature id for the '<em><b>Varidentifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__VARIDENTIFIER = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.VarIdentifierImpl <em>Var Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.VarIdentifierImpl
	 * @see robot.impl.RobotPackageImpl#getVarIdentifier()
	 * @generated
	 */
	int VAR_IDENTIFIER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_IDENTIFIER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Var Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_IDENTIFIER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Var Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_IDENTIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robot.impl.CallVarImpl <em>Call Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.CallVarImpl
	 * @see robot.impl.RobotPackageImpl#getCallVar()
	 * @generated
	 */
	int CALL_VAR = 14;

	/**
	 * The feature id for the '<em><b>Varidentifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VAR__VARIDENTIFIER = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VAR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Call Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VAR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.ConstImpl <em>Const</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.ConstImpl
	 * @see robot.impl.RobotPackageImpl#getConst()
	 * @generated
	 */
	int CONST = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.BinaryExpressionImpl
	 * @see robot.impl.RobotPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.EqualsImpl <em>Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.EqualsImpl
	 * @see robot.impl.RobotPackageImpl#getEquals()
	 * @generated
	 */
	int EQUALS = 18;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__EXPRESSION = BINARY_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.GreaterImpl <em>Greater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.GreaterImpl
	 * @see robot.impl.RobotPackageImpl#getGreater()
	 * @generated
	 */
	int GREATER = 19;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__EXPRESSION = BINARY_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.LesserImpl <em>Lesser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.LesserImpl
	 * @see robot.impl.RobotPackageImpl#getLesser()
	 * @generated
	 */
	int LESSER = 20;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESSER__EXPRESSION = BINARY_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Lesser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESSER_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lesser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESSER_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.AddImpl
	 * @see robot.impl.RobotPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 21;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__EXPRESSION = BINARY_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.MinusImpl <em>Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.MinusImpl
	 * @see robot.impl.RobotPackageImpl#getMinus()
	 * @generated
	 */
	int MINUS = 22;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__EXPRESSION = BINARY_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.MulImpl <em>Mul</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.MulImpl
	 * @see robot.impl.RobotPackageImpl#getMul()
	 * @generated
	 */
	int MUL = 23;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL__EXPRESSION = BINARY_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Mul</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mul</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.DivImpl <em>Div</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.DivImpl
	 * @see robot.impl.RobotPackageImpl#getDiv()
	 * @generated
	 */
	int DIV = 24;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__EXPRESSION = BINARY_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.DistanceImpl <em>Distance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.DistanceImpl
	 * @see robot.impl.RobotPackageImpl#getDistance()
	 * @generated
	 */
	int DISTANCE = 25;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__VALEUR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__UNIT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.BackwardImpl <em>Backward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.BackwardImpl
	 * @see robot.impl.RobotPackageImpl#getBackward()
	 * @generated
	 */
	int BACKWARD = 26;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKWARD__DISTANCE = MOVEMENT__DISTANCE;

	/**
	 * The number of structural features of the '<em>Backward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKWARD_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Backward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKWARD_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.LeftImpl <em>Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.LeftImpl
	 * @see robot.impl.RobotPackageImpl#getLeft()
	 * @generated
	 */
	int LEFT = 27;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT__DISTANCE = MOVEMENT__DISTANCE;

	/**
	 * The number of structural features of the '<em>Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.RightImpl <em>Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.RightImpl
	 * @see robot.impl.RobotPackageImpl#getRight()
	 * @generated
	 */
	int RIGHT = 28;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT__DISTANCE = MOVEMENT__DISTANCE;

	/**
	 * The number of structural features of the '<em>Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.DistanceSensorImpl <em>Distance Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.DistanceSensorImpl
	 * @see robot.impl.RobotPackageImpl#getDistanceSensor()
	 * @generated
	 */
	int DISTANCE_SENSOR = 30;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR__DISTANCE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Distance Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Distance Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.TimeSensorImpl <em>Time Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.TimeSensorImpl
	 * @see robot.impl.RobotPackageImpl#getTimeSensor()
	 * @generated
	 */
	int TIME_SENSOR = 31;

	/**
	 * The feature id for the '<em><b>Current Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SENSOR__CURRENT_MILLIS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SENSOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SENSOR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.StructureImpl <em>Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.StructureImpl
	 * @see robot.impl.RobotPackageImpl#getStructure()
	 * @generated
	 */
	int STRUCTURE = 32;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.ConditionImpl
	 * @see robot.impl.RobotPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 33;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION = STRUCTURE__CONDITION;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__THEN = STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ELSE = STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.LoopImpl
	 * @see robot.impl.RobotPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 34;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__CONDITION = STRUCTURE__CONDITION;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__STATEMENT = STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.BooleanExpressionImpl
	 * @see robot.impl.RobotPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 35;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.ORImpl <em>OR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.ORImpl
	 * @see robot.impl.RobotPackageImpl#getOR()
	 * @generated
	 */
	int OR = 36;

	/**
	 * The number of structural features of the '<em>OR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.ANDImpl <em>AND</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.ANDImpl
	 * @see robot.impl.RobotPackageImpl#getAND()
	 * @generated
	 */
	int AND = 37;

	/**
	 * The number of structural features of the '<em>AND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.NOTImpl <em>NOT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.NOTImpl
	 * @see robot.impl.RobotPackageImpl#getNOT()
	 * @generated
	 */
	int NOT = 38;

	/**
	 * The number of structural features of the '<em>NOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>NOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.TRUEImpl <em>TRUE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.TRUEImpl
	 * @see robot.impl.RobotPackageImpl#getTRUE()
	 * @generated
	 */
	int TRUE = 39;

	/**
	 * The number of structural features of the '<em>TRUE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TRUE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.FALSEImpl <em>FALSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.FALSEImpl
	 * @see robot.impl.RobotPackageImpl#getFALSE()
	 * @generated
	 */
	int FALSE = 40;

	/**
	 * The number of structural features of the '<em>FALSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FALSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link robot.RFunction <em>RFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RFunction</em>'.
	 * @see robot.RFunction
	 * @generated
	 */
	EClass getRFunction();

	/**
	 * Returns the meta object for the containment reference '{@link robot.RFunction#getFunctionidentifier <em>Functionidentifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Functionidentifier</em>'.
	 * @see robot.RFunction#getFunctionidentifier()
	 * @see #getRFunction()
	 * @generated
	 */
	EReference getRFunction_Functionidentifier();

	/**
	 * Returns the meta object for the containment reference list '{@link robot.RFunction#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block</em>'.
	 * @see robot.RFunction#getBlock()
	 * @see #getRFunction()
	 * @generated
	 */
	EReference getRFunction_Block();

	/**
	 * Returns the meta object for class '{@link robot.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see robot.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link robot.Block#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see robot.Block#getStatement()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Statement();

	/**
	 * Returns the meta object for class '{@link robot.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see robot.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link robot.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive</em>'.
	 * @see robot.Primitive
	 * @generated
	 */
	EClass getPrimitive();

	/**
	 * Returns the meta object for class '{@link robot.Forward <em>Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forward</em>'.
	 * @see robot.Forward
	 * @generated
	 */
	EClass getForward();

	/**
	 * Returns the meta object for class '{@link robot.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see robot.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for class '{@link robot.Cm <em>Cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cm</em>'.
	 * @see robot.Cm
	 * @generated
	 */
	EClass getCm();

	/**
	 * Returns the meta object for class '{@link robot.Mm <em>Mm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mm</em>'.
	 * @see robot.Mm
	 * @generated
	 */
	EClass getMm();

	/**
	 * Returns the meta object for class '{@link robot.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock</em>'.
	 * @see robot.Clock
	 * @generated
	 */
	EClass getClock();

	/**
	 * Returns the meta object for the attribute '{@link robot.Clock#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see robot.Clock#getAngle()
	 * @see #getClock()
	 * @generated
	 */
	EAttribute getClock_Angle();

	/**
	 * Returns the meta object for class '{@link robot.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see robot.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link robot.Program#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see robot.Program#getFunction()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Function();

	/**
	 * Returns the meta object for class '{@link robot.CallFunction <em>Call Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Function</em>'.
	 * @see robot.CallFunction
	 * @generated
	 */
	EClass getCallFunction();

	/**
	 * Returns the meta object for the reference '{@link robot.CallFunction#getFunctionidentifier <em>Functionidentifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Functionidentifier</em>'.
	 * @see robot.CallFunction#getFunctionidentifier()
	 * @see #getCallFunction()
	 * @generated
	 */
	EReference getCallFunction_Functionidentifier();

	/**
	 * Returns the meta object for the containment reference list '{@link robot.CallFunction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see robot.CallFunction#getParameters()
	 * @see #getCallFunction()
	 * @generated
	 */
	EReference getCallFunction_Parameters();

	/**
	 * Returns the meta object for class '{@link robot.FunctionIdentifier <em>Function Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Identifier</em>'.
	 * @see robot.FunctionIdentifier
	 * @generated
	 */
	EClass getFunctionIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link robot.FunctionIdentifier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robot.FunctionIdentifier#getName()
	 * @see #getFunctionIdentifier()
	 * @generated
	 */
	EAttribute getFunctionIdentifier_Name();

	/**
	 * Returns the meta object for class '{@link robot.Var <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var</em>'.
	 * @see robot.Var
	 * @generated
	 */
	EClass getVar();

	/**
	 * Returns the meta object for the containment reference '{@link robot.Var#getVaridentifier <em>Varidentifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Varidentifier</em>'.
	 * @see robot.Var#getVaridentifier()
	 * @see #getVar()
	 * @generated
	 */
	EReference getVar_Varidentifier();

	/**
	 * Returns the meta object for the containment reference '{@link robot.Var#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see robot.Var#getExpression()
	 * @see #getVar()
	 * @generated
	 */
	EReference getVar_Expression();

	/**
	 * Returns the meta object for class '{@link robot.VarIdentifier <em>Var Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Identifier</em>'.
	 * @see robot.VarIdentifier
	 * @generated
	 */
	EClass getVarIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link robot.VarIdentifier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robot.VarIdentifier#getName()
	 * @see #getVarIdentifier()
	 * @generated
	 */
	EAttribute getVarIdentifier_Name();

	/**
	 * Returns the meta object for class '{@link robot.CallVar <em>Call Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Var</em>'.
	 * @see robot.CallVar
	 * @generated
	 */
	EClass getCallVar();

	/**
	 * Returns the meta object for the reference '{@link robot.CallVar#getVaridentifier <em>Varidentifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Varidentifier</em>'.
	 * @see robot.CallVar#getVaridentifier()
	 * @see #getCallVar()
	 * @generated
	 */
	EReference getCallVar_Varidentifier();

	/**
	 * Returns the meta object for class '{@link robot.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see robot.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link robot.Const <em>Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Const</em>'.
	 * @see robot.Const
	 * @generated
	 */
	EClass getConst();

	/**
	 * Returns the meta object for the attribute '{@link robot.Const#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see robot.Const#getValue()
	 * @see #getConst()
	 * @generated
	 */
	EAttribute getConst_Value();

	/**
	 * Returns the meta object for class '{@link robot.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see robot.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link robot.BinaryExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see robot.BinaryExpression#getExpression()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Expression();

	/**
	 * Returns the meta object for class '{@link robot.Equals <em>Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equals</em>'.
	 * @see robot.Equals
	 * @generated
	 */
	EClass getEquals();

	/**
	 * Returns the meta object for class '{@link robot.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater</em>'.
	 * @see robot.Greater
	 * @generated
	 */
	EClass getGreater();

	/**
	 * Returns the meta object for class '{@link robot.Lesser <em>Lesser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lesser</em>'.
	 * @see robot.Lesser
	 * @generated
	 */
	EClass getLesser();

	/**
	 * Returns the meta object for class '{@link robot.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see robot.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for class '{@link robot.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus</em>'.
	 * @see robot.Minus
	 * @generated
	 */
	EClass getMinus();

	/**
	 * Returns the meta object for class '{@link robot.Mul <em>Mul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mul</em>'.
	 * @see robot.Mul
	 * @generated
	 */
	EClass getMul();

	/**
	 * Returns the meta object for class '{@link robot.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Div</em>'.
	 * @see robot.Div
	 * @generated
	 */
	EClass getDiv();

	/**
	 * Returns the meta object for class '{@link robot.Distance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance</em>'.
	 * @see robot.Distance
	 * @generated
	 */
	EClass getDistance();

	/**
	 * Returns the meta object for the attribute '{@link robot.Distance#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see robot.Distance#getValeur()
	 * @see #getDistance()
	 * @generated
	 */
	EAttribute getDistance_Valeur();

	/**
	 * Returns the meta object for the containment reference '{@link robot.Distance#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see robot.Distance#getUnit()
	 * @see #getDistance()
	 * @generated
	 */
	EReference getDistance_Unit();

	/**
	 * Returns the meta object for class '{@link robot.Backward <em>Backward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Backward</em>'.
	 * @see robot.Backward
	 * @generated
	 */
	EClass getBackward();

	/**
	 * Returns the meta object for class '{@link robot.Left <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left</em>'.
	 * @see robot.Left
	 * @generated
	 */
	EClass getLeft();

	/**
	 * Returns the meta object for class '{@link robot.Right <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right</em>'.
	 * @see robot.Right
	 * @generated
	 */
	EClass getRight();

	/**
	 * Returns the meta object for class '{@link robot.Movement <em>Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movement</em>'.
	 * @see robot.Movement
	 * @generated
	 */
	EClass getMovement();

	/**
	 * Returns the meta object for the containment reference '{@link robot.Movement#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distance</em>'.
	 * @see robot.Movement#getDistance()
	 * @see #getMovement()
	 * @generated
	 */
	EReference getMovement_Distance();

	/**
	 * Returns the meta object for class '{@link robot.DistanceSensor <em>Distance Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance Sensor</em>'.
	 * @see robot.DistanceSensor
	 * @generated
	 */
	EClass getDistanceSensor();

	/**
	 * Returns the meta object for the containment reference '{@link robot.DistanceSensor#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distance</em>'.
	 * @see robot.DistanceSensor#getDistance()
	 * @see #getDistanceSensor()
	 * @generated
	 */
	EReference getDistanceSensor_Distance();

	/**
	 * Returns the meta object for class '{@link robot.TimeSensor <em>Time Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Sensor</em>'.
	 * @see robot.TimeSensor
	 * @generated
	 */
	EClass getTimeSensor();

	/**
	 * Returns the meta object for the attribute '{@link robot.TimeSensor#getCurrentMillis <em>Current Millis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Millis</em>'.
	 * @see robot.TimeSensor#getCurrentMillis()
	 * @see #getTimeSensor()
	 * @generated
	 */
	EAttribute getTimeSensor_CurrentMillis();

	/**
	 * Returns the meta object for class '{@link robot.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure</em>'.
	 * @see robot.Structure
	 * @generated
	 */
	EClass getStructure();

	/**
	 * Returns the meta object for the containment reference '{@link robot.Structure#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see robot.Structure#getCondition()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_Condition();

	/**
	 * Returns the meta object for class '{@link robot.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see robot.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link robot.Condition#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see robot.Condition#getThen()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Then();

	/**
	 * Returns the meta object for the containment reference '{@link robot.Condition#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see robot.Condition#getElse()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Else();

	/**
	 * Returns the meta object for class '{@link robot.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see robot.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference '{@link robot.Loop#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see robot.Loop#getStatement()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Statement();

	/**
	 * Returns the meta object for class '{@link robot.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see robot.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for class '{@link robot.OR <em>OR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OR</em>'.
	 * @see robot.OR
	 * @generated
	 */
	EClass getOR();

	/**
	 * Returns the meta object for class '{@link robot.AND <em>AND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AND</em>'.
	 * @see robot.AND
	 * @generated
	 */
	EClass getAND();

	/**
	 * Returns the meta object for class '{@link robot.NOT <em>NOT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NOT</em>'.
	 * @see robot.NOT
	 * @generated
	 */
	EClass getNOT();

	/**
	 * Returns the meta object for class '{@link robot.TRUE <em>TRUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRUE</em>'.
	 * @see robot.TRUE
	 * @generated
	 */
	EClass getTRUE();

	/**
	 * Returns the meta object for class '{@link robot.FALSE <em>FALSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FALSE</em>'.
	 * @see robot.FALSE
	 * @generated
	 */
	EClass getFALSE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RobotFactory getRobotFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link robot.impl.RFunctionImpl <em>RFunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.RFunctionImpl
		 * @see robot.impl.RobotPackageImpl#getRFunction()
		 * @generated
		 */
		EClass RFUNCTION = eINSTANCE.getRFunction();

		/**
		 * The meta object literal for the '<em><b>Functionidentifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RFUNCTION__FUNCTIONIDENTIFIER = eINSTANCE.getRFunction_Functionidentifier();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RFUNCTION__BLOCK = eINSTANCE.getRFunction_Block();

		/**
		 * The meta object literal for the '{@link robot.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.BlockImpl
		 * @see robot.impl.RobotPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__STATEMENT = eINSTANCE.getBlock_Statement();

		/**
		 * The meta object literal for the '{@link robot.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.StatementImpl
		 * @see robot.impl.RobotPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link robot.impl.PrimitiveImpl <em>Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.PrimitiveImpl
		 * @see robot.impl.RobotPackageImpl#getPrimitive()
		 * @generated
		 */
		EClass PRIMITIVE = eINSTANCE.getPrimitive();

		/**
		 * The meta object literal for the '{@link robot.impl.ForwardImpl <em>Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.ForwardImpl
		 * @see robot.impl.RobotPackageImpl#getForward()
		 * @generated
		 */
		EClass FORWARD = eINSTANCE.getForward();

		/**
		 * The meta object literal for the '{@link robot.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.UnitImpl
		 * @see robot.impl.RobotPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '{@link robot.impl.CmImpl <em>Cm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.CmImpl
		 * @see robot.impl.RobotPackageImpl#getCm()
		 * @generated
		 */
		EClass CM = eINSTANCE.getCm();

		/**
		 * The meta object literal for the '{@link robot.impl.MmImpl <em>Mm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.MmImpl
		 * @see robot.impl.RobotPackageImpl#getMm()
		 * @generated
		 */
		EClass MM = eINSTANCE.getMm();

		/**
		 * The meta object literal for the '{@link robot.impl.ClockImpl <em>Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.ClockImpl
		 * @see robot.impl.RobotPackageImpl#getClock()
		 * @generated
		 */
		EClass CLOCK = eINSTANCE.getClock();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK__ANGLE = eINSTANCE.getClock_Angle();

		/**
		 * The meta object literal for the '{@link robot.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.ProgramImpl
		 * @see robot.impl.RobotPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__FUNCTION = eINSTANCE.getProgram_Function();

		/**
		 * The meta object literal for the '{@link robot.impl.CallFunctionImpl <em>Call Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.CallFunctionImpl
		 * @see robot.impl.RobotPackageImpl#getCallFunction()
		 * @generated
		 */
		EClass CALL_FUNCTION = eINSTANCE.getCallFunction();

		/**
		 * The meta object literal for the '<em><b>Functionidentifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_FUNCTION__FUNCTIONIDENTIFIER = eINSTANCE.getCallFunction_Functionidentifier();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_FUNCTION__PARAMETERS = eINSTANCE.getCallFunction_Parameters();

		/**
		 * The meta object literal for the '{@link robot.impl.FunctionIdentifierImpl <em>Function Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.FunctionIdentifierImpl
		 * @see robot.impl.RobotPackageImpl#getFunctionIdentifier()
		 * @generated
		 */
		EClass FUNCTION_IDENTIFIER = eINSTANCE.getFunctionIdentifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_IDENTIFIER__NAME = eINSTANCE.getFunctionIdentifier_Name();

		/**
		 * The meta object literal for the '{@link robot.impl.VarImpl <em>Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.VarImpl
		 * @see robot.impl.RobotPackageImpl#getVar()
		 * @generated
		 */
		EClass VAR = eINSTANCE.getVar();

		/**
		 * The meta object literal for the '<em><b>Varidentifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR__VARIDENTIFIER = eINSTANCE.getVar_Varidentifier();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR__EXPRESSION = eINSTANCE.getVar_Expression();

		/**
		 * The meta object literal for the '{@link robot.impl.VarIdentifierImpl <em>Var Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.VarIdentifierImpl
		 * @see robot.impl.RobotPackageImpl#getVarIdentifier()
		 * @generated
		 */
		EClass VAR_IDENTIFIER = eINSTANCE.getVarIdentifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_IDENTIFIER__NAME = eINSTANCE.getVarIdentifier_Name();

		/**
		 * The meta object literal for the '{@link robot.impl.CallVarImpl <em>Call Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.CallVarImpl
		 * @see robot.impl.RobotPackageImpl#getCallVar()
		 * @generated
		 */
		EClass CALL_VAR = eINSTANCE.getCallVar();

		/**
		 * The meta object literal for the '<em><b>Varidentifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_VAR__VARIDENTIFIER = eINSTANCE.getCallVar_Varidentifier();

		/**
		 * The meta object literal for the '{@link robot.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.ExpressionImpl
		 * @see robot.impl.RobotPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link robot.impl.ConstImpl <em>Const</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.ConstImpl
		 * @see robot.impl.RobotPackageImpl#getConst()
		 * @generated
		 */
		EClass CONST = eINSTANCE.getConst();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONST__VALUE = eINSTANCE.getConst_Value();

		/**
		 * The meta object literal for the '{@link robot.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.BinaryExpressionImpl
		 * @see robot.impl.RobotPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__EXPRESSION = eINSTANCE.getBinaryExpression_Expression();

		/**
		 * The meta object literal for the '{@link robot.impl.EqualsImpl <em>Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.EqualsImpl
		 * @see robot.impl.RobotPackageImpl#getEquals()
		 * @generated
		 */
		EClass EQUALS = eINSTANCE.getEquals();

		/**
		 * The meta object literal for the '{@link robot.impl.GreaterImpl <em>Greater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.GreaterImpl
		 * @see robot.impl.RobotPackageImpl#getGreater()
		 * @generated
		 */
		EClass GREATER = eINSTANCE.getGreater();

		/**
		 * The meta object literal for the '{@link robot.impl.LesserImpl <em>Lesser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.LesserImpl
		 * @see robot.impl.RobotPackageImpl#getLesser()
		 * @generated
		 */
		EClass LESSER = eINSTANCE.getLesser();

		/**
		 * The meta object literal for the '{@link robot.impl.AddImpl <em>Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.AddImpl
		 * @see robot.impl.RobotPackageImpl#getAdd()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getAdd();

		/**
		 * The meta object literal for the '{@link robot.impl.MinusImpl <em>Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.MinusImpl
		 * @see robot.impl.RobotPackageImpl#getMinus()
		 * @generated
		 */
		EClass MINUS = eINSTANCE.getMinus();

		/**
		 * The meta object literal for the '{@link robot.impl.MulImpl <em>Mul</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.MulImpl
		 * @see robot.impl.RobotPackageImpl#getMul()
		 * @generated
		 */
		EClass MUL = eINSTANCE.getMul();

		/**
		 * The meta object literal for the '{@link robot.impl.DivImpl <em>Div</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.DivImpl
		 * @see robot.impl.RobotPackageImpl#getDiv()
		 * @generated
		 */
		EClass DIV = eINSTANCE.getDiv();

		/**
		 * The meta object literal for the '{@link robot.impl.DistanceImpl <em>Distance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.DistanceImpl
		 * @see robot.impl.RobotPackageImpl#getDistance()
		 * @generated
		 */
		EClass DISTANCE = eINSTANCE.getDistance();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE__VALEUR = eINSTANCE.getDistance_Valeur();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTANCE__UNIT = eINSTANCE.getDistance_Unit();

		/**
		 * The meta object literal for the '{@link robot.impl.BackwardImpl <em>Backward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.BackwardImpl
		 * @see robot.impl.RobotPackageImpl#getBackward()
		 * @generated
		 */
		EClass BACKWARD = eINSTANCE.getBackward();

		/**
		 * The meta object literal for the '{@link robot.impl.LeftImpl <em>Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.LeftImpl
		 * @see robot.impl.RobotPackageImpl#getLeft()
		 * @generated
		 */
		EClass LEFT = eINSTANCE.getLeft();

		/**
		 * The meta object literal for the '{@link robot.impl.RightImpl <em>Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.RightImpl
		 * @see robot.impl.RobotPackageImpl#getRight()
		 * @generated
		 */
		EClass RIGHT = eINSTANCE.getRight();

		/**
		 * The meta object literal for the '{@link robot.impl.MovementImpl <em>Movement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.MovementImpl
		 * @see robot.impl.RobotPackageImpl#getMovement()
		 * @generated
		 */
		EClass MOVEMENT = eINSTANCE.getMovement();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVEMENT__DISTANCE = eINSTANCE.getMovement_Distance();

		/**
		 * The meta object literal for the '{@link robot.impl.DistanceSensorImpl <em>Distance Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.DistanceSensorImpl
		 * @see robot.impl.RobotPackageImpl#getDistanceSensor()
		 * @generated
		 */
		EClass DISTANCE_SENSOR = eINSTANCE.getDistanceSensor();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTANCE_SENSOR__DISTANCE = eINSTANCE.getDistanceSensor_Distance();

		/**
		 * The meta object literal for the '{@link robot.impl.TimeSensorImpl <em>Time Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.TimeSensorImpl
		 * @see robot.impl.RobotPackageImpl#getTimeSensor()
		 * @generated
		 */
		EClass TIME_SENSOR = eINSTANCE.getTimeSensor();

		/**
		 * The meta object literal for the '<em><b>Current Millis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SENSOR__CURRENT_MILLIS = eINSTANCE.getTimeSensor_CurrentMillis();

		/**
		 * The meta object literal for the '{@link robot.impl.StructureImpl <em>Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.StructureImpl
		 * @see robot.impl.RobotPackageImpl#getStructure()
		 * @generated
		 */
		EClass STRUCTURE = eINSTANCE.getStructure();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE__CONDITION = eINSTANCE.getStructure_Condition();

		/**
		 * The meta object literal for the '{@link robot.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.ConditionImpl
		 * @see robot.impl.RobotPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__THEN = eINSTANCE.getCondition_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__ELSE = eINSTANCE.getCondition_Else();

		/**
		 * The meta object literal for the '{@link robot.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.LoopImpl
		 * @see robot.impl.RobotPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__STATEMENT = eINSTANCE.getLoop_Statement();

		/**
		 * The meta object literal for the '{@link robot.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.BooleanExpressionImpl
		 * @see robot.impl.RobotPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '{@link robot.impl.ORImpl <em>OR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.ORImpl
		 * @see robot.impl.RobotPackageImpl#getOR()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOR();

		/**
		 * The meta object literal for the '{@link robot.impl.ANDImpl <em>AND</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.ANDImpl
		 * @see robot.impl.RobotPackageImpl#getAND()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAND();

		/**
		 * The meta object literal for the '{@link robot.impl.NOTImpl <em>NOT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.NOTImpl
		 * @see robot.impl.RobotPackageImpl#getNOT()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNOT();

		/**
		 * The meta object literal for the '{@link robot.impl.TRUEImpl <em>TRUE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.TRUEImpl
		 * @see robot.impl.RobotPackageImpl#getTRUE()
		 * @generated
		 */
		EClass TRUE = eINSTANCE.getTRUE();

		/**
		 * The meta object literal for the '{@link robot.impl.FALSEImpl <em>FALSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.FALSEImpl
		 * @see robot.impl.RobotPackageImpl#getFALSE()
		 * @generated
		 */
		EClass FALSE = eINSTANCE.getFALSE();

	}

} //RobotPackage
