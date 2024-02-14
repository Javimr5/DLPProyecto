grammar Pmm;	

program: 
       ;

/* LEXER PATTERNS */

TRASH: [ \n\r\t]-> skip;


REAL_CONSTANT: ([0-9]*'.'[1-9]+ | [0-9]+'.'[0-9]*)([Ee]'-'?INT_CONSTANT)? | INT_CONSTANT([Ee]'-'?INT_CONSTANT);

INT_CONSTANT: '0'|[1-9][0-9]*;

IDENT: ([a-zA-Z]|'_')[a-zA-Z0-9]*;

COMMENT: ('#'.*?'\n'  | '\'''\'''\'' .*? '\'''\'''\'' )->skip;
