package org.fasttrackit.massageapi.transfer.patient;

public class GetPatientRequest {

    private String partialName;
    private String partialMassage;

    public String getPartialName() {
        return partialName;
    }

    public void setPartialName(String partialName) {
        this.partialName = partialName;
    }

    public String getPartialMassage() {
        return partialMassage;
    }

    public void setPartialMassage(String partialMassage) {
        this.partialMassage = partialMassage;
    }

    @Override
    public String toString() {
        return "GetPatientRequest{" +
                "partialName='" + partialName + '\'' +
                ", partialMassage='" + partialMassage + '\'' +
                '}';
    }
}
