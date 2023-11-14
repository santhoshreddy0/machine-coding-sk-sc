package parkinglot.repository;

import parkinglot.models.Operator;

import java.util.HashMap;
import java.util.Map;

public class OperatorRepository implements IOperatorRepository{
    Map<Long, Operator> operatorDb;
    Long lastSaved;
    public OperatorRepository() {
        this.operatorDb = new HashMap<>();
        this.lastSaved = 0L;
    }

    public Operator getOperatorById (Long id) {
        return operatorDb.get(id);
    }

    public Operator saveOperator (Operator operator) {
        lastSaved++;
        operator.setId(lastSaved);
        operatorDb.put(lastSaved, operator);

        return operatorDb.get(lastSaved);
    }
}
