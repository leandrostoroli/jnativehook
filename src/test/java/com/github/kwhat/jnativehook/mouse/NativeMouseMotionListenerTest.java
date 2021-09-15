/* JNativeHook: Global keyboard and mouse listeners for Java.
 * Copyright (C) 2006-2018 Alexander Barker.  All Rights Received.
 * https://github.com/kwhat/jnativehook/
 *
 * JNativeHook is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JNativeHook is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.kwhat.jnativehook.mouse;

import com.github.kwhat.jnativehook.mouse.listeners.NativeMouseInputListenerTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NativeMouseMotionListenerTest {
    @Test
    public void testNativeMouseMoved() {
        NativeMouseEvent event = new NativeMouseEvent(
            NativeMouseEvent.NATIVE_MOUSE_MOVED,
            0x00,
            50,
            75,
            0,
            NativeMouseEvent.NOBUTTON);

        NativeMouseInputListenerTest listener = new NativeMouseInputListenerTest();
        listener.nativeMouseMoved(event);

        assertEquals(event, listener.getLastEvent());
    }

    /**
     * Test of nativeMouseDragged method, of class NativeMouseMotionListener.
     */
    @Test
    public void testNativeMouseDragged() {
        NativeMouseEvent event = new NativeMouseEvent(
            NativeMouseEvent.NATIVE_MOUSE_DRAGGED,
            NativeMouseEvent.BUTTON1_MASK,
            50,
            75,
            0,
            NativeMouseEvent.NOBUTTON);

        NativeMouseInputListenerTest listener = new NativeMouseInputListenerTest();
        listener.nativeMouseDragged(event);

        assertEquals(event, listener.getLastEvent());
    }
}