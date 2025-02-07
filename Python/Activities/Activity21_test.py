import pytest
import math

@pytest.mark.calculator
def test_add():
    assert 5 + 3 == 8

@pytest.mark.calculator
def test_substract():
    assert 5 - 3 == 2

@pytest.mark.calculator
def test_multiply():
    assert 2 * 3 == 6

@pytest.mark.calculator
def test_divide():
    assert 6 / 3 == 2