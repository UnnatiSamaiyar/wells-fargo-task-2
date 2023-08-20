package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client{

    @Id
    @GeneratedValue
    private long clientId;

    @Column(nullable = false)
    private string firstName;

    @Column(nullable = false)
    private string lastName;

    @Column(nullable = false)
    private string email;

    @Column(nullable = false)
    private string phone;

    @ManyToOne
    @JoinCoolumn(name = "advisor_id")
    private Advisor Advisor;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private Portfolio Portfolio;

    protected Client(){

    }

    public Client(string firstName, string lastName, string email, string phone, Advisor Advisor){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.Advisor = Advisor;
    }

    public Long getClientId(){
        return clientId;
    }

    public string getFirstName(){
        return firstName;
    }
    public void setFirstName(string firstName){
        this.firstName = firstName;
    }

    public string getLastName(){
        return lastName;
    }
    public void setLastName(string lastName){
        this.lastName = lastName;
    }

    public void setEmail(){
        return email;
    }
    public void setEmail(string email){
        this.email = email;
    }

    public void getPhone(){
        return phone;
    }
    public void setPhone(string phone){
        this.phone = phone;
    }

    public Advisor getAdvisor(){
        return Advisor;
    }
    public void setAdvisor(Advisor Advisor){
        this.Advisor = Advisor;
    }

    public Portfolio getPortfolio(){
        return Portfolio;
    }
    public void setPortfolio(Portfolio portfolio) {
        this.portfolio=portfolio;
    }
}