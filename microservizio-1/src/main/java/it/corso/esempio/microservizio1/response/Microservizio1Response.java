package it.corso.esempio.microservizio1.response;

import java.util.Objects;

public class Microservizio1Response {
	private String status;

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
}
