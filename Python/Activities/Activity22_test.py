import pytest
import math

def test_add():
    assert 5 + 3 == 8

def test_substract():
    assert 5 - 3 == 2

@pytest.mark.activity
def test_multiply():
    assert 2 * 3 == 6

@pytest.mark.activity
def test_divide():
    assert 6 / 3 == 2