#  theStack03.py     Some silly functions that help show how the stack works
#  P. Conrad for CS8, Fall 2010, UCSB CS Dept.

# The functions in this file aren't intended to do useful work.
# Instead, they are here to help us look at how function calls actually
# work---what happens inside the computer when a function is called.

# We'll look at these examples first, and then apply what we've learned
# to situations involving useful programs.

### Below this line is what will appear on web page
    
def foo(x,y):
    print("x=",x,"y=",y)
    z=x+y
    print("z=",z)
    
def go():
    a=7
    foo(a,a+1)

go()    

