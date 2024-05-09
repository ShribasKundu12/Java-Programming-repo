//This keyword is used to call a method of the current class
//Binomial Co-efficient = nCr = n!/r!*(n-r)! ->(formulae)
class BinomialCo_eff{
    //method for factorial
    int fact(int n){
        int val = 1,temp;
        temp  = n;
        for(int i = 1; i<temp ;i++){//5<5
            val  =  val * n;//120
            n--;//1
        }
        return val;
    }
    void calBinomialCo_eff(int n,int r){
        int result = this.fact(n)/(this.fact(r)*this.fact(n-r));
        System.out.println("Binomial Co_efficient of "+n+"C"+r+" = "+result);
    }
}
class BinCo_eff{
    public static void main(String[] s){
        BinomialCo_eff obj = new BinomialCo_eff();
        obj.calBinomialCo_eff(7,2);
    }
}