from antlr4 import CommonTokenStream, FileStream
from uvlparser.UVLLexer import UVLLexer
from uvlparser.UVLParser import UVLParser
from antlr4.error.ErrorListener import ErrorListener
from flamapy.core.exceptions import ParsingException
class CustomErrorListener(ErrorListener):
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        # If the error message contains a specific keyword related to tabulation, ignore it
        if "\\t" in msg:
            return
        else:
            # Otherwise, print the error (or handle it in another way)
            print(f"Line {line}:{column} - {msg}")
            raise ParsingException("The UVL has sintactic problems that prevents reading it")
            

def get_tree(argv):
    input_stream = FileStream(argv)
    lexer = UVLLexer(input_stream)
    
    # Attach the custom error listener to the lexer
    lexer.removeErrorListeners()
    lexer.addErrorListener(CustomErrorListener())

    stream = CommonTokenStream(lexer)
    parser = UVLParser(stream)
    
    # Attach the custom error listener to the parser
    parser.removeErrorListeners()
    parser.addErrorListener(CustomErrorListener())

    tree = parser.feature_model()

    return tree


if __name__ == "__main__":
    import sys

    # Check if the user provided a file argument
    if len(sys.argv) < 2:
        print("Usage: python script_name.py <path_to_uvl_file>")
        sys.exit(1)

    # Parse the provided file
    input_stream = FileStream(sys.argv[1])
    lexer = UVLLexer(input_stream)
    
    # Attach the custom error listener to the lexer
    lexer.removeErrorListeners()
    lexer.addErrorListener(CustomErrorListener())

    stream = CommonTokenStream(lexer)
    parser = UVLParser(stream)
    
    # Attach the custom error listener to the parser
    parser.removeErrorListeners()
    parser.addErrorListener(CustomErrorListener())

    tree = parser.feature_model()
    # Print the parse tree (optional)
    print(tree.toStringTree(recog=parser))