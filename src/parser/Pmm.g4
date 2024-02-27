grammar Pmm;	

program: definition* main EOF
       ;

main: 'def' 'main' '('(paramDefinition(','paramDefinition)*)? ')'':''{'varDefinition* statement*'}';

expression: INT_CONSTANT
            |REAL_CONSTANT
            |IDENT
            |CHAR_CONSTANT
            |'(' expression ')'
            | '[' expression ']'
            | expression'[' expression ']'
            | expression '.' IDENT
            |IDENT '('(expression(','expression)*)?')'
            | '-' expression
            | expression ('*'|'/'|'%') expression
            | expression ('+'|'-') expression
            | '!' expression
            | '(' type ')' expression
            | expression ('>' | '>=' | '<' | '<='| '!=' | '==') expression
            | expression ('&&' | '||') expression;




statement: 'print' (expression (','expression)*)';'
            | 'input' (expression  (','expression)*)';'
            | expression '=' expression';'
            | 'if' expression':'('{'statement statement*'}'| statement)('else'':'('{'statement statement*'}'|statement))?
            | 'while'expression':'('{'statement statement*'}'|statement)
            | 'return' expression';'
            | IDENT '('(expression(','expression)*)?')'';';



type: 'int'
        |'double'
        |'char'
        |'void'
        | '['INT_CONSTANT']'type
        | 'struct''{'(paramDefinition';')+'}';

funcDefinition:'def' IDENT '('(paramDefinition(','paramDefinition)*)?')'':'type?'{'varDefinition* statement*'}';

varDefinition: ((IDENT ':' type) | (IDENT (',' IDENT)* ':'type))';';

paramDefinition: IDENT ':' type;

definition: varDefinition | funcDefinition;









/* LEXER PATTERNS */

TRASH: [ \n\r\t]-> skip;


REAL_CONSTANT: (INT_CONSTANT'.'INT_CONSTANT? | INT_CONSTANT?'.'INT_CONSTANT)([Ee]('+' | '-')?INT_CONSTANT)?
 | INT_CONSTANT([Ee]('+' | '-')?INT_CONSTANT);

INT_CONSTANT: '0'|[1-9][0-9]*;

CHAR_CONSTANT: '\''('\\'INT_CONSTANT | . | '\\n' | '\\t')'\'';

IDENT: ([a-zA-Z]|'_')[a-zA-Z0-9_]*;

COMMENT1: ('#'.*?('\n' | EOF))->skip;

COMMENT2: ('"''"''"' .*? '"''"''"')->skip;
