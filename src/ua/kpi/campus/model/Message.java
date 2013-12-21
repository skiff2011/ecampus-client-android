package ua.kpi.campus.model;

/**
 * DB representation of message
 *
 * @author Artur Dzidzoiev
 * @version 12/21/13
 */
public class Message {
    private int messageId;
    private int groupId;
    private int timeSent;
    private String text;
    private String subject;

    public Message() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getTimeSent() {
        return timeSent;
    }

    public void setTimeSent(int timeSent) {
        this.timeSent = timeSent;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
