package parkinglot.repository;

import parkinglot.models.Gate;
import parkinglot.models.Operator;

public interface IOperatorRepository {
    public Operator getOperatorById(Long id);
    public Operator saveOperator(Operator operator);
}
