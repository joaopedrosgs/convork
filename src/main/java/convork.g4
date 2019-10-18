grammar convork;
@lexer::members {void erroLexico(String msg) { throw new ParseCancellationException(msg); }}

fragment ALGARISMO : '0'..'9';
fragment LETRA: [a-zA-Z];




program: js? source? EOF;
// Ignorar espacos em branco

js: 'js{' statements* '};';

statements: functionDec | variables;

functionDec : 'function'? Identifier '(' formalParameterList? ')' '{' functionBody '};';

formalParameterList: Identifier (',' Identifier)*;
Identifier: (LETRA|'_') ('_'|ALGARISMO|LETRA)*;
functionBody : (~'}')*;
variableValue: ~('\n'|';')*;
variables: 'var' Identifier '=' variableValue ';';

source: header? content footer?;

parameters:parameter*;
parameter: Identifier '=' CADEIA;

header: 'header('parameters'){' element* '};';
content: 'content('parameters'){' element* '};';
footer: 'footer'(parameters)'{' element* '};';

element: logo_element|button_element|search_element|carousel_element|text_element|card_element|container_element|image_element;

logo_element: 'logo('parameters'){'element*'};';
button_element: 'button('parameters'){'element*'};';
search_element: 'search('parameters'){'element*'};';
carousel_element: 'carousel('parameters'){'element*'};';
text_element: 'text('parameters'){'element*'};';
card_element: 'card('parameters'){'element*'};';
container_element: 'container('parameters'){'element*'};';
image_element: 'image('parameters'){'element*'};';

COMENTARIO: '/*' ~('}'|'\n'|'\r')* '*/' -> skip;

CADEIA : '"' ~('\n' | '\r' | '"')* '"';

// Ignorar espacos em branco
WS:   (' ') -> skip;

// Ignorar fim de linha
ENDL:  ('\n' | '\t' | '\r') -> skip;
COMENTARIO_NAO_FECHADO
:   '/*' .*?
    {erroLexico("Linha " + (getLine()+1) + ": comentario nao fechado");}
;

ERRO_LEXICO
:	.
	{erroLexico("Linha " + getLine() + ": " + getText() + " - simbolo nao identificado");}
;
