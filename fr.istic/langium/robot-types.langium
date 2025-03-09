
interface Program {
	function: RFunction[]
}

interface RFunction {
	functionidentifier: FunctionIdentifier
	block: Block[]
}

interface FunctionIdentifier {
	name?: string
}

interface Block extends Statement {
	statement: Statement[]
}

interface Statement {
}

interface Expression extends Statement {
}

interface Unit {
}

interface BooleanExpression extends Expression {
}

interface Forward extends Movement {
}

interface Movement extends Primitive {
	distance: Distance
}

interface Primitive extends Statement {
}

interface Distance extends Expression {
	valeur?: number
	unit: Unit
}

interface Clock extends Primitive {
	angle?: number
}

interface CallFunction extends Expression {
	functionidentifier: @FunctionIdentifier
	parameters: Expression[]
}

interface Var extends Statement {
	varidentifier: VarIdentifier
	expression: Expression
}

interface VarIdentifier {
	name?: string
}

interface CallVar extends Expression {
	varidentifier: @VarIdentifier
}

interface Const extends Expression {
	value?: number
}

interface Equals extends BinaryExpression {
}

interface BinaryExpression extends Expression {
	expression: Expression[]
}

interface Greater extends BinaryExpression {
}

interface Lesser extends BinaryExpression {
}

interface Add extends BinaryExpression {
}

interface Minus extends BinaryExpression {
}

interface Mul extends BinaryExpression {
}

interface Div extends BinaryExpression {
}

interface Backward extends Movement {
}

interface Left extends Movement {
}

interface Right extends Movement {
}

interface DistanceSensor extends Expression {
	distance: Distance
}

interface TimeSensor extends Expression {
	CurrentMillis?: number
}

interface Condition extends Structure {
	then: Statement
	else?: Statement
}

interface Structure extends Statement {
	Condition: BooleanExpression
}

interface Loop extends Structure {
	statement: Statement
}

interface OR extends BooleanExpression {
}

interface AND extends BooleanExpression {
}

interface NOT extends BooleanExpression {
}

interface TRUE extends BooleanExpression {
}

interface FALSE extends BooleanExpression {
}

interface Cm extends Unit {
}

interface Mm extends Unit {
}

