grammar convork;
@lexer::members {void erroLexico(String msg) { throw new ParseCancellationException(msg); }}

fragment ALGARISMO : '0'..'9';
fragment LETRA: [a-zA-Z];


// Ignorar espacos em branco
WS:   (' ') -> skip;

// Ignorar fim de linha
ENDL:  ('\n' | '\t' | '\r') -> skip;

program: header? content footer? EOF;
// Ignorar espacos em branco


Identifier: (LETRA|'_') ('_'|ALGARISMO|LETRA)*;

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
text_element: 'text('parameters'){'CADEIA'};';
card_element: 'card('parameters'){'element*'};';
container_element: 'container('parameters'){'element*'};';
image_element: 'image('parameters'){'element*'};';

COMENTARIO: '/*' ~('}'|'\n'|'\r')* '*/' -> skip;

CADEIA : '"' ~('\n' | '\r' | '"')* '"';


COMENTARIO_NAO_FECHADO
:   '/*' .*?
    {erroLexico("Linha " + (getLine()+1) + ": comentario nao fechado");}
;

ERRO_LEXICO
:	.
	{erroLexico("Linha " + getLine() + ": " + getText() + " - simbolo nao identificado");}
;
