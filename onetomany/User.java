package onetomany;

public class User {
	Post[] post;
	String userName;
	static int count=0;
	
	public User(int size,String userName ) {
		this.post = new Post[size];
		this.userName = userName;
	}
	
	public void addPost(Post p) {
		if(count<post.length) {
			post[count++]=p;
			System.out.println("Post added");
		}
		else {
			System.out.println("Arrayy is full");
		}
	}
	
	public void displayPost() {
		for(int i=0;i<count;i++) {
			Post p1=post[i];
			if(post[i]==null){
				continue;
			}
			System.out.println(p1.postid+"  "+p1.postDesc);
		}
	}

	public void update(int post_id,int newid){
		for(int i=0;i<count;i++){
			Post p3 = post[i];
			if(p3.postid==post_id){
				p3.postid=newid;
			}
		}
	}

	public void remove(int post_id){
		for(int i=0;i<count;i++){
			Post p4 = post[i];
			if(p4.postid==post_id){
				post[i] = null;
				break;
			}
		}
	}
}
