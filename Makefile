.ONESHELL:

.PHONY: build
build:
	antlr4 -Dlanguage=Python3 uvlparser/UVL.g4
