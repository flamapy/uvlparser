.ONESHELL:

.PHONY: build
build:
	antlr4 -Dlanguage=Python3 uvlparser/UVL.g4

upload-testpypi:
	python3 -m build
	python3 -m twine upload --repository testpypi dist/*

upload-pypi:
	python3 -m build
	python3 -m twine upload --repository pypi dist/*
