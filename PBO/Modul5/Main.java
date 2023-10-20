package Modul5;

import javax.swing.JOptionPane;
import Modul5.User;

public class Main {
    public static void main(String[] args) {
        User user[] = new User[3];
        user[0] = new User("Rin", null, null, null, null, null);
        user[1] = new User("John", null, null, null, null, null);
        user[2] = new User("Zoe", null, null, null, null, null);

        Chat chat = new Chat();
        Chat chat1 = new Chat();
        Chat chat2 = new Chat();
        Chat chat3 = new Chat();

        Message message = new Message(null, chat3, null);

        int input = 0;
        while (input != 7) {
            input = Integer.parseInt(JOptionPane.showInputDialog(
                    "Pilih menu: \n1. Show User Chat" +
                    "\n2. Change Chat State" +
                    "\n3. Send Message" +
                    "\n4. Show Message" +
                    "\n5. Change User Profile" +
                    "\n6. Show User Favorite Chats" +
                    "\n7. Exit"));
                            
            switch (input) {
                case 1:
                    if(chat1.chatstate == ChatStateEnum.PINNED){
                        JOptionPane.showMessageDialog(null, "Username: " + user[0].getUsername() + ", Status: " + chat1);
                    } else if(chat2.chatstate == ChatStateEnum.UNPINNED){
                        JOptionPane.showMessageDialog(null, "Username: " + user[1].getUsername() + ", Status: " + chat2);
                    } else if(chat3.chatstate == ChatStateEnum.MUTED){
                        JOptionPane.showMessageDialog(null, "Username: " + user[2].getUsername() + ", Status: " + chat2);
                    }

                    break;
                case 2:
                    String change = JOptionPane.showInputDialog(null, chat.changeChatState(chat3, null));
                    
                    break;
                case 3:
                    String send = message.sendMessage(null, chat3, null);
                    JOptionPane.showMessageDialog(null, send);

                    break;
                case 4:
                    String show = message.showMessage();
                    JOptionPane.showMessageDialog(null, show);

                    break;
                case 5:
                    String update = JOptionPane.showInputDialog("Update Profile: " + user[0].updateProfile(null, null, null, null, null, null));

                    break;
                case 6:
                    String fav = chat.showUserFavoriteChats();
                    JOptionPane.showMessageDialog(null, fav);
                    break;
                case 7:
                    // keluar
                    break;
            }
        }
    }
}
