package One_to_many;

public class User1 {
    String username;
    Post1[] posts;
    static int index = 0;
    
    public User1(String username, int size) {
        this.username = username;
        this.posts = new Post1[size];
    }

    public void addPost(Post1 post) {
        if (index < posts.length) {
            posts[index++] = post;
        } else {
            System.out.println("Cannot add more posts, the array is full.");
        }
    }

    public void displayPosts() {
        System.out.println("Posts for user: " + username);
        for (int i = 0; i < index; i++) {
            System.out.println("Post ID: " + posts[i].postId + ", Description: " + posts[i].postDescription);
        }
    }
}
