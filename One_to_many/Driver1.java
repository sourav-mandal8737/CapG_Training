package One_to_many;

import java.util.Scanner;

public class Driver1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter username for the user:");
        String username = sc.nextLine();
        System.out.println("Enter the number of posts:");
        int size = sc.nextInt();
        
        User user = new User(username, size);
        
        boolean flag = true;
        
        while (flag) {
            System.out.println("\nEnter 1 to add a post\nEnter 2 to display posts\nEnter 3 to exit");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    sc.nextLine();  
                    System.out.println("Enter Post ID:");
                    int postId = sc.nextInt();
                    sc.nextLine(); 
                    System.out.println("Enter Post Description:");
                    String postDescription = sc.nextLine();
                    
                    Post post = new Post(postId, postDescription);
                    user.addPost(post);
                    break;
                
                case 2:
                    user.displayPosts();
                    break;
                
                case 3:
                    flag = false;
                    break;
            }
        }
        
        sc.close();
    }
}
