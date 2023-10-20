package UTSPBO;

public class comment {
    contentState contentState;

    private String commentId;
    private String text;
    private contentState status;

    public comment(String commentId, String text, contentState status){
        this.commentId = commentId;
        this.text = text;
        this.status = status;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public UTSPBO.contentState getStatus() {
        return status;
    }

    public void setStatus(UTSPBO.contentState status) {
        this.status = status;
    }

}
