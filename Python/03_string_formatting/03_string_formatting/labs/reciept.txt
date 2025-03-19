'''
This program was created by Parth Zanwar
It will take the input of three items
It will add them together and also add sales tax of 8.25%
It will output total amount of items with sales tax
'''

# input
item1 = float(input("Enter cost of item 1: "))
item2 = float(input("Enter cost of item 2: "))
item3 = float(input("Enter cost of item 3: "))
symbols = ": $"

#calculations
total = item1 + item2 + item3
average = total / 3
taxes = total * .825
total_with_tax = total + taxes

#formatting
title_formatting = "{:^30}"
info_formatting = "{:14}: ${:8.2f}"
tax_formatting = "{:14}:  {:8.2%}"  

#output
print("\n\n")
print(title_formatting.format("CASH SALES RECIEPT"))
print("\n")
print(info_formatting.format("Cost of item 1", item1))
print(info_formatting.format("Cost of item 2", item2))
print(info_formatting.format("Cost of item 3", item3))
print("--------------------------------------")
print(info_formatting.format("Average Cost", average))
print(info_formatting.format("Total Cost", total))
print(tax_formatting.format("Tax Rate",  0.0825))
print(info_formatting.format("Taxes", taxes))
print("--------------------------------------")
print(info_formatting.format("Total", total_with_tax))



