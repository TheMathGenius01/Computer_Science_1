import random
import tkinter as tk
from PIL import Image, ImageTk

# Initialize game variables
miles_traveled = 0
thirst = 0
horse_tired = 0
drinks_in_canteen = 10
roman_distance = -20
wood_for_fire = 0

# Initialize main window
root = tk.Tk()
root.title("Escape from Rome")

# Set up Canvas
canvas = tk.Canvas(root, width=700, height=500)
canvas.pack()

# Load images
colosseum_img = Image.open("Colosseum.jpeg")
colosseum_img = colosseum_img.resize((700, 500), Image.Resampling.LANCZOS)
colosseum_photo = ImageTk.PhotoImage(colosseum_img)

# Roman figure
roman_img = Image.open("Running Roman.png")
roman_img = roman_img.resize((150, 150), Image.Resampling.LANCZOS)  # Adjust size for wider image
roman_photo = ImageTk.PhotoImage(roman_img)

# Load desert background
desert_img = Image.open("Desert.jpg")
desert_img = desert_img.resize((700, 500), Image.Resampling.LANCZOS)
desert_photo = ImageTk.PhotoImage(desert_img)

# Load "Roman Catch" image
roman_catch_img = Image.open("roman_catch.png")
roman_catch_img = roman_catch_img.resize((700, 500), Image.Resampling.LANCZOS)
roman_catch_photo = ImageTk.PhotoImage(roman_catch_img)

# Load "Horse died" image
horse_died_img = Image.open("horse_died.png")
horse_died_img = horse_died_img.resize((700, 500), Image.Resampling.LANCZOS)
horse_died_photo = ImageTk.PhotoImage(horse_died_img)

# Load "Empty Canteen" image
empty_canteen_img = Image.open("empty_canteen.png")
empty_canteen_img = empty_canteen_img.resize((700, 500), Image.Resampling.LANCZOS)
empty_canteen_photo = ImageTk.PhotoImage(empty_canteen_img)

# Load "Victory" image
victory_img = Image.open("victory.png")
victory_img = victory_img.resize((700, 500), Image.Resampling.LANCZOS)
victory_photo = ImageTk.PhotoImage(victory_img)


# Display the introduction background image
colosseum_bg = canvas.create_image(0, 0, anchor=tk.NW, image=colosseum_photo)

# Display introduction text
intro_text = canvas.create_text(360, 140, text="Brutus,\nYou have just helped in killing Julius Caesar.\n"
                                               "The Roman Legionaries are chasing you down!\n"
                                               "Survive the run for 300 miles.\n"
                                               "Above all, keep the horse alive!\n\n"
                                               "Do you want to start the game?",
                                font=("Arial", 12), fill="black")


# Function to display messages
def display_message(message):
    canvas.itemconfig(status_text, text=message)


# Fade-in effect for buttons
def fade_in_button(step=0):
    if step <= 20:
        shade = 255 - int((step / 20) * 255)
        color = f'#{shade:02x}{shade:02x}{shade:02x}'
        btn_yes.config(fg=color)
        btn_no.config(fg=color)
        root.after(100, fade_in_button, step + 1)


# Function to start the game
def start_game():
    # Clear introduction text and buttons
    canvas.delete(intro_text)
    canvas.delete(colosseum_bg)
    btn_yes.destroy()
    btn_no.destroy()

    global desert_bg
    desert_bg = canvas.create_image(0, 0, anchor=tk.NW, image=desert_photo)

    # Display the Roman soldier image for the game background
    global roman_bg
    roman_bg = canvas.create_image(0, 400, anchor=tk.W, image=roman_photo)

    # Display the game status text area
    global status_text
    status_text = canvas.create_text(350, 100, text="", font=("Rod", 11), fill="black")

    # Show command descriptions
    show_command_descriptions()

    # Entry widget for user input (higher position)
    user_input.place(x=260, y=250)

    # Function to handle user input
    def handle_input(event):
        command = user_input.get().strip().lower()
        user_input.delete(0, tk.END)  # Clear the input field after each entry

        if command == 'a':
            drink_canteen()
        elif command == 'b':
            travel_moderate_speed()
        elif command == 'c':
            travel_full_speed()
        elif command == 'd':
            stop_for_night()
        elif command == 'e':
            show_stats()
        elif command == 'f':
            gather_resources()
        elif command == 'stop':
            root.quit()
        else:
            display_message("Invalid command. Please enter A-F or 'stop'.")
            root.after(2000, show_command_descriptions)

    # Bind the Enter key to trigger the command input
    user_input.bind("<Return>", handle_input)


# Introduction buttons for Yes and No
btn_yes = tk.Button(root, text="Yes", font=("Helvetica", 12), command=start_game)
btn_yes.place(x=290, y=420)
btn_no = tk.Button(root, text="No", font=("Helvetica", 12), command=root.quit)
btn_no.place(x=360, y=420)

fade_in_button()

# Entry box for user commands
user_input = tk.Entry(root, width=20, font=("Arial", 12))


# Show command descriptions
def show_command_descriptions():
    description_text = (
        "A. Drink from your canteen\n"
        "B. Travel at moderate speed\n"
        "C. Travel at full speed\n"
        "D. Stop for the night\n"
        "E. Check status\n"
        "F. Gather resources\n"
        "Type 'stop' to quit the game."
    )
    display_message(description_text)


# Function to move the Roman image across the screen
def move_roman():
    """Moves the Roman image across the screen from left to right within two seconds,
    then resets it to the original location."""
    canvas.coords(roman_bg, 0, 400)  # Reset to the left side
    target_x = 700  # Width of the canvas (right edge)
    duration = 2000  # 2 seconds in milliseconds
    steps = 40  # Number of steps to complete in two seconds
    speed = target_x / steps  # Calculate distance per step

    def animate(step=0):
        if step < steps:
            canvas.move(roman_bg, speed, 0)  # Move right by calculated `speed`
            root.after(duration // steps, animate, step + 1)
        else:
            # Reset Roman image to the left side for the next move
            canvas.coords(roman_bg, 0, 400)
            show_command_descriptions()  # Display command descriptions after movement

    animate()  # Start animation


# Game actions
def drink_canteen():
    global thirst, drinks_in_canteen, horse_tired, roman_distance
    if drinks_in_canteen > 0:
        thirst = 0
        if horse_tired > 0:
            horse_tired -= 1
        drinks_in_canteen -= 1
        roman_distance += random.randint(7, 13)
        display_message("You drank from the canteen.")
    else:
        display_message("Error! No drinks available.")
    root.after(2000, show_command_descriptions)
    check_game_status()


def travel_moderate_speed():
    global miles_traveled, thirst, horse_tired, roman_distance
    miles_traveled += random.randint(5, 12)
    thirst += 1
    horse_tired += 1
    roman_distance += random.randint(7, 13)
    display_message("You traveled at moderate speed.")

    # Move the Roman image across the screen
    move_roman()

    root.after(3000, show_command_descriptions())


def travel_full_speed():
    global miles_traveled, thirst, horse_tired, roman_distance
    miles_traveled += random.randint(10, 20)
    thirst += 1
    horse_tired += random.randint(1, 3)
    roman_distance += random.randint(7, 13)
    display_message("You traveled at full speed.")

    # Move the Roman image across the screen
    move_roman()

    root.after(3000, show_command_descriptions())


def stop_for_night():
    global horse_tired, wood_for_fire, roman_distance
    horse_tired = 0
    roman_distance += random.randint(7, 13)
    if wood_for_fire >= 4:
        wood_for_fire -= random.randint(2, 4)
        display_message("You made a fire and rested. Your horse is happy.")
    else:
        horse_tired += 2
        display_message("Not enough wood. The horse is cold and tired.")
    root.after(3000, show_command_descriptions)
    check_game_status()


def gather_resources():
    global wood_for_fire
    gathered_wood = random.randint(0, 6)
    wood_for_fire += gathered_wood
    display_message(f"You gathered {gathered_wood} pieces of wood.")
    root.after(3000, show_command_descriptions)


def show_stats():
    stats = (f"Miles traveled: {miles_traveled}\n"
             f"Thirst: {thirst}\n"
             f"horse tiredness: {horse_tired}\n"
             f"Drinks in canteen: {drinks_in_canteen}\n"
             f"Wood for fire: {wood_for_fire}\n"
             f"The Romans are {abs(miles_traveled - roman_distance)} miles behind you.")
    display_message(stats)
    root.after(6000, show_command_descriptions)


# Function to check and display game status
def check_game_status():
    global thirst, horse_tired, miles_traveled, roman_distance
    distance_between_parties = abs(miles_traveled - roman_distance)

    # Check end conditions
    # If player makes it to the end goal
    if miles_traveled >= 300:
        # Display "Victory" image
        canvas.delete("all")
        user_input.destroy()
        # Clear all previous items on the canvas
        canvas.create_image(0, 0, anchor=tk.NW, image=victory_photo)
        root.update()
        root.after(3000, root.quit())
    # If player dies to dehydration
    elif thirst > 6:
        # Display "Roman Catch" image if Romans catch up
        canvas.delete("all")
        user_input.destroy()
        # Clear all previous items on the canvas
        canvas.create_image(0, 0, anchor=tk.NW, image=empty_canteen_photo)
        root.update()
        root.after(3000, root.quit())
    # If the horse dies
    elif horse_tired > 8:
        canvas.delete("all")
        user_input.destroy()
        # Clear all previous items on the canvas
        canvas.create_image(0, 0, anchor=tk.NW, image=horse_died_photo)
        root.update()
        root.after(3000, root.quit())
    # If the Romans have caught the player
    elif miles_traveled <= roman_distance:
        # Display "Roman Catch" image if Romans catch up
        canvas.delete("all")
        user_input.destroy()
        # Clear all previous items on the canvas
        canvas.create_image(0, 0, anchor=tk.NW, image=roman_catch_photo)
        root.update()
        root.after(3000, root.quit())
    # Warning for romans catching up
    elif distance_between_parties < 15:
        display_message("The Romans are getting close!")


root.mainloop()
