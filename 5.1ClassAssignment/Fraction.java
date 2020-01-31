class Fraction{
    private int n;
    private int d;
    public Fraction(){
        this.n=1;
        this.d=1;
    }

    public Fraction(int n,int d){
        this.n=n;
        this.d=d;
        if(this.d==0){
            System.out.println("AAAAAHHHHHHHHHHHHHHH");
            this.d=1;
        }
        this.reduce();
    }

    public Fraction(String num){
        int index= num.indexOf("/");
        this.n=Integer.parseInt(num.substring(0,index));
        this.d=Integer.parseInt(num.substring(index+1,num.length()));
        if(d==0){
            System.out.println("AAAAAHHHHHHHHHHHHHHH");
            d=1;
        }

        this.reduce();
    }

    public Fraction(Fraction f){
        this.n=f.n;
        this.d=f.d;
        this.reduce();
    }

    public void reduce(){
        int denom=1;
        int i=1;
        while(i<=this.n&&i<=this.d){
            if(this.n%i==0&&this.d%i==0){
                denom=i;
            }
            i++;
        }
        this.n/=denom;
        this.d/=denom;
    }

    public int getNum(){
        return this.n;
    }

    public double toDouble(){
        double ans = (this.n/1.0)/this.d;
        return ans;
    }

    public void setNum(int n){
        this.n=n;
    }

    public void setDenom(int d){
        this.d=d;
    }

    public int getDenom(){
        return this.d;
    }

    public String toString(){
        String ans= ""+n+"/"+d;
        return ans;
    }

    public static Fraction Multiply(Fraction a, Fraction b){
        int num= a.n*b.n;
        int denom= a.d*b.d;
        Fraction ans= new Fraction(num,denom);
        ans.reduce();
        return ans;
    }

    public static Fraction Add(Fraction a, Fraction b){
        int num= (a.n*b.d)+(a.d*b.n);
        int denom= a.d*b.d;
        Fraction ans= new Fraction(num,denom);
        ans.reduce();
        return ans;
    }

    public static Fraction Subtract(Fraction a, Fraction b){
        int num= (a.n*b.d)-(a.d*b.n);
        int denom= a.d*b.d;
        Fraction ans= new Fraction(num,denom);
        ans.reduce();
        return ans;
    }


}