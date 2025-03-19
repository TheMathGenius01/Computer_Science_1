import unittest
from username_password_validator import*

class Test(unittest.TestCase):

    ##########################################################
    # is_valid_username
    def test_username01(self):
        exp = False
        name = 'joe'
        self.assertEqual(is_valid_username(name),exp)
        
    def test_username02(self):
        exp = False
        name = 'joe@'
        self.assertEqual(is_valid_username(name),exp)
        
    def test_username03(self):
        exp = False
        name = 'hello'
        self.assertEqual(is_valid_username(name),exp)
        
    def test_username04(self):
        exp = False
        name = 'this_is way_too_long!'
        self.assertEqual(is_valid_username(name),exp)
        
    def test_username05(self):
        exp = False
        name = 'has_symbol!'
        self.assertEqual(is_valid_username(name),exp)
        
    def test_username06(self):
        exp = False
        name = 'has_digit9'
        self.assertEqual(is_valid_username(name),exp)

    def test_username07(self):
        exp = True
        name = '______'
        self.assertEqual(is_valid_username(name),exp)

    def test_username08(self):
        exp = False
        name = 'Upper_case'
        self.assertEqual(is_valid_username(name),exp)

    def test_username09(self):
        exp = False
        name = '@_________!'
        self.assertEqual(is_valid_username(name),exp)
        
    def test_username10(self):
        exp = True
        name = 'this_isvalid'
        self.assertEqual(is_valid_username(name),exp)

    def test_username11(self):
        exp = True
        name = 'abcdef'
        self.assertEqual(is_valid_username(name),exp)

    def test_username12(self):
        exp = True
        name = '___twelve___'
        self.assertEqual(is_valid_username(name),exp)
    
    ##########################################################
    # is_valid_password

    def test_password01(self):
        exp = False
        pswd = 'short'
        self.assertEqual(is_valid_password(pswd),exp)
        
    def test_password02(self):
        exp = False
        pswd = 'thisistoolong'
        self.assertEqual(is_valid_password(pswd),exp)
        
    def test_password03(self):
        exp = False
        pswd = 'hello'
        self.assertEqual(is_valid_password(pswd),exp)
        
    def test_password04(self):
        exp = False
        pswd = 'hasBad+sym1'
        self.assertEqual(is_valid_password(pswd),exp)
        
    def test_password05(self):
        exp = False
        pswd = 'onlyLetters'
        self.assertEqual(is_valid_password(pswd),exp)
        
    def test_password06(self):
        exp = False
        pswd = '!@#$%^&*'
        self.assertEqual(is_valid_password(pswd),exp)

    def test_password07(self):
        exp = False
        pswd = '123456789'
        self.assertEqual(is_valid_password(pswd),exp)

    def test_password08(self):
        exp = False
        pswd = 'missNum!'
        self.assertEqual(is_valid_password(pswd),exp)

    def test_password09(self):
        exp = False
        pswd = '!bad+sym1'
        self.assertEqual(is_valid_password(pswd),exp)
        
    def test_password10(self):
        exp = False
        pswd = 'M7SSsym'
        self.assertEqual(is_valid_password(pswd),exp)

    def test_password11(self):
        exp = False
        pswd = '$%123456&*'
        self.assertEqual(is_valid_password(pswd),exp)

    def test_password12(self):
        exp = False
        pswd = '~~1234ABC!!'
        self.assertEqual(is_valid_password(pswd),exp)

    def test_password13(self):
        exp = False
        pswd = 'abcDEF8~'
        self.assertEqual(is_valid_password(pswd),exp)
        
    def test_password14(self):
        exp = True
        pswd = '!abcdefg7'
        self.assertEqual(is_valid_password(pswd),exp)

    def test_password15(self):
        exp = True
        pswd = 'Z*&^%$!1'
        self.assertEqual(is_valid_password(pswd),exp)

    def test_password16(self):
        exp = True
        pswd = 'QWERTY09876^'
        self.assertEqual(is_valid_password(pswd),exp)

    def test_password17(self):
        exp = True
        pswd = '!@#$%^&*8a!q'
        self.assertEqual(is_valid_password(pswd),exp)

    def test_password18(self):
        exp = True
        pswd = 'C@mpSci1sFun'
        self.assertEqual(is_valid_password(pswd),exp)
    

if __name__ == '__main__':
    unittest.main()
