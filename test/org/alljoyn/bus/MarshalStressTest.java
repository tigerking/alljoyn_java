/**
 * Copyright 2009-2011, Qualcomm Innovation Center, Inc.
 * 
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.alljoyn.bus;

import org.alljoyn.bus.BusAttachment;
import org.alljoyn.bus.BusException;
import org.alljoyn.bus.BusObject;
import org.alljoyn.bus.Status;
import org.alljoyn.bus.ifaces.DBusProxyObj;

import static junit.framework.Assert.*;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.TreeMap;
import junit.framework.TestCase;

public class MarshalStressTest extends TestCase {
    public MarshalStressTest(String name) {
        super(name);
    }

    static {
        System.loadLibrary("alljoyn_java");
    }

    public class Service implements MarshalStressInterface,
                                    BusObject {
        public byte getPropy() throws BusException { return (byte)1; }
        public void Methody(byte m) throws BusException {}
        public Structy MethodStructy() throws BusException { Structy s = new Structy(); s.m = (byte)1; return s; }
        public boolean getPropb() throws BusException { return true; }
        public void Methodb(boolean m) throws BusException {}
        public Structb MethodStructb() throws BusException { Structb s = new Structb(); s.m = true; return s; }
        public short getPropn() throws BusException { return (short)2; }
        public void Methodn(short m) throws BusException {}
        public Structn MethodStructn() throws BusException { Structn s = new Structn(); s.m = (short)2; return s; }
        public short getPropq() throws BusException { return (short)3; }
        public void Methodq(short m) throws BusException {}
        public Structq MethodStructq() throws BusException { Structq s = new Structq(); s.m = (short)3; return s; }
        public int getPropi() throws BusException { return 4; }
        public void Methodi(int m) throws BusException {}
        public Structi MethodStructi() throws BusException { Structi s = new Structi(); s.m = 4; return s; }
        public int getPropu() throws BusException { return 5; }
        public void Methodu(int m) throws BusException {}
        public Structu MethodStructu() throws BusException { Structu s = new Structu(); s.m = 5; return s; }
        public long getPropx() throws BusException { return (long)6; }
        public void Methodx(long m) throws BusException {}
        public Structx MethodStructx() throws BusException { Structx s = new Structx(); s.m = (long)6; return s; }
        public long getPropt() throws BusException { return (long)7; }
        public void Methodt(long m) throws BusException {}
        public Structt MethodStructt() throws BusException { Structt s = new Structt(); s.m = (long)7; return s; }
        public double getPropd() throws BusException { return 8.1; }
        public void Methodd(double m) throws BusException {}
        public Structd MethodStructd() throws BusException { Structd s = new Structd(); s.m = 8.1; return s; }
        public String getProps() throws BusException { return "nine"; }
        public void Methods(String m) throws BusException {}
        public Structs MethodStructs() throws BusException { Structs s = new Structs(); s.m = "nine"; return s; }
        public String getPropo() throws BusException { return "/ten"; }
        public void Methodo(String m) throws BusException {}
        public Structo MethodStructo() throws BusException { Structo s = new Structo(); s.m = "/ten"; return s; }
        public String getPropg() throws BusException { return "y"; }
        public void Methodg(String m) throws BusException {}
        public Structg MethodStructg() throws BusException { Structg s = new Structg(); s.m = "y"; return s; }
        public byte[] getPropay() throws BusException { return new byte[] { (byte)1 }; }
        public void Methoday(byte[] m) throws BusException {}
        public Structay MethodStructay() throws BusException { Structay s = new Structay(); s.m = new byte[] { (byte)1 }; return s; }
        public boolean[] getPropab() throws BusException { return new boolean[] { true }; }
        public void Methodab(boolean[] m) throws BusException {}
        public Structab MethodStructab() throws BusException { Structab s = new Structab(); s.m = new boolean[] { true }; return s; }
        public short[] getPropan() throws BusException { return new short[] { (short)2 }; }
        public void Methodan(short[] m) throws BusException {}
        public Structan MethodStructan() throws BusException { Structan s = new Structan(); s.m = new short[] { (short)2 }; return s; }
        public short[] getPropaq() throws BusException { return new short[] { (short)3 }; }
        public void Methodaq(short[] m) throws BusException {}
        public Structaq MethodStructaq() throws BusException { Structaq s = new Structaq(); s.m = new short[] { (short)3 }; return s; }
        public int[] getPropai() throws BusException { return new int[] { 4 }; }
        public void Methodai(int[] m) throws BusException {}
        public Structai MethodStructai() throws BusException { Structai s = new Structai(); s.m = new int[] { 4 }; return s; }
        public int[] getPropau() throws BusException { return new int[] { 5 }; }
        public void Methodau(int[] m) throws BusException {}
        public Structau MethodStructau() throws BusException { Structau s = new Structau(); s.m = new int[] { 5 }; return s; }
        public long[] getPropax() throws BusException { return new long[] { (long)6 }; }
        public void Methodax(long[] m) throws BusException {}
        public Structax MethodStructax() throws BusException { Structax s = new Structax(); s.m = new long[] { (long)6 }; return s; }
        public long[] getPropat() throws BusException { return new long[] { (long)7 }; }
        public void Methodat(long[] m) throws BusException {}
        public Structat MethodStructat() throws BusException { Structat s = new Structat(); s.m = new long[] { (long)7 }; return s; }
        public double[] getPropad() throws BusException { return new double[] { 8.1 }; }
        public void Methodad(double[] m) throws BusException {}
        public Structad MethodStructad() throws BusException { Structad s = new Structad(); s.m = new double[] { 8.1 }; return s; }
        public String[] getPropas() throws BusException { return new String[] { "nine" }; }
        public void Methodas(String[] m) throws BusException {}
        public Structas MethodStructas() throws BusException { Structas s = new Structas(); s.m = new String[] { "nine" }; return s; }
        public String[] getPropao() throws BusException { return new String[] { "/ten" }; }
        public void Methodao(String[] m) throws BusException {}
        public Structao MethodStructao() throws BusException { Structao s = new Structao(); s.m = new String[] { "/ten" }; return s; }
        public String[] getPropag() throws BusException { return new String[] { "y" }; }
        public void Methodag(String[] m) throws BusException {}
        public Structag MethodStructag() throws BusException { Structag s = new Structag(); s.m = new String[] { "y" }; return s; }
        public void Methoda(byte[] m) throws BusException {}
        public void Methodaei(Map<Integer, String> m) throws BusException {}
        public void Methodaers(Map<Struct, String> m) throws BusException {}
        public void IncompleteMethodaers(Map<Struct, String> m) throws BusException {}
        public void Methodry(Struct m) throws BusException {}
        public void Methodray(Struct m) throws BusException {}
        public void Methodvy(Variant m) throws BusException {}
        public void Methodvay(Variant m) throws BusException {}
        public Map<String, String> getPropaessy() throws BusException { return new TreeMap<String, String>(); }
        public Map<String, String> getPropaesss() throws BusException { return new TreeMap<String, String>(); }
        public void Methodaessy(Map<String, String> m) throws BusException {}
        public void Methodaessay(Map<String, String> m) throws BusException {}
        public Struct[] getPropar() throws BusException { return new Struct[] { new Struct() }; }
        public Struct getPropr() throws BusException { return new Struct(); }
        public Variant Methodv() throws BusException { return new Variant(new String("vs")); }
        public Structr MethodStructr() throws BusException { Structr s = new Structr(); s.m = new Struct(); return s; }
        public Structv MethodStructv() throws BusException { Structv s = new Structv(); s.m = new Variant(new String("hello")); return s; }
        public Structaess MethodStructaess() throws BusException { Structaess s = new Structaess(); s.m = new TreeMap<String, String>(); return s; }
    }

    private BusAttachment bus;
    private BusAttachment serviceBus;
    private WeakReference busRef = new WeakReference<BusAttachment>(bus);
    private WeakReference serviceBusRef = new WeakReference<BusAttachment>(serviceBus);

    private Service service;

    private MarshalStressInterfaceInvalid proxy;

    public void setUp() throws Exception {
        serviceBus = new BusAttachment(getClass().getName() + "Service");
        
        service = new Service();
        Status status = serviceBus.registerBusObject(service, "/service");
        assertEquals(Status.OK, status);

        status = serviceBus.connect();
        assertEquals(Status.OK, status);

        DBusProxyObj control = serviceBus.getDBusProxyObj();
        DBusProxyObj.RequestNameResult res = control.RequestName("org.alljoyn.bus.MarshalStressTest", 
                                                                 DBusProxyObj.REQUEST_NAME_NO_FLAGS);
        assertEquals(DBusProxyObj.RequestNameResult.PrimaryOwner, res);

        bus = new BusAttachment(getClass().getName());
        status = bus.connect();
        assertEquals(Status.OK, status);

        ProxyBusObject remoteObj = bus.getProxyBusObject("org.alljoyn.bus.MarshalStressTest", "/service", 
                                                         BusAttachment.SESSION_ID_ANY,
                                                         new Class[] { MarshalStressInterfaceInvalid.class });
        proxy = remoteObj.getInterface(MarshalStressInterfaceInvalid.class);
    }

    public void tearDown() throws Exception {
        proxy = null;

        DBusProxyObj control = serviceBus.getDBusProxyObj();
        DBusProxyObj.ReleaseNameResult res = control.ReleaseName("org.alljoyn.bus.MarshalStressTest");
        assertEquals(DBusProxyObj.ReleaseNameResult.Released, res);

        serviceBus.unregisterBusObject(service);
        service = null;

        serviceBus.disconnect();
        serviceBus = null;
        
        bus.disconnect();
        bus = null;
        
        /*
         * Each BusAttachment is a very heavy object that creates many file 
         * descripters for each BusAttachment.  This will force Java's Garbage
         * collector to remove the BusAttachments 'bus' and 'serviceBus' before 
         * continuing on to the next test.
         */
        do{
            System.gc();
            Thread.sleep(5);
        } while (busRef.get() != null && serviceBusRef.get() != null);
    }

    public void testInvalidPropy() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropy();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethody() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methody(this.getClass());
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructy() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructy();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropb() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropb();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodb() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodb(this.getClass());
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructb() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructb();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropn() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropn();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodn() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodn(this.getClass());
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructn() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructn();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropq() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropq();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodq() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodq(this.getClass());
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructq() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructq();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropi() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropi();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodi() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodi(this.getClass());
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructi() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructi();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropu() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropu();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodu() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodu(this.getClass());
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructu() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructu();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropx() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropx();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodx() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodx(this.getClass());
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructx() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructx();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropt() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropt();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodt() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodt(this.getClass());
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructt() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructt();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropd() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropd();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodd() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodd(this.getClass());
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructd() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructd();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidProps() throws Exception {
        boolean thrown = false;
        try {
            proxy.getProps();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethods() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methods(this.getClass());
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructs() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructs();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropo() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropo();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodo() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodo(this.getClass());
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructo() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructo();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropg() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropg();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodg() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodg(this.getClass());
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructg() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructg();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropay() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropay();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethoday() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methoday(new Class[] { this.getClass() });
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructay() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructay();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropab() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropab();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodab() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodab(new Class[] { this.getClass() });
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructab() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructab();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropan() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropan();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodan() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodan(new Class[] { this.getClass() });
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructan() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructan();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropaq() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropaq();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodaq() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodaq(new Class[] { this.getClass() });
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructaq() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructaq();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropai() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropai();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodai() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodai(new Class[] { this.getClass() });
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructai() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructai();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropau() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropau();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodau() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodau(new Class[] { this.getClass() });
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructau() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructau();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropax() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropax();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodax() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodax(new Class[] { this.getClass() });
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructax() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructax();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropat() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropat();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodat() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodat(new Class[] { this.getClass() });
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructat() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructat();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropad() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropad();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodad() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodad(new Class[] { this.getClass() });
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructad() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructad();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropas() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropas();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodas() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodas(new int[] { 0 });
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructas() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructas();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropao() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropao();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodao() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodao(new int[] { 0 });
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructao() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructao();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropag() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropag();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodag() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodag(new int[] { 0 });
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructag() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructag();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethoda() throws Exception {
        proxy.Methoda(new byte[] { (byte)0 });
    }

    public void testInvalidMethodaei() throws Exception {
        proxy.Methodaei(new TreeMap<Integer, String>());
    }

    public void testInvalidMethodaers() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodaers(new TreeMap<MarshalStressInterfaceInvalid.Struct, String>());
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidIncompleteMethodaers() throws Exception {
        boolean thrown = false;
        try {
            proxy.IncompleteMethodaers(new TreeMap<MarshalStressInterfaceInvalid.Struct, String>());
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodry() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodry((byte)0);
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodray() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodray(new byte[] { (byte)0 });
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodvy() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodvy((byte)0);
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodvay() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodvay(new byte[] { (byte)0 });
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropaessy() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropaessy();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropaesss() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropaesss();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodaessy() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodaessy((byte)0);
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodaessay() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodaessay(new byte[] { (byte)0 });
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropar() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropar();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidPropr() throws Exception {
        boolean thrown = false;
        try {
            proxy.getPropr();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodv() throws Exception {
        boolean thrown = false;
        try {
            proxy.Methodv();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructr() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructr();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructv() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructv();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

    public void testInvalidMethodStructaess() throws Exception {
        boolean thrown = false;
        try {
            proxy.MethodStructaess();
        } catch (BusException ex) {
            thrown = true;
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            assertTrue(thrown);
        }
    }

}
