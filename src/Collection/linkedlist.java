package Collection;

import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> teamKakashi = new LinkedList<>();

        //ADD element
        teamKakashi.add("Naruto");
        teamKakashi.add("Sasuke");
        teamKakashi.addFirst("Kakashi");
        teamKakashi.add(3,"Sakura");
        System.out.println(teamKakashi);

        // Access Element
        System.out.println("Who is the copy Ninja: "+ teamKakashi.get(0));

        // Set Element
        teamKakashi.set(0,"Kakashi Hatake");
        System.out.println(teamKakashi);

        // Remove
        teamKakashi.remove(3);
        System.out.println("Removed the Weakest among them: " + teamKakashi);

        System.out.println(teamKakashi.size());
        System.out.println(teamKakashi.contains("Sakura"));

        System.out.println(teamKakashi.indexOf("Naruto"));
        System.out.println(teamKakashi.lastIndexOf("Sasuke"));
    }
}
