package Modul5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Chat {
    ChatStateEnum chatstate;

    public void addMessage(Message message) {
    }

    public User[] getMembers() {
        return null;
    }

    @Override
    public String changeChatState(Chat chat, ChatStateEnum state) {
        if (chat.getStatus() == ChatStateEnum.HIDE || chat.getStatus() == ChatStateEnum.DELETED) {
            System.out.println("Cannot change state for hidden or deleted chats.");
            return null;
        }
        ChatStateEnum chatState = state;
        if (chatState == ChatStateEnum.PINNED) {
            if (chat.getStatus() == ChatStateEnum.UNPINNED) {
                chatState.pinChat(chat);
            } else {
                chatState.unpinChat(chat);
            }
        } else if (chatState == ChatStateEnum.MUTED) {
            if (chat.getStatus() == ChatStateEnum.UNMUTED) {
                chatState.muteChat(chat);
            } else {
                chatState.unmuteChat(chat);
            }
        }
    }

    @Override
    public String showUserFavoriteChats() {
        List<Chat> chats = getChats(); // get the list of chats
        List<Chat> individualChats = new ArrayList<>();
        List<Chat> groupChats = new ArrayList<>();
        for (Chat chat : chats) {
            if (chat instanceof IndividualChat) {
                individualChats.add(chat);
            } else if (chat instanceof GroupChat) {
                groupChats.add(chat);
            }
        }
        Collections.sort(individualChats, new Comparator<Chat>() {
            @Override
            public int compare(Chat chat1, Chat chat2) {
                return chat2.getMessages().size() - chat1.getMessages().size();
            }
        });
        Collections.sort(groupChats, new Comparator<Chat>() {
            @Override
            public int compare(Chat chat1, Chat chat2) {
                return chat2.getMessages().size() - chat1.getMessages().size();
            }
        });
        Chat favoriteIndividualChat = individualChats.get(0);
        Chat favoriteGroupChat = groupChats.get(0);
        for (Chat chat : individualChats) {
            if (chat.getMessages().size() == favoriteIndividualChat.getMessages().size()
                    && chat.getLastMessageTime().isAfter(favoriteIndividualChat.getLastMessageTime())) {
                favoriteIndividualChat = chat;
            }
        }
        for (Chat chat : groupChats) {
            if (chat.getMessages().size() == favoriteGroupChat.getMessages().size()
                    && chat.getLastMessageTime().isAfter(favoriteGroupChat.getLastMessageTime())) {
                favoriteGroupChat = chat;
            }
        }
        System.out.println("Favorite Individual Chat: " + favoriteIndividualChat.getFriend().getUsername());
        System.out.println("Favorite Group Chat: " + ((GroupChat) favoriteGroupChat).getGroupName());
    }

    private User getFriend() {
        return null;
    }

    private Object getLastMessageTime() {
        return null;
    }

    protected List<Chat> getMessages() {
        return null;
    }

    private List<Chat> getChats() {
        return null;
    }

    private ChatStateEnum getStatus() {
        return null;
    }

}
