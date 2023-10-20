package Modul5;

import java.time.LocalDateTime;
import java.util.List;

public class Message implements MessageStateInterface {
    private static final String MessageStatus = null;
    User user = new User(getContent(), getContent(), getContent(), null, getContent(), getContent());
    Chat chat = new Chat();
    private String content;
    private LocalDateTime time;
    private int status;

    public Message(User user, Chat chat, String content) {
        this.user = user;
        this.chat = chat;
        this.content = content;
        this.time = LocalDateTime.now();
        this.status = unread;
    }

    public User getUser() {
        return user;
    }

    public Chat getChat() {
        return chat;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public void printMethodReadMessage() {
        int readMessage = 3;
        System.out.println("Total Read Message " + readMessage);
    }

    @Override
    public String showMessage() {
        List<Message> messages = getMessages(); // get the list of messages
        for (Message message : messages) {
            if (message.getStatus() != MessageAvailabilityEnum.DELETED) { // check if the message is not deleted
                String senderName = message.getUser().getName();
                String chatName = message.getChat() instanceof GroupChat ? ((GroupChat) message.getChat()).getGroupName()
                        : ((IndividualChat) message.getChat()).getFriend().getUsername();
                String content = message.getContent();
                String time = message.getTime().toString();
                int status = message.getStatus();
                System.out.println(senderName + " - " + chatName + " - " + content + " - " + time + " - " + status);
            }
        }
    }

    private List<Message> getMessages() {
        return null;
    }

    @Override
    public String sendMessage(User user, Chat chat, String content) {
        Message message = new Message(user, chat, content); // create a new message
        chat.addMessage(message); // add the message to the chat
        user.addSentMessage(message); // add the message to the user sent messages
        for (User receiver : chat.getMembers()) { // loop through the chat members
            if (!receiver.equals(user)) { // check if the receiver is not the user
                receiver.addSentMessage(message); // add the message to the receiver's received messages
                message.setStatus(MessageStateInterface.unread); // set the message status to UNREAD for the receiver
            } else {
                message.setStatus(MessageStateInterface.read); // set the message status to READ for the user
            }
        }
    }

    @Override
    public void printMethodUnreadMessage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printMethodUnreadMessage'");
    }

}
