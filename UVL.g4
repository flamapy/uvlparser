grammar UVL;

tokens {
	INDENT,
	DEDENT
}

@lexer::header {
from antlr_denter.DenterHelper import DenterHelper
from UVLParser import UVLParser
}
@lexer::members {
class UVLDenter(DenterHelper):
    def __init__(self, lexer, nl_token, indent_token, dedent_token, ignore_eof):
        super().__init__(nl_token, indent_token, dedent_token, ignore_eof)
        self.lexer: UVLLexer = lexer

    def pull_token(self):
        return super(UVLLexer, self.lexer).nextToken()

denter = None

def nextToken(self):
    if not self.denter:
        self.denter = self.UVLDenter(self, self.NL, UVLParser.INDENT, UVLParser.DEDENT, True)
    return self.denter.next_token()

}

// parser rules

// AST root, it will eventually contain more subtrees
feature_model: imports? features? constraints?;

// root of the features subtree
features: 'features' INDENT child;

// every child will consist on a feature spec, followed by an indent and a set of relationships.
child: feature_spec INDENT relationship+ DEDENT;

//a feature spec consists on a ref (feature name) and optional attributes. Each attribute has a key and an optional value.
feature_spec: ref attributes?;
ref: (WORD '.')* WORD;
attributes: '{}' | '{' attribute (',' attribute)* '}';
attribute: key ('"' value '"')?;
key: WORD;
value: VALUE;

// every relationship will consist on a keyword, followed by an indent and a set of children
relationship: KEYWORD INDENT child+ DEDENT;

// constraints block
constraints: 'constraints' INDENT constraint*;

constraint:
	negation
	| conjunction
	| disjuction
	| implication
	| equivalence;

negation: '!' WORD;
conjunction: WORD '&' WORD;
disjuction: WORD '|' WORD;
implication: WORD '=>' WORD;
equivalence: WORD '<=>' WORD;

// imports blocK

imports: 'imports' INDENT imp*;

imp: WORD 'as' WORD;

//lexer rules

fragment INT: '0' | ([1-9][0-9]*);

KEYWORD:
	(
		'alternative'
		| 'or'
		| 'optional'
		| 'mandatory'
		| ('[' (INT '..')? (INT | '*') ']')
	);

WORD: [a-zA-Z][0-9a-zA-Z_]*;

BOOLEAN: 'true' | 'false';
NUMBER: '0' | ([1-9][0-9]* ('.' [0-9]+)?);
VECTOR: '[' (VALUE (',')?)* ']';

VALUE: BOOLEAN | NUMBER | WORD | VECTOR;
WS: [ \n\r\t]+ -> skip;
NL: ('\r'? '\n' '\t') | (('\r'? '\n' ' '*));
