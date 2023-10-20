package UTSPrakStrukdat;

import java.util.Date;
import java.util.Scanner;

class User {
    String userName;
    String displayName;
    String userBio;
    Content userContent[] = new Content[3];

    public User(String userName, String displayName, String userBio) {
        this.userName = userName;
        this.displayName = displayName;
        this.userBio = userBio;
    }
}

class Content {
    String contentType;
    float contentSize;
    String contentDescription;
    Date contentPostDate;
    int likeCount;
    Comment contentComment[] = new Comment[2];

    public Content(String contentType, float contentSize, String contentDescription, int likeCount) {
        this.contentType = contentType;
        this.contentSize = contentSize;
        this.contentDescription = contentDescription;
        this.likeCount = likeCount;
    }
}

class Comment {
    String commentText;
    int commentLikeCount;
    User commenter = new User(commentText, commentText, commentText);

    public Comment(String commentText) {
        this.commentText = commentText;
    }
}

public class UTS_1122041_KatherinYuliana_No1 {

    public static void data() {
        // data dummy user
        User dataUser[] = new User[4];
        dataUser[0] = new User("ayolatihan", "AyoLatihan", "ayo latihan");
        dataUser[1] = new User("akupusing123", "AkuPusing", "Aku Pusing");
        dataUser[2] = new User("apriliariesta94", "ApriliaRiesta", "Aprilia Riesta");
        dataUser[3] = new User("mcrudahnonton", "McRudahNonton", "Rudah Nonton");

        // data dummy content
        dataUser[0].userContent[0] = new Content("video", 130, "", 100);
        dataUser[0].userContent[1] = new Content("foto", 70, "", 200);
        dataUser[0].userContent[2] = new Content("video", 1100, "", 150);

        dataUser[1].userContent[0] = new Content("video", 130, "", 100);
        dataUser[1].userContent[1] = new Content("foto", 70, "", 200);
        dataUser[1].userContent[2] = new Content("video", 1100, "", 150);

        dataUser[2].userContent[0] = new Content("video", 130, "", 100);
        dataUser[2].userContent[1] = new Content("foto", 70, "", 200);
        dataUser[2].userContent[2] = new Content("video", 1100, "", 150);

        dataUser[3].userContent[0] = new Content("video", 130, "", 100);
        dataUser[3].userContent[1] = new Content("foto", 70, "", 200);
        dataUser[3].userContent[2] = new Content("video", 1100, "", 150);

        // data dummy comment
        Content userContent[] = new Content[3];
        userContent[0].contentComment[0] = new Comment(" ");
        userContent[0].contentComment[1] = new Comment(" ");
        userContent[1].contentComment[0] = new Comment(" ");
        userContent[1].contentComment[1] = new Comment(" ");
        userContent[2].contentComment[0] = new Comment(" ");
        userContent[2].contentComment[1] = new Comment(" ");
    }

    public static void totalLike(User dataUser[], Content userContent[], int post) {
        int total = 0;
        int totalLike = 0;
        for (int i = 0; i < dataUser.length; i++) {
            for (int j = 0; j < userContent.length; j++) {
                total = dataUser[i].userContent[j].likeCount + total;
            }
            totalLike = total * post;
        }

        for (int i = 0; i < dataUser.length; i++) {
            System.out.println("User " + dataUser[i].userName + " memiliki total like " + totalLike);

        }
    }

    public static void contentType(User dataUser[], int post, Content userContent[]) {
        for (int i = 0; i < dataUser.length; i++) {
            for (int j = 0; j < userContent.length; j++) {
                //System.out.println("User dengan username " + dataUser[i].userName,
                        //" punya " + post + " post " + dataUser[i].userContent[j].contentSize);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        data();
        User dataUser[] = new User[4];
        Content userContent[] = new Content[3];

        int post = 0;
        for (int i = 0; i < dataUser.length; i++) {
            System.out.println("Banyak post: ");
            post = scan.nextInt();
        }

        totalLike(dataUser, userContent, post);
        contentType(dataUser, post, userContent);
    }
}
