package net.htlgkr.GumpelmeierA21044.pos3.hue1;

public class ErasthotenesPrimeSieve implements PrimeSieve{
    private int limit;

    public ErasthotenesPrimeSieve(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean isPrime(int p) {
        for(int i = 2; i < p; i++) {
            if(p % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void printPrimes() {

    }
}
