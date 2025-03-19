'''
This code was made by Parth Zanwar on the date of 9/20/23
This code will print out a formatted leaderboard of top tennis players
'''

# Variables
tennis_player1 = "Novak Djokovic"
points1 = 11,795

tennis_player2 = "Carlos Alcaraz"
points2 = 8,535

tennis_player3 = "Daniil Medvedev"
points3 = 7,280

tennis_player4 = "Holger Rune"
points4 = 4,710

tennis_player5 = "Stefanos Tsitsipas"
points5 = 4,615

# Formatting
title_formatting = "{:^50}"
info_formatting = "{:^20}{:^30}"

# Output
print(title_formatting.format("Most points scored by tennis players"))
print(info_formatting.format("Player Name", "Total Points"))
print("---------------------------------------------------------")
print(info_formatting.format(tennis_player1, str(points1)))
print(info_formatting.format(tennis_player2, str(points2)))
print(info_formatting.format(tennis_player3, str(points3)))
print(info_formatting.format(tennis_player4, str(points4)))
print(info_formatting.format(tennis_player5, str(points5)))
