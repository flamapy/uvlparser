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
feature_model: features?;

// root of the features subtree
features: 'features' child;

// every child will consist on a feature word, followed by an indent and a set of relationships.
child: feature_spec INDENT relationship+ DEDENT;

feature_spec: ref attributes?;
ref: (WORD '.')* WORD;
attributes: '{}' | '{' attribute (',' attribute)* '}';
attribute: key value?;
key: WORD;
value: '"' WORD '"';

// every relationship will consist on a keyword, followed by an indent and a set of children
relationship: KEYWORD INDENT child+ DEDENT;

//lexer rules

KEYWORD:
	(
		'alternative'
		| 'or'
		| 'constraints'
		| 'true'
		| 'false'
		| 'as'
		| 'refer'
		| 'mandatory'
	);

WORD: [a-zA-Z][0-9a-zA-Z_]*;

WS: [ \n\r\t]+ -> skip;
NL: ('\r'? '\n' '\t');
