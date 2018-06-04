/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.uab.cephis.bigNumCalc;

import java.util.Random;


/**
 *
 * @author dcr
 */
public class TestColinPlumb
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        TestColinPlumb test = new TestColinPlumb();
//        test.testSingle();
        test.doRandom();
//        test.testModReduce();
//        test.testMontMult();
    }
    
    private void testSingle()
    {
//        BigInteger x = new BigInteger("720079212");
//        BigInteger e = new BigInteger("616006058619617");
//        BigInteger m = new BigInteger("1439574193");
        
        
        BigInteger x = new BigInteger("10612460824469164746");
        BigInteger e = new BigInteger("10941080674941114352");
        BigInteger m = new BigInteger("14452157870233518211");
        
        testSingle(x,e,m);
        
        
    }

    private void doRandom()
    {
        int bits = 1024;
        Random randomizer = new Random();
        
        BigInteger x = new BigInteger(bits, randomizer);
        BigInteger e = new BigInteger(bits, randomizer);
        BigInteger m;
        
        do
        {
            m = new BigInteger(bits, randomizer);
        } while (m.isEven());
        
        testSingle(x, e, m);

    }

    private void testSingle(BigInteger x, BigInteger e, BigInteger m)
    {
//        System.out.println("x=" + x.toHexString());
//        System.out.println("e=" + e.toHexString());
//        System.out.println("m=" + m.toHexString());
        long t0 = System.currentTimeMillis();
        String r1 = x.oddModPow_ref(e, m).toString();
        long tf = System.currentTimeMillis();

        System.out.println("New Implementation: " + (tf-t0));

        java.math.BigInteger bx = new java.math.BigInteger(x.toString());
        java.math.BigInteger be = new java.math.BigInteger(e.toString());
        java.math.BigInteger bm = new java.math.BigInteger(m.toString());

        t0 = System.currentTimeMillis();
        String r2 = bx.modPow(be, bm).toString();
        tf = System.currentTimeMillis();

        System.out.println("Std Implementation: " + (tf-t0));
        
        if (r1.equals(r2))
            System.out.println("[OK]");
        else
        {
            System.out.flush();
            System.err.println("ERROR");

            System.out.println("x=" + x.toHexString());
            System.out.println("e=" + e.toHexString());
            System.out.println("m=" + m.toHexString());

            String r3 = x.oddModPow(e, m).toString();

        }
        
        
    }
    
    void testModReduce()
    {
        BigInteger a = new BigInteger("81996619711109297929784594468984962521");
        BigInteger mod = new BigInteger("14452157870233518211");
        BigInteger radix = BigInteger.montgomeryRadixFromMod(mod);

        int inv = BigInteger.modPrime32(mod);
        
        BigInteger mprime = new BigInteger(new int[]{0, inv});
        
        System.out.println(String.format("inv = %08X", inv));

        BigInteger b = a.montReduce(mod, inv);

        System.out.println("x=" + a.toHexString());
        System.out.println("m=" + mod.toHexString());
        System.out.println("radix=" + radix.toHexString());
        System.out.println("mprime=" + mprime.toHexString());
        System.out.println("r=" + b.toHexString());

    }

    void testMontMult()
    {
        BigInteger a = new BigInteger("81996619711109297929784594468984962521");
        BigInteger y = new BigInteger("14452157878823452803");
        BigInteger mod = new BigInteger("14452157870233518211");
        BigInteger radix = BigInteger.montgomeryRadixFromMod(mod);

        int inv = BigInteger.modPrime32(mod);
        
        BigInteger mprime = new BigInteger(new int[]{0, inv});
        
        System.out.println(String.format("inv = %08X", inv));

        BigInteger b = a.montMult(y, mod, inv);

        System.out.println("x=" + a.toHexString());
        System.out.println("m=" + mod.toHexString());
        System.out.println("radix=" + radix.toHexString());
        System.out.println("mprime=" + mprime.toHexString());
        System.out.println("r=" + b.toHexString());

    }
    


}
