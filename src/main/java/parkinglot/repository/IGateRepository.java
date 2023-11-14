package parkinglot.repository;

import parkinglot.models.Gate;

public interface IGateRepository {
    public Gate getGateById(Long id);
    public Gate saveGate(Gate gate);
}
