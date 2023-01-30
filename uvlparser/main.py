from antlr4 import CommonTokenStream, FileStream
from uvlparser.UVLLexer import UVLLexer
from uvlparser.UVLParser import UVLParser


def get_tree(argv):
    input_stream = FileStream(argv)
    lexer = UVLLexer(input_stream)
    lexer.removeErrorListeners()
    stream = CommonTokenStream(lexer)
    parser = UVLParser(stream)
    parser.removeErrorListeners()
    tree = parser.feature_model()

    return tree
