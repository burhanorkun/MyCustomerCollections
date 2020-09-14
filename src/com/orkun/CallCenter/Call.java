package com.orkun.CallCenter;

public class Call {
    // minimal rank of employee who can handle this call
    private  Rank rank;
    private Caller caller;

    private  Employee handler;

    public Call(Caller c){
        rank = Rank.Responder;
        caller = c;
    }

}
