#  theStack01.py     Some silly functions that help show how the stack works
#  P. Conrad for CS8, Fall 2010, UCSB CS Dept.

# The functions in this file aren't intended to do useful work.
# Instead, they are here to help us look at how function calls actually
# work---what happens inside the computer when a function is called.

# We'll look at this example first, and then apply what we've learned
# to situations involving useful programs.

### Below this line is what will appear on web page
def foo():                  
    print("foo line 1")
    print("foo line 2")
    print("foo line 3")
    
def fum():
    print("fum line 1")
    print("fum line 2")
    print("fum line 3")

def bar():
    print("bar line 1")
    fum() 
    foo() 
    print("bar line 4")
    
def go():
    bar()

go() 
