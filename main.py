import sys
from antlr4 import *
from UVLLexer import UVLLexer
from UVLParser import UVLParser
from UVLListener import UVLListener


def main(argv):
    input_stream = FileStream(argv[1])
    lexer = UVLLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = UVLParser(stream)
    tree = parser.feature_model()
    print(tree.toStringTree(recog=parser))
    printer = UVLListener()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)


if __name__ == '__main__':
    main(sys.argv)
