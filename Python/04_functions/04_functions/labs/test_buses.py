import buses
import unittest


class TestNumBuses(unittest.TestCase):
    """ Test class for function buses.num_buses. """

    # Add your test methods for a1.num_buses here.
    def test_num_buses_0_people(self):
        """Test num_buses with lowest boundary"""
        actual = buses.num_buses(0)
        exp = 0
        self.assertEqual(exp, actual)

    def test_num_buses_1_people(self):
        """Test num_buses with 1 person"""
        actual = buses.num_buses(1)
        exp = 1
        self.assertEqual(exp, actual)

    def test_num_buses_100_people(self):
        """Test num_buses with multiple of 50"""
        actual = buses.num_buses(100)
        exp = 2
        self.assertEqual(exp, actual)

    def test_num_buses_51_people(self):
        """Test num_buses with 1 more than full bus"""
        actual = buses.num_buses(51)
        exp = 2
        self.assertEqual(exp, actual)


if __name__ == '__main__':
    unittest.main(exit=False)
