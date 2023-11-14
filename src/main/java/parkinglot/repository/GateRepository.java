package parkinglot.repository;

import parkinglot.models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository implements IGateRepository{
    Map<Long, Gate> gateDb;
    Long lastSaved;
    public GateRepository() {
        this.gateDb = new HashMap<>();
        this.lastSaved = 0L;
    }

    public Gate getGateById(Long id) {
        return gateDb.get(id);
    }

    public Gate saveGate(Gate gate) {
        lastSaved++;
        gate.setId(lastSaved);
        gateDb.put(lastSaved, gate);

        return gateDb.get(lastSaved);
    }
}
