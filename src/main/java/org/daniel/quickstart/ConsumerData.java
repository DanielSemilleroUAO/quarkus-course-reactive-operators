package org.daniel.quickstart;


import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ConsumerData {


    @Incoming("my-in-memory")
    public void printRandom(int randomNumber){
        System.out.println(randomNumber);
    }


}
