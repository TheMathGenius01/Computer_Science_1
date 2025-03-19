from basic_functions import *
import unittest


class TestBasicFunctions(unittest.TestCase):
    """ Test class"""

    def test_is_freezing(self):
        actual = is_freezing(0)
        exp = True
        self.assertEqual(exp, actual)
        
        actual = is_freezing(-55)
        exp = True
        self.assertEqual(exp, actual)
        
        actual = is_freezing(32)
        exp = False
        self.assertEqual(exp, actual)


    def test_is_small(self):
        actual = is_small(0)
        exp = True
        self.assertEqual(exp, actual)
        
        actual = is_small(.99)
        exp = True
        self.assertEqual(exp, actual)

        actual = is_small(-.99)
        exp = True
        self.assertEqual(exp, actual)

        actual = is_small(100)
        exp = False
        self.assertEqual(exp, actual)

    def test_is_large(self):
        actual = is_large(1510)
        exp = False
        self.assertEqual(exp, actual)

        actual = is_large(2**30)
        exp = False
        self.assertEqual(exp, actual)

        actual = is_large(2**32 + 5)
        exp = True
        self.assertEqual(exp, actual)

    def test_is_lucky(self):
        actual = is_lucky(-108)
        exp = False
        self.assertEqual(exp, actual)

        actual = is_lucky(999)
        exp = False
        self.assertEqual(exp, actual)

        actual = is_lucky(-708)
        exp = True
        self.assertEqual(exp, actual)

    def test_is_primary_color(self):
        actual = is_primary_color('green')
        exp = False
        self.assertEqual(exp, actual)

        actual = is_primary_color('purple')
        exp = False
        self.assertEqual(exp, actual)

        actual = is_primary_color('255')
        exp = False
        self.assertEqual(exp, actual)

        actual = is_primary_color('red')
        exp = True
        self.assertEqual(exp, actual)

        actual = is_primary_color('blue')
        exp = True
        self.assertEqual(exp, actual)

        actual = is_primary_color('yellow')
        exp = True
        self.assertEqual(exp, actual)

    def test_is_round_up(self):
        actual = round_up(5.9)
        exp = 6
        self.assertEqual(exp, actual)

        actual = round_up(5.0)
        exp = 5
        self.assertEqual(exp, actual)

        actual = round_up(-15.9)
        exp = -15
        self.assertEqual(exp, actual)

        actual = round_up(-8.0)
        exp = -8
        self.assertEqual(exp, actual)

    def test_power(self):
        actual = power(1, 3)
        exp = 1
        self.assertEqual(exp, actual)

        actual = power(2, 7)
        exp = 128
        self.assertEqual(exp, actual)

        actual = power(-1, 3)
        exp = -1
        self.assertEqual(exp, actual)

        actual = power(3, 4)
        exp = 81
        self.assertEqual(exp, actual)

    def test_volume_cylinder(self):
        actual = volume_of_a_cylinder(7, 13)
        exp = 2001.19
        self.assertEqual(exp, actual)

        actual = volume_of_a_cylinder(49, 7)
        exp = 52800.75
        self.assertEqual(exp, actual)

        actual = volume_of_a_cylinder(132, 11)
        exp = 602130.21
        self.assertEqual(exp, actual)

        actual = volume_of_a_cylinder(21, 6)
        exp = 8312.65
        self.assertEqual(exp, actual)

    def test_volume_cone(self):
        actual = volume_of_a_cone(7, 13)
        exp = 667.06
        self.assertEqual(exp, actual)

        actual = volume_of_a_cone(49, 7)
        exp = 17600.25
        self.assertEqual(exp, actual)

        actual = volume_of_a_cone(132, 11)
        exp = 200710.07
        self.assertEqual(exp, actual)

        actual = volume_of_a_cone(21, 6)
        exp = 2770.88
        self.assertEqual(exp, actual)

    def test_volume_sphere(self):
        actual = volume_of_a_sphere(7)
        exp = 1436.76
        self.assertEqual(exp, actual)

        actual = volume_of_a_sphere(5)
        exp = 523.6
        self.assertEqual(exp, actual)

        actual = volume_of_a_sphere(5.9)
        exp = 860.29
        self.assertEqual(exp, actual)

        actual = volume_of_a_sphere(12.01)
        exp = 7256.34
        self.assertEqual(exp, actual)

    def test_diagonal_square(self):
        actual = diagonal_of_a_square(7)
        exp = 9.9
        self.assertEqual(exp, actual)

        actual = diagonal_of_a_square(5)
        exp = 7.07
        self.assertEqual(exp, actual)

        actual = diagonal_of_a_square(1)
        exp = 1.41
        self.assertEqual(exp, actual)

        actual = diagonal_of_a_square(12.01)
        exp = 16.98
        self.assertEqual(exp, actual)

        actual = diagonal_of_a_square()
        exp = 1.41
        self.assertEqual(exp, actual)

    def test_perimeter_triangle(self):
        actual = perimeter_of_a_triangle(1,2,2)
        exp = 5.0
        self.assertEqual(exp, actual)

        actual = perimeter_of_a_triangle(5.5,8.8,13)
        exp = 27.3
        self.assertEqual(exp, actual)

        actual = perimeter_of_a_triangle(3,4,5)
        exp = 12.0
        self.assertEqual(exp, actual)

        actual = perimeter_of_a_triangle()
        exp = 12
        self.assertEqual(exp, actual)

    def test_area_triangle(self):
        actual = area_of_a_triangle(1,2,2)
        exp = 0.97
        self.assertEqual(exp, actual)

        actual = area_of_a_triangle(5.5,8.8,13)
        exp = 18.73
        self.assertEqual(exp, actual)

        actual = area_of_a_triangle(3,4,5)
        exp = 6.0
        self.assertEqual(exp, actual)

        actual = area_of_a_triangle()
        exp = 6
        self.assertEqual(exp, actual)



if __name__ == '__main__':
    unittest.main(exit=False)
    input()
