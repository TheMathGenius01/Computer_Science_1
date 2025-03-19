# This program displays the children's song
# "The Wheels on the Bus."

# Displays one verse of the song.
def verse(item, verb, sound):
    print("The", item, "on the bus", verb, sound)
    print(sound)
    print(sound)
    print("The", item, "on the bus", verb, sound)
    print("All through the town")
    print()

def main():
    verse("wheels", "go", "round and round")
    verse("wipers", "go", "swish swish swish")
    verse("horn", "goes", "beep beep beep")
    
main()