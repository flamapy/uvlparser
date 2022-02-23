.ONESHELL:

.PHONY: build
build:
	cd uvlparser
	antlr4 -Dlanguage=Python3 UVL.g4
	sed -i "s/from UVLParser/from .UVLParser/g" UVLLexer.py
	
upload-testpypi:
	cd uvlparser
	python3 -m build
	python3 -m twine upload --repository testpypi dist/*

upload-pypi:
	cd uvlparser
	python3 -m build
	python3 -m twine upload --repository pypi dist/*
