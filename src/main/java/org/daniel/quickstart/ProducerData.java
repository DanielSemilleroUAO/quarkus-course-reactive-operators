package org.daniel.quickstart;

import org.eclipse.microprofile.reactive.messaging.Outgoing;

import javax.enterprise.context.ApplicationScoped;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@ApplicationScoped
public class ProducerData {

    private Random random = new Random();


    @Outgoing("my-in-memory")
    public Flowable<Integer> generate() {
        return Flowable.interval(500, TimeUnit.MILLISECONDS)
                .map(tick -> random.nextInt(100));
    }

}
