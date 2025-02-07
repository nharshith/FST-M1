import pytest

def test_list_sum(list_fixture):
    sum = 0
    for i in list_fixture:
        sum = sum + i
    assert sum == 55

