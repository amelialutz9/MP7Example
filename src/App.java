import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * The app that drives the project.
 * @author amelialutz
 *
 */
public class App {
	public static void main(String[] args) {
		// Creates a scanner to prompt for input.
		Scanner sc = new Scanner(System.in);
		// Creates the array list of all images.
		ArrayList<EnhancedImage> clothes = initClothes();
		
		// Prompt for user information and creates the user.
		System.out.print("What is your name? ");
		String name = sc.next();
		System.out.print("Enter 'F' for formal clothes or 'I' for informal clothes: ");
		String atmosphere = sc.next();
		while (!atmosphere.equalsIgnoreCase("f") && !atmosphere.equalsIgnoreCase("i")) {
			System.out.print("Sorry, please enter 'F' for formal clothes or 'I' for informal clothes: ");
			atmosphere = sc.next();
		}
		System.out.print("Enter 'U' for upper section (tops) or 'L' for lower section (pants): ");
		String section = sc.next();
		while (!section.equalsIgnoreCase("u") && !section.equalsIgnoreCase("l")) {
			System.out.println("Sorry, please enter 'U' for upper section (tops) or 'L' for lower section (pants): ");
			section = sc.next();
		}
		String key = "M" + atmosphere + section;
		Human user = new Human(name, key.toUpperCase());
		//System.out.println(user.toString());
		
		// Create a new array based on user preference.
		ArrayList<EnhancedImage> newClothes = new ArrayList<EnhancedImage>();
		for (EnhancedImage image : clothes) {
			if (image.getKey().contains(user.getKey())) {
				newClothes.add(image);
			}
		}
		for (EnhancedImage image : newClothes) {
			System.out.println(image.toString());
		}
		
		for (int i = 0; i < newClothes.size(); i++) {
			JFrame frame = new JFrame();
			ImageIcon icon = new ImageIcon(newClothes.get(i).getSource());
			JLabel label = new JLabel(icon);
			frame.add(label);
			frame.pack();
			frame.setVisible(true);
		}
		
		// User chooses which item they want to base their outfit around
		System.out.println("Close all windows then pick the number of the item that you would like to base your outfit off (1- " + newClothes.size() + "): ");
		int numChoice = sc.nextInt();
		while (numChoice > newClothes.size()) {
			System.out.println("Sorry, please enter a number between 1 and " + newClothes.size());
			numChoice = sc.nextInt();
		}

		// Create an array for the matches and display the matches
		EnhancedImage choice = newClothes.get(numChoice - 1);
		System.out.println(choice.toString());
		choice.getMatchKey();
		ArrayList<String> matches = choice.getMatch();
		for (String match : matches) {
			System.out.println(match);
		}
		for (int i = 0; i < matches.size(); i++) {
			for (int j = 0; j < clothes.size(); j++) {
				if (clothes.get(j).getKey().equals(matches.get(i))) {
					JFrame frame = new JFrame();
					ImageIcon icon = new ImageIcon(clothes.get(j).getSource());
					JLabel label = new JLabel(icon);
					frame.add(label);
					frame.pack();
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			}
		}
		System.out.println("Displaying matches...");
		System.out.println("Close windows to exit app");
		sc.close();
		return;
	}
	
	public static ArrayList<EnhancedImage> initClothes() {
		ArrayList<EnhancedImage> images = new ArrayList<EnhancedImage>();
		// creates and adds tops
		EnhancedImage top1 = new EnhancedImage("W", "F", "U", "S", "B", "resources/top1.jpg");
		EnhancedImage top2 = new EnhancedImage("W", "I", "U", "T", "G", "resources/top2.jpg");
		EnhancedImage top3 = new EnhancedImage("W", "I", "U", "T", "E", "resources/top3.jpg");
		EnhancedImage top4 = new EnhancedImage("M", "F", "U", "J", "B", "resources/top4.jpg");
		EnhancedImage top5 = new EnhancedImage("M", "I", "U", "T", "B", "resources/top5.jpg");
		EnhancedImage top6 = new EnhancedImage("M", "I", "U", "S", "Y", "resources/top6.jpg");
		EnhancedImage top7 = new EnhancedImage("M", "I", "U", "J", "Y", "resources/top7.jpg");
		EnhancedImage top8 = new EnhancedImage("M", "F", "U", "J", "Y", "resources/top8.jpg");
		EnhancedImage top9 = new EnhancedImage("M", "F", "U", "J", "C", "resources/top9.jpg");
		EnhancedImage top10 = new EnhancedImage("M", "I", "U", "J", "B", "resources/top10.jpg");
		EnhancedImage top11 = new EnhancedImage("M", "F", "U", "J", "C", "resources/top11.jpg");
		EnhancedImage top12 = new EnhancedImage("M", "I", "U", "S", "R", "resources/top12.jpg");
		EnhancedImage top13 = new EnhancedImage("M", "I", "U", "S", "C", "resources/top13.jpg");
		EnhancedImage top14 = new EnhancedImage("M", "I", "U", "T", "W", "resources/top14.jpg");
		EnhancedImage top15 = new EnhancedImage("M", "I", "U", "T", "C", "resources/top15.jpg");
		EnhancedImage top16 = new EnhancedImage("M", "I", "U", "T", "G", "resources/top16.jpg");
		EnhancedImage top17 = new EnhancedImage("M", "I", "U", "T", "Y", "resources/top17.jpg");
		EnhancedImage top18 = new EnhancedImage("M", "I", "U", "T", "R", "resources/top18.jpg");
		EnhancedImage top19 = new EnhancedImage("M", "F", "U", "T", "G", "resources/top19.jpg");
		EnhancedImage top20 = new EnhancedImage("M", "F", "U", "T", "C", "resources/top20.jpg");
		EnhancedImage top21 = new EnhancedImage("M", "F", "U", "T", "Y", "resources/top21.jpg");
		EnhancedImage top22 = new EnhancedImage("M", "F", "U", "T", "R", "resources/top22.jpg");
		EnhancedImage top23 = new EnhancedImage("M", "F", "U", "T", "B", "resources/top23.jpg");
		EnhancedImage top24 = new EnhancedImage("M", "F", "U", "T", "E", "resources/top24.jpg");
		EnhancedImage top25 = new EnhancedImage("M", "I", "U", "T", "E", "resources/top25.jpg");
		images.add(top1);
		images.add(top2);
		images.add(top3);
		images.add(top4);
		images.add(top5);
		images.add(top6);
		images.add(top7);
		images.add(top8);
		images.add(top9);
		images.add(top10);
		images.add(top11);
		images.add(top12);
		images.add(top13);
		images.add(top14);
		images.add(top15);
		images.add(top16);
		images.add(top17);
		images.add(top18);
		images.add(top19);
		images.add(top20);
		images.add(top21);
		images.add(top22);
		images.add(top23);
		images.add(top24);
		images.add(top25);
		
		// creates and adds bottoms
		EnhancedImage pant1 = new EnhancedImage("M", "F", "L", "P", "Y", "resources/pant1.jpg");
		EnhancedImage pant2 = new EnhancedImage("M", "I", "L", "P", "C", "resources/pant2.jpg");
		EnhancedImage pant3 = new EnhancedImage("M", "I", "L", "P", "B", "resources/pant3.jpg");
		EnhancedImage pant4 = new EnhancedImage("M", "F", "L", "P", "C", "resources/pant4.jpg");
		images.add(pant1);
		images.add(pant2);
		images.add(pant3);
		images.add(pant4);
		
		return images;
	}
}
