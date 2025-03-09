grammar Robot
import 'Terminals'
import 'robot-types'

entry Program returns Program:
    {Program} 'Program' '{' ('function' '{' function+=RFunction  ("," function+=RFunction  )* '}' )? '}'  
;

Statement returns Statement:
    Block | Forward | Clock | CallFunction | Var | CallVar | Const | Equals | Greater | Lesser | Add | Minus | Mul | Div | Distance | Backward | Left | Right | DistanceSensor | TimeSensor | Condition | Loop | OR | AND | NOT | TRUE | FALSE 
;

Expression returns Expression:
    CallFunction | CallVar | Const | Equals | Greater | Lesser | Add | Minus | Mul | Div | Distance | DistanceSensor | TimeSensor | OR | AND | NOT | TRUE | FALSE 
;

Unit returns Unit:
    Cm | Mm 
;

BooleanExpression returns BooleanExpression:
    OR | AND | NOT | TRUE | FALSE 
;

RFunction returns RFunction:
    'RFunction' '{' 'functionidentifier' functionidentifier=FunctionIdentifier  ('block' '{' block+=Block  ("," block+=Block  )* '}' )? '}'  
;

FunctionIdentifier returns FunctionIdentifier:
    {FunctionIdentifier} 'FunctionIdentifier' name=EString   
;

Block returns Block:
    {Block} 'Block' '{' ('statement' '{' statement+=Statement  ("," statement+=Statement  )* '}' )? '}'  
;

EString returns string:
    STRING | ID 
;

Forward returns Forward:
    'Forward' '{' 'distance' distance=Distance  '}'  
;

Clock returns Clock:
    {Clock} 'Clock' '{' ('angle' angle=EInt  )? '}'  
;

CallFunction returns CallFunction:
    'CallFunction' '{' 'functionidentifier' functionidentifier=[FunctionIdentifier:EString ] ('parameters' '{' parameters+=Expression  ("," parameters+=Expression  )* '}' )? '}'  
;

Var returns Var:
    'Var' '{' 'varidentifier' varidentifier=VarIdentifier  'expression' expression=Expression  '}'  
;

CallVar returns CallVar:
    'CallVar' '{' 'varidentifier' varidentifier=[VarIdentifier:EString ] '}'  
;

Const returns Const:
    {Const} 'Const' '{' ('value' value=EInt  )? '}'  
;

Equals returns Equals:
    'Equals' '{' 'expression' '{' expression+=Expression  ("," expression+=Expression  )* '}' '}'  
;

Greater returns Greater:
    'Greater' '{' 'expression' '{' expression+=Expression  ("," expression+=Expression  )* '}' '}'  
;

Lesser returns Lesser:
    'Lesser' '{' 'expression' '{' expression+=Expression  ("," expression+=Expression  )* '}' '}'  
;

Add returns Add:
    'Add' '{' 'expression' '{' expression+=Expression  ("," expression+=Expression  )* '}' '}'  
;

Minus returns Minus:
    'Minus' '{' 'expression' '{' expression+=Expression  ("," expression+=Expression  )* '}' '}'  
;

Mul returns Mul:
    'Mul' '{' 'expression' '{' expression+=Expression  ("," expression+=Expression  )* '}' '}'  
;

Div returns Div:
    'Div' '{' 'expression' '{' expression+=Expression  ("," expression+=Expression  )* '}' '}'  
;

Distance returns Distance:
    'Distance' '{' ('valeur' valeur=EInt  )? 'unit' unit=Unit  '}'  
;

Backward returns Backward:
    'Backward' '{' 'distance' distance=Distance  '}'  
;

Left returns Left:
    'Left' '{' 'distance' distance=Distance  '}'  
;

Right returns Right:
    'Right' '{' 'distance' distance=Distance  '}'  
;

DistanceSensor returns DistanceSensor:
    'DistanceSensor' '{' 'distance' distance=Distance  '}'  
;

TimeSensor returns TimeSensor:
    {TimeSensor} 'TimeSensor' '{' ('CurrentMillis' CurrentMillis=EInt  )? '}'  
;

Condition returns Condition:
    'Condition' '{' 'Condition' Condition=BooleanExpression  'then' then=Statement  ('else' else=Statement  )? '}'  
;

Loop returns Loop:
    'Loop' '{' 'Condition' Condition=BooleanExpression  'statement' statement=Statement  '}'  
;

OR returns OR:
    {OR} 'OR'  
;

AND returns AND:
    {AND} 'AND'  
;

NOT returns NOT:
    {NOT} 'NOT'  
;

TRUE returns TRUE:
    {TRUE} 'TRUE'  
;

FALSE returns FALSE:
    {FALSE} 'FALSE'  
;

EInt returns number:
    '-'? INT  
;

VarIdentifier returns VarIdentifier:
    {VarIdentifier} 'VarIdentifier' name=EString   
;

Cm returns Cm:
    {Cm} 'Cm'  
;

Mm returns Mm:
    {Mm} 'Mm'  
;

