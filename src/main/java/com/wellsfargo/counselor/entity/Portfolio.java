package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio{

    @Id
    @GeneratedValue
    private long portfolioId;

    @OneToOne
    @JoinCoolumn(name = "client_id")
    private Client Client;

    @OneToMany(mappedBy = "Portfolio",  cascade = CascadeType.ALL)
    private List<Security> securities;

    protected Portfolio(){

    }

    public Portfolio(Client Client){
        this.client = client;
    }

    public Long getPortfolioId(){
        return portfolioId;
    }

    public Client getClient(){
        return client;
    }

    public void setClient(Client Client){
        this.Client = Client;
    }

    public List<Security> getSecurities(){
        return securities;
    }

    public void setSecurities(List<Security>securities){
        this.securities = securities;
    }

}