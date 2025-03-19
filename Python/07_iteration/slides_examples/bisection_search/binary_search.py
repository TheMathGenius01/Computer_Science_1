def binary_search(val, list):
    
    left = 0
    right = len(list) -1

    while left <= right:
        mid = (left + right) // 2
        if list[mid] == val:
            return "{:<6}".format(val) + " is at index " + str(mid)
        elif list[mid] > val:
            right = mid -1
        else:
            left = mid + 1
    return str(val) + " is not in the list"

list = ["ann", "bob", "chuck", "joe", "ryan", "sara", "steve", "zack"]
print(binary_search("bob", list))
print(binary_search("zack", list))
print(binary_search("mary", list))
print(binary_search("allen", list))


print()
for name in list:
    print(binary_search(name, list))

print()
print(binary_search(7, [4,5,66,71,101,300]))
print(binary_search(66, [4,5,66,71,101,300]))
print(binary_search(101, [4,5,66,71,101,300]))
























