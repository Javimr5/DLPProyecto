grammar Pmm;	

program: 
       ;

/* LEXER PATTERNS */

TRASH: [ \n\r\t]-> skip;


REAL_CONSTANT: (INT_CONSTANT'.'INT_CONSTANT? | INT_CONSTANT?'.'INT_CONSTANT)([Ee]('+' | '-')?INT_CONSTANT)?
 | INT_CONSTANT([Ee]('+' | '-')?INT_CONSTANT);

INT_CONSTANT: '0'|[1-9][0-9]*;

CHAR_CONSTANT: '\''('\\'INT_CONSTANT | . | '\\n' | '\\t')'\'';

IDENT: ([a-zA-Z]|'_')[a-zA-Z0-9_]*;

COMMENT1: ('#'.*?('\n' | EOF))->skip;

COMMENT2: ('"''"''"' .*? '"''"''"')->skip;
