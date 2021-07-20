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


    # Visit a parse tree produced by UVLParser#relation.
    def visitRelation(self, ctx:UVLParser.RelationContext):
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


    # Visit a parse tree produced by UVLParser#relation_spec.
    def visitRelation_spec(self, ctx:UVLParser.Relation_specContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UVLParser#constraints.
    def visitConstraints(self, ctx:UVLParser.ConstraintsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UVLParser#constraint.
    def visitConstraint(self, ctx:UVLParser.ConstraintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UVLParser#negation.
    def visitNegation(self, ctx:UVLParser.NegationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UVLParser#conjunction.
    def visitConjunction(self, ctx:UVLParser.ConjunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UVLParser#disjuction.
    def visitDisjuction(self, ctx:UVLParser.DisjuctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UVLParser#implication.
    def visitImplication(self, ctx:UVLParser.ImplicationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UVLParser#equivalence.
    def visitEquivalence(self, ctx:UVLParser.EquivalenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UVLParser#imports.
    def visitImports(self, ctx:UVLParser.ImportsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by UVLParser#imp.
    def visitImp(self, ctx:UVLParser.ImpContext):
        return self.visitChildren(ctx)



del UVLParser