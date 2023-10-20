package UTSPBO;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class post<PostStatus> {
    contentState commentState;
    contentType contentType;
    feed feed;

    private String postId;
    private contentState status;
    private Timestamp timeUpload;
    private contentType postType;

    public post(String postId, contentState status, Timestamp timeUpload, contentType postType) {
        this.postId = postId;
        this.status = status;
        this.timeUpload = timeUpload;
        this.postType = postType;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public contentState getStatus() {
        return status;
    }

    public void setStatus(contentState status) {
        this.status = status;
    }

    public Timestamp getTimeUpload() {
        return timeUpload;
    }

    public void setTimeUpload(Timestamp timeUpload) {
        this.timeUpload = timeUpload;
    }

    public UTSPBO.contentType getPostType() {
        return postType;
    }

    public void setPostType(contentType postType) {
        this.postType = postType;
    }

    public void showUserPosts() {
        // Tampilkan Post yang berstatus PINNED
        for (post post : post) {
            if (post.getStatus() == status.PINNED) {
                System.out.println(postId);
            }
        }

        // Dikelompokan sesuai dengan data bulan yang didapatkan dari timeUpload
        Map<Integer, List<post>> postsByMonth = new HashMap<>();
        for (post post : post) {
            Timestamp month = post.getTimeUpload();
            if (!postsByMonth.containsKey(month)) {
                postsByMonth.put(month, new ArrayList<>());
            }
            postsByMonth.get(month).add(post);
        }

        // Tampilkan Post dengan status SHOWED
        for (int month = 1; month <= 12; month++) {
            if (postsByMonth.containsKey(month)) {
                for (post post : postsByMonth.get(month)) {
                    if (post.getStatus() == status.SHOWED) {
                        System.out.println(post);
                    }
                }
            }
        }

        // Tampilkan Post dengan status ARCHIVED
        for (int month = 1; month <= 12; month++) {
            if (postsByMonth.containsKey(month)) {
                for (post post : postsByMonth.get(month)) {
                    if (post.getStatus() == status.ARCHIVED) {
                        System.out.println(post);
                    }
                }
            }
        }

        // Tampilkan jumlah Post dengan status DELETED
        int deletedCount = 0;
        for (post post : post) {
            if (post.getStatus() == status.DELETED) {
                deletedCount++;
            }
        }
        System.out.println("Jumlah Post dengan status DELETED: " + deletedCount);
    }

    public void showPost() {
        for (post post : post) {
            if (post.getPostId().equals(postId)) {
                System.out.println("ID: " + post.getPostId());
                System.out.println("Caption: " + feed.getCaption());
                System.out.println("Time Upload: " + post.getTimeUpload());
                System.out.println("Status: " + post.getStatus());

                if (post instanceof feed) {
                    System.out.println("Type: Feed");
                    System.out.println("Likes: " + ((feed) post).getLikes());
                } else if (post instanceof story) {
                    System.out.println("Type: Story");
                    System.out.println("Views: " + ((story) post).getViews());
                } else if (post instanceof reel) {
                    System.out.println("Type: Reel");
                    System.out.println("Played Count: " + ((reel) post).getPlayedCount());
                }

                return;
            }
        }

        System.out.println("Post dengan ID " + postId + " tidak ditemukan.");
    }

    public void changePostState(String postId, PostStatus newStatus) {
        for (post post : post) {
            if (post.getPostId().equals(postId)) {
                contentState oldStatus = feed.getStatus();

                if (oldStatus == contentState.SHOWED && newStatus == contentState.PINNED) {
                    // Cek apakah sudah ada 3 Post yang berstatus PINNED
                    int pinnedCount = 0;
                    for (post p : post) {
                        if (p.getStatus() == contentState.PINNED) {
                            pinnedCount++;
                        }
                    }
                    if (pinnedCount >= 3) {
                        System.out.println(
                                "Tidak dapat menambahkan Post ke status PINNED karena sudah mencapai batas maksimum.");
                        return;
                    }
                }

                if (oldStatus == contentState.PINNED && newStatus == contentState.DELETED) {
                    // Cek apakah Post merupakan tipe Feed
                    if (!(post instanceof feed)) {
                        System.out.println("Tidak dapat menghapus Post yang bukan tipe Feed.");
                        return;
                    }
                }

                if (oldStatus == contentState.SHOWED || oldStatus == contentState.ARCHIVED) {
                    if (newStatus == contentState.SHOWED || newStatus == contentState.ARCHIVED) {
                        feed.setStatus(status);
                        System.out.println("Status Post dengan ID " + postId + " berhasil diubah dari " + oldStatus
                                + " menjadi " + newStatus + ".");
                    } else {
                        System.out.println(
                                "Tidak dapat mengubah status Post dari " + oldStatus + " menjadi " + newStatus + ".");
                    }
                } else if (oldStatus == contentState.PINNED) {
                    if (newStatus == contentState.SHOWED || newStatus == contentState.ARCHIVED) {
                        feed.setStatus(status);
                        System.out.println("Status Post dengan ID " + postId + " berhasil diubah dari " + oldStatus
                                + " menjadi " + newStatus + ".");
                    } else {
                        System.out.println(
                                "Tidak dapat mengubah status Post dari " + oldStatus + " menjadi " + newStatus + ".");
                    }
                } else {
                    System.out.println("Tidak dapat mengubah status Post dengan status " + oldStatus + ".");
                }

                return;
            }
        }

        System.out.println("Post dengan ID " + postId + " tidak ditemukan.");
    }
}
