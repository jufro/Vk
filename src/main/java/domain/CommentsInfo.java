package domain;

public class CommentsInfo {

    private boolean canPost;
    private int idOwner;
    private String text;
    private int likes;
    private String reply;
    private int idReplier;
    private int count;


    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public boolean delete() {
        return true;
    }

    public int getIdReplier() {
        return idReplier;
    }

    public void setIdReplier(int idReplier) {
        this.idReplier = idReplier;
    }
}
