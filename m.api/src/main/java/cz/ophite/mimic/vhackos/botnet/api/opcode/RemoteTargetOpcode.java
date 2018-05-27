package cz.ophite.mimic.vhackos.botnet.api.opcode;

import cz.ophite.mimic.vhackos.botnet.api.opcode.base.Opcode;
import cz.ophite.mimic.vhackos.botnet.api.opcode.base.OpcodeTargetType;

/**
 * Získá informace o vzdáleném cíli.
 *
 * @author mimic
 */
public final class RemoteTargetOpcode extends Opcode {

    private static final String PARAM_TARGET = "target";

    /**
     * Cílová IP.
     */
    public void setTargetIp(String ip) {
        addParam(PARAM_TARGET, ip);
    }

    @Override
    public OpcodeTargetType getTarget() {
        return OpcodeTargetType.REMOTE;
    }
}
