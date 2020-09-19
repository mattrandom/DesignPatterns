package chain_of_responsibility.lesson.message;

import chain_of_responsibility.lesson.officer.OfficerRank;

public class Message {
    private int code;
    private String content;
    private OfficerRank rank;

    public Message(int code, String content, OfficerRank rank) {
        this.code = code;
        this.content = content;
        this.rank = rank;
    }

    public String getContent() {
        return content;
    }

    public int getCode() {
        return code;
    }

    public OfficerRank getRank() {
        return rank;
    }
}
