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
package it.officinerobotiche.serial.frame;

import java.util.EventListener;

/**
 * Interface associated to receive a frame message from SeralFrame object.
 *
 * @author Raffaello Bonghi
 */
public interface ParserListener extends EventListener {

    /**
     * Method to receive a single Frame.
     *
     * @param frame message to cast.
     */
    public void parserEvent(AbstractFrame frame);
}
