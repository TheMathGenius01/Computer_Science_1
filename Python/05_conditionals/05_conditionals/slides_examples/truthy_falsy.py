# Truthy values
print(bool(5))
print(bool(1.3))
print(bool([1,2]))  #list
print(bool((1,2,3)))# tuple - immutable list
print(bool('cs'))
print(bool(True))

print()

# Falsy values
print(bool(0))
print(bool(0.0))
print(bool([]))     # empty list
print(bool(()))     # empty tuple - immutable list
print(bool(''))
print(bool(False))
print(bool(None))

print()

# examples

x = 1
if x:
    print('not zero')
else:
    print('zero')

x = 'cs'
if x:
    print('not empty')
else:
    print('empty')

x = ''
if not x:
    print('empty')
else:
    print('not empty')

    
