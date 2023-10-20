package Modul5;

    public class GroupChat extends Chat {
    private String groupName;
    private String groupMember[] = new String[100];

    public GroupChat(String groupName, String groupMember[]) {

        this.groupName = groupName;
        this.groupMember = groupMember;
    }

    public String getGroupName() {
        return groupName;
    }

    public String[] getGroupMember() {
        return groupMember;
    }
}

