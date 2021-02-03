package api.dao;

import api.model.Vol;

public class DAOFlight extends DAOAbstractFacade<Vol> {

    public DAOFlight() {
        super(Vol.class);
    }
}