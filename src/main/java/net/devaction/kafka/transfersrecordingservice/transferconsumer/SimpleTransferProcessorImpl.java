package net.devaction.kafka.transfersrecordingservice.transferconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.devaction.kafka.avro.Transfer;

/**
 * @author Víctor Gil
 *
 * since August 2019
 */
public class SimpleTransferProcessorImpl implements TransferProcessor{
    private static final Logger log = LoggerFactory.getLogger(SimpleTransferProcessorImpl.class);

    @Override
    public void process(Transfer transfer){
        log.info("Transfer data processed: {}", transfer);        
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
