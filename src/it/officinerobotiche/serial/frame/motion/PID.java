/*
 * Copyright (C) 2014 Officine Robotiche.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *     Raffaello Bonghi - raffaello.bonghi@officinerobotiche.it
 */
package it.officinerobotiche.serial.frame.motion;

/**
 *
 * @author Raffaello Bonghi
 */
public class PID extends MotionFrame {

    public static final PID LEFT = new PID(Command.PID_L);
    public static final PID RIGHT = new PID(Command.PID_R);

    public static class PIDLeft extends PID {
        
        public PIDLeft() {
            super(Command.PID_L);
        }

        public PIDLeft(float k_p, float k_i, float k_d) {
            super(Command.PID_L);
        }
    }

    public static class PIDRight extends PID {
        
        public PIDRight() {
            super(Command.PID_R);
        }

        public PIDRight(float k_p, float k_i, float k_d) {
            super(Command.PID_R);
        }
    }

    private final Command comm;

    private PID(Command comm) {
        super();
        this.comm = comm;
    }

    public PID(boolean sync, int command, byte[] in) {
        super(sync, command, in);
        this.comm = Command.getCommand(command);
    }

    public PID(boolean sync, int command, Information info) {
        super(sync, command, info);
        this.comm = Command.getCommand(command);
    }

    @Override
    public Command getCommand() {
        return comm;
    }
}
