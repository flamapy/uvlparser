# Generated from UVL.g4 by ANTLR 4.9
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .UVLParser import UVLParser
else:
    from UVLParser import UVLParser

# This class defines a complete generic visitor for a parse tree produced by UVLParser.

class UVLVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by UVLParser#feature_model.
    def visitFeature_model(self, ctx:UVLParser.Feature_modelContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UVLParser#features.
    def visitFeatures(self, ctx:UVLParser.FeaturesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UVLParser#child.
    def visitChild(self, ctx:UVLParser.ChildContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UVLParser#feature_spec.
    def visitFeature_spec(self, ctx:UVLParser.Feature_specContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UVLParser#ref.
    def visitRef(self, ctx:UVLParser.RefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UVLParser#attributes.
    def visitAttributes(self, ctx:UVLParser.AttributesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UVLParser#attribute.
    def visitAttribute(self, ctx:UVLParser.AttributeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UVLParser#key.
    def visitKey(self, ctx:UVLParser.KeyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UVLParser#value.
    def visitValue(self, ctx:UVLParser.ValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UVLParser#relationship.
    def visitRelationship(self, ctx:UVLParser.RelationshipContext):
        return self.visitChildren(ctx)



del UVLParser