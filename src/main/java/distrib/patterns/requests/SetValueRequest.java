package distrib.patterns.requests;

public class SetValueRequest {
    private long clientId;
    private int requestNumber;
    private String key;
    private String value;
    private long timestamp;

    //for jaxon
    private SetValueRequest() {
    }

    public SetValueRequest(String key, String value, long clientId, int requestNumber, long timestamp) {
        this.key = key;
        this.value = value;
        this.clientId = clientId;
        this.requestNumber = requestNumber;
        this.timestamp = timestamp;
    }

    public SetValueRequest(String key, String value) {
        this(key, value, -1, -1, -1);
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public long getClientId() {
        return clientId;
    }

    public int getRequestNumber() {
        return requestNumber;
    }

    public long getTimestamp() {
        return timestamp;
    }
}


