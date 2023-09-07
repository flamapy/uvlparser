.ONESHELL:

.PHONY: build
build:
	antlr -Dlanguage=Python3 uvlparser/UVL.g4
test:
	python3 ./uvlparser/main.py ./tests/pizzas.uvl
