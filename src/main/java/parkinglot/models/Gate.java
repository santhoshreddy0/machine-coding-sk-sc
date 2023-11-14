package parkinglot.models;

import parkinglot.models.types.GateStatus;
import parkinglot.models.types.GateType;

public class Gate extends BaseModel{
    Operator operator;
    GateType type;
    GateStatus status;
    Integer gateNum;

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateType getType() {
        return type;
    }

    public void setType(GateType type) {
        this.type = type;
    }

    public GateStatus getStatus() {
        return status;
    }

    public void setStatus(GateStatus status) {
        this.status = status;
    }

    public Integer getGateNum() {
        return gateNum;
    }

    public void setGateNum(Integer gateNum) {
        this.gateNum = gateNum;
    }
}
