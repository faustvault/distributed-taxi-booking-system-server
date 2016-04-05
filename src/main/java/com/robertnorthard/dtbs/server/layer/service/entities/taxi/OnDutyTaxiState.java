package com.robertnorthard.dtbs.server.layer.service.entities.taxi;

/**
 *
 * @author robertnorthard
 */
public class OnDutyTaxiState implements TaxiState {

    @Override
    public void goOffDuty(Taxi taxi) {
       taxi.setState(Taxi.getOffDutyTaxiState());
    }

    @Override
    public void goOnDuty(Taxi taxi) {}

    @Override
    public void acceptJob(Taxi taxi) {
        taxi.setState(Taxi.getAcceptedJobTaxiState());
    }

    @Override
    public void completeJob(Taxi taxi) {
        throw new IllegalStateException("Not on job.");
    }
    
    @Override
    public String toString(){
        return "Available.";
    }
}
