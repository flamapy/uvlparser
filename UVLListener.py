# Generated from UVL.g4 by ANTLR 4.9
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .UVLParser import UVLParser
else:
    from UVLParser import UVLParser

# This class defines a complete listener for a parse tree produced by UVLParser.
class UVLListener(ParseTreeListener):

    # Enter a parse tree produced by UVLParser#feature_model.
    def enterFeature_model(self, ctx:UVLParser.Feature_modelContext):
        pass

    # Exit a parse tree produced by UVLParser#feature_model.
    def exitFeature_model(self, ctx:UVLParser.Feature_modelContext):
        pass


    # Enter a parse tree produced by UVLParser#features.
    def enterFeatures(self, ctx:UVLParser.FeaturesContext):
        pass

    # Exit a parse tree produced by UVLParser#features.
    def exitFeatures(self, ctx:UVLParser.FeaturesContext):
        pass


    # Enter a parse tree produced by UVLParser#child.
    def enterChild(self, ctx:UVLParser.ChildContext):
        pass

    # Exit a parse tree produced by UVLParser#child.
    def exitChild(self, ctx:UVLParser.ChildContext):
        pass


    # Enter a parse tree produced by UVLParser#relationship.
    def enterRelationship(self, ctx:UVLParser.RelationshipContext):
        pass

    # Exit a parse tree produced by UVLParser#relationship.
    def exitRelationship(self, ctx:UVLParser.RelationshipContext):
        pass



del UVLParser