package sp.post.vo;

public class Post {
	private int postNO;
	private int memberNo;
	private String postSender;
	private String postReseiver;
	private String postTitle;
	private String postContent;
	private String regDate;
	private int identify;
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Post(int postNO, int memberNo, String postSender, String postReseiver, String postTitle, String postContent,
			String regDate, int identify) {
		super();
		this.postNO = postNO;
		this.memberNo = memberNo;
		this.postSender = postSender;
		this.postReseiver = postReseiver;
		this.postTitle = postTitle;
		this.postContent = postContent;
		this.regDate = regDate;
		this.identify = identify;
	}
	public int getPostNO() {
		return postNO;
	}
	public void setPostNO(int postNO) {
		this.postNO = postNO;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getPostSender() {
		return postSender;
	}
	public void setPostSender(String postSender) {
		this.postSender = postSender;
	}
	public String getPostReseiver() {
		return postReseiver;
	}
	public void setPostReseiver(String postReseiver) {
		this.postReseiver = postReseiver;
	}
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getPostContent() {
		return postContent;
	}
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public int getIdentify() {
		return identify;
	}
	public void setIdentify(int identify) {
		this.identify = identify;
	}
	
}
