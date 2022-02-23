.ONESHELL:

.PHONY: build
build:
	antlr4 -Dlanguage=Python3 UVL.g4
	sed -i "s/from UVLParser/from .UVLParser/g" UVLLexer.py
upload-testpypi:
	python3 -m twine upload --repository testpypi dist/*

upload-pypi:
	python3 -m twine upload --repository pypi dist/*