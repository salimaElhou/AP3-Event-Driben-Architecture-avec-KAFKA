package elhou.salima.service;


import elhou.salima.entities.PageEvent;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.Grouped;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Materialized;
import org.apache.kafka.streams.kstream.TimeWindows;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.Date;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Service
public class PageEventService {
    //deployee consumer
    @Bean
    public Consumer<PageEvent> pageEventConsumer(){
         return (input)->{
             System.out.println("********** Page Event *********");
             System.out.println(input.toString());
             System.out.println("********** Page Event *********");
        };
    }


    @Bean
    //deploye un supplier -> pour produir des messgaes
    public Supplier<PageEvent> pageEventSupplier(){
        return ()->new PageEvent(
                //page 1 ou page 2
                Math.random()>0.5?"P1":"P2",
                // User 1 ou User 2
                Math.random()>0.5?"U1":"U2",
                new Date(),
                new Random().nextLong(9000));
    }


    @Bean
    //deploye une fonction qui fait les deux in(pageEvent) & out(pageEvent)
    public Function<PageEvent, PageEvent> pageEventFunction(){
        return (input)->{
            input.setName("L : "+input.getName().length());
            input.setUser("UUUUUUU");
            return input;
        };
    }





}
