package demo.service.framework.security.model;


import lombok.Data;

import java.io.*;

@Data
public class RequestInfo implements Serializable {
    private static final long serialVersionUID = 5921990572289947287L;
    private String requestId;
    private String requestUri;
    private String referer;

    public RequestInfo() {
    }

    public RequestInfo(String requestId, String requestUri, String referer) {
        this.requestId = requestId;
        this.requestUri = requestUri;
        this.referer = referer;
    }

    public byte[] toBytes() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return baos.toByteArray();
    }

    public static RequestInfo newRequestInfo(byte[] data) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            return (RequestInfo) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
