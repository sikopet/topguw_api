/* Decoder.java - 15 janv. 2016  -  UTF-8 - 
 * --------------------------------- DISCLAMER ---------------------------------
 * Copyright (c) 2015, Bastien Enjalbert All rights reserved.
 * Redistribution and use in source and binary forms, with or without modification, 
 * are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, 
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, 
 * this list of conditions and the following disclaimer in the documentation 
 * and/or other materials provided with the distribution.

 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
 * IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, 
 * OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, 
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * The views and conclusions contained in the software and documentation are 
 * those of the authors and should not be interpreted as representing official 
 * policies, either expressed or implied, of the FreeBSD Project.
 * @author Bastien Enjalbert
 */
package gsm.topguw.tools;

import gsm.topguw.channels.Channels;
import gsm.topguw.err.ChannelError;
import java.util.HashMap;

/**
 * Decode cfile/bursts file with gr-gsm
 *
 * @author bastien.enjalbert
 */
public class Decoder {
    
    /** List of available channels */
    HashMap<String, Channels> availableChan = new HashMap<>();
    
    /**
     * Get a channel to work with
     * @param chanType the channel type to decode
     * @param timeslot the timeslot 
     * @param subslot the subslot
     * @return the channel frames and information
     * @throws ChannelError if the argument channel type isn't available/supported
     */
    public Channels decoder(String chanType, int timeslot, int subslot) 
            throws ChannelError {
        if(!availableChan.containsKey(chanType)) {
            throw new ChannelError("Channel type isn't supported");
        }
        Channels channel = decoder(chanType, timeslot, subslot);
        return channel;
        /// TODO : 
    }
}