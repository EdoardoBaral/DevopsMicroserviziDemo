package it.corso.esempio.microservizio1.response;

import org.springframework.http.ResponseEntity;

import java.util.Objects;

public class Microservizio1Response {
    private String status;
    private int port;
    private String name;
    private ResponseEntity<String> forEntity;

    @Override
    public String toString() {
        return "Microservizio1Response{" +
                "status='" + status + '\'' +
                ", port=" + port +
                ", name='" + name + '\'' +
                ", forEntity=" + forEntity +
                '}';
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Microservizio1Response that = (Microservizio1Response) o;
        return Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status);
    }

    public void setResponseFromOtherServices(ResponseEntity<String> forEntity) {
        this.forEntity = forEntity;
    }
}
