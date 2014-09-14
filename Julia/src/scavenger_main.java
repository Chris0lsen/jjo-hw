/******************************************
 * *****GRADE GUIDE*****
 * 5 Points: Java Comments
 * 5 Points: initGameDataAndArrays
 * 5 Points: runCommand
 * 5 Points: displayPlayerItems and displayGameCommands
 * 5 Points: validCommand and scavengeArea
 * 5 Points: addItemToPlayerItems
 * 5 Points: PlayerItemsStats
 * 5 Points: Command.java
 * 5 Points: Item.java
 * 5 Points: GameDataReader.java
 * Total: 50 Points
 */


public class scavenger_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			initGameDataAndArrays();
			System.out.print("Enter a name: ");
			String name = userInput.nextLine();
			
			System.out.println("Welcome to the Scavenger Game ");  + name );
			System.out.println("");
			
			while( currentPlayerItemsIdx < playerItems.length) {
				Item foundItem = scavengeArea();
				System.out.println("Item found: " + foundItem.getName());
				String[] splitStrings = null;
				do {
					System.out.print("Command: ");
					String input = userInput.nextLine();
					splitStrings = input.split(" ");
					while (!validCommand(splitStrings)) {
						System.out.print("Invalid Try Again, Command: ");
						input = userInput.nextLine();
						splitStrings = input.split(" ");
					}	
				}while (!runCommand(splitStrings[0],foundItem));
			}
			
			displayPlayerItems();
			PlayerItemsStats();
			
		}
	
	private	static Scanner userInput;//	The	Object used	for	collecting and parsing user	input from the keyboard.
	private	static Item[] playerItems;// An	array of type Item used	to	hold the collected	items	from the gameItems.
	private	static Item[] gameItems;// An array	of type	Item that holds	all the	possible items	the	game has available.	
	private	static Command[] gameCommands;// An array of type Command that holds the game commands.
	private	 static	 int currentPlayerItemsIdx;//  An integer used to keep track of the current empty index in the	
												//playerItems array.
	
		public static void initGameDataAndArrays(){
			//Instantiate a	new	Scanner	Object for the userInput attribute.
			
			//Instantiate a	new	Array of Items with	a size of 10 for the playerItems attribute. Next, instantiate each element in	
				//the array with items that	have “empty” for the name, and zeroes for value	and	weight
			
			//Call getGameItems	from the GameDataReader	class and assign the returning array to gameItems array
			
			//Initialize the currentPlayerItemsIdx to zero
			
			//Instantiate a	new	Array of Commands for gameCommands attribute and fill with the following game commands:
				//help, pickup, drop, view, and quit.
			
			
		}
		
		private static Item scavengeArea(){
			/* When called, the method simulates the player is searching for an item
			 * and grabs the item. Using Random, create a number within the bounds of the array
			 * and a random value between 1 and 4. Loop through the array that many times,
			 * outputting "Scavenging..." each time.
			 * Finally, return an item from the gameItems array at the index randomly
			 * generated.
			 */
		}
		
		public static boolean runCommand(String commandName, Item item){
			/*
			 * Uses the commandName parameter to decide which method to call,
			 * returns true if the user did NOT enter "quit", "help", or "view".
			 * If the commandName is "pickup", call addItemToPlayerItems with
			 * the item passed from the parameter, upon success display "Item
			 * successfully added." If commandName is "drop", display the message
			 * "Item not added." If commandName is "help", return false.
			 * If commandName is "view", first call displayPlayerItems,
			 * and then return false. If the commandName is "quit", display
			 * "Game Terminated" and call System.exit(0)
			 */
		}
		
		public void displayPlayerItems(){
			/* Displays the playerItems array using the accessor to grab the 
			 * name and value of each item. If currentPlayerItemsIdx equals 0,
			 * display "Bag is empty".
			 */
		}
		
		public void displayGameCommands(){
			/*Display the gameCommands array using the accessor to
			 * grab the name of each command
			 */
		}
		
		public static boolean validCommand(String[] splitStrings){
			/* Verifies that the first element in the parameter splitStrings 
			 * array is a game command. If it is, return true. If not, false.
			 */
		}
		
		public static boolean addItemToPlayerItems(Item item){
			/*if currentPlayerItemsIdx is greater or equal to the size of playerItems,
			 * return false. Else, add the passed item parameter to playerItems at the 
			 * index of currentPlayerItemsIdx and increase currentPlayerItemsIdx by 1
			 */
		}
		
		public static void PlayerItemsStats(){
			/*Finds the total sum of the value of items colleted, the min and max 
			 * in playerItems. Displays results.
			 */
		}
	
	}

