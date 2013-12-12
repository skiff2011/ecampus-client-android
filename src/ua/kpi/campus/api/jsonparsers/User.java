package ua.kpi.campus.api.jsonparsers;

import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: Serhii Hokhalenko
 * Date: 09.12.13
 * Time: 0:26
 * To change this template use File | Settings | File Templates.
 */
public final class User {
    private final int statusCode;
    private final Timestamp timeStamp;
    private final String guid;
    private final Object padding;
    private final UserData data;

    public User(int statusCode, Timestamp timeStamp, String guid, Object padding, UserData data) {
        this.statusCode = statusCode;
        this.timeStamp = timeStamp;
        this.guid = guid;
        this.padding = padding;
        this.data = data;
    }



    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public String getGuid() {
        return guid;
    }

    public Object getPadding() {
        return padding;
    }

    public UserData getData() {
        return data;
    }

    public int getStatusCode() {

        return statusCode;
    }
}