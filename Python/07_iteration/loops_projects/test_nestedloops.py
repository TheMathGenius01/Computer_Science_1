import unittest
from nestedloops_project import *

class Test(unittest.TestCase):

    ##########################################################
    # rectangle
    def test_rectangle(self):
        exp = '*****\n*****\n*****\n*****\n*****\n*****\n*****\n*****\n*****\n*****\n'
        self.assertEqual(rectangle(5, 10),exp)

    ##########################################################
    # grid_of_numbers
    def test_grid_of_numbers(self):
        exp = '0 0 0 0 0 0 0\n1 1 1 1 1 1 1\n2 2 2 2 2 2 2\n3 3 3 3 3 3 3\n4 4 4 4 4 4 4\n5 5 5 5 5 5 5\n6 6 6 6 6 6 6\n'
        self.assertEqual(grid_of_numbers(7),exp)
    

    ##########################################################
    # staircase
    def test_staircase(self):
        exp = '0\n0 1\n0 1 2\n0 1 2 3\n0 1 2 3 4\n'
        self.assertEqual(staircase(5),exp)


    ##########################################################
    # staircase_reflected
    def test_staircase_reflected(self):
        exp = '0 1 2 3 4\n  0 1 2 3\n    0 1 2\n      0 1\n        0\n'
        self.assertEqual(staircase_reflected(5),exp)


    ##########################################################
    # multiplication_table
    def test_multiplication_table(self):
        exp = '   1   2   3   4   5   6   7\n   2   4   6   8  10  12  14\n   3   6   9  12  15  18  21\n   4   8  12  16  20  24  28\n   5  10  15  20  25  30  35\n   6  12  18  24  30  36  42\n   7  14  21  28  35  42  49\n'
        self.assertEqual(multiplication_table(7),exp)


    ##########################################################
    # pyramid
    def test_pyramid(self):
        exp = '            1\n          1 2 1\n        1 2 3 2 1\n      1 2 3 4 3 2 1\n    1 2 3 4 5 4 3 2 1\n  1 2 3 4 5 6 5 4 3 2 1\n1 2 3 4 5 6 7 6 5 4 3 2 1\n'
        self.assertEqual(pyramid(7),exp)

    ##########################################################
    # diamond
    def test_diamond(self):
        exp = '      1\n    1 2 1\n  1 2 3 2 1\n1 2 3 4 3 2 1\n  1 2 3 2 1\n    1 2 1\n      1\n'
        self.assertEqual(diamond(5),exp)


    ##########################################################
    # box
    def test_box(self):
        exp = 'XXXXXXXX\nX      X\nX      X\nXXXXXXXX'
        self.assertEqual(box(4),exp)

    ##########################################################
    # x_marks_the_spot
    def test_x_marks_the_spot(self):
        exp = 'X___X\n_X_X_\n__X__\n_X_X_\nX___X\n'
        self.assertEqual(x_marks_the_spot(5),exp)

    ##########################################################
    # reverse_diamond
    def test_reverse_diamond(self):
        exp = '1 3 5 7 7 5 3 1\n3 5 7     7 5 3\n5 7         7 5\n7             7\n7             7\n5 7         7 5\n3 5 7     7 5 3\n1 3 5 7 7 5 3 1'
        self.assertEqual(reverse_diamond(4),exp)

    ##########################################################
            
if __name__ == '__main__':
    unittest.main()
